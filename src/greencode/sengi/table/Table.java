package greencode.sengi.table;

import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.ElementHandle;
import greencode.jscript.Window;
import greencode.jscript.elements.CaptionElement;

public class Table extends greencode.jscript.elements.TableElement {
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
		return this.caption == null ? ElementHandle.cast(ElementHandle.getOrCreateElementByTagName(this, "caption"), CaptionElement.class) : this.caption;
	}
	
	public String getTextCaption() {
		return getCaption().textContent();
	}
	
	public Table setTextCaption(String text) {
		getCaption().textContent(text);
		return this;
	}
	
	public THead getTHead() {
		return this.thead == null ? ElementHandle.cast(ElementHandle.getOrCreateElementByTagName(this, "thead"), THead.class) : this.thead;
	}
	
	public TBody getTBody() {
		return this.tbody == null ? ElementHandle.cast(ElementHandle.getOrCreateElementByTagName(this, "tbody"), TBody.class) : this.tbody;
	}
	
	public TFoot getTFoot() {
		return this.tfoot == null ? ElementHandle.cast(ElementHandle.getOrCreateElementByTagName(this, "tfoot"), TFoot.class) : this.tfoot;
	}
}
