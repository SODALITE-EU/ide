/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EHandler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EHandler#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EHandler#getListen_to <em>Listen to</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEHandler()
 * @model
 * @generated
 */
public interface EHandler extends ETaskHandler
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEHandler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EHandler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Listen to</b></em>' reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ENotifiedTopic}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listen to</em>' reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEHandler_Listen_to()
   * @model
   * @generated
   */
  EList<ENotifiedTopic> getListen_to();

} // EHandler
