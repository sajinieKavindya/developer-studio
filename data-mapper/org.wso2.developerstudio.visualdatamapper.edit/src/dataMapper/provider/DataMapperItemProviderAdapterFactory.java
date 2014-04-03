/**
 */
package dataMapper.provider;

import dataMapper.util.DataMapperAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataMapperItemProviderAdapterFactory extends DataMapperAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public DataMapperItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.DataMapperNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMapperNodeItemProvider dataMapperNodeItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.DataMapperNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataMapperNodeAdapter() {
		if (dataMapperNodeItemProvider == null) {
			dataMapperNodeItemProvider = new DataMapperNodeItemProvider(this);
		}

		return dataMapperNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.DataMapperDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMapperDiagramItemProvider dataMapperDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.DataMapperDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataMapperDiagramAdapter() {
		if (dataMapperDiagramItemProvider == null) {
			dataMapperDiagramItemProvider = new DataMapperDiagramItemProvider(this);
		}

		return dataMapperDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.DataMapperRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMapperRootItemProvider dataMapperRootItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.DataMapperRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataMapperRootAdapter() {
		if (dataMapperRootItemProvider == null) {
			dataMapperRootItemProvider = new DataMapperRootItemProvider(this);
		}

		return dataMapperRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Operator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorItemProvider operatorItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorAdapter() {
		if (operatorItemProvider == null) {
			operatorItemProvider = new OperatorItemProvider(this);
		}

		return operatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.OperatorBasicContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorBasicContainerItemProvider operatorBasicContainerItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.OperatorBasicContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorBasicContainerAdapter() {
		if (operatorBasicContainerItemProvider == null) {
			operatorBasicContainerItemProvider = new OperatorBasicContainerItemProvider(this);
		}

		return operatorBasicContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.OperatorLeftContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorLeftContainerItemProvider operatorLeftContainerItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.OperatorLeftContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorLeftContainerAdapter() {
		if (operatorLeftContainerItemProvider == null) {
			operatorLeftContainerItemProvider = new OperatorLeftContainerItemProvider(this);
		}

		return operatorLeftContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.OperatorLeftConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorLeftConnectorItemProvider operatorLeftConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.OperatorLeftConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorLeftConnectorAdapter() {
		if (operatorLeftConnectorItemProvider == null) {
			operatorLeftConnectorItemProvider = new OperatorLeftConnectorItemProvider(this);
		}

		return operatorLeftConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.OperatorRightContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorRightContainerItemProvider operatorRightContainerItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.OperatorRightContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorRightContainerAdapter() {
		if (operatorRightContainerItemProvider == null) {
			operatorRightContainerItemProvider = new OperatorRightContainerItemProvider(this);
		}

		return operatorRightContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.OperatorRightConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorRightConnectorItemProvider operatorRightConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.OperatorRightConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorRightConnectorAdapter() {
		if (operatorRightConnectorItemProvider == null) {
			operatorRightConnectorItemProvider = new OperatorRightConnectorItemProvider(this);
		}

		return operatorRightConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementItemProvider elementItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementAdapter() {
		if (elementItemProvider == null) {
			elementItemProvider = new ElementItemProvider(this);
		}

		return elementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.TreeNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeNodeItemProvider treeNodeItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.TreeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTreeNodeAdapter() {
		if (treeNodeItemProvider == null) {
			treeNodeItemProvider = new TreeNodeItemProvider(this);
		}

		return treeNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.InNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InNodeItemProvider inNodeItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.InNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInNodeAdapter() {
		if (inNodeItemProvider == null) {
			inNodeItemProvider = new InNodeItemProvider(this);
		}

		return inNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.OutNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutNodeItemProvider outNodeItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.OutNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutNodeAdapter() {
		if (outNodeItemProvider == null) {
			outNodeItemProvider = new OutNodeItemProvider(this);
		}

		return outNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.DataMapperLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMapperLinkItemProvider dataMapperLinkItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.DataMapperLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataMapperLinkAdapter() {
		if (dataMapperLinkItemProvider == null) {
			dataMapperLinkItemProvider = new DataMapperLinkItemProvider(this);
		}

		return dataMapperLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Concat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcatItemProvider concatItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Concat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcatAdapter() {
		if (concatItemProvider == null) {
			concatItemProvider = new ConcatItemProvider(this);
		}

		return concatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Equal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualItemProvider equalItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Equal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualAdapter() {
		if (equalItemProvider == null) {
			equalItemProvider = new EqualItemProvider(this);
		}

		return equalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Split} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitItemProvider splitItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Split}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitAdapter() {
		if (splitItemProvider == null) {
			splitItemProvider = new SplitItemProvider(this);
		}

		return splitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.LowerCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerCaseItemProvider lowerCaseItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.LowerCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLowerCaseAdapter() {
		if (lowerCaseItemProvider == null) {
			lowerCaseItemProvider = new LowerCaseItemProvider(this);
		}

		return lowerCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataMapper.Contains} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsItemProvider containsItemProvider;

	/**
	 * This creates an adapter for a {@link dataMapper.Contains}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainsAdapter() {
		if (containsItemProvider == null) {
			containsItemProvider = new ContainsItemProvider(this);
		}

		return containsItemProvider;
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
		if (dataMapperNodeItemProvider != null) dataMapperNodeItemProvider.dispose();
		if (dataMapperDiagramItemProvider != null) dataMapperDiagramItemProvider.dispose();
		if (dataMapperRootItemProvider != null) dataMapperRootItemProvider.dispose();
		if (inputItemProvider != null) inputItemProvider.dispose();
		if (outputItemProvider != null) outputItemProvider.dispose();
		if (operatorItemProvider != null) operatorItemProvider.dispose();
		if (operatorBasicContainerItemProvider != null) operatorBasicContainerItemProvider.dispose();
		if (operatorLeftContainerItemProvider != null) operatorLeftContainerItemProvider.dispose();
		if (operatorLeftConnectorItemProvider != null) operatorLeftConnectorItemProvider.dispose();
		if (operatorRightContainerItemProvider != null) operatorRightContainerItemProvider.dispose();
		if (operatorRightConnectorItemProvider != null) operatorRightConnectorItemProvider.dispose();
		if (elementItemProvider != null) elementItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (treeNodeItemProvider != null) treeNodeItemProvider.dispose();
		if (inNodeItemProvider != null) inNodeItemProvider.dispose();
		if (outNodeItemProvider != null) outNodeItemProvider.dispose();
		if (dataMapperLinkItemProvider != null) dataMapperLinkItemProvider.dispose();
		if (concatItemProvider != null) concatItemProvider.dispose();
		if (equalItemProvider != null) equalItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
		if (splitItemProvider != null) splitItemProvider.dispose();
		if (lowerCaseItemProvider != null) lowerCaseItemProvider.dispose();
		if (containsItemProvider != null) containsItemProvider.dispose();
	}

}
