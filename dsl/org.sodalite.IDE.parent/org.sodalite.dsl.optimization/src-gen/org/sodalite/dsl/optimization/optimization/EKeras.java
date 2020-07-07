/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EKeras</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EKeras#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EKeras#getBackend <em>Backend</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEKeras()
 * @model
 * @generated
 */
public interface EKeras extends EObject
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEKeras_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EKeras#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Backend</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Backend</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Backend</em>' attribute.
   * @see #setBackend(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEKeras_Backend()
   * @model
   * @generated
   */
  String getBackend();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EKeras#getBackend <em>Backend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Backend</em>' attribute.
   * @see #getBackend()
   * @generated
   */
  void setBackend(String value);

} // EKeras
