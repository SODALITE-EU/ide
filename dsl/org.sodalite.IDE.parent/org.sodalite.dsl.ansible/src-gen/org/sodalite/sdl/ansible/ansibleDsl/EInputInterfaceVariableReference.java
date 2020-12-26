/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.sodalite.dsl.rM.EPropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EInput Interface Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EInputInterfaceVariableReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEInputInterfaceVariableReference()
 * @model
 * @generated
 */
public interface EInputInterfaceVariableReference extends EVariableReference
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(EPropertyDefinition)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEInputInterfaceVariableReference_Name()
   * @model
   * @generated
   */
  EPropertyDefinition getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EInputInterfaceVariableReference#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(EPropertyDefinition value);

} // EInputInterfaceVariableReference
