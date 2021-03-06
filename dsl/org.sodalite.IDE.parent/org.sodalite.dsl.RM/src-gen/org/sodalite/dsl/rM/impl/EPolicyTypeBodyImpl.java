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
import org.sodalite.dsl.rM.EPolicyTypeBody;
import org.sodalite.dsl.rM.EProperties;
import org.sodalite.dsl.rM.ETriggers;
import org.sodalite.dsl.rM.EValidTargetTypes;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPolicy Type Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EPolicyTypeBodyImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EPolicyTypeBodyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EPolicyTypeBodyImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EPolicyTypeBodyImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EPolicyTypeBodyImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPolicyTypeBodyImpl extends MinimalEObjectImpl.Container implements EPolicyTypeBody
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE superType;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EProperties properties;

  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EValidTargetTypes targets;

  /**
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected ETriggers triggers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPolicyTypeBodyImpl()
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
    return RMPackage.Literals.EPOLICY_TYPE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(EPREFIX_TYPE newSuperType, NotificationChain msgs)
  {
    EPREFIX_TYPE oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE, oldSuperType, newSuperType);
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
  public void setSuperType(EPREFIX_TYPE newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE, newSuperType, newSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EProperties getProperties()
  {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(EProperties newProperties, NotificationChain msgs)
  {
    EProperties oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__PROPERTIES, oldProperties, newProperties);
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
  public void setProperties(EProperties newProperties)
  {
    if (newProperties != properties)
    {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__PROPERTIES, newProperties, newProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValidTargetTypes getTargets()
  {
    return targets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargets(EValidTargetTypes newTargets, NotificationChain msgs)
  {
    EValidTargetTypes oldTargets = targets;
    targets = newTargets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__TARGETS, oldTargets, newTargets);
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
  public void setTargets(EValidTargetTypes newTargets)
  {
    if (newTargets != targets)
    {
      NotificationChain msgs = null;
      if (targets != null)
        msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__TARGETS, null, msgs);
      if (newTargets != null)
        msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__TARGETS, null, msgs);
      msgs = basicSetTargets(newTargets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__TARGETS, newTargets, newTargets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETriggers getTriggers()
  {
    return triggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTriggers(ETriggers newTriggers, NotificationChain msgs)
  {
    ETriggers oldTriggers = triggers;
    triggers = newTriggers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__TRIGGERS, oldTriggers, newTriggers);
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
  public void setTriggers(ETriggers newTriggers)
  {
    if (newTriggers != triggers)
    {
      NotificationChain msgs = null;
      if (triggers != null)
        msgs = ((InternalEObject)triggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__TRIGGERS, null, msgs);
      if (newTriggers != null)
        msgs = ((InternalEObject)newTriggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EPOLICY_TYPE_BODY__TRIGGERS, null, msgs);
      msgs = basicSetTriggers(newTriggers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EPOLICY_TYPE_BODY__TRIGGERS, newTriggers, newTriggers));
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
      case RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
      case RMPackage.EPOLICY_TYPE_BODY__PROPERTIES:
        return basicSetProperties(null, msgs);
      case RMPackage.EPOLICY_TYPE_BODY__TARGETS:
        return basicSetTargets(null, msgs);
      case RMPackage.EPOLICY_TYPE_BODY__TRIGGERS:
        return basicSetTriggers(null, msgs);
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
      case RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE:
        return getSuperType();
      case RMPackage.EPOLICY_TYPE_BODY__DESCRIPTION:
        return getDescription();
      case RMPackage.EPOLICY_TYPE_BODY__PROPERTIES:
        return getProperties();
      case RMPackage.EPOLICY_TYPE_BODY__TARGETS:
        return getTargets();
      case RMPackage.EPOLICY_TYPE_BODY__TRIGGERS:
        return getTriggers();
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
      case RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE:
        setSuperType((EPREFIX_TYPE)newValue);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__PROPERTIES:
        setProperties((EProperties)newValue);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__TARGETS:
        setTargets((EValidTargetTypes)newValue);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__TRIGGERS:
        setTriggers((ETriggers)newValue);
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
      case RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE:
        setSuperType((EPREFIX_TYPE)null);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__PROPERTIES:
        setProperties((EProperties)null);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__TARGETS:
        setTargets((EValidTargetTypes)null);
        return;
      case RMPackage.EPOLICY_TYPE_BODY__TRIGGERS:
        setTriggers((ETriggers)null);
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
      case RMPackage.EPOLICY_TYPE_BODY__SUPER_TYPE:
        return superType != null;
      case RMPackage.EPOLICY_TYPE_BODY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RMPackage.EPOLICY_TYPE_BODY__PROPERTIES:
        return properties != null;
      case RMPackage.EPOLICY_TYPE_BODY__TARGETS:
        return targets != null;
      case RMPackage.EPOLICY_TYPE_BODY__TRIGGERS:
        return triggers != null;
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EPolicyTypeBodyImpl
