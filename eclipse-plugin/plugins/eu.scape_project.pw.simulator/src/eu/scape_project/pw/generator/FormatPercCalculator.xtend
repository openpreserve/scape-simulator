package eu.scape_project.pw.generator

import eu.scape_project.pw.simulator.Format
import eu.scape_project.pw.simulator.Simulation
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource

class FormatPercCalculator {

	Map<String, List<Double>> formats;
	int startYear;
	int stopYear;

	def calculatePerc(Resource resource) {
		formats = new HashMap<String, List<Double>>();
		for (e : resource.allContents.toIterable.filter(typeof(Simulation))) {
			setYears(e);
		}
		for (e : resource.allContents.toIterable.filter(typeof(Format))) {
			calculateFormat(e);
		}
		return formats;
	}

	def setYears(Simulation s) {
		startYear = s.startYear;
		stopYear = s.stopYear;
	}

	def calculateFormat(Format f) {
		var name = "";
		var List<Double> sum = new ArrayList<Double>();
		var counter = 0;
		for (entry : f.entries) {
			name = f.name + '.' + entry.name;
			val p = Double.parseDouble(entry.p);
			val q = Double.parseDouble(entry.q);
			val m = Double.parseDouble(entry.m);
			val year = entry.year;
			var yt = 0.0;
			var st = 0.0;
			var List<Double> percs = new ArrayList<Double>();
			if (year <= stopYear) {
				for (int i : year .. stopYear) {
					st = p * m + (q - p) * yt - (q / m) * yt * yt;
					percs.add(st);
					yt = yt + st;
				}
				if (year < startYear) {
					percs = percs.subList(startYear - year, percs.length);
				}
				if (year > startYear) {
					var List<Double> zeroList = new ArrayList<Double>();
					for (int i : 0 .. year - startYear-1) {
						zeroList.add(i, 0.0);
					}
					percs.addAll(0, zeroList);
				}
				if (counter == 0) {
					sum.addAll(percs);
					counter = 1;
				}else {
					for (int i : 0 .. sum.length-1){
						sum.set(i, sum.get(i) + percs.get(i));
					}
				}
			}
			println(percs);
			formats.put(name,percs);	
		}
		for (entry : f.entries) {
			name = f.name + '.' + entry.name;
			var List<Double> value = formats.get(name)
			println("value=" + value)
			println("sum=" + sum)
			var List<Double> temp = new ArrayList<Double>()
			for (int i : 0 .. sum.length-1) {
				var k = value.get(i);
				var z = sum.get(i);
				var r = k/z;
				if (r < 0.0000001) {
					r = 0;
				}
				temp.add(r);
			} 
			println("temp=" + temp)
			formats.put(name,temp);
		}
	}
}
