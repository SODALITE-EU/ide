/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERelationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipType#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipType#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getERelationshipType()
 * @model
 * @generated
 */
public interface ERelationshipType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship</em>' containment reference.
   * @see #setRelationship(ERelationshipTypeBody)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipType_Relationship()
   * @model containment="true"
   * @generated
   */
  ERelationshipTypeBody getRelationship();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipType#getRelationship <em>Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship</em>' containment reference.
   * @see #getRelationship()
   * @generated
   */
  void setRelationship(ERelationshipTypeBody value);

} // ERelationshipType
