/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaAndString;
import org.sodalite.sdl.ansible.ansibleDsl.EMultiLineExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMulti Line Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EMultiLineExpressionImpl#getNew_line_command <em>New line command</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EMultiLineExpressionImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMultiLineExpressionImpl extends EStringPassedImpl implements EMultiLineExpression
{
  /**
   * The default value of the '{@link #getNew_line_command() <em>New line command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew_line_command()
   * @generated
   * @ordered
   */
  protected static final String NEW_LINE_COMMAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNew_line_command() <em>New line command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew_line_command()
   * @generated
   * @ordered
   */
  protected String new_line_command = NEW_LINE_COMMAND_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<EJinjaAndString> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMultiLineExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AnsibleDslPackage.Literals.EMULTI_LINE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNew_line_command()
  {
    return new_line_command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNew_line_command(String newNew_line_command)
  {
    String oldNew_line_command = new_line_command;
    new_line_command = newNew_line_command;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EMULTI_LINE_EXPRESSION__NEW_LINE_COMMAND, oldNew_line_command, new_line_command));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EJinjaAndString> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<EJinjaAndString>(EJinjaAndString.class, this, AnsibleDslPackage.EMULTI_LINE_EXPRESSION__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__NEW_LINE_COMMAND:
        return getNew_line_command();
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__EXPRESSIONS:
        return getExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__NEW_LINE_COMMAND:
        setNew_line_command((String)newValue);
        return;
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends EJinjaAndString>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__NEW_LINE_COMMAND:
        setNew_line_command(NEW_LINE_COMMAND_EDEFAULT);
        return;
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__EXPRESSIONS:
        getExpressions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__NEW_LINE_COMMAND:
        return NEW_LINE_COMMAND_EDEFAULT == null ? new_line_command != null : !NEW_LINE_COMMAND_EDEFAULT.equals(new_line_command);
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (new_line_command: ");
    result.append(new_line_command);
    result.append(')');
    return result.toString();
  }

} //EMultiLineExpressionImpl
