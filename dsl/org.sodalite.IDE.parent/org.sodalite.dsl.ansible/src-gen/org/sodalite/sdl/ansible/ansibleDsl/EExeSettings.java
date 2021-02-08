/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EExe Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EExeSettings#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EExeSettings#getRun_once <em>Run once</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEExeSettings()
 * @model
 * @generated
 */
public interface EExeSettings extends EObject
{
  /**
   * Returns the value of the '<em><b>Throttle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Throttle</em>' containment reference.
   * @see #setThrottle(ENumberPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEExeSettings_Throttle()
   * @model containment="true"
   * @generated
   */
  ENumberPassed getThrottle();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EExeSettings#getThrottle <em>Throttle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Throttle</em>' containment reference.
   * @see #getThrottle()
   * @generated
   */
  void setThrottle(ENumberPassed value);

  /**
   * Returns the value of the '<em><b>Run once</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run once</em>' containment reference.
   * @see #setRun_once(EBooleanPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEExeSettings_Run_once()
   * @model containment="true"
   * @generated
   */
  EBooleanPassed getRun_once();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EExeSettings#getRun_once <em>Run once</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run once</em>' containment reference.
   * @see #getRun_once()
   * @generated
   */
  void setRun_once(EBooleanPassed value);

} // EExeSettings
