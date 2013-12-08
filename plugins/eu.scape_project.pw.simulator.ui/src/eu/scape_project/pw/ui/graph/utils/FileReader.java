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
		measures = new ArrayList<Measure>();
	}
	
	public List<Measure> getMeasures() {
		return measures;
	}
	public void readFile(IFile file) {
		try {
			InputStream is = file.getContents();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			//read first two lines
			reader.readLine();
			reader.readLine();
			String line; 
			while ((line=reader.readLine())!=null) {
				String[] spl = line.split(":");
				if (!spl[0].matches("\\d+")){
					measures.add(new Measure(spl[0]));
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
}
