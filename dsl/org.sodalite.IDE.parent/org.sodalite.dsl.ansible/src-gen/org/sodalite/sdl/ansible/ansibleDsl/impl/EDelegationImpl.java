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
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EDelegation;
import org.sodalite.sdl.ansible.ansibleDsl.EStringPassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDelegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EDelegationImpl#getDelegate_to <em>Delegate to</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EDelegationImpl#getDelegate_facts <em>Delegate facts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDelegationImpl extends MinimalEObjectImpl.Container implements EDelegation
{
  /**
   * The cached value of the '{@link #getDelegate_to() <em>Delegate to</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegate_to()
   * @generated
   * @ordered
   */
  protected EStringPassed delegate_to;

  /**
   * The cached value of the '{@link #getDelegate_facts() <em>Delegate facts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegate_facts()
   * @generated
   * @ordered
   */
  protected EBooleanPassed delegate_facts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EDelegationImpl()
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
    return AnsibleDslPackage.Literals.EDELEGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getDelegate_to()
  {
    return delegate_to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelegate_to(EStringPassed newDelegate_to, NotificationChain msgs)
  {
    EStringPassed oldDelegate_to = delegate_to;
    delegate_to = newDelegate_to;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EDELEGATION__DELEGATE_TO, oldDelegate_to, newDelegate_to);
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
  public void setDelegate_to(EStringPassed newDelegate_to)
  {
    if (newDelegate_to != delegate_to)
    {
      NotificationChain msgs = null;
      if (delegate_to != null)
        msgs = ((InternalEObject)delegate_to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EDELEGATION__DELEGATE_TO, null, msgs);
      if (newDelegate_to != null)
        msgs = ((InternalEObject)newDelegate_to).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EDELEGATION__DELEGATE_TO, null, msgs);
      msgs = basicSetDelegate_to(newDelegate_to, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EDELEGATION__DELEGATE_TO, newDelegate_to, newDelegate_to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanPassed getDelegate_facts()
  {
    return delegate_facts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelegate_facts(EBooleanPassed newDelegate_facts, NotificationChain msgs)
  {
    EBooleanPassed oldDelegate_facts = delegate_facts;
    delegate_facts = newDelegate_facts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS, oldDelegate_facts, newDelegate_facts);
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
  public void setDelegate_facts(EBooleanPassed newDelegate_facts)
  {
    if (newDelegate_facts != delegate_facts)
    {
      NotificationChain msgs = null;
      if (delegate_facts != null)
        msgs = ((InternalEObject)delegate_facts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS, null, msgs);
      if (newDelegate_facts != null)
        msgs = ((InternalEObject)newDelegate_facts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS, null, msgs);
      msgs = basicSetDelegate_facts(newDelegate_facts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS, newDelegate_facts, newDelegate_facts));
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        return basicSetDelegate_to(null, msgs);
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        return basicSetDelegate_facts(null, msgs);
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        return getDelegate_to();
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        return getDelegate_facts();
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        setDelegate_to((EStringPassed)newValue);
        return;
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        setDelegate_facts((EBooleanPassed)newValue);
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        setDelegate_to((EStringPassed)null);
        return;
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        setDelegate_facts((EBooleanPassed)null);
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        return delegate_to != null;
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        return delegate_facts != null;
    }
    return super.eIsSet(featureID);
  }

} //EDelegationImpl
