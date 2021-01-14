/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETask Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getError_handling <em>Error handling</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getAction <em>Action</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getAsynchronous_settings <em>Asynchronous settings</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getArgs <em>Args</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getModule <em>Module</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getNotifiables <em>Notifiables</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler()
 * @model
 * @generated
 */
public interface ETaskHandler extends EExecution
{
  /**
   * Returns the value of the '<em><b>Error handling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error handling</em>' containment reference.
   * @see #setError_handling(ETaskHandlerErrorHandling)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Error_handling()
   * @model containment="true"
   * @generated
   */
  ETaskHandlerErrorHandling getError_handling();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getError_handling <em>Error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error handling</em>' containment reference.
   * @see #getError_handling()
   * @generated
   */
  void setError_handling(ETaskHandlerErrorHandling value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(EJinjaExpressionAndString)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Action()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionAndString getAction();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(EJinjaExpressionAndString value);

  /**
   * Returns the value of the '<em><b>Asynchronous settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asynchronous settings</em>' containment reference.
   * @see #setAsynchronous_settings(EAsynchronousSettings)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Asynchronous_settings()
   * @model containment="true"
   * @generated
   */
  EAsynchronousSettings getAsynchronous_settings();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getAsynchronous_settings <em>Asynchronous settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asynchronous settings</em>' containment reference.
   * @see #getAsynchronous_settings()
   * @generated
   */
  void setAsynchronous_settings(EAsynchronousSettings value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(EDictionaryPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Args()
   * @model containment="true"
   * @generated
   */
  EDictionaryPassed getArgs();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(EDictionaryPassed value);

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(EModuleCall)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Module()
   * @model containment="true"
   * @generated
   */
  EModuleCall getModule();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(EModuleCall value);

  /**
   * Returns the value of the '<em><b>Notifiables</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ENotifiable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notifiables</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Notifiables()
   * @model containment="true"
   * @generated
   */
  EList<ENotifiable> getNotifiables();

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(ELoop)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Loop()
   * @model containment="true"
   * @generated
   */
  ELoop getLoop();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(ELoop value);

  /**
   * Returns the value of the '<em><b>Register</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Register</em>' containment reference.
   * @see #setRegister(ERegisterVariable)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandler_Register()
   * @model containment="true"
   * @generated
   */
  ERegisterVariable getRegister();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler#getRegister <em>Register</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Register</em>' containment reference.
   * @see #getRegister()
   * @generated
   */
  void setRegister(ERegisterVariable value);

} // ETaskHandler