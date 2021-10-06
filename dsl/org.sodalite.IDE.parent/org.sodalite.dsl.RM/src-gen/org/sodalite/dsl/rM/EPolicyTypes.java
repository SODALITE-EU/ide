/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPolicy Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EPolicyTypes#getPolicyTypes <em>Policy Types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEPolicyTypes()
 * @model
 * @generated
 */
public interface EPolicyTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Policy Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.EPolicyType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy Types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEPolicyTypes_PolicyTypes()
   * @model containment="true"
   * @generated
   */
  EList<EPolicyType> getPolicyTypes();

} // EPolicyTypes
