/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENotified Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ENotifiedHandler#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getENotifiedHandler()
 * @model
 * @generated
 */
public interface ENotifiedHandler extends ENotifiable
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(EHandler)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getENotifiedHandler_Name()
   * @model
   * @generated
   */
  EHandler getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ENotifiedHandler#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(EHandler value);

} // ENotifiedHandler
