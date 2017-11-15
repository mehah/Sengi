package com.jrender.sengi.table;

import java.util.ArrayList;
import java.util.List;

import com.jrender.jscript.dom.Window;
import com.jrender.jscript.dom.elements.THElement;
import com.jrender.jscript.dom.elements.TRElement;

public class TRHead extends TRElement {
	final List<THElement> tds = new ArrayList<THElement>();
	protected TRHead(Window window) { super(window); }
	
	public THElement getCol(int index) {
		return tds.get(index);
	}
}
