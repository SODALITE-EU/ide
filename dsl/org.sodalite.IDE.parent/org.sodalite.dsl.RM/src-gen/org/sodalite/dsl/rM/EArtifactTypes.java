/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EArtifact Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactTypes#getArtifactTypes <em>Artifact Types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypes()
 * @model
 * @generated
 */
public interface EArtifactTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Artifact Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.EArtifactType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypes_ArtifactTypes()
   * @model containment="true"
   * @generated
   */
  EList<EArtifactType> getArtifactTypes();

} // EArtifactTypes
