package eu.scape_project.pw.ui.graph.model;

import org.eclipse.core.resources.IFile;

public class Measure implements INode {

	private String name; 
	
	private INode parent; 
	
	private IFile file;
	
	public Measure(String name, IFile file) {
		this.name = name;
		this.file = file;
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
	
	public IFile getFile() {
		return file;
	}

}
