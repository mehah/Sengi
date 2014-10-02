package greencode.sengi.table;

import java.util.ArrayList;
import java.util.List;

import greencode.jscript.Window;
import greencode.jscript.elements.THElement;
import greencode.jscript.elements.TheadElement;
import greencode.sengi.implementations.ElementEach;

public class THead extends TheadElement{
	private final List<TRHead> trs = new ArrayList<TRHead>();
	
	protected THead(Window window) {
		super(window);
	}

	public TRHead createLine(int cols) {
		return createLine(cols, null);
	}
	
	public TRHead createLine(int cols, ElementEach<THElement> THEach) {
		TRHead tr = window.document.createElement(TRHead.class);
		trs.add(tr);
		
		for (int i = -1; ++i < cols;) {
			THElement th = window.document.createElement(THElement.class);
			tr.tds.add(th);
			
			if(THEach != null)
				THEach.each(th);
		}		
		
		this.appendChild(tr);
		
		return tr;
	}
	
	public TRHead firstChild() {
		return trs.get(0);
	}
	
	public TRHead lastChild() {
		return trs.get(trs.size()-1);
	}
	
	private int i = -1;
	public TRHead nextChild() {
		TRHead tr = trs.get(++i);
		
		if(tr == null)
			i = -1;
		
		return tr;
	}
	
}
