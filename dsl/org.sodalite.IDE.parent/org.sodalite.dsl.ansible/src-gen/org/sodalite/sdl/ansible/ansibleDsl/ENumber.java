/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENumber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ENumber#getInitial_zeros <em>Initial zeros</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ENumber#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getENumber()
 * @model
 * @generated
 */
public interface ENumber extends EObject
{
  /**
   * Returns the value of the '<em><b>Initial zeros</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial zeros</em>' attribute.
   * @see #setInitial_zeros(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getENumber_Initial_zeros()
   * @model
   * @generated
   */
  String getInitial_zeros();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ENumber#getInitial_zeros <em>Initial zeros</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial zeros</em>' attribute.
   * @see #getInitial_zeros()
   * @generated
   */
  void setInitial_zeros(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getENumber_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ENumber#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

} // ENumber
