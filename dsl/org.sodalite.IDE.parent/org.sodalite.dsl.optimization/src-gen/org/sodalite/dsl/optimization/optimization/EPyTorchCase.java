/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.optimization.optimization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPy Torch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EPyTorchCase#getPytorch <em>Pytorch</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEPyTorchCase()
 * @model
 * @generated
 */
public interface EPyTorchCase extends EAITrainingCases
{
  /**
   * Returns the value of the '<em><b>Pytorch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pytorch</em>' containment reference.
   * @see #setPytorch(EPyTorch)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEPyTorchCase_Pytorch()
   * @model containment="true"
   * @generated
   */
  EPyTorch getPytorch();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EPyTorchCase#getPytorch <em>Pytorch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pytorch</em>' containment reference.
   * @see #getPytorch()
   * @generated
   */
  void setPytorch(EPyTorch value);

} // EPyTorchCase
