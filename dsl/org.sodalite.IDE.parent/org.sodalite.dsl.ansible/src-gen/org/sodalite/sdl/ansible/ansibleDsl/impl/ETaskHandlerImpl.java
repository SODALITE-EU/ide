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
import org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPassed;
import org.sodalite.sdl.ansible.ansibleDsl.ELoop;
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall;
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiable;
import org.sodalite.sdl.ansible.ansibleDsl.ERegisterVariable;
import org.sodalite.sdl.ansible.ansibleDsl.EStringPassed;
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler;
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETask Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getError_handling <em>Error handling</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getAsynchronous_settings <em>Asynchronous settings</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getNotifiables <em>Notifiables</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerImpl#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETaskHandlerImpl extends EExecutionImpl implements ETaskHandler
{
  /**
   * The cached value of the '{@link #getError_handling() <em>Error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getError_handling()
   * @generated
   * @ordered
   */
  protected ETaskHandlerErrorHandling error_handling;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EStringPassed action;

  /**
   * The cached value of the '{@link #getAsynchronous_settings() <em>Asynchronous settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsynchronous_settings()
   * @generated
   * @ordered
   */
  protected EAsynchronousSettings asynchronous_settings;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EDictionaryPassed args;

  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected EModuleCall module;

  /**
   * The cached value of the '{@link #getNotifiables() <em>Notifiables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotifiables()
   * @generated
   * @ordered
   */
  protected EList<ENotifiable> notifiables;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected ELoop loop;

  /**
   * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected ERegisterVariable register;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETaskHandlerImpl()
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
    return AnsibleDslPackage.Literals.ETASK_HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETaskHandlerErrorHandling getError_handling()
  {
    return error_handling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetError_handling(ETaskHandlerErrorHandling newError_handling, NotificationChain msgs)
  {
    ETaskHandlerErrorHandling oldError_handling = error_handling;
    error_handling = newError_handling;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING, oldError_handling, newError_handling);
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
  public void setError_handling(ETaskHandlerErrorHandling newError_handling)
  {
    if (newError_handling != error_handling)
    {
      NotificationChain msgs = null;
      if (error_handling != null)
        msgs = ((InternalEObject)error_handling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING, null, msgs);
      if (newError_handling != null)
        msgs = ((InternalEObject)newError_handling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING, null, msgs);
      msgs = basicSetError_handling(newError_handling, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING, newError_handling, newError_handling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(EStringPassed newAction, NotificationChain msgs)
  {
    EStringPassed oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ACTION, oldAction, newAction);
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
  public void setAction(EStringPassed newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAsynchronousSettings getAsynchronous_settings()
  {
    return asynchronous_settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsynchronous_settings(EAsynchronousSettings newAsynchronous_settings, NotificationChain msgs)
  {
    EAsynchronousSettings oldAsynchronous_settings = asynchronous_settings;
    asynchronous_settings = newAsynchronous_settings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS, oldAsynchronous_settings, newAsynchronous_settings);
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
  public void setAsynchronous_settings(EAsynchronousSettings newAsynchronous_settings)
  {
    if (newAsynchronous_settings != asynchronous_settings)
    {
      NotificationChain msgs = null;
      if (asynchronous_settings != null)
        msgs = ((InternalEObject)asynchronous_settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS, null, msgs);
      if (newAsynchronous_settings != null)
        msgs = ((InternalEObject)newAsynchronous_settings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS, null, msgs);
      msgs = basicSetAsynchronous_settings(newAsynchronous_settings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS, newAsynchronous_settings, newAsynchronous_settings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryPassed getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(EDictionaryPassed newArgs, NotificationChain msgs)
  {
    EDictionaryPassed oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ARGS, oldArgs, newArgs);
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
  public void setArgs(EDictionaryPassed newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__ARGS, newArgs, newArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EModuleCall getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModule(EModuleCall newModule, NotificationChain msgs)
  {
    EModuleCall oldModule = module;
    module = newModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__MODULE, oldModule, newModule);
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
  public void setModule(EModuleCall newModule)
  {
    if (newModule != module)
    {
      NotificationChain msgs = null;
      if (module != null)
        msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__MODULE, null, msgs);
      if (newModule != null)
        msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__MODULE, null, msgs);
      msgs = basicSetModule(newModule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__MODULE, newModule, newModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ENotifiable> getNotifiables()
  {
    if (notifiables == null)
    {
      notifiables = new EObjectContainmentEList<ENotifiable>(ENotifiable.class, this, AnsibleDslPackage.ETASK_HANDLER__NOTIFIABLES);
    }
    return notifiables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoop getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(ELoop newLoop, NotificationChain msgs)
  {
    ELoop oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__LOOP, oldLoop, newLoop);
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
  public void setLoop(ELoop newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERegisterVariable getRegister()
  {
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegister(ERegisterVariable newRegister, NotificationChain msgs)
  {
    ERegisterVariable oldRegister = register;
    register = newRegister;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__REGISTER, oldRegister, newRegister);
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
  public void setRegister(ERegisterVariable newRegister)
  {
    if (newRegister != register)
    {
      NotificationChain msgs = null;
      if (register != null)
        msgs = ((InternalEObject)register).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__REGISTER, null, msgs);
      if (newRegister != null)
        msgs = ((InternalEObject)newRegister).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER__REGISTER, null, msgs);
      msgs = basicSetRegister(newRegister, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER__REGISTER, newRegister, newRegister));
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
      case AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING:
        return basicSetError_handling(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER__ACTION:
        return basicSetAction(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS:
        return basicSetAsynchronous_settings(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER__ARGS:
        return basicSetArgs(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER__MODULE:
        return basicSetModule(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER__NOTIFIABLES:
        return ((InternalEList<?>)getNotifiables()).basicRemove(otherEnd, msgs);
      case AnsibleDslPackage.ETASK_HANDLER__LOOP:
        return basicSetLoop(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER__REGISTER:
        return basicSetRegister(null, msgs);
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
      case AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING:
        return getError_handling();
      case AnsibleDslPackage.ETASK_HANDLER__ACTION:
        return getAction();
      case AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS:
        return getAsynchronous_settings();
      case AnsibleDslPackage.ETASK_HANDLER__ARGS:
        return getArgs();
      case AnsibleDslPackage.ETASK_HANDLER__MODULE:
        return getModule();
      case AnsibleDslPackage.ETASK_HANDLER__NOTIFIABLES:
        return getNotifiables();
      case AnsibleDslPackage.ETASK_HANDLER__LOOP:
        return getLoop();
      case AnsibleDslPackage.ETASK_HANDLER__REGISTER:
        return getRegister();
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
      case AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING:
        setError_handling((ETaskHandlerErrorHandling)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__ACTION:
        setAction((EStringPassed)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS:
        setAsynchronous_settings((EAsynchronousSettings)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__ARGS:
        setArgs((EDictionaryPassed)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__MODULE:
        setModule((EModuleCall)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__NOTIFIABLES:
        getNotifiables().clear();
        getNotifiables().addAll((Collection<? extends ENotifiable>)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__LOOP:
        setLoop((ELoop)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__REGISTER:
        setRegister((ERegisterVariable)newValue);
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
      case AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING:
        setError_handling((ETaskHandlerErrorHandling)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__ACTION:
        setAction((EStringPassed)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS:
        setAsynchronous_settings((EAsynchronousSettings)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__ARGS:
        setArgs((EDictionaryPassed)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__MODULE:
        setModule((EModuleCall)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__NOTIFIABLES:
        getNotifiables().clear();
        return;
      case AnsibleDslPackage.ETASK_HANDLER__LOOP:
        setLoop((ELoop)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER__REGISTER:
        setRegister((ERegisterVariable)null);
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
      case AnsibleDslPackage.ETASK_HANDLER__ERROR_HANDLING:
        return error_handling != null;
      case AnsibleDslPackage.ETASK_HANDLER__ACTION:
        return action != null;
      case AnsibleDslPackage.ETASK_HANDLER__ASYNCHRONOUS_SETTINGS:
        return asynchronous_settings != null;
      case AnsibleDslPackage.ETASK_HANDLER__ARGS:
        return args != null;
      case AnsibleDslPackage.ETASK_HANDLER__MODULE:
        return module != null;
      case AnsibleDslPackage.ETASK_HANDLER__NOTIFIABLES:
        return notifiables != null && !notifiables.isEmpty();
      case AnsibleDslPackage.ETASK_HANDLER__LOOP:
        return loop != null;
      case AnsibleDslPackage.ETASK_HANDLER__REGISTER:
        return register != null;
    }
    return super.eIsSet(featureID);
  }

} //ETaskHandlerImpl
