package eu.scape_project.simulator.event;

import eu.scape_project.simulator.model.Tool;

public class DeleteTool extends AbstractEvent {

	private Tool tool;
	
	public DeleteTool(){
		
	}
	
	public DeleteTool(Tool tool) {
		this.tool = tool;
	}
	
	public void execute() {		
		//System.out.println("Deleting tool in month " + run);
		network.deleteNode(tool);
	}
}
