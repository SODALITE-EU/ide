/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFacts Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getGather_facts <em>Gather facts</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getGather_subset <em>Gather subset</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getGather_timeout <em>Gather timeout</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getFact_path <em>Fact path</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFactsSettings()
 * @model
 * @generated
 */
public interface EFactsSettings extends EObject
{
  /**
   * Returns the value of the '<em><b>Gather facts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gather facts</em>' containment reference.
   * @see #setGather_facts(EBooleanPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFactsSettings_Gather_facts()
   * @model containment="true"
   * @generated
   */
  EBooleanPassed getGather_facts();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getGather_facts <em>Gather facts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gather facts</em>' containment reference.
   * @see #getGather_facts()
   * @generated
   */
  void setGather_facts(EBooleanPassed value);

  /**
   * Returns the value of the '<em><b>Gather subset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gather subset</em>' containment reference.
   * @see #setGather_subset(EValuePassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFactsSettings_Gather_subset()
   * @model containment="true"
   * @generated
   */
  EValuePassed getGather_subset();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getGather_subset <em>Gather subset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gather subset</em>' containment reference.
   * @see #getGather_subset()
   * @generated
   */
  void setGather_subset(EValuePassed value);

  /**
   * Returns the value of the '<em><b>Gather timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gather timeout</em>' containment reference.
   * @see #setGather_timeout(ENumberPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFactsSettings_Gather_timeout()
   * @model containment="true"
   * @generated
   */
  ENumberPassed getGather_timeout();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getGather_timeout <em>Gather timeout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gather timeout</em>' containment reference.
   * @see #getGather_timeout()
   * @generated
   */
  void setGather_timeout(ENumberPassed value);

  /**
   * Returns the value of the '<em><b>Fact path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact path</em>' containment reference.
   * @see #setFact_path(EStringPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFactsSettings_Fact_path()
   * @model containment="true"
   * @generated
   */
  EStringPassed getFact_path();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings#getFact_path <em>Fact path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact path</em>' containment reference.
   * @see #getFact_path()
   * @generated
   */
  void setFact_path(EStringPassed value);

} // EFactsSettings
