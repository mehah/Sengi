package com.jrender.sengi;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.ElementHandle;
import com.jrender.jscript.dom.Window;
import com.jrender.jscript.dom.elements.InputRadioElement;

public class Radio extends InputRadioElement {

	protected Radio(Window window) {
		super(window);
	}
	
	public Radio(Element e) {
		super(DOMHandle.getWindow(e));		
		ElementHandle.dataTransfer(e, this);
	}

	public static void checkByValue(Element[] es, String value) {
		for (int i = -1; ++i < es.length;) {
			final Element e = es[i];
			final InputRadioElement r = e instanceof InputRadioElement ? (InputRadioElement) e : ElementHandle.cast(e, InputRadioElement.class);
			es[i] = r;
			
			if(r.value().equals(value)) {
				r.checked(true);
				return;
			}
		}
	}
	
	public InputRadioElement checkByValue(String value) {
		InputRadioElement r = ElementHandle.cast(window.principalElement().querySelector("input[type=\"radio\"][name=\""+this.name()+"\"][value=\""+value+"\"]"), InputRadioElement.class);
		r.checked(true);		
		return r;
	}
}
