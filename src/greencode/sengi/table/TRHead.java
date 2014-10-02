package greencode.sengi.table;

import java.util.ArrayList;
import java.util.List;

import greencode.jscript.Window;
import greencode.jscript.elements.THElement;
import greencode.jscript.elements.TRElement;

public class TRHead extends TRElement {
	final List<THElement> tds = new ArrayList<THElement>();
	protected TRHead(Window window) { super(window); }
	
	public THElement getCol(int index) {
		return tds.get(index);
	}
}
