/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.Action;
import com.a3.marketplace.model.marketplace.Attribute;
import com.a3.marketplace.model.marketplace.AttributeMetadata;
import com.a3.marketplace.model.marketplace.AttributeMetadataSpecification;
import com.a3.marketplace.model.marketplace.AttributeType;
import com.a3.marketplace.model.marketplace.Filter;
import com.a3.marketplace.model.marketplace.Marketplace;
import com.a3.marketplace.model.marketplace.MarketplaceFactory;
import com.a3.marketplace.model.marketplace.MarketplacePackage;
import com.a3.marketplace.model.marketplace.Message;
import com.a3.marketplace.model.marketplace.MessageAttribute;
import com.a3.marketplace.model.marketplace.NamedElement;
import com.a3.marketplace.model.marketplace.Product;
import com.a3.marketplace.model.marketplace.ProductAttribute;
import com.a3.marketplace.model.marketplace.ProductListing;
import com.a3.marketplace.model.marketplace.ProductListingAttribute;
import com.a3.marketplace.model.marketplace.User;
import com.a3.marketplace.model.marketplace.UserAttribute;

import com.a3.marketplace.model.marketplace.util.MarketplaceValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarketplacePackageImpl extends EPackageImpl implements MarketplacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketplaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productListingAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMetadataSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarketplacePackageImpl() {
		super(eNS_URI, MarketplaceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MarketplacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarketplacePackage init() {
		if (isInited)
			return (MarketplacePackage) EPackage.Registry.INSTANCE.getEPackage(MarketplacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMarketplacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MarketplacePackageImpl theMarketplacePackage = registeredMarketplacePackage instanceof MarketplacePackageImpl
				? (MarketplacePackageImpl) registeredMarketplacePackage
				: new MarketplacePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMarketplacePackage.createPackageContents();

		// Initialize created meta-data
		theMarketplacePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMarketplacePackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return MarketplaceValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMarketplacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarketplacePackage.eNS_URI, theMarketplacePackage);
		return theMarketplacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarketplace() {
		return marketplaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketplace_User() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketplace_Productlisting() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketplace_Product() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketplace_Attributemetadataspecification() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketplace_Action() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Userattribute() {
		return (EReference) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Attributemetadataspecification() {
		return (EReference) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Description() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__EnsureMandatoryAttributePresenceInUser__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__UniqueUserAttribute__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserAttribute() {
		return userAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Attributemetadata() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductListing() {
		return productListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductListing_Productlistingattribute() {
		return (EReference) productListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductListing_Attributemetadataspecification() {
		return (EReference) productListingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductListing_Description() {
		return (EAttribute) productListingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductListing__EnsureMandatoryAttributePresenceInProductListing__DiagnosticChain_Map() {
		return productListingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductListing__UniqueProductListingAttribute__DiagnosticChain_Map() {
		return productListingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductListingAttribute() {
		return productListingAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Productattribute() {
		return (EReference) productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Attributemetadataspecification() {
		return (EReference) productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Description() {
		return (EAttribute) productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__EnsureMandatoryAttributePresenceInProduct__DiagnosticChain_Map() {
		return productEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__UniqueProductAttribute__DiagnosticChain_Map() {
		return productEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAttribute() {
		return productAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Attributemetadataspecification() {
		return (EReference) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Messageattribute() {
		return (EReference) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageAttribute() {
		return messageAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_Productattribute() {
		return (EReference) filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeMetadataSpecification() {
		return attributeMetadataSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeMetadataSpecification_Description() {
		return (EAttribute) attributeMetadataSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeMetadataSpecification_Attributemetadata() {
		return (EReference) attributeMetadataSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttributeMetadataSpecification__UniqueNames__DiagnosticChain_Map() {
		return attributeMetadataSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeMetadata() {
		return attributeMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeMetadata_Type() {
		return (EAttribute) attributeMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeMetadata_Description() {
		return (EAttribute) attributeMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeMetadata_IsOptional() {
		return (EAttribute) attributeMetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketplaceFactory getMarketplaceFactory() {
		return (MarketplaceFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		marketplaceEClass = createEClass(MARKETPLACE);
		createEReference(marketplaceEClass, MARKETPLACE__USER);
		createEReference(marketplaceEClass, MARKETPLACE__PRODUCTLISTING);
		createEReference(marketplaceEClass, MARKETPLACE__PRODUCT);
		createEReference(marketplaceEClass, MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION);
		createEReference(marketplaceEClass, MARKETPLACE__ACTION);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__USERATTRIBUTE);
		createEReference(userEClass, USER__ATTRIBUTEMETADATASPECIFICATION);
		createEAttribute(userEClass, USER__DESCRIPTION);
		createEOperation(userEClass, USER___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_USER__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___UNIQUE_USER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);

		userAttributeEClass = createEClass(USER_ATTRIBUTE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTEMETADATA);

		productListingEClass = createEClass(PRODUCT_LISTING);
		createEReference(productListingEClass, PRODUCT_LISTING__PRODUCTLISTINGATTRIBUTE);
		createEReference(productListingEClass, PRODUCT_LISTING__ATTRIBUTEMETADATASPECIFICATION);
		createEAttribute(productListingEClass, PRODUCT_LISTING__DESCRIPTION);
		createEOperation(productListingEClass,
				PRODUCT_LISTING___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT_LISTING__DIAGNOSTICCHAIN_MAP);
		createEOperation(productListingEClass, PRODUCT_LISTING___UNIQUE_PRODUCT_LISTING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);

		productListingAttributeEClass = createEClass(PRODUCT_LISTING_ATTRIBUTE);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__PRODUCTATTRIBUTE);
		createEReference(productEClass, PRODUCT__ATTRIBUTEMETADATASPECIFICATION);
		createEAttribute(productEClass, PRODUCT__DESCRIPTION);
		createEOperation(productEClass, PRODUCT___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT__DIAGNOSTICCHAIN_MAP);
		createEOperation(productEClass, PRODUCT___UNIQUE_PRODUCT_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);

		productAttributeEClass = createEClass(PRODUCT_ATTRIBUTE);

		actionEClass = createEClass(ACTION);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__ATTRIBUTEMETADATASPECIFICATION);
		createEReference(messageEClass, MESSAGE__MESSAGEATTRIBUTE);

		messageAttributeEClass = createEClass(MESSAGE_ATTRIBUTE);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__PRODUCTATTRIBUTE);

		attributeMetadataSpecificationEClass = createEClass(ATTRIBUTE_METADATA_SPECIFICATION);
		createEAttribute(attributeMetadataSpecificationEClass, ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION);
		createEReference(attributeMetadataSpecificationEClass, ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA);
		createEOperation(attributeMetadataSpecificationEClass,
				ATTRIBUTE_METADATA_SPECIFICATION___UNIQUE_NAMES__DIAGNOSTICCHAIN_MAP);

		attributeMetadataEClass = createEClass(ATTRIBUTE_METADATA);
		createEAttribute(attributeMetadataEClass, ATTRIBUTE_METADATA__TYPE);
		createEAttribute(attributeMetadataEClass, ATTRIBUTE_METADATA__DESCRIPTION);
		createEAttribute(attributeMetadataEClass, ATTRIBUTE_METADATA__IS_OPTIONAL);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		marketplaceEClass.getESuperTypes().add(this.getNamedElement());
		userEClass.getESuperTypes().add(this.getNamedElement());
		userAttributeEClass.getESuperTypes().add(this.getAttribute());
		userAttributeEClass.getESuperTypes().add(this.getNamedElement());
		attributeEClass.getESuperTypes().add(this.getNamedElement());
		productListingEClass.getESuperTypes().add(this.getNamedElement());
		productListingAttributeEClass.getESuperTypes().add(this.getAttribute());
		productListingAttributeEClass.getESuperTypes().add(this.getNamedElement());
		productEClass.getESuperTypes().add(this.getNamedElement());
		productAttributeEClass.getESuperTypes().add(this.getAttribute());
		productAttributeEClass.getESuperTypes().add(this.getNamedElement());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		messageEClass.getESuperTypes().add(this.getAction());
		messageAttributeEClass.getESuperTypes().add(this.getAttribute());
		messageAttributeEClass.getESuperTypes().add(this.getNamedElement());
		filterEClass.getESuperTypes().add(this.getNamedElement());
		filterEClass.getESuperTypes().add(this.getAction());
		attributeMetadataSpecificationEClass.getESuperTypes().add(this.getNamedElement());
		attributeMetadataEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(marketplaceEClass, Marketplace.class, "Marketplace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarketplace_User(), this.getUser(), null, "user", null, 0, -1, Marketplace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketplace_Productlisting(), this.getProductListing(), null, "productlisting", null, 0, -1,
				Marketplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketplace_Product(), this.getProduct(), null, "product", null, 0, -1, Marketplace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketplace_Attributemetadataspecification(), this.getAttributeMetadataSpecification(), null,
				"attributemetadataspecification", null, 1, -1, Marketplace.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketplace_Action(), this.getAction(), null, "action", null, 0, -1, Marketplace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Userattribute(), this.getUserAttribute(), null, "userattribute", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Attributemetadataspecification(), this.getAttributeMetadataSpecification(), null,
				"attributemetadataspecification", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Description(), ecorePackage.getEString(), "description", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUser__EnsureMandatoryAttributePresenceInUser__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "EnsureMandatoryAttributePresenceInUser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__UniqueUserAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueUserAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userAttributeEClass, UserAttribute.class, "UserAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Attributemetadata(), this.getAttributeMetadata(), null, "attributemetadata", null,
				1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productListingEClass, ProductListing.class, "ProductListing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductListing_Productlistingattribute(), this.getProductListingAttribute(), null,
				"productlistingattribute", null, 0, -1, ProductListing.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductListing_Attributemetadataspecification(), this.getAttributeMetadataSpecification(),
				null, "attributemetadataspecification", null, 0, 1, ProductListing.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductListing_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ProductListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProductListing__EnsureMandatoryAttributePresenceInProductListing__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "EnsureMandatoryAttributePresenceInProductListing", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProductListing__UniqueProductListingAttribute__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UniqueProductListingAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productListingAttributeEClass, ProductListingAttribute.class, "ProductListingAttribute",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Productattribute(), this.getProductAttribute(), null, "productattribute", null, 0, -1,
				Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Attributemetadataspecification(), this.getAttributeMetadataSpecification(), null,
				"attributemetadataspecification", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Description(), ecorePackage.getEString(), "description", null, 0, 1, Product.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProduct__EnsureMandatoryAttributePresenceInProduct__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "EnsureMandatoryAttributePresenceInProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProduct__UniqueProductAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueProductAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productAttributeEClass, ProductAttribute.class, "ProductAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Attributemetadataspecification(), this.getAttributeMetadataSpecification(), null,
				"attributemetadataspecification", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Messageattribute(), this.getMessageAttribute(), null, "messageattribute", null, 0, -1,
				Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageAttributeEClass, MessageAttribute.class, "MessageAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Productattribute(), this.getProductAttribute(), null, "productattribute", null, 1, 1,
				Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeMetadataSpecificationEClass, AttributeMetadataSpecification.class,
				"AttributeMetadataSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeMetadataSpecification_Description(), ecorePackage.getEString(), "description", null,
				0, 1, AttributeMetadataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeMetadataSpecification_Attributemetadata(), this.getAttributeMetadata(), null,
				"attributemetadata", null, 0, -1, AttributeMetadataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAttributeMetadataSpecification__UniqueNames__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "uniqueNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeMetadataEClass, AttributeMetadata.class, "AttributeMetadata", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeMetadata_Type(), this.getAttributeType(), "type", null, 0, 1,
				AttributeMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMetadata_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				AttributeMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMetadata_IsOptional(), ecorePackage.getEBoolean(), "isOptional", null, 1, 1,
				AttributeMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.INTEGER);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.REAL);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.BOOLEAN);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.AUTO_INCREMENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(userEClass, source, new String[] { "constraints", "UniqueUserAttribute" });
		addAnnotation(productListingEClass, source, new String[] { "constraints", "UniqueProductListingAttribute" });
		addAnnotation(productEClass, source, new String[] { "constraints", "UniqueProductAttribute" });
		addAnnotation(attributeMetadataSpecificationEClass, source, new String[] { "constraints", "uniqueNames" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getUser__EnsureMandatoryAttributePresenceInUser__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.attributemetadataspecification.attributemetadata->select(am | am.isOptional = false)->forAll(mandatoryAttribute | self.userattribute->exists(pa | pa.attributemetadata = mandatoryAttribute))" });
		addAnnotation(getUser__UniqueUserAttribute__DiagnosticChain_Map(), source,
				new String[] { "body", "userattribute.attributemetadata->asSet()->size() = userattribute->size()" });
		addAnnotation(getProductListing__EnsureMandatoryAttributePresenceInProductListing__DiagnosticChain_Map(),
				source, new String[] { "body",
						"self.attributemetadataspecification.attributemetadata->select(am | am.isOptional = false)->forAll(mandatoryAttribute | self.productlistingattribute->exists(pa | pa.attributemetadata = mandatoryAttribute))" });
		addAnnotation(getProductListing__UniqueProductListingAttribute__DiagnosticChain_Map(), source, new String[] {
				"body",
				"productlistingattribute.attributemetadata->asSet()->size() = productlistingattribute->size()" });
		addAnnotation(getProduct__EnsureMandatoryAttributePresenceInProduct__DiagnosticChain_Map(), source,
				new String[] { "body",
						"self.attributemetadataspecification.attributemetadata->select(am | am.isOptional = false)->forAll(mandatoryAttribute | self.productattribute->exists(pa | pa.attributemetadata = mandatoryAttribute))" });
		addAnnotation(getProduct__UniqueProductAttribute__DiagnosticChain_Map(), source, new String[] { "body",
				"productattribute.attributemetadata->asSet()->size() = productattribute->size()" });
		addAnnotation(getAttributeMetadataSpecification__UniqueNames__DiagnosticChain_Map(), source,
				new String[] { "body", "attributemetadata.name->asSet()->size() = attributemetadata->size()" });
	}

} //MarketplacePackageImpl
