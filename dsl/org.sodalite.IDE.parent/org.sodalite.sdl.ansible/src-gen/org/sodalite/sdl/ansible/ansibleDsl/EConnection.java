/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EConnection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EConnection#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EConnection#getPort <em>Port</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EConnection#getRemote_user <em>Remote user</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEConnection()
 * @model
 * @generated
 */
public interface EConnection extends EObject
{
  /**
   * Returns the value of the '<em><b>Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' attribute.
   * @see #setConnection(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEConnection_Connection()
   * @model
   * @generated
   */
  String getConnection();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EConnection#getConnection <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection</em>' attribute.
   * @see #getConnection()
   * @generated
   */
  void setConnection(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEConnection_Port()
   * @model
   * @generated
   */
  String getPort();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EConnection#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(String value);

  /**
   * Returns the value of the '<em><b>Remote user</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote user</em>' attribute.
   * @see #setRemote_user(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEConnection_Remote_user()
   * @model
   * @generated
   */
  String getRemote_user();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EConnection#getRemote_user <em>Remote user</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote user</em>' attribute.
   * @see #getRemote_user()
   * @generated
   */
  void setRemote_user(String value);

} // EConnection
