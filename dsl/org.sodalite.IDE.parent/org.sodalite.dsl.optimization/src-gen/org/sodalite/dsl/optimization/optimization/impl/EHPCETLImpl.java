/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EHPCETL;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EHPCETL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCETLImpl#isPrefetch <em>Prefetch</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCETLImpl#isCache <em>Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EHPCETLImpl extends MinimalEObjectImpl.Container implements EHPCETL
{
  /**
   * The default value of the '{@link #isPrefetch() <em>Prefetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrefetch()
   * @generated
   * @ordered
   */
  protected static final boolean PREFETCH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrefetch() <em>Prefetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrefetch()
   * @generated
   * @ordered
   */
  protected boolean prefetch = PREFETCH_EDEFAULT;

  /**
   * The default value of the '{@link #isCache() <em>Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCache()
   * @generated
   * @ordered
   */
  protected static final boolean CACHE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCache() <em>Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCache()
   * @generated
   * @ordered
   */
  protected boolean cache = CACHE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EHPCETLImpl()
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
    return OptimizationPackage.Literals.EHPCETL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPrefetch()
  {
    return prefetch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrefetch(boolean newPrefetch)
  {
    boolean oldPrefetch = prefetch;
    prefetch = newPrefetch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPCETL__PREFETCH, oldPrefetch, prefetch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isCache()
  {
    return cache;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCache(boolean newCache)
  {
    boolean oldCache = cache;
    cache = newCache;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPCETL__CACHE, oldCache, cache));
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
      case OptimizationPackage.EHPCETL__PREFETCH:
        return isPrefetch();
      case OptimizationPackage.EHPCETL__CACHE:
        return isCache();
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
      case OptimizationPackage.EHPCETL__PREFETCH:
        setPrefetch((Boolean)newValue);
        return;
      case OptimizationPackage.EHPCETL__CACHE:
        setCache((Boolean)newValue);
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
      case OptimizationPackage.EHPCETL__PREFETCH:
        setPrefetch(PREFETCH_EDEFAULT);
        return;
      case OptimizationPackage.EHPCETL__CACHE:
        setCache(CACHE_EDEFAULT);
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
      case OptimizationPackage.EHPCETL__PREFETCH:
        return prefetch != PREFETCH_EDEFAULT;
      case OptimizationPackage.EHPCETL__CACHE:
        return cache != CACHE_EDEFAULT;
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
    result.append(" (prefetch: ");
    result.append(prefetch);
    result.append(", cache: ");
    result.append(cache);
    result.append(')');
    return result.toString();
  }

} //EHPCETLImpl
