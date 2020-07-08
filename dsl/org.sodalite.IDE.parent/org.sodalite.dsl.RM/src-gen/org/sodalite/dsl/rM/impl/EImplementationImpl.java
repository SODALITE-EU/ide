/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.dsl.rM.EDependencies;
import org.sodalite.dsl.rM.EImplementation;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EImplementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EImplementationImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EImplementationImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EImplementationImpl extends MinimalEObjectImpl.Container implements EImplementation
{
  /**
   * The default value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected static final String PRIMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected String primary = PRIMARY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<EDependencies> dependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EImplementationImpl()
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
    return RMPackage.Literals.EIMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(String newPrimary)
  {
    String oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EIMPLEMENTATION__PRIMARY, oldPrimary, primary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EDependencies> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<EDependencies>(EDependencies.class, this, RMPackage.EIMPLEMENTATION__DEPENDENCIES);
    }
    return dependencies;
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
      case RMPackage.EIMPLEMENTATION__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
      case RMPackage.EIMPLEMENTATION__PRIMARY:
        return getPrimary();
      case RMPackage.EIMPLEMENTATION__DEPENDENCIES:
        return getDependencies();
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
      case RMPackage.EIMPLEMENTATION__PRIMARY:
        setPrimary((String)newValue);
        return;
      case RMPackage.EIMPLEMENTATION__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends EDependencies>)newValue);
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
      case RMPackage.EIMPLEMENTATION__PRIMARY:
        setPrimary(PRIMARY_EDEFAULT);
        return;
      case RMPackage.EIMPLEMENTATION__DEPENDENCIES:
        getDependencies().clear();
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
      case RMPackage.EIMPLEMENTATION__PRIMARY:
        return PRIMARY_EDEFAULT == null ? primary != null : !PRIMARY_EDEFAULT.equals(primary);
      case RMPackage.EIMPLEMENTATION__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
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
    result.append(" (primary: ");
    result.append(primary);
    result.append(')');
    return result.toString();
  }

} //EImplementationImpl
