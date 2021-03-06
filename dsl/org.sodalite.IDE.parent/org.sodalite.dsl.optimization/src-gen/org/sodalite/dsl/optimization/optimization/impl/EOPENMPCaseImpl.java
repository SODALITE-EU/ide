/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EOPENMP;
import org.sodalite.dsl.optimization.optimization.EOPENMPCase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOPENMP Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EOPENMPCaseImpl#getOpenmp <em>Openmp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOPENMPCaseImpl extends MinimalEObjectImpl.Container implements EOPENMPCase
{
  /**
   * The cached value of the '{@link #getOpenmp() <em>Openmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenmp()
   * @generated
   * @ordered
   */
  protected EOPENMP openmp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EOPENMPCaseImpl()
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
    return OptimizationPackage.Literals.EOPENMP_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOPENMP getOpenmp()
  {
    return openmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpenmp(EOPENMP newOpenmp, NotificationChain msgs)
  {
    EOPENMP oldOpenmp = openmp;
    openmp = newOpenmp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EOPENMP_CASE__OPENMP, oldOpenmp, newOpenmp);
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
  public void setOpenmp(EOPENMP newOpenmp)
  {
    if (newOpenmp != openmp)
    {
      NotificationChain msgs = null;
      if (openmp != null)
        msgs = ((InternalEObject)openmp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EOPENMP_CASE__OPENMP, null, msgs);
      if (newOpenmp != null)
        msgs = ((InternalEObject)newOpenmp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EOPENMP_CASE__OPENMP, null, msgs);
      msgs = basicSetOpenmp(newOpenmp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EOPENMP_CASE__OPENMP, newOpenmp, newOpenmp));
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
      case OptimizationPackage.EOPENMP_CASE__OPENMP:
        return basicSetOpenmp(null, msgs);
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
      case OptimizationPackage.EOPENMP_CASE__OPENMP:
        return getOpenmp();
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
      case OptimizationPackage.EOPENMP_CASE__OPENMP:
        setOpenmp((EOPENMP)newValue);
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
      case OptimizationPackage.EOPENMP_CASE__OPENMP:
        setOpenmp((EOPENMP)null);
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
      case OptimizationPackage.EOPENMP_CASE__OPENMP:
        return openmp != null;
    }
    return super.eIsSet(featureID);
  }

} //EOPENMPCaseImpl
