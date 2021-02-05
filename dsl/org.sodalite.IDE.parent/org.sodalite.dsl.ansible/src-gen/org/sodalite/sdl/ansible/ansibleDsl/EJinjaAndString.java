/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJinja And String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaAndString#getJinja_expression_and_string <em>Jinja expression and string</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEJinjaAndString()
 * @model
 * @generated
 */
public interface EJinjaAndString extends EStringPassed
{
  /**
   * Returns the value of the '<em><b>Jinja expression and string</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EJinjaOrString}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jinja expression and string</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEJinjaAndString_Jinja_expression_and_string()
   * @model containment="true"
   * @generated
   */
  EList<EJinjaOrString> getJinja_expression_and_string();

} // EJinjaAndString