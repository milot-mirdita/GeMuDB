ko.bindingHandlers.popover = {
	init: function(element, valueAccessor, allBindingsAccessor, viewModel) {
		$(element).popover(valueAccessor());
	},
	update: function(element, valueAccessor, allBindingsAccessor, viewModel) {
		$(element).popover(valueAccessor());
	}
};