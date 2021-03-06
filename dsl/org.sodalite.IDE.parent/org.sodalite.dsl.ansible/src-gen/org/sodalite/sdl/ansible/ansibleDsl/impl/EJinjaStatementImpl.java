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
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanAnsible;
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaStatement;
import org.sodalite.sdl.ansible.ansibleDsl.EListPassed;
import org.sodalite.sdl.ansible.ansibleDsl.ENumber;
import org.sodalite.sdl.ansible.ansibleDsl.ENumberPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EJinja Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaStatementImpl#getNumber_passed <em>Number passed</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaStatementImpl#getNumber_passed_null <em>Number passed null</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaStatementImpl#getBoolean_passed <em>Boolean passed</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaStatementImpl#getBoolean_passed_null <em>Boolean passed null</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaStatementImpl#getElse_block_sign <em>Else block sign</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaStatementImpl#getElse_body <em>Else body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EJinjaStatementImpl extends EJinjaOrStringImpl implements EJinjaStatement
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
   * The cached value of the '{@link #getBoolean_passed() <em>Boolean passed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed()
   * @generated
   * @ordered
   */
  protected EBooleanAnsible boolean_passed;

  /**
   * The default value of the '{@link #getBoolean_passed_null() <em>Boolean passed null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed_null()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_PASSED_NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolean_passed_null() <em>Boolean passed null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed_null()
   * @generated
   * @ordered
   */
  protected String boolean_passed_null = BOOLEAN_PASSED_NULL_EDEFAULT;

  /**
   * The default value of the '{@link #getElse_block_sign() <em>Else block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse_block_sign()
   * @generated
   * @ordered
   */
  protected static final String ELSE_BLOCK_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElse_block_sign() <em>Else block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse_block_sign()
   * @generated
   * @ordered
   */
  protected String else_block_sign = ELSE_BLOCK_SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getElse_body() <em>Else body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse_body()
   * @generated
   * @ordered
   */
  protected EValuePassed else_body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EJinjaStatementImpl()
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
    return AnsibleDslPackage.Literals.EJINJA_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED, oldNumber_passed, newNumber_passed);
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
        msgs = ((InternalEObject)number_passed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED, null, msgs);
      if (newNumber_passed != null)
        msgs = ((InternalEObject)newNumber_passed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED, null, msgs);
      msgs = basicSetNumber_passed(newNumber_passed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED, newNumber_passed, newNumber_passed));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED_NULL, oldNumber_passed_null, number_passed_null));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanAnsible getBoolean_passed()
  {
    return boolean_passed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoolean_passed(EBooleanAnsible newBoolean_passed, NotificationChain msgs)
  {
    EBooleanAnsible oldBoolean_passed = boolean_passed;
    boolean_passed = newBoolean_passed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED, oldBoolean_passed, newBoolean_passed);
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
  public void setBoolean_passed(EBooleanAnsible newBoolean_passed)
  {
    if (newBoolean_passed != boolean_passed)
    {
      NotificationChain msgs = null;
      if (boolean_passed != null)
        msgs = ((InternalEObject)boolean_passed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED, null, msgs);
      if (newBoolean_passed != null)
        msgs = ((InternalEObject)newBoolean_passed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED, null, msgs);
      msgs = basicSetBoolean_passed(newBoolean_passed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED, newBoolean_passed, newBoolean_passed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoolean_passed_null()
  {
    return boolean_passed_null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolean_passed_null(String newBoolean_passed_null)
  {
    String oldBoolean_passed_null = boolean_passed_null;
    boolean_passed_null = newBoolean_passed_null;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED_NULL, oldBoolean_passed_null, boolean_passed_null));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getElse_block_sign()
  {
    return else_block_sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElse_block_sign(String newElse_block_sign)
  {
    String oldElse_block_sign = else_block_sign;
    else_block_sign = newElse_block_sign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BLOCK_SIGN, oldElse_block_sign, else_block_sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassed getElse_body()
  {
    return else_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse_body(EValuePassed newElse_body, NotificationChain msgs)
  {
    EValuePassed oldElse_body = else_body;
    else_body = newElse_body;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY, oldElse_body, newElse_body);
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
  public void setElse_body(EValuePassed newElse_body)
  {
    if (newElse_body != else_body)
    {
      NotificationChain msgs = null;
      if (else_body != null)
        msgs = ((InternalEObject)else_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY, null, msgs);
      if (newElse_body != null)
        msgs = ((InternalEObject)newElse_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY, null, msgs);
      msgs = basicSetElse_body(newElse_body, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY, newElse_body, newElse_body));
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
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED:
        return basicSetNumber_passed(null, msgs);
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED:
        return basicSetBoolean_passed(null, msgs);
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY:
        return basicSetElse_body(null, msgs);
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
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED:
        return getNumber_passed();
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED_NULL:
        return getNumber_passed_null();
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED:
        return getBoolean_passed();
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED_NULL:
        return getBoolean_passed_null();
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BLOCK_SIGN:
        return getElse_block_sign();
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY:
        return getElse_body();
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
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED:
        setNumber_passed((ENumber)newValue);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED_NULL:
        setNumber_passed_null((String)newValue);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED:
        setBoolean_passed((EBooleanAnsible)newValue);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED_NULL:
        setBoolean_passed_null((String)newValue);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BLOCK_SIGN:
        setElse_block_sign((String)newValue);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY:
        setElse_body((EValuePassed)newValue);
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
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED:
        setNumber_passed((ENumber)null);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED_NULL:
        setNumber_passed_null(NUMBER_PASSED_NULL_EDEFAULT);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED:
        setBoolean_passed((EBooleanAnsible)null);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED_NULL:
        setBoolean_passed_null(BOOLEAN_PASSED_NULL_EDEFAULT);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BLOCK_SIGN:
        setElse_block_sign(ELSE_BLOCK_SIGN_EDEFAULT);
        return;
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY:
        setElse_body((EValuePassed)null);
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
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED:
        return number_passed != null;
      case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED_NULL:
        return NUMBER_PASSED_NULL_EDEFAULT == null ? number_passed_null != null : !NUMBER_PASSED_NULL_EDEFAULT.equals(number_passed_null);
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED:
        return boolean_passed != null;
      case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED_NULL:
        return BOOLEAN_PASSED_NULL_EDEFAULT == null ? boolean_passed_null != null : !BOOLEAN_PASSED_NULL_EDEFAULT.equals(boolean_passed_null);
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BLOCK_SIGN:
        return ELSE_BLOCK_SIGN_EDEFAULT == null ? else_block_sign != null : !ELSE_BLOCK_SIGN_EDEFAULT.equals(else_block_sign);
      case AnsibleDslPackage.EJINJA_STATEMENT__ELSE_BODY:
        return else_body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == EDictionaryPassed.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EListPassed.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ENumberPassed.class)
    {
      switch (derivedFeatureID)
      {
        case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED: return AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED;
        case AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED_NULL: return AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED_NULL;
        default: return -1;
      }
    }
    if (baseClass == EBooleanPassed.class)
    {
      switch (derivedFeatureID)
      {
        case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED: return AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED;
        case AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED_NULL: return AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED_NULL;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == EDictionaryPassed.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EListPassed.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ENumberPassed.class)
    {
      switch (baseFeatureID)
      {
        case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED: return AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED;
        case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED_NULL: return AnsibleDslPackage.EJINJA_STATEMENT__NUMBER_PASSED_NULL;
        default: return -1;
      }
    }
    if (baseClass == EBooleanPassed.class)
    {
      switch (baseFeatureID)
      {
        case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED: return AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED;
        case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED_NULL: return AnsibleDslPackage.EJINJA_STATEMENT__BOOLEAN_PASSED_NULL;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", boolean_passed_null: ");
    result.append(boolean_passed_null);
    result.append(", else_block_sign: ");
    result.append(else_block_sign);
    result.append(')');
    return result.toString();
  }

} //EJinjaStatementImpl
