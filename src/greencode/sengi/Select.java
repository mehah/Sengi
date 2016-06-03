package greencode.sengi;

import greencode.jscript.DOMHandle;
import greencode.jscript.dom.Element;
import greencode.jscript.dom.ElementHandle;
import greencode.jscript.dom.elements.SelectElement;

public class Select extends SelectElement {
	
	public Select(Element e) {
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
