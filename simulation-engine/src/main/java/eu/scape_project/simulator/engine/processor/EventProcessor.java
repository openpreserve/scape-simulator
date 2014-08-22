package eu.scape_project.simulator.engine.processor;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;

import eu.scape_project.pw.simulator.engine.container.IConditionalEventContainer;
import eu.scape_project.pw.simulator.engine.container.IConditionalEventContainerFactory;
import eu.scape_project.pw.simulator.engine.container.IEventContainer;
import eu.scape_project.pw.simulator.engine.container.IEventContainerFactory;
import eu.scape_project.pw.simulator.engine.container.IEventObserverContainer;
import eu.scape_project.pw.simulator.engine.container.IEventObserverContainerFactory;
import eu.scape_project.pw.simulator.engine.model.IEvent;
import eu.scape_project.pw.simulator.engine.model.IEventObserver;
import eu.scape_project.pw.simulator.engine.model.ISimulationProperties;
import eu.scape_project.pw.simulator.engine.model.state.ISimulationState;
import eu.scape_project.pw.simulator.engine.model.state.ISimulationStateFactory;
import eu.scape_project.pw.simulator.engine.recorder.IRecorder;

public class EventProcessor implements IEventProcessor {

	private static Logger LOG = LoggerFactory.getLogger(EventProcessor.class);

	private final IEventContainerFactory eventContainerFactory;

	private final IEventObserverContainerFactory eOFactory;

	private final IRecorder recorder;

	private final ISimulationProperties properties;

	private final ISimulationStateFactory simulationStateFactory;

	private final IConditionalEventContainerFactory cecFactory;

	@Inject
	public EventProcessor(IEventContainerFactory eventContainerFactory,
			IEventObserverContainerFactory eOFactory, IRecorder recorder,
			ISimulationProperties properties,
			ISimulationStateFactory simulationStateFactory,
			IConditionalEventContainerFactory cecFactory) {
		this.eventContainerFactory = eventContainerFactory;
		this.eOFactory = eOFactory;
		this.recorder = recorder;
		this.properties = properties;
		this.simulationStateFactory = simulationStateFactory;
		this.cecFactory = cecFactory;
	}

	@Override
	public void startSimulation() {
		recorder.startSimulation(properties);
		LOG.info("Starting simulation!!!");
		for (int simulationRun = 0; simulationRun < properties
				.getNumberOfRuns(); simulationRun++) {
			LOG.info("Simulation run " + (simulationRun + 1) + "/"
					+ properties.getNumberOfRuns());

			IEventObserverContainer eOContainer = eOFactory
					.getEventObserverContainer();
			IEventContainer eventContainer = eventContainerFactory
					.getEventContainer();
			ISimulationState state = simulationStateFactory
					.getSimulationState();
			IConditionalEventContainer ceContainer = cecFactory
					.getConditionalEventContainer();

			// events that run longer than one cycle
			List<IEvent> activities = new ArrayList<IEvent>();

			recorder.startRun(state, simulationRun);

			boolean iCs = true;

			while (state.getTime() <= properties.getEndTime()) {
				recorder.record(state);
				// first execute already running events
				activities = runActivities(activities, state);

				// execute all events that are due on this time
				while (eventContainer.getNextEventTime() == state.getTime()) {
					IEvent event = eventContainer.getNextEvent();
					if (event.execute(state)) {
						activities.add(event);

						List<IEventObserver> tmp = eOContainer.get(event
								.getName());
						if (tmp != null) {
							for (IEventObserver observer : tmp) {
								eventContainer.addEvent(observer
										.schedules(state));
							}
						}
					}
				}

				// schedule conditional events at the end of each time
				eventContainer.addEvents(ceContainer.getEvents(state));

				/*
				 * // schedule conditional events only at the end of each month
				 * if (state.getTime() != eventContainer.getNextEventTime()) {
				 * if (iCs) {
				 * eventContainer.addEvents(ceContainer.getEvents(state)); iCs =
				 * false; continue; } recorder.record(state); iCs = true; }
				 * IEvent event = eventContainer.getNextEvent();
				 * state.setTime(event.getScheduleTime()); if
				 * (event.execute(state)) { activities.add(event); }
				 * List<IEventObserver> tmp = eOContainer.get(event.getName());
				 * if (tmp != null) { for (IEventObserver observer : tmp) {
				 * eventContainer.addEvent(observer.schedules(state)); } }
				 */
				
				// not completely optimal
				state.setTime(state.getTime() + 1);
			}
			recorder.stopRun(state, simulationRun);
		}
		recorder.stopSimulation(properties);
	}

	private List<IEvent> runActivities(List<IEvent> activities,
			ISimulationState state) {
		List<IEvent> tempActivities = new ArrayList<IEvent>();
		for (IEvent event : activities) {
			if (event.execute(state)) {
				tempActivities.add(event);
			}
		}
		return tempActivities;
	}
}
