Greencode.customMethod.selectOptionByValue = function(v) {
	Greencode.crossbrowser.querySelector.call(this, 'option[value="'+v+'"]').selected = true;
	return this;
};

Greencode.customMethod.selectOptionByText = function(t) {
	Greencode.crossbrowser.querySelector.call(this, 'option:contains("'+t+'")"').selected = true;
	return this;
};