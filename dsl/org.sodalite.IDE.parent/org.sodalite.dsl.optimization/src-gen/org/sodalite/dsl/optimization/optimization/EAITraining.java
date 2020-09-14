/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAI Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITraining#getConfig <em>Config</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITraining#getData <em>Data</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITraining#getAitrainingcase <em>Aitrainingcase</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITraining()
 * @model
 * @generated
 */
public interface EAITraining extends EObject
{
  /**
   * Returns the value of the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' containment reference.
   * @see #setConfig(EAITrainingConfig)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITraining_Config()
   * @model containment="true"
   * @generated
   */
  EAITrainingConfig getConfig();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITraining#getConfig <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' containment reference.
   * @see #getConfig()
   * @generated
   */
  void setConfig(EAITrainingConfig value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(EAITrainingData)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITraining_Data()
   * @model containment="true"
   * @generated
   */
  EAITrainingData getData();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITraining#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(EAITrainingData value);

  /**
   * Returns the value of the '<em><b>Aitrainingcase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aitrainingcase</em>' containment reference.
   * @see #setAitrainingcase(EAITrainingCases)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITraining_Aitrainingcase()
   * @model containment="true"
   * @generated
   */
  EAITrainingCases getAitrainingcase();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITraining#getAitrainingcase <em>Aitrainingcase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aitrainingcase</em>' containment reference.
   * @see #getAitrainingcase()
   * @generated
   */
  void setAitrainingcase(EAITrainingCases value);

} // EAITraining
