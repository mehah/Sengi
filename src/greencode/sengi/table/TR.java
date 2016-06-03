package greencode.sengi.table;

import java.util.ArrayList;
import java.util.List;

import greencode.jscript.dom.Window;
import greencode.jscript.dom.elements.TDElement;
import greencode.jscript.dom.elements.TRElement;

public class TR extends TRElement {
	final List<TDElement> tds = new ArrayList<TDElement>();
	protected TR(Window window) { super(window); }
	
	public TDElement getCol(int index) {
		return tds.get(index);
	}
}
