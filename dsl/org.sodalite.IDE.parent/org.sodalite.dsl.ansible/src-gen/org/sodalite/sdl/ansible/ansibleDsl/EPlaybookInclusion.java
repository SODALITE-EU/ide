/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPlaybook Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlaybookInclusion#getPlaybook_file_name <em>Playbook file name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlaybookInclusion#getWhen_expression <em>When expression</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlaybookInclusion()
 * @model
 * @generated
 */
public interface EPlaybookInclusion extends EObject
{
  /**
   * Returns the value of the '<em><b>Playbook file name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Playbook file name</em>' attribute.
   * @see #setPlaybook_file_name(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlaybookInclusion_Playbook_file_name()
   * @model
   * @generated
   */
  String getPlaybook_file_name();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlaybookInclusion#getPlaybook_file_name <em>Playbook file name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Playbook file name</em>' attribute.
   * @see #getPlaybook_file_name()
   * @generated
   */
  void setPlaybook_file_name(String value);

  /**
   * Returns the value of the '<em><b>When expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When expression</em>' containment reference.
   * @see #setWhen_expression(ECondition)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlaybookInclusion_When_expression()
   * @model containment="true"
   * @generated
   */
  ECondition getWhen_expression();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlaybookInclusion#getWhen_expression <em>When expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When expression</em>' containment reference.
   * @see #getWhen_expression()
   * @generated
   */
  void setWhen_expression(ECondition value);

} // EPlaybookInclusion
