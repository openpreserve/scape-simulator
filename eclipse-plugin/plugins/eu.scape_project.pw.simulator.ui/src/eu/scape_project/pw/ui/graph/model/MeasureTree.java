package eu.scape_project.pw.ui.graph.model;

import java.util.ArrayList;
import java.util.List;

public class MeasureTree {

	private List<INode> roots;
	
	public MeasureTree() {
		roots = new ArrayList<INode>();
	}
	
	public void addRoot(INode node) {
		roots.add(node);
	}
	
	public Object[] getRoots() {
		return roots.toArray();
	}
}
