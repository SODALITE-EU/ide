/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDelegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EDelegation#getDelegate_to <em>Delegate to</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EDelegation#getDelegate_facts <em>Delegate facts</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDelegation()
 * @model
 * @generated
 */
public interface EDelegation extends EObject
{
  /**
   * Returns the value of the '<em><b>Delegate to</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delegate to</em>' containment reference.
   * @see #setDelegate_to(EStringPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDelegation_Delegate_to()
   * @model containment="true"
   * @generated
   */
  EStringPassed getDelegate_to();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EDelegation#getDelegate_to <em>Delegate to</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delegate to</em>' containment reference.
   * @see #getDelegate_to()
   * @generated
   */
  void setDelegate_to(EStringPassed value);

  /**
   * Returns the value of the '<em><b>Delegate facts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delegate facts</em>' containment reference.
   * @see #setDelegate_facts(EBooleanPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDelegation_Delegate_facts()
   * @model containment="true"
   * @generated
   */
  EBooleanPassed getDelegate_facts();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EDelegation#getDelegate_facts <em>Delegate facts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delegate facts</em>' containment reference.
   * @see #getDelegate_facts()
   * @generated
   */
  void setDelegate_facts(EBooleanPassed value);

} // EDelegation
