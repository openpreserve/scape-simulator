/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.EventScheduling;
import eu.scape_project.pw.simulator.SimulatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Scheduling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.impl.EventSchedulingImpl#getStart <em>Start</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.EventSchedulingImpl#getEnd <em>End</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.EventSchedulingImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.EventSchedulingImpl#getEvery <em>Every</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventSchedulingImpl extends SchedulingImpl implements EventScheduling
{
  /**
   * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected static final int START_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected int start = START_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final int END_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected int end = END_EDEFAULT;

  /**
   * The default value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeat()
   * @generated
   * @ordered
   */
  protected static final int REPEAT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeat()
   * @generated
   * @ordered
   */
  protected int repeat = REPEAT_EDEFAULT;

  /**
   * The default value of the '{@link #getEvery() <em>Every</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvery()
   * @generated
   * @ordered
   */
  protected static final int EVERY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEvery() <em>Every</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvery()
   * @generated
   * @ordered
   */
  protected int every = EVERY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventSchedulingImpl()
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
    return SimulatorPackage.Literals.EVENT_SCHEDULING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(int newStart)
  {
    int oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.EVENT_SCHEDULING__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(int newEnd)
  {
    int oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.EVENT_SCHEDULING__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRepeat()
  {
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeat(int newRepeat)
  {
    int oldRepeat = repeat;
    repeat = newRepeat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.EVENT_SCHEDULING__REPEAT, oldRepeat, repeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEvery()
  {
    return every;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvery(int newEvery)
  {
    int oldEvery = every;
    every = newEvery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.EVENT_SCHEDULING__EVERY, oldEvery, every));
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
      case SimulatorPackage.EVENT_SCHEDULING__START:
        return getStart();
      case SimulatorPackage.EVENT_SCHEDULING__END:
        return getEnd();
      case SimulatorPackage.EVENT_SCHEDULING__REPEAT:
        return getRepeat();
      case SimulatorPackage.EVENT_SCHEDULING__EVERY:
        return getEvery();
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
      case SimulatorPackage.EVENT_SCHEDULING__START:
        setStart((Integer)newValue);
        return;
      case SimulatorPackage.EVENT_SCHEDULING__END:
        setEnd((Integer)newValue);
        return;
      case SimulatorPackage.EVENT_SCHEDULING__REPEAT:
        setRepeat((Integer)newValue);
        return;
      case SimulatorPackage.EVENT_SCHEDULING__EVERY:
        setEvery((Integer)newValue);
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
      case SimulatorPackage.EVENT_SCHEDULING__START:
        setStart(START_EDEFAULT);
        return;
      case SimulatorPackage.EVENT_SCHEDULING__END:
        setEnd(END_EDEFAULT);
        return;
      case SimulatorPackage.EVENT_SCHEDULING__REPEAT:
        setRepeat(REPEAT_EDEFAULT);
        return;
      case SimulatorPackage.EVENT_SCHEDULING__EVERY:
        setEvery(EVERY_EDEFAULT);
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
      case SimulatorPackage.EVENT_SCHEDULING__START:
        return start != START_EDEFAULT;
      case SimulatorPackage.EVENT_SCHEDULING__END:
        return end != END_EDEFAULT;
      case SimulatorPackage.EVENT_SCHEDULING__REPEAT:
        return repeat != REPEAT_EDEFAULT;
      case SimulatorPackage.EVENT_SCHEDULING__EVERY:
        return every != EVERY_EDEFAULT;
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
    result.append(" (start: ");
    result.append(start);
    result.append(", end: ");
    result.append(end);
    result.append(", repeat: ");
    result.append(repeat);
    result.append(", every: ");
    result.append(every);
    result.append(')');
    return result.toString();
  }

} //EventSchedulingImpl
