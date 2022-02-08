/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMulti Line Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EMultiLineExpression#getNew_line_command <em>New line command</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EMultiLineExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEMultiLineExpression()
 * @model
 * @generated
 */
public interface EMultiLineExpression extends EStringWithoutQuotesPassed, EStringPassed
{
  /**
   * Returns the value of the '<em><b>New line command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>New line command</em>' attribute.
   * @see #setNew_line_command(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEMultiLineExpression_New_line_command()
   * @model
   * @generated
   */
  String getNew_line_command();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EMultiLineExpression#getNew_line_command <em>New line command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New line command</em>' attribute.
   * @see #getNew_line_command()
   * @generated
   */
  void setNew_line_command(String value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaAndString}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEMultiLineExpression_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<EJinjaAndString> getExpressions();

} // EMultiLineExpression
