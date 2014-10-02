package greencode.sengi;

import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.ElementHandle;
import greencode.jscript.Window;
import greencode.jscript.elements.InputCheckboxElement;

public class Checkbox extends InputCheckboxElement {

	protected Checkbox(Window window) {
		super(window);
	}
	
	public Checkbox(Element e) {
		super(DOMHandle.getWindow(e));		
		ElementHandle.dataTransfer(e, this);
	}
	
	public static void checkByValue(Element[] es, String value) {
		for (int i = -1; ++i < es.length;) {
			final Element e = es[i];
			final InputCheckboxElement c = e instanceof InputCheckboxElement ? (InputCheckboxElement) e : ElementHandle.cast(e, InputCheckboxElement.class);
			es[i] = c;
			
			if(c.value().equals(value)) {
				c.checked(true);
				return;
			}
		}
	}
	
	public InputCheckboxElement checkByValue(String value) {
		final String name = this.name();
		InputCheckboxElement c = ElementHandle.cast(window.principalElement().querySelector("input[type=\"checkbox\"][name=\""+name+"\"][value=\""+value+"\"]"), InputCheckboxElement.class);
		c.checked(true);		
		return c;
	}
	
	public InputCheckboxElement[] checkByValues(String[] value) {
		StringBuilder s = new StringBuilder();
		
		final String name = this.name();
		
		for (String v : value) {
			if(s.length() > 0) s.append(",");
			s.append("input[type=\"checkbox\"][name=\""+name+"\"][value=\""+v+"\"]");
		}
		
		Element[] elements = window.principalElement().querySelectorAll(s.toString());
		
		InputCheckboxElement[] inputs = new InputCheckboxElement[elements.length];
		
		for (int i = -1; ++i < elements.length;) {		
			final InputCheckboxElement c = ElementHandle.cast(elements[i], InputCheckboxElement.class);
			c.checked(true);
			
			elements[i] = c;
		}
		
		return inputs;
	}

}
