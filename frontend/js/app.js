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
					
			return { refid : data.refid, 
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

var initStateMixin = (function(out) {
	var splitTypes = function(string) {
		return string.toString().split(":");
	};

	var buildTypeString = function(types) {
		return types.join(":");
	};
	out.serializeState = function(obj) {
		var result = "";
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
	var constants = {
		lineLength : 115,
		baseUrl : "http://localhost/api/resources/"
	};

	function SearchViewModel() {
		// private
		var hidden = {};
		initProteinMixin(hidden);
		initNumberMixin(hidden);
		initStateMixin(hidden);

		var self = this;

		self.ajaxErrorHandler = function (error) {
			console.log(error);
		};

		self.protein = 'NP_005378';
		self.proteinDetail=ko.observable();
		self.currentState = {
			offset : 0,
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
		
		
		/**
		 * @arg length of detail graph
		 */
		self.mutationListResult = ko.observable();
		
	
		self.externalMutationListResult = ko.observable();

		/**
		 * @arg 
		 */
		self.snpDetails = ko.observable();
		
	
		self.showDetailView = function(element, index, mutation) {
			var detailElement = $(element);

			var snps = self.mutationListResult();

			var data = null;

			for(var i in snps) {
				if(snps[i].position == index) {
					for(var j in snps[i].mutations) {
						if(snps[i].mutations[j].aa == mutation) {
							data = snps[i].mutations[j].data;
						}
					}
				}
			}

			if(data) {
				ko.applyBindingsToNode(detailElement.parent().find('.dropdown-menu')[0], 
					{ template: { name: 'snp_details', data: data } });
			}
		}

		self.searchProtein = function() {
			location.hash = "!/search/" + self.protein;
		};

		var showSearch = function() {
			$("#search_container").show();
			$("#result_container").hide();
		};

		var hideSearch = function() {
			$("#search_container").hide();
			$("#result_container").show();
		};

		self.slicedProtein = new Protein();
		self.updateByProteinResult = function(proteinResult) {
			var offset = self.currentState.offset;
			var types = self.currentState.types;
			
			self.currentState.protein = proteinResult;

			var slicedProtein = hidden.subProtein(proteinResult, offset, constants.lineLength);
			
			self.slicedProtein.refid(slicedProtein.refid);
			self.slicedProtein.sequence(slicedProtein.sequence);
			self.slicedProtein.predictions(slicedProtein.predictions);

			self.updateGraphs(proteinResult, slicedProtein, types);
			self.updateList(proteinResult, offset);
		};
		
		
		self.updateByProteinDetail = function(proteinDetail) {
			self.proteinDetail(proteinDetail);
		};
		
		self.updateByExternalSnpContainer = function(externalSnpContainer) {
			self.externalMutationListResult(externalSnpContainer.externalSnpDetailContainer)
		};

		self.updateGraphs = function(normal, scliced, types) {
			var clickHandler = function (item) {
				var index = self.sequenceOffset + item.dataIndex + 1;
				$(".mutations").parent().css('background-color', 'inherit');
				$("#mutation" + index).parent().css('background-color', 'red');
				$('#functional_effect_list_container').scrollTo("#mutation" + index, 
					{ duration: 500, margin : true });

			};

			hidden.addGraph($('#flot_details'), scliced, types, false, clickHandler);
			hidden.addGraph($('#flot_overview'), normal, types, true);
		}

		self.updateList = function (data, offset) {
			var id = data.refid;
			var offset = ((offset - 0) + 1);
			var length = constants.lineLength;

			$.when($.getJSON(constants.baseUrl + 'protein/mutations/' + id + '/' + offset + '/' + length))
			 .done(function (result) {
		 		self.mutationListResult(result.mutationsPos);
			 })
			 .fail(self.ajaxErrorHandler);
		};

		self.sequenceOffsetCallback = _.throttle(function (value) {
			self.currentState.offset = value;
			var slicedProtein = hidden.subProtein(self.currentState.protein, value, constants.lineLength);
			self.slicedProtein.refid(slicedProtein.refid);
			self.slicedProtein.sequence(slicedProtein.sequence);
			self.slicedProtein.predictions(slicedProtein.predictions);
			self.updateGraphs(self.currentState.protein, slicedProtein, self.currentState.types);
			self.updateList(self.currentState.protein, self.currentState.offset);
		}, 32);

		Sammy(function() {
			this.get("#!/search/:protein", function(context) {
				var protein = this.params["protein"];
				
				$.when($.post(constants.baseUrl + "protein/search", 
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

					$.when($.getJSON(constants.baseUrl + "protein/prediction/" 
									 + reference))
						.done(function (proteinResult) {
							proteinResult.refid = reference;
							self.updateByProteinResult(proteinResult);
							hideSearch();

						})
						.fail(self.ajaxErrorHandler);
					$.when($.getJSON(constants.baseUrl + "protein/detail/" 
							 + reference))
						.done(function (proteinDetail) {
							
					self.updateByProteinDetail(proteinDetail);
					})
					 .fail(self.ajaxErrorHandler);					
					$.when($.getJSON(constants.baseUrl + "protein/externalsnp/" 
							 + reference))
						.done(function (externalSnpContainer) {
							
					self.updateByExternalSnpContainer(externalSnpContainer);
					})
					 .fail(self.ajaxErrorHandler);
				}
			});
			
			this.get("", function() {
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
				
				$(element).drag(function(event, dd ){
					var offset = hidden.clamp(dd.offsetX, minOffset, maxOffset);
					$(element).css('left', offset);
					// valueAccessor() is the callback to be called with an parameter
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
				var index = $(event.target).parent().parent().parent().find('.position').text();
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
				if(index == -1)
					viewModel.currentState.types.push(valueAccessor());
				else { 
					if($("#active_types .active").size() > 1) {
						viewModel.currentState.types.splice(index, 1);
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
					//viewModel.invalidateAlphabet();
					return;
				}

				if(size > 1) {
					setTimeout(function() {
						//viewModel.invalidateAlphabet();
					}, 20);
				} else {
					event.preventDefault();
					event.stopPropagation();
				} 
			});
		}
	};
	
	return ko.applyBindings(new SearchViewModel());
})();

$('#functional_effect_list_container').on('click', '.dropdown-menu', function(event) {
	event.stopPropagation();
	event.preventDefault();
});
