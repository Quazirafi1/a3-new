/**
 */
package com.a3.marketplace.model.marketplace;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.Product#getProductattribute <em>Productattribute</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.Product#getAttributemetadataspecification <em>Attributemetadataspecification</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.Product#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getProduct()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueProductAttribute'"
 * @generated
 */
public interface Product extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Productattribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.ProductAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productattribute</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getProduct_Productattribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductAttribute> getProductattribute();

	/**
	 * Returns the value of the '<em><b>Attributemetadataspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributemetadataspecification</em>' reference.
	 * @see #setAttributemetadataspecification(AttributeMetadataSpecification)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getProduct_Attributemetadataspecification()
	 * @model required="true"
	 * @generated
	 */
	AttributeMetadataSpecification getAttributemetadataspecification();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.Product#getAttributemetadataspecification <em>Attributemetadataspecification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributemetadataspecification</em>' reference.
	 * @see #getAttributemetadataspecification()
	 * @generated
	 */
	void setAttributemetadataspecification(AttributeMetadataSpecification value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getProduct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.attributemetadataspecification.attributemetadata-&gt;select(am | am.isOptional = false)-&gt;forAll(mandatoryAttribute | self.productattribute-&gt;exists(pa | pa.attributemetadata = mandatoryAttribute))'"
	 * @generated
	 */
	boolean EnsureMandatoryAttributePresenceInProduct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='productattribute.attributemetadata-&gt;asSet()-&gt;size() = productattribute-&gt;size()'"
	 * @generated
	 */
	boolean UniqueProductAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Product
