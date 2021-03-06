/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanAnsible;
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanPassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBoolean Passed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBooleanPassedImpl#getBoolean_passed <em>Boolean passed</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBooleanPassedImpl#getBoolean_passed_null <em>Boolean passed null</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBooleanPassedImpl extends MinimalEObjectImpl.Container implements EBooleanPassed
{
  /**
   * The cached value of the '{@link #getBoolean_passed() <em>Boolean passed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed()
   * @generated
   * @ordered
   */
  protected EBooleanAnsible boolean_passed;

  /**
   * The default value of the '{@link #getBoolean_passed_null() <em>Boolean passed null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed_null()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_PASSED_NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolean_passed_null() <em>Boolean passed null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean_passed_null()
   * @generated
   * @ordered
   */
  protected String boolean_passed_null = BOOLEAN_PASSED_NULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EBooleanPassedImpl()
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
    return AnsibleDslPackage.Literals.EBOOLEAN_PASSED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanAnsible getBoolean_passed()
  {
    return boolean_passed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoolean_passed(EBooleanAnsible newBoolean_passed, NotificationChain msgs)
  {
    EBooleanAnsible oldBoolean_passed = boolean_passed;
    boolean_passed = newBoolean_passed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED, oldBoolean_passed, newBoolean_passed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolean_passed(EBooleanAnsible newBoolean_passed)
  {
    if (newBoolean_passed != boolean_passed)
    {
      NotificationChain msgs = null;
      if (boolean_passed != null)
        msgs = ((InternalEObject)boolean_passed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED, null, msgs);
      if (newBoolean_passed != null)
        msgs = ((InternalEObject)newBoolean_passed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED, null, msgs);
      msgs = basicSetBoolean_passed(newBoolean_passed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED, newBoolean_passed, newBoolean_passed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoolean_passed_null()
  {
    return boolean_passed_null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolean_passed_null(String newBoolean_passed_null)
  {
    String oldBoolean_passed_null = boolean_passed_null;
    boolean_passed_null = newBoolean_passed_null;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED_NULL, oldBoolean_passed_null, boolean_passed_null));
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
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED:
        return basicSetBoolean_passed(null, msgs);
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
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED:
        return getBoolean_passed();
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED_NULL:
        return getBoolean_passed_null();
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
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED:
        setBoolean_passed((EBooleanAnsible)newValue);
        return;
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED_NULL:
        setBoolean_passed_null((String)newValue);
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
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED:
        setBoolean_passed((EBooleanAnsible)null);
        return;
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED_NULL:
        setBoolean_passed_null(BOOLEAN_PASSED_NULL_EDEFAULT);
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
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED:
        return boolean_passed != null;
      case AnsibleDslPackage.EBOOLEAN_PASSED__BOOLEAN_PASSED_NULL:
        return BOOLEAN_PASSED_NULL_EDEFAULT == null ? boolean_passed_null != null : !BOOLEAN_PASSED_NULL_EDEFAULT.equals(boolean_passed_null);
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
    result.append(" (boolean_passed_null: ");
    result.append(boolean_passed_null);
    result.append(')');
    return result.toString();
  }

} //EBooleanPassedImpl
