package eu.scape_project.pw.ui.graph.model;

public class Measure implements INode {

	private String name; 
	
	private INode parent; 
	
	public Measure(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public INode getParent() {
		return parent;
	}

	public Object[] getChildren() {
		return null;
	}

	public boolean hasChildren() {
		return false;
	}

	public void addChildren(INode child) {
		
	}

}
