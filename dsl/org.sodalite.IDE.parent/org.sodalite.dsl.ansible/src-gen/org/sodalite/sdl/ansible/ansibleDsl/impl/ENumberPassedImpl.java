/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.ENumber;
import org.sodalite.sdl.ansible.ansibleDsl.ENumberPassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENumber Passed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ENumberPassedImpl#getNumber_passed <em>Number passed</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ENumberPassedImpl#getNumber_passed_null <em>Number passed null</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENumberPassedImpl extends MinimalEObjectImpl.Container implements ENumberPassed
{
  /**
   * The cached value of the '{@link #getNumber_passed() <em>Number passed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_passed()
   * @generated
   * @ordered
   */
  protected ENumber number_passed;

  /**
   * The default value of the '{@link #getNumber_passed_null() <em>Number passed null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_passed_null()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_PASSED_NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumber_passed_null() <em>Number passed null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_passed_null()
   * @generated
   * @ordered
   */
  protected String number_passed_null = NUMBER_PASSED_NULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENumberPassedImpl()
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
    return AnsibleDslPackage.Literals.ENUMBER_PASSED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENumber getNumber_passed()
  {
    return number_passed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber_passed(ENumber newNumber_passed, NotificationChain msgs)
  {
    ENumber oldNumber_passed = number_passed;
    number_passed = newNumber_passed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED, oldNumber_passed, newNumber_passed);
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
  public void setNumber_passed(ENumber newNumber_passed)
  {
    if (newNumber_passed != number_passed)
    {
      NotificationChain msgs = null;
      if (number_passed != null)
        msgs = ((InternalEObject)number_passed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED, null, msgs);
      if (newNumber_passed != null)
        msgs = ((InternalEObject)newNumber_passed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED, null, msgs);
      msgs = basicSetNumber_passed(newNumber_passed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED, newNumber_passed, newNumber_passed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNumber_passed_null()
  {
    return number_passed_null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber_passed_null(String newNumber_passed_null)
  {
    String oldNumber_passed_null = number_passed_null;
    number_passed_null = newNumber_passed_null;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED_NULL, oldNumber_passed_null, number_passed_null));
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
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED:
        return basicSetNumber_passed(null, msgs);
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
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED:
        return getNumber_passed();
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED_NULL:
        return getNumber_passed_null();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED:
        setNumber_passed((ENumber)newValue);
        return;
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED_NULL:
        setNumber_passed_null((String)newValue);
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
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED:
        setNumber_passed((ENumber)null);
        return;
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED_NULL:
        setNumber_passed_null(NUMBER_PASSED_NULL_EDEFAULT);
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
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED:
        return number_passed != null;
      case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED_NULL:
        return NUMBER_PASSED_NULL_EDEFAULT == null ? number_passed_null != null : !NUMBER_PASSED_NULL_EDEFAULT.equals(number_passed_null);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (number_passed_null: ");
    result.append(number_passed_null);
    result.append(')');
    return result.toString();
  }

} //ENumberPassedImpl
