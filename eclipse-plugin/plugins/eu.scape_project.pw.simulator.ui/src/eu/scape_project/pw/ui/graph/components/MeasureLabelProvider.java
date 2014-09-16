package eu.scape_project.pw.ui.graph.components;

import org.eclipse.jface.viewers.LabelProvider;

import eu.scape_project.pw.ui.graph.model.INode;

public class MeasureLabelProvider extends LabelProvider {

	public String getText(Object element) {
		INode node = (INode) element;
		return node.getLabel();
	}
	
}
