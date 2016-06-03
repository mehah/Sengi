package greencode.sengi.table;

import java.util.ArrayList;
import java.util.List;

import greencode.jscript.dom.Window;
import greencode.jscript.dom.elements.THElement;
import greencode.jscript.dom.elements.TRElement;

public class TRHead extends TRElement {
	final List<THElement> tds = new ArrayList<THElement>();
	protected TRHead(Window window) { super(window); }
	
	public THElement getCol(int index) {
		return tds.get(index);
	}
}
