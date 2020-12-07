/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EItem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EItemImpl#getTail <em>Tail</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EItemImpl#getFilter_commands <em>Filter commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EItemImpl extends EValuePassedImpl implements EItem
{
  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected EList<String> tail;

  /**
   * The cached value of the '{@link #getFilter_commands() <em>Filter commands</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter_commands()
   * @generated
   * @ordered
   */
  protected EList<String> filter_commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EItemImpl()
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
    return AnsibleDslPackage.Literals.EITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getTail()
  {
    if (tail == null)
    {
      tail = new EDataTypeEList<String>(String.class, this, AnsibleDslPackage.EITEM__TAIL);
    }
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getFilter_commands()
  {
    if (filter_commands == null)
    {
      filter_commands = new EDataTypeEList<String>(String.class, this, AnsibleDslPackage.EITEM__FILTER_COMMANDS);
    }
    return filter_commands;
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
      case AnsibleDslPackage.EITEM__TAIL:
        return getTail();
      case AnsibleDslPackage.EITEM__FILTER_COMMANDS:
        return getFilter_commands();
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
      case AnsibleDslPackage.EITEM__TAIL:
        getTail().clear();
        getTail().addAll((Collection<? extends String>)newValue);
        return;
      case AnsibleDslPackage.EITEM__FILTER_COMMANDS:
        getFilter_commands().clear();
        getFilter_commands().addAll((Collection<? extends String>)newValue);
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
      case AnsibleDslPackage.EITEM__TAIL:
        getTail().clear();
        return;
      case AnsibleDslPackage.EITEM__FILTER_COMMANDS:
        getFilter_commands().clear();
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
      case AnsibleDslPackage.EITEM__TAIL:
        return tail != null && !tail.isEmpty();
      case AnsibleDslPackage.EITEM__FILTER_COMMANDS:
        return filter_commands != null && !filter_commands.isEmpty();
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
    result.append(" (tail: ");
    result.append(tail);
    result.append(", filter_commands: ");
    result.append(filter_commands);
    result.append(')');
    return result.toString();
  }

} //EItemImpl