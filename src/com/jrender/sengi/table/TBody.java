package com.jrender.sengi.table;

import java.util.ArrayList;
import java.util.List;

import com.jrender.sengi.implementations.ElementEach;

import com.jrender.jscript.dom.Window;
import com.jrender.jscript.dom.elements.TDElement;
import com.jrender.jscript.dom.elements.TbodyElement;

public class TBody extends TbodyElement{
	private final List<TR> trs = new ArrayList<TR>();
	
	protected TBody(Window window) {
		super(window);
	}

	public TR createLine(int cols) {
		return createLine(cols, null);
	}
	
	public TR createLine(int cols, ElementEach<TDElement> TDEach) {
		TR tr = window.document.createElement(TR.class);
		trs.add(tr);
		
		for (int i = -1; ++i < cols;) {
			TDElement td = window.document.createElement(TDElement.class);
			tr.tds.add(td);
			
			if(TDEach != null)
				TDEach.each(td);
		}		
		
		this.appendChild(tr);
		
		return tr;
	}
	
	public TR firstChild() {
		return trs.get(0);
	}
	
	public TR lastChild() {
		return trs.get(trs.size()-1);
	}
	
	private int i = -1;
	public TR nextChild() {
		TR tr = trs.get(++i);
		
		if(tr == null)
			i = -1;
		
		return tr;
	}
}
