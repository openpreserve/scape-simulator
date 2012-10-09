package eu.scape_project.simulator.event;

import eu.scape_project.simulator.model.Format;

public class DeleteFormat extends AbstractEvent {

	Format node ;
	
	public DeleteFormat(Format n) {
		node = n;
	}
	
	public void execute() {
		System.out.println("Deleting format in month " + run);
		network.deleteNode(node);
	}
}
