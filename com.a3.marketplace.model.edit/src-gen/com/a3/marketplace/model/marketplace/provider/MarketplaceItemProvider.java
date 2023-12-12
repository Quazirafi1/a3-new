/**
 */
package com.a3.marketplace.model.marketplace.provider;

import com.a3.marketplace.model.marketplace.Marketplace;
import com.a3.marketplace.model.marketplace.MarketplaceFactory;
import com.a3.marketplace.model.marketplace.MarketplacePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.a3.marketplace.model.marketplace.Marketplace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MarketplaceItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketplaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MarketplacePackage.Literals.MARKETPLACE__USER);
			childrenFeatures.add(MarketplacePackage.Literals.MARKETPLACE__PRODUCTLISTING);
			childrenFeatures.add(MarketplacePackage.Literals.MARKETPLACE__PRODUCT);
			childrenFeatures.add(MarketplacePackage.Literals.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION);
			childrenFeatures.add(MarketplacePackage.Literals.MARKETPLACE__ACTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Marketplace.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Marketplace"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Marketplace) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Marketplace_type")
				: getString("_UI_Marketplace_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Marketplace.class)) {
		case MarketplacePackage.MARKETPLACE__USER:
		case MarketplacePackage.MARKETPLACE__PRODUCTLISTING:
		case MarketplacePackage.MARKETPLACE__PRODUCT:
		case MarketplacePackage.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION:
		case MarketplacePackage.MARKETPLACE__ACTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MarketplacePackage.Literals.MARKETPLACE__USER,
				MarketplaceFactory.eINSTANCE.createUser()));

		newChildDescriptors.add(createChildParameter(MarketplacePackage.Literals.MARKETPLACE__PRODUCTLISTING,
				MarketplaceFactory.eINSTANCE.createProductListing()));

		newChildDescriptors.add(createChildParameter(MarketplacePackage.Literals.MARKETPLACE__PRODUCT,
				MarketplaceFactory.eINSTANCE.createProduct()));

		newChildDescriptors
				.add(createChildParameter(MarketplacePackage.Literals.MARKETPLACE__ATTRIBUTEMETADATASPECIFICATION,
						MarketplaceFactory.eINSTANCE.createAttributeMetadataSpecification()));

		newChildDescriptors.add(createChildParameter(MarketplacePackage.Literals.MARKETPLACE__ACTION,
				MarketplaceFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(MarketplacePackage.Literals.MARKETPLACE__ACTION,
				MarketplaceFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(MarketplacePackage.Literals.MARKETPLACE__ACTION,
				MarketplaceFactory.eINSTANCE.createFilter()));
	}

}
