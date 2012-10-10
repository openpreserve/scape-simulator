package eu.scape_project.simulator.event;

import eu.scape_project.simulator.model.Format;
import eu.scape_project.simulator.model.Tool;

public class CreateTool extends AbstractEvent {

	private Format format;
	
	
	public CreateTool(Format f) {
		format = f;
	}
	
	@Override
	public void execute() {
		//System.out.println("New tool is created");
		Tool tool = new Tool();
		format.addNode(tool);
		tool.addNode(format);
		tool.setEventProcessor(eventProcesor);
		tool.setBirth(run+1);
		tool.init();
		network.addNode(tool);
	}
}
