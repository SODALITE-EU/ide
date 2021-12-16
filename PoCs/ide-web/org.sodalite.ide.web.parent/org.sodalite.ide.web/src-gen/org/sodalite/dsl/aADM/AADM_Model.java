/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AADM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.AADM_Model#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.AADM_Model#getModule <em>Module</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.AADM_Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.AADM_Model#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.AADM_Model#getNodeTemplates <em>Node Templates</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.AADM_Model#getPolicies <em>Policies</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.AADM_Model#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model()
 * @model
 * @generated
 */
public interface AADM_Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.AADM_Model#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' attribute.
   * @see #setModule(String)
   * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model_Module()
   * @model
   * @generated
   */
  String getModule();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.AADM_Model#getModule <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' attribute.
   * @see #getModule()
   * @generated
   */
  void setModule(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' attribute list.
   * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model_Imports()
   * @model unique="false"
   * @generated
   */
  EList<String> getImports();

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference.
   * @see #setInputs(EInputs)
   * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model_Inputs()
   * @model containment="true"
   * @generated
   */
  EInputs getInputs();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.AADM_Model#getInputs <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' containment reference.
   * @see #getInputs()
   * @generated
   */
  void setInputs(EInputs value);

  /**
   * Returns the value of the '<em><b>Node Templates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Templates</em>' containment reference.
   * @see #setNodeTemplates(ENodeTemplates)
   * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model_NodeTemplates()
   * @model containment="true"
   * @generated
   */
  ENodeTemplates getNodeTemplates();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.AADM_Model#getNodeTemplates <em>Node Templates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Templates</em>' containment reference.
   * @see #getNodeTemplates()
   * @generated
   */
  void setNodeTemplates(ENodeTemplates value);

  /**
   * Returns the value of the '<em><b>Policies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policies</em>' containment reference.
   * @see #setPolicies(EPolicies)
   * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model_Policies()
   * @model containment="true"
   * @generated
   */
  EPolicies getPolicies();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.AADM_Model#getPolicies <em>Policies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policies</em>' containment reference.
   * @see #getPolicies()
   * @generated
   */
  void setPolicies(EPolicies value);

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference.
   * @see #setOutputs(EOutputs)
   * @see org.sodalite.dsl.aADM.AADMPackage#getAADM_Model_Outputs()
   * @model containment="true"
   * @generated
   */
  EOutputs getOutputs();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.aADM.AADM_Model#getOutputs <em>Outputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outputs</em>' containment reference.
   * @see #getOutputs()
   * @generated
   */
  void setOutputs(EOutputs value);

} // AADM_Model