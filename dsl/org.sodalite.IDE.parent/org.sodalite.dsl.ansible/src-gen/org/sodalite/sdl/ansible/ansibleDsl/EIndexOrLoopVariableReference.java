/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIndex Or Loop Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EIndexOrLoopVariableReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIndexOrLoopVariableReference()
 * @model
 * @generated
 */
public interface EIndexOrLoopVariableReference extends EVariableReference
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(EIndexOrLoopVariable)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEIndexOrLoopVariableReference_Name()
   * @model
   * @generated
   */
  EIndexOrLoopVariable getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EIndexOrLoopVariableReference#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(EIndexOrLoopVariable value);

} // EIndexOrLoopVariableReference
