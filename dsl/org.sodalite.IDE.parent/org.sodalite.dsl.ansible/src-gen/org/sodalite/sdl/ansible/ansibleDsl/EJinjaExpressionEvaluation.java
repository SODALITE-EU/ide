/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJinja Expression Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluation#getJinja_expression <em>Jinja expression</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEJinjaExpressionEvaluation()
 * @model
 * @generated
 */
public interface EJinjaExpressionEvaluation extends EJinjaOrString, EDictionaryPassed, EListPassed, ENumberPassed, EBooleanPassed
{
  /**
   * Returns the value of the '<em><b>Jinja expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jinja expression</em>' containment reference.
   * @see #setJinja_expression(EJinjaExpressionEvaluationWithoutBrackets)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEJinjaExpressionEvaluation_Jinja_expression()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionEvaluationWithoutBrackets getJinja_expression();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluation#getJinja_expression <em>Jinja expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jinja expression</em>' containment reference.
   * @see #getJinja_expression()
   * @generated
   */
  void setJinja_expression(EJinjaExpressionEvaluationWithoutBrackets value);

} // EJinjaExpressionEvaluation