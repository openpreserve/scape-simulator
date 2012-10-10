package eu.scape_project.simulator.core;

import java.util.ArrayList;

import eu.scape_project.simulator.model.Format;

public class Observer {

	private Format currentFormat; 
	
	private ArrayList<Integer> numbofFormats = new ArrayList<Integer>();
	private ArrayList<Integer> numbofActiveFormats = new ArrayList<Integer>();
	private ArrayList<Integer> numbofTools = new ArrayList<Integer>();
	
	public Observer() {
		
	}
	
	public void observe(Network network, int month) {
	
		//System.out.println("Observing " + currentFormat.getNumberOfTools());
		numbofTools.add(currentFormat.getNumberOfTools());
		numbofActiveFormats.add(network.getNumberOfActiveFormats());
		numbofFormats.add(network.getNumberFormat());
		
	}
	
	public void setCurrentFormat(Format f) {
		currentFormat = f;
	}
	
	public ArrayList<Integer> getNumbOfFormats() {
		return numbofFormats;
	}
	
	public ArrayList<Integer> getNumbOfActiveFormats() {
		return numbofActiveFormats;
	}
	
	public ArrayList<Integer> getNumbOfTools() {
		return numbofTools;
	}
	
}
