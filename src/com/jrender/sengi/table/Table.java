package com.jrender.sengi.table;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.ElementHandle;
import com.jrender.jscript.dom.Window;
import com.jrender.jscript.dom.elements.CaptionElement;

public class Table extends com.jrender.jscript.dom.elements.TableElement {
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
		return this.caption == null ? ElementHandle.cast(this.getElementOrCreateByTagName("caption"), CaptionElement.class) : this.caption;
	}
	
	public String getTextCaption() {
		return getCaption().textContent();
	}
	
	public Table setTextCaption(String text) {
		getCaption().textContent(text);
		return this;
	}
	
	public THead getTHead() {
		return this.thead == null ? ElementHandle.cast(this.getElementOrCreateByTagName("thead"), THead.class) : this.thead;
	}
	
	public TBody getTBody() {
		return this.tbody == null ? ElementHandle.cast(this.getElementOrCreateByTagName("tbody"), TBody.class) : this.tbody;
	}
	
	public TFoot getTFoot() {
		return this.tfoot == null ? ElementHandle.cast(this.getElementOrCreateByTagName("tfoot"), TFoot.class) : this.tfoot;
	}
}
