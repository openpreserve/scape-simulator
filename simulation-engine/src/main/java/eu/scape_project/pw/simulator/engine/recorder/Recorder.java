package eu.scape_project.pw.simulator.engine.recorder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import eu.scape_project.ISimulationProperties;
import eu.scape_project.pw.simulator.engine.state.ISimulationState;

public class Recorder implements IRecorder {

	private Map<String, List<Record>> records;

	private ISimulationProperties properties;

	private int currentRun;

	public Recorder() {
		records = new HashMap<String, List<Record>>();
	}

	public void record(ISimulationState state) {
		Iterator it = state.getIterator();

		while (it.hasNext()) {
			Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it
					.next();
			String name = entry.getKey();
			String value = entry.getValue().toString();
			if (records.containsKey(name)) {
				addRecordToExistingName(name, value, state.getTime());
			} else {
				addRecordToNewName(name, value, state.getTime());
			}
		}
	}

	@Override
	public void startSimulation(ISimulationProperties properties) {
		this.properties = properties;
		File out = new File("output");
		if (!out.exists()) {
			out.mkdir();
		}
		File main = new File("output/" + properties.getName());
		if (main.exists()) {
			File[] files = main.listFiles();
			for (File f : files) {
				f.delete();
			}
		} else {
			main.mkdir();
		}

	}

	@Override
	public void startRun(ISimulationState state, int run) {
		currentRun = run;
		record(state);
	}

	@Override
	public void stopRun(ISimulationState state, int run) {
		dump();
	}

	@Override
	public void stopSimulation(ISimulationProperties properties) {
		File main = new File("output/" + properties.getName());
		File[] files = main.listFiles();
		for (File f : files) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(f));
				String line;
				br.readLine();
				String scale = br.readLine();
				if (scale.endsWith("NUMERIC")) {
					IOperation average = new AvgOperation();
					IOperation max = new MaxOperation();
					IOperation min = new MinOperation();
					while ((line = br.readLine()) != null) {
						String[] str = line.split(": ");
						average.addListOfRecord(str[1]);
						max.addListOfRecord(str[1]);
						min.addListOfRecord(str[1]);
					}
					br.close();
					PrintWriter writer = new PrintWriter(
							new FileWriter(f, true));
					writer.write(average.getOperationName() + ": "
							+ average.getResult()
							+ System.getProperty("line.separator"));
					writer.write(max.getOperationName() + ": "
							+ max.getResult()
							+ System.getProperty("line.separator"));
					writer.write(min.getOperationName() + ": "
							+ min.getResult()
							+ System.getProperty("line.separator"));
					writer.close();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void dump() {
		for (Map.Entry<String, List<Record>> entry : records.entrySet()) {

			dumpToFile(entry.getKey(), entry.getValue());

		}
		records.clear();
	}

	private void addRecordToExistingName(String name, String value, long time) {
		Record tmp = new Record(value, time);
		records.get(name).add(tmp);
	}

	private void addRecordToNewName(String name, String value, long time) {
		List<Record> tmp = new ArrayList<Record>();
		records.put(name, tmp);
		addRecordToExistingName(name, value, time);
	}

	private void dumpToFile(String key, List<Record> values) {

		try {
			File f = new File("output/" + properties.getName() + "/" + key
					+ ".txt");
			PrintWriter writer = null;
			if (!f.exists()) {
				writer = new PrintWriter(new FileWriter(f));
				writer.write("Name:" + key
						+ System.getProperty("line.separator"));
				writer.write("Scale:" + determineScale(values)
						+ System.getProperty("line.separator"));
			} else {
				writer = new PrintWriter(new FileWriter(f, true));
			}

			int i = 0;
			writer.write(currentRun + ": ");
			while (i < values.size()) {
				String current = values.get(i).getValue();
				if (i < values.size() - 1) {
					for (long j = values.get(i).getTime(); j < values
							.get(i + 1).getTime(); j++) {
						writer.write(j + "-" + current + " ");
					}
				} else {
					writer.write(values.get(i).getTime() + "-" + current + " ");
				}
				i++;
			}
			writer.write(System.getProperty("line.separator"));
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private String determineScale(List<Record> values) {
		String value = values.get(0).getValue();
		if (value.matches("-?\\d+(\\.\\d+)?")) {
			return "NUMERIC";
		}
		return "ORDINAL";
	}
}
