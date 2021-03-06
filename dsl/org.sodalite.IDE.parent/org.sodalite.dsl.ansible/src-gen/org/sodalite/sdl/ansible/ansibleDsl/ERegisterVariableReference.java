/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERegister Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ERegisterVariableReference#getRegister_variable_reference <em>Register variable reference</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getERegisterVariableReference()
 * @model
 * @generated
 */
public interface ERegisterVariableReference extends EVariableReference
{
  /**
   * Returns the value of the '<em><b>Register variable reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Register variable reference</em>' reference.
   * @see #setRegister_variable_reference(ERegisterVariable)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getERegisterVariableReference_Register_variable_reference()
   * @model
   * @generated
   */
  ERegisterVariable getRegister_variable_reference();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ERegisterVariableReference#getRegister_variable_reference <em>Register variable reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Register variable reference</em>' reference.
   * @see #getRegister_variable_reference()
   * @generated
   */
  void setRegister_variable_reference(ERegisterVariable value);

} // ERegisterVariableReference
