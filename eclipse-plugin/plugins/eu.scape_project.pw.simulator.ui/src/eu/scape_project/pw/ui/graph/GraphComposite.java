package eu.scape_project.pw.ui.graph;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TreeItem;

import eu.scape_project.pw.ui.graph.components.MeasureContentProvider;
import eu.scape_project.pw.ui.graph.components.MeasureLabelProvider;
import eu.scape_project.pw.ui.graph.components.MeasureTreeGenerator;
import eu.scape_project.pw.ui.graph.model.INode;
import eu.scape_project.pw.ui.graph.model.Measure;

public class GraphComposite extends Composite {

	private Combo dropDown;

	private Label label;

	private ChartCanvas chartCanvas;

	private ChartLoader cLoader;

	private TreeViewer viewer;

	private MeasureTreeGenerator generator;

	public GraphComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		this.setLayout(gridLayout);
		cLoader = new ChartLoader();
		generator = new MeasureTreeGenerator();
		// dropDown = new Combo(this, SWT.DROP_DOWN);
		// fillDropDown();
		viewer = new TreeViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new MeasureContentProvider());
		viewer.setLabelProvider(new MeasureLabelProvider());
		viewer.setInput(generator.getMeasureTree());
		viewer.getTree().setLayoutData(new GridData(200, 500));
		chartCanvas = new ChartCanvas(this, SWT.NONE);
		chartCanvas.setLayoutData(new GridData(800, 500));
		chartCanvas.setChart(cLoader.getChart());
		Button button = new Button(this, SWT.PUSH);
		button.setText("Refresh");
		GridData gridDataButton = new GridData();
		gridDataButton.horizontalAlignment = GridData.FILL;
		GridData gridDataLabel = new GridData();
		gridDataLabel.horizontalAlignment = GridData.FILL;
		//gridData.horizontalSpan = 2;
		label = new Label(this, 0);
		label.setText("");
		label.setLayoutData(gridDataLabel);
		viewer.getTree().addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection s = (IStructuredSelection) viewer
						.getSelection();
				INode node = (INode) s.getFirstElement();
				
				if (node instanceof Measure) {
					TreeItem ti = (TreeItem) e.item;
					//ti.setBackground(0, Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));
					if (cLoader.addRemoveMeasure((Measure) node)) {
						chartCanvas.setChart(cLoader.getChart());
						chartCanvas.redraw();
						label.setText("");
					}else {
						label.setText("Measures don't match - unable to add measure to graph");
						label.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
					}
					layout();

				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
		
			}

		});
		button.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				System.out.println("CLCIK");
				cLoader.reset();
				chartCanvas.setChart(cLoader.getChart());
				chartCanvas.redraw();
				viewer.setInput(generator.getMeasureTree());
				layout();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		    });
	}

	private void fillDropDown() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("Simulation");
		IFolder output = project.getFolder("output");
		try {
			for (IResource s : output.members()) {
				dropDown.add(s.getName());
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
