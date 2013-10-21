package eu.scape_project.pw.ui.graph;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class GraphComposite extends Composite {

	private Combo dropDown;

	private Label label;
	
	private ChartCanvas chartCanvas;
	
	private ChartLoader cLoader ;

	public GraphComposite(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new GridLayout());
		cLoader = new ChartLoader();
		dropDown = new Combo(this, SWT.DROP_DOWN);
		fillDropDown();
		label = new Label(this, 0);
		label.setText("Hello World");
		chartCanvas = new ChartCanvas(this,SWT.NONE);
		chartCanvas.setLayoutData(new GridData(600,400));
		//chartCanvas.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_CYAN));
		dropDown.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				label.setText(dropDown.getItem(dropDown.getSelectionIndex()));
				cLoader.load(dropDown.getItem(dropDown.getSelectionIndex()));
				chartCanvas.setChart(cLoader.getChart());
				chartCanvas.redraw();
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