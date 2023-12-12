/**
 */
package com.a3.marketplace.model.marketplace.util;

import com.a3.marketplace.model.marketplace.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage
 * @generated
 */
public class MarketplaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarketplacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketplaceSwitch() {
		if (modelPackage == null) {
			modelPackage = MarketplacePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MarketplacePackage.MARKETPLACE: {
			Marketplace marketplace = (Marketplace) theEObject;
			T result = caseMarketplace(marketplace);
			if (result == null)
				result = caseNamedElement(marketplace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = caseNamedElement(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.USER_ATTRIBUTE: {
			UserAttribute userAttribute = (UserAttribute) theEObject;
			T result = caseUserAttribute(userAttribute);
			if (result == null)
				result = caseAttribute(userAttribute);
			if (result == null)
				result = caseNamedElement(userAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = caseNamedElement(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.PRODUCT_LISTING: {
			ProductListing productListing = (ProductListing) theEObject;
			T result = caseProductListing(productListing);
			if (result == null)
				result = caseNamedElement(productListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.PRODUCT_LISTING_ATTRIBUTE: {
			ProductListingAttribute productListingAttribute = (ProductListingAttribute) theEObject;
			T result = caseProductListingAttribute(productListingAttribute);
			if (result == null)
				result = caseAttribute(productListingAttribute);
			if (result == null)
				result = caseNamedElement(productListingAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.PRODUCT: {
			Product product = (Product) theEObject;
			T result = caseProduct(product);
			if (result == null)
				result = caseNamedElement(product);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.PRODUCT_ATTRIBUTE: {
			ProductAttribute productAttribute = (ProductAttribute) theEObject;
			T result = caseProductAttribute(productAttribute);
			if (result == null)
				result = caseAttribute(productAttribute);
			if (result == null)
				result = caseNamedElement(productAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
			if (result == null)
				result = caseNamedElement(message);
			if (result == null)
				result = caseAction(message);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.MESSAGE_ATTRIBUTE: {
			MessageAttribute messageAttribute = (MessageAttribute) theEObject;
			T result = caseMessageAttribute(messageAttribute);
			if (result == null)
				result = caseAttribute(messageAttribute);
			if (result == null)
				result = caseNamedElement(messageAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.FILTER: {
			Filter filter = (Filter) theEObject;
			T result = caseFilter(filter);
			if (result == null)
				result = caseNamedElement(filter);
			if (result == null)
				result = caseAction(filter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION: {
			AttributeMetadataSpecification attributeMetadataSpecification = (AttributeMetadataSpecification) theEObject;
			T result = caseAttributeMetadataSpecification(attributeMetadataSpecification);
			if (result == null)
				result = caseNamedElement(attributeMetadataSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.ATTRIBUTE_METADATA: {
			AttributeMetadata attributeMetadata = (AttributeMetadata) theEObject;
			T result = caseAttributeMetadata(attributeMetadata);
			if (result == null)
				result = caseNamedElement(attributeMetadata);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarketplacePackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marketplace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marketplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketplace(Marketplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserAttribute(UserAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductListing(ProductListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Listing Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Listing Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductListingAttribute(ProductListingAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductAttribute(ProductAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageAttribute(MessageAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Metadata Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Metadata Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMetadataSpecification(AttributeMetadataSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMetadata(AttributeMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MarketplaceSwitch
