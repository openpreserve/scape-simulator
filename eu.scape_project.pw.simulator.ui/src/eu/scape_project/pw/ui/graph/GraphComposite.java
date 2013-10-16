package eu.scape_project.pw.ui.graph;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class GraphComposite extends Composite {

	private Combo dropDown;
	
	private Label label;
	
	public GraphComposite(Composite parent, int style) {
		super(parent, style);
		label = new Label(this, 0);
		label.setText("Hello World");
		dropDown = new Combo(this,SWT.DROP_DOWN);
		dropDown.add("test");
		this.setLayout(new RowLayout());
	}


	

}
