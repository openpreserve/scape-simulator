package eu.scape_project.pw.ui.graph.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

import eu.scape_project.pw.ui.graph.model.Measure;

public class FileReader {

	private List<Measure> measures;
	
	public FileReader() {
	}
	
	public List<Measure> getMeasures() {
		return measures;
	}
	public void readFile(IFile file) {
		measures = new ArrayList<Measure>();
		try {
			InputStream is = file.getContents();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			//read first three lines
			String[] l = reader.readLine().split(":");
			String name = l[1];
			l = reader.readLine().split(":");
			String scale = l[1];
			l = reader.readLine().split(":");
			String type = l[1];
			String line;
			while ((line=reader.readLine())!=null) {
				String[] spl = line.split(":");
				if (!spl[0].matches("\\d+")){
					measures.add(new Measure(name, spl[0], scale, type, file));
				}
			}
			reader.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String loadData(Measure measure) {
		IFile file = measure.getFile();
		InputStream is;
		try {
			is = file.getContents();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			//read first three lines
			reader.readLine();
			reader.readLine();
			reader.readLine();
			String line; 
			while ((line=reader.readLine())!=null) {
				String[] spl = line.split(": ");
				if (spl[0].compareTo(measure.getOperation())==0){
					reader.close();
					return spl[1];
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
