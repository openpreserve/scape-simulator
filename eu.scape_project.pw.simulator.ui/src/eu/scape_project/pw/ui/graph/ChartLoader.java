package eu.scape_project.pw.ui.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class ChartLoader {

	private Chart chart = null;

	private String s = null; 
	List<Record> records = null;
	
	public ChartLoader() {
	}

	public void load(String name) {

		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("Simulation").getFolder("output").getFile(name);
		
		try {
			InputStream is = file.getContents();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			s = reader.readLine();
			createRecords(s);
			createChart();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Chart getChart() {
		return chart;
	}
	
	private void createChart() {
		chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
		
//		chart.getPlot().setBackground(ColorDefinitionImpl.ORANGE());
//        chart.getPlot().getClientArea().setBackground(ColorDefinitionImpl
//                .YELLOW());
//
//        // 3. Create legend
//        chart.getLegend().setItemType(LegendItemType.CATEGORIES_LITERAL);
//        chart.getLegend().setVisible(true);
//
//        // 4. Set title
//        chart.getTitle().getLabel().getCaption().setValue("Chart");
//        chart.getTitle().getLabel().getCaption().getFont().setSize(14);
//        chart.getTitle().getLabel().getCaption().getFont().setName("test");
        
		Axis xAxis = ((ChartWithAxes) chart).getPrimaryBaseAxes()[0];
		Axis yAxis = ((ChartWithAxes) chart).getPrimaryOrthogonalAxis(xAxis);
		
		NumberDataSet xValues = NumberDataSetImpl.create(getDates());
		
		Series seCategory = SeriesImpl.create();
        seCategory.setDataSet(xValues);
        
        SeriesDefinition sdX = SeriesDefinitionImpl.create();
        sdX.getSeriesPalette().shift(1);

        xAxis.getSeriesDefinitions().add(sdX);
        sdX.getSeries().add(seCategory);
        
        NumberDataSet yValues = NumberDataSetImpl.create(getValues());
        LineSeries series = (LineSeries) LineSeriesImpl.create();
        series.setDataSet(yValues);
        
        SeriesDefinition sdY = SeriesDefinitionImpl.create();
        yAxis.getSeriesDefinitions().add(sdY);
        sdY.getSeries().add(series);
        
	}
	
	
	private void createRecords(String s) {
	
		List<Record> tmp = new ArrayList<Record>();
		String[] rec = s.split(" ");
		for (String record:rec) {
			String[] parts = record.split("-");
			Record tmpRecord = new Record(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
			tmp.add(tmpRecord);
		}
		
		records = tmp;
		
	}
	
	private double[] getDates() {
		double[] dates = new double[records.size()];
		for (int i=0; i<records.size(); i++) {
			dates[i]= records.get(i).getDate();
			System.out.println("dates: " + dates[i]);
		}
		return dates;
	}
	
	private double[] getValues() {
		double[] values = new double[records.size()];
		for (int i=0; i<records.size(); i++) {
			values[i]= records.get(i).getValue();
			System.out.println("values: " + values[i]);
		}
		return values;
	}
}
