package greencode.sengi;

import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.ElementHandle;
import greencode.jscript.elements.SelectElement;

public class SelectMultiple extends SelectElement {
	
	public SelectMultiple(Element e) {
		super(DOMHandle.getWindow(e));		
		ElementHandle.dataTransfer(e, this);
	}
	
	public void selectOptionByValue(Element e, String value) {
		DOMHandle.execCommand(e, "customMethod.selectOptionByValue", value);
	}
	
	public void selectOptionByText(Element e, String text) {
		DOMHandle.execCommand(e, "customMethod.selectOptionByText", text);
	}
}
