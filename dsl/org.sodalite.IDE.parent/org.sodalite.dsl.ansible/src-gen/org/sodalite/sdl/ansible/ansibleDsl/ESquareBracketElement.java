/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESquare Bracket Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement#getSlice_notation <em>Slice notation</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESquareBracketElement()
 * @model
 * @generated
 */
public interface ESquareBracketElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(EJinjaExpressionEvaluationWithoutBrackets)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESquareBracketElement_Expression()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionEvaluationWithoutBrackets getExpression();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(EJinjaExpressionEvaluationWithoutBrackets value);

  /**
   * Returns the value of the '<em><b>Slice notation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slice notation</em>' containment reference.
   * @see #setSlice_notation(ESliceNotation)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESquareBracketElement_Slice_notation()
   * @model containment="true"
   * @generated
   */
  ESliceNotation getSlice_notation();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESquareBracketElement#getSlice_notation <em>Slice notation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slice notation</em>' containment reference.
   * @see #getSlice_notation()
   * @generated
   */
  void setSlice_notation(ESliceNotation value);

} // ESquareBracketElement
