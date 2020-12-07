/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAsynchronous Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings#getAsync <em>Async</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings#getPoll <em>Poll</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEAsynchronousSettings()
 * @model
 * @generated
 */
public interface EAsynchronousSettings extends EObject
{
  /**
   * Returns the value of the '<em><b>Async</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Async</em>' attribute.
   * @see #setAsync(int)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEAsynchronousSettings_Async()
   * @model
   * @generated
   */
  int getAsync();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings#getAsync <em>Async</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Async</em>' attribute.
   * @see #getAsync()
   * @generated
   */
  void setAsync(int value);

  /**
   * Returns the value of the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poll</em>' attribute.
   * @see #setPoll(int)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEAsynchronousSettings_Poll()
   * @model
   * @generated
   */
  int getPoll();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings#getPoll <em>Poll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Poll</em>' attribute.
   * @see #getPoll()
   * @generated
   */
  void setPoll(int value);

} // EAsynchronousSettings