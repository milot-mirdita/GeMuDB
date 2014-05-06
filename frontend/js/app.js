(function() {
	"use strict";

	function SearchViewModel() {
		var self = this;

		self.constants = constants;

		self.currentState = new DefaultState();

		self.protein = ko.observable();
		self.proteinDetail = ko.observable();
		self.mutationListResult = ko.observable();
		self.externalMutationListResult = ko.observable();

		self.searchProtein = function(data, event) {
			var protein = $(event.target).closest('.search-widget').find('.q').val();
			if(protein) {
				location.hash = "!/search/" + protein;
			}
		};
		
		function getGraphDataFromExternalSnp (data, offset) {
			var offset = offset || 0;
			var graphdata = [];
			for(var mutpos in data) {
				if(data.hasOwnProperty(mutpos) && data[mutpos].position - offset >= 0)
					graphdata.push([data[mutpos].position - offset, constants.externalSnpGraphHeight]);
			}
			return graphdata;
		}
		
		var overviewPlot = $.plot($('#flot_overview'), [], new OverviewPlotOptions());
		var detailPlot   = $.plot($('#flot_details'),  [], new DetailPlotOptions());

		$('#flot_details').on("plotclick", function (event, pos, item) {
			(function clickHandler (item) {
				if (!item)
					return;
				var index = self.currentState.offset() + item.datapoint[0] + 1;
				var id = self.currentState.protein.refid;

				$.when($.getJSON(constants.baseUrl + id + '/functionaleffect/detail/ALL/'+ index))
					.done(function (result) {
			 			self.mutationListResult(result);
					})
					.fail(self.ajaxErrorHandler);
			})(item);
		});

		var sequenceOffsetCallback = _.debounce(function (value) {
			self.updateGraphs(true);
		}, 100);

		function setupSeeker () {
			var sequenceLength = self.currentState.protein.sequence.toString().length;
			var marginLeft = 10;
			var marginRight = 10;
			var plotWidth = overviewPlot.width();
			var seekerWidth = plotWidth / sequenceLength * constants.lineLength;
			 
			$('#flot_overview_container .seeker').width(seekerWidth);
			
			var minOffset = marginLeft; 
			var maxOffset = plotWidth - seekerWidth + marginRight;
			
			$('.seeker').drag(function(event, dd){
				var offset = clamp(dd.offsetX, minOffset, maxOffset);
				$('.seeker').css('left', offset);
				var val = Math.floor((offset-2) * sequenceLength / (plotWidth-8));
				
				self.currentState.offset(val);
				sequenceOffsetCallback(val);
			},{ relative:true });
		}

		self.updateGraphs = function(noSeeker) {
			if(!self.currentState.protein)
				return;

			var overviewData    = self.currentState.protein.toFlotData(self.currentState.threshold, self.currentState.types);
			var overviewSnpData = getGraphDataFromExternalSnp(self.externalMutationListResult());
			overviewPlot.setData(SnpFlotData(overviewSnpData).concat(overviewData));

			var overviewAxes = overviewPlot.getAxes();
			overviewAxes.yaxis.options.max = self.currentState.alphabet.length;
			
			overviewPlot.setupGrid();
			overviewPlot.draw();

			var detailProtein = self.currentState.protein.cut(self.currentState.offset());
			var detailData    = detailProtein.toFlotData(self.currentState.threshold, self.currentState.types);
			var detailSnpData = getGraphDataFromExternalSnp(self.externalMutationListResult(), self.currentState.offset());
			detailPlot.setData(SnpFlotData(detailSnpData).concat(detailData));

			detailPlot.getAxes().xaxis.options.max = constants.lineLength;
			detailPlot.getAxes().xaxis.options.ticks = detailProtein.sequence.toFlotTicks();
			detailPlot.getAxes().yaxis.options.max = self.currentState.alphabet.length;
			detailPlot.setupGrid();
			detailPlot.draw();

			if (!$('#flot_container').hasClass('rendered')) {
				setTimeout(function() { $('#flot_container').addClass('rendered'); }, 400);
			}

			if (!noSeeker) {
				setupSeeker();
			}
		}

		self.toggleAlphabet = function(chr, event) {
			var $target = $(event.target);
			var index = $.inArray(chr, self.currentState.alphabet);
			if(index == -1) {
				self.currentState.alphabet.push(chr);
				$target.addClass('active');
			} else { 
				if(self.currentState.alphabet.length > 1) {
					self.currentState.alphabet.splice(index, 1);
					$target.removeClass('active');
				} else {
					return false;
				} 
			}

			self.updateAlphabet();
		};

		var $slider = $("#slider").slider({
			value: 0,
			min: 0,
			max: self.currentState.alphabet.length - 1,
			step: 1
		}).on("slide", _.debounce(function(event) {
				self.currentState.threshold = event.value;
				self.updateGraphs();
			}, 100));

		self.updateAlphabet = _.debounce(function () {
			$.when(
				$.getJSON(constants.baseUrl + self.protein() + "/functionaleffect/" + self.currentState.alphabet.join("") + "/SNAP"),
				$.getJSON(constants.baseUrl + self.protein() + "/functionaleffect/" + self.currentState.alphabet.join("") + "/SIFT"))
			.done(function (snapResult, siftResult) {
				self.currentState.protein = new Protein({
					refid : self.protein(),
					predictions : [snapResult[0], siftResult[0]],
					sequence :snapResult[0].sequence
				});
				
				$slider.slider('setAttribute', 'max', self.currentState.alphabet.length - 1);
				$slider.slider('refresh');	

				self.currentState.threshold = $slider.slider('getValue');
				
				self.updateGraphs();
			})
			.fail(self.ajaxErrorHandler);
		}, 100);

		self.toggleType = function(type) {
			var index = $.inArray(type, self.currentState.types);
			if(index == -1) {
				self.currentState.types.push(type);
				self.updateGraphs();
			} else { 
				if($("#active_types .active").size() > 1) {
					self.currentState.types.splice(index, 1);
					self.updateGraphs();
				} else {
					return false;
				} 
			}
		};

		self.showDetailView  = function (data, event) {
			var result = {};
			for(var i in data.data) {
				result[data.data[i].type] = data.data[i];
			}
			var dropdown = $(event.target).parent().find('.dropdown-menu')[0];
			ko.applyBindingsToNode(dropdown, 
				{ template: { name: 'snp_details', data: result } });
		}


		Sammy(function() {
			var currentReferenceId = "";

			function reset() {
				self.currentState = new DefaultState();
				currentReferenceId = "";

				self.protein(null);
				self.proteinDetail(null);
				self.mutationListResult(null);
				self.externalMutationListResult(null);

				$('#flot_container').removeClass('rendered');
			}

			this.get("#!/search/:protein", function(context) {
				var protein = this.params["protein"];

				$('.search-widget button').button('loading');
				
				$.when($.post(constants.baseUrl + "search", 
						{q: protein}, undefined, "json"))
					.done(function(searchResult) {
						context.redirect("#!", "show", searchResult.refid);
					})
					.fail(self.ajaxErrorHandler);
			});

			this.get("#!/show/:refid", function() {
				var reference = this.params["refid"];
				if(currentReferenceId != reference) {
					reset();
					currentReferenceId = reference;
					self.currentState = new DefaultState();

					$.when(
						$.getJSON(constants.baseUrl + reference + "/functionaleffect/SNAP"),
						$.getJSON(constants.baseUrl + reference + "/functionaleffect/SIFT"))
						.done(function (snapResult, siftResult) {
							$('.search-widget button').button('reset');

							self.protein(reference);
							self.currentState.protein = new Protein({
								refid : self.protein(),
								predictions : [snapResult[0], siftResult[0]],
								sequence :snapResult[0].sequence
							});
							self.updateGraphs();
						})
						.fail(function() {
							$('.search-widget button').button('reset');
							self.ajaxErrorHandler();
						});

					$.getJSON(constants.baseUrl + "detail/" + reference)
						.done(function (proteinDetail) {
							self.proteinDetail(proteinDetail); 
						})
					 	.fail(self.ajaxErrorHandler);	

					$.getJSON(constants.baseUrl + "externalsnp/" + reference)
						.done(function (externalSnpContainer) {
							self.externalMutationListResult(externalSnpContainer.externalMutationPosition)
							self.updateGraphs();
						})
					 	.fail(self.ajaxErrorHandler);	
				}
			});

			this.get("#", function() {
				reset();
			});
		}).run();
	}

	return ko.applyBindings(new SearchViewModel());
})();