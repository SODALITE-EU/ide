/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIs Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getNot <em>Not</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getParenthesised_expression <em>Parenthesised expression</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getStatus <em>Status</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getNot_in <em>Not in</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getContainer_expression <em>Container expression</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression()
 * @model
 * @generated
 */
public interface EIsExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression_Not()
   * @model
   * @generated
   */
  String getNot();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #getNot()
   * @generated
   */
  void setNot(String value);

  /**
   * Returns the value of the '<em><b>Parenthesised expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parenthesised expression</em>' containment reference.
   * @see #setParenthesised_expression(EParenthesisedExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression_Parenthesised_expression()
   * @model containment="true"
   * @generated
   */
  EParenthesisedExpression getParenthesised_expression();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getParenthesised_expression <em>Parenthesised expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parenthesised expression</em>' containment reference.
   * @see #getParenthesised_expression()
   * @generated
   */
  void setParenthesised_expression(EParenthesisedExpression value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' containment reference.
   * @see #setStatus(EIsExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression_Status()
   * @model containment="true"
   * @generated
   */
  EIsExpression getStatus();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getStatus <em>Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' containment reference.
   * @see #getStatus()
   * @generated
   */
  void setStatus(EIsExpression value);

  /**
   * Returns the value of the '<em><b>Not in</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not in</em>' attribute.
   * @see #setNot_in(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression_Not_in()
   * @model
   * @generated
   */
  String getNot_in();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getNot_in <em>Not in</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not in</em>' attribute.
   * @see #getNot_in()
   * @generated
   */
  void setNot_in(String value);

  /**
   * Returns the value of the '<em><b>Container expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container expression</em>' containment reference.
   * @see #setContainer_expression(EIsExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression_Container_expression()
   * @model containment="true"
   * @generated
   */
  EIsExpression getContainer_expression();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getContainer_expression <em>Container expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container expression</em>' containment reference.
   * @see #getContainer_expression()
   * @generated
   */
  void setContainer_expression(EIsExpression value);

} // EIsExpression
