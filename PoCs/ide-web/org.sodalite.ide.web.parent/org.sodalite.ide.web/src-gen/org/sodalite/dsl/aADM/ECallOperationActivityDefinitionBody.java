/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM;

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
 *   <li>{@link org.sodalite.dsl.aADM.ECallOperationActivityDefinitionBody#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.ECallOperationActivityDefinitionBody#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.aADM.AADMPackage#getECallOperationActivityDefinitionBody()
 * @model
 * @generated
 */
public interface ECallOperationActivityDefinitionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(EPREFIX_TYPE)
   * @see org.sodalite.dsl.aADM.AADMPackage#getECallOperationActivityDefinitionBody_Operation()
   * @model containment="true"
   * @generated
   */
  EPREFIX_TYPE getOperation();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.ECallOperationActivityDefinitionBody#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(EPREFIX_TYPE value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference.
   * @see #setInputs(EPropertyAssignments)
   * @see org.sodalite.dsl.aADM.AADMPackage#getECallOperationActivityDefinitionBody_Inputs()
   * @model containment="true"
   * @generated
   */
  EPropertyAssignments getInputs();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.ECallOperationActivityDefinitionBody#getInputs <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' containment reference.
   * @see #getInputs()
   * @generated
   */
  void setInputs(EPropertyAssignments value);

} // ECallOperationActivityDefinitionBody
