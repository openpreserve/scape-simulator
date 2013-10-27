package eu.scape_project.pw.simulator.engine.recorder;

public class Record {

	private long time;
	
	private String value;

	public Record() {}
	
	public Record(String value, long time) {
		this.value = value;
		this.time = time;
	}
	
	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
