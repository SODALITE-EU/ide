/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPropertyDefinition;
import org.sodalite.dsl.rM.GetPropertyBody;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Property Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.GetPropertyBodyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.GetPropertyBodyImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.GetPropertyBodyImpl#getReq_cap <em>Req cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetPropertyBodyImpl extends MinimalEObjectImpl.Container implements GetPropertyBody
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EPropertyDefinition property;

  /**
   * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected static final String ENTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected String entity = ENTITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getReq_cap() <em>Req cap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq_cap()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE req_cap;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetPropertyBodyImpl()
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
    return RMPackage.Literals.GET_PROPERTY_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPropertyDefinition getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (EPropertyDefinition)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.GET_PROPERTY_BODY__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPropertyDefinition basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(EPropertyDefinition newProperty)
  {
    EPropertyDefinition oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.GET_PROPERTY_BODY__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntity(String newEntity)
  {
    String oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.GET_PROPERTY_BODY__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getReq_cap()
  {
    return req_cap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReq_cap(EPREFIX_TYPE newReq_cap, NotificationChain msgs)
  {
    EPREFIX_TYPE oldReq_cap = req_cap;
    req_cap = newReq_cap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.GET_PROPERTY_BODY__REQ_CAP, oldReq_cap, newReq_cap);
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
  public void setReq_cap(EPREFIX_TYPE newReq_cap)
  {
    if (newReq_cap != req_cap)
    {
      NotificationChain msgs = null;
      if (req_cap != null)
        msgs = ((InternalEObject)req_cap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.GET_PROPERTY_BODY__REQ_CAP, null, msgs);
      if (newReq_cap != null)
        msgs = ((InternalEObject)newReq_cap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.GET_PROPERTY_BODY__REQ_CAP, null, msgs);
      msgs = basicSetReq_cap(newReq_cap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.GET_PROPERTY_BODY__REQ_CAP, newReq_cap, newReq_cap));
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
      case RMPackage.GET_PROPERTY_BODY__REQ_CAP:
        return basicSetReq_cap(null, msgs);
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
      case RMPackage.GET_PROPERTY_BODY__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case RMPackage.GET_PROPERTY_BODY__ENTITY:
        return getEntity();
      case RMPackage.GET_PROPERTY_BODY__REQ_CAP:
        return getReq_cap();
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
      case RMPackage.GET_PROPERTY_BODY__PROPERTY:
        setProperty((EPropertyDefinition)newValue);
        return;
      case RMPackage.GET_PROPERTY_BODY__ENTITY:
        setEntity((String)newValue);
        return;
      case RMPackage.GET_PROPERTY_BODY__REQ_CAP:
        setReq_cap((EPREFIX_TYPE)newValue);
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
      case RMPackage.GET_PROPERTY_BODY__PROPERTY:
        setProperty((EPropertyDefinition)null);
        return;
      case RMPackage.GET_PROPERTY_BODY__ENTITY:
        setEntity(ENTITY_EDEFAULT);
        return;
      case RMPackage.GET_PROPERTY_BODY__REQ_CAP:
        setReq_cap((EPREFIX_TYPE)null);
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
      case RMPackage.GET_PROPERTY_BODY__PROPERTY:
        return property != null;
      case RMPackage.GET_PROPERTY_BODY__ENTITY:
        return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
      case RMPackage.GET_PROPERTY_BODY__REQ_CAP:
        return req_cap != null;
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
    result.append(" (entity: ");
    result.append(entity);
    result.append(')');
    return result.toString();
  }

} //GetPropertyBodyImpl
