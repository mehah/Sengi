package greencode.sengi.table;

import greencode.jscript.DOMHandle;
import greencode.jscript.dom.Element;
import greencode.jscript.dom.ElementHandle;
import greencode.jscript.dom.Window;
import greencode.jscript.dom.elements.CaptionElement;

public class Table extends greencode.jscript.dom.elements.TableElement {
	private CaptionElement caption;
	private THead thead;
	private TBody tbody;
	private TFoot tfoot;	
	
	protected Table(Window window) {
		super(window);
	}
	
	public Table(Element e) {
		super(DOMHandle.getWindow(e));		
		ElementHandle.dataTransfer(e, this);
	}
	
	public CaptionElement getCaption() {
		return this.caption == null ? ElementHandle.cast(this.getOrCreateElementByTagName("caption"), CaptionElement.class) : this.caption;
	}
	
	public String getTextCaption() {
		return getCaption().textContent();
	}
	
	public Table setTextCaption(String text) {
		getCaption().textContent(text);
		return this;
	}
	
	public THead getTHead() {
		return this.thead == null ? ElementHandle.cast(this.getOrCreateElementByTagName("thead"), THead.class) : this.thead;
	}
	
	public TBody getTBody() {
		return this.tbody == null ? ElementHandle.cast(this.getOrCreateElementByTagName("tbody"), TBody.class) : this.tbody;
	}
	
	public TFoot getTFoot() {
		return this.tfoot == null ? ElementHandle.cast(this.getOrCreateElementByTagName("tfoot"), TFoot.class) : this.tfoot;
	}
}
