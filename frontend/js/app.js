;
var initProteinMixin = (function(out) {
		var plotOptions = function () { return {
			legend : { show : false }, 
			xaxis : { show : false, min : 0, max : 115, minTickSize: 5, tickSize: 5 }, 
			yaxis : { show : false, min : 1, max : 8, position : 'right', ticks : [1, 8] }, 
			grid : { borderWidth : 1, borderColor : '#aaa', clickable : true }, 
			series : { 
				lines : { show : false, steps : false}, 
				bars : { show : true, steps : true }, 
				shadowSize : 1} 
			}};
	
		var colormap = { 
			"H" : ["#600", "#700", "#800", "#900", "#A00", "#B00", "#C00", "#D00", "#F00"],
			"E" : ["#006", "#007", "#008", "#009", "#00A", "#00B", "#00C", "#00D", "#00F"],
			"C" : ["#665000", "#775500", "#886500", "#997500", "#AA8000", "#BB8500", "#CC9000", "#DD9000", "#FF9500"]
		};

		var colorBinary = [ "#C00", "#0C0" ];
		
		out.subProtein = function(data, offset, predictionType, lineLength) {
			if(!data) return null;
		
			var lineLength = lineLength || 115;
			var predictions = [];

			$.each(data.predictions, function(index, prediction) {
				if(predictionType == undefined || predictionType == prediction.type) {
					predictions.push({
						type : prediction.type,
						reliability : prediction.reliability.slice(offset, offset + lineLength),
						conservation : prediction.conservation.slice(offset, offset + lineLength)
					});
				}
			});
					
			return { id : data.id, 
				sequence : data.sequence.slice(offset, offset + lineLength),
				predictions : predictions
			};
		}
		
		var probsToData = function (probs) {
			var data = []; 
			for(var i = 0; i < probs.length; i++) { 
				if ( probs[i] != "-") { 
					data.push([i, probs[i] * 1]); 
				} 
			};
			return data;
		}
		
		out.addGraph = function(target, data, fill, callback) {
			var fill = fill || false;
			var options = plotOptions();
				
			var d1 = probsToData(data.predictions[0].reliability);
			var d2 = probsToData(data.predictions[0].conservation);
			
			if(fill)
				options.xaxis.max = data.sequence.length;
			
			var plot = $.plot(target, [ d1, d2 ], options);
			
			if(!fill) {
				$(target).bind("plotclick", function (event, pos, item) {
					if (item && callback) {
						callback(item);
					}
				});
			}
			return plot;
		};
	return out;
});

var initNumberMixin = (function(out) {
	out.clamp = function(value, min, max) {
		return Math.min(Math.max(value, min), max);
	};
	return out;
});



