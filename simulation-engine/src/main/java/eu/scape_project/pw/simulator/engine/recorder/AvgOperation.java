package eu.scape_project.pw.simulator.engine.recorder;

public class AvgOperation implements IOperation {

	private double[] avgs = null;

	private int counter = 0;

	private boolean first = true;

	@Override
	public String getOperationName() {
		return "AVG";
	}

	@Override
	public void addListOfRecord(String line) {
		String[] recs = line.split(" ");
		if (avgs == null) {
			avgs = new double[recs.length];
		}
		counter++;
		for (int i = 0; i < recs.length; i++) {
			String[] s = recs[i].split("-");
			if (first) {
				avgs[i] = Double.parseDouble(s[1]);
			} else {
				avgs[i] += Double.parseDouble(s[1]);
			}
		}
		first = false;

	}

	@Override
	public String getResult() {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<avgs.length; i++) {
			double avg = avgs[i]/counter;
			sb.append(i + "-" + avg + " ");
		}
		counter = 0;
		first = true;
		return sb.toString();
	}

}
