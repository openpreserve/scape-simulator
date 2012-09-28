package eu.scape_project.simulator.event;

import eu.scape_project.simulator.model.Format;

public class CreateFormat extends AbstractEvent {

	public void execute() {
		Format format = new Format();
		format.setEventProcessor(eventProcesor);
		format.setBirth(run);
		format.init();
		network.addNode(format);
	}
}
