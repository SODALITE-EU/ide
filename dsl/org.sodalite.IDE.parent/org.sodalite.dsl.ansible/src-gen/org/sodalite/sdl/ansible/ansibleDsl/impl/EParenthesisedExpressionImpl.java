/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluationWithoutBrackets;
import org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression;
import org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement;
import org.sodalite.sdl.ansible.ansibleDsl.ETailElement;
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassedToJinjaExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EParenthesised Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EParenthesisedExpressionImpl#getBasic_value <em>Basic value</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EParenthesisedExpressionImpl#getParenthesised_term <em>Parenthesised term</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EParenthesisedExpressionImpl#getSquare_bracket_elements <em>Square bracket elements</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EParenthesisedExpressionImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EParenthesisedExpressionImpl extends MinimalEObjectImpl.Container implements EParenthesisedExpression
{
  /**
   * The cached value of the '{@link #getBasic_value() <em>Basic value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasic_value()
   * @generated
   * @ordered
   */
  protected EValuePassedToJinjaExpression basic_value;

  /**
   * The cached value of the '{@link #getParenthesised_term() <em>Parenthesised term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParenthesised_term()
   * @generated
   * @ordered
   */
  protected EJinjaExpressionEvaluationWithoutBrackets parenthesised_term;

  /**
   * The cached value of the '{@link #getSquare_bracket_elements() <em>Square bracket elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquare_bracket_elements()
   * @generated
   * @ordered
   */
  protected EList<ESquareBracketElement> square_bracket_elements;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected EList<ETailElement> tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EParenthesisedExpressionImpl()
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
    return AnsibleDslPackage.Literals.EPARENTHESISED_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassedToJinjaExpression getBasic_value()
  {
    return basic_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasic_value(EValuePassedToJinjaExpression newBasic_value, NotificationChain msgs)
  {
    EValuePassedToJinjaExpression oldBasic_value = basic_value;
    basic_value = newBasic_value;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE, oldBasic_value, newBasic_value);
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
  public void setBasic_value(EValuePassedToJinjaExpression newBasic_value)
  {
    if (newBasic_value != basic_value)
    {
      NotificationChain msgs = null;
      if (basic_value != null)
        msgs = ((InternalEObject)basic_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE, null, msgs);
      if (newBasic_value != null)
        msgs = ((InternalEObject)newBasic_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE, null, msgs);
      msgs = basicSetBasic_value(newBasic_value, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE, newBasic_value, newBasic_value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaExpressionEvaluationWithoutBrackets getParenthesised_term()
  {
    return parenthesised_term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParenthesised_term(EJinjaExpressionEvaluationWithoutBrackets newParenthesised_term, NotificationChain msgs)
  {
    EJinjaExpressionEvaluationWithoutBrackets oldParenthesised_term = parenthesised_term;
    parenthesised_term = newParenthesised_term;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM, oldParenthesised_term, newParenthesised_term);
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
  public void setParenthesised_term(EJinjaExpressionEvaluationWithoutBrackets newParenthesised_term)
  {
    if (newParenthesised_term != parenthesised_term)
    {
      NotificationChain msgs = null;
      if (parenthesised_term != null)
        msgs = ((InternalEObject)parenthesised_term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM, null, msgs);
      if (newParenthesised_term != null)
        msgs = ((InternalEObject)newParenthesised_term).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM, null, msgs);
      msgs = basicSetParenthesised_term(newParenthesised_term, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM, newParenthesised_term, newParenthesised_term));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ESquareBracketElement> getSquare_bracket_elements()
  {
    if (square_bracket_elements == null)
    {
      square_bracket_elements = new EObjectContainmentEList<ESquareBracketElement>(ESquareBracketElement.class, this, AnsibleDslPackage.EPARENTHESISED_EXPRESSION__SQUARE_BRACKET_ELEMENTS);
    }
    return square_bracket_elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ETailElement> getTail()
  {
    if (tail == null)
    {
      tail = new EObjectContainmentEList<ETailElement>(ETailElement.class, this, AnsibleDslPackage.EPARENTHESISED_EXPRESSION__TAIL);
    }
    return tail;
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
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE:
        return basicSetBasic_value(null, msgs);
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM:
        return basicSetParenthesised_term(null, msgs);
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__SQUARE_BRACKET_ELEMENTS:
        return ((InternalEList<?>)getSquare_bracket_elements()).basicRemove(otherEnd, msgs);
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__TAIL:
        return ((InternalEList<?>)getTail()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE:
        return getBasic_value();
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM:
        return getParenthesised_term();
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__SQUARE_BRACKET_ELEMENTS:
        return getSquare_bracket_elements();
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__TAIL:
        return getTail();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE:
        setBasic_value((EValuePassedToJinjaExpression)newValue);
        return;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM:
        setParenthesised_term((EJinjaExpressionEvaluationWithoutBrackets)newValue);
        return;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__SQUARE_BRACKET_ELEMENTS:
        getSquare_bracket_elements().clear();
        getSquare_bracket_elements().addAll((Collection<? extends ESquareBracketElement>)newValue);
        return;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__TAIL:
        getTail().clear();
        getTail().addAll((Collection<? extends ETailElement>)newValue);
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
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE:
        setBasic_value((EValuePassedToJinjaExpression)null);
        return;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM:
        setParenthesised_term((EJinjaExpressionEvaluationWithoutBrackets)null);
        return;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__SQUARE_BRACKET_ELEMENTS:
        getSquare_bracket_elements().clear();
        return;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__TAIL:
        getTail().clear();
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
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__BASIC_VALUE:
        return basic_value != null;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__PARENTHESISED_TERM:
        return parenthesised_term != null;
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__SQUARE_BRACKET_ELEMENTS:
        return square_bracket_elements != null && !square_bracket_elements.isEmpty();
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION__TAIL:
        return tail != null && !tail.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EParenthesisedExpressionImpl
