/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.dsl.rM.EConditionClauseDefinition;
import org.sodalite.dsl.rM.EConditionClauseDefinitionOR;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECondition Clause Definition OR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EConditionClauseDefinitionORImpl#getOr <em>Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EConditionClauseDefinitionORImpl extends EConditionClauseDefinitionImpl implements EConditionClauseDefinitionOR
{
  /**
   * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr()
   * @generated
   * @ordered
   */
  protected EConditionClauseDefinition or;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EConditionClauseDefinitionORImpl()
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
    return RMPackage.Literals.ECONDITION_CLAUSE_DEFINITION_OR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConditionClauseDefinition getOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOr(EConditionClauseDefinition newOr, NotificationChain msgs)
  {
    EConditionClauseDefinition oldOr = or;
    or = newOr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR, oldOr, newOr);
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
  public void setOr(EConditionClauseDefinition newOr)
  {
    if (newOr != or)
    {
      NotificationChain msgs = null;
      if (or != null)
        msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR, null, msgs);
      if (newOr != null)
        msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR, null, msgs);
      msgs = basicSetOr(newOr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR, newOr, newOr));
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
      case RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR:
        return basicSetOr(null, msgs);
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
      case RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR:
        return getOr();
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
      case RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR:
        setOr((EConditionClauseDefinition)newValue);
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
      case RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR:
        setOr((EConditionClauseDefinition)null);
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
      case RMPackage.ECONDITION_CLAUSE_DEFINITION_OR__OR:
        return or != null;
    }
    return super.eIsSet(featureID);
  }

} //EConditionClauseDefinitionORImpl
