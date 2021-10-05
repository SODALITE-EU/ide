/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPolicy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EPolicyType#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EPolicyType#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEPolicyType()
 * @model
 * @generated
 */
public interface EPolicyType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEPolicyType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EPolicyType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' containment reference.
   * @see #setPolicy(EPolicyTypeBody)
   * @see org.sodalite.dsl.rM.RMPackage#getEPolicyType_Policy()
   * @model containment="true"
   * @generated
   */
  EPolicyTypeBody getPolicy();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EPolicyType#getPolicy <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' containment reference.
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(EPolicyTypeBody value);

} // EPolicyType
