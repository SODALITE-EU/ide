/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EOperation#getLeft_operand <em>Left operand</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EOperation#getRight_operand <em>Right operand</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEOperation()
 * @model
 * @generated
 */
public interface EOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Left operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left operand</em>' containment reference.
   * @see #setLeft_operand(EIsExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEOperation_Left_operand()
   * @model containment="true"
   * @generated
   */
  EIsExpression getLeft_operand();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EOperation#getLeft_operand <em>Left operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left operand</em>' containment reference.
   * @see #getLeft_operand()
   * @generated
   */
  void setLeft_operand(EIsExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEOperation_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EOperation#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Right operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right operand</em>' containment reference.
   * @see #setRight_operand(EOperation)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEOperation_Right_operand()
   * @model containment="true"
   * @generated
   */
  EOperation getRight_operand();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EOperation#getRight_operand <em>Right operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right operand</em>' containment reference.
   * @see #getRight_operand()
   * @generated
   */
  void setRight_operand(EOperation value);

} // EOperation
