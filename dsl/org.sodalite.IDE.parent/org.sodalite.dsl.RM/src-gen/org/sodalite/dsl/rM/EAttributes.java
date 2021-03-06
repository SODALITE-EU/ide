/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EAttributes#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEAttributes()
 * @model
 * @generated
 */
public interface EAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.EAttributeDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEAttributes_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<EAttributeDefinition> getAttributes();

} // EAttributes
