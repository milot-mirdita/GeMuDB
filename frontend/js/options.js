var constants = {
	externalSnpGraphHeight: 19,
	lineLength: 90,
	baseUrl : "http://gemudb.com/api/",
	alphabet : [
		'A',
		'R',
		'N',
		'D',
		'C',
		'E',
		'Q',
		'G',
		'H',
		'I',
		'L',
		'K',
		'M',
		'F',
		'P',
		'S',
		'T',
		'W',
		'Y',
		'V'
	]
};

function OverviewPlotOptions() { 
	return {
		legend : { 
			show : false
		}, 
		xaxis : { 
			show : false, 
			min : 0, 
			minTickSize: 5, 
			tickSize: 5
		}, 
		yaxis : { 
			show : false, 
			min : 0,
			max : 19,
			position : 'right',
			ticks : [ 0, 19 ]
		}, 
		grid : { 
			borderWidth : 0, 
			borderColor : '#aaa',
			clickable : false
		}, 
		series : { 
			lines : { 
				show : false,
				steps : false
			}, 
			bars : { 
				show : true, 
				steps : true, 
				lineWidth: 0,
      			fillColor: { 
      				colors: [ { 
      						opacity: 0.8 
      					}, { 
      						opacity: 0.8 
      					} 
      				] 
      			} 
      		}, 
			shadowSize : 1
		} 
	};
}

function DetailPlotOptions() { 
	return {
		legend : {
			show : false
		},
		xaxis : {
			show : true,
			min : 0,
			max : constants.lineLength,
			tickLength: 0,
			color: '#333',
			font: {
				family: "Open Sans, sans-serif",
			}
		},
		yaxis : {
			show : false,
			min : 0,
			max : 19,
			position : 'right',
			ticks : [ 0, 19 ],
		},
		grid : {
			borderWidth : 0,
			borderColor : '#aaa',
			clickable : true
		},
		series : {
			lines : {
				show : false,
				steps : false
			},
			bars : {
				show : true,
				steps : true,
				lineWidth : 1,
				fill : true,
				fillColor : {
					colors : [ {
							opacity:0.0
						}, {
							opacity:1
						}
					]
				}
			},
			shadowSize : 1
		}
	};
}

function DefaultState() {
	this.offset = ko.observable();

	this.reset();
	
	return this;
}

DefaultState.prototype.reset = function() {
	this.offset(0);

	this.threshold = 0;
	this.types = [
			'SNAP'
		];
		
	this.alphabet = constants.alphabet.slice(0);
	this.detail = {
			index : null,
			mutation : null
		};
	
	this.protein = null;
}

function Sequence(sequence) {
	this.sequence = sequence || "";
}

Sequence.prototype.toString = function () {
	return this.sequence;
}

Sequence.prototype.toFlotTicks = function() {
	return this.sequence.split("").map( function(val, i) { return [i + 0.5, val]; } );
}

function Protein(protein) {
	this.refid = protein.refid || "";
	this.sequence = new Sequence(protein.sequence || "");
	this.predictions = protein.predictions || [];
}

Protein.prototype.cut = function(offset) {
	var predictions = [];

	$.each(this.predictions, function(index, prediction) {
		predictions.push({
			type : prediction.type,
			reliability : prediction.reliability.slice(offset, offset + constants.lineLength),
			conservation : prediction.conservation.slice(offset * 2, (offset + constants.lineLength) * 2)
		});
	});
			
	return new Protein({ 
		refid : this.refid, 
		sequence : this.sequence.toString().slice(offset, offset + constants.lineLength),
		predictions : predictions
	});
}	

function probsToData (probs) {
	var data = []; 
	var counter = 0;
	for(var i = 0; i < probs.length; i+=2) { 
		if (probs[i] != "-") { 
			data.push([counter, probs.toString().substr(i, 2) * 1]); 
		} 
		counter++;
	}
	return data;
}

function filterData (probs, threshold) {
	for(var i = 0; i < probs.length; i++) { 
		if (probs[i] != "-") { 
			if(probs[i][1] < threshold)
				probs[i][1] = 0;
		} 
	}
	return probs;
}

Protein.prototype.toFlotData = function(threshold, types){
	var graphdata = [];

	this.predictions.sort(function sortByType (a, b) {
		if (a.type > b.type)
			return -1;
		if (a.type < b.type)
			return 1;
		return 0;
	});

	for(var i in this.predictions) {
		var index = $.inArray(this.predictions[i].type, types);
		if(index !== -1) {
			var graphData = probsToData(this.predictions[index].conservation);
			graphData = filterData(graphData, threshold);
			graphdata.push(graphData);
		} else {
			graphdata.push([]);
		}
	}
	return graphdata;
}

function SnpFlotData(flotData) {
	return [{
		color: '#ff0000', 
		data : flotData
	}];
}