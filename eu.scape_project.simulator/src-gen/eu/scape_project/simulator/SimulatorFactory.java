/**
 * <copyright>
 * </copyright>
 *
 */
package eu.scape_project.simulator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.scape_project.simulator.SimulatorPackage
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
  SimulatorFactory eINSTANCE = eu.scape_project.simulator.impl.SimulatorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Simulation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simulation</em>'.
   * @generated
   */
  Simulation createSimulation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimulatorPackage getSimulatorPackage();

} //SimulatorFactory