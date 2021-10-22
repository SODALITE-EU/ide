/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EError Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getAny_errors_fatal <em>Any errors fatal</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_errors <em>Ignore errors</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_unreachable <em>Ignore unreachable</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling()
 * @model
 * @generated
 */
public interface EErrorHandling extends EObject
{
  /**
   * Returns the value of the '<em><b>Any errors fatal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any errors fatal</em>' containment reference.
   * @see #setAny_errors_fatal(EBooleanPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling_Any_errors_fatal()
   * @model containment="true"
   * @generated
   */
  EBooleanPassed getAny_errors_fatal();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getAny_errors_fatal <em>Any errors fatal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any errors fatal</em>' containment reference.
   * @see #getAny_errors_fatal()
   * @generated
   */
  void setAny_errors_fatal(EBooleanPassed value);

  /**
   * Returns the value of the '<em><b>Ignore errors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore errors</em>' containment reference.
   * @see #setIgnore_errors(EBooleanPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling_Ignore_errors()
   * @model containment="true"
   * @generated
   */
  EBooleanPassed getIgnore_errors();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_errors <em>Ignore errors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore errors</em>' containment reference.
   * @see #getIgnore_errors()
   * @generated
   */
  void setIgnore_errors(EBooleanPassed value);

  /**
   * Returns the value of the '<em><b>Ignore unreachable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore unreachable</em>' containment reference.
   * @see #setIgnore_unreachable(EBooleanPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling_Ignore_unreachable()
   * @model containment="true"
   * @generated
   */
  EBooleanPassed getIgnore_unreachable();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_unreachable <em>Ignore unreachable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore unreachable</em>' containment reference.
   * @see #getIgnore_unreachable()
   * @generated
   */
  void setIgnore_unreachable(EBooleanPassed value);

} // EErrorHandling