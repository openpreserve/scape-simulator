/**
 */
package eu.scape_project.pw.simulator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.scape_project.pw.simulator.SimulatorFactory
 * @model kind="package"
 * @generated
 */
public interface SimulatorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simulator";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.scape_project.eu/pw/Simulator";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simulator";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimulatorPackage eINSTANCE = eu.scape_project.pw.simulator.impl.SimulatorPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.SimulationImpl <em>Simulation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.SimulationImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getSimulation()
   * @generated
   */
  int SIMULATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__EVENTS = 1;

  /**
   * The feature id for the '<em><b>Scheduling</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__SCHEDULING = 2;

  /**
   * The number of structural features of the '<em>Simulation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.EventImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.SchedulingImpl <em>Scheduling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.SchedulingImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getScheduling()
   * @generated
   */
  int SCHEDULING = 2;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULING__SCHEDULE = 0;

  /**
   * The number of structural features of the '<em>Scheduling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.EventSchedulingImpl <em>Event Scheduling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.EventSchedulingImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEventScheduling()
   * @generated
   */
  int EVENT_SCHEDULING = 3;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING__SCHEDULE = SCHEDULING__SCHEDULE;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING__START = SCHEDULING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING__END = SCHEDULING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Repeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING__REPEAT = SCHEDULING_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Every</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING__EVERY = SCHEDULING_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Event Scheduling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING_FEATURE_COUNT = SCHEDULING_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl <em>Conditional Scheduling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getConditionalScheduling()
   * @generated
   */
  int CONDITIONAL_SCHEDULING = 4;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_SCHEDULING__SCHEDULE = SCHEDULING__SCHEDULE;

  /**
   * The feature id for the '<em><b>Observes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_SCHEDULING__OBSERVES = SCHEDULING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_SCHEDULING__DELAY = SCHEDULING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conditional Scheduling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_SCHEDULING_FEATURE_COUNT = SCHEDULING_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.Simulation <em>Simulation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simulation</em>'.
   * @see eu.scape_project.pw.simulator.Simulation
   * @generated
   */
  EClass getSimulation();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.Simulation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.scape_project.pw.simulator.Simulation#getName()
   * @see #getSimulation()
   * @generated
   */
  EAttribute getSimulation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.scape_project.pw.simulator.Simulation#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see eu.scape_project.pw.simulator.Simulation#getEvents()
   * @see #getSimulation()
   * @generated
   */
  EReference getSimulation_Events();

  /**
   * Returns the meta object for the containment reference list '{@link eu.scape_project.pw.simulator.Simulation#getScheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scheduling</em>'.
   * @see eu.scape_project.pw.simulator.Simulation#getScheduling()
   * @see #getSimulation()
   * @generated
   */
  EReference getSimulation_Scheduling();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see eu.scape_project.pw.simulator.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.scape_project.pw.simulator.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.Scheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheduling</em>'.
   * @see eu.scape_project.pw.simulator.Scheduling
   * @generated
   */
  EClass getScheduling();

  /**
   * Returns the meta object for the reference '{@link eu.scape_project.pw.simulator.Scheduling#getSchedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Schedule</em>'.
   * @see eu.scape_project.pw.simulator.Scheduling#getSchedule()
   * @see #getScheduling()
   * @generated
   */
  EReference getScheduling_Schedule();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.EventScheduling <em>Event Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Scheduling</em>'.
   * @see eu.scape_project.pw.simulator.EventScheduling
   * @generated
   */
  EClass getEventScheduling();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.EventScheduling#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see eu.scape_project.pw.simulator.EventScheduling#getStart()
   * @see #getEventScheduling()
   * @generated
   */
  EAttribute getEventScheduling_Start();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.EventScheduling#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see eu.scape_project.pw.simulator.EventScheduling#getEnd()
   * @see #getEventScheduling()
   * @generated
   */
  EAttribute getEventScheduling_End();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.EventScheduling#getRepeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeat</em>'.
   * @see eu.scape_project.pw.simulator.EventScheduling#getRepeat()
   * @see #getEventScheduling()
   * @generated
   */
  EAttribute getEventScheduling_Repeat();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.EventScheduling#getEvery <em>Every</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Every</em>'.
   * @see eu.scape_project.pw.simulator.EventScheduling#getEvery()
   * @see #getEventScheduling()
   * @generated
   */
  EAttribute getEventScheduling_Every();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.ConditionalScheduling <em>Conditional Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Scheduling</em>'.
   * @see eu.scape_project.pw.simulator.ConditionalScheduling
   * @generated
   */
  EClass getConditionalScheduling();

  /**
   * Returns the meta object for the reference '{@link eu.scape_project.pw.simulator.ConditionalScheduling#getObserves <em>Observes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Observes</em>'.
   * @see eu.scape_project.pw.simulator.ConditionalScheduling#getObserves()
   * @see #getConditionalScheduling()
   * @generated
   */
  EReference getConditionalScheduling_Observes();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.ConditionalScheduling#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see eu.scape_project.pw.simulator.ConditionalScheduling#getDelay()
   * @see #getConditionalScheduling()
   * @generated
   */
  EAttribute getConditionalScheduling_Delay();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimulatorFactory getSimulatorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.SimulationImpl <em>Simulation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.SimulationImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getSimulation()
     * @generated
     */
    EClass SIMULATION = eINSTANCE.getSimulation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMULATION__NAME = eINSTANCE.getSimulation_Name();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION__EVENTS = eINSTANCE.getSimulation_Events();

    /**
     * The meta object literal for the '<em><b>Scheduling</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION__SCHEDULING = eINSTANCE.getSimulation_Scheduling();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.EventImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.SchedulingImpl <em>Scheduling</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.SchedulingImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getScheduling()
     * @generated
     */
    EClass SCHEDULING = eINSTANCE.getScheduling();

    /**
     * The meta object literal for the '<em><b>Schedule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEDULING__SCHEDULE = eINSTANCE.getScheduling_Schedule();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.EventSchedulingImpl <em>Event Scheduling</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.EventSchedulingImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEventScheduling()
     * @generated
     */
    EClass EVENT_SCHEDULING = eINSTANCE.getEventScheduling();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_SCHEDULING__START = eINSTANCE.getEventScheduling_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_SCHEDULING__END = eINSTANCE.getEventScheduling_End();

    /**
     * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_SCHEDULING__REPEAT = eINSTANCE.getEventScheduling_Repeat();

    /**
     * The meta object literal for the '<em><b>Every</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_SCHEDULING__EVERY = eINSTANCE.getEventScheduling_Every();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl <em>Conditional Scheduling</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getConditionalScheduling()
     * @generated
     */
    EClass CONDITIONAL_SCHEDULING = eINSTANCE.getConditionalScheduling();

    /**
     * The meta object literal for the '<em><b>Observes</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_SCHEDULING__OBSERVES = eINSTANCE.getConditionalScheduling_Observes();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_SCHEDULING__DELAY = eINSTANCE.getConditionalScheduling_Delay();

  }

} //SimulatorPackage
