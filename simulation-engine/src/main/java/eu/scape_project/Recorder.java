package eu.scape_project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Recorder {

	private Map<String, List<Record>> records;

	public Recorder() {
		records = new HashMap<String, List<Record>>();
	}

	public void record(SimulationState state) {
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

	public void dump() {
		for (Map.Entry<String, List<Record>> entry : records.entrySet()) {
			System.out.print(entry.getKey() + ":");
			dumpToFile(entry.getKey(), entry.getValue());
			for (Record r : entry.getValue()) {
				System.out.print(" " + r.getTime() + "-" + r.getValue());
			}
			System.out.print("\n");
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
			PrintWriter writer = new PrintWriter(new FileWriter("output/"+key+".txt"));
			int i = 0;
			while (i<values.size()) {
				String current = values.get(i).getValue();
				if (i<values.size()-1) {
					for (long j=values.get(i).getTime(); j<values.get(i+1).getTime(); j++) {
						writer.write(j + "-" + current + " ");
					}
				}else {
					writer.write(values.get(i).getTime() + "-" + current + " ");
				}
				i++;
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
