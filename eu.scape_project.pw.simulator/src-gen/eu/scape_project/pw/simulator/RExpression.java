/**
 */
package eu.scape_project.pw.simulator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RExpression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.RExpression#getNumber <em>Number</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.RExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getRExpression()
 * @model
 * @generated
 */
public interface RExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getRExpression_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.RExpression#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link eu.scape_project.pw.simulator.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getRExpression_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // RExpression
