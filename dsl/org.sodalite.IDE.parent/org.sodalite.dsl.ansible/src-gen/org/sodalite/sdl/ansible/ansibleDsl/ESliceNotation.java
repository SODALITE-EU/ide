/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESlice Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getStart <em>Start</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getColon <em>Colon</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getStop <em>Stop</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getFirst_colon <em>First colon</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getStep <em>Step</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getSecond_colon <em>Second colon</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESliceNotation()
 * @model
 * @generated
 */
public interface ESliceNotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(ENumber)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESliceNotation_Start()
   * @model containment="true"
   * @generated
   */
  ENumber getStart();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(ENumber value);

  /**
   * Returns the value of the '<em><b>Colon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colon</em>' attribute.
   * @see #setColon(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESliceNotation_Colon()
   * @model
   * @generated
   */
  String getColon();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getColon <em>Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colon</em>' attribute.
   * @see #getColon()
   * @generated
   */
  void setColon(String value);

  /**
   * Returns the value of the '<em><b>Stop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop</em>' containment reference.
   * @see #setStop(ENumber)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESliceNotation_Stop()
   * @model containment="true"
   * @generated
   */
  ENumber getStop();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getStop <em>Stop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop</em>' containment reference.
   * @see #getStop()
   * @generated
   */
  void setStop(ENumber value);

  /**
   * Returns the value of the '<em><b>First colon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First colon</em>' attribute.
   * @see #setFirst_colon(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESliceNotation_First_colon()
   * @model
   * @generated
   */
  String getFirst_colon();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getFirst_colon <em>First colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First colon</em>' attribute.
   * @see #getFirst_colon()
   * @generated
   */
  void setFirst_colon(String value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(ENumber)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESliceNotation_Step()
   * @model containment="true"
   * @generated
   */
  ENumber getStep();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(ENumber value);

  /**
   * Returns the value of the '<em><b>Second colon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second colon</em>' attribute.
   * @see #setSecond_colon(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getESliceNotation_Second_colon()
   * @model
   * @generated
   */
  String getSecond_colon();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ESliceNotation#getSecond_colon <em>Second colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second colon</em>' attribute.
   * @see #getSecond_colon()
   * @generated
   */
  void setSecond_colon(String value);

} // ESliceNotation
