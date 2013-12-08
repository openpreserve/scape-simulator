package eu.scape_project.pw.ui.graph.components;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import eu.scape_project.pw.ui.graph.model.INode;
import eu.scape_project.pw.ui.graph.model.Measure;
import eu.scape_project.pw.ui.graph.model.MeasureContainer;
import eu.scape_project.pw.ui.graph.model.MeasureTree;
import eu.scape_project.pw.ui.graph.utils.FileReader;

public class MeasureTreeGenerator {

	private MeasureTree tree;

	public MeasureTreeGenerator() {

	}

	public MeasureTree getMeasureTree() {
		generateTree();
		return tree;
	}

	private void generateTree() {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		tree = new MeasureTree();

		for (IProject project : projects) {
			IFolder out = project.getFolder("output");
			if (out.exists()) {
				INode root = new MeasureContainer(project.getName(), null);
				try {
					for (IResource res : out.members()) {
					INode n = generate(res);
					root.addChildren(n);
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tree.addRoot(root);
			}
		}
	}

	private INode generate(IResource resource) {
		INode f = new MeasureContainer(resource.getName(),null);
		if (resource instanceof IFolder) {
			IFolder folder = (IFolder) resource;
			try {
				for (IResource r: folder.members()) {
					f.addChildren(generate(r));
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (resource instanceof IFile){
			IFile file = (IFile) resource;
			FileReader fileReader = new FileReader();
			fileReader.readFile(file);
			for (Measure m : fileReader.getMeasures()) {
				f.addChildren(m);
			}
		}
		return f;
	}
}
