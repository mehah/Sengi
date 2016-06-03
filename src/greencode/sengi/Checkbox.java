package greencode.sengi;

import greencode.jscript.DOMHandle;
import greencode.jscript.dom.Element;
import greencode.jscript.dom.ElementHandle;
import greencode.jscript.dom.Window;
import greencode.jscript.dom.elements.InputCheckboxElement;

public class Checkbox<T> extends InputCheckboxElement<T> {

	protected Checkbox(Window window) {
		super(window);
	}
	
	public Checkbox(Element e) {
		super(DOMHandle.getWindow(e));		
		ElementHandle.dataTransfer(e, this);
	}
	
	public static<T> void checkByValue(Element[] es, Object value) {
		for (int i = -1; ++i < es.length;) {
			final Element e = es[i];
			final InputCheckboxElement<T> c = e instanceof InputCheckboxElement ? (InputCheckboxElement<T>) e : ElementHandle.cast(e, InputCheckboxElement.class);
			es[i] = c;
			
			if(c.value().equals(value)) {
				c.checked(true);
				return;
			}
		}
	}
	
	public InputCheckboxElement <T>checkByValue(String value) {
		final String name = this.name();
		InputCheckboxElement<T> c = ElementHandle.cast(window.principalElement().querySelector("input[type=\"checkbox\"][name=\""+name+"\"][value=\""+value+"\"]"), InputCheckboxElement.class);
		c.checked(true);		
		return c;
	}
	
	public InputCheckboxElement<T>[] checkByValues(Object[] values) {
		StringBuilder s = new StringBuilder();
		
		final String name = this.name();
		
		for (Object v : values) {
			if(s.length() > 0) s.append(",");
			s.append("input[type=\"checkbox\"][name=\""+name+"\"][value=\""+v+"\"]");
		}
		
		Element[] elements = window.principalElement().querySelectorAll(s.toString());
		
		InputCheckboxElement<T>[] inputs = new InputCheckboxElement[elements.length];
		
		for (int i = -1; ++i < elements.length;) {		
			final InputCheckboxElement<T> c = ElementHandle.cast(elements[i], InputCheckboxElement.class);
			c.checked(true);
			
			elements[i] = c;
		}
		
		return inputs;
	}

}
