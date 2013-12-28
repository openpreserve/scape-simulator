package eu.scape_project.pw.ui.graph.model;

import java.util.ArrayList;
import java.util.List;

public class MeasureContainer implements INode {

	private String name;
	
	List<INode> children ; 
	
	INode parent;
	
	public MeasureContainer() {
		children = new ArrayList<INode>();
	}
	
	public MeasureContainer(String name, INode parent) {
		this();
		this.name = name;
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public INode getParent() {
		return parent;
	}

	public Object[] getChildren() {
		return children.toArray();
	}

	public boolean hasChildren() {
		return !children.isEmpty();
	}

	public void addChildren(INode child) {
		children.add(child);
	}

}
