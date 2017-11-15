package com.jrender.sengi.table;

import java.util.ArrayList;
import java.util.List;

import com.jrender.jscript.dom.Window;
import com.jrender.jscript.dom.elements.TDElement;
import com.jrender.jscript.dom.elements.TRElement;

public class TR extends TRElement {
	final List<TDElement> tds = new ArrayList<TDElement>();
	protected TR(Window window) { super(window); }
	
	public TDElement getCol(int index) {
		return tds.get(index);
	}
}
