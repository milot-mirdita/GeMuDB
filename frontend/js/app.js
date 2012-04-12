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
		
		out.subProtein = function(data, offset, lineLength) {
			if(!data) return null;
		
			var lineLength = lineLength || 115;
			var predictions = [];

			$.each(data.predictions, function(index, prediction) {
				predictions.push({
					type : prediction.type,
					reliability : prediction.reliability.slice(offset, offset + lineLength),
					conservation : prediction.conservation.slice(offset, offset + lineLength)
				});
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
		
		out.addGraph = function(target, data, types, fill, callback) {
			var fill = fill || false;
			var options = plotOptions();

			var graphs = [];
			for(var i in data.predictions) {
				for(var j in types) {
					if(data.predictions[i].type == types[j]) {
						graphs.push(probsToData(data.predictions[j].conservation));
					}
				}
			}

			if(fill)
				options.xaxis.max = data.sequence.length;
			
			var plot = $.plot(target, graphs, options);
			
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


var Protein = function() {
	this.id = ko.observable("");
	this.refid = ko.observable("");
	this.sequence = ko.observable("");
	this.predictions = ko.observableArray();
};

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
		self.protein = "NP_005378";
		
		/**
		 * @arg protein object as json
		 */
		self.proteinResult = new Protein();
	
		/**
		 * @arg offset to start rendering the detail graph
		 */
		self.sequenceOffset = ko.observable(0);
		
		/**
		 * @arg type of details to show
		 */
		self.predictionType = ko.observableArray(["SNAP"]);
		
		/**
		 * @arg length of detail graph
		 */
		self.lineLength = 115;	
		
		self.smallProteinResult = ko.computed(function() {
			var protein = ko.toJS(self.proteinResult);
			return hidden.subProtein(protein, 
									 self.sequenceOffset(),
									 self.lineLength);
		}).extend({ throttle: 1 });
				
		self.listResult = ko.observable();

		/**
		 * @arg 
		 */
		self.snpDetails = ko.observable();


		ko.computed(function () {
			var depends2 = self.sequenceOffset();
			self.listResult(null);
			self.snpDetails(null);
		});

		ko.computed(function () {
			if(self.proteinResult.id()) {
				var id =  self.proteinResult.id();
				var offset = (self.sequenceOffset() + 1);
				var length = self.lineLength;

				$.when($.getJSON('http://localhost/api/resources/protein/mutations/' + id + '/' + offset + '/' + length))
				 .done(function (result) {
				 	self.listResult(result.mutationsPos);
				 })
				 .fail(function (error) {
				 	console.warn(error);
				 });
			}
		}).extend({ throttle: 500 });

		self.searchProtein = function() {
			location.hash = "!/search/" + self.protein;
		};
		
		// self.switchType = function(type) {
		// 	location.hash = "!/search/" + type + '/' + self.currentProtein;
		// };
		
		self.toggleAmino = function(aa){
			
			
		}

		self.toggleType = function(type) {
			var index = $.inArray(type, self.predictionType());
			if(index == -1)
				self.predictionType().push(type);
			else
				self.predictionType().splice(index, 1);
		}
		
		self.formatProteinResult = function(elements, data) {
			var clickHandler = function (item) {
				var index = self.sequenceOffset() + item.dataIndex + 1;
				$(".mutations").parent().css('background-color', 'inherit');
				$("#mutation" + index).parent().css('background-color', 'red');
				$('#functional_effect_list_container').scrollTo("#mutation" + index, 
					{ duration: 500, margin : true });

			};
			
			// hack: can't use a selector to query for .flot_container
			// elements is a collection and not DOM
			var detailViewContainer = $($(elements).get(1));
			hidden.addGraph(detailViewContainer, data, self.predictionType(), false, clickHandler);
			hidden.addGraph($('#flot_overview'), ko.toJS(self.proteinResult), self.predictionType(), true);
		}

		self.formatListResult = function(elements, data) {
			//console.log(elements);
			//console.log(data);

		}

		self.showDetailView = function(index, mutation) {
			var snps = self.listResult();

			for(var i in snps) {
				if(snps[i].position == index) {
					for(var j in snps[i].mutations) {
						if(snps[i].mutations[j].aa == mutation) {
							self.snpDetails(snps[i].mutations[j].data);
							return;
						}
					}
				}
			}

			self.snpDetails(null);
		}

		Sammy(function() {
			this.get("#!/search/:protein", function() {
				//self.predictionType(this.params["type"]);
				if(self.currentProtein != this.params["protein"]) {
					self.protein = self.currentProtein = this.params["protein"];

					var errorHandler = function () {

					}
					
					$.when($.post('http://localhost/api/resources/protein/search', 
							{q: self.protein}, undefined, "json"))
						.done(function(searchResult) {
							$.when($.getJSON('http://localhost/api/resources/protein/prediction/' + searchResult.id))
							.done(function (proteinResult) {
								self.proteinResult.id(searchResult.id - 0);
								self.proteinResult.sequence(proteinResult.sequence);
								self.proteinResult.refid(proteinResult.refid);
								self.proteinResult.predictions(proteinResult.predictions);
							})
							.fail(errorHandler);
						})
						.fail(errorHandler);
				}
			});
			
			this.get("", function() {
				self.proteinResult = new Protein();
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
				$(element).css({ "cursor": "pointer" });
				sequenceLength = viewModel.proteinResult.sequence().length;
				lineLength = viewModel.lineLength;
				
				plotWidth = plotOverview.width();
				seekerWidth = plotWidth / sequenceLength * lineLength;
				$('#flot_overview_container .seeker').width(seekerWidth);
				
				minOffset = marginLeft;
				maxOffset = plotWidth - seekerWidth - marginRight;
			}, { relative:true });
			
			$(element).drag(function(event, dd ){
				var offset = hidden.clamp(dd.offsetX, minOffset, maxOffset);
				$(element).css('left', offset);
				viewModel.sequenceOffset(Math.floor((offset-2) * sequenceLength / (plotWidth-8)));		
			},{ relative:true });
		
			$(element).drag("end", function(event) {
				$(element).css({ "cursor": "e-resize" }, { relative:true });
			});
		},
		update: function(element, valueAccessor, allBindingsAccessor, viewModel) {
				var protein = ko.toJS(viewModel.proteinResult);
				if(protein) {
					
					var sequenceLength = protein.sequence.length;
					var lineLength = viewModel.lineLength;
				
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
