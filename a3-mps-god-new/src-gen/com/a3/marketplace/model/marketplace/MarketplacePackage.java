/**
 */
package com.a3.marketplace.model.marketplace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.a3.marketplace.model.marketplace.MarketplaceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MarketplacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "marketplace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/marketplace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "marketplace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarketplacePackage eINSTANCE = com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.NamedElementImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.MarketplaceImpl <em>Marketplace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplaceImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getMarketplace()
	 * @generated
	 */
	int MARKETPLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__USER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Productlisting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__PRODUCTLISTING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__PRODUCT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributemetadataspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Marketplace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Marketplace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.UserImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Userattribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributemetadataspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ATTRIBUTEMETADATASPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Ensure Mandatory Attribute Presence In User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_USER__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique User Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_USER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.AttributeImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributemetadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTEMETADATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.UserAttributeImpl <em>User Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.UserAttributeImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getUserAttribute()
	 * @generated
	 */
	int USER_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attributemetadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__ATTRIBUTEMETADATA = ATTRIBUTE__ATTRIBUTEMETADATA;

	/**
	 * The number of structural features of the '<em>User Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.ProductListingImpl <em>Product Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.ProductListingImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProductListing()
	 * @generated
	 */
	int PRODUCT_LISTING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Productlistingattribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING__PRODUCTLISTINGATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributemetadataspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING__ATTRIBUTEMETADATASPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Ensure Mandatory Attribute Presence In Product Listing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT_LISTING__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Unique Product Listing Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING___UNIQUE_PRODUCT_LISTING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.ProductListingAttributeImpl <em>Product Listing Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.ProductListingAttributeImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProductListingAttribute()
	 * @generated
	 */
	int PRODUCT_LISTING_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attributemetadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING_ATTRIBUTE__ATTRIBUTEMETADATA = ATTRIBUTE__ATTRIBUTEMETADATA;

	/**
	 * The number of structural features of the '<em>Product Listing Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product Listing Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LISTING_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.ProductImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Productattribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributemetadataspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ATTRIBUTEMETADATASPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Ensure Mandatory Attribute Presence In Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Unique Product Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___UNIQUE_PRODUCT_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.ProductAttributeImpl <em>Product Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.ProductAttributeImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProductAttribute()
	 * @generated
	 */
	int PRODUCT_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attributemetadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__ATTRIBUTEMETADATA = ATTRIBUTE__ATTRIBUTEMETADATA;

	/**
	 * The number of structural features of the '<em>Product Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.ActionImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.MessageImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributemetadataspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ATTRIBUTEMETADATASPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Messageattribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGEATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.MessageAttributeImpl <em>Message Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.MessageAttributeImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getMessageAttribute()
	 * @generated
	 */
	int MESSAGE_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attributemetadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__ATTRIBUTEMETADATA = ATTRIBUTE__ATTRIBUTEMETADATA;

	/**
	 * The number of structural features of the '<em>Message Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.FilterImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Productattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__PRODUCTATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.AttributeMetadataSpecificationImpl <em>Attribute Metadata Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.AttributeMetadataSpecificationImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttributeMetadataSpecification()
	 * @generated
	 */
	int ATTRIBUTE_METADATA_SPECIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributemetadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Metadata Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Unique Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_SPECIFICATION___UNIQUE_NAMES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Metadata Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_SPECIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.impl.AttributeMetadataImpl <em>Attribute Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.impl.AttributeMetadataImpl
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttributeMetadata()
	 * @generated
	 */
	int ATTRIBUTE_METADATA = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA__IS_OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_METADATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.a3.marketplace.model.marketplace.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.a3.marketplace.model.marketplace.AttributeType
	 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 15;

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.Marketplace <em>Marketplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketplace</em>'.
	 * @see com.a3.marketplace.model.marketplace.Marketplace
	 * @generated
	 */
	EClass getMarketplace();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.Marketplace#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see com.a3.marketplace.model.marketplace.Marketplace#getUser()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_User();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.Marketplace#getProductlisting <em>Productlisting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productlisting</em>'.
	 * @see com.a3.marketplace.model.marketplace.Marketplace#getProductlisting()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Productlisting();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.Marketplace#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see com.a3.marketplace.model.marketplace.Marketplace#getProduct()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Product();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.Marketplace#getAttributemetadataspecification <em>Attributemetadataspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributemetadataspecification</em>'.
	 * @see com.a3.marketplace.model.marketplace.Marketplace#getAttributemetadataspecification()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Attributemetadataspecification();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.Marketplace#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see com.a3.marketplace.model.marketplace.Marketplace#getAction()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Action();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see com.a3.marketplace.model.marketplace.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.User#getUserattribute <em>Userattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Userattribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.User#getUserattribute()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Userattribute();

	/**
	 * Returns the meta object for the reference '{@link com.a3.marketplace.model.marketplace.User#getAttributemetadataspecification <em>Attributemetadataspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributemetadataspecification</em>'.
	 * @see com.a3.marketplace.model.marketplace.User#getAttributemetadataspecification()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Attributemetadataspecification();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.User#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.a3.marketplace.model.marketplace.User#getDescription()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Description();

	/**
	 * Returns the meta object for the '{@link com.a3.marketplace.model.marketplace.User#EnsureMandatoryAttributePresenceInUser(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Ensure Mandatory Attribute Presence In User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ensure Mandatory Attribute Presence In User</em>' operation.
	 * @see com.a3.marketplace.model.marketplace.User#EnsureMandatoryAttributePresenceInUser(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__EnsureMandatoryAttributePresenceInUser__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.a3.marketplace.model.marketplace.User#UniqueUserAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique User Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique User Attribute</em>' operation.
	 * @see com.a3.marketplace.model.marketplace.User#UniqueUserAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__UniqueUserAttribute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.UserAttribute <em>User Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.UserAttribute
	 * @generated
	 */
	EClass getUserAttribute();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.a3.marketplace.model.marketplace.Attribute#getAttributemetadata <em>Attributemetadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributemetadata</em>'.
	 * @see com.a3.marketplace.model.marketplace.Attribute#getAttributemetadata()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attributemetadata();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.ProductListing <em>Product Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Listing</em>'.
	 * @see com.a3.marketplace.model.marketplace.ProductListing
	 * @generated
	 */
	EClass getProductListing();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.ProductListing#getProductlistingattribute <em>Productlistingattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productlistingattribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.ProductListing#getProductlistingattribute()
	 * @see #getProductListing()
	 * @generated
	 */
	EReference getProductListing_Productlistingattribute();

	/**
	 * Returns the meta object for the reference '{@link com.a3.marketplace.model.marketplace.ProductListing#getAttributemetadataspecification <em>Attributemetadataspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributemetadataspecification</em>'.
	 * @see com.a3.marketplace.model.marketplace.ProductListing#getAttributemetadataspecification()
	 * @see #getProductListing()
	 * @generated
	 */
	EReference getProductListing_Attributemetadataspecification();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.ProductListing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.a3.marketplace.model.marketplace.ProductListing#getDescription()
	 * @see #getProductListing()
	 * @generated
	 */
	EAttribute getProductListing_Description();

	/**
	 * Returns the meta object for the '{@link com.a3.marketplace.model.marketplace.ProductListing#EnsureMandatoryAttributePresenceInProductListing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Ensure Mandatory Attribute Presence In Product Listing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ensure Mandatory Attribute Presence In Product Listing</em>' operation.
	 * @see com.a3.marketplace.model.marketplace.ProductListing#EnsureMandatoryAttributePresenceInProductListing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProductListing__EnsureMandatoryAttributePresenceInProductListing__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.a3.marketplace.model.marketplace.ProductListing#UniqueProductListingAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Product Listing Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Product Listing Attribute</em>' operation.
	 * @see com.a3.marketplace.model.marketplace.ProductListing#UniqueProductListingAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProductListing__UniqueProductListingAttribute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.ProductListingAttribute <em>Product Listing Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Listing Attribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.ProductListingAttribute
	 * @generated
	 */
	EClass getProductListingAttribute();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.a3.marketplace.model.marketplace.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.Product#getProductattribute <em>Productattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productattribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.Product#getProductattribute()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Productattribute();

	/**
	 * Returns the meta object for the reference '{@link com.a3.marketplace.model.marketplace.Product#getAttributemetadataspecification <em>Attributemetadataspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributemetadataspecification</em>'.
	 * @see com.a3.marketplace.model.marketplace.Product#getAttributemetadataspecification()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Attributemetadataspecification();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.a3.marketplace.model.marketplace.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for the '{@link com.a3.marketplace.model.marketplace.Product#EnsureMandatoryAttributePresenceInProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Ensure Mandatory Attribute Presence In Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ensure Mandatory Attribute Presence In Product</em>' operation.
	 * @see com.a3.marketplace.model.marketplace.Product#EnsureMandatoryAttributePresenceInProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProduct__EnsureMandatoryAttributePresenceInProduct__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.a3.marketplace.model.marketplace.Product#UniqueProductAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Product Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Product Attribute</em>' operation.
	 * @see com.a3.marketplace.model.marketplace.Product#UniqueProductAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProduct__UniqueProductAttribute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.ProductAttribute <em>Product Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Attribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.ProductAttribute
	 * @generated
	 */
	EClass getProductAttribute();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.a3.marketplace.model.marketplace.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see com.a3.marketplace.model.marketplace.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link com.a3.marketplace.model.marketplace.Message#getAttributemetadataspecification <em>Attributemetadataspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributemetadataspecification</em>'.
	 * @see com.a3.marketplace.model.marketplace.Message#getAttributemetadataspecification()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Attributemetadataspecification();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.Message#getMessageattribute <em>Messageattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messageattribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.Message#getMessageattribute()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Messageattribute();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.MessageAttribute <em>Message Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Attribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.MessageAttribute
	 * @generated
	 */
	EClass getMessageAttribute();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see com.a3.marketplace.model.marketplace.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the reference '{@link com.a3.marketplace.model.marketplace.Filter#getProductattribute <em>Productattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Productattribute</em>'.
	 * @see com.a3.marketplace.model.marketplace.Filter#getProductattribute()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Productattribute();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification <em>Attribute Metadata Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Metadata Specification</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadataSpecification
	 * @generated
	 */
	EClass getAttributeMetadataSpecification();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#getDescription()
	 * @see #getAttributeMetadataSpecification()
	 * @generated
	 */
	EAttribute getAttributeMetadataSpecification_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#getAttributemetadata <em>Attributemetadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributemetadata</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#getAttributemetadata()
	 * @see #getAttributeMetadataSpecification()
	 * @generated
	 */
	EReference getAttributeMetadataSpecification_Attributemetadata();

	/**
	 * Returns the meta object for the '{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#uniqueNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Names</em>' operation.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadataSpecification#uniqueNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAttributeMetadataSpecification__UniqueNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.AttributeMetadata <em>Attribute Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Metadata</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadata
	 * @generated
	 */
	EClass getAttributeMetadata();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.AttributeMetadata#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadata#getType()
	 * @see #getAttributeMetadata()
	 * @generated
	 */
	EAttribute getAttributeMetadata_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.AttributeMetadata#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadata#getDescription()
	 * @see #getAttributeMetadata()
	 * @generated
	 */
	EAttribute getAttributeMetadata_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.AttributeMetadata#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadata#isIsOptional()
	 * @see #getAttributeMetadata()
	 * @generated
	 */
	EAttribute getAttributeMetadata_IsOptional();

	/**
	 * Returns the meta object for class '{@link com.a3.marketplace.model.marketplace.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.a3.marketplace.model.marketplace.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.a3.marketplace.model.marketplace.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.a3.marketplace.model.marketplace.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link com.a3.marketplace.model.marketplace.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see com.a3.marketplace.model.marketplace.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarketplaceFactory getMarketplaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.MarketplaceImpl <em>Marketplace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplaceImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getMarketplace()
		 * @generated
		 */
		EClass MARKETPLACE = eINSTANCE.getMarketplace();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__USER = eINSTANCE.getMarketplace_User();

		/**
		 * The meta object literal for the '<em><b>Productlisting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__PRODUCTLISTING = eINSTANCE.getMarketplace_Productlisting();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__PRODUCT = eINSTANCE.getMarketplace_Product();

		/**
		 * The meta object literal for the '<em><b>Attributemetadataspecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION = eINSTANCE
				.getMarketplace_Attributemetadataspecification();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__ACTION = eINSTANCE.getMarketplace_Action();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.UserImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Userattribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USERATTRIBUTE = eINSTANCE.getUser_Userattribute();

		/**
		 * The meta object literal for the '<em><b>Attributemetadataspecification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ATTRIBUTEMETADATASPECIFICATION = eINSTANCE.getUser_Attributemetadataspecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DESCRIPTION = eINSTANCE.getUser_Description();

		/**
		 * The meta object literal for the '<em><b>Ensure Mandatory Attribute Presence In User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_USER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__EnsureMandatoryAttributePresenceInUser__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique User Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UNIQUE_USER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__UniqueUserAttribute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.UserAttributeImpl <em>User Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.UserAttributeImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getUserAttribute()
		 * @generated
		 */
		EClass USER_ATTRIBUTE = eINSTANCE.getUserAttribute();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.AttributeImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributemetadata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTEMETADATA = eINSTANCE.getAttribute_Attributemetadata();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.ProductListingImpl <em>Product Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.ProductListingImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProductListing()
		 * @generated
		 */
		EClass PRODUCT_LISTING = eINSTANCE.getProductListing();

		/**
		 * The meta object literal for the '<em><b>Productlistingattribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_LISTING__PRODUCTLISTINGATTRIBUTE = eINSTANCE.getProductListing_Productlistingattribute();

		/**
		 * The meta object literal for the '<em><b>Attributemetadataspecification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_LISTING__ATTRIBUTEMETADATASPECIFICATION = eINSTANCE
				.getProductListing_Attributemetadataspecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_LISTING__DESCRIPTION = eINSTANCE.getProductListing_Description();

		/**
		 * The meta object literal for the '<em><b>Ensure Mandatory Attribute Presence In Product Listing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_LISTING___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT_LISTING__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProductListing__EnsureMandatoryAttributePresenceInProductListing__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Product Listing Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_LISTING___UNIQUE_PRODUCT_LISTING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProductListing__UniqueProductListingAttribute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.ProductListingAttributeImpl <em>Product Listing Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.ProductListingAttributeImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProductListingAttribute()
		 * @generated
		 */
		EClass PRODUCT_LISTING_ATTRIBUTE = eINSTANCE.getProductListingAttribute();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.ProductImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Productattribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCTATTRIBUTE = eINSTANCE.getProduct_Productattribute();

		/**
		 * The meta object literal for the '<em><b>Attributemetadataspecification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__ATTRIBUTEMETADATASPECIFICATION = eINSTANCE.getProduct_Attributemetadataspecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Ensure Mandatory Attribute Presence In Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_PRODUCT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProduct__EnsureMandatoryAttributePresenceInProduct__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Product Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___UNIQUE_PRODUCT_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProduct__UniqueProductAttribute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.ProductAttributeImpl <em>Product Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.ProductAttributeImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getProductAttribute()
		 * @generated
		 */
		EClass PRODUCT_ATTRIBUTE = eINSTANCE.getProductAttribute();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.ActionImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.MessageImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Attributemetadataspecification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ATTRIBUTEMETADATASPECIFICATION = eINSTANCE.getMessage_Attributemetadataspecification();

		/**
		 * The meta object literal for the '<em><b>Messageattribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MESSAGEATTRIBUTE = eINSTANCE.getMessage_Messageattribute();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.MessageAttributeImpl <em>Message Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.MessageAttributeImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getMessageAttribute()
		 * @generated
		 */
		EClass MESSAGE_ATTRIBUTE = eINSTANCE.getMessageAttribute();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.FilterImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Productattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__PRODUCTATTRIBUTE = eINSTANCE.getFilter_Productattribute();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.AttributeMetadataSpecificationImpl <em>Attribute Metadata Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.AttributeMetadataSpecificationImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttributeMetadataSpecification()
		 * @generated
		 */
		EClass ATTRIBUTE_METADATA_SPECIFICATION = eINSTANCE.getAttributeMetadataSpecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION = eINSTANCE
				.getAttributeMetadataSpecification_Description();

		/**
		 * The meta object literal for the '<em><b>Attributemetadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA = eINSTANCE
				.getAttributeMetadataSpecification_Attributemetadata();

		/**
		 * The meta object literal for the '<em><b>Unique Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_METADATA_SPECIFICATION___UNIQUE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAttributeMetadataSpecification__UniqueNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.AttributeMetadataImpl <em>Attribute Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.AttributeMetadataImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttributeMetadata()
		 * @generated
		 */
		EClass ATTRIBUTE_METADATA = eINSTANCE.getAttributeMetadata();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_METADATA__TYPE = eINSTANCE.getAttributeMetadata_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_METADATA__DESCRIPTION = eINSTANCE.getAttributeMetadata_Description();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_METADATA__IS_OPTIONAL = eINSTANCE.getAttributeMetadata_IsOptional();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.impl.NamedElementImpl
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.a3.marketplace.model.marketplace.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.a3.marketplace.model.marketplace.AttributeType
		 * @see com.a3.marketplace.model.marketplace.impl.MarketplacePackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

	}

} //MarketplacePackage
