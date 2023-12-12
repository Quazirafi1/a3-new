/**
 */
package com.a3.marketplace.model.marketplace.util;

import com.a3.marketplace.model.marketplace.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage
 * @generated
 */
public class MarketplaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarketplacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketplaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MarketplacePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketplaceSwitch<Adapter> modelSwitch = new MarketplaceSwitch<Adapter>() {
		@Override
		public Adapter caseMarketplace(Marketplace object) {
			return createMarketplaceAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseUserAttribute(UserAttribute object) {
			return createUserAttributeAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseProductListing(ProductListing object) {
			return createProductListingAdapter();
		}

		@Override
		public Adapter caseProductListingAttribute(ProductListingAttribute object) {
			return createProductListingAttributeAdapter();
		}

		@Override
		public Adapter caseProduct(Product object) {
			return createProductAdapter();
		}

		@Override
		public Adapter caseProductAttribute(ProductAttribute object) {
			return createProductAttributeAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseMessageAttribute(MessageAttribute object) {
			return createMessageAttributeAdapter();
		}

		@Override
		public Adapter caseFilter(Filter object) {
			return createFilterAdapter();
		}

		@Override
		public Adapter caseAttributeMetadataSpecification(AttributeMetadataSpecification object) {
			return createAttributeMetadataSpecificationAdapter();
		}

		@Override
		public Adapter caseAttributeMetadata(AttributeMetadata object) {
			return createAttributeMetadataAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.Marketplace <em>Marketplace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.Marketplace
	 * @generated
	 */
	public Adapter createMarketplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.UserAttribute <em>User Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.UserAttribute
	 * @generated
	 */
	public Adapter createUserAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.ProductListing <em>Product Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.ProductListing
	 * @generated
	 */
	public Adapter createProductListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.ProductListingAttribute <em>Product Listing Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.ProductListingAttribute
	 * @generated
	 */
	public Adapter createProductListingAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.ProductAttribute <em>Product Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.ProductAttribute
	 * @generated
	 */
	public Adapter createProductAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.MessageAttribute <em>Message Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.MessageAttribute
	 * @generated
	 */
	public Adapter createMessageAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.AttributeMetadataSpecification <em>Attribute Metadata Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadataSpecification
	 * @generated
	 */
	public Adapter createAttributeMetadataSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.AttributeMetadata <em>Attribute Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.AttributeMetadata
	 * @generated
	 */
	public Adapter createAttributeMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.a3.marketplace.model.marketplace.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.a3.marketplace.model.marketplace.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MarketplaceAdapterFactory
