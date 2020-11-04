/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Attribute Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.GetAttributeBody#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.GetAttributeBody#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.GetAttributeBody#getReq_cap <em>Req cap</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getGetAttributeBody()
 * @model
 * @generated
 */
public interface GetAttributeBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(EPREFIX_TYPE)
   * @see org.sodalite.dsl.rM.RMPackage#getGetAttributeBody_Attribute()
   * @model containment="true"
   * @generated
   */
  EPREFIX_TYPE getAttribute();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.GetAttributeBody#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(EPREFIX_TYPE value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' attribute.
   * @see #setEntity(String)
   * @see org.sodalite.dsl.rM.RMPackage#getGetAttributeBody_Entity()
   * @model
   * @generated
   */
  String getEntity();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.GetAttributeBody#getEntity <em>Entity</em>}' attribute.
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
   * @see org.sodalite.dsl.rM.RMPackage#getGetAttributeBody_Req_cap()
   * @model containment="true"
   * @generated
   */
  EPREFIX_TYPE getReq_cap();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.GetAttributeBody#getReq_cap <em>Req cap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req cap</em>' containment reference.
   * @see #getReq_cap()
   * @generated
   */
  void setReq_cap(EPREFIX_TYPE value);

} // GetAttributeBody
