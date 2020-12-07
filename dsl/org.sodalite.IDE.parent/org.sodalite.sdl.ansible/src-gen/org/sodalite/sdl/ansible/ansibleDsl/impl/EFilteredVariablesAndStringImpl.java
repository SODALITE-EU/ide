/**
 * generated by Xtext 2.23.0
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
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariableOrString;
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariablesAndString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFiltered Variables And String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredVariablesAndStringImpl#getVariable_and_string <em>Variable and string</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFilteredVariablesAndStringImpl extends EValueImpl implements EFilteredVariablesAndString
{
  /**
   * The cached value of the '{@link #getVariable_and_string() <em>Variable and string</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_and_string()
   * @generated
   * @ordered
   */
  protected EList<EFilteredVariableOrString> variable_and_string;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EFilteredVariablesAndStringImpl()
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
    return AnsibleDslPackage.Literals.EFILTERED_VARIABLES_AND_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EFilteredVariableOrString> getVariable_and_string()
  {
    if (variable_and_string == null)
    {
      variable_and_string = new EObjectContainmentEList<EFilteredVariableOrString>(EFilteredVariableOrString.class, this, AnsibleDslPackage.EFILTERED_VARIABLES_AND_STRING__VARIABLE_AND_STRING);
    }
    return variable_and_string;
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
      case AnsibleDslPackage.EFILTERED_VARIABLES_AND_STRING__VARIABLE_AND_STRING:
        return ((InternalEList<?>)getVariable_and_string()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EFILTERED_VARIABLES_AND_STRING__VARIABLE_AND_STRING:
        return getVariable_and_string();
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
      case AnsibleDslPackage.EFILTERED_VARIABLES_AND_STRING__VARIABLE_AND_STRING:
        getVariable_and_string().clear();
        getVariable_and_string().addAll((Collection<? extends EFilteredVariableOrString>)newValue);
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
      case AnsibleDslPackage.EFILTERED_VARIABLES_AND_STRING__VARIABLE_AND_STRING:
        getVariable_and_string().clear();
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
      case AnsibleDslPackage.EFILTERED_VARIABLES_AND_STRING__VARIABLE_AND_STRING:
        return variable_and_string != null && !variable_and_string.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EFilteredVariablesAndStringImpl