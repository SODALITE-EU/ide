/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOPENMP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOPENMP#getNumber_of_threads <em>Number of threads</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOPENMP#getScaling_efficiency <em>Scaling efficiency</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOPENMP#getAffinity <em>Affinity</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENMP()
 * @model
 * @generated
 */
public interface EOPENMP extends EObject
{
  /**
   * Returns the value of the '<em><b>Number of threads</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number of threads</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number of threads</em>' attribute.
   * @see #setNumber_of_threads(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENMP_Number_of_threads()
   * @model
   * @generated
   */
  int getNumber_of_threads();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOPENMP#getNumber_of_threads <em>Number of threads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number of threads</em>' attribute.
   * @see #getNumber_of_threads()
   * @generated
   */
  void setNumber_of_threads(int value);

  /**
   * Returns the value of the '<em><b>Scaling efficiency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scaling efficiency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scaling efficiency</em>' attribute.
   * @see #setScaling_efficiency(Double)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENMP_Scaling_efficiency()
   * @model
   * @generated
   */
  Double getScaling_efficiency();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOPENMP#getScaling_efficiency <em>Scaling efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scaling efficiency</em>' attribute.
   * @see #getScaling_efficiency()
   * @generated
   */
  void setScaling_efficiency(Double value);

  /**
   * Returns the value of the '<em><b>Affinity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affinity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affinity</em>' attribute.
   * @see #setAffinity(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENMP_Affinity()
   * @model
   * @generated
   */
  String getAffinity();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOPENMP#getAffinity <em>Affinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Affinity</em>' attribute.
   * @see #getAffinity()
   * @generated
   */
  void setAffinity(String value);

} // EOPENMP
