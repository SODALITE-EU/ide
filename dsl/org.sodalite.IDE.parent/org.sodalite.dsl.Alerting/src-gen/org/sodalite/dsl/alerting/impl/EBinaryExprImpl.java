/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.alerting.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.dsl.alerting.AlertingPackage;
import org.sodalite.dsl.alerting.EBinaryExpr;
import org.sodalite.dsl.alerting.EBinaryOperator;
import org.sodalite.dsl.alerting.EVectorExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBinary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.alerting.impl.EBinaryExprImpl#getLexpr <em>Lexpr</em>}</li>
 *   <li>{@link org.sodalite.dsl.alerting.impl.EBinaryExprImpl#getOper <em>Oper</em>}</li>
 *   <li>{@link org.sodalite.dsl.alerting.impl.EBinaryExprImpl#getRexpr <em>Rexpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBinaryExprImpl extends EVectorExprImpl implements EBinaryExpr
{
  /**
   * The cached value of the '{@link #getLexpr() <em>Lexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexpr()
   * @generated
   * @ordered
   */
  protected EVectorExpr lexpr;

  /**
   * The cached value of the '{@link #getOper() <em>Oper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOper()
   * @generated
   * @ordered
   */
  protected EBinaryOperator oper;

  /**
   * The cached value of the '{@link #getRexpr() <em>Rexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRexpr()
   * @generated
   * @ordered
   */
  protected EVectorExpr rexpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EBinaryExprImpl()
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
    return AlertingPackage.Literals.EBINARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EVectorExpr getLexpr()
  {
    return lexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLexpr(EVectorExpr newLexpr, NotificationChain msgs)
  {
    EVectorExpr oldLexpr = lexpr;
    lexpr = newLexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlertingPackage.EBINARY_EXPR__LEXPR, oldLexpr, newLexpr);
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
  public void setLexpr(EVectorExpr newLexpr)
  {
    if (newLexpr != lexpr)
    {
      NotificationChain msgs = null;
      if (lexpr != null)
        msgs = ((InternalEObject)lexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlertingPackage.EBINARY_EXPR__LEXPR, null, msgs);
      if (newLexpr != null)
        msgs = ((InternalEObject)newLexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlertingPackage.EBINARY_EXPR__LEXPR, null, msgs);
      msgs = basicSetLexpr(newLexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlertingPackage.EBINARY_EXPR__LEXPR, newLexpr, newLexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBinaryOperator getOper()
  {
    return oper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOper(EBinaryOperator newOper, NotificationChain msgs)
  {
    EBinaryOperator oldOper = oper;
    oper = newOper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlertingPackage.EBINARY_EXPR__OPER, oldOper, newOper);
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
  public void setOper(EBinaryOperator newOper)
  {
    if (newOper != oper)
    {
      NotificationChain msgs = null;
      if (oper != null)
        msgs = ((InternalEObject)oper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlertingPackage.EBINARY_EXPR__OPER, null, msgs);
      if (newOper != null)
        msgs = ((InternalEObject)newOper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlertingPackage.EBINARY_EXPR__OPER, null, msgs);
      msgs = basicSetOper(newOper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlertingPackage.EBINARY_EXPR__OPER, newOper, newOper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EVectorExpr getRexpr()
  {
    return rexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRexpr(EVectorExpr newRexpr, NotificationChain msgs)
  {
    EVectorExpr oldRexpr = rexpr;
    rexpr = newRexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlertingPackage.EBINARY_EXPR__REXPR, oldRexpr, newRexpr);
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
  public void setRexpr(EVectorExpr newRexpr)
  {
    if (newRexpr != rexpr)
    {
      NotificationChain msgs = null;
      if (rexpr != null)
        msgs = ((InternalEObject)rexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlertingPackage.EBINARY_EXPR__REXPR, null, msgs);
      if (newRexpr != null)
        msgs = ((InternalEObject)newRexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlertingPackage.EBINARY_EXPR__REXPR, null, msgs);
      msgs = basicSetRexpr(newRexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlertingPackage.EBINARY_EXPR__REXPR, newRexpr, newRexpr));
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
      case AlertingPackage.EBINARY_EXPR__LEXPR:
        return basicSetLexpr(null, msgs);
      case AlertingPackage.EBINARY_EXPR__OPER:
        return basicSetOper(null, msgs);
      case AlertingPackage.EBINARY_EXPR__REXPR:
        return basicSetRexpr(null, msgs);
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
      case AlertingPackage.EBINARY_EXPR__LEXPR:
        return getLexpr();
      case AlertingPackage.EBINARY_EXPR__OPER:
        return getOper();
      case AlertingPackage.EBINARY_EXPR__REXPR:
        return getRexpr();
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
      case AlertingPackage.EBINARY_EXPR__LEXPR:
        setLexpr((EVectorExpr)newValue);
        return;
      case AlertingPackage.EBINARY_EXPR__OPER:
        setOper((EBinaryOperator)newValue);
        return;
      case AlertingPackage.EBINARY_EXPR__REXPR:
        setRexpr((EVectorExpr)newValue);
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
      case AlertingPackage.EBINARY_EXPR__LEXPR:
        setLexpr((EVectorExpr)null);
        return;
      case AlertingPackage.EBINARY_EXPR__OPER:
        setOper((EBinaryOperator)null);
        return;
      case AlertingPackage.EBINARY_EXPR__REXPR:
        setRexpr((EVectorExpr)null);
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
      case AlertingPackage.EBINARY_EXPR__LEXPR:
        return lexpr != null;
      case AlertingPackage.EBINARY_EXPR__OPER:
        return oper != null;
      case AlertingPackage.EBINARY_EXPR__REXPR:
        return rexpr != null;
    }
    return super.eIsSet(featureID);
  }

} //EBinaryExprImpl