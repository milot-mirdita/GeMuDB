;
var initProteinMixin = (function(out) {
		var plotOptions = function () { return {
			legend : { show : false }, 
			xaxis : { show : false, min : 0, max : 115, minTickSize: 5, tickSize: 5 }, 
			yaxis : { show : false, min : 1, max : 8, position : 'right', ticks : [1, 8] }, 
			grid : { borderWidth : 1, borderColor : '#aaa'}, 
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
		
		out.addGraph = function(target, data, fill) {
			var fill = fill || false;
			var options = plotOptions();
				
			var d1 = probsToData(data.predictions[0].reliability);
			var d2 = probsToData(data.predictions[0].conservation);
			
			if(fill)
				options.xaxis.max = data.sequence.length;
			
			return $.plot(target, [ d1, d2 ], options);
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
		var hidden = {};
		var self = this;
		
		initProteinMixin(hidden);
		initNumberMixin(hidden);
		
		self.protein = ko.observable("Protein");
		self.proteinResult = ko.observable();
		
		self.sequenceOffset = ko.observable(0);
		self.predictionType = ko.observable("snap2");
		
		self.lineLength = ko.observable(115);
		
		self.smallProteinResult = ko.computed(function() {
			return hidden.subProtein(self.proteinResult(), self.sequenceOffset(), self.predictionType(), self.lineLength());
		});
		
		self.isSearching = ko.observable();
		self.searchProtein = function() {
			location.hash = "search/" + this.protein();
		};
		
		self.handleProteinResult = function(json) {
			self.proteinResult(json);
		};
		
		self.overviewFlot = undefined;
		self.detailFlot = undefined;
		
		self.formatProteinResult = function(elements, data) {
			self.detailFlot = hidden.addGraph($($(elements).get(1)), data);
			self.overviewFlot = hidden.addGraph($('#flot_overview'), self.proteinResult(), true);
		}
		
		Sammy(function() {
			this.get("#search/:protein", function() {
				self.protein(this.params["protein"]);
				self.isSearching("yes");
				$.getJSON("protein.json", function(result) {
					self.handleProteinResult(result);
				});
			});
			
			this.get('', function() {
				self.isSearching("no");
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
			
			// var maxOffset = plotOverview.offset().x;
			// var minOffset = plotOverview.offset().x + plotOverview.width(); 
			
			$(element).drag("init", function(event) {
				$(this).css({ "cursor": "pointer" });
				sequenceLength = viewModel.proteinResult().sequence.length;
				lineLength = viewModel.lineLength();
				
				plotWidth = plotOverview.width();
				seekerWidth = plotWidth / sequenceLength * lineLength;
				$('#flot_overview_container .seeker').width(seekerWidth);
				
				minOffset = marginLeft;
				maxOffset = plotWidth - seekerWidth - marginRight;
			},{ relative:true });
			
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
	
	ko.applyBindings(new SearchViewModel());
})();