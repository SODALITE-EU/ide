/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETrigger Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ETriggerDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ETriggerDefinition#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getETriggerDefinition()
 * @model
 * @generated
 */
public interface ETriggerDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getETriggerDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ETriggerDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(ETriggerDefinitionBody)
   * @see org.sodalite.dsl.rM.RMPackage#getETriggerDefinition_Trigger()
   * @model containment="true"
   * @generated
   */
  ETriggerDefinitionBody getTrigger();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ETriggerDefinition#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(ETriggerDefinitionBody value);

} // ETriggerDefinition