/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.aADM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.sodalite.dsl.aADM.AADMPackage;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.EInputs;
import org.sodalite.dsl.aADM.ENodeTemplates;
import org.sodalite.dsl.aADM.EOutputs;
import org.sodalite.dsl.aADM.EPolicies;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AADM Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.aADM.impl.AADM_ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.AADM_ModelImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.AADM_ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.AADM_ModelImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.AADM_ModelImpl#getNodeTemplates <em>Node Templates</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.AADM_ModelImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link org.sodalite.dsl.aADM.impl.AADM_ModelImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AADM_ModelImpl extends MinimalEObjectImpl.Container implements AADM_Model
{
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
   * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected static final String MODULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected String module = MODULE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<String> imports;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EInputs inputs;

  /**
   * The cached value of the '{@link #getNodeTemplates() <em>Node Templates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeTemplates()
   * @generated
   * @ordered
   */
  protected ENodeTemplates nodeTemplates;

  /**
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EPolicies policies;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EOutputs outputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AADM_ModelImpl()
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
    return AADMPackage.Literals.AADM_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModule(String newModule)
  {
    String oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getImports()
  {
    if (imports == null)
    {
      imports = new EDataTypeEList<String>(String.class, this, AADMPackage.AADM_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInputs getInputs()
  {
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputs(EInputs newInputs, NotificationChain msgs)
  {
    EInputs oldInputs = inputs;
    inputs = newInputs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__INPUTS, oldInputs, newInputs);
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
  public void setInputs(EInputs newInputs)
  {
    if (newInputs != inputs)
    {
      NotificationChain msgs = null;
      if (inputs != null)
        msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__INPUTS, null, msgs);
      if (newInputs != null)
        msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__INPUTS, null, msgs);
      msgs = basicSetInputs(newInputs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__INPUTS, newInputs, newInputs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENodeTemplates getNodeTemplates()
  {
    return nodeTemplates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeTemplates(ENodeTemplates newNodeTemplates, NotificationChain msgs)
  {
    ENodeTemplates oldNodeTemplates = nodeTemplates;
    nodeTemplates = newNodeTemplates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__NODE_TEMPLATES, oldNodeTemplates, newNodeTemplates);
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
  public void setNodeTemplates(ENodeTemplates newNodeTemplates)
  {
    if (newNodeTemplates != nodeTemplates)
    {
      NotificationChain msgs = null;
      if (nodeTemplates != null)
        msgs = ((InternalEObject)nodeTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__NODE_TEMPLATES, null, msgs);
      if (newNodeTemplates != null)
        msgs = ((InternalEObject)newNodeTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__NODE_TEMPLATES, null, msgs);
      msgs = basicSetNodeTemplates(newNodeTemplates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__NODE_TEMPLATES, newNodeTemplates, newNodeTemplates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPolicies getPolicies()
  {
    return policies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPolicies(EPolicies newPolicies, NotificationChain msgs)
  {
    EPolicies oldPolicies = policies;
    policies = newPolicies;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__POLICIES, oldPolicies, newPolicies);
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
  public void setPolicies(EPolicies newPolicies)
  {
    if (newPolicies != policies)
    {
      NotificationChain msgs = null;
      if (policies != null)
        msgs = ((InternalEObject)policies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__POLICIES, null, msgs);
      if (newPolicies != null)
        msgs = ((InternalEObject)newPolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__POLICIES, null, msgs);
      msgs = basicSetPolicies(newPolicies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__POLICIES, newPolicies, newPolicies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOutputs getOutputs()
  {
    return outputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputs(EOutputs newOutputs, NotificationChain msgs)
  {
    EOutputs oldOutputs = outputs;
    outputs = newOutputs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__OUTPUTS, oldOutputs, newOutputs);
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
  public void setOutputs(EOutputs newOutputs)
  {
    if (newOutputs != outputs)
    {
      NotificationChain msgs = null;
      if (outputs != null)
        msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__OUTPUTS, null, msgs);
      if (newOutputs != null)
        msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AADMPackage.AADM_MODEL__OUTPUTS, null, msgs);
      msgs = basicSetOutputs(newOutputs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AADMPackage.AADM_MODEL__OUTPUTS, newOutputs, newOutputs));
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
      case AADMPackage.AADM_MODEL__INPUTS:
        return basicSetInputs(null, msgs);
      case AADMPackage.AADM_MODEL__NODE_TEMPLATES:
        return basicSetNodeTemplates(null, msgs);
      case AADMPackage.AADM_MODEL__POLICIES:
        return basicSetPolicies(null, msgs);
      case AADMPackage.AADM_MODEL__OUTPUTS:
        return basicSetOutputs(null, msgs);
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
      case AADMPackage.AADM_MODEL__DESCRIPTION:
        return getDescription();
      case AADMPackage.AADM_MODEL__MODULE:
        return getModule();
      case AADMPackage.AADM_MODEL__IMPORTS:
        return getImports();
      case AADMPackage.AADM_MODEL__INPUTS:
        return getInputs();
      case AADMPackage.AADM_MODEL__NODE_TEMPLATES:
        return getNodeTemplates();
      case AADMPackage.AADM_MODEL__POLICIES:
        return getPolicies();
      case AADMPackage.AADM_MODEL__OUTPUTS:
        return getOutputs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AADMPackage.AADM_MODEL__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AADMPackage.AADM_MODEL__MODULE:
        setModule((String)newValue);
        return;
      case AADMPackage.AADM_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends String>)newValue);
        return;
      case AADMPackage.AADM_MODEL__INPUTS:
        setInputs((EInputs)newValue);
        return;
      case AADMPackage.AADM_MODEL__NODE_TEMPLATES:
        setNodeTemplates((ENodeTemplates)newValue);
        return;
      case AADMPackage.AADM_MODEL__POLICIES:
        setPolicies((EPolicies)newValue);
        return;
      case AADMPackage.AADM_MODEL__OUTPUTS:
        setOutputs((EOutputs)newValue);
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
      case AADMPackage.AADM_MODEL__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AADMPackage.AADM_MODEL__MODULE:
        setModule(MODULE_EDEFAULT);
        return;
      case AADMPackage.AADM_MODEL__IMPORTS:
        getImports().clear();
        return;
      case AADMPackage.AADM_MODEL__INPUTS:
        setInputs((EInputs)null);
        return;
      case AADMPackage.AADM_MODEL__NODE_TEMPLATES:
        setNodeTemplates((ENodeTemplates)null);
        return;
      case AADMPackage.AADM_MODEL__POLICIES:
        setPolicies((EPolicies)null);
        return;
      case AADMPackage.AADM_MODEL__OUTPUTS:
        setOutputs((EOutputs)null);
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
      case AADMPackage.AADM_MODEL__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AADMPackage.AADM_MODEL__MODULE:
        return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
      case AADMPackage.AADM_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AADMPackage.AADM_MODEL__INPUTS:
        return inputs != null;
      case AADMPackage.AADM_MODEL__NODE_TEMPLATES:
        return nodeTemplates != null;
      case AADMPackage.AADM_MODEL__POLICIES:
        return policies != null;
      case AADMPackage.AADM_MODEL__OUTPUTS:
        return outputs != null;
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
    result.append(", module: ");
    result.append(module);
    result.append(", imports: ");
    result.append(imports);
    result.append(')');
    return result.toString();
  }

} //AADM_ModelImpl