package eu.scape_project.pw.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import eu.scape_project.pw.simulator.Collection;
import eu.scape_project.pw.simulator.ConditionalScheduling;
import eu.scape_project.pw.simulator.Entity;
import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.EventScheduling;
import eu.scape_project.pw.simulator.KeyValue;
import eu.scape_project.pw.simulator.Scheduling;
import eu.scape_project.pw.simulator.Simulation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class InitializatorGenerator {
  private Resource res;
  
  public void generateInitializator(final Resource resource, final IFileSystemAccess fsa) {
    this.res = resource;
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
    _builder.append("eOContainer = new EventObserverContainer();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("state = new SimulationState();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("generateSimulationState();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("generateEventContainer();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("generateEventObserverContainer();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
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
    _builder.append("private void generateSimulationState() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _generateSimulationState = this.generateSimulationState();
    _builder.append(_generateSimulationState, "			");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t   ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private void generateEventContainer() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _generateEventContainer = this.generateEventContainer();
    _builder.append(_generateEventContainer, "			");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private void generateEventObserverContainer() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _generateEventObserverContainer = this.generateEventObserverContainer();
    _builder.append(_generateEventObserverContainer, "			");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateSimulationState() {
    StringConcatenation _builder = new StringConcatenation();
    String temp = _builder.toString();
    TreeIterator<EObject> _allContents = this.res.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Simulation> _filter = Iterables.<Simulation>filter(_iterable, Simulation.class);
    for (final Simulation e : _filter) {
      EList<Entity> _entities = e.getEntities();
      Iterable<Collection> _filter_1 = Iterables.<Collection>filter(_entities, Collection.class);
      for (final Collection ent : _filter_1) {
        String _passEntity = this.passEntity(ent, "");
        String _plus = (temp + _passEntity);
        temp = _plus;
      }
    }
    return temp;
  }
  
  public String passEntity(final Collection col, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    String temp = _builder.toString();
    String tempName = "";
    boolean _equals = Objects.equal(name, "");
    if (_equals) {
      String _name = col.getName();
      tempName = _name;
    } else {
      String _plus = (name + ".");
      String _name_1 = col.getName();
      String _plus_1 = (_plus + _name_1);
      tempName = _plus_1;
    }
    EList<KeyValue> _keyValues = col.getKeyValues();
    for (final KeyValue k : _keyValues) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("state.addStateVariable(\"");
      String _plus_2 = (tempName + ".");
      String _key = k.getKey();
      String _plus_3 = (_plus_2 + _key);
      _builder_1.append(_plus_3, "");
      _builder_1.append("\" , ");
      int _value = k.getValue();
      _builder_1.append(_value, "");
      _builder_1.append(");");
      _builder_1.newLineIfNotEmpty();
      String _plus_4 = (temp + _builder_1);
      temp = _plus_4;
    }
    EList<Collection> _subCollections = col.getSubCollections();
    boolean _equals_1 = Objects.equal(_subCollections, null);
    if (_equals_1) {
      return temp;
    } else {
      EList<Collection> _subCollections_1 = col.getSubCollections();
      for (final Collection s : _subCollections_1) {
        Object _passEntity = this.passEntity(s, tempName);
        String _plus_5 = (temp + _passEntity);
        temp = _plus_5;
      }
      return temp;
    }
  }
  
  public String generateEventContainer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int current = 0; ");
    _builder.newLine();
    String temp = _builder.toString();
    TreeIterator<EObject> _allContents = this.res.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Simulation> _filter = Iterables.<Simulation>filter(_iterable, Simulation.class);
    for (final Simulation e : _filter) {
      EList<Scheduling> _scheduling = e.getScheduling();
      Iterable<EventScheduling> _filter_1 = Iterables.<EventScheduling>filter(_scheduling, EventScheduling.class);
      for (final EventScheduling sch : _filter_1) {
        String _generateEventSchedules = this.generateEventSchedules(sch);
        String _plus = (temp + _generateEventSchedules);
        temp = _plus;
      }
    }
    return temp;
  }
  
  public String generateEventSchedules(final EventScheduling es) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// scheduling ");
    Event _schedule = es.getSchedule();
    String _name = _schedule.getName();
    _builder.append(_name, "");
    _builder.append(" event");
    _builder.newLineIfNotEmpty();
    _builder.append("current = ");
    int _start = es.getStart();
    _builder.append(_start, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("while (current <= ");
    int _end = es.getEnd();
    _builder.append(_end, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("IEvent tmp = new ");
    Event _schedule_1 = es.getSchedule();
    String _name_1 = _schedule_1.getName();
    _builder.append(_name_1, "	");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("tmp.setScheduleTime(current);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("eventContainer.addEvent(tmp);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("current = current + ");
    int _every = es.getEvery();
    _builder.append(_every, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("} ");
    _builder.newLine();
    String temp = _builder.toString();
    return temp;
  }
  
  public String generateEventObserverContainer() {
    StringConcatenation _builder = new StringConcatenation();
    String temp = _builder.toString();
    TreeIterator<EObject> _allContents = this.res.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Simulation> _filter = Iterables.<Simulation>filter(_iterable, Simulation.class);
    for (final Simulation e : _filter) {
      EList<Scheduling> _scheduling = e.getScheduling();
      Iterable<ConditionalScheduling> _filter_1 = Iterables.<ConditionalScheduling>filter(_scheduling, ConditionalScheduling.class);
      for (final ConditionalScheduling sch : _filter_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("eOContainer.addEventObserver(new ");
        Event _observes = sch.getObserves();
        String _name = _observes.getName();
        _builder_1.append(_name, "");
        _builder_1.append("2");
        Event _schedule = sch.getSchedule();
        String _name_1 = _schedule.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append("());");
        _builder_1.newLineIfNotEmpty();
        String _plus = (temp + _builder_1);
        temp = _plus;
      }
    }
    return temp;
  }
}
