/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDictionary Jinja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryJinja#getDictionary_pairs <em>Dictionary pairs</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDictionaryJinja()
 * @model
 * @generated
 */
public interface EDictionaryJinja extends EComposedValueJinja
{
  /**
   * Returns the value of the '<em><b>Dictionary pairs</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairJinja}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dictionary pairs</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDictionaryJinja_Dictionary_pairs()
   * @model containment="true"
   * @generated
   */
  EList<EDictionaryPairJinja> getDictionary_pairs();

} // EDictionaryJinja