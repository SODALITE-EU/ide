/**
 * generated by Xtext 2.25.0
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
import org.sodalite.sdl.ansible.ansibleDsl.EElifBlock;
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EIfStatement;
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIf Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIfStatementImpl#getIf_block_sign <em>If block sign</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIfStatementImpl#getIf_condition <em>If condition</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIfStatementImpl#getIf_body <em>If body</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIfStatementImpl#getElif_blocks <em>Elif blocks</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIfStatementImpl#getEndif_block_sign <em>Endif block sign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIfStatementImpl extends EJinjaStatementImpl implements EIfStatement
{
  /**
   * The default value of the '{@link #getIf_block_sign() <em>If block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_block_sign()
   * @generated
   * @ordered
   */
  protected static final String IF_BLOCK_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIf_block_sign() <em>If block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_block_sign()
   * @generated
   * @ordered
   */
  protected String if_block_sign = IF_BLOCK_SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getIf_condition() <em>If condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_condition()
   * @generated
   * @ordered
   */
  protected EFilteredExpression if_condition;

  /**
   * The cached value of the '{@link #getIf_body() <em>If body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_body()
   * @generated
   * @ordered
   */
  protected EValuePassed if_body;

  /**
   * The cached value of the '{@link #getElif_blocks() <em>Elif blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElif_blocks()
   * @generated
   * @ordered
   */
  protected EList<EElifBlock> elif_blocks;

  /**
   * The default value of the '{@link #getEndif_block_sign() <em>Endif block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndif_block_sign()
   * @generated
   * @ordered
   */
  protected static final String ENDIF_BLOCK_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndif_block_sign() <em>Endif block sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndif_block_sign()
   * @generated
   * @ordered
   */
  protected String endif_block_sign = ENDIF_BLOCK_SIGN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EIfStatementImpl()
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
    return AnsibleDslPackage.Literals.EIF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIf_block_sign()
  {
    return if_block_sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIf_block_sign(String newIf_block_sign)
  {
    String oldIf_block_sign = if_block_sign;
    if_block_sign = newIf_block_sign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIF_STATEMENT__IF_BLOCK_SIGN, oldIf_block_sign, if_block_sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredExpression getIf_condition()
  {
    return if_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_condition(EFilteredExpression newIf_condition, NotificationChain msgs)
  {
    EFilteredExpression oldIf_condition = if_condition;
    if_condition = newIf_condition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION, oldIf_condition, newIf_condition);
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
  public void setIf_condition(EFilteredExpression newIf_condition)
  {
    if (newIf_condition != if_condition)
    {
      NotificationChain msgs = null;
      if (if_condition != null)
        msgs = ((InternalEObject)if_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION, null, msgs);
      if (newIf_condition != null)
        msgs = ((InternalEObject)newIf_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION, null, msgs);
      msgs = basicSetIf_condition(newIf_condition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION, newIf_condition, newIf_condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassed getIf_body()
  {
    return if_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_body(EValuePassed newIf_body, NotificationChain msgs)
  {
    EValuePassed oldIf_body = if_body;
    if_body = newIf_body;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIF_STATEMENT__IF_BODY, oldIf_body, newIf_body);
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
  public void setIf_body(EValuePassed newIf_body)
  {
    if (newIf_body != if_body)
    {
      NotificationChain msgs = null;
      if (if_body != null)
        msgs = ((InternalEObject)if_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIF_STATEMENT__IF_BODY, null, msgs);
      if (newIf_body != null)
        msgs = ((InternalEObject)newIf_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EIF_STATEMENT__IF_BODY, null, msgs);
      msgs = basicSetIf_body(newIf_body, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIF_STATEMENT__IF_BODY, newIf_body, newIf_body));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EElifBlock> getElif_blocks()
  {
    if (elif_blocks == null)
    {
      elif_blocks = new EObjectContainmentEList<EElifBlock>(EElifBlock.class, this, AnsibleDslPackage.EIF_STATEMENT__ELIF_BLOCKS);
    }
    return elif_blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEndif_block_sign()
  {
    return endif_block_sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEndif_block_sign(String newEndif_block_sign)
  {
    String oldEndif_block_sign = endif_block_sign;
    endif_block_sign = newEndif_block_sign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EIF_STATEMENT__ENDIF_BLOCK_SIGN, oldEndif_block_sign, endif_block_sign));
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
      case AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION:
        return basicSetIf_condition(null, msgs);
      case AnsibleDslPackage.EIF_STATEMENT__IF_BODY:
        return basicSetIf_body(null, msgs);
      case AnsibleDslPackage.EIF_STATEMENT__ELIF_BLOCKS:
        return ((InternalEList<?>)getElif_blocks()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EIF_STATEMENT__IF_BLOCK_SIGN:
        return getIf_block_sign();
      case AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION:
        return getIf_condition();
      case AnsibleDslPackage.EIF_STATEMENT__IF_BODY:
        return getIf_body();
      case AnsibleDslPackage.EIF_STATEMENT__ELIF_BLOCKS:
        return getElif_blocks();
      case AnsibleDslPackage.EIF_STATEMENT__ENDIF_BLOCK_SIGN:
        return getEndif_block_sign();
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
      case AnsibleDslPackage.EIF_STATEMENT__IF_BLOCK_SIGN:
        setIf_block_sign((String)newValue);
        return;
      case AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION:
        setIf_condition((EFilteredExpression)newValue);
        return;
      case AnsibleDslPackage.EIF_STATEMENT__IF_BODY:
        setIf_body((EValuePassed)newValue);
        return;
      case AnsibleDslPackage.EIF_STATEMENT__ELIF_BLOCKS:
        getElif_blocks().clear();
        getElif_blocks().addAll((Collection<? extends EElifBlock>)newValue);
        return;
      case AnsibleDslPackage.EIF_STATEMENT__ENDIF_BLOCK_SIGN:
        setEndif_block_sign((String)newValue);
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
      case AnsibleDslPackage.EIF_STATEMENT__IF_BLOCK_SIGN:
        setIf_block_sign(IF_BLOCK_SIGN_EDEFAULT);
        return;
      case AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION:
        setIf_condition((EFilteredExpression)null);
        return;
      case AnsibleDslPackage.EIF_STATEMENT__IF_BODY:
        setIf_body((EValuePassed)null);
        return;
      case AnsibleDslPackage.EIF_STATEMENT__ELIF_BLOCKS:
        getElif_blocks().clear();
        return;
      case AnsibleDslPackage.EIF_STATEMENT__ENDIF_BLOCK_SIGN:
        setEndif_block_sign(ENDIF_BLOCK_SIGN_EDEFAULT);
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
      case AnsibleDslPackage.EIF_STATEMENT__IF_BLOCK_SIGN:
        return IF_BLOCK_SIGN_EDEFAULT == null ? if_block_sign != null : !IF_BLOCK_SIGN_EDEFAULT.equals(if_block_sign);
      case AnsibleDslPackage.EIF_STATEMENT__IF_CONDITION:
        return if_condition != null;
      case AnsibleDslPackage.EIF_STATEMENT__IF_BODY:
        return if_body != null;
      case AnsibleDslPackage.EIF_STATEMENT__ELIF_BLOCKS:
        return elif_blocks != null && !elif_blocks.isEmpty();
      case AnsibleDslPackage.EIF_STATEMENT__ENDIF_BLOCK_SIGN:
        return ENDIF_BLOCK_SIGN_EDEFAULT == null ? endif_block_sign != null : !ENDIF_BLOCK_SIGN_EDEFAULT.equals(endif_block_sign);
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
    result.append(" (if_block_sign: ");
    result.append(if_block_sign);
    result.append(", endif_block_sign: ");
    result.append(endif_block_sign);
    result.append(')');
    return result.toString();
  }

} //EIfStatementImpl
