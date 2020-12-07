/**
 * generated by Xtext 2.23.0
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