package eu.scape_project.pw.simulator.engine.container;

import java.util.ArrayList;
import java.util.List;

import eu.scape_project.pw.simulator.engine.model.ICondition;
import eu.scape_project.pw.simulator.engine.model.IEvent;
import eu.scape_project.pw.simulator.engine.model.state.ISimulationState;

public class ConditionalEventContainer implements IConditionalEventContainer {

	private List<ICondition> conditions;

	public ConditionalEventContainer() {
		conditions = new ArrayList<ICondition>();
	}

	@Override
	public void addCondition(ICondition condition) {
		conditions.add(condition);
	}

	@Override
	public List<IEvent> getEvents(ISimulationState state) {
		List<IEvent> events = new ArrayList<IEvent>();
		for (ICondition c : conditions) {
			IEvent e = c.checkCondition(state);
			if (e != null) {
				events.add(e);
			}
		}
		return events;
	}

}
