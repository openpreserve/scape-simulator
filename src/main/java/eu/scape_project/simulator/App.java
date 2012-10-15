package eu.scape_project.simulator;

import java.util.List;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.WeibullDistributionImpl;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import eu.scape_project.simulator.core.EventProcesor;
import eu.scape_project.simulator.core.Network;
import eu.scape_project.simulator.core.Observer;
import eu.scape_project.simulator.model.Format;



public class App  {
	
    public static void main( String[] args ) {
        System.out.println("Starting simulation");
        
        EventProcesor eProcesor = new EventProcesor();
        Network network = new Network(eProcesor);
        Observer observer = new Observer();
        eProcesor.setNetwork(network);
        eProcesor.setObserver(observer);
        Format format = new Format();
		format.setEventProcessor(eProcesor);
		format.setBirth(0);
		format.init();
		network.addNode(format);
		observer.setCurrentFormat(format);
        network.init();
        
        eProcesor.simulate();
        
        
        TimeSeries s1 = new TimeSeries("Number of Formats");
        TimeSeries s2 = new TimeSeries("Number of Active Formats");
        TimeSeries s3 = new TimeSeries("Number of Tools Supporting Current Format");
        List<Integer> numbOfFormats = observer.getNumbOfFormats();
        List<Integer> numbOfActiveFormats = observer.getNumbOfActiveFormats();
        List<Integer> numbOfTools = observer.getNumbOfTools();
        for (int i=0; i<numbOfFormats.size(); i++) {
        	int month = (i+1)%12+1;
        	int year = (i+1)/12+2013;
        	//System.out.println(month+" "+year);
        	s1.add(new Month(month,year), numbOfFormats.get(i));
        	s2.add(new Month(month,year), numbOfActiveFormats.get(i));
        	s3.add(new Month(month,year), numbOfTools.get(i));
        }
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(s1);
        dataset.addSeries(s2);
        
        
        TimeSeriesCollection dataset2 = new TimeSeriesCollection();
        dataset2.addSeries(s3);
        
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Formats", 
                "Date",           
                "number of formats",   
                dataset, true, true, false);
        
        ChartFrame frame = new ChartFrame("Graph", chart);
        frame.pack();
        frame.setVisible(true);
        
        JFreeChart chart2 = ChartFactory.createTimeSeriesChart(
                "Formats", 	
                "Date",           
                "number of formats",   
                dataset2, true, true, false);
        ChartFrame frame2 = new ChartFrame("Graph", chart2);
        frame2.pack();
        frame2.setVisible(true);
        
        
        WeibullDistributionImpl w = new WeibullDistributionImpl(1.5, 1);
        
        for (int i=0; i<100; i++) {
        	try {
				System.out.println(w.sample());
			} catch (MathException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
