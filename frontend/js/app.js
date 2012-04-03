;(function() {
	"use strict";
	function SearchViewModel() {
		var self = this;
		self.protein = ko.observable("Protein");
		self.isSearching = ko.observable();
		self.searchProtein = function() {
			location.hash = "search/" + this.protein();
		};
		
		Sammy(function() {
			this.get("#search/:protein", function() {
				self.protein(this.params["protein"]);
				self.isSearching("yes");
				console.log(self.protein());
				$('#search_container').hide();
				$('#result_container').show();
			});
			
			this.get('', function() {
				$('#search_container').show();
				$('#result_container').hide();
			});
		}).run();
	}

	// Activates knockout.js
	ko.applyBindings(new SearchViewModel());
})();