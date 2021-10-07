/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECapability Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.ECapabilityAssignment#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.ECapabilityAssignment#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.aADM.AADMPackage#getECapabilityAssignment()
 * @model
 * @generated
 */
public interface ECapabilityAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.aADM.AADMPackage#getECapabilityAssignment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.ECapabilityAssignment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(EPropertyAssignments)
   * @see org.sodalite.dsl.aADM.AADMPackage#getECapabilityAssignment_Properties()
   * @model containment="true"
   * @generated
   */
  EPropertyAssignments getProperties();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.ECapabilityAssignment#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(EPropertyAssignments value);

} // ECapabilityAssignment
