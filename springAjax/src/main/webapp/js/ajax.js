var ajax = {};
ajax.xhr = {};
ajax.xhr.Request = function(url, params, callback, method) {
	this.url = url;
	this.params = params;
	this.callback = callback;
	this.method = method;
	this.send();
};
ajax.xhr.Request.prototype = {
	getXMLHttpRequest : function() {
		if (window.XMLHttpRequest) {
			return new XMLHttpRequest();
		} else {
			return null;
		}
	},
	send : function() {
		this.xhr = this.getXMLHttpRequest();
		var httpMethod = this.method ? this.method : 'GET';
		if (httpMethod != 'GET' && httpMethod != 'POST') {
			httpMethod = 'GET';
		}
		var httpParams = (this.params == null || this.params == '') ? null
				: this.params;
		var httpUrl = this.url;
		if (httpMethod == 'GET' && httpParams != null) {
			httpUrl = httpUrl + "?" + httpParams;
		}
		this.xhr.open(httpMethod, httpUrl, true);
		this.xhr.setRequestHeader('Content-Type',
				'application/x-www-form-urlencoded');
		
		var request = this;
		
		this.xhr.onreadystatechange = function() {
			request.callback(request.xhr);
		};
		this.xhr.send(httpMethod == 'POST' ? httpParams : null);
	}
	

};
