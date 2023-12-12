/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.AttributeMetadataSpecification;
import com.a3.marketplace.model.marketplace.MarketplacePackage;
import com.a3.marketplace.model.marketplace.Message;
import com.a3.marketplace.model.marketplace.MessageAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.MessageImpl#getAttributemetadataspecification <em>Attributemetadataspecification</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.MessageImpl#getMessageattribute <em>Messageattribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
	/**
	 * The cached value of the '{@link #getAttributemetadataspecification() <em>Attributemetadataspecification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributemetadataspecification()
	 * @generated
	 * @ordered
	 */
	protected AttributeMetadataSpecification attributemetadataspecification;

	/**
	 * The cached value of the '{@link #getMessageattribute() <em>Messageattribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageattribute()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageAttribute> messageattribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketplacePackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeMetadataSpecification getAttributemetadataspecification() {
		if (attributemetadataspecification != null && attributemetadataspecification.eIsProxy()) {
			InternalEObject oldAttributemetadataspecification = (InternalEObject) attributemetadataspecification;
			attributemetadataspecification = (AttributeMetadataSpecification) eResolveProxy(
					oldAttributemetadataspecification);
			if (attributemetadataspecification != oldAttributemetadataspecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MarketplacePackage.MESSAGE__ATTRIBUTEMETADATASPECIFICATION,
							oldAttributemetadataspecification, attributemetadataspecification));
			}
		}
		return attributemetadataspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMetadataSpecification basicGetAttributemetadataspecification() {
		return attributemetadataspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributemetadataspecification(AttributeMetadataSpecification newAttributemetadataspecification) {
		AttributeMetadataSpecification oldAttributemetadataspecification = attributemetadataspecification;
		attributemetadataspecification = newAttributemetadataspecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MarketplacePackage.MESSAGE__ATTRIBUTEMETADATASPECIFICATION, oldAttributemetadataspecification,
					attributemetadataspecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MessageAttribute> getMessageattribute() {
		if (messageattribute == null) {
			messageattribute = new EObjectContainmentEList<MessageAttribute>(MessageAttribute.class, this,
					MarketplacePackage.MESSAGE__MESSAGEATTRIBUTE);
		}
		return messageattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarketplacePackage.MESSAGE__MESSAGEATTRIBUTE:
			return ((InternalEList<?>) getMessageattribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarketplacePackage.MESSAGE__ATTRIBUTEMETADATASPECIFICATION:
			if (resolve)
				return getAttributemetadataspecification();
			return basicGetAttributemetadataspecification();
		case MarketplacePackage.MESSAGE__MESSAGEATTRIBUTE:
			return getMessageattribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MarketplacePackage.MESSAGE__ATTRIBUTEMETADATASPECIFICATION:
			setAttributemetadataspecification((AttributeMetadataSpecification) newValue);
			return;
		case MarketplacePackage.MESSAGE__MESSAGEATTRIBUTE:
			getMessageattribute().clear();
			getMessageattribute().addAll((Collection<? extends MessageAttribute>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MarketplacePackage.MESSAGE__ATTRIBUTEMETADATASPECIFICATION:
			setAttributemetadataspecification((AttributeMetadataSpecification) null);
			return;
		case MarketplacePackage.MESSAGE__MESSAGEATTRIBUTE:
			getMessageattribute().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MarketplacePackage.MESSAGE__ATTRIBUTEMETADATASPECIFICATION:
			return attributemetadataspecification != null;
		case MarketplacePackage.MESSAGE__MESSAGEATTRIBUTE:
			return messageattribute != null && !messageattribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageImpl
