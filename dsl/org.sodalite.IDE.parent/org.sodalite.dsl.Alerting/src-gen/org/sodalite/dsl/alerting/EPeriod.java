/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.alerting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPeriod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.alerting.EPeriod#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.alerting.AlertingPackage#getEPeriod()
 * @model
 * @generated
 */
public interface EPeriod extends EObject
{
  /**
   * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.alerting.EPeriodSegment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments</em>' containment reference list.
   * @see org.sodalite.dsl.alerting.AlertingPackage#getEPeriod_Segments()
   * @model containment="true"
   * @generated
   */
  EList<EPeriodSegment> getSegments();

} // EPeriod