package com.jrender.sengi;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.ElementHandle;
import com.jrender.jscript.dom.elements.SelectElement;

public class SelectMultiple<T> extends SelectElement<T> {
	
	public SelectMultiple(Element e) {
		super(DOMHandle.getWindow(e));		
		ElementHandle.dataTransfer(e, this);
	}
	
	public void selectOptionByValue(Element e, String value) {
		DOMHandle.execCommand(e, "selectOptionByValue", value);
	}
	
	public void selectOptionByText(Element e, String text) {
		DOMHandle.execCommand(e, "selectOptionByText", text);
	}
}
