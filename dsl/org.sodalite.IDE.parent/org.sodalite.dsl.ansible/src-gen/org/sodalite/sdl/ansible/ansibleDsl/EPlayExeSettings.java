/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPlay Exe Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings#getSerial_list <em>Serial list</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlayExeSettings()
 * @model
 * @generated
 */
public interface EPlayExeSettings extends EExeSettings
{
  /**
   * Returns the value of the '<em><b>Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' containment reference.
   * @see #setStrategy(EStringPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlayExeSettings_Strategy()
   * @model containment="true"
   * @generated
   */
  EStringPassed getStrategy();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings#getStrategy <em>Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' containment reference.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(EStringPassed value);

  /**
   * Returns the value of the '<em><b>Serial list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Serial list</em>' containment reference.
   * @see #setSerial_list(EValuePassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlayExeSettings_Serial_list()
   * @model containment="true"
   * @generated
   */
  EValuePassed getSerial_list();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings#getSerial_list <em>Serial list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Serial list</em>' containment reference.
   * @see #getSerial_list()
   * @generated
   */
  void setSerial_list(EValuePassed value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' containment reference.
   * @see #setOrder(EStringPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlayExeSettings_Order()
   * @model containment="true"
   * @generated
   */
  EStringPassed getOrder();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings#getOrder <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' containment reference.
   * @see #getOrder()
   * @generated
   */
  void setOrder(EStringPassed value);

} // EPlayExeSettings