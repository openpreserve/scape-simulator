package eu.scape_project.pw.ui.graph.components;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import eu.scape_project.pw.ui.graph.model.INode;
import eu.scape_project.pw.ui.graph.model.MeasureTree;

public class MeasureContentProvider implements ITreeContentProvider {

	private MeasureTree tree;
	
	public void dispose() {

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		tree = (MeasureTree) newInput;
	}

	public Object[] getElements(Object inputElement) {
		return tree.getRoots();
	}

	public Object[] getChildren(Object parentElement) {
		INode node = (INode) parentElement;
		return node.getChildren();
	}

	public Object getParent(Object element) {
		INode node = (INode) element;
		return node.getParent();
	}

	public boolean hasChildren(Object element) {
		INode node = (INode) element;
		return node.hasChildren();
	}

}
