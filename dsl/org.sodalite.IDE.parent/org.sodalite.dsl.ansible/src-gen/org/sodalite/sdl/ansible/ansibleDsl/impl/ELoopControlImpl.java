/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EIndexOrLoopVariable;
import org.sodalite.sdl.ansible.ansibleDsl.ELoopControl;
import org.sodalite.sdl.ansible.ansibleDsl.ENumberPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ELoop Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ELoopControlImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ELoopControlImpl#getPause <em>Pause</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ELoopControlImpl#getIndex_var <em>Index var</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ELoopControlImpl#getLoop_var <em>Loop var</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ELoopControlImpl#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ELoopControlImpl extends MinimalEObjectImpl.Container implements ELoopControl
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EValuePassed label;

  /**
   * The cached value of the '{@link #getPause() <em>Pause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPause()
   * @generated
   * @ordered
   */
  protected ENumberPassed pause;

  /**
   * The cached value of the '{@link #getIndex_var() <em>Index var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex_var()
   * @generated
   * @ordered
   */
  protected EIndexOrLoopVariable index_var;

  /**
   * The cached value of the '{@link #getLoop_var() <em>Loop var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop_var()
   * @generated
   * @ordered
   */
  protected EIndexOrLoopVariable loop_var;

  /**
   * The cached value of the '{@link #getExtended() <em>Extended</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtended()
   * @generated
   * @ordered
   */
  protected EBooleanPassed extended;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ELoopControlImpl()
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
    return AnsibleDslPackage.Literals.ELOOP_CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassed getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(EValuePassed newLabel, NotificationChain msgs)
  {
    EValuePassed oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__LABEL, oldLabel, newLabel);
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
  public void setLabel(EValuePassed newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENumberPassed getPause()
  {
    return pause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPause(ENumberPassed newPause, NotificationChain msgs)
  {
    ENumberPassed oldPause = pause;
    pause = newPause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__PAUSE, oldPause, newPause);
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
  public void setPause(ENumberPassed newPause)
  {
    if (newPause != pause)
    {
      NotificationChain msgs = null;
      if (pause != null)
        msgs = ((InternalEObject)pause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__PAUSE, null, msgs);
      if (newPause != null)
        msgs = ((InternalEObject)newPause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__PAUSE, null, msgs);
      msgs = basicSetPause(newPause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__PAUSE, newPause, newPause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIndexOrLoopVariable getIndex_var()
  {
    return index_var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex_var(EIndexOrLoopVariable newIndex_var, NotificationChain msgs)
  {
    EIndexOrLoopVariable oldIndex_var = index_var;
    index_var = newIndex_var;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR, oldIndex_var, newIndex_var);
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
  public void setIndex_var(EIndexOrLoopVariable newIndex_var)
  {
    if (newIndex_var != index_var)
    {
      NotificationChain msgs = null;
      if (index_var != null)
        msgs = ((InternalEObject)index_var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR, null, msgs);
      if (newIndex_var != null)
        msgs = ((InternalEObject)newIndex_var).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR, null, msgs);
      msgs = basicSetIndex_var(newIndex_var, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR, newIndex_var, newIndex_var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIndexOrLoopVariable getLoop_var()
  {
    return loop_var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop_var(EIndexOrLoopVariable newLoop_var, NotificationChain msgs)
  {
    EIndexOrLoopVariable oldLoop_var = loop_var;
    loop_var = newLoop_var;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR, oldLoop_var, newLoop_var);
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
  public void setLoop_var(EIndexOrLoopVariable newLoop_var)
  {
    if (newLoop_var != loop_var)
    {
      NotificationChain msgs = null;
      if (loop_var != null)
        msgs = ((InternalEObject)loop_var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR, null, msgs);
      if (newLoop_var != null)
        msgs = ((InternalEObject)newLoop_var).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR, null, msgs);
      msgs = basicSetLoop_var(newLoop_var, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR, newLoop_var, newLoop_var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanPassed getExtended()
  {
    return extended;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtended(EBooleanPassed newExtended, NotificationChain msgs)
  {
    EBooleanPassed oldExtended = extended;
    extended = newExtended;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__EXTENDED, oldExtended, newExtended);
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
  public void setExtended(EBooleanPassed newExtended)
  {
    if (newExtended != extended)
    {
      NotificationChain msgs = null;
      if (extended != null)
        msgs = ((InternalEObject)extended).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__EXTENDED, null, msgs);
      if (newExtended != null)
        msgs = ((InternalEObject)newExtended).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ELOOP_CONTROL__EXTENDED, null, msgs);
      msgs = basicSetExtended(newExtended, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ELOOP_CONTROL__EXTENDED, newExtended, newExtended));
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
      case AnsibleDslPackage.ELOOP_CONTROL__LABEL:
        return basicSetLabel(null, msgs);
      case AnsibleDslPackage.ELOOP_CONTROL__PAUSE:
        return basicSetPause(null, msgs);
      case AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR:
        return basicSetIndex_var(null, msgs);
      case AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR:
        return basicSetLoop_var(null, msgs);
      case AnsibleDslPackage.ELOOP_CONTROL__EXTENDED:
        return basicSetExtended(null, msgs);
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
      case AnsibleDslPackage.ELOOP_CONTROL__LABEL:
        return getLabel();
      case AnsibleDslPackage.ELOOP_CONTROL__PAUSE:
        return getPause();
      case AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR:
        return getIndex_var();
      case AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR:
        return getLoop_var();
      case AnsibleDslPackage.ELOOP_CONTROL__EXTENDED:
        return getExtended();
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
      case AnsibleDslPackage.ELOOP_CONTROL__LABEL:
        setLabel((EValuePassed)newValue);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__PAUSE:
        setPause((ENumberPassed)newValue);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR:
        setIndex_var((EIndexOrLoopVariable)newValue);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR:
        setLoop_var((EIndexOrLoopVariable)newValue);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__EXTENDED:
        setExtended((EBooleanPassed)newValue);
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
      case AnsibleDslPackage.ELOOP_CONTROL__LABEL:
        setLabel((EValuePassed)null);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__PAUSE:
        setPause((ENumberPassed)null);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR:
        setIndex_var((EIndexOrLoopVariable)null);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR:
        setLoop_var((EIndexOrLoopVariable)null);
        return;
      case AnsibleDslPackage.ELOOP_CONTROL__EXTENDED:
        setExtended((EBooleanPassed)null);
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
      case AnsibleDslPackage.ELOOP_CONTROL__LABEL:
        return label != null;
      case AnsibleDslPackage.ELOOP_CONTROL__PAUSE:
        return pause != null;
      case AnsibleDslPackage.ELOOP_CONTROL__INDEX_VAR:
        return index_var != null;
      case AnsibleDslPackage.ELOOP_CONTROL__LOOP_VAR:
        return loop_var != null;
      case AnsibleDslPackage.ELOOP_CONTROL__EXTENDED:
        return extended != null;
    }
    return super.eIsSet(featureID);
  }

} //ELoopControlImpl
