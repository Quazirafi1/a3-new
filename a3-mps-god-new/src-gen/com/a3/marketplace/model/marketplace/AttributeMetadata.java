/**
 */
package com.a3.marketplace.model.marketplace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.AttributeMetadata#getType <em>Type</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.AttributeMetadata#getDescription <em>Description</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.AttributeMetadata#isIsOptional <em>Is Optional</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttributeMetadata()
 * @model
 * @generated
 */
public interface AttributeMetadata extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.a3.marketplace.model.marketplace.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.a3.marketplace.model.marketplace.AttributeType
	 * @see #setType(AttributeType)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttributeMetadata_Type()
	 * @model
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.AttributeMetadata#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.a3.marketplace.model.marketplace.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttributeMetadata_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.AttributeMetadata#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttributeMetadata_IsOptional()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.AttributeMetadata#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

} // AttributeMetadata
