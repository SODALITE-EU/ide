/**
 * generated by Xtext 2.22.0
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
import org.sodalite.sdl.ansible.ansibleDsl.EPrivilegeEscalation;
import org.sodalite.sdl.ansible.ansibleDsl.EStringPassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPrivilege Escalation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilegeEscalationImpl#getBecome <em>Become</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilegeEscalationImpl#getBecome_exe <em>Become exe</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilegeEscalationImpl#getBecome_flags <em>Become flags</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilegeEscalationImpl#getBecome_method <em>Become method</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilegeEscalationImpl#getBecome_user <em>Become user</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPrivilegeEscalationImpl extends MinimalEObjectImpl.Container implements EPrivilegeEscalation
{
  /**
   * The cached value of the '{@link #getBecome() <em>Become</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome()
   * @generated
   * @ordered
   */
  protected EBooleanPassed become;

  /**
   * The cached value of the '{@link #getBecome_exe() <em>Become exe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_exe()
   * @generated
   * @ordered
   */
  protected EStringPassed become_exe;

  /**
   * The cached value of the '{@link #getBecome_flags() <em>Become flags</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_flags()
   * @generated
   * @ordered
   */
  protected EStringPassed become_flags;

  /**
   * The cached value of the '{@link #getBecome_method() <em>Become method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_method()
   * @generated
   * @ordered
   */
  protected EStringPassed become_method;

  /**
   * The cached value of the '{@link #getBecome_user() <em>Become user</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_user()
   * @generated
   * @ordered
   */
  protected EStringPassed become_user;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPrivilegeEscalationImpl()
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
    return AnsibleDslPackage.Literals.EPRIVILEGE_ESCALATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanPassed getBecome()
  {
    return become;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecome(EBooleanPassed newBecome, NotificationChain msgs)
  {
    EBooleanPassed oldBecome = become;
    become = newBecome;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME, oldBecome, newBecome);
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
  public void setBecome(EBooleanPassed newBecome)
  {
    if (newBecome != become)
    {
      NotificationChain msgs = null;
      if (become != null)
        msgs = ((InternalEObject)become).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME, null, msgs);
      if (newBecome != null)
        msgs = ((InternalEObject)newBecome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME, null, msgs);
      msgs = basicSetBecome(newBecome, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME, newBecome, newBecome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getBecome_exe()
  {
    return become_exe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecome_exe(EStringPassed newBecome_exe, NotificationChain msgs)
  {
    EStringPassed oldBecome_exe = become_exe;
    become_exe = newBecome_exe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE, oldBecome_exe, newBecome_exe);
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
  public void setBecome_exe(EStringPassed newBecome_exe)
  {
    if (newBecome_exe != become_exe)
    {
      NotificationChain msgs = null;
      if (become_exe != null)
        msgs = ((InternalEObject)become_exe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE, null, msgs);
      if (newBecome_exe != null)
        msgs = ((InternalEObject)newBecome_exe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE, null, msgs);
      msgs = basicSetBecome_exe(newBecome_exe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE, newBecome_exe, newBecome_exe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getBecome_flags()
  {
    return become_flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecome_flags(EStringPassed newBecome_flags, NotificationChain msgs)
  {
    EStringPassed oldBecome_flags = become_flags;
    become_flags = newBecome_flags;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS, oldBecome_flags, newBecome_flags);
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
  public void setBecome_flags(EStringPassed newBecome_flags)
  {
    if (newBecome_flags != become_flags)
    {
      NotificationChain msgs = null;
      if (become_flags != null)
        msgs = ((InternalEObject)become_flags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS, null, msgs);
      if (newBecome_flags != null)
        msgs = ((InternalEObject)newBecome_flags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS, null, msgs);
      msgs = basicSetBecome_flags(newBecome_flags, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS, newBecome_flags, newBecome_flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getBecome_method()
  {
    return become_method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecome_method(EStringPassed newBecome_method, NotificationChain msgs)
  {
    EStringPassed oldBecome_method = become_method;
    become_method = newBecome_method;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD, oldBecome_method, newBecome_method);
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
  public void setBecome_method(EStringPassed newBecome_method)
  {
    if (newBecome_method != become_method)
    {
      NotificationChain msgs = null;
      if (become_method != null)
        msgs = ((InternalEObject)become_method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD, null, msgs);
      if (newBecome_method != null)
        msgs = ((InternalEObject)newBecome_method).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD, null, msgs);
      msgs = basicSetBecome_method(newBecome_method, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD, newBecome_method, newBecome_method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getBecome_user()
  {
    return become_user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecome_user(EStringPassed newBecome_user, NotificationChain msgs)
  {
    EStringPassed oldBecome_user = become_user;
    become_user = newBecome_user;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER, oldBecome_user, newBecome_user);
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
  public void setBecome_user(EStringPassed newBecome_user)
  {
    if (newBecome_user != become_user)
    {
      NotificationChain msgs = null;
      if (become_user != null)
        msgs = ((InternalEObject)become_user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER, null, msgs);
      if (newBecome_user != null)
        msgs = ((InternalEObject)newBecome_user).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER, null, msgs);
      msgs = basicSetBecome_user(newBecome_user, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER, newBecome_user, newBecome_user));
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
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME:
        return basicSetBecome(null, msgs);
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE:
        return basicSetBecome_exe(null, msgs);
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS:
        return basicSetBecome_flags(null, msgs);
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD:
        return basicSetBecome_method(null, msgs);
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER:
        return basicSetBecome_user(null, msgs);
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
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME:
        return getBecome();
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE:
        return getBecome_exe();
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS:
        return getBecome_flags();
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD:
        return getBecome_method();
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER:
        return getBecome_user();
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
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME:
        setBecome((EBooleanPassed)newValue);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE:
        setBecome_exe((EStringPassed)newValue);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS:
        setBecome_flags((EStringPassed)newValue);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD:
        setBecome_method((EStringPassed)newValue);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER:
        setBecome_user((EStringPassed)newValue);
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
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME:
        setBecome((EBooleanPassed)null);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE:
        setBecome_exe((EStringPassed)null);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS:
        setBecome_flags((EStringPassed)null);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD:
        setBecome_method((EStringPassed)null);
        return;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER:
        setBecome_user((EStringPassed)null);
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
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME:
        return become != null;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_EXE:
        return become_exe != null;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_FLAGS:
        return become_flags != null;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_METHOD:
        return become_method != null;
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION__BECOME_USER:
        return become_user != null;
    }
    return super.eIsSet(featureID);
  }

} //EPrivilegeEscalationImpl
