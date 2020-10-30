/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPolicy Type Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EPolicyTypeBody#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EPolicyTypeBody#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEPolicyTypeBody()
 * @model
 * @generated
 */
public interface EPolicyTypeBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' attribute.
   * @see #setSuperType(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEPolicyTypeBody_SuperType()
   * @model
   * @generated
   */
  String getSuperType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EPolicyTypeBody#getSuperType <em>Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' attribute.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEPolicyTypeBody_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EPolicyTypeBody#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // EPolicyTypeBody
