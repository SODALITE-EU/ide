/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EItem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EItem#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEItem()
 * @model
 * @generated
 */
public interface EItem extends EValuePassedToJinjaExpression
{
  /**
   * Returns the value of the '<em><b>Tail</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' attribute list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEItem_Tail()
   * @model unique="false"
   * @generated
   */
  EList<String> getTail();

} // EItem
