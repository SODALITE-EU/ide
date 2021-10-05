/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOptimization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOptimization#isEnable_opt_build <em>Enable opt build</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOptimization#isEnable_autotuning <em>Enable autotuning</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOptimization#getApp_type <em>App type</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOptimization#getOpt_build <em>Opt build</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOptimization#getAutotuning <em>Autotuning</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOptimization#getApp_optimization <em>App optimization</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOptimization()
 * @model
 * @generated
 */
public interface EOptimization extends EObject
{
  /**
   * Returns the value of the '<em><b>Enable opt build</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable opt build</em>' attribute.
   * @see #setEnable_opt_build(boolean)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOptimization_Enable_opt_build()
   * @model
   * @generated
   */
  boolean isEnable_opt_build();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOptimization#isEnable_opt_build <em>Enable opt build</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable opt build</em>' attribute.
   * @see #isEnable_opt_build()
   * @generated
   */
  void setEnable_opt_build(boolean value);

  /**
   * Returns the value of the '<em><b>Enable autotuning</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable autotuning</em>' attribute.
   * @see #setEnable_autotuning(boolean)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOptimization_Enable_autotuning()
   * @model
   * @generated
   */
  boolean isEnable_autotuning();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOptimization#isEnable_autotuning <em>Enable autotuning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable autotuning</em>' attribute.
   * @see #isEnable_autotuning()
   * @generated
   */
  void setEnable_autotuning(boolean value);

  /**
   * Returns the value of the '<em><b>App type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>App type</em>' attribute.
   * @see #setApp_type(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOptimization_App_type()
   * @model
   * @generated
   */
  String getApp_type();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOptimization#getApp_type <em>App type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App type</em>' attribute.
   * @see #getApp_type()
   * @generated
   */
  void setApp_type(String value);

  /**
   * Returns the value of the '<em><b>Opt build</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt build</em>' containment reference.
   * @see #setOpt_build(EOptBuild)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOptimization_Opt_build()
   * @model containment="true"
   * @generated
   */
  EOptBuild getOpt_build();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOptimization#getOpt_build <em>Opt build</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt build</em>' containment reference.
   * @see #getOpt_build()
   * @generated
   */
  void setOpt_build(EOptBuild value);

  /**
   * Returns the value of the '<em><b>Autotuning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autotuning</em>' containment reference.
   * @see #setAutotuning(EAutotuning)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOptimization_Autotuning()
   * @model containment="true"
   * @generated
   */
  EAutotuning getAutotuning();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOptimization#getAutotuning <em>Autotuning</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autotuning</em>' containment reference.
   * @see #getAutotuning()
   * @generated
   */
  void setAutotuning(EAutotuning value);

  /**
   * Returns the value of the '<em><b>App optimization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>App optimization</em>' containment reference.
   * @see #setApp_optimization(EOptimizationCases)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOptimization_App_optimization()
   * @model containment="true"
   * @generated
   */
  EOptimizationCases getApp_optimization();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOptimization#getApp_optimization <em>App optimization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App optimization</em>' containment reference.
   * @see #getApp_optimization()
   * @generated
   */
  void setApp_optimization(EOptimizationCases value);

} // EOptimization
