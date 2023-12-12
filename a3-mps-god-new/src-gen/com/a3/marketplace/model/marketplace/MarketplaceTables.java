/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /com.a3.marketplace.model/model/marketplace.ecore
 * using:
 *   /com.a3.marketplace.model/model/marketplace.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package com.a3.marketplace.model.marketplace;

// import com.a3.marketplace.model.marketplace.MarketplacePackage;
// import com.a3.marketplace.model.marketplace.MarketplaceTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * MarketplaceTables provides the dispatch tables for the marketplace for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MarketplaceTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MarketplacePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_marketplace = IdManager.getNsURIPackageId("http://www.example.org/marketplace", null, MarketplacePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Action = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("Action", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AttributeMetadata = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("AttributeMetadata", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AttributeMetadataSpecification = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("AttributeMetadataSpecification", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Filter = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("Filter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Marketplace = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("Marketplace", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Message = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("Message", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MessageAttribute = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("MessageAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Product = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("Product", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProductAttribute = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("ProductAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProductListing = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("ProductListing", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProductListingAttribute = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("ProductListingAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_User = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("User", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UserAttribute = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getClassId("UserAttribute", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_AttributeType = MarketplaceTables.PACKid_http_c_s_s_www_example_org_s_marketplace.getEnumerationId("AttributeType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Attribute = TypeId.BAG.getSpecializedId(MarketplaceTables.CLSSid_Attribute, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Filter = TypeId.BAG.getSpecializedId(MarketplaceTables.CLSSid_Filter, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Message = TypeId.BAG.getSpecializedId(MarketplaceTables.CLSSid_Message, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Product = TypeId.BAG.getSpecializedId(MarketplaceTables.CLSSid_Product, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ProductListing = TypeId.BAG.getSpecializedId(MarketplaceTables.CLSSid_ProductListing, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_User = TypeId.BAG.getSpecializedId(MarketplaceTables.CLSSid_User, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Action = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_Action, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AttributeMetadata = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_AttributeMetadata, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AttributeMetadataSpecification = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_AttributeMetadataSpecification, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_MessageAttribute = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_MessageAttribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Product = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_Product, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProductAttribute = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_ProductAttribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProductListing = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_ProductListing, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProductListingAttribute = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_ProductListingAttribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_User = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_User, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_UserAttribute = TypeId.ORDERED_SET.getSpecializedId(MarketplaceTables.CLSSid_UserAttribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_AttributeMetadata = TypeId.SEQUENCE.getSpecializedId(MarketplaceTables.CLSSid_AttributeMetadata, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AttributeMetadata = TypeId.SET.getSpecializedId(MarketplaceTables.CLSSid_AttributeMetadata, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MarketplaceTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Action = new EcoreExecutorType(MarketplacePackage.Literals.ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(MarketplacePackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _AttributeMetadata = new EcoreExecutorType(MarketplacePackage.Literals.ATTRIBUTE_METADATA, PACKAGE, 0);
		public static final EcoreExecutorType _AttributeMetadataSpecification = new EcoreExecutorType(MarketplacePackage.Literals.ATTRIBUTE_METADATA_SPECIFICATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _AttributeType = new EcoreExecutorEnumeration(MarketplacePackage.Literals.ATTRIBUTE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Filter = new EcoreExecutorType(MarketplacePackage.Literals.FILTER, PACKAGE, 0);
		public static final EcoreExecutorType _Marketplace = new EcoreExecutorType(MarketplacePackage.Literals.MARKETPLACE, PACKAGE, 0);
		public static final EcoreExecutorType _Message = new EcoreExecutorType(MarketplacePackage.Literals.MESSAGE, PACKAGE, 0);
		public static final EcoreExecutorType _MessageAttribute = new EcoreExecutorType(MarketplacePackage.Literals.MESSAGE_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(MarketplacePackage.Literals.NAMED_ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Product = new EcoreExecutorType(MarketplacePackage.Literals.PRODUCT, PACKAGE, 0);
		public static final EcoreExecutorType _ProductAttribute = new EcoreExecutorType(MarketplacePackage.Literals.PRODUCT_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _ProductListing = new EcoreExecutorType(MarketplacePackage.Literals.PRODUCT_LISTING, PACKAGE, 0);
		public static final EcoreExecutorType _ProductListingAttribute = new EcoreExecutorType(MarketplacePackage.Literals.PRODUCT_LISTING_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _User = new EcoreExecutorType(MarketplacePackage.Literals.USER, PACKAGE, 0);
		public static final EcoreExecutorType _UserAttribute = new EcoreExecutorType(MarketplacePackage.Literals.USER_ATTRIBUTE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_Attribute,
			_AttributeMetadata,
			_AttributeMetadataSpecification,
			_AttributeType,
			_Filter,
			_Marketplace,
			_Message,
			_MessageAttribute,
			_NamedElement,
			_Product,
			_ProductAttribute,
			_ProductListing,
			_ProductListingAttribute,
			_User,
			_UserAttribute
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, MarketplaceTables.Types._Action);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, MarketplaceTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__NamedElement = new ExecutorFragment(Types._Attribute, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AttributeMetadata__AttributeMetadata = new ExecutorFragment(Types._AttributeMetadata, MarketplaceTables.Types._AttributeMetadata);
		private static final ExecutorFragment _AttributeMetadata__NamedElement = new ExecutorFragment(Types._AttributeMetadata, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _AttributeMetadata__OclAny = new ExecutorFragment(Types._AttributeMetadata, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AttributeMetadata__OclElement = new ExecutorFragment(Types._AttributeMetadata, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AttributeMetadataSpecification__AttributeMetadataSpecification = new ExecutorFragment(Types._AttributeMetadataSpecification, MarketplaceTables.Types._AttributeMetadataSpecification);
		private static final ExecutorFragment _AttributeMetadataSpecification__NamedElement = new ExecutorFragment(Types._AttributeMetadataSpecification, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _AttributeMetadataSpecification__OclAny = new ExecutorFragment(Types._AttributeMetadataSpecification, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AttributeMetadataSpecification__OclElement = new ExecutorFragment(Types._AttributeMetadataSpecification, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AttributeType__AttributeType = new ExecutorFragment(Types._AttributeType, MarketplaceTables.Types._AttributeType);
		private static final ExecutorFragment _AttributeType__OclAny = new ExecutorFragment(Types._AttributeType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AttributeType__OclElement = new ExecutorFragment(Types._AttributeType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AttributeType__OclEnumeration = new ExecutorFragment(Types._AttributeType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _AttributeType__OclType = new ExecutorFragment(Types._AttributeType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Filter__Action = new ExecutorFragment(Types._Filter, MarketplaceTables.Types._Action);
		private static final ExecutorFragment _Filter__Filter = new ExecutorFragment(Types._Filter, MarketplaceTables.Types._Filter);
		private static final ExecutorFragment _Filter__NamedElement = new ExecutorFragment(Types._Filter, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _Filter__OclAny = new ExecutorFragment(Types._Filter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Filter__OclElement = new ExecutorFragment(Types._Filter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Marketplace__Marketplace = new ExecutorFragment(Types._Marketplace, MarketplaceTables.Types._Marketplace);
		private static final ExecutorFragment _Marketplace__NamedElement = new ExecutorFragment(Types._Marketplace, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _Marketplace__OclAny = new ExecutorFragment(Types._Marketplace, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Marketplace__OclElement = new ExecutorFragment(Types._Marketplace, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Message__Action = new ExecutorFragment(Types._Message, MarketplaceTables.Types._Action);
		private static final ExecutorFragment _Message__Message = new ExecutorFragment(Types._Message, MarketplaceTables.Types._Message);
		private static final ExecutorFragment _Message__NamedElement = new ExecutorFragment(Types._Message, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _Message__OclAny = new ExecutorFragment(Types._Message, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Message__OclElement = new ExecutorFragment(Types._Message, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MessageAttribute__Attribute = new ExecutorFragment(Types._MessageAttribute, MarketplaceTables.Types._Attribute);
		private static final ExecutorFragment _MessageAttribute__MessageAttribute = new ExecutorFragment(Types._MessageAttribute, MarketplaceTables.Types._MessageAttribute);
		private static final ExecutorFragment _MessageAttribute__NamedElement = new ExecutorFragment(Types._MessageAttribute, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _MessageAttribute__OclAny = new ExecutorFragment(Types._MessageAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MessageAttribute__OclElement = new ExecutorFragment(Types._MessageAttribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Product__NamedElement = new ExecutorFragment(Types._Product, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _Product__OclAny = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Product__OclElement = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Product__Product = new ExecutorFragment(Types._Product, MarketplaceTables.Types._Product);

		private static final ExecutorFragment _ProductAttribute__Attribute = new ExecutorFragment(Types._ProductAttribute, MarketplaceTables.Types._Attribute);
		private static final ExecutorFragment _ProductAttribute__NamedElement = new ExecutorFragment(Types._ProductAttribute, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _ProductAttribute__OclAny = new ExecutorFragment(Types._ProductAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProductAttribute__OclElement = new ExecutorFragment(Types._ProductAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProductAttribute__ProductAttribute = new ExecutorFragment(Types._ProductAttribute, MarketplaceTables.Types._ProductAttribute);

		private static final ExecutorFragment _ProductListing__NamedElement = new ExecutorFragment(Types._ProductListing, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _ProductListing__OclAny = new ExecutorFragment(Types._ProductListing, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProductListing__OclElement = new ExecutorFragment(Types._ProductListing, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProductListing__ProductListing = new ExecutorFragment(Types._ProductListing, MarketplaceTables.Types._ProductListing);

		private static final ExecutorFragment _ProductListingAttribute__Attribute = new ExecutorFragment(Types._ProductListingAttribute, MarketplaceTables.Types._Attribute);
		private static final ExecutorFragment _ProductListingAttribute__NamedElement = new ExecutorFragment(Types._ProductListingAttribute, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _ProductListingAttribute__OclAny = new ExecutorFragment(Types._ProductListingAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProductListingAttribute__OclElement = new ExecutorFragment(Types._ProductListingAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProductListingAttribute__ProductListingAttribute = new ExecutorFragment(Types._ProductListingAttribute, MarketplaceTables.Types._ProductListingAttribute);

		private static final ExecutorFragment _User__NamedElement = new ExecutorFragment(Types._User, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _User__OclAny = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _User__OclElement = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _User__User = new ExecutorFragment(Types._User, MarketplaceTables.Types._User);

		private static final ExecutorFragment _UserAttribute__Attribute = new ExecutorFragment(Types._UserAttribute, MarketplaceTables.Types._Attribute);
		private static final ExecutorFragment _UserAttribute__NamedElement = new ExecutorFragment(Types._UserAttribute, MarketplaceTables.Types._NamedElement);
		private static final ExecutorFragment _UserAttribute__OclAny = new ExecutorFragment(Types._UserAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UserAttribute__OclElement = new ExecutorFragment(Types._UserAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UserAttribute__UserAttribute = new ExecutorFragment(Types._UserAttribute, MarketplaceTables.Types._UserAttribute);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Action__Marketplace__action = new ExecutorPropertyWithImplementation("Marketplace", Types._Action, 0, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.MARKETPLACE__ACTION));

		public static final ExecutorProperty _Attribute__attributemetadata = new EcoreExecutorProperty(MarketplacePackage.Literals.ATTRIBUTE__ATTRIBUTEMETADATA, Types._Attribute, 0);

		public static final ExecutorProperty _AttributeMetadata__description = new EcoreExecutorProperty(MarketplacePackage.Literals.ATTRIBUTE_METADATA__DESCRIPTION, Types._AttributeMetadata, 0);
		public static final ExecutorProperty _AttributeMetadata__isOptional = new EcoreExecutorProperty(MarketplacePackage.Literals.ATTRIBUTE_METADATA__IS_OPTIONAL, Types._AttributeMetadata, 1);
		public static final ExecutorProperty _AttributeMetadata__type = new EcoreExecutorProperty(MarketplacePackage.Literals.ATTRIBUTE_METADATA__TYPE, Types._AttributeMetadata, 2);
		public static final ExecutorProperty _AttributeMetadata__Attribute__attributemetadata = new ExecutorPropertyWithImplementation("Attribute", Types._AttributeMetadata, 3, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.ATTRIBUTE__ATTRIBUTEMETADATA));
		public static final ExecutorProperty _AttributeMetadata__AttributeMetadataSpecification__attributemetadata = new ExecutorPropertyWithImplementation("AttributeMetadataSpecification", Types._AttributeMetadata, 4, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA));

		public static final ExecutorProperty _AttributeMetadataSpecification__attributemetadata = new EcoreExecutorProperty(MarketplacePackage.Literals.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA, Types._AttributeMetadataSpecification, 0);
		public static final ExecutorProperty _AttributeMetadataSpecification__description = new EcoreExecutorProperty(MarketplacePackage.Literals.ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION, Types._AttributeMetadataSpecification, 1);
		public static final ExecutorProperty _AttributeMetadataSpecification__Marketplace__attributemetadataspecification = new ExecutorPropertyWithImplementation("Marketplace", Types._AttributeMetadataSpecification, 2, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION));
		public static final ExecutorProperty _AttributeMetadataSpecification__Message__attributemetadataspecification = new ExecutorPropertyWithImplementation("Message", Types._AttributeMetadataSpecification, 3, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.MESSAGE__ATTRIBUTEMETADATASPECIFICATION));
		public static final ExecutorProperty _AttributeMetadataSpecification__Product__attributemetadataspecification = new ExecutorPropertyWithImplementation("Product", Types._AttributeMetadataSpecification, 4, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.PRODUCT__ATTRIBUTEMETADATASPECIFICATION));
		public static final ExecutorProperty _AttributeMetadataSpecification__ProductListing__attributemetadataspecification = new ExecutorPropertyWithImplementation("ProductListing", Types._AttributeMetadataSpecification, 5, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.PRODUCT_LISTING__ATTRIBUTEMETADATASPECIFICATION));
		public static final ExecutorProperty _AttributeMetadataSpecification__User__attributemetadataspecification = new ExecutorPropertyWithImplementation("User", Types._AttributeMetadataSpecification, 6, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.USER__ATTRIBUTEMETADATASPECIFICATION));

		public static final ExecutorProperty _Filter__productattribute = new EcoreExecutorProperty(MarketplacePackage.Literals.FILTER__PRODUCTATTRIBUTE, Types._Filter, 0);

		public static final ExecutorProperty _Marketplace__action = new EcoreExecutorProperty(MarketplacePackage.Literals.MARKETPLACE__ACTION, Types._Marketplace, 0);
		public static final ExecutorProperty _Marketplace__attributemetadataspecification = new EcoreExecutorProperty(MarketplacePackage.Literals.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION, Types._Marketplace, 1);
		public static final ExecutorProperty _Marketplace__product = new EcoreExecutorProperty(MarketplacePackage.Literals.MARKETPLACE__PRODUCT, Types._Marketplace, 2);
		public static final ExecutorProperty _Marketplace__productlisting = new EcoreExecutorProperty(MarketplacePackage.Literals.MARKETPLACE__PRODUCTLISTING, Types._Marketplace, 3);
		public static final ExecutorProperty _Marketplace__user = new EcoreExecutorProperty(MarketplacePackage.Literals.MARKETPLACE__USER, Types._Marketplace, 4);

		public static final ExecutorProperty _Message__attributemetadataspecification = new EcoreExecutorProperty(MarketplacePackage.Literals.MESSAGE__ATTRIBUTEMETADATASPECIFICATION, Types._Message, 0);
		public static final ExecutorProperty _Message__messageattribute = new EcoreExecutorProperty(MarketplacePackage.Literals.MESSAGE__MESSAGEATTRIBUTE, Types._Message, 1);

		public static final ExecutorProperty _MessageAttribute__Message__messageattribute = new ExecutorPropertyWithImplementation("Message", Types._MessageAttribute, 0, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.MESSAGE__MESSAGEATTRIBUTE));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(MarketplacePackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Product__attributemetadataspecification = new EcoreExecutorProperty(MarketplacePackage.Literals.PRODUCT__ATTRIBUTEMETADATASPECIFICATION, Types._Product, 0);
		public static final ExecutorProperty _Product__description = new EcoreExecutorProperty(MarketplacePackage.Literals.PRODUCT__DESCRIPTION, Types._Product, 1);
		public static final ExecutorProperty _Product__productattribute = new EcoreExecutorProperty(MarketplacePackage.Literals.PRODUCT__PRODUCTATTRIBUTE, Types._Product, 2);
		public static final ExecutorProperty _Product__Marketplace__product = new ExecutorPropertyWithImplementation("Marketplace", Types._Product, 3, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.MARKETPLACE__PRODUCT));

		public static final ExecutorProperty _ProductAttribute__Filter__productattribute = new ExecutorPropertyWithImplementation("Filter", Types._ProductAttribute, 0, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.FILTER__PRODUCTATTRIBUTE));
		public static final ExecutorProperty _ProductAttribute__Product__productattribute = new ExecutorPropertyWithImplementation("Product", Types._ProductAttribute, 1, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.PRODUCT__PRODUCTATTRIBUTE));

		public static final ExecutorProperty _ProductListing__attributemetadataspecification = new EcoreExecutorProperty(MarketplacePackage.Literals.PRODUCT_LISTING__ATTRIBUTEMETADATASPECIFICATION, Types._ProductListing, 0);
		public static final ExecutorProperty _ProductListing__description = new EcoreExecutorProperty(MarketplacePackage.Literals.PRODUCT_LISTING__DESCRIPTION, Types._ProductListing, 1);
		public static final ExecutorProperty _ProductListing__productlistingattribute = new EcoreExecutorProperty(MarketplacePackage.Literals.PRODUCT_LISTING__PRODUCTLISTINGATTRIBUTE, Types._ProductListing, 2);
		public static final ExecutorProperty _ProductListing__Marketplace__productlisting = new ExecutorPropertyWithImplementation("Marketplace", Types._ProductListing, 3, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.MARKETPLACE__PRODUCTLISTING));

		public static final ExecutorProperty _ProductListingAttribute__ProductListing__productlistingattribute = new ExecutorPropertyWithImplementation("ProductListing", Types._ProductListingAttribute, 0, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.PRODUCT_LISTING__PRODUCTLISTINGATTRIBUTE));

		public static final ExecutorProperty _User__attributemetadataspecification = new EcoreExecutorProperty(MarketplacePackage.Literals.USER__ATTRIBUTEMETADATASPECIFICATION, Types._User, 0);
		public static final ExecutorProperty _User__description = new EcoreExecutorProperty(MarketplacePackage.Literals.USER__DESCRIPTION, Types._User, 1);
		public static final ExecutorProperty _User__userattribute = new EcoreExecutorProperty(MarketplacePackage.Literals.USER__USERATTRIBUTE, Types._User, 2);
		public static final ExecutorProperty _User__Marketplace__user = new ExecutorPropertyWithImplementation("Marketplace", Types._User, 3, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.MARKETPLACE__USER));

		public static final ExecutorProperty _UserAttribute__User__userattribute = new ExecutorPropertyWithImplementation("User", Types._UserAttribute, 0, new EcoreLibraryOppositeProperty(MarketplacePackage.Literals.USER__USERATTRIBUTE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__Action /* 2 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__NamedElement /* 2 */,
				Fragments._Attribute__Attribute /* 3 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AttributeMetadata =
			{
				Fragments._AttributeMetadata__OclAny /* 0 */,
				Fragments._AttributeMetadata__OclElement /* 1 */,
				Fragments._AttributeMetadata__NamedElement /* 2 */,
				Fragments._AttributeMetadata__AttributeMetadata /* 3 */
			};
		private static final int /*@NonNull*/ [] __AttributeMetadata = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AttributeMetadataSpecification =
			{
				Fragments._AttributeMetadataSpecification__OclAny /* 0 */,
				Fragments._AttributeMetadataSpecification__OclElement /* 1 */,
				Fragments._AttributeMetadataSpecification__NamedElement /* 2 */,
				Fragments._AttributeMetadataSpecification__AttributeMetadataSpecification /* 3 */
			};
		private static final int /*@NonNull*/ [] __AttributeMetadataSpecification = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AttributeType =
			{
				Fragments._AttributeType__OclAny /* 0 */,
				Fragments._AttributeType__OclElement /* 1 */,
				Fragments._AttributeType__OclType /* 2 */,
				Fragments._AttributeType__OclEnumeration /* 3 */,
				Fragments._AttributeType__AttributeType /* 4 */
			};
		private static final int /*@NonNull*/ [] __AttributeType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Filter =
			{
				Fragments._Filter__OclAny /* 0 */,
				Fragments._Filter__OclElement /* 1 */,
				Fragments._Filter__Action /* 2 */,
				Fragments._Filter__NamedElement /* 2 */,
				Fragments._Filter__Filter /* 3 */
			};
		private static final int /*@NonNull*/ [] __Filter = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Marketplace =
			{
				Fragments._Marketplace__OclAny /* 0 */,
				Fragments._Marketplace__OclElement /* 1 */,
				Fragments._Marketplace__NamedElement /* 2 */,
				Fragments._Marketplace__Marketplace /* 3 */
			};
		private static final int /*@NonNull*/ [] __Marketplace = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Message =
			{
				Fragments._Message__OclAny /* 0 */,
				Fragments._Message__OclElement /* 1 */,
				Fragments._Message__Action /* 2 */,
				Fragments._Message__NamedElement /* 2 */,
				Fragments._Message__Message /* 3 */
			};
		private static final int /*@NonNull*/ [] __Message = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MessageAttribute =
			{
				Fragments._MessageAttribute__OclAny /* 0 */,
				Fragments._MessageAttribute__OclElement /* 1 */,
				Fragments._MessageAttribute__NamedElement /* 2 */,
				Fragments._MessageAttribute__Attribute /* 3 */,
				Fragments._MessageAttribute__MessageAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __MessageAttribute = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Product =
			{
				Fragments._Product__OclAny /* 0 */,
				Fragments._Product__OclElement /* 1 */,
				Fragments._Product__NamedElement /* 2 */,
				Fragments._Product__Product /* 3 */
			};
		private static final int /*@NonNull*/ [] __Product = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProductAttribute =
			{
				Fragments._ProductAttribute__OclAny /* 0 */,
				Fragments._ProductAttribute__OclElement /* 1 */,
				Fragments._ProductAttribute__NamedElement /* 2 */,
				Fragments._ProductAttribute__Attribute /* 3 */,
				Fragments._ProductAttribute__ProductAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProductAttribute = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProductListing =
			{
				Fragments._ProductListing__OclAny /* 0 */,
				Fragments._ProductListing__OclElement /* 1 */,
				Fragments._ProductListing__NamedElement /* 2 */,
				Fragments._ProductListing__ProductListing /* 3 */
			};
		private static final int /*@NonNull*/ [] __ProductListing = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProductListingAttribute =
			{
				Fragments._ProductListingAttribute__OclAny /* 0 */,
				Fragments._ProductListingAttribute__OclElement /* 1 */,
				Fragments._ProductListingAttribute__NamedElement /* 2 */,
				Fragments._ProductListingAttribute__Attribute /* 3 */,
				Fragments._ProductListingAttribute__ProductListingAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProductListingAttribute = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _User =
			{
				Fragments._User__OclAny /* 0 */,
				Fragments._User__OclElement /* 1 */,
				Fragments._User__NamedElement /* 2 */,
				Fragments._User__User /* 3 */
			};
		private static final int /*@NonNull*/ [] __User = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UserAttribute =
			{
				Fragments._UserAttribute__OclAny /* 0 */,
				Fragments._UserAttribute__OclElement /* 1 */,
				Fragments._UserAttribute__NamedElement /* 2 */,
				Fragments._UserAttribute__Attribute /* 3 */,
				Fragments._UserAttribute__UserAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __UserAttribute = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._AttributeMetadata.initFragments(_AttributeMetadata, __AttributeMetadata);
			Types._AttributeMetadataSpecification.initFragments(_AttributeMetadataSpecification, __AttributeMetadataSpecification);
			Types._AttributeType.initFragments(_AttributeType, __AttributeType);
			Types._Filter.initFragments(_Filter, __Filter);
			Types._Marketplace.initFragments(_Marketplace, __Marketplace);
			Types._Message.initFragments(_Message, __Message);
			Types._MessageAttribute.initFragments(_MessageAttribute, __MessageAttribute);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Product.initFragments(_Product, __Product);
			Types._ProductAttribute.initFragments(_ProductAttribute, __ProductAttribute);
			Types._ProductListing.initFragments(_ProductListing, __ProductListing);
			Types._ProductListingAttribute.initFragments(_ProductListingAttribute, __ProductListingAttribute);
			Types._User.initFragments(_User, __User);
			Types._UserAttribute.initFragments(_UserAttribute, __UserAttribute);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadata__AttributeMetadata = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadata__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadata__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadata__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadataSpecification__AttributeMetadataSpecification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadataSpecification__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadataSpecification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeMetadataSpecification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AttributeType__AttributeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Filter__Filter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Filter__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Filter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Filter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Filter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Marketplace__Marketplace = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Marketplace__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Marketplace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Marketplace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Message__Message = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Message__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Message__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Message__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Message__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MessageAttribute__MessageAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageAttribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageAttribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Product__Product = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProductAttribute__ProductAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductAttribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductAttribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProductListing__ProductListing = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductListing__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductListing__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductListing__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProductListingAttribute__ProductListingAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductListingAttribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductListingAttribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductListingAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductListingAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _User__User = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UserAttribute__UserAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UserAttribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UserAttribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UserAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UserAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__NamedElement.initOperations(_Attribute__NamedElement);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._AttributeMetadata__AttributeMetadata.initOperations(_AttributeMetadata__AttributeMetadata);
			Fragments._AttributeMetadata__NamedElement.initOperations(_AttributeMetadata__NamedElement);
			Fragments._AttributeMetadata__OclAny.initOperations(_AttributeMetadata__OclAny);
			Fragments._AttributeMetadata__OclElement.initOperations(_AttributeMetadata__OclElement);

			Fragments._AttributeMetadataSpecification__AttributeMetadataSpecification.initOperations(_AttributeMetadataSpecification__AttributeMetadataSpecification);
			Fragments._AttributeMetadataSpecification__NamedElement.initOperations(_AttributeMetadataSpecification__NamedElement);
			Fragments._AttributeMetadataSpecification__OclAny.initOperations(_AttributeMetadataSpecification__OclAny);
			Fragments._AttributeMetadataSpecification__OclElement.initOperations(_AttributeMetadataSpecification__OclElement);

			Fragments._AttributeType__AttributeType.initOperations(_AttributeType__AttributeType);
			Fragments._AttributeType__OclAny.initOperations(_AttributeType__OclAny);
			Fragments._AttributeType__OclElement.initOperations(_AttributeType__OclElement);
			Fragments._AttributeType__OclEnumeration.initOperations(_AttributeType__OclEnumeration);
			Fragments._AttributeType__OclType.initOperations(_AttributeType__OclType);

			Fragments._Filter__Action.initOperations(_Filter__Action);
			Fragments._Filter__Filter.initOperations(_Filter__Filter);
			Fragments._Filter__NamedElement.initOperations(_Filter__NamedElement);
			Fragments._Filter__OclAny.initOperations(_Filter__OclAny);
			Fragments._Filter__OclElement.initOperations(_Filter__OclElement);

			Fragments._Marketplace__Marketplace.initOperations(_Marketplace__Marketplace);
			Fragments._Marketplace__NamedElement.initOperations(_Marketplace__NamedElement);
			Fragments._Marketplace__OclAny.initOperations(_Marketplace__OclAny);
			Fragments._Marketplace__OclElement.initOperations(_Marketplace__OclElement);

			Fragments._Message__Action.initOperations(_Message__Action);
			Fragments._Message__Message.initOperations(_Message__Message);
			Fragments._Message__NamedElement.initOperations(_Message__NamedElement);
			Fragments._Message__OclAny.initOperations(_Message__OclAny);
			Fragments._Message__OclElement.initOperations(_Message__OclElement);

			Fragments._MessageAttribute__Attribute.initOperations(_MessageAttribute__Attribute);
			Fragments._MessageAttribute__MessageAttribute.initOperations(_MessageAttribute__MessageAttribute);
			Fragments._MessageAttribute__NamedElement.initOperations(_MessageAttribute__NamedElement);
			Fragments._MessageAttribute__OclAny.initOperations(_MessageAttribute__OclAny);
			Fragments._MessageAttribute__OclElement.initOperations(_MessageAttribute__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Product__NamedElement.initOperations(_Product__NamedElement);
			Fragments._Product__OclAny.initOperations(_Product__OclAny);
			Fragments._Product__OclElement.initOperations(_Product__OclElement);
			Fragments._Product__Product.initOperations(_Product__Product);

			Fragments._ProductAttribute__Attribute.initOperations(_ProductAttribute__Attribute);
			Fragments._ProductAttribute__NamedElement.initOperations(_ProductAttribute__NamedElement);
			Fragments._ProductAttribute__OclAny.initOperations(_ProductAttribute__OclAny);
			Fragments._ProductAttribute__OclElement.initOperations(_ProductAttribute__OclElement);
			Fragments._ProductAttribute__ProductAttribute.initOperations(_ProductAttribute__ProductAttribute);

			Fragments._ProductListing__NamedElement.initOperations(_ProductListing__NamedElement);
			Fragments._ProductListing__OclAny.initOperations(_ProductListing__OclAny);
			Fragments._ProductListing__OclElement.initOperations(_ProductListing__OclElement);
			Fragments._ProductListing__ProductListing.initOperations(_ProductListing__ProductListing);

			Fragments._ProductListingAttribute__Attribute.initOperations(_ProductListingAttribute__Attribute);
			Fragments._ProductListingAttribute__NamedElement.initOperations(_ProductListingAttribute__NamedElement);
			Fragments._ProductListingAttribute__OclAny.initOperations(_ProductListingAttribute__OclAny);
			Fragments._ProductListingAttribute__OclElement.initOperations(_ProductListingAttribute__OclElement);
			Fragments._ProductListingAttribute__ProductListingAttribute.initOperations(_ProductListingAttribute__ProductListingAttribute);

			Fragments._User__NamedElement.initOperations(_User__NamedElement);
			Fragments._User__OclAny.initOperations(_User__OclAny);
			Fragments._User__OclElement.initOperations(_User__OclElement);
			Fragments._User__User.initOperations(_User__User);

			Fragments._UserAttribute__Attribute.initOperations(_UserAttribute__Attribute);
			Fragments._UserAttribute__NamedElement.initOperations(_UserAttribute__NamedElement);
			Fragments._UserAttribute__OclAny.initOperations(_UserAttribute__OclAny);
			Fragments._UserAttribute__OclElement.initOperations(_UserAttribute__OclElement);
			Fragments._UserAttribute__UserAttribute.initOperations(_UserAttribute__UserAttribute);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			MarketplaceTables.Properties._Attribute__attributemetadata,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AttributeMetadata = {
			MarketplaceTables.Properties._AttributeMetadata__description,
			MarketplaceTables.Properties._AttributeMetadata__isOptional,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MarketplaceTables.Properties._AttributeMetadata__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AttributeMetadataSpecification = {
			MarketplaceTables.Properties._AttributeMetadataSpecification__attributemetadata,
			MarketplaceTables.Properties._AttributeMetadataSpecification__description,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AttributeType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Filter = {
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MarketplaceTables.Properties._Filter__productattribute
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Marketplace = {
			MarketplaceTables.Properties._Marketplace__action,
			MarketplaceTables.Properties._Marketplace__attributemetadataspecification,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MarketplaceTables.Properties._Marketplace__product,
			MarketplaceTables.Properties._Marketplace__productlisting,
			MarketplaceTables.Properties._Marketplace__user
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Message = {
			MarketplaceTables.Properties._Message__attributemetadataspecification,
			MarketplaceTables.Properties._Message__messageattribute,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MessageAttribute = {
			MarketplaceTables.Properties._Attribute__attributemetadata,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Product = {
			MarketplaceTables.Properties._Product__attributemetadataspecification,
			MarketplaceTables.Properties._Product__description,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MarketplaceTables.Properties._Product__productattribute
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProductAttribute = {
			MarketplaceTables.Properties._Attribute__attributemetadata,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProductListing = {
			MarketplaceTables.Properties._ProductListing__attributemetadataspecification,
			MarketplaceTables.Properties._ProductListing__description,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MarketplaceTables.Properties._ProductListing__productlistingattribute
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProductListingAttribute = {
			MarketplaceTables.Properties._Attribute__attributemetadata,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			MarketplaceTables.Properties._User__attributemetadataspecification,
			MarketplaceTables.Properties._User__description,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MarketplaceTables.Properties._User__userattribute
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UserAttribute = {
			MarketplaceTables.Properties._Attribute__attributemetadata,
			MarketplaceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._AttributeMetadata__AttributeMetadata.initProperties(_AttributeMetadata);
			Fragments._AttributeMetadataSpecification__AttributeMetadataSpecification.initProperties(_AttributeMetadataSpecification);
			Fragments._AttributeType__AttributeType.initProperties(_AttributeType);
			Fragments._Filter__Filter.initProperties(_Filter);
			Fragments._Marketplace__Marketplace.initProperties(_Marketplace);
			Fragments._Message__Message.initProperties(_Message);
			Fragments._MessageAttribute__MessageAttribute.initProperties(_MessageAttribute);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Product__Product.initProperties(_Product);
			Fragments._ProductAttribute__ProductAttribute.initProperties(_ProductAttribute);
			Fragments._ProductListing__ProductListing.initProperties(_ProductListing);
			Fragments._ProductListingAttribute__ProductListingAttribute.initProperties(_ProductListingAttribute);
			Fragments._User__User.initProperties(_User);
			Fragments._UserAttribute__UserAttribute.initProperties(_UserAttribute);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _AttributeType__Integer = new EcoreExecutorEnumerationLiteral(MarketplacePackage.Literals.ATTRIBUTE_TYPE.getEEnumLiteral("Integer"), Types._AttributeType, 0);
		public static final EcoreExecutorEnumerationLiteral _AttributeType__Real = new EcoreExecutorEnumerationLiteral(MarketplacePackage.Literals.ATTRIBUTE_TYPE.getEEnumLiteral("Real"), Types._AttributeType, 1);
		public static final EcoreExecutorEnumerationLiteral _AttributeType__Boolean = new EcoreExecutorEnumerationLiteral(MarketplacePackage.Literals.ATTRIBUTE_TYPE.getEEnumLiteral("Boolean"), Types._AttributeType, 2);
		public static final EcoreExecutorEnumerationLiteral _AttributeType__String = new EcoreExecutorEnumerationLiteral(MarketplacePackage.Literals.ATTRIBUTE_TYPE.getEEnumLiteral("String"), Types._AttributeType, 3);
		public static final EcoreExecutorEnumerationLiteral _AttributeType__autoIncrement = new EcoreExecutorEnumerationLiteral(MarketplacePackage.Literals.ATTRIBUTE_TYPE.getEEnumLiteral("autoIncrement"), Types._AttributeType, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AttributeType = {
			_AttributeType__Integer,
			_AttributeType__Real,
			_AttributeType__Boolean,
			_AttributeType__String,
			_AttributeType__autoIncrement
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AttributeType.initLiterals(_AttributeType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MarketplaceTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MarketplaceTables();
	}

	private MarketplaceTables() {
		super(MarketplacePackage.eNS_URI);
	}
}
