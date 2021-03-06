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
import org.sodalite.sdl.ansible.ansibleDsl.EAndExpression;
import org.sodalite.sdl.ansible.ansibleDsl.ETruthExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAnd Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EAndExpressionImpl#getLeft_and <em>Left and</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EAndExpressionImpl#getRight_and <em>Right and</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAndExpressionImpl extends MinimalEObjectImpl.Container implements EAndExpression
{
  /**
   * The cached value of the '{@link #getLeft_and() <em>Left and</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_and()
   * @generated
   * @ordered
   */
  protected ETruthExpression left_and;

  /**
   * The cached value of the '{@link #getRight_and() <em>Right and</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_and()
   * @generated
   * @ordered
   */
  protected EAndExpression right_and;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAndExpressionImpl()
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
    return AnsibleDslPackage.Literals.EAND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETruthExpression getLeft_and()
  {
    return left_and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_and(ETruthExpression newLeft_and, NotificationChain msgs)
  {
    ETruthExpression oldLeft_and = left_and;
    left_and = newLeft_and;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND, oldLeft_and, newLeft_and);
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
  public void setLeft_and(ETruthExpression newLeft_and)
  {
    if (newLeft_and != left_and)
    {
      NotificationChain msgs = null;
      if (left_and != null)
        msgs = ((InternalEObject)left_and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND, null, msgs);
      if (newLeft_and != null)
        msgs = ((InternalEObject)newLeft_and).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND, null, msgs);
      msgs = basicSetLeft_and(newLeft_and, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND, newLeft_and, newLeft_and));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAndExpression getRight_and()
  {
    return right_and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight_and(EAndExpression newRight_and, NotificationChain msgs)
  {
    EAndExpression oldRight_and = right_and;
    right_and = newRight_and;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND, oldRight_and, newRight_and);
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
  public void setRight_and(EAndExpression newRight_and)
  {
    if (newRight_and != right_and)
    {
      NotificationChain msgs = null;
      if (right_and != null)
        msgs = ((InternalEObject)right_and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND, null, msgs);
      if (newRight_and != null)
        msgs = ((InternalEObject)newRight_and).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND, null, msgs);
      msgs = basicSetRight_and(newRight_and, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND, newRight_and, newRight_and));
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
      case AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND:
        return basicSetLeft_and(null, msgs);
      case AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND:
        return basicSetRight_and(null, msgs);
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
      case AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND:
        return getLeft_and();
      case AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND:
        return getRight_and();
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
      case AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND:
        setLeft_and((ETruthExpression)newValue);
        return;
      case AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND:
        setRight_and((EAndExpression)newValue);
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
      case AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND:
        setLeft_and((ETruthExpression)null);
        return;
      case AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND:
        setRight_and((EAndExpression)null);
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
      case AnsibleDslPackage.EAND_EXPRESSION__LEFT_AND:
        return left_and != null;
      case AnsibleDslPackage.EAND_EXPRESSION__RIGHT_AND:
        return right_and != null;
    }
    return super.eIsSet(featureID);
  }

} //EAndExpressionImpl
