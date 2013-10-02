package eu.scape_project.pw.ui.graph;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class GraphView extends ViewPart {
    Label label;
    public GraphView() {
    }
    public void createPartControl(Composite parent) {
       label = new Label(parent, SWT.WRAP);
       label.setText("Hello Simulator");
    }
    public void setFocus() {

    }
 }