/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERequirement Definition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getNode <em>Node</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getStart <em>Start</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody()
 * @model
 * @generated
 */
public interface ERequirementDefinitionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Capability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capability</em>' attribute.
   * @see #setCapability(String)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Capability()
   * @model
   * @generated
   */
  String getCapability();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getCapability <em>Capability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capability</em>' attribute.
   * @see #getCapability()
   * @generated
   */
  void setCapability(String value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' attribute.
   * @see #setNode(String)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Node()
   * @model
   * @generated
   */
  String getNode();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getNode <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' attribute.
   * @see #getNode()
   * @generated
   */
  void setNode(String value);

  /**
   * Returns the value of the '<em><b>Relationship</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship</em>' attribute.
   * @see #setRelationship(String)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Relationship()
   * @model
   * @generated
   */
  String getRelationship();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getRelationship <em>Relationship</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship</em>' attribute.
   * @see #getRelationship()
   * @generated
   */
  void setRelationship(String value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(EAlphaNumericValue)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Start()
   * @model containment="true"
   * @generated
   */
  EAlphaNumericValue getStart();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(EAlphaNumericValue value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(EAlphaNumericValue)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_End()
   * @model containment="true"
   * @generated
   */
  EAlphaNumericValue getEnd();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(EAlphaNumericValue value);

} // ERequirementDefinitionBody
