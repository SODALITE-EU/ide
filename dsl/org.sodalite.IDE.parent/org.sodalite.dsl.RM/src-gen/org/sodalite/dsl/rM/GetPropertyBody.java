/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Property Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.GetPropertyBody#getProperty <em>Property</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.GetPropertyBody#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.GetPropertyBody#getReq_cap <em>Req cap</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getGetPropertyBody()
 * @model
 * @generated
 */
public interface GetPropertyBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(EPropertyDefinition)
   * @see org.sodalite.dsl.rM.RMPackage#getGetPropertyBody_Property()
   * @model
   * @generated
   */
  EPropertyDefinition getProperty();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.GetPropertyBody#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(EPropertyDefinition value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' attribute.
   * @see #setEntity(String)
   * @see org.sodalite.dsl.rM.RMPackage#getGetPropertyBody_Entity()
   * @model
   * @generated
   */
  String getEntity();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.GetPropertyBody#getEntity <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' attribute.
   * @see #getEntity()
   * @generated
   */
  void setEntity(String value);

  /**
   * Returns the value of the '<em><b>Req cap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req cap</em>' containment reference.
   * @see #setReq_cap(EPREFIX_TYPE)
   * @see org.sodalite.dsl.rM.RMPackage#getGetPropertyBody_Req_cap()
   * @model containment="true"
   * @generated
   */
  EPREFIX_TYPE getReq_cap();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.GetPropertyBody#getReq_cap <em>Req cap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req cap</em>' containment reference.
   * @see #getReq_cap()
   * @generated
   */
  void setReq_cap(EPREFIX_TYPE value);

} // GetPropertyBody
