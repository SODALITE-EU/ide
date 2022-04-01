/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENode Templates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.ENodeTemplates#getNodeTemplates <em>Node Templates</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.aADM.AADMPackage#getENodeTemplates()
 * @model
 * @generated
 */
public interface ENodeTemplates extends EObject
{
  /**
   * Returns the value of the '<em><b>Node Templates</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.aADM.ENodeTemplate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Templates</em>' containment reference list.
   * @see org.sodalite.dsl.aADM.AADMPackage#getENodeTemplates_NodeTemplates()
   * @model containment="true"
   * @generated
   */
  EList<ENodeTemplate> getNodeTemplates();

} // ENodeTemplates