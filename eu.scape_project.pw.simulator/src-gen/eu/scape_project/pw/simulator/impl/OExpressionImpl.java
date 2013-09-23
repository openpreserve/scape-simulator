/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.OExpression;
import eu.scape_project.pw.simulator.SimulatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OExpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.impl.OExpressionImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.OExpressionImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OExpressionImpl extends ExpressionImpl implements OExpression
{
  /**
   * The default value of the '{@link #getLeftSide() <em>Left Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftSide()
   * @generated
   * @ordered
   */
  protected static final String LEFT_SIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftSide()
   * @generated
   * @ordered
   */
  protected String leftSide = LEFT_SIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getRightSide() <em>Right Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSide()
   * @generated
   * @ordered
   */
  protected static final int RIGHT_SIDE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSide()
   * @generated
   * @ordered
   */
  protected int rightSide = RIGHT_SIDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OExpressionImpl()
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
    return SimulatorPackage.Literals.OEXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeftSide()
  {
    return leftSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftSide(String newLeftSide)
  {
    String oldLeftSide = leftSide;
    leftSide = newLeftSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.OEXPRESSION__LEFT_SIDE, oldLeftSide, leftSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRightSide()
  {
    return rightSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightSide(int newRightSide)
  {
    int oldRightSide = rightSide;
    rightSide = newRightSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.OEXPRESSION__RIGHT_SIDE, oldRightSide, rightSide));
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
      case SimulatorPackage.OEXPRESSION__LEFT_SIDE:
        return getLeftSide();
      case SimulatorPackage.OEXPRESSION__RIGHT_SIDE:
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
      case SimulatorPackage.OEXPRESSION__LEFT_SIDE:
        setLeftSide((String)newValue);
        return;
      case SimulatorPackage.OEXPRESSION__RIGHT_SIDE:
        setRightSide((Integer)newValue);
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
      case SimulatorPackage.OEXPRESSION__LEFT_SIDE:
        setLeftSide(LEFT_SIDE_EDEFAULT);
        return;
      case SimulatorPackage.OEXPRESSION__RIGHT_SIDE:
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
      case SimulatorPackage.OEXPRESSION__LEFT_SIDE:
        return LEFT_SIDE_EDEFAULT == null ? leftSide != null : !LEFT_SIDE_EDEFAULT.equals(leftSide);
      case SimulatorPackage.OEXPRESSION__RIGHT_SIDE:
        return rightSide != RIGHT_SIDE_EDEFAULT;
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
    result.append(" (leftSide: ");
    result.append(leftSide);
    result.append(", rightSide: ");
    result.append(rightSide);
    result.append(')');
    return result.toString();
  }

} //OExpressionImpl
