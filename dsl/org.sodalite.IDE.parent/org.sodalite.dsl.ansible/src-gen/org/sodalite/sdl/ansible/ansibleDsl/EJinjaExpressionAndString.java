/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJinja Expression And String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionAndString#getNew_line_command <em>New line command</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionAndString#getJinja_expression_and_string <em>Jinja expression and string</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEJinjaExpressionAndString()
 * @model
 * @generated
 */
public interface EJinjaExpressionAndString extends EValuePassed
{
  /**
   * Returns the value of the '<em><b>New line command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>New line command</em>' attribute.
   * @see #setNew_line_command(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEJinjaExpressionAndString_New_line_command()
   * @model
   * @generated
   */
  String getNew_line_command();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionAndString#getNew_line_command <em>New line command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New line command</em>' attribute.
   * @see #getNew_line_command()
   * @generated
   */
  void setNew_line_command(String value);

  /**
   * Returns the value of the '<em><b>Jinja expression and string</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionOrString}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jinja expression and string</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEJinjaExpressionAndString_Jinja_expression_and_string()
   * @model containment="true"
   * @generated
   */
  EList<EJinjaExpressionOrString> getJinja_expression_and_string();

} // EJinjaExpressionAndString
