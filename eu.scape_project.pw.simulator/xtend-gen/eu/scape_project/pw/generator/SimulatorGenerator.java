/**
 * generated by Xtext
 */
package eu.scape_project.pw.generator;

import com.google.common.collect.Iterables;
import eu.scape_project.pw.simulator.ConditionalScheduling;
import eu.scape_project.pw.simulator.Entity;
import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.EventScheduling;
import eu.scape_project.pw.simulator.Scheduling;
import eu.scape_project.pw.simulator.Simulation;
import org.eclipse.emf.common.util.EList;
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
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<Event> _filter_1 = Iterables.<Event>filter(_iterable_1, Event.class);
    for (final Event e_1 : _filter_1) {
      String _name_1 = e_1.getName();
      String _plus_2 = ("/simulator/" + _name_1);
      String _plus_3 = (_plus_2 + ".java");
      CharSequence _compileEvent = this.compileEvent(e_1);
      fsa.generateFile(_plus_3, _compileEvent);
    }
    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
    Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
    Iterable<ConditionalScheduling> _filter_2 = Iterables.<ConditionalScheduling>filter(_iterable_2, ConditionalScheduling.class);
    for (final ConditionalScheduling e_2 : _filter_2) {
      Event _observes = e_2.getObserves();
      String _name_2 = _observes.getName();
      String _plus_4 = ("/simulator/" + _name_2);
      String _plus_5 = (_plus_4 + "2");
      Event _schedule = e_2.getSchedule();
      String _name_3 = _schedule.getName();
      String _plus_6 = (_plus_5 + _name_3);
      String _plus_7 = (_plus_6 + ".java");
      CharSequence _compileConditionalScheduling = this.compileConditionalScheduling(e_2);
      fsa.generateFile(_plus_7, _compileConditionalScheduling);
    }
    TreeIterator<EObject> _allContents_3 = resource.getAllContents();
    Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_allContents_3);
    Iterable<Entity> _filter_3 = Iterables.<Entity>filter(_iterable_3, Entity.class);
    for (final Entity e_3 : _filter_3) {
      String _name_4 = e_3.getName();
      String _plus_8 = ("/simulator/" + _name_4);
      String _plus_9 = (_plus_8 + ".java");
      CharSequence _compileEntity = this.compileEntity(e_3);
      fsa.generateFile(_plus_9, _compileEntity);
    }
  }
  
  public CharSequence compile(final Simulation s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("package simulator;");
    _builder.newLine();
    _builder.append("import eu.scape_project.*;");
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
    _builder.append("EventContainer container = new EventContainer();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("EventProcessor processor = new EventProcessor();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int tmp;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int start;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IEventObserver tmpEvent;\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    {
      EList<Scheduling> _scheduling = s.getScheduling();
      Iterable<EventScheduling> _filter = Iterables.<EventScheduling>filter(_scheduling, EventScheduling.class);
      for(final EventScheduling sch : _filter) {
        _builder.append(" ");
        CharSequence _compileEventSchedulingMain = this.compileEventSchedulingMain(sch);
        _builder.append(_compileEventSchedulingMain, "		");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<Scheduling> _scheduling_1 = s.getScheduling();
      Iterable<ConditionalScheduling> _filter_1 = Iterables.<ConditionalScheduling>filter(_scheduling_1, ConditionalScheduling.class);
      for(final ConditionalScheduling sch_1 : _filter_1) {
        _builder.append(" ");
        CharSequence _compileConditionalEventSchedulingMain = this.compileConditionalEventSchedulingMain(sch_1);
        _builder.append(_compileConditionalEventSchedulingMain, "		");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("processor.initialize(container);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("processor.startSimulation(); \t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEventSchedulingMain(final EventScheduling e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tmp = ");
    int _repeat = e.getRepeat();
    _builder.append(_repeat, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("start = ");
    int _start = e.getStart();
    _builder.append(_start, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("while (tmp>0) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("IEvent event = new ");
    Event _schedule = e.getSchedule();
    String _name = _schedule.getName();
    _builder.append(_name, "	");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("event.setScheduleTime(start);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("container.addEvent(event);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("start += ");
    int _every = e.getEvery();
    _builder.append(_every, "	");
    _builder.append("; ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("tmp-=1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileConditionalEventSchedulingMain(final ConditionalScheduling e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tmpEvent = new ");
    Event _observes = e.getObserves();
    String _name = _observes.getName();
    _builder.append(_name, "");
    _builder.append("2");
    Event _schedule = e.getSchedule();
    String _name_1 = _schedule.getName();
    _builder.append(_name_1, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("processor.addEventObserver(tmpEvent);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEvent(final Event e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("package simulator;");
    _builder.newLine();
    _builder.append("import eu.scape_project.*;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" extends Event{ ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t \t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "	");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("name = \"");
    String _name_2 = e.getName();
    _builder.append(_name_2, "		");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void execute(SimulationState state) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Hello from event ");
    String _name_3 = e.getName();
    _builder.append(_name_3, "		");
    _builder.append(" at time \" + state.getTime() + \"I am referencing  ");
    Entity _entity = e.getEntity();
    String _name_4 = _entity.getName();
    _builder.append(_name_4, "		");
    _builder.append(" \" ); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEntity(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("package simulator;");
    _builder.newLine();
    _builder.append("import eu.scape_project.*;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" extends Entity {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "	");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("name = \"");
    String _name_2 = e.getName();
    _builder.append(_name_2, "		");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileConditionalScheduling(final ConditionalScheduling e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("package simulator;");
    _builder.newLine();
    _builder.append("import eu.scape_project.*;");
    _builder.newLine();
    _builder.append("public class ");
    Event _observes = e.getObserves();
    String _name = _observes.getName();
    _builder.append(_name, "");
    _builder.append("2");
    Event _schedule = e.getSchedule();
    String _name_1 = _schedule.getName();
    _builder.append(_name_1, "");
    _builder.append(" extends EventObserver {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    Event _observes_1 = e.getObserves();
    String _name_2 = _observes_1.getName();
    _builder.append(_name_2, "	");
    _builder.append("2");
    Event _schedule_1 = e.getSchedule();
    String _name_3 = _schedule_1.getName();
    _builder.append(_name_3, "	");
    _builder.append(" () {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("observedEvent = \"");
    Event _observes_2 = e.getObserves();
    String _name_4 = _observes_2.getName();
    _builder.append(_name_4, "		");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public IEvent schedules(SimulationState state) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("long currentTime = state.getTime();");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("IEvent tmp = new ");
    Event _schedule_2 = e.getSchedule();
    String _name_5 = _schedule_2.getName();
    _builder.append(_name_5, "	 ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("tmp.setScheduleTime(currentTime + ");
    int _delay = e.getDelay();
    _builder.append(_delay, "	 ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("return tmp;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
}
