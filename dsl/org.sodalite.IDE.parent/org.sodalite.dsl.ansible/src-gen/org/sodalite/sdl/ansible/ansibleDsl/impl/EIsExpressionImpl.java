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
import org.sodalite.sdl.ansible.ansibleDsl.EIsExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIs Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIsExpressionImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIsExpressionImpl#getParenthesised_expression <em>Parenthesised expression</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIsExpressionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIsExpressionImpl#getNot_in <em>Not in</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIsExpressionImpl#getContainer_expression <em>Container expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIsExpressionImpl extends MinimalEObjectImpl.Container implements EIsExpression
{
  /**
   * The default value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected static final String NOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected String not = NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getParenthesised_expression() <em>Parenthesised expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParenthesised_expression()
   * @generated
   * @ordered
   */
  protected EParenthesisedExpression parenthesised_expression;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected EIsExpression status;

  /**
   * The default value of the '{@link #getNot_in() <em>Not in</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot_in()
   * @generated
   * @ordered
   */
  protected static final String NOT_IN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNot_in() <em>Not in</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot_in()
   * @generated
   * @ordered
   */
  protected String not_in = NOT_IN_EDEFAULT;

  /**
   * The cached value of the '{@link #getContainer_expression() <em>Container expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer_expression()
   * @generated
   * @ordered
   */
  protected EIsExpression container_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EIsExpressionImpl()
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
    return AnsibleDslPackage.Literals.EIS_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNot(String newNot)
  {
    String oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EParenthesisedExpression getParenthesised_expression()
  {
    return parenthesised_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParenthesised_expression(EParenthesisedExpression newParenthesised_expression, NotificationChain msgs)
  {
    EParenthesisedExpression oldParenthesised_expression = parenthesised_expression;
    parenthesised_expression = newParenthesised_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION, oldParenthesised_expression, newParenthesised_expression);
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
  public void setParenthesised_expression(EParenthesisedExpression newParenthesised_expression)
  {
    if (newParenthesised_expression != parenthesised_expression)
    {
      NotificationChain msgs = null;
      if (parenthesised_expression != null)
        msgs = ((InternalEObject)parenthesised_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION, null, msgs);
      if (newParenthesised_expression != null)
        msgs = ((InternalEObject)newParenthesised_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION, null, msgs);
      msgs = basicSetParenthesised_expression(newParenthesised_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION, newParenthesised_expression, newParenthesised_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIsExpression getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatus(EIsExpression newStatus, NotificationChain msgs)
  {
    EIsExpression oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__STATUS, oldStatus, newStatus);
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
  public void setStatus(EIsExpression newStatus)
  {
    if (newStatus != status)
    {
      NotificationChain msgs = null;
      if (status != null)
        msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIS_EXPRESSION__STATUS, null, msgs);
      if (newStatus != null)
        msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIS_EXPRESSION__STATUS, null, msgs);
      msgs = basicSetStatus(newStatus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__STATUS, newStatus, newStatus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNot_in()
  {
    return not_in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNot_in(String newNot_in)
  {
    String oldNot_in = not_in;
    not_in = newNot_in;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__NOT_IN, oldNot_in, not_in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIsExpression getContainer_expression()
  {
    return container_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContainer_expression(EIsExpression newContainer_expression, NotificationChain msgs)
  {
    EIsExpression oldContainer_expression = container_expression;
    container_expression = newContainer_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION, oldContainer_expression, newContainer_expression);
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
  public void setContainer_expression(EIsExpression newContainer_expression)
  {
    if (newContainer_expression != container_expression)
    {
      NotificationChain msgs = null;
      if (container_expression != null)
        msgs = ((InternalEObject)container_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION, null, msgs);
      if (newContainer_expression != null)
        msgs = ((InternalEObject)newContainer_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION, null, msgs);
      msgs = basicSetContainer_expression(newContainer_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION, newContainer_expression, newContainer_expression));
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
      case AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION:
        return basicSetParenthesised_expression(null, msgs);
      case AnsibleDslPackage.EIS_EXPRESSION__STATUS:
        return basicSetStatus(null, msgs);
      case AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION:
        return basicSetContainer_expression(null, msgs);
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
      case AnsibleDslPackage.EIS_EXPRESSION__NOT:
        return getNot();
      case AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION:
        return getParenthesised_expression();
      case AnsibleDslPackage.EIS_EXPRESSION__STATUS:
        return getStatus();
      case AnsibleDslPackage.EIS_EXPRESSION__NOT_IN:
        return getNot_in();
      case AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION:
        return getContainer_expression();
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
      case AnsibleDslPackage.EIS_EXPRESSION__NOT:
        setNot((String)newValue);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION:
        setParenthesised_expression((EParenthesisedExpression)newValue);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__STATUS:
        setStatus((EIsExpression)newValue);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__NOT_IN:
        setNot_in((String)newValue);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION:
        setContainer_expression((EIsExpression)newValue);
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
      case AnsibleDslPackage.EIS_EXPRESSION__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION:
        setParenthesised_expression((EParenthesisedExpression)null);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__STATUS:
        setStatus((EIsExpression)null);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__NOT_IN:
        setNot_in(NOT_IN_EDEFAULT);
        return;
      case AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION:
        setContainer_expression((EIsExpression)null);
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
      case AnsibleDslPackage.EIS_EXPRESSION__NOT:
        return NOT_EDEFAULT == null ? not != null : !NOT_EDEFAULT.equals(not);
      case AnsibleDslPackage.EIS_EXPRESSION__PARENTHESISED_EXPRESSION:
        return parenthesised_expression != null;
      case AnsibleDslPackage.EIS_EXPRESSION__STATUS:
        return status != null;
      case AnsibleDslPackage.EIS_EXPRESSION__NOT_IN:
        return NOT_IN_EDEFAULT == null ? not_in != null : !NOT_IN_EDEFAULT.equals(not_in);
      case AnsibleDslPackage.EIS_EXPRESSION__CONTAINER_EXPRESSION:
        return container_expression != null;
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
    result.append(" (not: ");
    result.append(not);
    result.append(", not_in: ");
    result.append(not_in);
    result.append(')');
    return result.toString();
  }

} //EIsExpressionImpl
