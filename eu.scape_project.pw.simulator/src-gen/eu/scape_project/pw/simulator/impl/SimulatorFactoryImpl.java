/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatorFactoryImpl extends EFactoryImpl implements SimulatorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimulatorFactory init()
  {
    try
    {
      SimulatorFactory theSimulatorFactory = (SimulatorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.scape_project.eu/pw/Simulator"); 
      if (theSimulatorFactory != null)
      {
        return theSimulatorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimulatorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulatorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimulatorPackage.SIMULATION: return createSimulation();
      case SimulatorPackage.EVENT: return createEvent();
      case SimulatorPackage.EXPRESSION: return createExpression();
      case SimulatorPackage.REXPRESSION: return createRExpression();
      case SimulatorPackage.OEXPRESSION: return createOExpression();
      case SimulatorPackage.PEXPRESSION: return createPExpression();
      case SimulatorPackage.EEXPRESSION: return createEExpression();
      case SimulatorPackage.MEXPRESSION: return createMExpression();
      case SimulatorPackage.ENTITY: return createEntity();
      case SimulatorPackage.COLLECTION: return createCollection();
      case SimulatorPackage.KEY_VALUE: return createKeyValue();
      case SimulatorPackage.KEY_VALUE_INT: return createKeyValueInt();
      case SimulatorPackage.KEY_VALUE_STRING: return createKeyValueString();
      case SimulatorPackage.KEY_VALUE_DECIMAL: return createKeyValueDecimal();
      case SimulatorPackage.SCHEDULING: return createScheduling();
      case SimulatorPackage.EVENT_SCHEDULING: return createEventScheduling();
      case SimulatorPackage.CONDITIONAL_SCHEDULING: return createConditionalScheduling();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simulation createSimulation()
  {
    SimulationImpl simulation = new SimulationImpl();
    return simulation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RExpression createRExpression()
  {
    RExpressionImpl rExpression = new RExpressionImpl();
    return rExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OExpression createOExpression()
  {
    OExpressionImpl oExpression = new OExpressionImpl();
    return oExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PExpression createPExpression()
  {
    PExpressionImpl pExpression = new PExpressionImpl();
    return pExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EExpression createEExpression()
  {
    EExpressionImpl eExpression = new EExpressionImpl();
    return eExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MExpression createMExpression()
  {
    MExpressionImpl mExpression = new MExpressionImpl();
    return mExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValue createKeyValue()
  {
    KeyValueImpl keyValue = new KeyValueImpl();
    return keyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValueInt createKeyValueInt()
  {
    KeyValueIntImpl keyValueInt = new KeyValueIntImpl();
    return keyValueInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValueString createKeyValueString()
  {
    KeyValueStringImpl keyValueString = new KeyValueStringImpl();
    return keyValueString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValueDecimal createKeyValueDecimal()
  {
    KeyValueDecimalImpl keyValueDecimal = new KeyValueDecimalImpl();
    return keyValueDecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheduling createScheduling()
  {
    SchedulingImpl scheduling = new SchedulingImpl();
    return scheduling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventScheduling createEventScheduling()
  {
    EventSchedulingImpl eventScheduling = new EventSchedulingImpl();
    return eventScheduling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalScheduling createConditionalScheduling()
  {
    ConditionalSchedulingImpl conditionalScheduling = new ConditionalSchedulingImpl();
    return conditionalScheduling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulatorPackage getSimulatorPackage()
  {
    return (SimulatorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimulatorPackage getPackage()
  {
    return SimulatorPackage.eINSTANCE;
  }

} //SimulatorFactoryImpl
