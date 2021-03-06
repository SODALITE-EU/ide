/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERole Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion#getError_handling <em>Error handling</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getERoleInclusion()
 * @model
 * @generated
 */
public interface ERoleInclusion extends EExecution
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(EStringPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getERoleInclusion_Name()
   * @model containment="true"
   * @generated
   */
  EStringPassed getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(EStringPassed value);

  /**
   * Returns the value of the '<em><b>Error handling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error handling</em>' containment reference.
   * @see #setError_handling(EBlockAndRoleErrorHandling)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getERoleInclusion_Error_handling()
   * @model containment="true"
   * @generated
   */
  EBlockAndRoleErrorHandling getError_handling();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion#getError_handling <em>Error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error handling</em>' containment reference.
   * @see #getError_handling()
   * @generated
   */
  void setError_handling(EBlockAndRoleErrorHandling value);

} // ERoleInclusion
