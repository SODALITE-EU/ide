/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EValid Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EValidSourceType#getSourceTypes <em>Source Types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEValidSourceType()
 * @model
 * @generated
 */
public interface EValidSourceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.EPREFIX_TYPE}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEValidSourceType_SourceTypes()
   * @model containment="true"
   * @generated
   */
  EList<EPREFIX_TYPE> getSourceTypes();

} // EValidSourceType
