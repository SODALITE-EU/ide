/**
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.ETimeInterval;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETime Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ETimeIntervalImpl#getStart_time <em>Start time</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ETimeIntervalImpl#getEnd_time <em>End time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETimeIntervalImpl extends MinimalEObjectImpl.Container implements ETimeInterval
{
  /**
   * The default value of the '{@link #getStart_time() <em>Start time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart_time()
   * @generated
   * @ordered
   */
  protected static final String START_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart_time() <em>Start time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart_time()
   * @generated
   * @ordered
   */
  protected String start_time = START_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd_time() <em>End time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd_time()
   * @generated
   * @ordered
   */
  protected static final String END_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd_time() <em>End time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd_time()
   * @generated
   * @ordered
   */
  protected String end_time = END_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETimeIntervalImpl()
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
    return RMPackage.Literals.ETIME_INTERVAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStart_time()
  {
    return start_time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStart_time(String newStart_time)
  {
    String oldStart_time = start_time;
    start_time = newStart_time;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ETIME_INTERVAL__START_TIME, oldStart_time, start_time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnd_time()
  {
    return end_time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnd_time(String newEnd_time)
  {
    String oldEnd_time = end_time;
    end_time = newEnd_time;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ETIME_INTERVAL__END_TIME, oldEnd_time, end_time));
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
      case RMPackage.ETIME_INTERVAL__START_TIME:
        return getStart_time();
      case RMPackage.ETIME_INTERVAL__END_TIME:
        return getEnd_time();
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
      case RMPackage.ETIME_INTERVAL__START_TIME:
        setStart_time((String)newValue);
        return;
      case RMPackage.ETIME_INTERVAL__END_TIME:
        setEnd_time((String)newValue);
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
      case RMPackage.ETIME_INTERVAL__START_TIME:
        setStart_time(START_TIME_EDEFAULT);
        return;
      case RMPackage.ETIME_INTERVAL__END_TIME:
        setEnd_time(END_TIME_EDEFAULT);
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
      case RMPackage.ETIME_INTERVAL__START_TIME:
        return START_TIME_EDEFAULT == null ? start_time != null : !START_TIME_EDEFAULT.equals(start_time);
      case RMPackage.ETIME_INTERVAL__END_TIME:
        return END_TIME_EDEFAULT == null ? end_time != null : !END_TIME_EDEFAULT.equals(end_time);
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
    result.append(" (start_time: ");
    result.append(start_time);
    result.append(", end_time: ");
    result.append(end_time);
    result.append(')');
    return result.toString();
  }

} //ETimeIntervalImpl