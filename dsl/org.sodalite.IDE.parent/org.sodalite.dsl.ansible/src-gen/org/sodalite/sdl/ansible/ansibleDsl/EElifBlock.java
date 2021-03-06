/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EElif Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EElifBlock#getElif_block_sign <em>Elif block sign</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EElifBlock#getElif_condition <em>Elif condition</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EElifBlock#getElif_body <em>Elif body</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEElifBlock()
 * @model
 * @generated
 */
public interface EElifBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Elif block sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elif block sign</em>' attribute.
   * @see #setElif_block_sign(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEElifBlock_Elif_block_sign()
   * @model
   * @generated
   */
  String getElif_block_sign();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EElifBlock#getElif_block_sign <em>Elif block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elif block sign</em>' attribute.
   * @see #getElif_block_sign()
   * @generated
   */
  void setElif_block_sign(String value);

  /**
   * Returns the value of the '<em><b>Elif condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elif condition</em>' containment reference.
   * @see #setElif_condition(EFilteredExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEElifBlock_Elif_condition()
   * @model containment="true"
   * @generated
   */
  EFilteredExpression getElif_condition();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EElifBlock#getElif_condition <em>Elif condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elif condition</em>' containment reference.
   * @see #getElif_condition()
   * @generated
   */
  void setElif_condition(EFilteredExpression value);

  /**
   * Returns the value of the '<em><b>Elif body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elif body</em>' containment reference.
   * @see #setElif_body(EValuePassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEElifBlock_Elif_body()
   * @model containment="true"
   * @generated
   */
  EValuePassed getElif_body();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EElifBlock#getElif_body <em>Elif body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elif body</em>' containment reference.
   * @see #getElif_body()
   * @generated
   */
  void setElif_body(EValuePassed value);

} // EElifBlock
