/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDictionary Of List Indented</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryOfListIndented#getDictionary_pairs <em>Dictionary pairs</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDictionaryOfListIndented()
 * @model
 * @generated
 */
public interface EDictionaryOfListIndented extends EElementOfListIndented
{
  /**
   * Returns the value of the '<em><b>Dictionary pairs</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dictionary pairs</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDictionaryOfListIndented_Dictionary_pairs()
   * @model containment="true"
   * @generated
   */
  EList<EDictionaryPair> getDictionary_pairs();

} // EDictionaryOfListIndented