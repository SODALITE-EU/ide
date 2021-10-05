/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESIGNEDINT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ESIGNEDINT#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getESIGNEDINT()
 * @model
 * @generated
 */
public interface ESIGNEDINT extends ESingleValue, EAlphaNumericValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.sodalite.dsl.rM.RMPackage#getESIGNEDINT_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ESIGNEDINT#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // ESIGNEDINT