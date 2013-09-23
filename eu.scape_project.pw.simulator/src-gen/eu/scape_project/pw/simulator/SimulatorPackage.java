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
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__EVENTS = 2;

  /**
   * The feature id for the '<em><b>Scheduling</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__SCHEDULING = 3;

  /**
   * The number of structural features of the '<em>Simulation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.ExpressionImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.RExpressionImpl <em>RExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.RExpressionImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getRExpression()
   * @generated
   */
  int REXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXPRESSION__NUMBER = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>RExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.OExpressionImpl <em>OExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.OExpressionImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getOExpression()
   * @generated
   */
  int OEXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Left Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OEXPRESSION__LEFT_SIDE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OEXPRESSION__RIGHT_SIDE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>OExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.PExpressionImpl <em>PExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.PExpressionImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getPExpression()
   * @generated
   */
  int PEXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Left Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PEXPRESSION__LEFT_SIDE = OEXPRESSION__LEFT_SIDE;

  /**
   * The feature id for the '<em><b>Right Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PEXPRESSION__RIGHT_SIDE = OEXPRESSION__RIGHT_SIDE;

  /**
   * The number of structural features of the '<em>PExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PEXPRESSION_FEATURE_COUNT = OEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.EExpressionImpl <em>EExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.EExpressionImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEExpression()
   * @generated
   */
  int EEXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Left Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EEXPRESSION__LEFT_SIDE = OEXPRESSION__LEFT_SIDE;

  /**
   * The feature id for the '<em><b>Right Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EEXPRESSION__RIGHT_SIDE = OEXPRESSION__RIGHT_SIDE;

  /**
   * The number of structural features of the '<em>EExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EEXPRESSION_FEATURE_COUNT = OEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.MExpressionImpl <em>MExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.MExpressionImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getMExpression()
   * @generated
   */
  int MEXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Left Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXPRESSION__LEFT_SIDE = OEXPRESSION__LEFT_SIDE;

  /**
   * The feature id for the '<em><b>Right Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXPRESSION__RIGHT_SIDE = OEXPRESSION__RIGHT_SIDE;

  /**
   * The number of structural features of the '<em>MExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXPRESSION_FEATURE_COUNT = OEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.EntityImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 8;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.CollectionImpl <em>Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.CollectionImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__NAME = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__KEY_VALUES = ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Collections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__SUB_COLLECTIONS = ENTITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.KeyValueImpl <em>Key Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.KeyValueImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValue()
   * @generated
   */
  int KEY_VALUE = 10;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE__KEY = 0;

  /**
   * The number of structural features of the '<em>Key Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.KeyValueIntImpl <em>Key Value Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.KeyValueIntImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValueInt()
   * @generated
   */
  int KEY_VALUE_INT = 11;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_INT__KEY = KEY_VALUE__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_INT__VALUE = KEY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Key Value Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_INT_FEATURE_COUNT = KEY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.KeyValueStringImpl <em>Key Value String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.KeyValueStringImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValueString()
   * @generated
   */
  int KEY_VALUE_STRING = 12;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_STRING__KEY = KEY_VALUE__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_STRING__VALUE = KEY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Key Value String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_STRING_FEATURE_COUNT = KEY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.KeyValueDecimalImpl <em>Key Value Decimal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.KeyValueDecimalImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValueDecimal()
   * @generated
   */
  int KEY_VALUE_DECIMAL = 13;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_DECIMAL__KEY = KEY_VALUE__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_DECIMAL__VALUE = KEY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Key Value Decimal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_DECIMAL_FEATURE_COUNT = KEY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.SchedulingImpl <em>Scheduling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.SchedulingImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getScheduling()
   * @generated
   */
  int SCHEDULING = 14;

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
  int EVENT_SCHEDULING = 15;

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
   * The feature id for the '<em><b>Every</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING__EVERY = SCHEDULING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Event Scheduling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SCHEDULING_FEATURE_COUNT = SCHEDULING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl <em>Conditional Scheduling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl
   * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getConditionalScheduling()
   * @generated
   */
  int CONDITIONAL_SCHEDULING = 16;

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
   * Returns the meta object for the containment reference list '{@link eu.scape_project.pw.simulator.Simulation#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see eu.scape_project.pw.simulator.Simulation#getEntities()
   * @see #getSimulation()
   * @generated
   */
  EReference getSimulation_Entities();

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
   * Returns the meta object for the containment reference '{@link eu.scape_project.pw.simulator.Event#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.scape_project.pw.simulator.Event#getExpression()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Expression();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see eu.scape_project.pw.simulator.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.RExpression <em>RExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RExpression</em>'.
   * @see eu.scape_project.pw.simulator.RExpression
   * @generated
   */
  EClass getRExpression();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.RExpression#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see eu.scape_project.pw.simulator.RExpression#getNumber()
   * @see #getRExpression()
   * @generated
   */
  EAttribute getRExpression_Number();

  /**
   * Returns the meta object for the containment reference list '{@link eu.scape_project.pw.simulator.RExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see eu.scape_project.pw.simulator.RExpression#getExpression()
   * @see #getRExpression()
   * @generated
   */
  EReference getRExpression_Expression();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.OExpression <em>OExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OExpression</em>'.
   * @see eu.scape_project.pw.simulator.OExpression
   * @generated
   */
  EClass getOExpression();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.OExpression#getLeftSide <em>Left Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Side</em>'.
   * @see eu.scape_project.pw.simulator.OExpression#getLeftSide()
   * @see #getOExpression()
   * @generated
   */
  EAttribute getOExpression_LeftSide();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.OExpression#getRightSide <em>Right Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Side</em>'.
   * @see eu.scape_project.pw.simulator.OExpression#getRightSide()
   * @see #getOExpression()
   * @generated
   */
  EAttribute getOExpression_RightSide();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.PExpression <em>PExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PExpression</em>'.
   * @see eu.scape_project.pw.simulator.PExpression
   * @generated
   */
  EClass getPExpression();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.EExpression <em>EExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EExpression</em>'.
   * @see eu.scape_project.pw.simulator.EExpression
   * @generated
   */
  EClass getEExpression();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.MExpression <em>MExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MExpression</em>'.
   * @see eu.scape_project.pw.simulator.MExpression
   * @generated
   */
  EClass getMExpression();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see eu.scape_project.pw.simulator.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection</em>'.
   * @see eu.scape_project.pw.simulator.Collection
   * @generated
   */
  EClass getCollection();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.Collection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.scape_project.pw.simulator.Collection#getName()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.scape_project.pw.simulator.Collection#getKeyValues <em>Key Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Key Values</em>'.
   * @see eu.scape_project.pw.simulator.Collection#getKeyValues()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_KeyValues();

  /**
   * Returns the meta object for the containment reference list '{@link eu.scape_project.pw.simulator.Collection#getSubCollections <em>Sub Collections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Collections</em>'.
   * @see eu.scape_project.pw.simulator.Collection#getSubCollections()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_SubCollections();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.KeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value</em>'.
   * @see eu.scape_project.pw.simulator.KeyValue
   * @generated
   */
  EClass getKeyValue();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.KeyValue#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see eu.scape_project.pw.simulator.KeyValue#getKey()
   * @see #getKeyValue()
   * @generated
   */
  EAttribute getKeyValue_Key();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.KeyValueInt <em>Key Value Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Int</em>'.
   * @see eu.scape_project.pw.simulator.KeyValueInt
   * @generated
   */
  EClass getKeyValueInt();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.KeyValueInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.scape_project.pw.simulator.KeyValueInt#getValue()
   * @see #getKeyValueInt()
   * @generated
   */
  EAttribute getKeyValueInt_Value();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.KeyValueString <em>Key Value String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value String</em>'.
   * @see eu.scape_project.pw.simulator.KeyValueString
   * @generated
   */
  EClass getKeyValueString();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.KeyValueString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.scape_project.pw.simulator.KeyValueString#getValue()
   * @see #getKeyValueString()
   * @generated
   */
  EAttribute getKeyValueString_Value();

  /**
   * Returns the meta object for class '{@link eu.scape_project.pw.simulator.KeyValueDecimal <em>Key Value Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Decimal</em>'.
   * @see eu.scape_project.pw.simulator.KeyValueDecimal
   * @generated
   */
  EClass getKeyValueDecimal();

  /**
   * Returns the meta object for the attribute '{@link eu.scape_project.pw.simulator.KeyValueDecimal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.scape_project.pw.simulator.KeyValueDecimal#getValue()
   * @see #getKeyValueDecimal()
   * @generated
   */
  EAttribute getKeyValueDecimal_Value();

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
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION__ENTITIES = eINSTANCE.getSimulation_Entities();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__EXPRESSION = eINSTANCE.getEvent_Expression();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.ExpressionImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.RExpressionImpl <em>RExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.RExpressionImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getRExpression()
     * @generated
     */
    EClass REXPRESSION = eINSTANCE.getRExpression();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REXPRESSION__NUMBER = eINSTANCE.getRExpression_Number();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REXPRESSION__EXPRESSION = eINSTANCE.getRExpression_Expression();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.OExpressionImpl <em>OExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.OExpressionImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getOExpression()
     * @generated
     */
    EClass OEXPRESSION = eINSTANCE.getOExpression();

    /**
     * The meta object literal for the '<em><b>Left Side</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OEXPRESSION__LEFT_SIDE = eINSTANCE.getOExpression_LeftSide();

    /**
     * The meta object literal for the '<em><b>Right Side</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OEXPRESSION__RIGHT_SIDE = eINSTANCE.getOExpression_RightSide();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.PExpressionImpl <em>PExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.PExpressionImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getPExpression()
     * @generated
     */
    EClass PEXPRESSION = eINSTANCE.getPExpression();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.EExpressionImpl <em>EExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.EExpressionImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEExpression()
     * @generated
     */
    EClass EEXPRESSION = eINSTANCE.getEExpression();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.MExpressionImpl <em>MExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.MExpressionImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getMExpression()
     * @generated
     */
    EClass MEXPRESSION = eINSTANCE.getMExpression();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.EntityImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.CollectionImpl <em>Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.CollectionImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getCollection()
     * @generated
     */
    EClass COLLECTION = eINSTANCE.getCollection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__NAME = eINSTANCE.getCollection_Name();

    /**
     * The meta object literal for the '<em><b>Key Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__KEY_VALUES = eINSTANCE.getCollection_KeyValues();

    /**
     * The meta object literal for the '<em><b>Sub Collections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__SUB_COLLECTIONS = eINSTANCE.getCollection_SubCollections();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.KeyValueImpl <em>Key Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.KeyValueImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValue()
     * @generated
     */
    EClass KEY_VALUE = eINSTANCE.getKeyValue();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_VALUE__KEY = eINSTANCE.getKeyValue_Key();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.KeyValueIntImpl <em>Key Value Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.KeyValueIntImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValueInt()
     * @generated
     */
    EClass KEY_VALUE_INT = eINSTANCE.getKeyValueInt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_VALUE_INT__VALUE = eINSTANCE.getKeyValueInt_Value();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.KeyValueStringImpl <em>Key Value String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.KeyValueStringImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValueString()
     * @generated
     */
    EClass KEY_VALUE_STRING = eINSTANCE.getKeyValueString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_VALUE_STRING__VALUE = eINSTANCE.getKeyValueString_Value();

    /**
     * The meta object literal for the '{@link eu.scape_project.pw.simulator.impl.KeyValueDecimalImpl <em>Key Value Decimal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scape_project.pw.simulator.impl.KeyValueDecimalImpl
     * @see eu.scape_project.pw.simulator.impl.SimulatorPackageImpl#getKeyValueDecimal()
     * @generated
     */
    EClass KEY_VALUE_DECIMAL = eINSTANCE.getKeyValueDecimal();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_VALUE_DECIMAL__VALUE = eINSTANCE.getKeyValueDecimal_Value();

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
