package eu.scape_project.pw.simulator.engine.recorder;

public class MaxOperation implements IOperation {

	private double max;

	private String currentMax;

	private boolean first = true;

	@Override
	public String getOperationName() {
		return "MAX";
	}

	@Override
	public void addListOfRecord(String line) {
		String[] recs = line.split(" ");
		Double last = Double.parseDouble(recs[recs.length - 1].split("-")[1]);
		if (first) {
			max = last;
			currentMax = line;
			first = false;
		} else {
			if (last > max) {
				max = last;
				currentMax = line;
			}
		}
	}

	@Override
	public String getResult() {
		first = true;
		return currentMax;
	}

}
