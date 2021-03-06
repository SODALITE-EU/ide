/**
 * generated by Xtext 2.22.0
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

import org.sodalite.dsl.rM.EArtifactType;
import org.sodalite.dsl.rM.EArtifactTypes;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EArtifact Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EArtifactTypesImpl#getArtifactTypes <em>Artifact Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EArtifactTypesImpl extends MinimalEObjectImpl.Container implements EArtifactTypes
{
  /**
   * The cached value of the '{@link #getArtifactTypes() <em>Artifact Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactTypes()
   * @generated
   * @ordered
   */
  protected EList<EArtifactType> artifactTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EArtifactTypesImpl()
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
    return RMPackage.Literals.EARTIFACT_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EArtifactType> getArtifactTypes()
  {
    if (artifactTypes == null)
    {
      artifactTypes = new EObjectContainmentEList<EArtifactType>(EArtifactType.class, this, RMPackage.EARTIFACT_TYPES__ARTIFACT_TYPES);
    }
    return artifactTypes;
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
      case RMPackage.EARTIFACT_TYPES__ARTIFACT_TYPES:
        return ((InternalEList<?>)getArtifactTypes()).basicRemove(otherEnd, msgs);
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
      case RMPackage.EARTIFACT_TYPES__ARTIFACT_TYPES:
        return getArtifactTypes();
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
      case RMPackage.EARTIFACT_TYPES__ARTIFACT_TYPES:
        getArtifactTypes().clear();
        getArtifactTypes().addAll((Collection<? extends EArtifactType>)newValue);
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
      case RMPackage.EARTIFACT_TYPES__ARTIFACT_TYPES:
        getArtifactTypes().clear();
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
      case RMPackage.EARTIFACT_TYPES__ARTIFACT_TYPES:
        return artifactTypes != null && !artifactTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EArtifactTypesImpl
