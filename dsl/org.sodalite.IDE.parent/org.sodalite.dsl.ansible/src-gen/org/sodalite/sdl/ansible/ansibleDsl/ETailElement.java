/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETail Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETailElement#getFunction_call <em>Function call</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETailElement#getSquare_bracket_elements <em>Square bracket elements</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETailElement()
 * @model
 * @generated
 */
public interface ETailElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Function call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function call</em>' containment reference.
   * @see #setFunction_call(EFunctionCallOrVariable)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETailElement_Function_call()
   * @model containment="true"
   * @generated
   */
  EFunctionCallOrVariable getFunction_call();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETailElement#getFunction_call <em>Function call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function call</em>' containment reference.
   * @see #getFunction_call()
   * @generated
   */
  void setFunction_call(EFunctionCallOrVariable value);

  /**
   * Returns the value of the '<em><b>Square bracket elements</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Square bracket elements</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETailElement_Square_bracket_elements()
   * @model containment="true"
   * @generated
   */
  EList<ESquareBracketElement> getSquare_bracket_elements();

} // ETailElement
