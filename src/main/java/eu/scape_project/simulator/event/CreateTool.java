package eu.scape_project.simulator.event;

import eu.scape_project.simulator.model.Format;

public class CreateTool extends AbstractEvent {

	private Format format;
	
	
	public CreateTool(Format f) {
		format = f;
	}
	
	@Override
	public void execute() {
		System.out.println("Executing");
	}
}
