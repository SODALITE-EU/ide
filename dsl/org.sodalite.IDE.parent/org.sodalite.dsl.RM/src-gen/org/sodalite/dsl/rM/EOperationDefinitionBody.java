/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation Definition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EOperationDefinitionBody#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EOperationDefinitionBody#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EOperationDefinitionBody#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEOperationDefinitionBody()
 * @model
 * @generated
 */
public interface EOperationDefinitionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEOperationDefinitionBody_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EOperationDefinitionBody#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference.
   * @see #setInputs(EInputs)
   * @see org.sodalite.dsl.rM.RMPackage#getEOperationDefinitionBody_Inputs()
   * @model containment="true"
   * @generated
   */
  EInputs getInputs();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EOperationDefinitionBody#getInputs <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' containment reference.
   * @see #getInputs()
   * @generated
   */
  void setInputs(EInputs value);

  /**
   * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation</em>' containment reference.
   * @see #setImplementation(EImplementation)
   * @see org.sodalite.dsl.rM.RMPackage#getEOperationDefinitionBody_Implementation()
   * @model containment="true"
   * @generated
   */
  EImplementation getImplementation();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EOperationDefinitionBody#getImplementation <em>Implementation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation</em>' containment reference.
   * @see #getImplementation()
   * @generated
   */
  void setImplementation(EImplementation value);

} // EOperationDefinitionBody
