/**
 */
package eu.scape_project.pw.simulator.util;

import eu.scape_project.pw.simulator.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.scape_project.pw.simulator.SimulatorPackage
 * @generated
 */
public class SimulatorSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimulatorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulatorSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SimulatorPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SimulatorPackage.SIMULATION:
      {
        Simulation simulation = (Simulation)theEObject;
        T result = caseSimulation(simulation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.REXPRESSION:
      {
        RExpression rExpression = (RExpression)theEObject;
        T result = caseRExpression(rExpression);
        if (result == null) result = caseExpression(rExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.OEXPRESSION:
      {
        OExpression oExpression = (OExpression)theEObject;
        T result = caseOExpression(oExpression);
        if (result == null) result = caseExpression(oExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.PEXPRESSION:
      {
        PExpression pExpression = (PExpression)theEObject;
        T result = casePExpression(pExpression);
        if (result == null) result = caseOExpression(pExpression);
        if (result == null) result = caseExpression(pExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.EEXPRESSION:
      {
        EExpression eExpression = (EExpression)theEObject;
        T result = caseEExpression(eExpression);
        if (result == null) result = caseOExpression(eExpression);
        if (result == null) result = caseExpression(eExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.MEXPRESSION:
      {
        MExpression mExpression = (MExpression)theEObject;
        T result = caseMExpression(mExpression);
        if (result == null) result = caseOExpression(mExpression);
        if (result == null) result = caseExpression(mExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.COLLECTION:
      {
        Collection collection = (Collection)theEObject;
        T result = caseCollection(collection);
        if (result == null) result = caseEntity(collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.KEY_VALUE:
      {
        KeyValue keyValue = (KeyValue)theEObject;
        T result = caseKeyValue(keyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.KEY_VALUE_INT:
      {
        KeyValueInt keyValueInt = (KeyValueInt)theEObject;
        T result = caseKeyValueInt(keyValueInt);
        if (result == null) result = caseKeyValue(keyValueInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.KEY_VALUE_STRING:
      {
        KeyValueString keyValueString = (KeyValueString)theEObject;
        T result = caseKeyValueString(keyValueString);
        if (result == null) result = caseKeyValue(keyValueString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.KEY_VALUE_DECIMAL:
      {
        KeyValueDecimal keyValueDecimal = (KeyValueDecimal)theEObject;
        T result = caseKeyValueDecimal(keyValueDecimal);
        if (result == null) result = caseKeyValue(keyValueDecimal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.SCHEDULING:
      {
        Scheduling scheduling = (Scheduling)theEObject;
        T result = caseScheduling(scheduling);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.EVENT_SCHEDULING:
      {
        EventScheduling eventScheduling = (EventScheduling)theEObject;
        T result = caseEventScheduling(eventScheduling);
        if (result == null) result = caseScheduling(eventScheduling);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulatorPackage.CONDITIONAL_SCHEDULING:
      {
        ConditionalScheduling conditionalScheduling = (ConditionalScheduling)theEObject;
        T result = caseConditionalScheduling(conditionalScheduling);
        if (result == null) result = caseScheduling(conditionalScheduling);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simulation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simulation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimulation(Simulation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRExpression(RExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOExpression(OExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePExpression(PExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEExpression(EExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMExpression(MExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollection(Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValue(KeyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValueInt(KeyValueInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValueString(KeyValueString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value Decimal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value Decimal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValueDecimal(KeyValueDecimal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheduling</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheduling</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScheduling(Scheduling object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Scheduling</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Scheduling</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventScheduling(EventScheduling object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Scheduling</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Scheduling</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalScheduling(ConditionalScheduling object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SimulatorSwitch
