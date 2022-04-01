/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EActivity Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.EActivityDefinitions#getList <em>List</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.aADM.AADMPackage#getEActivityDefinitions()
 * @model
 * @generated
 */
public interface EActivityDefinitions extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.aADM.EActivityDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see org.sodalite.dsl.aADM.AADMPackage#getEActivityDefinitions_List()
   * @model containment="true"
   * @generated
   */
  EList<EActivityDefinition> getList();

} // EActivityDefinitions