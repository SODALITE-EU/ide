/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOr Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EOrExpression#getLeft_or <em>Left or</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EOrExpression#getRight_or <em>Right or</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEOrExpression()
 * @model
 * @generated
 */
public interface EOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left or</em>' containment reference.
   * @see #setLeft_or(EAndExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEOrExpression_Left_or()
   * @model containment="true"
   * @generated
   */
  EAndExpression getLeft_or();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EOrExpression#getLeft_or <em>Left or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left or</em>' containment reference.
   * @see #getLeft_or()
   * @generated
   */
  void setLeft_or(EAndExpression value);

  /**
   * Returns the value of the '<em><b>Right or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right or</em>' containment reference.
   * @see #setRight_or(EOrExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEOrExpression_Right_or()
   * @model containment="true"
   * @generated
   */
  EOrExpression getRight_or();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EOrExpression#getRight_or <em>Right or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right or</em>' containment reference.
   * @see #getRight_or()
   * @generated
   */
  void setRight_or(EOrExpression value);

} // EOrExpression