(function() {
	"use strict";
	function SearchViewModel() {
		// private
		var hidden = {};
		initProteinMixin(hidden);
		initNumberMixin(hidden);
		
		// public
		var self = this;

		/**
		 * @value protein id to search for
		 */
		self.protein = "asd";
		
		/**
		 * @arg protein object as json
		 */
		self.proteinResult = ko.observable();
	
		/**
		 * @arg offset to start rendering the detail graph
		 */
		self.sequenceOffset = ko.observable(0);
		
		/**
		 * @arg type of details to show
		 */
		self.predictionType = ko.observable("snap2");
		
		/**
		 * @arg length of detail graph
		 */
		self.lineLength = ko.observable(115);
		
		/**
		 * @arg index to start showing the list
		 */
		self.selectedIndex = ko.observable(0);
		
		
		self.smallProteinResult = ko.computed(function() {
			return hidden.subProtein(self.proteinResult(), 
									 self.sequenceOffset(), 
									 self.predictionType(), 
									 self.lineLength());
		}).extend({ throttle: 1 });
				
		self.listResult = ko.observable();

		/**
		 * @arg 
		 */
		self.snpDetails = ko.observable();

		ko.computed(function () {
			var depends1 = self.proteinResult();
			var depends2 = self.sequenceOffset();
			
			self.listResult(null);
			self.snpDetails(null);
		});

		ko.computed(function () {
			if(self.proteinResult() && self.proteinResult().id) {
				self.listResult(null);
				self.snpDetails(null);

				var test = self.sequenceOffset();
				$.getJSON("list.json", self.listResult);
			}
		}).extend({ throttle: 500 });

		self.searchProtein = function() {
			location.hash = "!/search/" + self.predictionType() + '/' + self.protein;
		};
		
		self.switchType = function(type) {
			location.hash = "!/search/" + type + '/' + self.currentProtein;
		};
		
		self.formatProteinResult = function(elements, data) {
			var clickHandler = function (item) {
				var index = self.sequenceOffset() + item.dataIndex;
				self.selectedIndex(index);
			};
			
			// hack: can't use a selector to query for .flot_container
			// elements is a collection and not DOM
			var detailViewContainer = $($(elements).get(1));
			hidden.addGraph(detailViewContainer, data, false, clickHandler);
			hidden.addGraph($('#flot_overview'), self.proteinResult(), true);
		}

		self.formatListResult = function(elements, data) {
			//console.log(elements);
			//console.log(data);

		}

		self.showDetailView = function(index, mutation) {
			var snps = self.listResult();
			if(!snps) {
				self.snpDetails(null);
				return;
			}

			for(var i in snps) {
				if(snps[i].position == index) {
					for(var j in snps[i].mutations) {
						if(snps[i].mutations[j].name == mutation) {
							self.snpDetails(snps[i].mutations[j].data);
							return;
						}
					}
				}
			}

			self.snpDetails(null);
		}
		
		self.selectedIndex.subscribe(function (index) {
			$(".mutations").css('background-color', 'inherit');
			$("#mutation" + index).css('background-color', 'red');
			$('#functional_effect_list_container').scrollTo("#mutation" + index, 
				{ duration: 500, margin : true });
		});

		Sammy(function() {
			this.get("#!/search/:type/:protein", function() {
				self.protein = self.currentProtein = this.params["protein"];
				self.predictionType(this.params["type"]);
				
				$.getJSON("protein.json", function(result) {
					self.proteinResult(result);
				});

			});
			
			this.get("", function() {
				self.proteinResult("");
			});
		}).run();
	}

	ko.bindingHandlers.drag = {
		init: function(element, valueAccessor, allBindingsAccessor, viewModel) {
			var hidden = {};
			initNumberMixin(hidden);
			
			var sequenceLength = 0;
			var marginLeft = 2;
			var marginRight = 2;
			var lineLength = 0;
			var plotWidth = 0;
			var seekerWidth = 0;
			
			var plotOverview = $('#flot_overview');
			
			var maxOffset = 0;
			var minOffset = 0; 
			
			$(element).drag("init", function(event) {
				$(this).css({ "cursor": "pointer" });
				sequenceLength = viewModel.proteinResult().sequence.length;
				lineLength = viewModel.lineLength();
				
				plotWidth = plotOverview.width();
				seekerWidth = plotWidth / sequenceLength * lineLength;
				$('#flot_overview_container .seeker').width(seekerWidth);
				
				minOffset = marginLeft;
				maxOffset = plotWidth - seekerWidth - marginRight;
			}, { relative:true });
			
			$(element).drag(function(event, dd ){
				var offset = hidden.clamp(dd.offsetX, minOffset, maxOffset);
				$( this ).css({ left: offset });
				viewModel.sequenceOffset(Math.floor((offset-2) * sequenceLength / (plotWidth-8)));
			
			},{ relative:true });
		
			$(element).drag("end", function(event) {
				$(this).css({ "cursor": "e-resize" }, { relative:true });
			});
		},
		update: function(element, valueAccessor, allBindingsAccessor, viewModel) {
				var protein = viewModel.proteinResult();
				if(protein) {
					var sequenceLength = protein.sequence.length;
					var lineLength = viewModel.lineLength();
				
					var plotWidth = $('#flot_overview').width();
					var seekerWidth = plotWidth / sequenceLength * lineLength;
					$('#flot_overview_container .seeker').width(seekerWidth);
				}
		}
	};
	
	ko.bindingHandlers.popover = {
		init: function(element, valueAccessor, allBindingsAccessor, viewModel) {
			$(element).popover(valueAccessor());
		},
		update: function(element, valueAccessor, allBindingsAccessor, viewModel) {
			$(element).popover(valueAccessor());
		}
	};

	ko.bindingHandlers.listclick = {
		init: function(element, valueAccessor, allBindingsAccessor, viewModel) {
			$(element).on("click", ".mutations li", function(event) {
				// Hack, dont want to add data binding to each element
				var index = $(event.target).parent().parent().find('span').text();
				var mutation = $(event.target).text();
				var callback = valueAccessor();
				callback(index, mutation);
			});
		}
	};
	
	return ko.applyBindings(new SearchViewModel());
})();
