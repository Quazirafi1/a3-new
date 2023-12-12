/**
 */
package com.a3.marketplace.model.marketplace.impl;

import com.a3.marketplace.model.marketplace.AttributeMetadata;
import com.a3.marketplace.model.marketplace.AttributeMetadataSpecification;
import com.a3.marketplace.model.marketplace.MarketplacePackage;

import com.a3.marketplace.model.marketplace.MarketplaceTables;
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
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Metadata Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.AttributeMetadataSpecificationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.a3.marketplace.model.marketplace.impl.AttributeMetadataSpecificationImpl#getAttributemetadata <em>Attributemetadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeMetadataSpecificationImpl extends NamedElementImpl implements AttributeMetadataSpecification {
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
	 * The cached value of the '{@link #getAttributemetadata() <em>Attributemetadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributemetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMetadata> attributemetadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeMetadataSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketplacePackage.Literals.ATTRIBUTE_METADATA_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeMetadata> getAttributemetadata() {
		if (attributemetadata == null) {
			attributemetadata = new EObjectContainmentEList<AttributeMetadata>(AttributeMetadata.class, this,
					MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA);
		}
		return attributemetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean uniqueNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AttributeMetadataSpecification::uniqueNames";
		try {
			/**
			 *
			 * inv uniqueNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = attributemetadata.name->asSet()
			 *         ->size() =
			 *         attributemetadata->size()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					MarketplacePackage.Literals.ATTRIBUTE_METADATA_SPECIFICATION___UNIQUE_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, MarketplaceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<AttributeMetadata> attributemetadata_0 = this.getAttributemetadata();
					final /*@NonInvalid*/ OrderedSetValue BOXED_attributemetadata_0 = idResolver
							.createOrderedSetOfAll(MarketplaceTables.ORD_CLSSid_AttributeMetadata, attributemetadata_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSequenceAccumulatorValue(MarketplaceTables.SEQ_PRIMid_String);
					Iterator<Object> ITERATOR__1 = BOXED_attributemetadata_0.iterator();
					/*@Thrown*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ AttributeMetadata _1 = (AttributeMetadata) ITERATOR__1.next();
						/**
						 * name
						 */
						final /*@NonInvalid*/ String name = _1.getName();
						//
						accumulator.add(name);
					}
					final /*@Thrown*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(asSet);
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
							.evaluate(BOXED_attributemetadata_0);
					final /*@Thrown*/ boolean result = size.equals(size_0);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA:
			return ((InternalEList<?>) getAttributemetadata()).basicRemove(otherEnd, msgs);
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
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION:
			return getDescription();
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA:
			return getAttributemetadata();
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
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA:
			getAttributemetadata().clear();
			getAttributemetadata().addAll((Collection<? extends AttributeMetadata>) newValue);
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
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA:
			getAttributemetadata().clear();
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
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION__ATTRIBUTEMETADATA:
			return attributemetadata != null && !attributemetadata.isEmpty();
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
		case MarketplacePackage.ATTRIBUTE_METADATA_SPECIFICATION___UNIQUE_NAMES__DIAGNOSTICCHAIN_MAP:
			return uniqueNames((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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

} //AttributeMetadataSpecificationImpl
