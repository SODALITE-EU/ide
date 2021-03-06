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

import org.sodalite.dsl.rM.EArtifactTypeBody;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EArtifact Type Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EArtifactTypeBodyImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EArtifactTypeBodyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EArtifactTypeBodyImpl#getMime_type <em>Mime type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EArtifactTypeBodyImpl#getFile_ext <em>File ext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EArtifactTypeBodyImpl extends MinimalEObjectImpl.Container implements EArtifactTypeBody
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE superType;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMime_type() <em>Mime type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMime_type()
   * @generated
   * @ordered
   */
  protected static final String MIME_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMime_type() <em>Mime type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMime_type()
   * @generated
   * @ordered
   */
  protected String mime_type = MIME_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getFile_ext() <em>File ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile_ext()
   * @generated
   * @ordered
   */
  protected static final String FILE_EXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFile_ext() <em>File ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile_ext()
   * @generated
   * @ordered
   */
  protected String file_ext = FILE_EXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EArtifactTypeBodyImpl()
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
    return RMPackage.Literals.EARTIFACT_TYPE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(EPREFIX_TYPE newSuperType, NotificationChain msgs)
  {
    EPREFIX_TYPE oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE, oldSuperType, newSuperType);
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
  public void setSuperType(EPREFIX_TYPE newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE, newSuperType, newSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EARTIFACT_TYPE_BODY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMime_type()
  {
    return mime_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMime_type(String newMime_type)
  {
    String oldMime_type = mime_type;
    mime_type = newMime_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EARTIFACT_TYPE_BODY__MIME_TYPE, oldMime_type, mime_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFile_ext()
  {
    return file_ext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile_ext(String newFile_ext)
  {
    String oldFile_ext = file_ext;
    file_ext = newFile_ext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EARTIFACT_TYPE_BODY__FILE_EXT, oldFile_ext, file_ext));
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
      case RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
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
      case RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE:
        return getSuperType();
      case RMPackage.EARTIFACT_TYPE_BODY__DESCRIPTION:
        return getDescription();
      case RMPackage.EARTIFACT_TYPE_BODY__MIME_TYPE:
        return getMime_type();
      case RMPackage.EARTIFACT_TYPE_BODY__FILE_EXT:
        return getFile_ext();
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
      case RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE:
        setSuperType((EPREFIX_TYPE)newValue);
        return;
      case RMPackage.EARTIFACT_TYPE_BODY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RMPackage.EARTIFACT_TYPE_BODY__MIME_TYPE:
        setMime_type((String)newValue);
        return;
      case RMPackage.EARTIFACT_TYPE_BODY__FILE_EXT:
        setFile_ext((String)newValue);
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
      case RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE:
        setSuperType((EPREFIX_TYPE)null);
        return;
      case RMPackage.EARTIFACT_TYPE_BODY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RMPackage.EARTIFACT_TYPE_BODY__MIME_TYPE:
        setMime_type(MIME_TYPE_EDEFAULT);
        return;
      case RMPackage.EARTIFACT_TYPE_BODY__FILE_EXT:
        setFile_ext(FILE_EXT_EDEFAULT);
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
      case RMPackage.EARTIFACT_TYPE_BODY__SUPER_TYPE:
        return superType != null;
      case RMPackage.EARTIFACT_TYPE_BODY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RMPackage.EARTIFACT_TYPE_BODY__MIME_TYPE:
        return MIME_TYPE_EDEFAULT == null ? mime_type != null : !MIME_TYPE_EDEFAULT.equals(mime_type);
      case RMPackage.EARTIFACT_TYPE_BODY__FILE_EXT:
        return FILE_EXT_EDEFAULT == null ? file_ext != null : !FILE_EXT_EDEFAULT.equals(file_ext);
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
    result.append(" (description: ");
    result.append(description);
    result.append(", mime_type: ");
    result.append(mime_type);
    result.append(", file_ext: ");
    result.append(file_ext);
    result.append(')');
    return result.toString();
  }

} //EArtifactTypeBodyImpl
