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
import org.sodalite.dsl.aADM.EPREFIX_TYPE;
import org.sodalite.dsl.aADM.EPolicyDefinitionBody;
import org.sodalite.dsl.aADM.EPropertyAssignments;
import org.sodalite.dsl.aADM.ETarget;
import org.sodalite.dsl.aADM.ETriggerDefinitions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPolicy Definition Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPolicyDefinitionBodyImpl extends MinimalEObjectImpl.Container implements EPolicyDefinitionBody
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE type;

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
  protected EPropertyAssignments properties;

  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected ETarget targets;

  /**
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected ETriggerDefinitions triggers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPolicyDefinitionBodyImpl()
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
    return AADMPackage.Literals.EPOLICY_DEFINITION_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(EPREFIX_TYPE newType, NotificationChain msgs)
  {
    EPREFIX_TYPE oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__TYPE, oldType, newType);
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
  public void setType(EPREFIX_TYPE newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPropertyAssignments getProperties()
  {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(EPropertyAssignments newProperties, NotificationChain msgs)
  {
    EPropertyAssignments oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES, oldProperties, newProperties);
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
  public void setProperties(EPropertyAssignments newProperties)
  {
    if (newProperties != properties)
    {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES, newProperties, newProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETarget getTargets()
  {
    return targets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargets(ETarget newTargets, NotificationChain msgs)
  {
    ETarget oldTargets = targets;
    targets = newTargets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS, oldTargets, newTargets);
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
  public void setTargets(ETarget newTargets)
  {
    if (newTargets != targets)
    {
      NotificationChain msgs = null;
      if (targets != null)
        msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS, null, msgs);
      if (newTargets != null)
        msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS, null, msgs);
      msgs = basicSetTargets(newTargets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS, newTargets, newTargets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETriggerDefinitions getTriggers()
  {
    return triggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTriggers(ETriggerDefinitions newTriggers, NotificationChain msgs)
  {
    ETriggerDefinitions oldTriggers = triggers;
    triggers = newTriggers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS, oldTriggers, newTriggers);
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
  public void setTriggers(ETriggerDefinitions newTriggers)
  {
    if (newTriggers != triggers)
    {
      NotificationChain msgs = null;
      if (triggers != null)
        msgs = ((InternalEObject)triggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS, null, msgs);
      if (newTriggers != null)
        msgs = ((InternalEObject)newTriggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS, null, msgs);
      msgs = basicSetTriggers(newTriggers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS, newTriggers, newTriggers));
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
      case AADMPackage.EPOLICY_DEFINITION_BODY__TYPE:
        return basicSetType(null, msgs);
      case AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES:
        return basicSetProperties(null, msgs);
      case AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS:
        return basicSetTargets(null, msgs);
      case AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS:
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
      case AADMPackage.EPOLICY_DEFINITION_BODY__TYPE:
        return getType();
      case AADMPackage.EPOLICY_DEFINITION_BODY__DESCRIPTION:
        return getDescription();
      case AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES:
        return getProperties();
      case AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS:
        return getTargets();
      case AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS:
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
      case AADMPackage.EPOLICY_DEFINITION_BODY__TYPE:
        setType((EPREFIX_TYPE)newValue);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES:
        setProperties((EPropertyAssignments)newValue);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS:
        setTargets((ETarget)newValue);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS:
        setTriggers((ETriggerDefinitions)newValue);
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
      case AADMPackage.EPOLICY_DEFINITION_BODY__TYPE:
        setType((EPREFIX_TYPE)null);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES:
        setProperties((EPropertyAssignments)null);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS:
        setTargets((ETarget)null);
        return;
      case AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS:
        setTriggers((ETriggerDefinitions)null);
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
      case AADMPackage.EPOLICY_DEFINITION_BODY__TYPE:
        return type != null;
      case AADMPackage.EPOLICY_DEFINITION_BODY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AADMPackage.EPOLICY_DEFINITION_BODY__PROPERTIES:
        return properties != null;
      case AADMPackage.EPOLICY_DEFINITION_BODY__TARGETS:
        return targets != null;
      case AADMPackage.EPOLICY_DEFINITION_BODY__TRIGGERS:
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

} //EPolicyDefinitionBodyImpl