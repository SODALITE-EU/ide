/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

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
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getBasic_Value <em>Basic Value</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getParenthesised_term <em>Parenthesised term</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression()
 * @model
 * @generated
 */
public interface EParenthesisedExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Value</em>' containment reference.
   * @see #setBasic_Value(EValuePassedToJinjaExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression_Basic_Value()
   * @model containment="true"
   * @generated
   */
  EValuePassedToJinjaExpression getBasic_Value();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getBasic_Value <em>Basic Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Value</em>' containment reference.
   * @see #getBasic_Value()
   * @generated
   */
  void setBasic_Value(EValuePassedToJinjaExpression value);

  /**
   * Returns the value of the '<em><b>Parenthesised term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parenthesised term</em>' containment reference.
   * @see #setParenthesised_term(EOrExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEParenthesisedExpression_Parenthesised_term()
   * @model containment="true"
   * @generated
   */
  EOrExpression getParenthesised_term();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression#getParenthesised_term <em>Parenthesised term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parenthesised term</em>' containment reference.
   * @see #getParenthesised_term()
   * @generated
   */
  void setParenthesised_term(EOrExpression value);

} // EParenthesisedExpression
