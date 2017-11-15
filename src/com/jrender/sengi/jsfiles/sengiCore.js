Element.prototype.selectOptionByValue = function(v) {
	this.querySelector('option[value="'+v+'"]').selected = true;
	return this;
};

Element.prototype.selectOptionByText = function(t) {
	this.querySelector('option:contains("'+t+'")"').selected = true;
	return this;
};