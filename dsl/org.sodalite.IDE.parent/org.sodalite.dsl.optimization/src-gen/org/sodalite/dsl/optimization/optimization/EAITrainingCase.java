/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAI Training Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingCase#getAi_training <em>Ai training</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingCase()
 * @model
 * @generated
 */
public interface EAITrainingCase extends EOptimizationCases
{
  /**
   * Returns the value of the '<em><b>Ai training</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ai training</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ai training</em>' containment reference.
   * @see #setAi_training(EAITraining)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingCase_Ai_training()
   * @model containment="true"
   * @generated
   */
  EAITraining getAi_training();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingCase#getAi_training <em>Ai training</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ai training</em>' containment reference.
   * @see #getAi_training()
   * @generated
   */
  void setAi_training(EAITraining value);

} // EAITrainingCase
