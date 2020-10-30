/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute Definition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getType <em>Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getDefault <em>Default</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getStatus <em>Status</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getEntry_schema <em>Entry schema</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEAttributeDefinitionBody()
 * @model
 * @generated
 */
public interface EAttributeDefinitionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEAttributeDefinitionBody_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEAttributeDefinitionBody_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(EValueExpression)
   * @see org.sodalite.dsl.rM.RMPackage#getEAttributeDefinitionBody_Default()
   * @model containment="true"
   * @generated
   */
  EValueExpression getDefault();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(EValueExpression value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEAttributeDefinitionBody_Status()
   * @model
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

  /**
   * Returns the value of the '<em><b>Entry schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry schema</em>' attribute.
   * @see #setEntry_schema(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEAttributeDefinitionBody_Entry_schema()
   * @model
   * @generated
   */
  String getEntry_schema();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EAttributeDefinitionBody#getEntry_schema <em>Entry schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry schema</em>' attribute.
   * @see #getEntry_schema()
   * @generated
   */
  void setEntry_schema(String value);

} // EAttributeDefinitionBody
