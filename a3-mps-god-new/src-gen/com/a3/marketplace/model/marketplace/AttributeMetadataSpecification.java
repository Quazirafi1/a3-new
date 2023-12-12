/**
 */
package com.a3.marketplace.model.marketplace;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Metadata Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#getDescription <em>Description</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#getAttributemetadata <em>Attributemetadata</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttributeMetadataSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueNames'"
 * @generated
 */
public interface AttributeMetadataSpecification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttributeMetadataSpecification_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attributemetadata</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.AttributeMetadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributemetadata</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getAttributeMetadataSpecification_Attributemetadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeMetadata> getAttributemetadata();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='attributemetadata.name-&gt;asSet()-&gt;size() = attributemetadata-&gt;size()'"
	 * @generated
	 */
	boolean uniqueNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AttributeMetadataSpecification
