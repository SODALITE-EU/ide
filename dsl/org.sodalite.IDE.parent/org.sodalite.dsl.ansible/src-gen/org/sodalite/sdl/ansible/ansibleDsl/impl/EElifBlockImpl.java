/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EElifBlock;
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EElif Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EElifBlockImpl#getElif_block_sign <em>Elif block sign</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EElifBlockImpl#getElif_condition <em>Elif condition</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EElifBlockImpl#getElif_body <em>Elif body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EElifBlockImpl extends MinimalEObjectImpl.Container implements EElifBlock
{
  /**
   * The default value of the '{@link #getElif_block_sign() <em>Elif block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElif_block_sign()
   * @generated
   * @ordered
   */
  protected static final String ELIF_BLOCK_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElif_block_sign() <em>Elif block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElif_block_sign()
   * @generated
   * @ordered
   */
  protected String elif_block_sign = ELIF_BLOCK_SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getElif_condition() <em>Elif condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElif_condition()
   * @generated
   * @ordered
   */
  protected EFilteredExpression elif_condition;

  /**
   * The cached value of the '{@link #getElif_body() <em>Elif body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElif_body()
   * @generated
   * @ordered
   */
  protected EValuePassed elif_body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EElifBlockImpl()
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
    return AnsibleDslPackage.Literals.EELIF_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getElif_block_sign()
  {
    return elif_block_sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElif_block_sign(String newElif_block_sign)
  {
    String oldElif_block_sign = elif_block_sign;
    elif_block_sign = newElif_block_sign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EELIF_BLOCK__ELIF_BLOCK_SIGN, oldElif_block_sign, elif_block_sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredExpression getElif_condition()
  {
    return elif_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElif_condition(EFilteredExpression newElif_condition, NotificationChain msgs)
  {
    EFilteredExpression oldElif_condition = elif_condition;
    elif_condition = newElif_condition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION, oldElif_condition, newElif_condition);
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
  public void setElif_condition(EFilteredExpression newElif_condition)
  {
    if (newElif_condition != elif_condition)
    {
      NotificationChain msgs = null;
      if (elif_condition != null)
        msgs = ((InternalEObject)elif_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION, null, msgs);
      if (newElif_condition != null)
        msgs = ((InternalEObject)newElif_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION, null, msgs);
      msgs = basicSetElif_condition(newElif_condition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION, newElif_condition, newElif_condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassed getElif_body()
  {
    return elif_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElif_body(EValuePassed newElif_body, NotificationChain msgs)
  {
    EValuePassed oldElif_body = elif_body;
    elif_body = newElif_body;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY, oldElif_body, newElif_body);
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
  public void setElif_body(EValuePassed newElif_body)
  {
    if (newElif_body != elif_body)
    {
      NotificationChain msgs = null;
      if (elif_body != null)
        msgs = ((InternalEObject)elif_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY, null, msgs);
      if (newElif_body != null)
        msgs = ((InternalEObject)newElif_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY, null, msgs);
      msgs = basicSetElif_body(newElif_body, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY, newElif_body, newElif_body));
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
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION:
        return basicSetElif_condition(null, msgs);
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY:
        return basicSetElif_body(null, msgs);
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
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BLOCK_SIGN:
        return getElif_block_sign();
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION:
        return getElif_condition();
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY:
        return getElif_body();
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
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BLOCK_SIGN:
        setElif_block_sign((String)newValue);
        return;
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION:
        setElif_condition((EFilteredExpression)newValue);
        return;
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY:
        setElif_body((EValuePassed)newValue);
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
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BLOCK_SIGN:
        setElif_block_sign(ELIF_BLOCK_SIGN_EDEFAULT);
        return;
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION:
        setElif_condition((EFilteredExpression)null);
        return;
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY:
        setElif_body((EValuePassed)null);
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
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BLOCK_SIGN:
        return ELIF_BLOCK_SIGN_EDEFAULT == null ? elif_block_sign != null : !ELIF_BLOCK_SIGN_EDEFAULT.equals(elif_block_sign);
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_CONDITION:
        return elif_condition != null;
      case AnsibleDslPackage.EELIF_BLOCK__ELIF_BODY:
        return elif_body != null;
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
    result.append(" (elif_block_sign: ");
    result.append(elif_block_sign);
    result.append(')');
    return result.toString();
  }

} //EElifBlockImpl
