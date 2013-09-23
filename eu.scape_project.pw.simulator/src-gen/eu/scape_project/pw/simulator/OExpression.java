/**
 */
package eu.scape_project.pw.simulator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OExpression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.OExpression#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.OExpression#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getOExpression()
 * @model
 * @generated
 */
public interface OExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Side</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Side</em>' attribute.
   * @see #setLeftSide(String)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getOExpression_LeftSide()
   * @model
   * @generated
   */
  String getLeftSide();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.OExpression#getLeftSide <em>Left Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Side</em>' attribute.
   * @see #getLeftSide()
   * @generated
   */
  void setLeftSide(String value);

  /**
   * Returns the value of the '<em><b>Right Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Side</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Side</em>' attribute.
   * @see #setRightSide(int)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getOExpression_RightSide()
   * @model
   * @generated
   */
  int getRightSide();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.OExpression#getRightSide <em>Right Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Side</em>' attribute.
   * @see #getRightSide()
   * @generated
   */
  void setRightSide(int value);

} // OExpression
