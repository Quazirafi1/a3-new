/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.Action;
import com.a3.marketplace.model.marketplace.AttributeMetadataSpecification;
import com.a3.marketplace.model.marketplace.Marketplace;
import com.a3.marketplace.model.marketplace.MarketplacePackage;
import com.a3.marketplace.model.marketplace.Product;
import com.a3.marketplace.model.marketplace.ProductListing;
import com.a3.marketplace.model.marketplace.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marketplace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.MarketplaceImpl#getUser <em>User</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.MarketplaceImpl#getProductlisting <em>Productlisting</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.MarketplaceImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.MarketplaceImpl#getAttributemetadataspecification <em>Attributemetadataspecification</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.MarketplaceImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketplaceImpl extends NamedElementImpl implements Marketplace {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getProductlisting() <em>Productlisting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductlisting()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductListing> productlisting;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> product;

	/**
	 * The cached value of the '{@link #getAttributemetadataspecification() <em>Attributemetadataspecification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributemetadataspecification()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMetadataSpecification> attributemetadataspecification;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketplaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketplacePackage.Literals.MARKETPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, MarketplacePackage.MARKETPLACE__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductListing> getProductlisting() {
		if (productlisting == null) {
			productlisting = new EObjectContainmentEList<ProductListing>(ProductListing.class, this,
					MarketplacePackage.MARKETPLACE__PRODUCTLISTING);
		}
		return productlisting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<Product>(Product.class, this,
					MarketplacePackage.MARKETPLACE__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeMetadataSpecification> getAttributemetadataspecification() {
		if (attributemetadataspecification == null) {
			attributemetadataspecification = new EObjectContainmentEList<AttributeMetadataSpecification>(
					AttributeMetadataSpecification.class, this,
					MarketplacePackage.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION);
		}
		return attributemetadataspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, MarketplacePackage.MARKETPLACE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarketplacePackage.MARKETPLACE__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
		case MarketplacePackage.MARKETPLACE__PRODUCTLISTING:
			return ((InternalEList<?>) getProductlisting()).basicRemove(otherEnd, msgs);
		case MarketplacePackage.MARKETPLACE__PRODUCT:
			return ((InternalEList<?>) getProduct()).basicRemove(otherEnd, msgs);
		case MarketplacePackage.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION:
			return ((InternalEList<?>) getAttributemetadataspecification()).basicRemove(otherEnd, msgs);
		case MarketplacePackage.MARKETPLACE__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarketplacePackage.MARKETPLACE__USER:
			return getUser();
		case MarketplacePackage.MARKETPLACE__PRODUCTLISTING:
			return getProductlisting();
		case MarketplacePackage.MARKETPLACE__PRODUCT:
			return getProduct();
		case MarketplacePackage.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION:
			return getAttributemetadataspecification();
		case MarketplacePackage.MARKETPLACE__ACTION:
			return getAction();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MarketplacePackage.MARKETPLACE__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
			return;
		case MarketplacePackage.MARKETPLACE__PRODUCTLISTING:
			getProductlisting().clear();
			getProductlisting().addAll((Collection<? extends ProductListing>) newValue);
			return;
		case MarketplacePackage.MARKETPLACE__PRODUCT:
			getProduct().clear();
			getProduct().addAll((Collection<? extends Product>) newValue);
			return;
		case MarketplacePackage.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION:
			getAttributemetadataspecification().clear();
			getAttributemetadataspecification().addAll((Collection<? extends AttributeMetadataSpecification>) newValue);
			return;
		case MarketplacePackage.MARKETPLACE__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
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
		case MarketplacePackage.MARKETPLACE__USER:
			getUser().clear();
			return;
		case MarketplacePackage.MARKETPLACE__PRODUCTLISTING:
			getProductlisting().clear();
			return;
		case MarketplacePackage.MARKETPLACE__PRODUCT:
			getProduct().clear();
			return;
		case MarketplacePackage.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION:
			getAttributemetadataspecification().clear();
			return;
		case MarketplacePackage.MARKETPLACE__ACTION:
			getAction().clear();
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
		case MarketplacePackage.MARKETPLACE__USER:
			return user != null && !user.isEmpty();
		case MarketplacePackage.MARKETPLACE__PRODUCTLISTING:
			return productlisting != null && !productlisting.isEmpty();
		case MarketplacePackage.MARKETPLACE__PRODUCT:
			return product != null && !product.isEmpty();
		case MarketplacePackage.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION:
			return attributemetadataspecification != null && !attributemetadataspecification.isEmpty();
		case MarketplacePackage.MARKETPLACE__ACTION:
			return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MarketplaceImpl
