/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EHPC Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCData#getLocation <em>Location</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCData#getBasedata <em>Basedata</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCData#getSize <em>Size</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCData#getCount <em>Count</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCData#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCData#getEtl <em>Etl</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCData()
 * @model
 * @generated
 */
public interface EHPCData extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCData_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCData#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Basedata</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basedata</em>' attribute.
   * @see #setBasedata(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCData_Basedata()
   * @model
   * @generated
   */
  String getBasedata();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCData#getBasedata <em>Basedata</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basedata</em>' attribute.
   * @see #getBasedata()
   * @generated
   */
  void setBasedata(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCData_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCData#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCData_Count()
   * @model
   * @generated
   */
  int getCount();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCData#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(int value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(EConstraint)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCData_Constraint()
   * @model containment="true"
   * @generated
   */
  EConstraint getConstraint();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCData#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(EConstraint value);

  /**
   * Returns the value of the '<em><b>Etl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etl</em>' containment reference.
   * @see #setEtl(EHPCETL)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCData_Etl()
   * @model containment="true"
   * @generated
   */
  EHPCETL getEtl();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCData#getEtl <em>Etl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etl</em>' containment reference.
   * @see #getEtl()
   * @generated
   */
  void setEtl(EHPCETL value);

} // EHPCData
