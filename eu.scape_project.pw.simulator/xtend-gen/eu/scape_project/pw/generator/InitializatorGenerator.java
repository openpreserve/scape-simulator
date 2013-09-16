package eu.scape_project.pw.generator;

import com.google.common.collect.Iterables;
import eu.scape_project.pw.simulator.KeyValue;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class InitializatorGenerator {
  public void generateInitializator(final Resource resource, final IFileSystemAccess fsa) {
    String _generate = this.generate();
    fsa.generateFile("/simulator/Initializator.java", _generate);
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<KeyValue> _filter = Iterables.<KeyValue>filter(_iterable, KeyValue.class);
    for (final KeyValue e : _filter) {
    }
  }
  
  public String generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package simulator;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import eu.scape_project.*;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class Initializator {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private EventContainer eventContainer; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private EventObserverContainer eOContainer;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private SimulationState state;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Initializator() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("eventContainer = new EventContainer();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("eOContainer = new EventObserverConatiner();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("state = new SimulationState();");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public EventContainer getEventContainer(){return eventContainer;}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public EventObserverContainer getEOContainer() {return eOContainer;}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public SimulationState getSimulationState() { return state; } ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t   ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
