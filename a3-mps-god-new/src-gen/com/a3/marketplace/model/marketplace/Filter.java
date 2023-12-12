/**
 */
package com.a3.marketplace.model.marketplace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.Filter#getProductattribute <em>Productattribute</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends NamedElement, Action {
	/**
	 * Returns the value of the '<em><b>Productattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productattribute</em>' reference.
	 * @see #setProductattribute(ProductAttribute)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getFilter_Productattribute()
	 * @model required="true"
	 * @generated
	 */
	ProductAttribute getProductattribute();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.Filter#getProductattribute <em>Productattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productattribute</em>' reference.
	 * @see #getProductattribute()
	 * @generated
	 */
	void setProductattribute(ProductAttribute value);

} // Filter
