package eu.scape_project.pw.ui.graph;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class GraphView extends ViewPart {
    
	private GraphComposite gc;
	
	private Label label;
    
    public GraphView() {
    }
    
    public void createPartControl(Composite parent) {
    	
    	gc = new GraphComposite(parent,0);
    	
    }
    
    public void setFocus() {
    	 
    }
 }