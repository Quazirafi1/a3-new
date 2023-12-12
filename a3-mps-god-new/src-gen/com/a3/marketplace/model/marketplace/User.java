/**
 */
package com.a3.marketplace.model.marketplace;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.User#getUserattribute <em>Userattribute</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.User#getAttributemetadataspecification <em>Attributemetadataspecification</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.User#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getUser()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueUserAttribute'"
 * @generated
 */
public interface User extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Userattribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.a3.marketplace.model.marketplace.UserAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userattribute</em>' containment reference list.
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getUser_Userattribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserAttribute> getUserattribute();

	/**
	 * Returns the value of the '<em><b>Attributemetadataspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributemetadataspecification</em>' reference.
	 * @see #setAttributemetadataspecification(AttributeMetadataSpecification)
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getUser_Attributemetadataspecification()
	 * @model required="true"
	 * @generated
	 */
	AttributeMetadataSpecification getAttributemetadataspecification();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.User#getAttributemetadataspecification <em>Attributemetadataspecification</em>}' reference.
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
	 * @see com.a3.marketplace.model.marketplace.MarketplacePackage#getUser_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.a3.marketplace.model.marketplace.User#getDescription <em>Description</em>}' attribute.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.attributemetadataspecification.attributemetadata-&gt;select(am | am.isOptional = false)-&gt;forAll(mandatoryAttribute | self.userattribute-&gt;exists(pa | pa.attributemetadata = mandatoryAttribute))'"
	 * @generated
	 */
	boolean EnsureMandatoryAttributePresenceInUser(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='userattribute.attributemetadata-&gt;asSet()-&gt;size() = userattribute-&gt;size()'"
	 * @generated
	 */
	boolean UniqueUserAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

} // User
