/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.dsl.optimization.optimization.EMPI;
import org.sodalite.dsl.optimization.optimization.EMPICase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMPI Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EMPICaseImpl#getMpi <em>Mpi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMPICaseImpl extends EHPCCasesImpl implements EMPICase
{
  /**
   * The cached value of the '{@link #getMpi() <em>Mpi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMpi()
   * @generated
   * @ordered
   */
  protected EMPI mpi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMPICaseImpl()
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
    return OptimizationPackage.Literals.EMPI_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EMPI getMpi()
  {
    return mpi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMpi(EMPI newMpi, NotificationChain msgs)
  {
    EMPI oldMpi = mpi;
    mpi = newMpi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EMPI_CASE__MPI, oldMpi, newMpi);
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
  public void setMpi(EMPI newMpi)
  {
    if (newMpi != mpi)
    {
      NotificationChain msgs = null;
      if (mpi != null)
        msgs = ((InternalEObject)mpi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EMPI_CASE__MPI, null, msgs);
      if (newMpi != null)
        msgs = ((InternalEObject)newMpi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EMPI_CASE__MPI, null, msgs);
      msgs = basicSetMpi(newMpi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EMPI_CASE__MPI, newMpi, newMpi));
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
      case OptimizationPackage.EMPI_CASE__MPI:
        return basicSetMpi(null, msgs);
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
      case OptimizationPackage.EMPI_CASE__MPI:
        return getMpi();
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
      case OptimizationPackage.EMPI_CASE__MPI:
        setMpi((EMPI)newValue);
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
      case OptimizationPackage.EMPI_CASE__MPI:
        setMpi((EMPI)null);
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
      case OptimizationPackage.EMPI_CASE__MPI:
        return mpi != null;
    }
    return super.eIsSet(featureID);
  }

} //EMPICaseImpl
