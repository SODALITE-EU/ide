/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPlay Error Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayErrorHandling#getMax_fail_percentage <em>Max fail percentage</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlayErrorHandling()
 * @model
 * @generated
 */
public interface EPlayErrorHandling extends EErrorHandling
{
  /**
   * Returns the value of the '<em><b>Max fail percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max fail percentage</em>' attribute.
   * @see #setMax_fail_percentage(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlayErrorHandling_Max_fail_percentage()
   * @model
   * @generated
   */
  String getMax_fail_percentage();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayErrorHandling#getMax_fail_percentage <em>Max fail percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max fail percentage</em>' attribute.
   * @see #getMax_fail_percentage()
   * @generated
   */
  void setMax_fail_percentage(String value);

} // EPlayErrorHandling
