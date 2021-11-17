/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EValid Target Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EValidTargetTypes#getTargetTypes <em>Target Types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEValidTargetTypes()
 * @model
 * @generated
 */
public interface EValidTargetTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.ETargetType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEValidTargetTypes_TargetTypes()
   * @model containment="true"
   * @generated
   */
  EList<ETargetType> getTargetTypes();

} // EValidTargetTypes
