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
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluationWithoutBrackets;
import org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation;
import org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESquare Bracket Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ESquareBracketElementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ESquareBracketElementImpl#getSlice_notation <em>Slice notation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESquareBracketElementImpl extends MinimalEObjectImpl.Container implements ESquareBracketElement
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EJinjaExpressionEvaluationWithoutBrackets expression;

  /**
   * The cached value of the '{@link #getSlice_notation() <em>Slice notation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlice_notation()
   * @generated
   * @ordered
   */
  protected ESliceNotation slice_notation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ESquareBracketElementImpl()
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
    return AnsibleDslPackage.Literals.ESQUARE_BRACKET_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaExpressionEvaluationWithoutBrackets getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(EJinjaExpressionEvaluationWithoutBrackets newExpression, NotificationChain msgs)
  {
    EJinjaExpressionEvaluationWithoutBrackets oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION, oldExpression, newExpression);
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
  public void setExpression(EJinjaExpressionEvaluationWithoutBrackets newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ESliceNotation getSlice_notation()
  {
    return slice_notation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSlice_notation(ESliceNotation newSlice_notation, NotificationChain msgs)
  {
    ESliceNotation oldSlice_notation = slice_notation;
    slice_notation = newSlice_notation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION, oldSlice_notation, newSlice_notation);
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
  public void setSlice_notation(ESliceNotation newSlice_notation)
  {
    if (newSlice_notation != slice_notation)
    {
      NotificationChain msgs = null;
      if (slice_notation != null)
        msgs = ((InternalEObject)slice_notation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION, null, msgs);
      if (newSlice_notation != null)
        msgs = ((InternalEObject)newSlice_notation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION, null, msgs);
      msgs = basicSetSlice_notation(newSlice_notation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION, newSlice_notation, newSlice_notation));
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
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION:
        return basicSetSlice_notation(null, msgs);
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
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION:
        return getExpression();
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION:
        return getSlice_notation();
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
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION:
        setExpression((EJinjaExpressionEvaluationWithoutBrackets)newValue);
        return;
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION:
        setSlice_notation((ESliceNotation)newValue);
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
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION:
        setExpression((EJinjaExpressionEvaluationWithoutBrackets)null);
        return;
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION:
        setSlice_notation((ESliceNotation)null);
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
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__EXPRESSION:
        return expression != null;
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT__SLICE_NOTATION:
        return slice_notation != null;
    }
    return super.eIsSet(featureID);
  }

} //ESquareBracketElementImpl
