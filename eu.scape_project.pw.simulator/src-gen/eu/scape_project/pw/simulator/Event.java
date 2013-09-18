/**
 */
package eu.scape_project.pw.simulator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.Event#getName <em>Name</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.Event#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.Event#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Left Side</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Side</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Side</em>' reference.
   * @see #setLeftSide(KeyValue)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getEvent_LeftSide()
   * @model
   * @generated
   */
  KeyValue getLeftSide();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.Event#getLeftSide <em>Left Side</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Side</em>' reference.
   * @see #getLeftSide()
   * @generated
   */
  void setLeftSide(KeyValue value);

  /**
   * Returns the value of the '<em><b>Right Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Side</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Side</em>' attribute.
   * @see #setRightSide(String)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getEvent_RightSide()
   * @model
   * @generated
   */
  String getRightSide();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.Event#getRightSide <em>Right Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Side</em>' attribute.
   * @see #getRightSide()
   * @generated
   */
  void setRightSide(String value);

} // Event
