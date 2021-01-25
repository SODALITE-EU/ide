/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESimple Value Jinja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueJinja#getSimple_value_string <em>Simple value string</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueJinja#getSimple_value <em>Simple value</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueJinja#getSimple_value_number <em>Simple value number</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESimpleValueJinja()
 * @model
 * @generated
 */
public interface ESimpleValueJinja extends EValueJinja
{
  /**
   * Returns the value of the '<em><b>Simple value string</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple value string</em>' attribute.
   * @see #setSimple_value_string(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESimpleValueJinja_Simple_value_string()
   * @model
   * @generated
   */
  String getSimple_value_string();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueJinja#getSimple_value_string <em>Simple value string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple value string</em>' attribute.
   * @see #getSimple_value_string()
   * @generated
   */
  void setSimple_value_string(String value);

  /**
   * Returns the value of the '<em><b>Simple value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple value</em>' attribute.
   * @see #setSimple_value(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESimpleValueJinja_Simple_value()
   * @model
   * @generated
   */
  String getSimple_value();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueJinja#getSimple_value <em>Simple value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple value</em>' attribute.
   * @see #getSimple_value()
   * @generated
   */
  void setSimple_value(String value);

  /**
   * Returns the value of the '<em><b>Simple value number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple value number</em>' containment reference.
   * @see #setSimple_value_number(ENumber)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESimpleValueJinja_Simple_value_number()
   * @model containment="true"
   * @generated
   */
  ENumber getSimple_value_number();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueJinja#getSimple_value_number <em>Simple value number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple value number</em>' containment reference.
   * @see #getSimple_value_number()
   * @generated
   */
  void setSimple_value_number(ENumber value);

} // ESimpleValueJinja