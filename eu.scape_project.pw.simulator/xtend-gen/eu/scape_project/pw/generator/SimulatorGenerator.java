package eu.scape_project.pw.generator;

import com.google.common.collect.Iterables;
import eu.scape_project.pw.simulator.Simulation;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SimulatorGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Simulation> _filter = Iterables.<Simulation>filter(_iterable, Simulation.class);
    for (final Simulation e : _filter) {
      String _name = e.getName();
      String _plus = ("/simulator/" + _name);
      String _plus_1 = (_plus + ".java");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus_1, _compile);
    }
  }
  
  public CharSequence compile(final Simulation s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("package simulator;");
    _builder.newLine();
    _builder.append("import eu.scape_project.App;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(" { ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("App test = new App(); ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("test.test(); \t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
