;
var constants = {
	externalSnpGraphHeight: 19,
	lineLength: 90,
	baseUrl : "http://gemudb.com/api/"
};

var initProteinMixin = (function(out) {
	out.overviewPlotOptions = function (xaxis_maxlength) { return {
		legend : { 
			show : false
		}, 
		xaxis : { 
			show : false, 
			min : 0, 
			max : xaxis_maxlength, 
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
			borderWidth : 1, 
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
				lineWidth: 0,
      			fillColor: { 
      				colors: [ 
      					{ 
      						opacity: 0.8 
      					}, 
      					{ 
      						opacity: 0.8 
      					} 
      				] 
      			} 
      		}, 
			shadowSize : 1
		} 
	}};

	out.detailPlotOptions = function () { return {
		legend : {
			show : false
		},
		xaxis : {
			show : true,
			min : 0,
			max : constants.lineLength,
			tickLength: 0
		},
		yaxis : {
			show : false,
			min : 0,
			max : 19,
			position : 'right',
			ticks : [ 0, 19 ],
		},
		grid : {
			borderWidth : 1,
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
					colors : [
						{
							opacity:0.0
						},
						{
							opacity:1
						}
					]
				}
			},
			shadowSize : 1
		}
	}};
	
	out.subProtein = function(data, offset, lineLength) {
		if(!data) {
			return null;
		}
	
		var lineLength = lineLength || constants.lineLength;
		var predictions = [];

		$.each(data.predictions, function(index, prediction) {
			predictions.push({
				type : prediction.type,
				reliability : prediction.reliability.slice(offset, offset + lineLength),
				conservation : prediction.conservation.slice(offset * 2, (offset + lineLength) * 2)
			});
		});
				
		return { 
			refid : data.refid, 
			sequence : data.sequence.slice(offset, offset + lineLength),
			predictions : predictions
		};
	};
	
	var probsToData = function (probs) {
		var data = []; 
		var counter = 0;
		for(var i = 0; i < probs.length; i+=2) { 
			if ( probs[i] != "-") { 
				data.push([counter, probs.toString().substr(i, 2) * 1]); 
			} 
			counter++;
		}
		return data;
	};

	var filterData = function (probs, threshold) {
		for(var i = 0; i < probs.length; i++) { 
			if ( probs[i] != "-") { 
				if(probs[i][1] < threshold)
					probs[i][1] = 0;
			} 
		}
		return probs;
	};
	
	out.createGraphDataFromPredictionObject = function(data,types,threshold){
		var graphdata = [];
		data.predictions.sort(function(a, b) {
			if (a.type > b.type)
				return -1;
			if (a.type < b.type)
				return 1;
			return 0;
		});
		for(var i in data.predictions) {
			var index = $.inArray(data.predictions[i].type, types);
			if(index !== -1) {
				var graphData = probsToData(data.predictions[index].conservation);
				graphData = filterData(graphData, threshold);
				graphdata.push(graphData);
			} else {
				graphdata.push([]);
			}
		}
		return graphdata;
	};
	
	out.createGraphDataFromExternalSnp = function(data, offset){
		var offset = offset || 0;
		var graphdata = [];
		for(var mutpos in data) {
			if(data.hasOwnProperty(mutpos) && data[mutpos].position - offset >= 0)
				graphdata.push([data[mutpos].position - offset, constants.externalSnpGraphHeight]);
		}
		return graphdata;
	};
	
	out.addGraph = function(target, data, options, callback) {
		var fill = fill || false;
		options.yaxis.max = $("#active_alphabet .active").size();
		$("#slider").slider("option", "max", $("#active_alphabet .active").size() - 1);

		var plot = $.plot(target, data, options);
		setTimeout(function() { $('#flot_container').addClass('rendered') }, 200);

		if(callback) {
			$(target).bind("plotclick", function (event, pos, item) {
				if (item) {
					console.log(item);
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

var initStateMixin = (function(out) {
	var splitTypes = function(string) {
		return string.toString().split(":");
	};

	var buildTypeString = function(types) {
		return types.join(":");
	};
	out.serializeState = function(obj) {
		var result = "!/show";
		result += "/" + obj.protein.refid;
		result += "/" + buildTypeString(obj.types);
		result += "/" + (obj.alphabet || "ACDEFGHIKLMNPQRSTVWY");
		result += "/" + obj.offset;
		result += "/" + (obj.detail.index || -1);
		result += "/" + (obj.detail.mutation || -1);

		return result;
	};

	out.unserializeState = function(string) {
		var tmp = string.toString().split("/");

		return {
			offset : (tmp[4] - 0),
			types : splitTypes(tmp[2]),
			alphabet : tmp[3],
			detail : {
				index : (tmp[5] - 0),
				mutation : (tmp[6] - 0)
			},
			protein : null
		};
	}
});

var Protein = function() {
	this.refid = ko.observable("");
	this.sequence = ko.observable("");
	this.predictions = ko.observableArray([]);
};

(function() {
	"use strict";

	function SearchViewModel() {
		// private
		var hidden = {};
		initProteinMixin(hidden);
		initNumberMixin(hidden);
		initStateMixin(hidden);

		var self = this;

		self.constants = constants;

		self.ajaxErrorHandler = function (error) {
			console.log(error);
		};

		self.protein = ko.observable('NP_005378');

		self.proteinDetail = ko.observable();

		function defaultState() {
			return {
				threshold : 0,
				offset : ko.observable(0),
				types : [
					'SNAP'
				],
				alphabet : '',
				detail : {
					index : null,
					mutation : null
				},
				protein : null
			};
		}

		self.currentState = defaultState();
				
		/**
		 * @arg length of detail graph
		 */
		self.mutationListResult = ko.observable();
		
	
		self.externalMutationListResult = ko.observable();

		/**
		 * @arg 
		 */
		self.snpDetails = ko.observable();

		self.slicedProtein = new Protein();
		
	
		self.showDetailView = function(element, index, mutation) {
			var detailElement = $(element);

			var snps = self.mutationListResult();

			var data = null;

			for(var i in snps.mutations) {
				if(snps.mutations[i].aa == mutation) {
					data = snps.mutations[i].data;
				}
			}

			if(data) {
				var result = {};
				for(var i in data) {
					result[data[i].type] = data[i];
				}
				var dropdown = $(detailElement).parent().find('.dropdown-menu');
				ko.applyBindingsToNode(dropdown[0], 
					{ template: { name: 'snp_details', data: result } });
			}
		}

		self.searchProtein = function() {
			location.hash = "!/search/" + self.protein();
		};

		var showSearch = function() {
			$("#search_container").show();
			$("#result_container").hide();
			$(".navbar-form").hide();
			$(window).resize();
		};

		var hideSearch = function() {
			$("#search_container").hide();
			$("#result_container").show();
			$(".navbar-form").show();
			$(window).resize();
		};

		self.updateByProteinResult = function(proteinResult) {
			var offset = self.currentState.offset();
			var types = self.currentState.types;
			
			self.currentState.protein = proteinResult;

			self.updateGraphs(proteinResult, offset, types);
		};
		
		
		self.updateByProteinDetail = function(proteinDetail) {
			self.proteinDetail(proteinDetail);
			hideSearch();
		};
		
		self.updateByExternalSnpContainer = function(externalSnpContainer) {
			self.externalMutationListResult(externalSnpContainer.externalMutationPosition)
			self.updateGraphs(self.currentState.protein, self.currentState.offset(), self.currentState.types);
		};
		
		self.updateGraphs = function(normal, offset, types) {
			var clickHandler = function (item) {
				var index = self.currentState.offset() + item.datapoint[0] + 1;
				var id = self.currentState.protein.refid;

				$.when($.getJSON(constants.baseUrl + id + '/functionaleffect/detail/ALL/'+ index))
					.done(function (result) {
			 			self.mutationListResult(result);
					})
					.fail(self.ajaxErrorHandler);
			};

			$("#slider").slider("option", "max", $("#active_alphabet .active").size() - 1);
			
			var proteinData  = hidden.createGraphDataFromPredictionObject(normal, types, self.currentState.threshold);
			var sliced       = hidden.subProtein(normal, offset, constants.lineLength);
			
			self.slicedProtein.refid(sliced.refid);
			self.slicedProtein.sequence(sliced.sequence);
			self.slicedProtein.predictions(sliced.predictions);

			var slicedData   = hidden.createGraphDataFromPredictionObject(sliced, types, self.currentState.threshold);

			var snpData      = hidden.createGraphDataFromExternalSnp(self.externalMutationListResult());
			var slicedSnpData = hidden.createGraphDataFromExternalSnp(self.externalMutationListResult(), offset);
			
			var snpPlot = [{
				color: '#ff0000', 
				data : snpData
			}];

			var slicedSnpPlot = [{
				color: '#ff0000', 
				data : slicedSnpData
			}];

			var proteinPlot = snpPlot.concat(proteinData);
			var slicedPlot = slicedSnpPlot.concat(slicedData);

			var detailOptions = hidden.detailPlotOptions();
			detailOptions.xaxis.ticks = self.slicedProtein.sequence().split("").map(
				function(val, i) { 
					return [i + 0.5, val];
				}
			);
			
			hidden.addGraph($('#flot_overview'), proteinPlot, hidden.overviewPlotOptions(normal.sequence.length));
			hidden.addGraph($('#flot_details'), slicedPlot, detailOptions, clickHandler);
		}

		self.updateTypes = function() {
			self.updateGraphs(self.currentState.protein, self.currentState.offset(), self.currentState.types);
		};

		self.updateAlphabet = _.debounce(function (alphabet) {
			$.when(
				$.getJSON(constants.baseUrl + self.protein() + "/functionaleffect/" + alphabet + "/SNAP"),
				$.getJSON(constants.baseUrl + self.protein() + "/functionaleffect/" + alphabet + "/SIFT"))
			.done(function (snapResult, siftResult) {
				var proteinResult = {};
				proteinResult.refid = self.protein();
				proteinResult.predictions = [snapResult[0], siftResult[0]];
				proteinResult.sequence = snapResult[0].sequence;
				self.updateByProteinResult(proteinResult);
			})
			.fail(self.ajaxErrorHandler);
		}, 500);

		self.sequenceOffsetCallback = _.throttle(function (value) {
			self.currentState.offset(value);
			self.updateGraphs(self.currentState.protein, value, self.currentState.types);
		}, 32);

		self.currentReferenceId = "";

		$(document).ready(function() {
			$('#functional_effect_list_container').on('click', '.dropdown-menu', function(event) {
				event.stopPropagation();
				event.preventDefault();
			});

			$("#slider").slider({
				value:0,
				min: 0,
				max: 19,
				step: 1,
				slide: function( event, ui ) {
					$('.ui-slider-handle', '#slider').text(ui.value);
					self.currentState.threshold = (ui.value - 0);
					self.updateTypes();
				}
			});
			$('.ui-slider-handle', '#slider').text(0);
		});

		Sammy(function() {
			this.get("#!/search/:protein", function(context) {
				var protein = this.params["protein"];
				
				$.when($.post(constants.baseUrl + "search", 
						{q: protein}, undefined, "json"))
					.done(function(searchResult) {
						context.redirect("#!", "show", searchResult.refid);
					})
					.fail(self.ajaxErrorHandler);
			});

			this.get("#!/show/:refid", function() {
				var reference = this.params["refid"];
				if(self.currentReferenceId != reference) {
					self.currentReferenceId = reference;
					self.currentState = defaultState();

					self.proteinDetail(null);
					self.slicedProtein.refid(null);
					self.slicedProtein.sequence(null);
					self.slicedProtein.predictions([]);
					self.mutationListResult(null);
					self.externalMutationListResult(null);
					self.snpDetails(null);

					$.when(
						$.getJSON(constants.baseUrl + reference + "/functionaleffect/SNAP"),
						$.getJSON(constants.baseUrl + reference + "/functionaleffect/SIFT"))
						.done(function (snapResult, siftResult) {
							var proteinResult = {};
							proteinResult.refid = reference;
							proteinResult.predictions = [snapResult[0], siftResult[0]];
							proteinResult.sequence = snapResult[0].sequence;
							self.updateByProteinResult(proteinResult);
							hideSearch();

						})
						.fail(self.ajaxErrorHandler);

					$.when($.getJSON(constants.baseUrl + "detail/" + reference))
						.done(function (proteinDetail) {
							self.updateByProteinDetail(proteinDetail); 
						})
					 	.fail(self.ajaxErrorHandler);	

					 $.when($.getJSON(constants.baseUrl + "externalsnp/" + reference))
						.done(function (externalSnpContainer) {

							self.updateByExternalSnpContainer(externalSnpContainer);
						})
					 	.fail(self.ajaxErrorHandler);	
				}
			});
			
			this.get("", function() {
				showSearch();
			});

			this.get("#", function() {
				showSearch();
			});
		}).run();
	}

	ko.bindingHandlers.drag = {
		init: function(element, valueAccessor, allBindingsAccessor, viewModel) {
			var initialize = _.throttle(function() {
				if(!viewModel.currentState.protein
					|| viewModel.currentState.protein.sequence == 0) {
					setTimeout(initialize, 64);
					return;
				}

				$(element).css({ "cursor": "pointer" });

				var hidden = {};
				initNumberMixin(hidden);
				
				var plotOverview = $('#flot_overview');

				var sequenceLength = viewModel.currentState.protein.sequence.length;
				var marginLeft = 2;
				var marginRight = 2;
				var lineLength = constants.lineLength;
				var plotWidth = plotOverview.width();
				var seekerWidth = plotWidth / sequenceLength * lineLength;
				 
				$('#flot_overview_container .seeker').width(seekerWidth);
				
				var minOffset = marginLeft; 
				var maxOffset = plotWidth - seekerWidth - marginRight;
				
				$(element).drag(function(event, dd){
					var offset = hidden.clamp(dd.offsetX, minOffset, maxOffset);
					$(element).css('left', offset);
					valueAccessor()(Math.floor((offset-2) * sequenceLength / (plotWidth-8)));	
				},{ relative:true });
			
				$(element).drag("end", function(event) {
					$(element).css({ "cursor": "e-resize" }, { relative:true });
				});
			}, 64);
			setTimeout(initialize, 64);
		},
		update: function(element, valueAccessor, allBindingsAccessor, viewModel) {
				var protein = viewModel.currentState.protein;
				if(protein) {
					var sequenceLength = protein.sequence.length;
					var lineLength = constants.lineLength;
				
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
				var index = $(event.target).closest('.positions').find('.position').text();
				var mutation = $(event.target).text();
				var callback = valueAccessor();
				callback(event.target, index, mutation);
			});
		}
	};

	ko.bindingHandlers.typeclick = {
		init: function(element, valueAccessor, allBindingsAccessor, viewModel, context) {
			$(element).click(function(event) {
				var index = $.inArray(valueAccessor(), viewModel.currentState.types);
				if(index == -1) {
					viewModel.currentState.types.push(valueAccessor());
					viewModel.updateTypes();
				} else { 
					if($("#active_types .active").size() > 1) {
						viewModel.currentState.types.splice(index, 1);
						viewModel.updateTypes();
					} else {
						event.preventDefault();
						event.stopPropagation();
					} 
				}
			});
		}
	};

	ko.bindingHandlers.alphabetclick = {
		init: function(element, valueAccessor, allBindingsAccessor, viewModel, context) {
			$(element).on("click", ".btn", function(event) {
				var size = $("#active_alphabet .active").size();
				if(!$(this).hasClass('active')) {
					setTimeout(function() {
						valueAccessor()($("#active_alphabet .active").text());
					}, 20);
					return;
				}

				if(size > 1) {
					setTimeout(function() {
						valueAccessor()($("#active_alphabet .active").text());
					}, 20);
				} else {
					event.preventDefault();
					event.stopPropagation();
				} 
			});
		}
	};

	// https://github.com/knockout/knockout/wiki/Bindings---class
	ko.bindingHandlers['class'] = {
    'update': function(element, valueAccessor) {
        if (element['__ko__previousClassValue__']) {
            $(element).removeClass(element['__ko__previousClassValue__']);
        }
        var value = ko.utils.unwrapObservable(valueAccessor());
        $(element).addClass(value);
        element['__ko__previousClassValue__'] = value;
    }
};
	
return ko.applyBindings(new SearchViewModel());
})();

