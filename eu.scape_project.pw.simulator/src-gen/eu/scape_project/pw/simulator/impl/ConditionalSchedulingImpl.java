/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.ConditionalScheduling;
import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.SimulatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Scheduling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl#getObserves <em>Observes</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.ConditionalSchedulingImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalSchedulingImpl extends SchedulingImpl implements ConditionalScheduling
{
  /**
   * The cached value of the '{@link #getObserves() <em>Observes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObserves()
   * @generated
   * @ordered
   */
  protected Event observes;

  /**
   * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected static final int DELAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected int delay = DELAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalSchedulingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimulatorPackage.Literals.CONDITIONAL_SCHEDULING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getObserves()
  {
    if (observes != null && observes.eIsProxy())
    {
      InternalEObject oldObserves = (InternalEObject)observes;
      observes = (Event)eResolveProxy(oldObserves);
      if (observes != oldObserves)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulatorPackage.CONDITIONAL_SCHEDULING__OBSERVES, oldObserves, observes));
      }
    }
    return observes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetObserves()
  {
    return observes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObserves(Event newObserves)
  {
    Event oldObserves = observes;
    observes = newObserves;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.CONDITIONAL_SCHEDULING__OBSERVES, oldObserves, observes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDelay()
  {
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelay(int newDelay)
  {
    int oldDelay = delay;
    delay = newDelay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.CONDITIONAL_SCHEDULING__DELAY, oldDelay, delay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimulatorPackage.CONDITIONAL_SCHEDULING__OBSERVES:
        if (resolve) return getObserves();
        return basicGetObserves();
      case SimulatorPackage.CONDITIONAL_SCHEDULING__DELAY:
        return getDelay();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimulatorPackage.CONDITIONAL_SCHEDULING__OBSERVES:
        setObserves((Event)newValue);
        return;
      case SimulatorPackage.CONDITIONAL_SCHEDULING__DELAY:
        setDelay((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimulatorPackage.CONDITIONAL_SCHEDULING__OBSERVES:
        setObserves((Event)null);
        return;
      case SimulatorPackage.CONDITIONAL_SCHEDULING__DELAY:
        setDelay(DELAY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimulatorPackage.CONDITIONAL_SCHEDULING__OBSERVES:
        return observes != null;
      case SimulatorPackage.CONDITIONAL_SCHEDULING__DELAY:
        return delay != DELAY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (delay: ");
    result.append(delay);
    result.append(')');
    return result.toString();
  }

} //ConditionalSchedulingImpl
