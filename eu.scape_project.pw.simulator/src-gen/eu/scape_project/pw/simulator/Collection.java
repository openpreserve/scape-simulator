/**
 */
package eu.scape_project.pw.simulator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.Collection#getName <em>Name</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.Collection#getKeyValues <em>Key Values</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.Collection#getSubCollections <em>Sub Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.scape_project.pw.simulator.SimulatorPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends Entity
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
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getCollection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.scape_project.pw.simulator.Collection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Key Values</b></em>' containment reference list.
   * The list contents are of type {@link eu.scape_project.pw.simulator.KeyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Values</em>' containment reference list.
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getCollection_KeyValues()
   * @model containment="true"
   * @generated
   */
  EList<KeyValue> getKeyValues();

  /**
   * Returns the value of the '<em><b>Sub Collections</b></em>' containment reference list.
   * The list contents are of type {@link eu.scape_project.pw.simulator.Collection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Collections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Collections</em>' containment reference list.
   * @see eu.scape_project.pw.simulator.SimulatorPackage#getCollection_SubCollections()
   * @model containment="true"
   * @generated
   */
  EList<Collection> getSubCollections();

} // Collection
