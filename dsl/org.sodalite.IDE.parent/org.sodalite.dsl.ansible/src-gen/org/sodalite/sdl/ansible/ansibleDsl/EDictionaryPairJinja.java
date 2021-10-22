/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDictionary Pair Jinja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairJinja#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairJinja#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDictionaryPairJinja()
 * @model
 * @generated
 */
public interface EDictionaryPairJinja extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDictionaryPairJinja_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairJinja#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(EJinjaExpressionEvaluationWithoutBrackets)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEDictionaryPairJinja_Value()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionEvaluationWithoutBrackets getValue();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairJinja#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EJinjaExpressionEvaluationWithoutBrackets value);

} // EDictionaryPairJinja