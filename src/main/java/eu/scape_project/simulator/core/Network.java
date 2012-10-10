package eu.scape_project.simulator.core;

import java.util.ArrayList;
import java.util.List;

import eu.scape_project.simulator.model.Format;
import eu.scape_project.simulator.model.Node;

public class Network {

	private List<Node> nodes; 
	
	private EventProcesor ep;
	
	private int numFormat = 0;
	
	private int numTool = 0;
	
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
		
		if (node.isFormat()){
			numFormat++;
		}else {
			numTool++;
		}
		
		nodes.add(node);
	}
	
	public void deleteNode(Node node) {
		if (node.isFormat()){
			numFormat--;
		}else {
			numTool--;
		}
		nodes.remove(node);
		node.notifyDelete();
	}
	
	public int getNumberFormat() {
		return numFormat;
	}
	
	public int getNumberTool() {
		return numTool;
	}
	
	public int getNumberOfActiveFormats() {
		int counter = 0;
		for (Node node : nodes) {
			if (node.isFormat()){
				if(node.getTools()>0){
					counter++;
				}
			}
		}
		return counter;
	}
	
}
