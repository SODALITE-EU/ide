/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EParameterDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EParameterDefinition#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEParameterDefinition()
 * @model
 * @generated
 */
public interface EParameterDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEParameterDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EParameterDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(EParameterDefinitionBody)
   * @see org.sodalite.dsl.rM.RMPackage#getEParameterDefinition_Parameter()
   * @model containment="true"
   * @generated
   */
  EParameterDefinitionBody getParameter();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EParameterDefinition#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(EParameterDefinitionBody value);

} // EParameterDefinition
