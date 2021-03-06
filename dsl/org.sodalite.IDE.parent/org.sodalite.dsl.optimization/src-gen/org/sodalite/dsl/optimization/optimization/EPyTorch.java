/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPy Torch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EPyTorch#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EPyTorch#isGlow <em>Glow</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEPyTorch()
 * @model
 * @generated
 */
public interface EPyTorch extends EObject
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEPyTorch_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EPyTorch#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Glow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glow</em>' attribute.
   * @see #setGlow(boolean)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEPyTorch_Glow()
   * @model
   * @generated
   */
  boolean isGlow();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EPyTorch#isGlow <em>Glow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glow</em>' attribute.
   * @see #isGlow()
   * @generated
   */
  void setGlow(boolean value);

} // EPyTorch
