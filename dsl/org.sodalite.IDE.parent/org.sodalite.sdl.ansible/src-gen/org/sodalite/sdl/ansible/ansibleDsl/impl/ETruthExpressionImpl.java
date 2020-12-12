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
import org.sodalite.sdl.ansible.ansibleDsl.EOperation;
import org.sodalite.sdl.ansible.ansibleDsl.ETruthExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETruth Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETruthExpressionImpl#getLeft_value <em>Left value</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETruthExpressionImpl#getEquality_sign <em>Equality sign</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETruthExpressionImpl#getRight_value <em>Right value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETruthExpressionImpl extends MinimalEObjectImpl.Container implements ETruthExpression
{
  /**
   * The cached value of the '{@link #getLeft_value() <em>Left value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_value()
   * @generated
   * @ordered
   */
  protected EOperation left_value;

  /**
   * The default value of the '{@link #getEquality_sign() <em>Equality sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquality_sign()
   * @generated
   * @ordered
   */
  protected static final String EQUALITY_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEquality_sign() <em>Equality sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquality_sign()
   * @generated
   * @ordered
   */
  protected String equality_sign = EQUALITY_SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight_value() <em>Right value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_value()
   * @generated
   * @ordered
   */
  protected ETruthExpression right_value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETruthExpressionImpl()
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
    return AnsibleDslPackage.Literals.ETRUTH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperation getLeft_value()
  {
    return left_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_value(EOperation newLeft_value, NotificationChain msgs)
  {
    EOperation oldLeft_value = left_value;
    left_value = newLeft_value;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE, oldLeft_value, newLeft_value);
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
  public void setLeft_value(EOperation newLeft_value)
  {
    if (newLeft_value != left_value)
    {
      NotificationChain msgs = null;
      if (left_value != null)
        msgs = ((InternalEObject)left_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE, null, msgs);
      if (newLeft_value != null)
        msgs = ((InternalEObject)newLeft_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE, null, msgs);
      msgs = basicSetLeft_value(newLeft_value, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE, newLeft_value, newLeft_value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEquality_sign()
  {
    return equality_sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEquality_sign(String newEquality_sign)
  {
    String oldEquality_sign = equality_sign;
    equality_sign = newEquality_sign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETRUTH_EXPRESSION__EQUALITY_SIGN, oldEquality_sign, equality_sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETruthExpression getRight_value()
  {
    return right_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight_value(ETruthExpression newRight_value, NotificationChain msgs)
  {
    ETruthExpression oldRight_value = right_value;
    right_value = newRight_value;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE, oldRight_value, newRight_value);
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
  public void setRight_value(ETruthExpression newRight_value)
  {
    if (newRight_value != right_value)
    {
      NotificationChain msgs = null;
      if (right_value != null)
        msgs = ((InternalEObject)right_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE, null, msgs);
      if (newRight_value != null)
        msgs = ((InternalEObject)newRight_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE, null, msgs);
      msgs = basicSetRight_value(newRight_value, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE, newRight_value, newRight_value));
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
      case AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE:
        return basicSetLeft_value(null, msgs);
      case AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE:
        return basicSetRight_value(null, msgs);
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
      case AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE:
        return getLeft_value();
      case AnsibleDslPackage.ETRUTH_EXPRESSION__EQUALITY_SIGN:
        return getEquality_sign();
      case AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE:
        return getRight_value();
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
      case AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE:
        setLeft_value((EOperation)newValue);
        return;
      case AnsibleDslPackage.ETRUTH_EXPRESSION__EQUALITY_SIGN:
        setEquality_sign((String)newValue);
        return;
      case AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE:
        setRight_value((ETruthExpression)newValue);
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
      case AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE:
        setLeft_value((EOperation)null);
        return;
      case AnsibleDslPackage.ETRUTH_EXPRESSION__EQUALITY_SIGN:
        setEquality_sign(EQUALITY_SIGN_EDEFAULT);
        return;
      case AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE:
        setRight_value((ETruthExpression)null);
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
      case AnsibleDslPackage.ETRUTH_EXPRESSION__LEFT_VALUE:
        return left_value != null;
      case AnsibleDslPackage.ETRUTH_EXPRESSION__EQUALITY_SIGN:
        return EQUALITY_SIGN_EDEFAULT == null ? equality_sign != null : !EQUALITY_SIGN_EDEFAULT.equals(equality_sign);
      case AnsibleDslPackage.ETRUTH_EXPRESSION__RIGHT_VALUE:
        return right_value != null;
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
    result.append(" (equality_sign: ");
    result.append(equality_sign);
    result.append(')');
    return result.toString();
  }

} //ETruthExpressionImpl
