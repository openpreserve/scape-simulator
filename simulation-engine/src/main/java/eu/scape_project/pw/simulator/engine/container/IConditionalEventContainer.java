package eu.scape_project.pw.simulator.engine.container;

import java.util.List;

import eu.scape_project.pw.simulator.engine.model.ICondition;
import eu.scape_project.pw.simulator.engine.model.IEvent;
import eu.scape_project.pw.simulator.engine.model.state.ISimulationState;


public interface IConditionalEventContainer {

	void addCondition(ICondition condition); 
	
	List<IEvent> getEvents(ISimulationState state);
	
}
