/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.KeyValue;
import eu.scape_project.pw.simulator.SimulatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.EventImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.EventImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftSide()
   * @generated
   * @ordered
   */
  protected KeyValue leftSide;

  /**
   * The default value of the '{@link #getRightSide() <em>Right Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSide()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_SIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSide()
   * @generated
   * @ordered
   */
  protected String rightSide = RIGHT_SIDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return SimulatorPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.EVENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValue getLeftSide()
  {
    if (leftSide != null && leftSide.eIsProxy())
    {
      InternalEObject oldLeftSide = (InternalEObject)leftSide;
      leftSide = (KeyValue)eResolveProxy(oldLeftSide);
      if (leftSide != oldLeftSide)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulatorPackage.EVENT__LEFT_SIDE, oldLeftSide, leftSide));
      }
    }
    return leftSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValue basicGetLeftSide()
  {
    return leftSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftSide(KeyValue newLeftSide)
  {
    KeyValue oldLeftSide = leftSide;
    leftSide = newLeftSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.EVENT__LEFT_SIDE, oldLeftSide, leftSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRightSide()
  {
    return rightSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightSide(String newRightSide)
  {
    String oldRightSide = rightSide;
    rightSide = newRightSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.EVENT__RIGHT_SIDE, oldRightSide, rightSide));
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
      case SimulatorPackage.EVENT__NAME:
        return getName();
      case SimulatorPackage.EVENT__LEFT_SIDE:
        if (resolve) return getLeftSide();
        return basicGetLeftSide();
      case SimulatorPackage.EVENT__RIGHT_SIDE:
        return getRightSide();
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
      case SimulatorPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case SimulatorPackage.EVENT__LEFT_SIDE:
        setLeftSide((KeyValue)newValue);
        return;
      case SimulatorPackage.EVENT__RIGHT_SIDE:
        setRightSide((String)newValue);
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
      case SimulatorPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimulatorPackage.EVENT__LEFT_SIDE:
        setLeftSide((KeyValue)null);
        return;
      case SimulatorPackage.EVENT__RIGHT_SIDE:
        setRightSide(RIGHT_SIDE_EDEFAULT);
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
      case SimulatorPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimulatorPackage.EVENT__LEFT_SIDE:
        return leftSide != null;
      case SimulatorPackage.EVENT__RIGHT_SIDE:
        return RIGHT_SIDE_EDEFAULT == null ? rightSide != null : !RIGHT_SIDE_EDEFAULT.equals(rightSide);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", rightSide: ");
    result.append(rightSide);
    result.append(')');
    return result.toString();
  }

} //EventImpl
