/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.Filter;
import com.a3.marketplace.model.marketplace.MarketplacePackage;
import com.a3.marketplace.model.marketplace.ProductAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.FilterImpl#getProductattribute <em>Productattribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends NamedElementImpl implements Filter {
	/**
	 * The cached value of the '{@link #getProductattribute() <em>Productattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductattribute()
	 * @generated
	 * @ordered
	 */
	protected ProductAttribute productattribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketplacePackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAttribute getProductattribute() {
		if (productattribute != null && productattribute.eIsProxy()) {
			InternalEObject oldProductattribute = (InternalEObject) productattribute;
			productattribute = (ProductAttribute) eResolveProxy(oldProductattribute);
			if (productattribute != oldProductattribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MarketplacePackage.FILTER__PRODUCTATTRIBUTE, oldProductattribute, productattribute));
			}
		}
		return productattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductAttribute basicGetProductattribute() {
		return productattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductattribute(ProductAttribute newProductattribute) {
		ProductAttribute oldProductattribute = productattribute;
		productattribute = newProductattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketplacePackage.FILTER__PRODUCTATTRIBUTE,
					oldProductattribute, productattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarketplacePackage.FILTER__PRODUCTATTRIBUTE:
			if (resolve)
				return getProductattribute();
			return basicGetProductattribute();
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
		case MarketplacePackage.FILTER__PRODUCTATTRIBUTE:
			setProductattribute((ProductAttribute) newValue);
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
		case MarketplacePackage.FILTER__PRODUCTATTRIBUTE:
			setProductattribute((ProductAttribute) null);
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
		case MarketplacePackage.FILTER__PRODUCTATTRIBUTE:
			return productattribute != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterImpl
