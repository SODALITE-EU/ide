/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAutotuning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAutotuning#getTuner <em>Tuner</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAutotuning#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAutotuning()
 * @model
 * @generated
 */
public interface EAutotuning extends EObject
{
  /**
   * Returns the value of the '<em><b>Tuner</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuner</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuner</em>' attribute.
   * @see #setTuner(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAutotuning_Tuner()
   * @model
   * @generated
   */
  String getTuner();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAutotuning#getTuner <em>Tuner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuner</em>' attribute.
   * @see #getTuner()
   * @generated
   */
  void setTuner(String value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAutotuning_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAutotuning#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

} // EAutotuning
