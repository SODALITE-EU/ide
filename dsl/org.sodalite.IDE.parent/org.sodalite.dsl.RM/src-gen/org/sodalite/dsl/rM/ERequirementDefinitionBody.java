/**
 * generated by Xtext 2.19.0
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
   * Returns the value of the '<em><b>Capability</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capability</em>' reference.
   * @see #setCapability(ECapabilityType)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Capability()
   * @model
   * @generated
   */
  ECapabilityType getCapability();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getCapability <em>Capability</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capability</em>' reference.
   * @see #getCapability()
   * @generated
   */
  void setCapability(ECapabilityType value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(ENodeType)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Node()
   * @model
   * @generated
   */
  ENodeType getNode();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(ENodeType value);

  /**
   * Returns the value of the '<em><b>Relationship</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship</em>' reference.
   * @see #setRelationship(ERelationshipType)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Relationship()
   * @model
   * @generated
   */
  ERelationshipType getRelationship();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getRelationship <em>Relationship</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship</em>' reference.
   * @see #getRelationship()
   * @generated
   */
  void setRelationship(ERelationshipType value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(String)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_Start()
   * @model
   * @generated
   */
  String getStart();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(String value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see org.sodalite.dsl.rM.RMPackage#getERequirementDefinitionBody_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERequirementDefinitionBody#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

} // ERequirementDefinitionBody