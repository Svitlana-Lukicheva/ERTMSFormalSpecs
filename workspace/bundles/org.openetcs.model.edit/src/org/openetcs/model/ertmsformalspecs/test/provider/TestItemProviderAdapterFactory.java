/**
 */
package org.openetcs.model.ertmsformalspecs.test.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.openetcs.model.ertmsformalspecs.test.util.TestAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestItemProviderAdapterFactory extends TestAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.Frame} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameItemProvider frameItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.Frame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFrameAdapter() {
		if (frameItemProvider == null) {
			frameItemProvider = new FrameItemProvider(this);
		}

		return frameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.SubSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSequenceItemProvider subSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.SubSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubSequenceAdapter() {
		if (subSequenceItemProvider == null) {
			subSequenceItemProvider = new SubSequenceItemProvider(this);
		}

		return subSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleTestCaseItemProvider singleTestCaseItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleTestCaseAdapter() {
		if (singleTestCaseItemProvider == null) {
			singleTestCaseItemProvider = new SingleTestCaseItemProvider(this);
		}

		return singleTestCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.Step} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepItemProvider stepItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepAdapter() {
		if (stepItemProvider == null) {
			stepItemProvider = new StepItemProvider(this);
		}

		return stepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.SubStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubStepItemProvider subStepItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.SubStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubStepAdapter() {
		if (subStepItemProvider == null) {
			subStepItemProvider = new SubStepItemProvider(this);
		}

		return subStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.Expectation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectationItemProvider expectationItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.Expectation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpectationAdapter() {
		if (expectationItemProvider == null) {
			expectationItemProvider = new ExpectationItemProvider(this);
		}

		return expectationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.TestMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestMessageItemProvider testMessageItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.TestMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestMessageAdapter() {
		if (testMessageItemProvider == null) {
			testMessageItemProvider = new TestMessageItemProvider(this);
		}

		return testMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.TestPacket} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPacketItemProvider testPacketItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.TestPacket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestPacketAdapter() {
		if (testPacketItemProvider == null) {
			testPacketItemProvider = new TestPacketItemProvider(this);
		}

		return testPacketItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openetcs.model.ertmsformalspecs.test.TestField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestFieldItemProvider testFieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.openetcs.model.ertmsformalspecs.test.TestField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestFieldAdapter() {
		if (testFieldItemProvider == null) {
			testFieldItemProvider = new TestFieldItemProvider(this);
		}

		return testFieldItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (frameItemProvider != null) frameItemProvider.dispose();
		if (subSequenceItemProvider != null) subSequenceItemProvider.dispose();
		if (singleTestCaseItemProvider != null) singleTestCaseItemProvider.dispose();
		if (stepItemProvider != null) stepItemProvider.dispose();
		if (subStepItemProvider != null) subStepItemProvider.dispose();
		if (expectationItemProvider != null) expectationItemProvider.dispose();
		if (testMessageItemProvider != null) testMessageItemProvider.dispose();
		if (testPacketItemProvider != null) testPacketItemProvider.dispose();
		if (testFieldItemProvider != null) testFieldItemProvider.dispose();
	}

}