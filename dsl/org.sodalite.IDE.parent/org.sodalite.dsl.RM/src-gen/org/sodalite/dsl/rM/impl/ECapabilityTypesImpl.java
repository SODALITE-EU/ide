/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.dsl.rM.ECapabilityType;
import org.sodalite.dsl.rM.ECapabilityTypes;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECapability Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECapabilityTypesImpl#getCapabilityTypes <em>Capability Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECapabilityTypesImpl extends MinimalEObjectImpl.Container implements ECapabilityTypes
{
  /**
   * The cached value of the '{@link #getCapabilityTypes() <em>Capability Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilityTypes()
   * @generated
   * @ordered
   */
  protected EList<ECapabilityType> capabilityTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECapabilityTypesImpl()
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
    return RMPackage.Literals.ECAPABILITY_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ECapabilityType> getCapabilityTypes()
  {
    if (capabilityTypes == null)
    {
      capabilityTypes = new EObjectContainmentEList<ECapabilityType>(ECapabilityType.class, this, RMPackage.ECAPABILITY_TYPES__CAPABILITY_TYPES);
    }
    return capabilityTypes;
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
      case RMPackage.ECAPABILITY_TYPES__CAPABILITY_TYPES:
        return ((InternalEList<?>)getCapabilityTypes()).basicRemove(otherEnd, msgs);
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
      case RMPackage.ECAPABILITY_TYPES__CAPABILITY_TYPES:
        return getCapabilityTypes();
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
      case RMPackage.ECAPABILITY_TYPES__CAPABILITY_TYPES:
        getCapabilityTypes().clear();
        getCapabilityTypes().addAll((Collection<? extends ECapabilityType>)newValue);
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
      case RMPackage.ECAPABILITY_TYPES__CAPABILITY_TYPES:
        getCapabilityTypes().clear();
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
      case RMPackage.ECAPABILITY_TYPES__CAPABILITY_TYPES:
        return capabilityTypes != null && !capabilityTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ECapabilityTypesImpl