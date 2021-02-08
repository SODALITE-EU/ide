/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EModule Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EModuleCall#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EModuleCall#getDirect_parameter <em>Direct parameter</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EModuleCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEModuleCall()
 * @model
 * @generated
 */
public interface EModuleCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEModuleCall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EModuleCall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Direct parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direct parameter</em>' containment reference.
   * @see #setDirect_parameter(EValuePassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEModuleCall_Direct_parameter()
   * @model containment="true"
   * @generated
   */
  EValuePassed getDirect_parameter();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EModuleCall#getDirect_parameter <em>Direct parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direct parameter</em>' containment reference.
   * @see #getDirect_parameter()
   * @generated
   */
  void setDirect_parameter(EValuePassed value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEModuleCall_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EParameter> getParameters();

} // EModuleCall
