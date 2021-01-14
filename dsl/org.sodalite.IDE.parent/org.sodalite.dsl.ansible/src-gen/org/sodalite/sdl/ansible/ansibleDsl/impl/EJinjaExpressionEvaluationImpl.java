/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluation;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluationWithoutBrackets;
import org.sodalite.sdl.ansible.ansibleDsl.EListPassed;
import org.sodalite.sdl.ansible.ansibleDsl.ENumberPassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EJinja Expression Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaExpressionEvaluationImpl#getNumber_passed <em>Number passed</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaExpressionEvaluationImpl#getBoolean_passed <em>Boolean passed</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaExpressionEvaluationImpl#getJinja_expression <em>Jinja expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EJinjaExpressionEvaluationImpl extends EJinjaExpressionOrStringImpl implements EJinjaExpressionEvaluation
{
  /**
   * The default value of the '{@link #getNumber_passed() <em>Number passed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_passed()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_PASSED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumber_passed() <em>Number passed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_passed()
   * @generated
   * @ordered
   */
  protected String number_passed = NUMBER_PASSED_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolean_passed() <em>Boolean passed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_PASSED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolean_passed() <em>Boolean passed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed()
   * @generated
   * @ordered
   */
  protected String boolean_passed = BOOLEAN_PASSED_EDEFAULT;

  /**
   * The cached value of the '{@link #getJinja_expression() <em>Jinja expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJinja_expression()
   * @generated
   * @ordered
   */
  protected EJinjaExpressionEvaluationWithoutBrackets jinja_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EJinjaExpressionEvaluationImpl()
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
    return AnsibleDslPackage.Literals.EJINJA_EXPRESSION_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNumber_passed()
  {
    return number_passed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber_passed(String newNumber_passed)
  {
    String oldNumber_passed = number_passed;
    number_passed = newNumber_passed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__NUMBER_PASSED, oldNumber_passed, number_passed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoolean_passed()
  {
    return boolean_passed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolean_passed(String newBoolean_passed)
  {
    String oldBoolean_passed = boolean_passed;
    boolean_passed = newBoolean_passed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__BOOLEAN_PASSED, oldBoolean_passed, boolean_passed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaExpressionEvaluationWithoutBrackets getJinja_expression()
  {
    return jinja_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJinja_expression(EJinjaExpressionEvaluationWithoutBrackets newJinja_expression, NotificationChain msgs)
  {
    EJinjaExpressionEvaluationWithoutBrackets oldJinja_expression = jinja_expression;
    jinja_expression = newJinja_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION, oldJinja_expression, newJinja_expression);
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
  public void setJinja_expression(EJinjaExpressionEvaluationWithoutBrackets newJinja_expression)
  {
    if (newJinja_expression != jinja_expression)
    {
      NotificationChain msgs = null;
      if (jinja_expression != null)
        msgs = ((InternalEObject)jinja_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION, null, msgs);
      if (newJinja_expression != null)
        msgs = ((InternalEObject)newJinja_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION, null, msgs);
      msgs = basicSetJinja_expression(newJinja_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION, newJinja_expression, newJinja_expression));
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION:
        return basicSetJinja_expression(null, msgs);
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__NUMBER_PASSED:
        return getNumber_passed();
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__BOOLEAN_PASSED:
        return getBoolean_passed();
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION:
        return getJinja_expression();
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__NUMBER_PASSED:
        setNumber_passed((String)newValue);
        return;
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__BOOLEAN_PASSED:
        setBoolean_passed((String)newValue);
        return;
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION:
        setJinja_expression((EJinjaExpressionEvaluationWithoutBrackets)newValue);
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__NUMBER_PASSED:
        setNumber_passed(NUMBER_PASSED_EDEFAULT);
        return;
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__BOOLEAN_PASSED:
        setBoolean_passed(BOOLEAN_PASSED_EDEFAULT);
        return;
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION:
        setJinja_expression((EJinjaExpressionEvaluationWithoutBrackets)null);
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__NUMBER_PASSED:
        return NUMBER_PASSED_EDEFAULT == null ? number_passed != null : !NUMBER_PASSED_EDEFAULT.equals(number_passed);
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__BOOLEAN_PASSED:
        return BOOLEAN_PASSED_EDEFAULT == null ? boolean_passed != null : !BOOLEAN_PASSED_EDEFAULT.equals(boolean_passed);
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION:
        return jinja_expression != null;
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
        case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__NUMBER_PASSED: return AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED;
        default: return -1;
      }
    }
    if (baseClass == EBooleanPassed.class)
    {
      switch (derivedFeatureID)
      {
        case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__BOOLEAN_PASSED: return AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED;
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
        case AnsibleDslPackage.ENUMBER_PASSED__NUMBER_PASSED: return AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__NUMBER_PASSED;
        default: return -1;
      }
    }
    if (baseClass == EBooleanPassed.class)
    {
      switch (baseFeatureID)
      {
        case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED: return AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION__BOOLEAN_PASSED;
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
    result.append(" (number_passed: ");
    result.append(number_passed);
    result.append(", boolean_passed: ");
    result.append(boolean_passed);
    result.append(')');
    return result.toString();
  }

} //EJinjaExpressionEvaluationImpl