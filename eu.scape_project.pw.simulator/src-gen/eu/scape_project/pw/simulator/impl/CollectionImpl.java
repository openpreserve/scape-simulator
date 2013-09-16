/**
 */
package eu.scape_project.pw.simulator.impl;

import eu.scape_project.pw.simulator.Collection;
import eu.scape_project.pw.simulator.KeyValue;
import eu.scape_project.pw.simulator.SimulatorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.scape_project.pw.simulator.impl.CollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.CollectionImpl#getKeyValues <em>Key Values</em>}</li>
 *   <li>{@link eu.scape_project.pw.simulator.impl.CollectionImpl#getSubCollections <em>Sub Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionImpl extends EntityImpl implements Collection
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getKeyValues() <em>Key Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyValues()
   * @generated
   * @ordered
   */
  protected EList<KeyValue> keyValues;

  /**
   * The cached value of the '{@link #getSubCollections() <em>Sub Collections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubCollections()
   * @generated
   * @ordered
   */
  protected EList<Collection> subCollections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimulatorPackage.Literals.COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.COLLECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KeyValue> getKeyValues()
  {
    if (keyValues == null)
    {
      keyValues = new EObjectContainmentEList<KeyValue>(KeyValue.class, this, SimulatorPackage.COLLECTION__KEY_VALUES);
    }
    return keyValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Collection> getSubCollections()
  {
    if (subCollections == null)
    {
      subCollections = new EObjectContainmentEList<Collection>(Collection.class, this, SimulatorPackage.COLLECTION__SUB_COLLECTIONS);
    }
    return subCollections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimulatorPackage.COLLECTION__KEY_VALUES:
        return ((InternalEList<?>)getKeyValues()).basicRemove(otherEnd, msgs);
      case SimulatorPackage.COLLECTION__SUB_COLLECTIONS:
        return ((InternalEList<?>)getSubCollections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimulatorPackage.COLLECTION__NAME:
        return getName();
      case SimulatorPackage.COLLECTION__KEY_VALUES:
        return getKeyValues();
      case SimulatorPackage.COLLECTION__SUB_COLLECTIONS:
        return getSubCollections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimulatorPackage.COLLECTION__NAME:
        setName((String)newValue);
        return;
      case SimulatorPackage.COLLECTION__KEY_VALUES:
        getKeyValues().clear();
        getKeyValues().addAll((java.util.Collection<? extends KeyValue>)newValue);
        return;
      case SimulatorPackage.COLLECTION__SUB_COLLECTIONS:
        getSubCollections().clear();
        getSubCollections().addAll((java.util.Collection<? extends Collection>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimulatorPackage.COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimulatorPackage.COLLECTION__KEY_VALUES:
        getKeyValues().clear();
        return;
      case SimulatorPackage.COLLECTION__SUB_COLLECTIONS:
        getSubCollections().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimulatorPackage.COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimulatorPackage.COLLECTION__KEY_VALUES:
        return keyValues != null && !keyValues.isEmpty();
      case SimulatorPackage.COLLECTION__SUB_COLLECTIONS:
        return subCollections != null && !subCollections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CollectionImpl
