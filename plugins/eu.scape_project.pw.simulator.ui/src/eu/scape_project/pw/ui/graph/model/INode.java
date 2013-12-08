package eu.scape_project.pw.ui.graph.model;

public interface INode {

	String getName();
	
	public INode getParent();
	
	public Object[] getChildren();
	
	boolean hasChildren();
	
	void addChildren(INode child);
	
	
}
