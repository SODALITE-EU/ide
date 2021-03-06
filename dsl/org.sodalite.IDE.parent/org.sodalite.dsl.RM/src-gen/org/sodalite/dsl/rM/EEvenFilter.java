/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEven Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EEvenFilter#getNode <em>Node</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EEvenFilter#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EEvenFilter#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEEvenFilter()
 * @model
 * @generated
 */
public interface EEvenFilter extends EObject
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(EPREFIX_REF)
   * @see org.sodalite.dsl.rM.RMPackage#getEEvenFilter_Node()
   * @model containment="true"
   * @generated
   */
  EPREFIX_REF getNode();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EEvenFilter#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(EPREFIX_REF value);

  /**
   * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' containment reference.
   * @see #setRequirement(EPREFIX_REF)
   * @see org.sodalite.dsl.rM.RMPackage#getEEvenFilter_Requirement()
   * @model containment="true"
   * @generated
   */
  EPREFIX_REF getRequirement();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EEvenFilter#getRequirement <em>Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirement</em>' containment reference.
   * @see #getRequirement()
   * @generated
   */
  void setRequirement(EPREFIX_REF value);

  /**
   * Returns the value of the '<em><b>Capability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capability</em>' containment reference.
   * @see #setCapability(EPREFIX_REF)
   * @see org.sodalite.dsl.rM.RMPackage#getEEvenFilter_Capability()
   * @model containment="true"
   * @generated
   */
  EPREFIX_REF getCapability();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EEvenFilter#getCapability <em>Capability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capability</em>' containment reference.
   * @see #getCapability()
   * @generated
   */
  void setCapability(EPREFIX_REF value);

} // EEvenFilter
