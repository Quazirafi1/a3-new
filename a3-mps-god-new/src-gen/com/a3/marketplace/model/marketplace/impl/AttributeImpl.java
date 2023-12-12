/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.Attribute;
import com.a3.marketplace.model.marketplace.AttributeMetadata;
import com.a3.marketplace.model.marketplace.MarketplacePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.AttributeImpl#getAttributemetadata <em>Attributemetadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends NamedElementImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getAttributemetadata() <em>Attributemetadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributemetadata()
	 * @generated
	 * @ordered
	 */
	protected AttributeMetadata attributemetadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketplacePackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeMetadata getAttributemetadata() {
		if (attributemetadata != null && attributemetadata.eIsProxy()) {
			InternalEObject oldAttributemetadata = (InternalEObject) attributemetadata;
			attributemetadata = (AttributeMetadata) eResolveProxy(oldAttributemetadata);
			if (attributemetadata != oldAttributemetadata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MarketplacePackage.ATTRIBUTE__ATTRIBUTEMETADATA, oldAttributemetadata, attributemetadata));
			}
		}
		return attributemetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMetadata basicGetAttributemetadata() {
		return attributemetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributemetadata(AttributeMetadata newAttributemetadata) {
		AttributeMetadata oldAttributemetadata = attributemetadata;
		attributemetadata = newAttributemetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketplacePackage.ATTRIBUTE__ATTRIBUTEMETADATA,
					oldAttributemetadata, attributemetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarketplacePackage.ATTRIBUTE__ATTRIBUTEMETADATA:
			if (resolve)
				return getAttributemetadata();
			return basicGetAttributemetadata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MarketplacePackage.ATTRIBUTE__ATTRIBUTEMETADATA:
			setAttributemetadata((AttributeMetadata) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case MarketplacePackage.ATTRIBUTE__ATTRIBUTEMETADATA:
			setAttributemetadata((AttributeMetadata) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MarketplacePackage.ATTRIBUTE__ATTRIBUTEMETADATA:
			return attributemetadata != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
