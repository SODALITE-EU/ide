/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERelationship Type Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getAtributes <em>Atributes</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getValid_target_types <em>Valid target types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypeBody()
 * @model
 * @generated
 */
public interface ERelationshipTypeBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(ERelationshipType)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypeBody_SuperType()
   * @model
   * @generated
   */
  ERelationshipType getSuperType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(ERelationshipType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypeBody_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(EProperties)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypeBody_Properties()
   * @model containment="true"
   * @generated
   */
  EProperties getProperties();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(EProperties value);

  /**
   * Returns the value of the '<em><b>Atributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributes</em>' containment reference.
   * @see #setAtributes(EAttributes)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypeBody_Atributes()
   * @model containment="true"
   * @generated
   */
  EAttributes getAtributes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getAtributes <em>Atributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atributes</em>' containment reference.
   * @see #getAtributes()
   * @generated
   */
  void setAtributes(EAttributes value);

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference.
   * @see #setInterfaces(EInterfaces)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypeBody_Interfaces()
   * @model containment="true"
   * @generated
   */
  EInterfaces getInterfaces();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getInterfaces <em>Interfaces</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interfaces</em>' containment reference.
   * @see #getInterfaces()
   * @generated
   */
  void setInterfaces(EInterfaces value);

  /**
   * Returns the value of the '<em><b>Valid target types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valid target types</em>' containment reference.
   * @see #setValid_target_types(EValidTargetTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypeBody_Valid_target_types()
   * @model containment="true"
   * @generated
   */
  EValidTargetTypes getValid_target_types();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ERelationshipTypeBody#getValid_target_types <em>Valid target types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid target types</em>' containment reference.
   * @see #getValid_target_types()
   * @generated
   */
  void setValid_target_types(EValidTargetTypes value);

} // ERelationshipTypeBody