/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESimple Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue#getSimple_value_string <em>Simple value string</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue#getSimple_value_without_string <em>Simple value without string</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESimpleValue()
 * @model
 * @generated
 */
public interface ESimpleValue extends EValue
{
  /**
   * Returns the value of the '<em><b>Simple value string</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple value string</em>' attribute.
   * @see #setSimple_value_string(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESimpleValue_Simple_value_string()
   * @model
   * @generated
   */
  String getSimple_value_string();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue#getSimple_value_string <em>Simple value string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple value string</em>' attribute.
   * @see #getSimple_value_string()
   * @generated
   */
  void setSimple_value_string(String value);

  /**
   * Returns the value of the '<em><b>Simple value without string</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple value without string</em>' containment reference.
   * @see #setSimple_value_without_string(ESimpleValueWithoutString)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESimpleValue_Simple_value_without_string()
   * @model containment="true"
   * @generated
   */
  ESimpleValueWithoutString getSimple_value_without_string();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue#getSimple_value_without_string <em>Simple value without string</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple value without string</em>' containment reference.
   * @see #getSimple_value_without_string()
   * @generated
   */
  void setSimple_value_without_string(ESimpleValueWithoutString value);

} // ESimpleValue