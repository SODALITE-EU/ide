/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EOPENMP;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOPENMP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EOPENMPImpl#getNumber_of_threads <em>Number of threads</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EOPENMPImpl#getScaling_efficiency <em>Scaling efficiency</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EOPENMPImpl#getAffinity <em>Affinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOPENMPImpl extends MinimalEObjectImpl.Container implements EOPENMP
{
  /**
   * The default value of the '{@link #getNumber_of_threads() <em>Number of threads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_of_threads()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_THREADS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumber_of_threads() <em>Number of threads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_of_threads()
   * @generated
   * @ordered
   */
  protected int number_of_threads = NUMBER_OF_THREADS_EDEFAULT;

  /**
   * The default value of the '{@link #getScaling_efficiency() <em>Scaling efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaling_efficiency()
   * @generated
   * @ordered
   */
  protected static final Double SCALING_EFFICIENCY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScaling_efficiency() <em>Scaling efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaling_efficiency()
   * @generated
   * @ordered
   */
  protected Double scaling_efficiency = SCALING_EFFICIENCY_EDEFAULT;

  /**
   * The default value of the '{@link #getAffinity() <em>Affinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffinity()
   * @generated
   * @ordered
   */
  protected static final String AFFINITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAffinity() <em>Affinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffinity()
   * @generated
   * @ordered
   */
  protected String affinity = AFFINITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EOPENMPImpl()
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
    return OptimizationPackage.Literals.EOPENMP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumber_of_threads()
  {
    return number_of_threads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber_of_threads(int newNumber_of_threads)
  {
    int oldNumber_of_threads = number_of_threads;
    number_of_threads = newNumber_of_threads;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EOPENMP__NUMBER_OF_THREADS, oldNumber_of_threads, number_of_threads));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Double getScaling_efficiency()
  {
    return scaling_efficiency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScaling_efficiency(Double newScaling_efficiency)
  {
    Double oldScaling_efficiency = scaling_efficiency;
    scaling_efficiency = newScaling_efficiency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EOPENMP__SCALING_EFFICIENCY, oldScaling_efficiency, scaling_efficiency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAffinity()
  {
    return affinity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAffinity(String newAffinity)
  {
    String oldAffinity = affinity;
    affinity = newAffinity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EOPENMP__AFFINITY, oldAffinity, affinity));
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
      case OptimizationPackage.EOPENMP__NUMBER_OF_THREADS:
        return getNumber_of_threads();
      case OptimizationPackage.EOPENMP__SCALING_EFFICIENCY:
        return getScaling_efficiency();
      case OptimizationPackage.EOPENMP__AFFINITY:
        return getAffinity();
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
      case OptimizationPackage.EOPENMP__NUMBER_OF_THREADS:
        setNumber_of_threads((Integer)newValue);
        return;
      case OptimizationPackage.EOPENMP__SCALING_EFFICIENCY:
        setScaling_efficiency((Double)newValue);
        return;
      case OptimizationPackage.EOPENMP__AFFINITY:
        setAffinity((String)newValue);
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
      case OptimizationPackage.EOPENMP__NUMBER_OF_THREADS:
        setNumber_of_threads(NUMBER_OF_THREADS_EDEFAULT);
        return;
      case OptimizationPackage.EOPENMP__SCALING_EFFICIENCY:
        setScaling_efficiency(SCALING_EFFICIENCY_EDEFAULT);
        return;
      case OptimizationPackage.EOPENMP__AFFINITY:
        setAffinity(AFFINITY_EDEFAULT);
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
      case OptimizationPackage.EOPENMP__NUMBER_OF_THREADS:
        return number_of_threads != NUMBER_OF_THREADS_EDEFAULT;
      case OptimizationPackage.EOPENMP__SCALING_EFFICIENCY:
        return SCALING_EFFICIENCY_EDEFAULT == null ? scaling_efficiency != null : !SCALING_EFFICIENCY_EDEFAULT.equals(scaling_efficiency);
      case OptimizationPackage.EOPENMP__AFFINITY:
        return AFFINITY_EDEFAULT == null ? affinity != null : !AFFINITY_EDEFAULT.equals(affinity);
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
    result.append(" (number_of_threads: ");
    result.append(number_of_threads);
    result.append(", scaling_efficiency: ");
    result.append(scaling_efficiency);
    result.append(", affinity: ");
    result.append(affinity);
    result.append(')');
    return result.toString();
  }

} //EOPENMPImpl
