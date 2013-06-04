/**
 */
package eu.scape_project.pw.simulator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.Scheduling#getSchedule <em>Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getScheduling()
 * @model
 * @generated
 */
public interface Scheduling extends EObject
{
  /**
   * Returns the value of the '<em><b>Schedule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schedule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schedule</em>' reference.
   * @see #setSchedule(Event)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getScheduling_Schedule()
   * @model
   * @generated
   */
  Event getSchedule();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.Scheduling#getSchedule <em>Schedule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schedule</em>' reference.
   * @see #getSchedule()
   * @generated
   */
  void setSchedule(Event value);

} // Scheduling
