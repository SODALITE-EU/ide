/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionary;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryImpl#getDictionary_pairs <em>Dictionary pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDictionaryImpl extends EComposedValueImpl implements EDictionary
{
  /**
   * The cached value of the '{@link #getDictionary_pairs() <em>Dictionary pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictionary_pairs()
   * @generated
   * @ordered
   */
  protected EList<EDictionaryPair> dictionary_pairs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EDictionaryImpl()
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
    return AnsibleDslPackage.Literals.EDICTIONARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EDictionaryPair> getDictionary_pairs()
  {
    if (dictionary_pairs == null)
    {
      dictionary_pairs = new EObjectContainmentEList<EDictionaryPair>(EDictionaryPair.class, this, AnsibleDslPackage.EDICTIONARY__DICTIONARY_PAIRS);
    }
    return dictionary_pairs;
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
      case AnsibleDslPackage.EDICTIONARY__DICTIONARY_PAIRS:
        return ((InternalEList<?>)getDictionary_pairs()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EDICTIONARY__DICTIONARY_PAIRS:
        return getDictionary_pairs();
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
      case AnsibleDslPackage.EDICTIONARY__DICTIONARY_PAIRS:
        getDictionary_pairs().clear();
        getDictionary_pairs().addAll((Collection<? extends EDictionaryPair>)newValue);
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
      case AnsibleDslPackage.EDICTIONARY__DICTIONARY_PAIRS:
        getDictionary_pairs().clear();
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
      case AnsibleDslPackage.EDICTIONARY__DICTIONARY_PAIRS:
        return dictionary_pairs != null && !dictionary_pairs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EDictionaryImpl
