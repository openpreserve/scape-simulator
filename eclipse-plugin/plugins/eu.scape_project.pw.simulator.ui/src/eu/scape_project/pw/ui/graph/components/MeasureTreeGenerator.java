package eu.scape_project.pw.ui.graph.components;

import org.eclipse.core.internal.resources.Folder;
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

			try {
				out.refreshLocal(Folder.DEPTH_INFINITE, null);
				if (out.exists()) {
					INode root = new MeasureContainer(project.getName(), null);
					for (IResource res : out.members()) {
						INode n = generate(res);
						root.addChildren(n);
					}
					tree.addRoot(root);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private INode generate(IResource resource) {
		INode f = null;
		String name = resource.getName();
		String fxt = resource.getFileExtension();
		if (resource instanceof IFolder) {
			f = new MeasureContainer(name, null);
			IFolder folder = (IFolder) resource;
			try {
				for (IResource r : folder.members()) {
					f.addChildren(generate(r));
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (resource instanceof IFile) {
			if (fxt.compareTo("sout") == 0) {
				String name2 = name.substring(0, name.indexOf('.'));
				f = new MeasureContainer(name2, null);
				IFile file = (IFile) resource;
				FileReader fileReader = new FileReader();
				fileReader.readFile(file);
				for (Measure m : fileReader.getMeasures()) {
					f.addChildren(m);
				}
			}
		}
		return f;
	}
}
