/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EConnection;
import org.sodalite.sdl.ansible.ansibleDsl.ENumberPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EStringPassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EConnection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EConnectionImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EConnectionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EConnectionImpl#getRemote_user <em>Remote user</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EConnectionImpl extends MinimalEObjectImpl.Container implements EConnection
{
  /**
   * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected EStringPassed connection;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected ENumberPassed port;

  /**
   * The cached value of the '{@link #getRemote_user() <em>Remote user</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemote_user()
   * @generated
   * @ordered
   */
  protected EStringPassed remote_user;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EConnectionImpl()
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
    return AnsibleDslPackage.Literals.ECONNECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getConnection()
  {
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConnection(EStringPassed newConnection, NotificationChain msgs)
  {
    EStringPassed oldConnection = connection;
    connection = newConnection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ECONNECTION__CONNECTION, oldConnection, newConnection);
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
  public void setConnection(EStringPassed newConnection)
  {
    if (newConnection != connection)
    {
      NotificationChain msgs = null;
      if (connection != null)
        msgs = ((InternalEObject)connection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ECONNECTION__CONNECTION, null, msgs);
      if (newConnection != null)
        msgs = ((InternalEObject)newConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ECONNECTION__CONNECTION, null, msgs);
      msgs = basicSetConnection(newConnection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ECONNECTION__CONNECTION, newConnection, newConnection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENumberPassed getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(ENumberPassed newPort, NotificationChain msgs)
  {
    ENumberPassed oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ECONNECTION__PORT, oldPort, newPort);
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
  public void setPort(ENumberPassed newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ECONNECTION__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ECONNECTION__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ECONNECTION__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getRemote_user()
  {
    return remote_user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRemote_user(EStringPassed newRemote_user, NotificationChain msgs)
  {
    EStringPassed oldRemote_user = remote_user;
    remote_user = newRemote_user;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ECONNECTION__REMOTE_USER, oldRemote_user, newRemote_user);
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
  public void setRemote_user(EStringPassed newRemote_user)
  {
    if (newRemote_user != remote_user)
    {
      NotificationChain msgs = null;
      if (remote_user != null)
        msgs = ((InternalEObject)remote_user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ECONNECTION__REMOTE_USER, null, msgs);
      if (newRemote_user != null)
        msgs = ((InternalEObject)newRemote_user).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ECONNECTION__REMOTE_USER, null, msgs);
      msgs = basicSetRemote_user(newRemote_user, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ECONNECTION__REMOTE_USER, newRemote_user, newRemote_user));
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
      case AnsibleDslPackage.ECONNECTION__CONNECTION:
        return basicSetConnection(null, msgs);
      case AnsibleDslPackage.ECONNECTION__PORT:
        return basicSetPort(null, msgs);
      case AnsibleDslPackage.ECONNECTION__REMOTE_USER:
        return basicSetRemote_user(null, msgs);
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
      case AnsibleDslPackage.ECONNECTION__CONNECTION:
        return getConnection();
      case AnsibleDslPackage.ECONNECTION__PORT:
        return getPort();
      case AnsibleDslPackage.ECONNECTION__REMOTE_USER:
        return getRemote_user();
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
      case AnsibleDslPackage.ECONNECTION__CONNECTION:
        setConnection((EStringPassed)newValue);
        return;
      case AnsibleDslPackage.ECONNECTION__PORT:
        setPort((ENumberPassed)newValue);
        return;
      case AnsibleDslPackage.ECONNECTION__REMOTE_USER:
        setRemote_user((EStringPassed)newValue);
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
      case AnsibleDslPackage.ECONNECTION__CONNECTION:
        setConnection((EStringPassed)null);
        return;
      case AnsibleDslPackage.ECONNECTION__PORT:
        setPort((ENumberPassed)null);
        return;
      case AnsibleDslPackage.ECONNECTION__REMOTE_USER:
        setRemote_user((EStringPassed)null);
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
      case AnsibleDslPackage.ECONNECTION__CONNECTION:
        return connection != null;
      case AnsibleDslPackage.ECONNECTION__PORT:
        return port != null;
      case AnsibleDslPackage.ECONNECTION__REMOTE_USER:
        return remote_user != null;
    }
    return super.eIsSet(featureID);
  }

} //EConnectionImpl
