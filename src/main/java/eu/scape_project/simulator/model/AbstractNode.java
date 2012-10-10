package eu.scape_project.simulator.model;

import java.util.ArrayList;
import java.util.List;

import eu.scape_project.simulator.core.EventProcesor;

public abstract class AbstractNode implements Node {

	protected int birth; 
	
	protected List<Node> nodes; 
	
	protected EventProcesor eventProcesor;
	
	
	public AbstractNode() {
		nodes = new ArrayList<Node>();
	}
	
	public void addNode(Node n) {
		nodes.add(n);
	}
	
	public void removeNode(Node n) {
		nodes.remove(n);
	}
	
	public void setEventProcessor(EventProcesor ep) {
		eventProcesor = ep;
	}

	public void setBirth(int b) {
		birth = b;
	}
	
	public int getBirth() {
		return birth;
	}
	
	public void notifyDelete() {
		for (Node node : nodes) {
			node.removeLink(this);
		}
	}
	
	public void removeLink(Node node){
		nodes.remove(node);
	}
	
	public int getTools() {
		return nodes.size();
	}
	
}
