/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EUntil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EUntil#getUntil <em>Until</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EUntil#getRetries <em>Retries</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EUntil#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEUntil()
 * @model
 * @generated
 */
public interface EUntil extends ELoop
{
  /**
   * Returns the value of the '<em><b>Until</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Until</em>' containment reference.
   * @see #setUntil(EConditionalExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEUntil_Until()
   * @model containment="true"
   * @generated
   */
  EConditionalExpression getUntil();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EUntil#getUntil <em>Until</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Until</em>' containment reference.
   * @see #getUntil()
   * @generated
   */
  void setUntil(EConditionalExpression value);

  /**
   * Returns the value of the '<em><b>Retries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retries</em>' attribute.
   * @see #setRetries(int)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEUntil_Retries()
   * @model
   * @generated
   */
  int getRetries();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EUntil#getRetries <em>Retries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retries</em>' attribute.
   * @see #getRetries()
   * @generated
   */
  void setRetries(int value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' attribute.
   * @see #setDelay(int)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEUntil_Delay()
   * @model
   * @generated
   */
  int getDelay();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EUntil#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' attribute.
   * @see #getDelay()
   * @generated
   */
  void setDelay(int value);

} // EUntil