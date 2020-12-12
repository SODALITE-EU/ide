/**
 * generated by Xtext 2.23.0
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
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getFiltered_expression <em>Filtered expression</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getIs_not <em>Is not</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getStatus <em>Status</em>}</li>
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
   * Returns the value of the '<em><b>Filtered expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filtered expression</em>' containment reference.
   * @see #setFiltered_expression(EParenthesisedExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression_Filtered_expression()
   * @model containment="true"
   * @generated
   */
  EParenthesisedExpression getFiltered_expression();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getFiltered_expression <em>Filtered expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filtered expression</em>' containment reference.
   * @see #getFiltered_expression()
   * @generated
   */
  void setFiltered_expression(EParenthesisedExpression value);

  /**
   * Returns the value of the '<em><b>Is not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is not</em>' attribute.
   * @see #setIs_not(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIsExpression_Is_not()
   * @model
   * @generated
   */
  String getIs_not();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIsExpression#getIs_not <em>Is not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is not</em>' attribute.
   * @see #getIs_not()
   * @generated
   */
  void setIs_not(String value);

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