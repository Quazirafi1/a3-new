/**
 */
package com.a3.marketplace.model.marketplace.util;

import com.a3.marketplace.model.marketplace.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage
 * @generated
 */
public class MarketplaceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MarketplaceValidator INSTANCE = new MarketplaceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.a3.marketplace.model.marketplace";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ensure Mandatory Attribute Presence In User' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_USER = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique User Attribute' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__UNIQUE_USER_ATTRIBUTE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ensure Mandatory Attribute Presence In Product Listing' of 'Product Listing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_LISTING__ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT_LISTING = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Product Listing Attribute' of 'Product Listing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_LISTING__UNIQUE_PRODUCT_LISTING_ATTRIBUTE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ensure Mandatory Attribute Presence In Product' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Product Attribute' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__UNIQUE_PRODUCT_ATTRIBUTE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Names' of 'Attribute Metadata Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_METADATA_SPECIFICATION__UNIQUE_NAMES = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketplaceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return MarketplacePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case MarketplacePackage.MARKETPLACE:
			return validateMarketplace((Marketplace) value, diagnostics, context);
		case MarketplacePackage.USER:
			return validateUser((User) value, diagnostics, context);
		case MarketplacePackage.USER_ATTRIBUTE:
			return validateUserAttribute((UserAttribute) value, diagnostics, context);
		case MarketplacePackage.ATTRIBUTE:
			return validateAttribute((Attribute) value, diagnostics, context);
		case MarketplacePackage.PRODUCT_LISTING:
			return validateProductListing((ProductListing) value, diagnostics, context);
		case MarketplacePackage.PRODUCT_LISTING_ATTRIBUTE:
			return validateProductListingAttribute((ProductListingAttribute) value, diagnostics, context);
		case MarketplacePackage.PRODUCT:
			return validateProduct((Product) value, diagnostics, context);
		case MarketplacePackage.PRODUCT_ATTRIBUTE:
			return validateProductAttribute((ProductAttribute) value, diagnostics, context);
		case MarketplacePackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case MarketplacePackage.MESSAGE:
			return validateMessage((Message) value, diagnostics, context);
		case MarketplacePackage.MESSAGE_ATTRIBUTE:
			return validateMessageAttribute((MessageAttribute) value, diagnostics, context);
		case MarketplacePackage.FILTER:
			return validateFilter((Filter) value, diagnostics, context);
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION:
			return validateAttributeMetadataSpecification((AttributeMetadataSpecification) value, diagnostics, context);
		case MarketplacePackage.ATTRIBUTE_METADATA:
			return validateAttributeMetadata((AttributeMetadata) value, diagnostics, context);
		case MarketplacePackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case MarketplacePackage.ATTRIBUTE_TYPE:
			return validateAttributeType((AttributeType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarketplace(Marketplace marketplace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(marketplace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_UniqueUserAttribute(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_EnsureMandatoryAttributePresenceInUser(user, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueUserAttribute constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_UniqueUserAttribute(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return user.UniqueUserAttribute(diagnostics, context);
	}

	/**
	 * Validates the EnsureMandatoryAttributePresenceInUser constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_EnsureMandatoryAttributePresenceInUser(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return user.EnsureMandatoryAttributePresenceInUser(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserAttribute(UserAttribute userAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductListing(ProductListing productListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductListing_UniqueProductListingAttribute(productListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductListing_EnsureMandatoryAttributePresenceInProductListing(productListing,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueProductListingAttribute constraint of '<em>Product Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductListing_UniqueProductListingAttribute(ProductListing productListing,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productListing.UniqueProductListingAttribute(diagnostics, context);
	}

	/**
	 * Validates the EnsureMandatoryAttributePresenceInProductListing constraint of '<em>Product Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductListing_EnsureMandatoryAttributePresenceInProductListing(
			ProductListing productListing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productListing.EnsureMandatoryAttributePresenceInProductListing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductListingAttribute(ProductListingAttribute productListingAttribute,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productListingAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(product, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProduct_UniqueProductAttribute(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProduct_EnsureMandatoryAttributePresenceInProduct(product, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueProductAttribute constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_UniqueProductAttribute(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.UniqueProductAttribute(diagnostics, context);
	}

	/**
	 * Validates the EnsureMandatoryAttributePresenceInProduct constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_EnsureMandatoryAttributePresenceInProduct(Product product,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.EnsureMandatoryAttributePresenceInProduct(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductAttribute(ProductAttribute productAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageAttribute(MessageAttribute messageAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMetadataSpecification(AttributeMetadataSpecification attributeMetadataSpecification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeMetadataSpecification, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(attributeMetadataSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(attributeMetadataSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(attributeMetadataSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(attributeMetadataSpecification, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(attributeMetadataSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(attributeMetadataSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(attributeMetadataSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(attributeMetadataSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAttributeMetadataSpecification_uniqueNames(attributeMetadataSpecification, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the uniqueNames constraint of '<em>Attribute Metadata Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMetadataSpecification_uniqueNames(
			AttributeMetadataSpecification attributeMetadataSpecification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return attributeMetadataSpecification.uniqueNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMetadata(AttributeMetadata attributeMetadata, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MarketplaceValidator
