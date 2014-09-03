package eu.scape_project.pw.ui.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

import eu.scape_project.pw.ui.graph.model.Measure;
import eu.scape_project.pw.ui.graph.utils.FileReader;

public class ChartLoader {

	private Chart chart = null;

	private String scale = null;

	private String currentType = null;

	private Map<Measure, List<Record>> measures;

	private double[] emptyValues = {0, 1, 2, 3, 4, 5, 6, 7};
	
	public ChartLoader() {
		measures = new HashMap<Measure, List<Record>>();
		createChart();
	}

	public boolean addRemoveMeasure(Measure measure) {

		if (measures.containsKey(measure)) {
			measures.remove(measure);
			if (measures.size()==0) {
				currentType = null;
			}
			createChart();
			System.out.println("Measure removed" + measure.getName() + " " + measure.getOperation() + " "+ measures.size());
			return true;
		}

		if (currentType == null) {
			currentType = measure.getType();
		} else {
			if (currentType.compareTo(measure.getType()) != 0) {
				System.out.println("Cannot add measure");
				return false;
			}
		}

		FileReader fileReader = new FileReader();
		String s = fileReader.loadData(measure);
		System.out.println("String is "+s);
		List<Record> t = createRecords(s);

		if (s != null) {
			measures.put(measure, t);
			System.out.println("Measure added" + measure.getName() + " " + measure.getOperation() + " " +measures.size());
			createChart();
			return true;
		}

		return false;
	}

	public Chart getChart() {
		return chart;
	}

	private void createChart() {
		chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);

		// chart.getPlot().setBackground(ColorDefinitionImpl.ORANGE());
		// chart.getPlot().getClientArea().setBackground(ColorDefinitionImpl
		// .YELLOW());
		//
		//3. Create legend
		 chart.getLegend().setItemType(LegendItemType.SERIES_LITERAL);
		 chart.getLegend().setVisible(true);
		 chart.getLegend().getText().getFont().setSize(10);
		 
		//
		// // 4. Set title
		chart.getTitle().getLabel().getCaption().setValue("Chart");
		//chart.getTitle().getLabel().getCaption().getFont().setSize(14);
		//chart.getTitle().getLabel().getCaption().getFont().setName("test");

		Axis xAxis = ((ChartWithAxes) chart).getPrimaryBaseAxes()[0];
		Axis yAxis = ((ChartWithAxes) chart).getPrimaryOrthogonalAxis(xAxis);

		if (measures.isEmpty()) {
			
			NumberDataSet xValues = NumberDataSetImpl.create(emptyValues);
			Series seCategory = SeriesImpl.create();
			seCategory.setDataSet(xValues);

			SeriesDefinition sdX = SeriesDefinitionImpl.create();
			sdX.getSeriesPalette().shift(1);

			xAxis.getSeriesDefinitions().add(sdX);
			sdX.getSeries().add(seCategory);
			
			NumberDataSet yValues = NumberDataSetImpl.create(emptyValues);
			LineSeries series = (LineSeries) LineSeriesImpl.create();
			series.setDataSet(yValues);
			series.getMarkers().get(0).setVisible(false);
			series.setVisible(false);
		
			//series.getLineAttributes().setColor(ColorDefinitionImpl.WHITE());
			SeriesDefinition sdY = SeriesDefinitionImpl.create();
			yAxis.getSeriesDefinitions().add(sdY);
			sdY.getSeries().add(series);
			chart.getLegend().setVisible(false);
			return;
		}

		NumberDataSet xValues = null;
		for (Map.Entry<Measure, List<Record>> entry : measures.entrySet()) {

			if (xValues == null) {
				xValues = NumberDataSetImpl.create(getDates(entry.getValue()));
				Series seCategory = SeriesImpl.create();
				seCategory.setDataSet(xValues);

				SeriesDefinition sdX = SeriesDefinitionImpl.create();
				sdX.getSeriesPalette().shift(1);

				xAxis.getSeriesDefinitions().add(sdX);
				sdX.getSeries().add(seCategory);
			}

			NumberDataSet yValues = NumberDataSetImpl.create(getValues(entry
					.getValue()));
			LineSeries series = (LineSeries) LineSeriesImpl.create();
			series.setDataSet(yValues);
			series.setSeriesIdentifier(entry.getKey().getName() + ":" + entry.getKey().getOperation());
			series.getMarkers().get(0).setVisible(false);
			SeriesDefinition sdY = SeriesDefinitionImpl.create();
			yAxis.getSeriesDefinitions().add(sdY);
			sdY.getSeries().add(series);
		}

	}

	private List<Record> createRecords(String s) {

		List<Record> tmp = new ArrayList<Record>();
		String[] rec = s.split(" ");
		System.out.println(rec);
		for (String record : rec) {
			String[] parts = record.split("-");
			Record tmpRecord = new Record(Double.parseDouble(parts[0]),
					Double.parseDouble(parts[1]));
			tmp.add(tmpRecord);
		}

		return tmp;

	}

	private double[] getDates(List<Record> records) {
		double[] dates = new double[records.size()];

		for (int i = 0; i < records.size(); i++) {
			dates[i] = records.get(i).getDate();
			// System.out.println("dates: " + dates[i]);
		}

		return dates;
	}

	private double[] getValues(List<Record> records) {
		double[] values = new double[records.size()];

		for (int i = 0; i < records.size(); i++) {
			values[i] = records.get(i).getValue();
			// System.out.println("values: " + values[i]);
		}

		return values;
	}
}
