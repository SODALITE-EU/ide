/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.alerting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPeriod Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.alerting.EPeriodSegment#getValue <em>Value</em>}</li>
 *   <li>{@link org.sodalite.dsl.alerting.EPeriodSegment#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.alerting.AlertingPackage#getEPeriodSegment()
 * @model
 * @generated
 */
public interface EPeriodSegment extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.sodalite.dsl.alerting.AlertingPackage#getEPeriodSegment_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.alerting.EPeriodSegment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see org.sodalite.dsl.alerting.AlertingPackage#getEPeriodSegment_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.alerting.EPeriodSegment#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

} // EPeriodSegment