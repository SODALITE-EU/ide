/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.EArtifactTypes;
import org.sodalite.dsl.rM.ECapabilityTypes;
import org.sodalite.dsl.rM.EDataTypes;
import org.sodalite.dsl.rM.EInterfaceTypes;
import org.sodalite.dsl.rM.ENodeTypes;
import org.sodalite.dsl.rM.EPolicyTypes;
import org.sodalite.dsl.rM.ERelationshipTypes;
import org.sodalite.dsl.rM.RMPackage;
import org.sodalite.dsl.rM.RM_Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RM Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.RM_ModelImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.RM_ModelImpl#getArtifactTypes <em>Artifact Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.RM_ModelImpl#getCapabilityTypes <em>Capability Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.RM_ModelImpl#getInterfaceTypes <em>Interface Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.RM_ModelImpl#getRelationshipTypes <em>Relationship Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.RM_ModelImpl#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.RM_ModelImpl#getPolicyTypes <em>Policy Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RM_ModelImpl extends MinimalEObjectImpl.Container implements RM_Model
{
  /**
   * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataTypes()
   * @generated
   * @ordered
   */
  protected EDataTypes dataTypes;

  /**
   * The cached value of the '{@link #getArtifactTypes() <em>Artifact Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactTypes()
   * @generated
   * @ordered
   */
  protected EArtifactTypes artifactTypes;

  /**
   * The cached value of the '{@link #getCapabilityTypes() <em>Capability Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilityTypes()
   * @generated
   * @ordered
   */
  protected ECapabilityTypes capabilityTypes;

  /**
   * The cached value of the '{@link #getInterfaceTypes() <em>Interface Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTypes()
   * @generated
   * @ordered
   */
  protected EInterfaceTypes interfaceTypes;

  /**
   * The cached value of the '{@link #getRelationshipTypes() <em>Relationship Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationshipTypes()
   * @generated
   * @ordered
   */
  protected ERelationshipTypes relationshipTypes;

  /**
   * The cached value of the '{@link #getNodeTypes() <em>Node Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeTypes()
   * @generated
   * @ordered
   */
  protected ENodeTypes nodeTypes;

  /**
   * The cached value of the '{@link #getPolicyTypes() <em>Policy Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicyTypes()
   * @generated
   * @ordered
   */
  protected EPolicyTypes policyTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RM_ModelImpl()
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
    return RMPackage.Literals.RM_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataTypes getDataTypes()
  {
    return dataTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataTypes(EDataTypes newDataTypes, NotificationChain msgs)
  {
    EDataTypes oldDataTypes = dataTypes;
    dataTypes = newDataTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__DATA_TYPES, oldDataTypes, newDataTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataTypes(EDataTypes newDataTypes)
  {
    if (newDataTypes != dataTypes)
    {
      NotificationChain msgs = null;
      if (dataTypes != null)
        msgs = ((InternalEObject)dataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__DATA_TYPES, null, msgs);
      if (newDataTypes != null)
        msgs = ((InternalEObject)newDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__DATA_TYPES, null, msgs);
      msgs = basicSetDataTypes(newDataTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__DATA_TYPES, newDataTypes, newDataTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EArtifactTypes getArtifactTypes()
  {
    return artifactTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArtifactTypes(EArtifactTypes newArtifactTypes, NotificationChain msgs)
  {
    EArtifactTypes oldArtifactTypes = artifactTypes;
    artifactTypes = newArtifactTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__ARTIFACT_TYPES, oldArtifactTypes, newArtifactTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactTypes(EArtifactTypes newArtifactTypes)
  {
    if (newArtifactTypes != artifactTypes)
    {
      NotificationChain msgs = null;
      if (artifactTypes != null)
        msgs = ((InternalEObject)artifactTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__ARTIFACT_TYPES, null, msgs);
      if (newArtifactTypes != null)
        msgs = ((InternalEObject)newArtifactTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__ARTIFACT_TYPES, null, msgs);
      msgs = basicSetArtifactTypes(newArtifactTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__ARTIFACT_TYPES, newArtifactTypes, newArtifactTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECapabilityTypes getCapabilityTypes()
  {
    return capabilityTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCapabilityTypes(ECapabilityTypes newCapabilityTypes, NotificationChain msgs)
  {
    ECapabilityTypes oldCapabilityTypes = capabilityTypes;
    capabilityTypes = newCapabilityTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__CAPABILITY_TYPES, oldCapabilityTypes, newCapabilityTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapabilityTypes(ECapabilityTypes newCapabilityTypes)
  {
    if (newCapabilityTypes != capabilityTypes)
    {
      NotificationChain msgs = null;
      if (capabilityTypes != null)
        msgs = ((InternalEObject)capabilityTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__CAPABILITY_TYPES, null, msgs);
      if (newCapabilityTypes != null)
        msgs = ((InternalEObject)newCapabilityTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__CAPABILITY_TYPES, null, msgs);
      msgs = basicSetCapabilityTypes(newCapabilityTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__CAPABILITY_TYPES, newCapabilityTypes, newCapabilityTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EInterfaceTypes getInterfaceTypes()
  {
    return interfaceTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaceTypes(EInterfaceTypes newInterfaceTypes, NotificationChain msgs)
  {
    EInterfaceTypes oldInterfaceTypes = interfaceTypes;
    interfaceTypes = newInterfaceTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__INTERFACE_TYPES, oldInterfaceTypes, newInterfaceTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceTypes(EInterfaceTypes newInterfaceTypes)
  {
    if (newInterfaceTypes != interfaceTypes)
    {
      NotificationChain msgs = null;
      if (interfaceTypes != null)
        msgs = ((InternalEObject)interfaceTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__INTERFACE_TYPES, null, msgs);
      if (newInterfaceTypes != null)
        msgs = ((InternalEObject)newInterfaceTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__INTERFACE_TYPES, null, msgs);
      msgs = basicSetInterfaceTypes(newInterfaceTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__INTERFACE_TYPES, newInterfaceTypes, newInterfaceTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ERelationshipTypes getRelationshipTypes()
  {
    return relationshipTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationshipTypes(ERelationshipTypes newRelationshipTypes, NotificationChain msgs)
  {
    ERelationshipTypes oldRelationshipTypes = relationshipTypes;
    relationshipTypes = newRelationshipTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__RELATIONSHIP_TYPES, oldRelationshipTypes, newRelationshipTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationshipTypes(ERelationshipTypes newRelationshipTypes)
  {
    if (newRelationshipTypes != relationshipTypes)
    {
      NotificationChain msgs = null;
      if (relationshipTypes != null)
        msgs = ((InternalEObject)relationshipTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__RELATIONSHIP_TYPES, null, msgs);
      if (newRelationshipTypes != null)
        msgs = ((InternalEObject)newRelationshipTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__RELATIONSHIP_TYPES, null, msgs);
      msgs = basicSetRelationshipTypes(newRelationshipTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__RELATIONSHIP_TYPES, newRelationshipTypes, newRelationshipTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENodeTypes getNodeTypes()
  {
    return nodeTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeTypes(ENodeTypes newNodeTypes, NotificationChain msgs)
  {
    ENodeTypes oldNodeTypes = nodeTypes;
    nodeTypes = newNodeTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__NODE_TYPES, oldNodeTypes, newNodeTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeTypes(ENodeTypes newNodeTypes)
  {
    if (newNodeTypes != nodeTypes)
    {
      NotificationChain msgs = null;
      if (nodeTypes != null)
        msgs = ((InternalEObject)nodeTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__NODE_TYPES, null, msgs);
      if (newNodeTypes != null)
        msgs = ((InternalEObject)newNodeTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__NODE_TYPES, null, msgs);
      msgs = basicSetNodeTypes(newNodeTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__NODE_TYPES, newNodeTypes, newNodeTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPolicyTypes getPolicyTypes()
  {
    return policyTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPolicyTypes(EPolicyTypes newPolicyTypes, NotificationChain msgs)
  {
    EPolicyTypes oldPolicyTypes = policyTypes;
    policyTypes = newPolicyTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__POLICY_TYPES, oldPolicyTypes, newPolicyTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicyTypes(EPolicyTypes newPolicyTypes)
  {
    if (newPolicyTypes != policyTypes)
    {
      NotificationChain msgs = null;
      if (policyTypes != null)
        msgs = ((InternalEObject)policyTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__POLICY_TYPES, null, msgs);
      if (newPolicyTypes != null)
        msgs = ((InternalEObject)newPolicyTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.RM_MODEL__POLICY_TYPES, null, msgs);
      msgs = basicSetPolicyTypes(newPolicyTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.RM_MODEL__POLICY_TYPES, newPolicyTypes, newPolicyTypes));
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
      case RMPackage.RM_MODEL__DATA_TYPES:
        return basicSetDataTypes(null, msgs);
      case RMPackage.RM_MODEL__ARTIFACT_TYPES:
        return basicSetArtifactTypes(null, msgs);
      case RMPackage.RM_MODEL__CAPABILITY_TYPES:
        return basicSetCapabilityTypes(null, msgs);
      case RMPackage.RM_MODEL__INTERFACE_TYPES:
        return basicSetInterfaceTypes(null, msgs);
      case RMPackage.RM_MODEL__RELATIONSHIP_TYPES:
        return basicSetRelationshipTypes(null, msgs);
      case RMPackage.RM_MODEL__NODE_TYPES:
        return basicSetNodeTypes(null, msgs);
      case RMPackage.RM_MODEL__POLICY_TYPES:
        return basicSetPolicyTypes(null, msgs);
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
      case RMPackage.RM_MODEL__DATA_TYPES:
        return getDataTypes();
      case RMPackage.RM_MODEL__ARTIFACT_TYPES:
        return getArtifactTypes();
      case RMPackage.RM_MODEL__CAPABILITY_TYPES:
        return getCapabilityTypes();
      case RMPackage.RM_MODEL__INTERFACE_TYPES:
        return getInterfaceTypes();
      case RMPackage.RM_MODEL__RELATIONSHIP_TYPES:
        return getRelationshipTypes();
      case RMPackage.RM_MODEL__NODE_TYPES:
        return getNodeTypes();
      case RMPackage.RM_MODEL__POLICY_TYPES:
        return getPolicyTypes();
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
      case RMPackage.RM_MODEL__DATA_TYPES:
        setDataTypes((EDataTypes)newValue);
        return;
      case RMPackage.RM_MODEL__ARTIFACT_TYPES:
        setArtifactTypes((EArtifactTypes)newValue);
        return;
      case RMPackage.RM_MODEL__CAPABILITY_TYPES:
        setCapabilityTypes((ECapabilityTypes)newValue);
        return;
      case RMPackage.RM_MODEL__INTERFACE_TYPES:
        setInterfaceTypes((EInterfaceTypes)newValue);
        return;
      case RMPackage.RM_MODEL__RELATIONSHIP_TYPES:
        setRelationshipTypes((ERelationshipTypes)newValue);
        return;
      case RMPackage.RM_MODEL__NODE_TYPES:
        setNodeTypes((ENodeTypes)newValue);
        return;
      case RMPackage.RM_MODEL__POLICY_TYPES:
        setPolicyTypes((EPolicyTypes)newValue);
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
      case RMPackage.RM_MODEL__DATA_TYPES:
        setDataTypes((EDataTypes)null);
        return;
      case RMPackage.RM_MODEL__ARTIFACT_TYPES:
        setArtifactTypes((EArtifactTypes)null);
        return;
      case RMPackage.RM_MODEL__CAPABILITY_TYPES:
        setCapabilityTypes((ECapabilityTypes)null);
        return;
      case RMPackage.RM_MODEL__INTERFACE_TYPES:
        setInterfaceTypes((EInterfaceTypes)null);
        return;
      case RMPackage.RM_MODEL__RELATIONSHIP_TYPES:
        setRelationshipTypes((ERelationshipTypes)null);
        return;
      case RMPackage.RM_MODEL__NODE_TYPES:
        setNodeTypes((ENodeTypes)null);
        return;
      case RMPackage.RM_MODEL__POLICY_TYPES:
        setPolicyTypes((EPolicyTypes)null);
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
      case RMPackage.RM_MODEL__DATA_TYPES:
        return dataTypes != null;
      case RMPackage.RM_MODEL__ARTIFACT_TYPES:
        return artifactTypes != null;
      case RMPackage.RM_MODEL__CAPABILITY_TYPES:
        return capabilityTypes != null;
      case RMPackage.RM_MODEL__INTERFACE_TYPES:
        return interfaceTypes != null;
      case RMPackage.RM_MODEL__RELATIONSHIP_TYPES:
        return relationshipTypes != null;
      case RMPackage.RM_MODEL__NODE_TYPES:
        return nodeTypes != null;
      case RMPackage.RM_MODEL__POLICY_TYPES:
        return policyTypes != null;
    }
    return super.eIsSet(featureID);
  }

} //RM_ModelImpl
