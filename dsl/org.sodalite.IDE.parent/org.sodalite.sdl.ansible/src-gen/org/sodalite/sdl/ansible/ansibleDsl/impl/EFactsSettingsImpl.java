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
import org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFacts Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFactsSettingsImpl#getGather_facts <em>Gather facts</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFactsSettingsImpl#getGather_subset <em>Gather subset</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFactsSettingsImpl#getGather_timeout <em>Gather timeout</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFactsSettingsImpl#getFact_path <em>Fact path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFactsSettingsImpl extends MinimalEObjectImpl.Container implements EFactsSettings
{
  /**
   * The default value of the '{@link #getGather_facts() <em>Gather facts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGather_facts()
   * @generated
   * @ordered
   */
  protected static final String GATHER_FACTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGather_facts() <em>Gather facts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGather_facts()
   * @generated
   * @ordered
   */
  protected String gather_facts = GATHER_FACTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getGather_subset() <em>Gather subset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGather_subset()
   * @generated
   * @ordered
   */
  protected EList gather_subset;

  /**
   * The default value of the '{@link #getGather_timeout() <em>Gather timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGather_timeout()
   * @generated
   * @ordered
   */
  protected static final String GATHER_TIMEOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGather_timeout() <em>Gather timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGather_timeout()
   * @generated
   * @ordered
   */
  protected String gather_timeout = GATHER_TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getFact_path() <em>Fact path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFact_path()
   * @generated
   * @ordered
   */
  protected static final String FACT_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFact_path() <em>Fact path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFact_path()
   * @generated
   * @ordered
   */
  protected String fact_path = FACT_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EFactsSettingsImpl()
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
    return AnsibleDslPackage.Literals.EFACTS_SETTINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGather_facts()
  {
    return gather_facts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGather_facts(String newGather_facts)
  {
    String oldGather_facts = gather_facts;
    gather_facts = newGather_facts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFACTS_SETTINGS__GATHER_FACTS, oldGather_facts, gather_facts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList getGather_subset()
  {
    return gather_subset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGather_subset(EList newGather_subset, NotificationChain msgs)
  {
    EList oldGather_subset = gather_subset;
    gather_subset = newGather_subset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET, oldGather_subset, newGather_subset);
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
  public void setGather_subset(EList newGather_subset)
  {
    if (newGather_subset != gather_subset)
    {
      NotificationChain msgs = null;
      if (gather_subset != null)
        msgs = ((InternalEObject)gather_subset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET, null, msgs);
      if (newGather_subset != null)
        msgs = ((InternalEObject)newGather_subset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET, null, msgs);
      msgs = basicSetGather_subset(newGather_subset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET, newGather_subset, newGather_subset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGather_timeout()
  {
    return gather_timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGather_timeout(String newGather_timeout)
  {
    String oldGather_timeout = gather_timeout;
    gather_timeout = newGather_timeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFACTS_SETTINGS__GATHER_TIMEOUT, oldGather_timeout, gather_timeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFact_path()
  {
    return fact_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFact_path(String newFact_path)
  {
    String oldFact_path = fact_path;
    fact_path = newFact_path;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFACTS_SETTINGS__FACT_PATH, oldFact_path, fact_path));
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
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET:
        return basicSetGather_subset(null, msgs);
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
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_FACTS:
        return getGather_facts();
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET:
        return getGather_subset();
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_TIMEOUT:
        return getGather_timeout();
      case AnsibleDslPackage.EFACTS_SETTINGS__FACT_PATH:
        return getFact_path();
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
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_FACTS:
        setGather_facts((String)newValue);
        return;
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET:
        setGather_subset((EList)newValue);
        return;
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_TIMEOUT:
        setGather_timeout((String)newValue);
        return;
      case AnsibleDslPackage.EFACTS_SETTINGS__FACT_PATH:
        setFact_path((String)newValue);
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
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_FACTS:
        setGather_facts(GATHER_FACTS_EDEFAULT);
        return;
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET:
        setGather_subset((EList)null);
        return;
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_TIMEOUT:
        setGather_timeout(GATHER_TIMEOUT_EDEFAULT);
        return;
      case AnsibleDslPackage.EFACTS_SETTINGS__FACT_PATH:
        setFact_path(FACT_PATH_EDEFAULT);
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
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_FACTS:
        return GATHER_FACTS_EDEFAULT == null ? gather_facts != null : !GATHER_FACTS_EDEFAULT.equals(gather_facts);
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_SUBSET:
        return gather_subset != null;
      case AnsibleDslPackage.EFACTS_SETTINGS__GATHER_TIMEOUT:
        return GATHER_TIMEOUT_EDEFAULT == null ? gather_timeout != null : !GATHER_TIMEOUT_EDEFAULT.equals(gather_timeout);
      case AnsibleDslPackage.EFACTS_SETTINGS__FACT_PATH:
        return FACT_PATH_EDEFAULT == null ? fact_path != null : !FACT_PATH_EDEFAULT.equals(fact_path);
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
    result.append(" (gather_facts: ");
    result.append(gather_facts);
    result.append(", gather_timeout: ");
    result.append(gather_timeout);
    result.append(", fact_path: ");
    result.append(fact_path);
    result.append(')');
    return result.toString();
  }

} //EFactsSettingsImpl
