/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParenthesised Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getBasic_value <em>Basic value</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getParenthesised_term <em>Parenthesised term</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getSquare_bracket_elements <em>Square bracket elements</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression()
 * @model
 * @generated
 */
public interface EParenthesisedExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic value</em>' containment reference.
   * @see #setBasic_value(EValuePassedToJinjaExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression_Basic_value()
   * @model containment="true"
   * @generated
   */
  EValuePassedToJinjaExpression getBasic_value();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getBasic_value <em>Basic value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic value</em>' containment reference.
   * @see #getBasic_value()
   * @generated
   */
  void setBasic_value(EValuePassedToJinjaExpression value);

  /**
   * Returns the value of the '<em><b>Parenthesised term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parenthesised term</em>' containment reference.
   * @see #setParenthesised_term(EJinjaExpressionEvaluationWithoutBrackets)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression_Parenthesised_term()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionEvaluationWithoutBrackets getParenthesised_term();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getParenthesised_term <em>Parenthesised term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parenthesised term</em>' containment reference.
   * @see #getParenthesised_term()
   * @generated
   */
  void setParenthesised_term(EJinjaExpressionEvaluationWithoutBrackets value);

  /**
   * Returns the value of the '<em><b>Square bracket elements</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Square bracket elements</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression_Square_bracket_elements()
   * @model containment="true"
   * @generated
   */
  EList<ESquareBracketElement> getSquare_bracket_elements();

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ETailElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression_Tail()
   * @model containment="true"
   * @generated
   */
  EList<ETailElement> getTail();

} // EParenthesisedExpression
