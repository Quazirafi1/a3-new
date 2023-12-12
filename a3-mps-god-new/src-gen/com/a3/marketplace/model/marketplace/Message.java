/**
 */
package com.a3.marketplace.model.marketplace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.Message#getAttributemetadataspecification <em>Attributemetadataspecification</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.Message#getMessageattribute <em>Messageattribute</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends NamedElement, Action {
	/**
	 * Returns the value of the '<em><b>Attributemetadataspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributemetadataspecification</em>' reference.
	 * @see #setAttributemetadataspecification(AttributeMetadataSpecification)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMessage_Attributemetadataspecification()
	 * @model
	 * @generated
	 */
	AttributeMetadataSpecification getAttributemetadataspecification();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.Message#getAttributemetadataspecification <em>Attributemetadataspecification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributemetadataspecification</em>' reference.
	 * @see #getAttributemetadataspecification()
	 * @generated
	 */
	void setAttributemetadataspecification(AttributeMetadataSpecification value);

	/**
	 * Returns the value of the '<em><b>Messageattribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.MessageAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messageattribute</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getMessage_Messageattribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageAttribute> getMessageattribute();

} // Message
