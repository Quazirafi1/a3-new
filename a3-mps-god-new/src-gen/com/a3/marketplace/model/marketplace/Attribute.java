/**
 */
package com.a3.marketplace.model.marketplace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.Attribute#getAttributemetadata <em>Attributemetadata</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributemetadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributemetadata</em>' reference.
	 * @see #setAttributemetadata(AttributeMetadata)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttribute_Attributemetadata()
	 * @model required="true"
	 * @generated
	 */
	AttributeMetadata getAttributemetadata();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.Attribute#getAttributemetadata <em>Attributemetadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributemetadata</em>' reference.
	 * @see #getAttributemetadata()
	 * @generated
	 */
	void setAttributemetadata(AttributeMetadata value);

} // Attribute
