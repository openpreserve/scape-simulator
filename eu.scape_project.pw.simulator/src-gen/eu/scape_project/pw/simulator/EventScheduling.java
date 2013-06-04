/**
 */
package eu.scape_project.pw.simulator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Scheduling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.EventScheduling#getStart <em>Start</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.EventScheduling#getEnd <em>End</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.EventScheduling#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.EventScheduling#getEvery <em>Every</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getEventScheduling()
 * @model
 * @generated
 */
public interface EventScheduling extends Scheduling
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(int)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getEventScheduling_Start()
   * @model
   * @generated
   */
  int getStart();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.EventScheduling#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(int value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(int)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getEventScheduling_End()
   * @model
   * @generated
   */
  int getEnd();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.EventScheduling#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(int value);

  /**
   * Returns the value of the '<em><b>Repeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat</em>' attribute.
   * @see #setRepeat(int)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getEventScheduling_Repeat()
   * @model
   * @generated
   */
  int getRepeat();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.EventScheduling#getRepeat <em>Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat</em>' attribute.
   * @see #getRepeat()
   * @generated
   */
  void setRepeat(int value);

  /**
   * Returns the value of the '<em><b>Every</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Every</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Every</em>' attribute.
   * @see #setEvery(int)
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getEventScheduling_Every()
   * @model
   * @generated
   */
  int getEvery();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.EventScheduling#getEvery <em>Every</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Every</em>' attribute.
   * @see #getEvery()
   * @generated
   */
  void setEvery(int value);

} // EventScheduling
