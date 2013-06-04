/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.Scheduling;
import eu.scape_project.pw.simulator.SimulatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.impl.SchedulingImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingImpl extends MinimalEObjectImpl.Container implements Scheduling
{
  /**
   * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchedule()
   * @generated
   * @ordered
   */
  protected Event schedule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchedulingImpl()
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
    return SimulatorPackage.Literals.SCHEDULING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getSchedule()
  {
    if (schedule != null && schedule.eIsProxy())
    {
      InternalEObject oldSchedule = (InternalEObject)schedule;
      schedule = (Event)eResolveProxy(oldSchedule);
      if (schedule != oldSchedule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulatorPackage.SCHEDULING__SCHEDULE, oldSchedule, schedule));
      }
    }
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetSchedule()
  {
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchedule(Event newSchedule)
  {
    Event oldSchedule = schedule;
    schedule = newSchedule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.SCHEDULING__SCHEDULE, oldSchedule, schedule));
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
      case SimulatorPackage.SCHEDULING__SCHEDULE:
        if (resolve) return getSchedule();
        return basicGetSchedule();
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
      case SimulatorPackage.SCHEDULING__SCHEDULE:
        setSchedule((Event)newValue);
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
      case SimulatorPackage.SCHEDULING__SCHEDULE:
        setSchedule((Event)null);
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
      case SimulatorPackage.SCHEDULING__SCHEDULE:
        return schedule != null;
    }
    return super.eIsSet(featureID);
  }

} //SchedulingImpl
