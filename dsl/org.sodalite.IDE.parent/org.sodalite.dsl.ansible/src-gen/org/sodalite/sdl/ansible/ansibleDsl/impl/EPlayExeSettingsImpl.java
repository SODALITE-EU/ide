/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EListPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EStringPassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPlay Exe Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayExeSettingsImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayExeSettingsImpl#getSerial_list <em>Serial list</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayExeSettingsImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPlayExeSettingsImpl extends EExeSettingsImpl implements EPlayExeSettings
{
  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected EStringPassed strategy;

  /**
   * The cached value of the '{@link #getSerial_list() <em>Serial list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSerial_list()
   * @generated
   * @ordered
   */
  protected EListPassed serial_list;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected EStringPassed order;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPlayExeSettingsImpl()
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
    return AnsibleDslPackage.Literals.EPLAY_EXE_SETTINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrategy(EStringPassed newStrategy, NotificationChain msgs)
  {
    EStringPassed oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY, oldStrategy, newStrategy);
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
  public void setStrategy(EStringPassed newStrategy)
  {
    if (newStrategy != strategy)
    {
      NotificationChain msgs = null;
      if (strategy != null)
        msgs = ((InternalEObject)strategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY, null, msgs);
      if (newStrategy != null)
        msgs = ((InternalEObject)newStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY, null, msgs);
      msgs = basicSetStrategy(newStrategy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY, newStrategy, newStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListPassed getSerial_list()
  {
    return serial_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSerial_list(EListPassed newSerial_list, NotificationChain msgs)
  {
    EListPassed oldSerial_list = serial_list;
    serial_list = newSerial_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST, oldSerial_list, newSerial_list);
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
  public void setSerial_list(EListPassed newSerial_list)
  {
    if (newSerial_list != serial_list)
    {
      NotificationChain msgs = null;
      if (serial_list != null)
        msgs = ((InternalEObject)serial_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST, null, msgs);
      if (newSerial_list != null)
        msgs = ((InternalEObject)newSerial_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST, null, msgs);
      msgs = basicSetSerial_list(newSerial_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST, newSerial_list, newSerial_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(EStringPassed newOrder, NotificationChain msgs)
  {
    EStringPassed oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER, oldOrder, newOrder);
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
  public void setOrder(EStringPassed newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER, newOrder, newOrder));
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
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY:
        return basicSetStrategy(null, msgs);
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST:
        return basicSetSerial_list(null, msgs);
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER:
        return basicSetOrder(null, msgs);
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
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY:
        return getStrategy();
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST:
        return getSerial_list();
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER:
        return getOrder();
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
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY:
        setStrategy((EStringPassed)newValue);
        return;
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST:
        setSerial_list((EListPassed)newValue);
        return;
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER:
        setOrder((EStringPassed)newValue);
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
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY:
        setStrategy((EStringPassed)null);
        return;
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST:
        setSerial_list((EListPassed)null);
        return;
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER:
        setOrder((EStringPassed)null);
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
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__STRATEGY:
        return strategy != null;
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__SERIAL_LIST:
        return serial_list != null;
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS__ORDER:
        return order != null;
    }
    return super.eIsSet(featureID);
  }

} //EPlayExeSettingsImpl
