/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELIST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ELIST#getList <em>List</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getELIST()
 * @model
 * @generated
 */
public interface ELIST extends EPropertyAssignmentValue
{
  /**
   * Returns the value of the '<em><b>List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute list.
   * @see org.sodalite.dsl.rM.RMPackage#getELIST_List()
   * @model unique="false"
   * @generated
   */
  EList<String> getList();

} // ELIST
