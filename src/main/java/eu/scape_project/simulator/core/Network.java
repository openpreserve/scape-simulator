package eu.scape_project.simulator.core;

import java.util.ArrayList;
import java.util.List;

import eu.scape_project.simulator.model.Format;
import eu.scape_project.simulator.model.Node;

public class Network {

	private List<Node> nodes; 
	
	private EventProcesor ep;
	
	public Network() {
		nodes = new ArrayList<Node>();
	}
	
	public Network(EventProcesor eventProcesor){
		this();
		ep = eventProcesor;
	}
	
	public void init() {
		Node node = new Format();
		node.setEventProcessor(ep);
		node.init();
		nodes.add(node);
	}
	
	public void addNode(Node node) {
		//System.out.println("Adding new format");
		nodes.add(node);
	}
	
	public void deleteNode(Node node) {
		//System.out.println("Deleting");
		nodes.remove(node);
	}
}
