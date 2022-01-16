/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EPREFIX_TYPE;
import org.sodalite.sdl.ansible.ansibleDsl.KBNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KB Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.KBNodeImpl#getNode_type <em>Node type</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.KBNodeImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.KBNodeImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KBNodeImpl extends NodeImpl implements KBNode
{
  /**
   * The cached value of the '{@link #getNode_type() <em>Node type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode_type()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE node_type;

  /**
   * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected String interface_ = INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected String operation = OPERATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KBNodeImpl()
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
    return AnsibleDslPackage.Literals.KB_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getNode_type()
  {
    return node_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode_type(EPREFIX_TYPE newNode_type, NotificationChain msgs)
  {
    EPREFIX_TYPE oldNode_type = node_type;
    node_type = newNode_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.KB_NODE__NODE_TYPE, oldNode_type, newNode_type);
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
  public void setNode_type(EPREFIX_TYPE newNode_type)
  {
    if (newNode_type != node_type)
    {
      NotificationChain msgs = null;
      if (node_type != null)
        msgs = ((InternalEObject)node_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.KB_NODE__NODE_TYPE, null, msgs);
      if (newNode_type != null)
        msgs = ((InternalEObject)newNode_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.KB_NODE__NODE_TYPE, null, msgs);
      msgs = basicSetNode_type(newNode_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.KB_NODE__NODE_TYPE, newNode_type, newNode_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterface(String newInterface)
  {
    String oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.KB_NODE__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperation(String newOperation)
  {
    String oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.KB_NODE__OPERATION, oldOperation, operation));
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
      case AnsibleDslPackage.KB_NODE__NODE_TYPE:
        return basicSetNode_type(null, msgs);
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
      case AnsibleDslPackage.KB_NODE__NODE_TYPE:
        return getNode_type();
      case AnsibleDslPackage.KB_NODE__INTERFACE:
        return getInterface();
      case AnsibleDslPackage.KB_NODE__OPERATION:
        return getOperation();
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
      case AnsibleDslPackage.KB_NODE__NODE_TYPE:
        setNode_type((EPREFIX_TYPE)newValue);
        return;
      case AnsibleDslPackage.KB_NODE__INTERFACE:
        setInterface((String)newValue);
        return;
      case AnsibleDslPackage.KB_NODE__OPERATION:
        setOperation((String)newValue);
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
      case AnsibleDslPackage.KB_NODE__NODE_TYPE:
        setNode_type((EPREFIX_TYPE)null);
        return;
      case AnsibleDslPackage.KB_NODE__INTERFACE:
        setInterface(INTERFACE_EDEFAULT);
        return;
      case AnsibleDslPackage.KB_NODE__OPERATION:
        setOperation(OPERATION_EDEFAULT);
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
      case AnsibleDslPackage.KB_NODE__NODE_TYPE:
        return node_type != null;
      case AnsibleDslPackage.KB_NODE__INTERFACE:
        return INTERFACE_EDEFAULT == null ? interface_ != null : !INTERFACE_EDEFAULT.equals(interface_);
      case AnsibleDslPackage.KB_NODE__OPERATION:
        return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
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
    result.append(" (interface: ");
    result.append(interface_);
    result.append(", operation: ");
    result.append(operation);
    result.append(')');
    return result.toString();
  }

} //KBNodeImpl
