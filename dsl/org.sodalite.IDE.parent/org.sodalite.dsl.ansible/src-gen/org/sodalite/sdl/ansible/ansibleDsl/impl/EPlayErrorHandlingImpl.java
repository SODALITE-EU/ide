/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.ENumberPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EPlayErrorHandling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPlay Error Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayErrorHandlingImpl#getMax_fail_percentage <em>Max fail percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPlayErrorHandlingImpl extends EErrorHandlingImpl implements EPlayErrorHandling
{
  /**
   * The cached value of the '{@link #getMax_fail_percentage() <em>Max fail percentage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_fail_percentage()
   * @generated
   * @ordered
   */
  protected ENumberPassed max_fail_percentage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPlayErrorHandlingImpl()
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
    return AnsibleDslPackage.Literals.EPLAY_ERROR_HANDLING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENumberPassed getMax_fail_percentage()
  {
    return max_fail_percentage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax_fail_percentage(ENumberPassed newMax_fail_percentage, NotificationChain msgs)
  {
    ENumberPassed oldMax_fail_percentage = max_fail_percentage;
    max_fail_percentage = newMax_fail_percentage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE, oldMax_fail_percentage, newMax_fail_percentage);
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
  public void setMax_fail_percentage(ENumberPassed newMax_fail_percentage)
  {
    if (newMax_fail_percentage != max_fail_percentage)
    {
      NotificationChain msgs = null;
      if (max_fail_percentage != null)
        msgs = ((InternalEObject)max_fail_percentage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE, null, msgs);
      if (newMax_fail_percentage != null)
        msgs = ((InternalEObject)newMax_fail_percentage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE, null, msgs);
      msgs = basicSetMax_fail_percentage(newMax_fail_percentage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE, newMax_fail_percentage, newMax_fail_percentage));
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
      case AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE:
        return basicSetMax_fail_percentage(null, msgs);
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
      case AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE:
        return getMax_fail_percentage();
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
      case AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE:
        setMax_fail_percentage((ENumberPassed)newValue);
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
      case AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE:
        setMax_fail_percentage((ENumberPassed)null);
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
      case AnsibleDslPackage.EPLAY_ERROR_HANDLING__MAX_FAIL_PERCENTAGE:
        return max_fail_percentage != null;
    }
    return super.eIsSet(featureID);
  }

} //EPlayErrorHandlingImpl
