/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.aADM.AADMPackage;
import org.sodalite.dsl.aADM.EEvenFilter;
import org.sodalite.dsl.aADM.EPREFIX_REF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEven Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EEvenFilterImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EEvenFilterImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EEvenFilterImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEvenFilterImpl extends MinimalEObjectImpl.Container implements EEvenFilter
{
  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected EPREFIX_REF node;

  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected EPREFIX_REF requirement;

  /**
   * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapability()
   * @generated
   * @ordered
   */
  protected EPREFIX_REF capability;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EEvenFilterImpl()
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
    return AADMPackage.Literals.EEVEN_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_REF getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(EPREFIX_REF newNode, NotificationChain msgs)
  {
    EPREFIX_REF oldNode = node;
    node = newNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.EEVEN_FILTER__NODE, oldNode, newNode);
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
  public void setNode(EPREFIX_REF newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EEVEN_FILTER__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EEVEN_FILTER__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EEVEN_FILTER__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_REF getRequirement()
  {
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequirement(EPREFIX_REF newRequirement, NotificationChain msgs)
  {
    EPREFIX_REF oldRequirement = requirement;
    requirement = newRequirement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.EEVEN_FILTER__REQUIREMENT, oldRequirement, newRequirement);
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
  public void setRequirement(EPREFIX_REF newRequirement)
  {
    if (newRequirement != requirement)
    {
      NotificationChain msgs = null;
      if (requirement != null)
        msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EEVEN_FILTER__REQUIREMENT, null, msgs);
      if (newRequirement != null)
        msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EEVEN_FILTER__REQUIREMENT, null, msgs);
      msgs = basicSetRequirement(newRequirement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EEVEN_FILTER__REQUIREMENT, newRequirement, newRequirement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_REF getCapability()
  {
    return capability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCapability(EPREFIX_REF newCapability, NotificationChain msgs)
  {
    EPREFIX_REF oldCapability = capability;
    capability = newCapability;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.EEVEN_FILTER__CAPABILITY, oldCapability, newCapability);
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
  public void setCapability(EPREFIX_REF newCapability)
  {
    if (newCapability != capability)
    {
      NotificationChain msgs = null;
      if (capability != null)
        msgs = ((InternalEObject)capability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EEVEN_FILTER__CAPABILITY, null, msgs);
      if (newCapability != null)
        msgs = ((InternalEObject)newCapability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EEVEN_FILTER__CAPABILITY, null, msgs);
      msgs = basicSetCapability(newCapability, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EEVEN_FILTER__CAPABILITY, newCapability, newCapability));
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
      case AADMPackage.EEVEN_FILTER__NODE:
        return basicSetNode(null, msgs);
      case AADMPackage.EEVEN_FILTER__REQUIREMENT:
        return basicSetRequirement(null, msgs);
      case AADMPackage.EEVEN_FILTER__CAPABILITY:
        return basicSetCapability(null, msgs);
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
      case AADMPackage.EEVEN_FILTER__NODE:
        return getNode();
      case AADMPackage.EEVEN_FILTER__REQUIREMENT:
        return getRequirement();
      case AADMPackage.EEVEN_FILTER__CAPABILITY:
        return getCapability();
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
      case AADMPackage.EEVEN_FILTER__NODE:
        setNode((EPREFIX_REF)newValue);
        return;
      case AADMPackage.EEVEN_FILTER__REQUIREMENT:
        setRequirement((EPREFIX_REF)newValue);
        return;
      case AADMPackage.EEVEN_FILTER__CAPABILITY:
        setCapability((EPREFIX_REF)newValue);
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
      case AADMPackage.EEVEN_FILTER__NODE:
        setNode((EPREFIX_REF)null);
        return;
      case AADMPackage.EEVEN_FILTER__REQUIREMENT:
        setRequirement((EPREFIX_REF)null);
        return;
      case AADMPackage.EEVEN_FILTER__CAPABILITY:
        setCapability((EPREFIX_REF)null);
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
      case AADMPackage.EEVEN_FILTER__NODE:
        return node != null;
      case AADMPackage.EEVEN_FILTER__REQUIREMENT:
        return requirement != null;
      case AADMPackage.EEVEN_FILTER__CAPABILITY:
        return capability != null;
    }
    return super.eIsSet(featureID);
  }

} //EEvenFilterImpl
