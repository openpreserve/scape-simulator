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
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>RExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RExpression</em>'.
   * @generated
   */
  RExpression createRExpression();

  /**
   * Returns a new object of class '<em>OExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OExpression</em>'.
   * @generated
   */
  OExpression createOExpression();

  /**
   * Returns a new object of class '<em>PExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PExpression</em>'.
   * @generated
   */
  PExpression createPExpression();

  /**
   * Returns a new object of class '<em>EExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EExpression</em>'.
   * @generated
   */
  EExpression createEExpression();

  /**
   * Returns a new object of class '<em>MExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MExpression</em>'.
   * @generated
   */
  MExpression createMExpression();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection</em>'.
   * @generated
   */
  Collection createCollection();

  /**
   * Returns a new object of class '<em>Key Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Value</em>'.
   * @generated
   */
  KeyValue createKeyValue();

  /**
   * Returns a new object of class '<em>Key Value Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Value Int</em>'.
   * @generated
   */
  KeyValueInt createKeyValueInt();

  /**
   * Returns a new object of class '<em>Key Value String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Value String</em>'.
   * @generated
   */
  KeyValueString createKeyValueString();

  /**
   * Returns a new object of class '<em>Key Value Decimal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Value Decimal</em>'.
   * @generated
   */
  KeyValueDecimal createKeyValueDecimal();

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
