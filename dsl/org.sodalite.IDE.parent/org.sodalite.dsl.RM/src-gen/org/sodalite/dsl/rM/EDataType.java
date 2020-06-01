/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EDataType#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEDataType()
 * @model
 * @generated
 */
public interface EDataType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEDataType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EDataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(EDataTypeBody)
   * @see org.sodalite.dsl.rM.RMPackage#getEDataType_Data()
   * @model containment="true"
   * @generated
   */
  EDataTypeBody getData();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EDataType#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(EDataTypeBody value);

} // EDataType
