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

import org.sodalite.dsl.rM.ECallOperationActivityDefinitionBody;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPropertyAssignments;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECall Operation Activity Definition Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECallOperationActivityDefinitionBodyImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECallOperationActivityDefinitionBodyImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECallOperationActivityDefinitionBodyImpl extends MinimalEObjectImpl.Container implements ECallOperationActivityDefinitionBody
{
  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE operation;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EPropertyAssignments inputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECallOperationActivityDefinitionBodyImpl()
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
    return RMPackage.Literals.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(EPREFIX_TYPE newOperation, NotificationChain msgs)
  {
    EPREFIX_TYPE oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION, oldOperation, newOperation);
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
  public void setOperation(EPREFIX_TYPE newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION, newOperation, newOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPropertyAssignments getInputs()
  {
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputs(EPropertyAssignments newInputs, NotificationChain msgs)
  {
    EPropertyAssignments oldInputs = inputs;
    inputs = newInputs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS, oldInputs, newInputs);
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
  public void setInputs(EPropertyAssignments newInputs)
  {
    if (newInputs != inputs)
    {
      NotificationChain msgs = null;
      if (inputs != null)
        msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS, null, msgs);
      if (newInputs != null)
        msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS, null, msgs);
      msgs = basicSetInputs(newInputs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS, newInputs, newInputs));
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
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION:
        return basicSetOperation(null, msgs);
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS:
        return basicSetInputs(null, msgs);
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
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION:
        return getOperation();
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS:
        return getInputs();
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
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION:
        setOperation((EPREFIX_TYPE)newValue);
        return;
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS:
        setInputs((EPropertyAssignments)newValue);
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
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION:
        setOperation((EPREFIX_TYPE)null);
        return;
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS:
        setInputs((EPropertyAssignments)null);
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
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__OPERATION:
        return operation != null;
      case RMPackage.ECALL_OPERATION_ACTIVITY_DEFINITION_BODY__INPUTS:
        return inputs != null;
    }
    return super.eIsSet(featureID);
  }

} //ECallOperationActivityDefinitionBodyImpl
