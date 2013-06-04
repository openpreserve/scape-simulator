/**
 */
package eu.scape_project.pw.simulator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.scape_project.pw.simulator.SimulatorPackage
 * @generated
 */
public interface SimulatorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimulatorFactory eINSTANCE = eu.scape_project.pw.simulator.impl.SimulatorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Simulation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simulation</em>'.
   * @generated
   */
  Simulation createSimulation();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Scheduling</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheduling</em>'.
   * @generated
   */
  Scheduling createScheduling();

  /**
   * Returns a new object of class '<em>Event Scheduling</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Scheduling</em>'.
   * @generated
   */
  EventScheduling createEventScheduling();

  /**
   * Returns a new object of class '<em>Conditional Scheduling</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Scheduling</em>'.
   * @generated
   */
  ConditionalScheduling createConditionalScheduling();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimulatorPackage getSimulatorPackage();

} //SimulatorFactory
