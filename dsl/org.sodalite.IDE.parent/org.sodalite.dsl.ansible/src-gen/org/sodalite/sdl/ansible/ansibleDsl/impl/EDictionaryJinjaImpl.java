/**
 * generated by Xtext 2.22.0
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
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryJinja;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairJinja;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDictionary Jinja</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryJinjaImpl#getDictionary_pairs <em>Dictionary pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDictionaryJinjaImpl extends EComposedValueJinjaImpl implements EDictionaryJinja
{
  /**
   * The cached value of the '{@link #getDictionary_pairs() <em>Dictionary pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictionary_pairs()
   * @generated
   * @ordered
   */
  protected EList<EDictionaryPairJinja> dictionary_pairs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EDictionaryJinjaImpl()
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
    return AnsibleDslPackage.Literals.EDICTIONARY_JINJA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EDictionaryPairJinja> getDictionary_pairs()
  {
    if (dictionary_pairs == null)
    {
      dictionary_pairs = new EObjectContainmentEList<EDictionaryPairJinja>(EDictionaryPairJinja.class, this, AnsibleDslPackage.EDICTIONARY_JINJA__DICTIONARY_PAIRS);
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
      case AnsibleDslPackage.EDICTIONARY_JINJA__DICTIONARY_PAIRS:
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
      case AnsibleDslPackage.EDICTIONARY_JINJA__DICTIONARY_PAIRS:
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
      case AnsibleDslPackage.EDICTIONARY_JINJA__DICTIONARY_PAIRS:
        getDictionary_pairs().clear();
        getDictionary_pairs().addAll((Collection<? extends EDictionaryPairJinja>)newValue);
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
      case AnsibleDslPackage.EDICTIONARY_JINJA__DICTIONARY_PAIRS:
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
      case AnsibleDslPackage.EDICTIONARY_JINJA__DICTIONARY_PAIRS:
        return dictionary_pairs != null && !dictionary_pairs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EDictionaryJinjaImpl
