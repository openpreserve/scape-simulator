package eu.scape_project.pw.ui.graph.model;

import org.eclipse.core.resources.IFile;

public class Measure implements INode {

	private String name; 
	
	private String operation; 
	
	private String type;
	
	private String scale; 
	
	private INode parent; 
	
	private IFile file;
	
	public Measure(String name, String operation, String scale, String type, IFile file) {
		this.name = name;
		this.operation = operation;
		this.file = file;
		this.scale = scale;
		this.type = type;
	}
	
	public String getLabel() {
		return operation;
	}
	
	public String getName() {
		return name;
	}

	public String getScale() {
		return scale;
	}
	
	public String getType() {
		return type;
	}

	public String getOperation() {
		return operation;
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

	@Override
	public boolean equals(Object o) {
		if (o instanceof Measure) {
			Measure t = (Measure) o;
			return (this.name.compareTo(t.getName())==0 && this.operation.compareTo(t.getOperation())==0);
		}
		return false;
	}
}
