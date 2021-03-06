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
import org.sodalite.sdl.ansible.ansibleDsl.EOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOr Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EOrExpressionImpl#getLeft_or <em>Left or</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EOrExpressionImpl#getRight_or <em>Right or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOrExpressionImpl extends MinimalEObjectImpl.Container implements EOrExpression
{
  /**
   * The cached value of the '{@link #getLeft_or() <em>Left or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_or()
   * @generated
   * @ordered
   */
  protected EAndExpression left_or;

  /**
   * The cached value of the '{@link #getRight_or() <em>Right or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_or()
   * @generated
   * @ordered
   */
  protected EOrExpression right_or;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EOrExpressionImpl()
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
    return AnsibleDslPackage.Literals.EOR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAndExpression getLeft_or()
  {
    return left_or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_or(EAndExpression newLeft_or, NotificationChain msgs)
  {
    EAndExpression oldLeft_or = left_or;
    left_or = newLeft_or;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR, oldLeft_or, newLeft_or);
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
  public void setLeft_or(EAndExpression newLeft_or)
  {
    if (newLeft_or != left_or)
    {
      NotificationChain msgs = null;
      if (left_or != null)
        msgs = ((InternalEObject)left_or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR, null, msgs);
      if (newLeft_or != null)
        msgs = ((InternalEObject)newLeft_or).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR, null, msgs);
      msgs = basicSetLeft_or(newLeft_or, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR, newLeft_or, newLeft_or));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOrExpression getRight_or()
  {
    return right_or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight_or(EOrExpression newRight_or, NotificationChain msgs)
  {
    EOrExpression oldRight_or = right_or;
    right_or = newRight_or;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR, oldRight_or, newRight_or);
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
  public void setRight_or(EOrExpression newRight_or)
  {
    if (newRight_or != right_or)
    {
      NotificationChain msgs = null;
      if (right_or != null)
        msgs = ((InternalEObject)right_or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR, null, msgs);
      if (newRight_or != null)
        msgs = ((InternalEObject)newRight_or).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR, null, msgs);
      msgs = basicSetRight_or(newRight_or, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR, newRight_or, newRight_or));
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
      case AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR:
        return basicSetLeft_or(null, msgs);
      case AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR:
        return basicSetRight_or(null, msgs);
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
      case AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR:
        return getLeft_or();
      case AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR:
        return getRight_or();
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
      case AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR:
        setLeft_or((EAndExpression)newValue);
        return;
      case AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR:
        setRight_or((EOrExpression)newValue);
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
      case AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR:
        setLeft_or((EAndExpression)null);
        return;
      case AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR:
        setRight_or((EOrExpression)null);
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
      case AnsibleDslPackage.EOR_EXPRESSION__LEFT_OR:
        return left_or != null;
      case AnsibleDslPackage.EOR_EXPRESSION__RIGHT_OR:
        return right_or != null;
    }
    return super.eIsSet(featureID);
  }

} //EOrExpressionImpl
