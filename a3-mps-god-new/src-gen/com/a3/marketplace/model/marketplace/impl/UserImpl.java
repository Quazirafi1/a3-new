/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.AttributeMetadata;
import com.a3.marketplace.model.marketplace.AttributeMetadataSpecification;
import com.a3.marketplace.model.marketplace.MarketplacePackage;
import com.a3.marketplace.model.marketplace.MarketplaceTables;
import com.a3.marketplace.model.marketplace.User;
import com.a3.marketplace.model.marketplace.UserAttribute;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.UserImpl#getUserattribute <em>Userattribute</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.UserImpl#getAttributemetadataspecification <em>Attributemetadataspecification</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.UserImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends NamedElementImpl implements User {
	/**
	 * The cached value of the '{@link #getUserattribute() <em>Userattribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserattribute()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userattribute;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketplacePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserAttribute> getUserattribute() {
		if (userattribute == null) {
			userattribute = new EObjectContainmentEList<UserAttribute>(UserAttribute.class, this,
					MarketplacePackage.USER__USERATTRIBUTE);
		}
		return userattribute;
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
							MarketplacePackage.USER__ATTRIBUTEMETADATASPECIFICATION, oldAttributemetadataspecification,
							attributemetadataspecification));
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
					MarketplacePackage.USER__ATTRIBUTEMETADATASPECIFICATION, oldAttributemetadataspecification,
					attributemetadataspecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketplacePackage.USER__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean EnsureMandatoryAttributePresenceInUser(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "User::EnsureMandatoryAttributePresenceInUser";
		try {
			/**
			 *
			 * inv EnsureMandatoryAttributePresenceInUser:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.attributemetadataspecification.attributemetadata->select(am | am.isOptional = false)
			 *         ->forAll(mandatoryAttribute |
			 *           self.userattribute->exists(pa | pa.attributemetadata = mandatoryAttribute))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					MarketplacePackage.Literals.USER___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_USER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, MarketplaceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ AttributeMetadataSpecification attributemetadataspecification = this
							.getAttributemetadataspecification();
					final /*@NonInvalid*/ List<AttributeMetadata> attributemetadata = attributemetadataspecification
							.getAttributemetadata();
					final /*@NonInvalid*/ OrderedSetValue BOXED_attributemetadata = idResolver
							.createOrderedSetOfAll(MarketplaceTables.ORD_CLSSid_AttributeMetadata, attributemetadata);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(MarketplaceTables.ORD_CLSSid_AttributeMetadata);
					Iterator<Object> ITERATOR_am = BOXED_attributemetadata.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_am.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ AttributeMetadata am = (AttributeMetadata) ITERATOR_am.next();
						/**
						 * am.isOptional = false
						 */
						final /*@NonInvalid*/ boolean isOptional = am.isIsOptional();
						final /*@NonInvalid*/ boolean eq = !isOptional;
						//
						if (eq) {
							accumulator.add(am);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_mandatoryAttribute = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_mandatoryAttribute.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ AttributeMetadata mandatoryAttribute = (AttributeMetadata) ITERATOR_mandatoryAttribute
								.next();
						/**
						 *
						 * self.userattribute->exists(pa | pa.attributemetadata = mandatoryAttribute)
						 */
						final /*@NonInvalid*/ List<UserAttribute> userattribute = this.getUserattribute();
						final /*@NonInvalid*/ OrderedSetValue BOXED_userattribute = idResolver
								.createOrderedSetOfAll(MarketplaceTables.ORD_CLSSid_UserAttribute, userattribute);
						/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_pa = BOXED_userattribute.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_pa.hasNext()) {
								if (accumulator_1 == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_1;
								}
								break;
							}
							/*@NonInvalid*/ UserAttribute pa = (UserAttribute) ITERATOR_pa.next();
							/**
							 * pa.attributemetadata = mandatoryAttribute
							 */
							final /*@NonInvalid*/ AttributeMetadata attributemetadata_0 = pa.getAttributemetadata();
							final /*@NonInvalid*/ boolean eq_0 = attributemetadata_0.equals(mandatoryAttribute);
							//
							if (eq_0) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq_0) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						//
						if (exists == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (exists == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (exists == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, MarketplaceTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueUserAttribute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::UniqueUserAttribute";
		try {
			/**
			 *
			 * inv UniqueUserAttribute:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = userattribute.attributemetadata->asSet()
			 *         ->size() =
			 *         userattribute->size()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					MarketplacePackage.Literals.USER___UNIQUE_USER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, MarketplaceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<UserAttribute> userattribute_0 = this.getUserattribute();
				final /*@NonInvalid*/ OrderedSetValue BOXED_userattribute_0 = idResolver
						.createOrderedSetOfAll(MarketplaceTables.ORD_CLSSid_UserAttribute, userattribute_0);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(MarketplaceTables.SEQ_CLSSid_AttributeMetadata);
				Iterator<Object> ITERATOR__1 = BOXED_userattribute_0.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ UserAttribute _1 = (UserAttribute) ITERATOR__1.next();
					/**
					 * attributemetadata
					 */
					final /*@NonInvalid*/ AttributeMetadata attributemetadata = _1.getAttributemetadata();
					//
					accumulator.add(attributemetadata);
				}
				final /*@NonInvalid*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(asSet);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
						.evaluate(BOXED_userattribute_0);
				final /*@NonInvalid*/ boolean result = size.equals(size_0);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, MarketplaceTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarketplacePackage.USER__USERATTRIBUTE:
			return ((InternalEList<?>) getUserattribute()).basicRemove(otherEnd, msgs);
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
		case MarketplacePackage.USER__USERATTRIBUTE:
			return getUserattribute();
		case MarketplacePackage.USER__ATTRIBUTEMETADATASPECIFICATION:
			if (resolve)
				return getAttributemetadataspecification();
			return basicGetAttributemetadataspecification();
		case MarketplacePackage.USER__DESCRIPTION:
			return getDescription();
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
		case MarketplacePackage.USER__USERATTRIBUTE:
			getUserattribute().clear();
			getUserattribute().addAll((Collection<? extends UserAttribute>) newValue);
			return;
		case MarketplacePackage.USER__ATTRIBUTEMETADATASPECIFICATION:
			setAttributemetadataspecification((AttributeMetadataSpecification) newValue);
			return;
		case MarketplacePackage.USER__DESCRIPTION:
			setDescription((String) newValue);
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
		case MarketplacePackage.USER__USERATTRIBUTE:
			getUserattribute().clear();
			return;
		case MarketplacePackage.USER__ATTRIBUTEMETADATASPECIFICATION:
			setAttributemetadataspecification((AttributeMetadataSpecification) null);
			return;
		case MarketplacePackage.USER__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case MarketplacePackage.USER__USERATTRIBUTE:
			return userattribute != null && !userattribute.isEmpty();
		case MarketplacePackage.USER__ATTRIBUTEMETADATASPECIFICATION:
			return attributemetadataspecification != null;
		case MarketplacePackage.USER__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MarketplacePackage.USER___ENSURE_MANDATORY_ATTRIBUTE_PRESENCE_IN_USER__DIAGNOSTICCHAIN_MAP:
			return EnsureMandatoryAttributePresenceInUser((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case MarketplacePackage.USER___UNIQUE_USER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP:
			return UniqueUserAttribute((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //UserImpl
