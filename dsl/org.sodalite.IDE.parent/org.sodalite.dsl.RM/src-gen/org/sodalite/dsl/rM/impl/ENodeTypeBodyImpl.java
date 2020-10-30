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

import org.sodalite.dsl.rM.EAttributes;
import org.sodalite.dsl.rM.ECapabilities;
import org.sodalite.dsl.rM.EInterfaces;
import org.sodalite.dsl.rM.ENodeTypeBody;
import org.sodalite.dsl.rM.EProperties;
import org.sodalite.dsl.rM.ERequirements;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENode Type Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypeBodyImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypeBodyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypeBodyImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypeBodyImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypeBodyImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypeBodyImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypeBodyImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENodeTypeBodyImpl extends MinimalEObjectImpl.Container implements ENodeTypeBody
{
  /**
   * The default value of the '{@link #getSuperType() <em>Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected static final String SUPER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected String superType = SUPER_TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EAttributes attributes;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EInterfaces interfaces;

  /**
   * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilities()
   * @generated
   * @ordered
   */
  protected ECapabilities capabilities;

  /**
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected ERequirements requirements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENodeTypeBodyImpl()
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
    return RMPackage.Literals.ENODE_TYPE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(String newSuperType)
  {
    String oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__SUPER_TYPE, oldSuperType, superType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__DESCRIPTION, oldDescription, description));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__PROPERTIES, oldProperties, newProperties);
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
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__PROPERTIES, newProperties, newProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttributes getAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributes(EAttributes newAttributes, NotificationChain msgs)
  {
    EAttributes oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__ATTRIBUTES, oldAttributes, newAttributes);
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
  public void setAttributes(EAttributes newAttributes)
  {
    if (newAttributes != attributes)
    {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__ATTRIBUTES, newAttributes, newAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInterfaces getInterfaces()
  {
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaces(EInterfaces newInterfaces, NotificationChain msgs)
  {
    EInterfaces oldInterfaces = interfaces;
    interfaces = newInterfaces;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__INTERFACES, oldInterfaces, newInterfaces);
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
  public void setInterfaces(EInterfaces newInterfaces)
  {
    if (newInterfaces != interfaces)
    {
      NotificationChain msgs = null;
      if (interfaces != null)
        msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__INTERFACES, null, msgs);
      if (newInterfaces != null)
        msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__INTERFACES, null, msgs);
      msgs = basicSetInterfaces(newInterfaces, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__INTERFACES, newInterfaces, newInterfaces));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECapabilities getCapabilities()
  {
    return capabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCapabilities(ECapabilities newCapabilities, NotificationChain msgs)
  {
    ECapabilities oldCapabilities = capabilities;
    capabilities = newCapabilities;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__CAPABILITIES, oldCapabilities, newCapabilities);
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
  public void setCapabilities(ECapabilities newCapabilities)
  {
    if (newCapabilities != capabilities)
    {
      NotificationChain msgs = null;
      if (capabilities != null)
        msgs = ((InternalEObject)capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__CAPABILITIES, null, msgs);
      if (newCapabilities != null)
        msgs = ((InternalEObject)newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__CAPABILITIES, null, msgs);
      msgs = basicSetCapabilities(newCapabilities, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__CAPABILITIES, newCapabilities, newCapabilities));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERequirements getRequirements()
  {
    return requirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequirements(ERequirements newRequirements, NotificationChain msgs)
  {
    ERequirements oldRequirements = requirements;
    requirements = newRequirements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__REQUIREMENTS, oldRequirements, newRequirements);
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
  public void setRequirements(ERequirements newRequirements)
  {
    if (newRequirements != requirements)
    {
      NotificationChain msgs = null;
      if (requirements != null)
        msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__REQUIREMENTS, null, msgs);
      if (newRequirements != null)
        msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ENODE_TYPE_BODY__REQUIREMENTS, null, msgs);
      msgs = basicSetRequirements(newRequirements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ENODE_TYPE_BODY__REQUIREMENTS, newRequirements, newRequirements));
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
      case RMPackage.ENODE_TYPE_BODY__PROPERTIES:
        return basicSetProperties(null, msgs);
      case RMPackage.ENODE_TYPE_BODY__ATTRIBUTES:
        return basicSetAttributes(null, msgs);
      case RMPackage.ENODE_TYPE_BODY__INTERFACES:
        return basicSetInterfaces(null, msgs);
      case RMPackage.ENODE_TYPE_BODY__CAPABILITIES:
        return basicSetCapabilities(null, msgs);
      case RMPackage.ENODE_TYPE_BODY__REQUIREMENTS:
        return basicSetRequirements(null, msgs);
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
      case RMPackage.ENODE_TYPE_BODY__SUPER_TYPE:
        return getSuperType();
      case RMPackage.ENODE_TYPE_BODY__DESCRIPTION:
        return getDescription();
      case RMPackage.ENODE_TYPE_BODY__PROPERTIES:
        return getProperties();
      case RMPackage.ENODE_TYPE_BODY__ATTRIBUTES:
        return getAttributes();
      case RMPackage.ENODE_TYPE_BODY__INTERFACES:
        return getInterfaces();
      case RMPackage.ENODE_TYPE_BODY__CAPABILITIES:
        return getCapabilities();
      case RMPackage.ENODE_TYPE_BODY__REQUIREMENTS:
        return getRequirements();
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
      case RMPackage.ENODE_TYPE_BODY__SUPER_TYPE:
        setSuperType((String)newValue);
        return;
      case RMPackage.ENODE_TYPE_BODY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RMPackage.ENODE_TYPE_BODY__PROPERTIES:
        setProperties((EProperties)newValue);
        return;
      case RMPackage.ENODE_TYPE_BODY__ATTRIBUTES:
        setAttributes((EAttributes)newValue);
        return;
      case RMPackage.ENODE_TYPE_BODY__INTERFACES:
        setInterfaces((EInterfaces)newValue);
        return;
      case RMPackage.ENODE_TYPE_BODY__CAPABILITIES:
        setCapabilities((ECapabilities)newValue);
        return;
      case RMPackage.ENODE_TYPE_BODY__REQUIREMENTS:
        setRequirements((ERequirements)newValue);
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
      case RMPackage.ENODE_TYPE_BODY__SUPER_TYPE:
        setSuperType(SUPER_TYPE_EDEFAULT);
        return;
      case RMPackage.ENODE_TYPE_BODY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RMPackage.ENODE_TYPE_BODY__PROPERTIES:
        setProperties((EProperties)null);
        return;
      case RMPackage.ENODE_TYPE_BODY__ATTRIBUTES:
        setAttributes((EAttributes)null);
        return;
      case RMPackage.ENODE_TYPE_BODY__INTERFACES:
        setInterfaces((EInterfaces)null);
        return;
      case RMPackage.ENODE_TYPE_BODY__CAPABILITIES:
        setCapabilities((ECapabilities)null);
        return;
      case RMPackage.ENODE_TYPE_BODY__REQUIREMENTS:
        setRequirements((ERequirements)null);
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
      case RMPackage.ENODE_TYPE_BODY__SUPER_TYPE:
        return SUPER_TYPE_EDEFAULT == null ? superType != null : !SUPER_TYPE_EDEFAULT.equals(superType);
      case RMPackage.ENODE_TYPE_BODY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RMPackage.ENODE_TYPE_BODY__PROPERTIES:
        return properties != null;
      case RMPackage.ENODE_TYPE_BODY__ATTRIBUTES:
        return attributes != null;
      case RMPackage.ENODE_TYPE_BODY__INTERFACES:
        return interfaces != null;
      case RMPackage.ENODE_TYPE_BODY__CAPABILITIES:
        return capabilities != null;
      case RMPackage.ENODE_TYPE_BODY__REQUIREMENTS:
        return requirements != null;
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
    result.append(" (superType: ");
    result.append(superType);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ENodeTypeBodyImpl
