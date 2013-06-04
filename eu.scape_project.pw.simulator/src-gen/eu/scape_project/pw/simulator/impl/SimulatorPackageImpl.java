/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.ConditionalScheduling;
import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.EventScheduling;
import eu.scape_project.pw.simulator.Scheduling;
import eu.scape_project.pw.simulator.Simulation;
import eu.scape_project.pw.simulator.SimulatorFactory;
import eu.scape_project.pw.simulator.SimulatorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatorPackageImpl extends EPackageImpl implements SimulatorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simulationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schedulingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventSchedulingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalSchedulingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see eu.scape_project.pw.simulator.SimulatorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimulatorPackageImpl()
  {
    super(eNS_URI, SimulatorFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SimulatorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimulatorPackage init()
  {
    if (isInited) return (SimulatorPackage)EPackage.Registry.INSTANCE.getEPackage(SimulatorPackage.eNS_URI);

    // Obtain or create and register package
    SimulatorPackageImpl theSimulatorPackage = (SimulatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulatorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSimulatorPackage.createPackageContents();

    // Initialize created meta-data
    theSimulatorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimulatorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimulatorPackage.eNS_URI, theSimulatorPackage);
    return theSimulatorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimulation()
  {
    return simulationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimulation_Name()
  {
    return (EAttribute)simulationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulation_Events()
  {
    return (EReference)simulationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulation_Scheduling()
  {
    return (EReference)simulationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Name()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScheduling()
  {
    return schedulingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScheduling_Schedule()
  {
    return (EReference)schedulingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventScheduling()
  {
    return eventSchedulingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventScheduling_Start()
  {
    return (EAttribute)eventSchedulingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventScheduling_End()
  {
    return (EAttribute)eventSchedulingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventScheduling_Repeat()
  {
    return (EAttribute)eventSchedulingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventScheduling_Every()
  {
    return (EAttribute)eventSchedulingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalScheduling()
  {
    return conditionalSchedulingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalScheduling_Observes()
  {
    return (EReference)conditionalSchedulingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionalScheduling_Delay()
  {
    return (EAttribute)conditionalSchedulingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulatorFactory getSimulatorFactory()
  {
    return (SimulatorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    simulationEClass = createEClass(SIMULATION);
    createEAttribute(simulationEClass, SIMULATION__NAME);
    createEReference(simulationEClass, SIMULATION__EVENTS);
    createEReference(simulationEClass, SIMULATION__SCHEDULING);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__NAME);

    schedulingEClass = createEClass(SCHEDULING);
    createEReference(schedulingEClass, SCHEDULING__SCHEDULE);

    eventSchedulingEClass = createEClass(EVENT_SCHEDULING);
    createEAttribute(eventSchedulingEClass, EVENT_SCHEDULING__START);
    createEAttribute(eventSchedulingEClass, EVENT_SCHEDULING__END);
    createEAttribute(eventSchedulingEClass, EVENT_SCHEDULING__REPEAT);
    createEAttribute(eventSchedulingEClass, EVENT_SCHEDULING__EVERY);

    conditionalSchedulingEClass = createEClass(CONDITIONAL_SCHEDULING);
    createEReference(conditionalSchedulingEClass, CONDITIONAL_SCHEDULING__OBSERVES);
    createEAttribute(conditionalSchedulingEClass, CONDITIONAL_SCHEDULING__DELAY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    eventSchedulingEClass.getESuperTypes().add(this.getScheduling());
    conditionalSchedulingEClass.getESuperTypes().add(this.getScheduling());

    // Initialize classes and features; add operations and parameters
    initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimulation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimulation_Events(), this.getEvent(), null, "events", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimulation_Scheduling(), this.getScheduling(), null, "scheduling", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schedulingEClass, Scheduling.class, "Scheduling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScheduling_Schedule(), this.getEvent(), null, "schedule", null, 0, 1, Scheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventSchedulingEClass, EventScheduling.class, "EventScheduling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventScheduling_Start(), ecorePackage.getEInt(), "start", null, 0, 1, EventScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventScheduling_End(), ecorePackage.getEInt(), "end", null, 0, 1, EventScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventScheduling_Repeat(), ecorePackage.getEInt(), "repeat", null, 0, 1, EventScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventScheduling_Every(), ecorePackage.getEInt(), "every", null, 0, 1, EventScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalSchedulingEClass, ConditionalScheduling.class, "ConditionalScheduling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalScheduling_Observes(), this.getEvent(), null, "observes", null, 0, 1, ConditionalScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionalScheduling_Delay(), ecorePackage.getEInt(), "delay", null, 0, 1, ConditionalScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimulatorPackageImpl
