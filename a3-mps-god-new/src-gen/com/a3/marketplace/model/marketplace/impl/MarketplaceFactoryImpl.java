/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarketplaceFactoryImpl extends EFactoryImpl implements MarketplaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MarketplaceFactory init() {
		try {
			MarketplaceFactory theMarketplaceFactory = (MarketplaceFactory) EPackage.Registry.INSTANCE
					.getEFactory(MarketplacePackage.eNS_URI);
			if (theMarketplaceFactory != null) {
				return theMarketplaceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarketplaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketplaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MarketplacePackage.MARKETPLACE:
			return createMarketplace();
		case MarketplacePackage.USER:
			return createUser();
		case MarketplacePackage.USER_ATTRIBUTE:
			return createUserAttribute();
		case MarketplacePackage.ATTRIBUTE:
			return createAttribute();
		case MarketplacePackage.PRODUCT_LISTING:
			return createProductListing();
		case MarketplacePackage.PRODUCT_LISTING_ATTRIBUTE:
			return createProductListingAttribute();
		case MarketplacePackage.PRODUCT:
			return createProduct();
		case MarketplacePackage.PRODUCT_ATTRIBUTE:
			return createProductAttribute();
		case MarketplacePackage.ACTION:
			return createAction();
		case MarketplacePackage.MESSAGE:
			return createMessage();
		case MarketplacePackage.MESSAGE_ATTRIBUTE:
			return createMessageAttribute();
		case MarketplacePackage.FILTER:
			return createFilter();
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION:
			return createAttributeMetadataSpecification();
		case MarketplacePackage.ATTRIBUTE_METADATA:
			return createAttributeMetadata();
		case MarketplacePackage.NAMED_ELEMENT:
			return createNamedElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MarketplacePackage.ATTRIBUTE_TYPE:
			return createAttributeTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MarketplacePackage.ATTRIBUTE_TYPE:
			return convertAttributeTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marketplace createMarketplace() {
		MarketplaceImpl marketplace = new MarketplaceImpl();
		return marketplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAttribute createUserAttribute() {
		UserAttributeImpl userAttribute = new UserAttributeImpl();
		return userAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductListing createProductListing() {
		ProductListingImpl productListing = new ProductListingImpl();
		return productListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductListingAttribute createProductListingAttribute() {
		ProductListingAttributeImpl productListingAttribute = new ProductListingAttributeImpl();
		return productListingAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAttribute createProductAttribute() {
		ProductAttributeImpl productAttribute = new ProductAttributeImpl();
		return productAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageAttribute createMessageAttribute() {
		MessageAttributeImpl messageAttribute = new MessageAttributeImpl();
		return messageAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeMetadataSpecification createAttributeMetadataSpecification() {
		AttributeMetadataSpecificationImpl attributeMetadataSpecification = new AttributeMetadataSpecificationImpl();
		return attributeMetadataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeMetadata createAttributeMetadata() {
		AttributeMetadataImpl attributeMetadata = new AttributeMetadataImpl();
		return attributeMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketplacePackage getMarketplacePackage() {
		return (MarketplacePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarketplacePackage getPackage() {
		return MarketplacePackage.eINSTANCE;
	}

} //MarketplaceFactoryImpl
