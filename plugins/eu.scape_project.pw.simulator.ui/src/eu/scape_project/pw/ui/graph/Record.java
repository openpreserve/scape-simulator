package eu.scape_project.pw.ui.graph;

public class Record {

	private double date;
	
	private double value;
	
	public Record() {}
	
	public Record(double date, double value){
		this.date=date;
		this.value=value;
	}
	
	public double getDate() {
		return date;
	}
	
	public double getValue() {
		return value;
	}
	
}
