/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

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

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EFunctionCall;
import org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement;
import org.sodalite.sdl.ansible.ansibleDsl.ETailElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETail Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETailElementImpl#getFunction_call <em>Function call</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETailElementImpl#getSquare_bracket_elements <em>Square bracket elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETailElementImpl extends MinimalEObjectImpl.Container implements ETailElement
{
  /**
   * The cached value of the '{@link #getFunction_call() <em>Function call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_call()
   * @generated
   * @ordered
   */
  protected EFunctionCall function_call;

  /**
   * The cached value of the '{@link #getSquare_bracket_elements() <em>Square bracket elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquare_bracket_elements()
   * @generated
   * @ordered
   */
  protected EList<ESquareBracketElement> square_bracket_elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETailElementImpl()
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
    return AnsibleDslPackage.Literals.ETAIL_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFunctionCall getFunction_call()
  {
    return function_call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction_call(EFunctionCall newFunction_call, NotificationChain msgs)
  {
    EFunctionCall oldFunction_call = function_call;
    function_call = newFunction_call;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL, oldFunction_call, newFunction_call);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunction_call(EFunctionCall newFunction_call)
  {
    if (newFunction_call != function_call)
    {
      NotificationChain msgs = null;
      if (function_call != null)
        msgs = ((InternalEObject)function_call).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL, null, msgs);
      if (newFunction_call != null)
        msgs = ((InternalEObject)newFunction_call).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL, null, msgs);
      msgs = basicSetFunction_call(newFunction_call, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL, newFunction_call, newFunction_call));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ESquareBracketElement> getSquare_bracket_elements()
  {
    if (square_bracket_elements == null)
    {
      square_bracket_elements = new EObjectContainmentEList<ESquareBracketElement>(ESquareBracketElement.class, this, AnsibleDslPackage.ETAIL_ELEMENT__SQUARE_BRACKET_ELEMENTS);
    }
    return square_bracket_elements;
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
      case AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL:
        return basicSetFunction_call(null, msgs);
      case AnsibleDslPackage.ETAIL_ELEMENT__SQUARE_BRACKET_ELEMENTS:
        return ((InternalEList<?>)getSquare_bracket_elements()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL:
        return getFunction_call();
      case AnsibleDslPackage.ETAIL_ELEMENT__SQUARE_BRACKET_ELEMENTS:
        return getSquare_bracket_elements();
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
      case AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL:
        setFunction_call((EFunctionCall)newValue);
        return;
      case AnsibleDslPackage.ETAIL_ELEMENT__SQUARE_BRACKET_ELEMENTS:
        getSquare_bracket_elements().clear();
        getSquare_bracket_elements().addAll((Collection<? extends ESquareBracketElement>)newValue);
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
      case AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL:
        setFunction_call((EFunctionCall)null);
        return;
      case AnsibleDslPackage.ETAIL_ELEMENT__SQUARE_BRACKET_ELEMENTS:
        getSquare_bracket_elements().clear();
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
      case AnsibleDslPackage.ETAIL_ELEMENT__FUNCTION_CALL:
        return function_call != null;
      case AnsibleDslPackage.ETAIL_ELEMENT__SQUARE_BRACKET_ELEMENTS:
        return square_bracket_elements != null && !square_bracket_elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ETailElementImpl
