/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EArtifact Type Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactTypeBody#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactTypeBody#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactTypeBody#getMime_type <em>Mime type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactTypeBody#getFile_ext <em>File ext</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactTypeBody#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypeBody()
 * @model
 * @generated
 */
public interface EArtifactTypeBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(EPREFIX_TYPE)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypeBody_SuperType()
   * @model containment="true"
   * @generated
   */
  EPREFIX_TYPE getSuperType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactTypeBody#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(EPREFIX_TYPE value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypeBody_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactTypeBody#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Mime type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mime type</em>' attribute.
   * @see #setMime_type(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypeBody_Mime_type()
   * @model
   * @generated
   */
  String getMime_type();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactTypeBody#getMime_type <em>Mime type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mime type</em>' attribute.
   * @see #getMime_type()
   * @generated
   */
  void setMime_type(String value);

  /**
   * Returns the value of the '<em><b>File ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File ext</em>' containment reference.
   * @see #setFile_ext(ELIST)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypeBody_File_ext()
   * @model containment="true"
   * @generated
   */
  ELIST getFile_ext();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactTypeBody#getFile_ext <em>File ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File ext</em>' containment reference.
   * @see #getFile_ext()
   * @generated
   */
  void setFile_ext(ELIST value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(EProperties)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactTypeBody_Properties()
   * @model containment="true"
   * @generated
   */
  EProperties getProperties();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactTypeBody#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(EProperties value);

} // EArtifactTypeBody
