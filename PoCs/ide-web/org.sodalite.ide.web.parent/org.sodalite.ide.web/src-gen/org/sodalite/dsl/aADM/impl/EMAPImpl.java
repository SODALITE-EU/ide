/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.dsl.aADM.AADMPackage;
import org.sodalite.dsl.aADM.EMAP;
import org.sodalite.dsl.aADM.EMapEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EMAPImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMAPImpl extends EAssignmentValueImpl implements EMAP
{
  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected EList<EMapEntry> map;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMAPImpl()
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
    return AADMPackage.Literals.EMAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EMapEntry> getMap()
  {
    if (map == null)
    {
      map = new EObjectContainmentEList<EMapEntry>(EMapEntry.class, this, AADMPackage.EMAP__MAP);
    }
    return map;
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
      case AADMPackage.EMAP__MAP:
        return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
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
      case AADMPackage.EMAP__MAP:
        return getMap();
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
      case AADMPackage.EMAP__MAP:
        getMap().clear();
        getMap().addAll((Collection<? extends EMapEntry>)newValue);
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
      case AADMPackage.EMAP__MAP:
        getMap().clear();
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
      case AADMPackage.EMAP__MAP:
        return map != null && !map.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EMAPImpl