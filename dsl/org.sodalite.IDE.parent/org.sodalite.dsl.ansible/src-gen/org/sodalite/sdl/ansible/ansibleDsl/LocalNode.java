/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.sodalite.dsl.rM.EInterfaceDefinition;
import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.EOperationDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.LocalNode#getNode_type <em>Node type</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.LocalNode#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.LocalNode#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getLocalNode()
 * @model
 * @generated
 */
public interface LocalNode extends Node
{
  /**
   * Returns the value of the '<em><b>Node type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node type</em>' reference.
   * @see #setNode_type(ENodeType)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getLocalNode_Node_type()
   * @model
   * @generated
   */
  ENodeType getNode_type();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.LocalNode#getNode_type <em>Node type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node type</em>' reference.
   * @see #getNode_type()
   * @generated
   */
  void setNode_type(ENodeType value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(EInterfaceDefinition)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getLocalNode_Interface()
   * @model
   * @generated
   */
  EInterfaceDefinition getInterface();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.LocalNode#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(EInterfaceDefinition value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' reference.
   * @see #setOperation(EOperationDefinition)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getLocalNode_Operation()
   * @model
   * @generated
   */
  EOperationDefinition getOperation();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.LocalNode#getOperation <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(EOperationDefinition value);

} // LocalNode