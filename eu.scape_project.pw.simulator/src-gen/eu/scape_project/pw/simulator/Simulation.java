/**
 */
package eu.scape_project.pw.simulator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.Simulation#getName <em>Name</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.Simulation#getEntities <em>Entities</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.Simulation#getEvents <em>Events</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.Simulation#getScheduling <em>Scheduling</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getSimulation()
 * @model
 * @generated
 */
public interface Simulation extends EObject
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
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getSimulation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.Simulation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link eu.scape_project.pw.simulator.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getSimulation_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link eu.scape_project.pw.simulator.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getSimulation_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Scheduling</b></em>' containment reference list.
   * The list contents are of type {@link eu.scape_project.pw.simulator.Scheduling}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheduling</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduling</em>' containment reference list.
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getSimulation_Scheduling()
   * @model containment="true"
   * @generated
   */
  EList<Scheduling> getScheduling();

} // Simulation
