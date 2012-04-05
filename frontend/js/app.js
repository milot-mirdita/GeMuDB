;
var initProteinMixin = (function(out) {
		var plotOptions = { 
			legend : { show : false }, 
			xaxis : { show : false, min : 0, max : 115, minTickSize: 5, tickSize: 5 }, 
			yaxis : { show : false, min : 1, max : 8, position : 'right', ticks : [1, 8] }, 
			grid : { borderWidth : 1, borderColor : '#aaa'}, 
			series : { 
				lines : { show : false, steps : false}, 
				bars : { show : true, steps : true }, 
				shadowSize : 1} 
			};
	
		var colormap = { 
			"H" : ["#600", "#700", "#800", "#900", "#A00", "#B00", "#C00", "#D00", "#F00"],
			"E" : ["#006", "#007", "#008", "#009", "#00A", "#00B", "#00C", "#00D", "#00F"],
			"C" : ["#665000", "#775500", "#886500", "#997500", "#AA8000", "#BB8500", "#CC9000", "#DD9000", "#FF9500"]
		};

		var colorBinary = [ "#C00", "#0C0" ];
		
		out.subProtein = function(data, offset, predictionType, lineLength) {
			var lineLength = lineLength || 115;
			var predictions = [];
			$.each(data.predictions, function(index, prediction) {
				if(predictionType == undefined || predictionType == prediction.type) {
					predictions.push({
						type : prediction.type,
						reliability : prediction.reliability.slice(offset * lineLength, (offset + 1) * lineLength),
						conservation : prediction.conservation.slice(offset * lineLength, (offset + 1) * lineLength)
					});
				}
			});
			return { id : data.id, 
				sequence : data.sequence.slice(offset * lineLength, (offset + 1) * lineLength),
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
			// var buffer = document.createElement('span');
			// for(var j = 0; j < aaseq.length; j++) {
				// $(buffer).append((function(ss) {
					// counter++;
					// var prob;
					// if(ss == "H") {
						// prob = phseq[j] * 1;
					// } else if(ss == "E") {
						// prob = peseq[j] * 1;
					// } else if(ss == "C"){
						// prob = pcseq[j] * 1;
					// } else if(ss == "-") {
						// return $(document.createElement('span')).attr('data-pos', counter).text(aaseq[j]);
					// }
					// return $(document.createElement('span')).css({color : colormap[ss][prob]}).attr('data-pos', counter).text(aaseq[j]);
				// })(ssseq[j]));
			// }

			// var referenceBuffer = document.createElement('span');
			// for(var j = 0; j < aaseq.length; j++) {
				// $(referenceBuffer).append((function(s, a) {
					// var choice = 0;
					// if(s == a) {
						// choice = 1;
					// }
					
					// return $(document.createElement('span')).css({color : colorBinary[choice]}).text(a);
				// })(ssseq[j], reference[j]));
			// }
			
			// var line = ich.resultLine({ line : i+1, aaseq : $(buffer).html(), ssseq : ssseq, 
				// pcseq : pcseq, peseq : peseq, phseq : phseq, reference : $(referenceBuffer).html() });
			
			var d1 = probsToData(data.predictions[0].reliability);
			var d2 = probsToData(data.predictions[0].conservation);
			
			if(fill)
				plotOptions.xaxis.max = data.sequence.length;
			
			$.plot(target, [ d1, d2 ], plotOptions);
			// $('#gorResult').append(line);
		};
	return out;
});




(function() {
	"use strict";
	function SearchViewModel() {
		var self = this;
		
		initProteinMixin(self);
		
		self.protein = ko.observable("Protein");
		self.proteinResult = ko.observable({
			id:'',
			sequence:'',
			predictions: [{
					type : '',
					reliability : '',
					conservation : ''
				}]
		});
		
		self.sequenceOffset = ko.observable(0);
		self.predictionType = ko.observable("snap2");
		
		self.smallProteinResult = ko.computed(function() {
			return self.subProtein(self.proteinResult(), self.sequenceOffset(), self.predictionType());
		});
		
		self.isSearching = ko.observable();
		self.searchProtein = function() {
			location.hash = "search/" + this.protein();
		};
		
		self.handleProteinResult = function(json) {
			self.proteinResult(json);
		};
		
		self.formatProteinResult = function(elements, data) {
			self.addGraph($($(elements).get(1)), data);
						debugger;
			self.addGraph($('#flot_overview'), self.proteinResult(), true);

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
		
			});
		}).run();
	}

	// Activates knockout.js
	ko.applyBindings(new SearchViewModel());
})();