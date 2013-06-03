package eu.scape_project;

import java.util.List;

public abstract class Event implements IEvent{

	protected long scheduleTime;
	
	
	
	public void execute(EventProcessor eP) {
		
		eP.getEventContainer().addEvents(scheduleNextEvents());
		
		executeEvent();
		
	}
	
	
	
	
	public long getScheduleTime() {
		return scheduleTime;
	}
	
	public int compareTo(IEvent e){
		
		if (this.scheduleTime < e.getScheduleTime()){
			return -1;
		}
		if (this.scheduleTime == e.getScheduleTime()){
			return 0;
		}
		return 1;
		
	}
	
	protected abstract List<IEvent> scheduleNextEvents();
	
	protected abstract void executeEvent();
	
}
