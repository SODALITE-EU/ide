/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESimple Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ESimpleValueImpl#getValue_string <em>Value string</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ESimpleValueImpl#getValue_number <em>Value number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESimpleValueImpl extends EValueImpl implements ESimpleValue
{
  /**
   * The default value of the '{@link #getValue_string() <em>Value string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_string()
   * @generated
   * @ordered
   */
  protected static final String VALUE_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue_string() <em>Value string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_string()
   * @generated
   * @ordered
   */
  protected String value_string = VALUE_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getValue_number() <em>Value number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_number()
   * @generated
   * @ordered
   */
  protected static final String VALUE_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue_number() <em>Value number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_number()
   * @generated
   * @ordered
   */
  protected String value_number = VALUE_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ESimpleValueImpl()
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
    return AnsibleDslPackage.Literals.ESIMPLE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue_string()
  {
    return value_string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue_string(String newValue_string)
  {
    String oldValue_string = value_string;
    value_string = newValue_string;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ESIMPLE_VALUE__VALUE_STRING, oldValue_string, value_string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue_number()
  {
    return value_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue_number(String newValue_number)
  {
    String oldValue_number = value_number;
    value_number = newValue_number;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ESIMPLE_VALUE__VALUE_NUMBER, oldValue_number, value_number));
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
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_STRING:
        return getValue_string();
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_NUMBER:
        return getValue_number();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_STRING:
        setValue_string((String)newValue);
        return;
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_NUMBER:
        setValue_number((String)newValue);
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
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_STRING:
        setValue_string(VALUE_STRING_EDEFAULT);
        return;
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_NUMBER:
        setValue_number(VALUE_NUMBER_EDEFAULT);
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
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_STRING:
        return VALUE_STRING_EDEFAULT == null ? value_string != null : !VALUE_STRING_EDEFAULT.equals(value_string);
      case AnsibleDslPackage.ESIMPLE_VALUE__VALUE_NUMBER:
        return VALUE_NUMBER_EDEFAULT == null ? value_number != null : !VALUE_NUMBER_EDEFAULT.equals(value_number);
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
    result.append(" (value_string: ");
    result.append(value_string);
    result.append(", value_number: ");
    result.append(value_number);
    result.append(')');
    return result.toString();
  }

} //ESimpleValueImpl
