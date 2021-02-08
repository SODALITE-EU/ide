/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EPlay;
import org.sodalite.sdl.ansible.ansibleDsl.EPlaybook;
import org.sodalite.sdl.ansible.ansibleDsl.EUsedByBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPlaybook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPlaybookImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPlaybookImpl#getUsed_by <em>Used by</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EPlaybookImpl#getPlays <em>Plays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPlaybookImpl extends ModelImpl implements EPlaybook
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getUsed_by() <em>Used by</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsed_by()
   * @generated
   * @ordered
   */
  protected EUsedByBody used_by;

  /**
   * The cached value of the '{@link #getPlays() <em>Plays</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlays()
   * @generated
   * @ordered
   */
  protected EList<EPlay> plays;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPlaybookImpl()
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
    return AnsibleDslPackage.Literals.EPLAYBOOK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAYBOOK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EUsedByBody getUsed_by()
  {
    return used_by;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUsed_by(EUsedByBody newUsed_by, NotificationChain msgs)
  {
    EUsedByBody oldUsed_by = used_by;
    used_by = newUsed_by;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAYBOOK__USED_BY, oldUsed_by, newUsed_by);
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
  public void setUsed_by(EUsedByBody newUsed_by)
  {
    if (newUsed_by != used_by)
    {
      NotificationChain msgs = null;
      if (used_by != null)
        msgs = ((InternalEObject)used_by).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAYBOOK__USED_BY, null, msgs);
      if (newUsed_by != null)
        msgs = ((InternalEObject)newUsed_by).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EPLAYBOOK__USED_BY, null, msgs);
      msgs = basicSetUsed_by(newUsed_by, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EPLAYBOOK__USED_BY, newUsed_by, newUsed_by));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EPlay> getPlays()
  {
    if (plays == null)
    {
      plays = new EObjectContainmentEList<EPlay>(EPlay.class, this, AnsibleDslPackage.EPLAYBOOK__PLAYS);
    }
    return plays;
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
      case AnsibleDslPackage.EPLAYBOOK__USED_BY:
        return basicSetUsed_by(null, msgs);
      case AnsibleDslPackage.EPLAYBOOK__PLAYS:
        return ((InternalEList<?>)getPlays()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EPLAYBOOK__NAME:
        return getName();
      case AnsibleDslPackage.EPLAYBOOK__USED_BY:
        return getUsed_by();
      case AnsibleDslPackage.EPLAYBOOK__PLAYS:
        return getPlays();
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
      case AnsibleDslPackage.EPLAYBOOK__NAME:
        setName((String)newValue);
        return;
      case AnsibleDslPackage.EPLAYBOOK__USED_BY:
        setUsed_by((EUsedByBody)newValue);
        return;
      case AnsibleDslPackage.EPLAYBOOK__PLAYS:
        getPlays().clear();
        getPlays().addAll((Collection<? extends EPlay>)newValue);
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
      case AnsibleDslPackage.EPLAYBOOK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AnsibleDslPackage.EPLAYBOOK__USED_BY:
        setUsed_by((EUsedByBody)null);
        return;
      case AnsibleDslPackage.EPLAYBOOK__PLAYS:
        getPlays().clear();
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
      case AnsibleDslPackage.EPLAYBOOK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AnsibleDslPackage.EPLAYBOOK__USED_BY:
        return used_by != null;
      case AnsibleDslPackage.EPLAYBOOK__PLAYS:
        return plays != null && !plays.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EPlaybookImpl
