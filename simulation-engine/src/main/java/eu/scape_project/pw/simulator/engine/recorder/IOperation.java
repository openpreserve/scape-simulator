package eu.scape_project.pw.simulator.engine.recorder;

public interface IOperation {

	String getOperationName();
	
	void addListOfRecord(String line);
	
	String getResult();
}
