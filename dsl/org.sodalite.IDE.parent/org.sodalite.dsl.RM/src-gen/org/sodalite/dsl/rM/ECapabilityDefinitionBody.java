/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECapability Definition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getType <em>Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getValid_source_types <em>Valid source types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getOccurrences_start <em>Occurrences start</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getOccurrences_end <em>Occurrences end</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody()
 * @model
 * @generated
 */
public interface ECapabilityDefinitionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ECapabilityType)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody_Type()
   * @model
   * @generated
   */
  ECapabilityType getType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ECapabilityType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(EProperties)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody_Properties()
   * @model containment="true"
   * @generated
   */
  EProperties getProperties();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(EProperties value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(EAttributes)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody_Attributes()
   * @model containment="true"
   * @generated
   */
  EAttributes getAttributes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(EAttributes value);

  /**
   * Returns the value of the '<em><b>Valid source types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.EValidSourceType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valid source types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody_Valid_source_types()
   * @model containment="true"
   * @generated
   */
  EList<EValidSourceType> getValid_source_types();

  /**
   * Returns the value of the '<em><b>Occurrences start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occurrences start</em>' attribute.
   * @see #setOccurrences_start(String)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody_Occurrences_start()
   * @model
   * @generated
   */
  String getOccurrences_start();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getOccurrences_start <em>Occurrences start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Occurrences start</em>' attribute.
   * @see #getOccurrences_start()
   * @generated
   */
  void setOccurrences_start(String value);

  /**
   * Returns the value of the '<em><b>Occurrences end</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occurrences end</em>' attribute.
   * @see #setOccurrences_end(String)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityDefinitionBody_Occurrences_end()
   * @model
   * @generated
   */
  String getOccurrences_end();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityDefinitionBody#getOccurrences_end <em>Occurrences end</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Occurrences end</em>' attribute.
   * @see #getOccurrences_end()
   * @generated
   */
  void setOccurrences_end(String value);

} // ECapabilityDefinitionBody
