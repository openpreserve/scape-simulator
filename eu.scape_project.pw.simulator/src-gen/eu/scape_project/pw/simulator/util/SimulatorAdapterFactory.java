/**
 */
package eu.scape_project.pw.simulator.util;

import eu.scape_project.pw.simulator.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.scape_project.pw.simulator.SimulatorPackage
 * @generated
 */
public class SimulatorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimulatorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulatorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SimulatorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimulatorSwitch<Adapter> modelSwitch =
    new SimulatorSwitch<Adapter>()
    {
      @Override
      public Adapter caseSimulation(Simulation object)
      {
        return createSimulationAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseRExpression(RExpression object)
      {
        return createRExpressionAdapter();
      }
      @Override
      public Adapter caseOExpression(OExpression object)
      {
        return createOExpressionAdapter();
      }
      @Override
      public Adapter casePExpression(PExpression object)
      {
        return createPExpressionAdapter();
      }
      @Override
      public Adapter caseEExpression(EExpression object)
      {
        return createEExpressionAdapter();
      }
      @Override
      public Adapter caseMExpression(MExpression object)
      {
        return createMExpressionAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseCollection(Collection object)
      {
        return createCollectionAdapter();
      }
      @Override
      public Adapter caseKeyValue(KeyValue object)
      {
        return createKeyValueAdapter();
      }
      @Override
      public Adapter caseKeyValueInt(KeyValueInt object)
      {
        return createKeyValueIntAdapter();
      }
      @Override
      public Adapter caseKeyValueString(KeyValueString object)
      {
        return createKeyValueStringAdapter();
      }
      @Override
      public Adapter caseKeyValueDecimal(KeyValueDecimal object)
      {
        return createKeyValueDecimalAdapter();
      }
      @Override
      public Adapter caseScheduling(Scheduling object)
      {
        return createSchedulingAdapter();
      }
      @Override
      public Adapter caseEventScheduling(EventScheduling object)
      {
        return createEventSchedulingAdapter();
      }
      @Override
      public Adapter caseConditionalScheduling(ConditionalScheduling object)
      {
        return createConditionalSchedulingAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.Simulation <em>Simulation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.Simulation
   * @generated
   */
  public Adapter createSimulationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.RExpression <em>RExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.RExpression
   * @generated
   */
  public Adapter createRExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.OExpression <em>OExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.OExpression
   * @generated
   */
  public Adapter createOExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.PExpression <em>PExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.PExpression
   * @generated
   */
  public Adapter createPExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.EExpression <em>EExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.EExpression
   * @generated
   */
  public Adapter createEExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.MExpression <em>MExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.MExpression
   * @generated
   */
  public Adapter createMExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.Collection
   * @generated
   */
  public Adapter createCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.KeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.KeyValue
   * @generated
   */
  public Adapter createKeyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.KeyValueInt <em>Key Value Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.KeyValueInt
   * @generated
   */
  public Adapter createKeyValueIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.KeyValueString <em>Key Value String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.KeyValueString
   * @generated
   */
  public Adapter createKeyValueStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.KeyValueDecimal <em>Key Value Decimal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.KeyValueDecimal
   * @generated
   */
  public Adapter createKeyValueDecimalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.Scheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.Scheduling
   * @generated
   */
  public Adapter createSchedulingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.EventScheduling <em>Event Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.EventScheduling
   * @generated
   */
  public Adapter createEventSchedulingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.scape_project.pw.simulator.ConditionalScheduling <em>Conditional Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.scape_project.pw.simulator.ConditionalScheduling
   * @generated
   */
  public Adapter createConditionalSchedulingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SimulatorAdapterFactory
