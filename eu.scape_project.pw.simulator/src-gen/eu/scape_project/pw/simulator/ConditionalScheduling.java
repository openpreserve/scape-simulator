/**
 */
package eu.scape_project.pw.simulator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Scheduling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.ConditionalScheduling#getObserves <em>Observes</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.ConditionalScheduling#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getConditionalScheduling()
 * @model
 * @generated
 */
public interface ConditionalScheduling extends Scheduling
{
  /**
   * Returns the value of the '<em><b>Observes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observes</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observes</em>' reference.
   * @see #setObserves(Event)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getConditionalScheduling_Observes()
   * @model
   * @generated
   */
  Event getObserves();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.ConditionalScheduling#getObserves <em>Observes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Observes</em>' reference.
   * @see #getObserves()
   * @generated
   */
  void setObserves(Event value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' attribute.
   * @see #setDelay(int)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getConditionalScheduling_Delay()
   * @model
   * @generated
   */
  int getDelay();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.ConditionalScheduling#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' attribute.
   * @see #getDelay()
   * @generated
   */
  void setDelay(int value);

} // ConditionalScheduling
