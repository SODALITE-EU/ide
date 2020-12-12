/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFiltered Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression#getTo_filter <em>To filter</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression#getTail <em>Tail</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredExpression()
 * @model
 * @generated
 */
public interface EFilteredExpression extends EJinjaExpressionEvaluationWithoutBrackets
{
  /**
   * Returns the value of the '<em><b>To filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To filter</em>' containment reference.
   * @see #setTo_filter(EOrExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredExpression_To_filter()
   * @model containment="true"
   * @generated
   */
  EOrExpression getTo_filter();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression#getTo_filter <em>To filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To filter</em>' containment reference.
   * @see #getTo_filter()
   * @generated
   */
  void setTo_filter(EOrExpression value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EFunctionCall}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredExpression_Tail()
   * @model containment="true"
   * @generated
   */
  EList<EFunctionCall> getTail();

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(EFilteredExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredExpression_Filter()
   * @model containment="true"
   * @generated
   */
  EFilteredExpression getFilter();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(EFilteredExpression value);

} // EFilteredExpression
