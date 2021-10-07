/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIn Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.EInRange#getStart <em>Start</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.EInRange#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.aADM.AADMPackage#getEInRange()
 * @model
 * @generated
 */
public interface EInRange extends EConstraint
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(EAlphaNumericValue)
   * @see org.sodalite.dsl.aADM.AADMPackage#getEInRange_Start()
   * @model containment="true"
   * @generated
   */
  EAlphaNumericValue getStart();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.EInRange#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(EAlphaNumericValue value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(EAlphaNumericValue)
   * @see org.sodalite.dsl.aADM.AADMPackage#getEInRange_End()
   * @model containment="true"
   * @generated
   */
  EAlphaNumericValue getEnd();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.EInRange#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(EAlphaNumericValue value);

} // EInRange
