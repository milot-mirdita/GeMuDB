// Create a safe reference to the Underscore object for use below.
var _ = function(obj) {
	if (obj instanceof _) return obj;
	if (!(this instanceof _)) return new _(obj);
	this._wrapped = obj;
};

// A (possibly faster) way to get the current timestamp as an integer.
_.now = Date.now || function() { return new Date().getTime(); };

// Returns a function, that, when invoked, will only be triggered at most once
// during a given window of time. Normally, the throttled function will run
// as much as it can, without ever going more than once per `wait` duration;
// but if you'd like to disable the execution on the leading edge, pass
// `{leading: false}`. To disable execution on the trailing edge, ditto.
_.throttle = function(func, wait, options) {
	var context, args, result;
	var timeout = null;
	var previous = 0;
	options || (options = {});
	var later = function() {
		previous = options.leading === false ? 0 : _.now();
		timeout = null;
		result = func.apply(context, args);
		context = args = null;
	};
	return function() {
		var now = _.now();
		if (!previous && options.leading === false) previous = now;
		var remaining = wait - (now - previous);
		context = this;
		args = arguments;
		if (remaining <= 0) {
			clearTimeout(timeout);
			timeout = null;
			previous = now;
			result = func.apply(context, args);
			context = args = null;
		} else if (!timeout && options.trailing !== false) {
			timeout = setTimeout(later, remaining);
		}
		return result;
	};
};

// Returns a function, that, as long as it continues to be invoked, will not
// be triggered. The function will be called after it stops being called for
// N milliseconds. If `immediate` is passed, trigger the function on the
// leading edge, instead of the trailing.
_.debounce = function(func, wait, immediate) {
	var timeout, args, context, timestamp, result;

	var later = function() {
		var last = _.now() - timestamp;
		if (last < wait) {
			timeout = setTimeout(later, wait - last);
		} else {
			timeout = null;
			if (!immediate) {
				result = func.apply(context, args);
				context = args = null;
			}
		}
	};

	return function() {
		context = this;
		args = arguments;
		timestamp = _.now();
		var callNow = immediate && !timeout;
		if (!timeout) {
			timeout = setTimeout(later, wait);
		}
		if (callNow) {
			result = func.apply(context, args);
			context = args = null;
		}

		return result;
	};
};

function clamp (value, min, max) {
	return Math.min(Math.max(value, min), max);
}