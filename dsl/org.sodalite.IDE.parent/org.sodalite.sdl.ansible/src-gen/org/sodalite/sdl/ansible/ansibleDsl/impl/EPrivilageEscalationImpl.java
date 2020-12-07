/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EPrivilageEscalation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPrivilage Escalation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilageEscalationImpl#getBecome <em>Become</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilageEscalationImpl#getBecome_exe <em>Become exe</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilageEscalationImpl#getBecome_flags <em>Become flags</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilageEscalationImpl#getBecome_method <em>Become method</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPrivilageEscalationImpl#getBecome_user <em>Become user</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPrivilageEscalationImpl extends MinimalEObjectImpl.Container implements EPrivilageEscalation
{
  /**
   * The default value of the '{@link #getBecome() <em>Become</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome()
   * @generated
   * @ordered
   */
  protected static final String BECOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBecome() <em>Become</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome()
   * @generated
   * @ordered
   */
  protected String become = BECOME_EDEFAULT;

  /**
   * The default value of the '{@link #getBecome_exe() <em>Become exe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_exe()
   * @generated
   * @ordered
   */
  protected static final String BECOME_EXE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBecome_exe() <em>Become exe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_exe()
   * @generated
   * @ordered
   */
  protected String become_exe = BECOME_EXE_EDEFAULT;

  /**
   * The default value of the '{@link #getBecome_flags() <em>Become flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_flags()
   * @generated
   * @ordered
   */
  protected static final String BECOME_FLAGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBecome_flags() <em>Become flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_flags()
   * @generated
   * @ordered
   */
  protected String become_flags = BECOME_FLAGS_EDEFAULT;

  /**
   * The default value of the '{@link #getBecome_method() <em>Become method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_method()
   * @generated
   * @ordered
   */
  protected static final String BECOME_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBecome_method() <em>Become method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_method()
   * @generated
   * @ordered
   */
  protected String become_method = BECOME_METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getBecome_user() <em>Become user</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_user()
   * @generated
   * @ordered
   */
  protected static final String BECOME_USER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBecome_user() <em>Become user</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecome_user()
   * @generated
   * @ordered
   */
  protected String become_user = BECOME_USER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPrivilageEscalationImpl()
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
    return AnsibleDslPackage.Literals.EPRIVILAGE_ESCALATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBecome()
  {
    return become;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBecome(String newBecome)
  {
    String oldBecome = become;
    become = newBecome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME, oldBecome, become));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBecome_exe()
  {
    return become_exe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBecome_exe(String newBecome_exe)
  {
    String oldBecome_exe = become_exe;
    become_exe = newBecome_exe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_EXE, oldBecome_exe, become_exe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBecome_flags()
  {
    return become_flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBecome_flags(String newBecome_flags)
  {
    String oldBecome_flags = become_flags;
    become_flags = newBecome_flags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_FLAGS, oldBecome_flags, become_flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBecome_method()
  {
    return become_method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBecome_method(String newBecome_method)
  {
    String oldBecome_method = become_method;
    become_method = newBecome_method;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_METHOD, oldBecome_method, become_method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBecome_user()
  {
    return become_user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBecome_user(String newBecome_user)
  {
    String oldBecome_user = become_user;
    become_user = newBecome_user;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_USER, oldBecome_user, become_user));
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
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME:
        return getBecome();
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_EXE:
        return getBecome_exe();
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_FLAGS:
        return getBecome_flags();
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_METHOD:
        return getBecome_method();
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_USER:
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
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME:
        setBecome((String)newValue);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_EXE:
        setBecome_exe((String)newValue);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_FLAGS:
        setBecome_flags((String)newValue);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_METHOD:
        setBecome_method((String)newValue);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_USER:
        setBecome_user((String)newValue);
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
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME:
        setBecome(BECOME_EDEFAULT);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_EXE:
        setBecome_exe(BECOME_EXE_EDEFAULT);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_FLAGS:
        setBecome_flags(BECOME_FLAGS_EDEFAULT);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_METHOD:
        setBecome_method(BECOME_METHOD_EDEFAULT);
        return;
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_USER:
        setBecome_user(BECOME_USER_EDEFAULT);
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
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME:
        return BECOME_EDEFAULT == null ? become != null : !BECOME_EDEFAULT.equals(become);
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_EXE:
        return BECOME_EXE_EDEFAULT == null ? become_exe != null : !BECOME_EXE_EDEFAULT.equals(become_exe);
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_FLAGS:
        return BECOME_FLAGS_EDEFAULT == null ? become_flags != null : !BECOME_FLAGS_EDEFAULT.equals(become_flags);
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_METHOD:
        return BECOME_METHOD_EDEFAULT == null ? become_method != null : !BECOME_METHOD_EDEFAULT.equals(become_method);
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION__BECOME_USER:
        return BECOME_USER_EDEFAULT == null ? become_user != null : !BECOME_USER_EDEFAULT.equals(become_user);
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
    result.append(" (become: ");
    result.append(become);
    result.append(", become_exe: ");
    result.append(become_exe);
    result.append(", become_flags: ");
    result.append(become_flags);
    result.append(", become_method: ");
    result.append(become_method);
    result.append(", become_user: ");
    result.append(become_user);
    result.append(')');
    return result.toString();
  }

} //EPrivilageEscalationImpl