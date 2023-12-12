/**
 */
package com.a3.marketplace.model.marketplace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketplace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.Marketplace#getUser <em>User</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.Marketplace#getProductlisting <em>Productlisting</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.Marketplace#getProduct <em>Product</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.Marketplace#getAttributemetadataspecification <em>Attributemetadataspecification</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.Marketplace#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMarketplace()
 * @model
 * @generated
 */
public interface Marketplace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMarketplace_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Productlisting</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.ProductListing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productlisting</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMarketplace_Productlisting()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductListing> getProductlisting();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMarketplace_Product()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProduct();

	/**
	 * Returns the value of the '<em><b>Attributemetadataspecification</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributemetadataspecification</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMarketplace_Attributemetadataspecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributeMetadataSpecification> getAttributemetadataspecification();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMarketplace_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Marketplace
