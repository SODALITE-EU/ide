/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAI Training ETL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingETL#getPrefetch <em>Prefetch</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingETL#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingETL()
 * @model
 * @generated
 */
public interface EAITrainingETL extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefetch</em>' attribute.
   * @see #setPrefetch(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingETL_Prefetch()
   * @model
   * @generated
   */
  int getPrefetch();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingETL#getPrefetch <em>Prefetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefetch</em>' attribute.
   * @see #getPrefetch()
   * @generated
   */
  void setPrefetch(int value);

  /**
   * Returns the value of the '<em><b>Cache</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache</em>' attribute.
   * @see #setCache(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingETL_Cache()
   * @model
   * @generated
   */
  int getCache();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingETL#getCache <em>Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache</em>' attribute.
   * @see #getCache()
   * @generated
   */
  void setCache(int value);

} // EAITrainingETL
