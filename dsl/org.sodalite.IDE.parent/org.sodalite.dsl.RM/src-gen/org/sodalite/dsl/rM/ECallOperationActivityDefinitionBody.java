/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECall Operation Activity Definition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ECallOperationActivityDefinitionBody#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECallOperationActivityDefinitionBody#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getECallOperationActivityDefinitionBody()
 * @model
 * @generated
 */
public interface ECallOperationActivityDefinitionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(EPREFIX_TYPE)
   * @see org.sodalite.dsl.rM.RMPackage#getECallOperationActivityDefinitionBody_Name()
   * @model containment="true"
   * @generated
   */
  EPREFIX_TYPE getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECallOperationActivityDefinitionBody#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(EPREFIX_TYPE value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference.
   * @see #setInputs(EPropertyAssignments)
   * @see org.sodalite.dsl.rM.RMPackage#getECallOperationActivityDefinitionBody_Inputs()
   * @model containment="true"
   * @generated
   */
  EPropertyAssignments getInputs();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECallOperationActivityDefinitionBody#getInputs <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' containment reference.
   * @see #getInputs()
   * @generated
   */
  void setInputs(EPropertyAssignments value);

} // ECallOperationActivityDefinitionBody
