package de.fzi.sensidl.language.generator.templates.java.opcua

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.templates.ITemplate
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import de.fzi.sensidl.language.generator.templates.EclipsePuplicLicenseTemplate

class OpcUaServerNamespaceTemplate extends ITemplate<SensorInterface> {
	
	private var String dataSetInterfaceClassName
	private var String dataSetInterfaceObjectName
	private var String packagePrefix
	
	private var dataSetInterfaceImplementer = new ArrayList<CharSequence>
	
	/**
	 * The constructor.
	 * @param newElement - SensorInterface-element which is needed for the code-generation.
	 */
	new(SensorInterface newElement, String newPackagePrefix) {
		
		super(newElement)
		
		packagePrefix = newPackagePrefix
		
		dataSetInterfaceClassName =  OpcUaUtil.getDefaultInterfaceName(this.element).toString;
		dataSetInterfaceObjectName = dataSetInterfaceClassName.toFirstLower + "s"
		
		addAllImplementers();
		
	}
	
	private def addAllImplementers() {
		
		this.element.dataDescription.dataSets.forEach[dataSet | dataSetInterfaceImplementer.add(dataSet.stringRepresentation)]
		
	}
	
	private def CharSequence getStringRepresentation(DataSet set) {
		
		'''
			add(new «OpcUaUtil.getDefaultClassName(set)»(namespaceIndex«set.addSubtypesIfNecessary»));
		'''
		
	}
	
	private def addSubtypesIfNecessary(DataSet set) {
		
		var availableDataSets = new BasicEList(this.element.dataDescription.dataSets)
		availableDataSets.removeIf(currentSet | (currentSet == set) || !currentSet.usedDataSets.contains(set))
		
		if (availableDataSets.empty) {
			return "";
		}
		
		val builder = new StringBuilder
		
		availableDataSets.forEach[availabeDataSet | 
			
			builder.append(", ")
			builder.append("new " + OpcUaUtil.getDefaultClassName(availabeDataSet) + "(namespaceIndex)")
				
		]
		
		builder.toString
		
	}
	
	/**
	 * @see ITemplate<T>#getFileName()
	 */
	override getFileName() {
		
		OpcUaUtil.getServerNamespaceName(this.element)
		
	}
	
	private def print(List<CharSequence> elementsToPrint) {
		
		val builder = new StringBuilder
		
		elementsToPrint.forEach[element | 
			
			builder.append(element)
			
		]
		
		builder.toString
		
	}
	
	/**
	 * Generates the OPC UA namespace which is required by the Opc UA server to register the user specific 
	 * SensIDL-DataSets as OPC UA nodes. The OPC UA namespace extends the default OPC UA addressspace.
	 * @see ITemplate<T>#getCode()
	 */
	override getCode() {
		'''
		«EclipsePuplicLicenseTemplate.text»
		
		package «packagePrefix»«OpcUaUtil.getDefaultPackageName(this.element)»;
		
		import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.ubyte;
		
		import java.util.ArrayList;
		import java.util.List;
		import java.util.Optional;
		import java.util.concurrent.CompletableFuture;
		
		import org.eclipse.milo.opcua.sdk.core.AccessLevel;
		import org.eclipse.milo.opcua.sdk.core.Reference;
		import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
		import org.eclipse.milo.opcua.sdk.server.api.DataItem;
		import org.eclipse.milo.opcua.sdk.server.api.MethodInvocationHandler;
		import org.eclipse.milo.opcua.sdk.server.api.MonitoredItem;
		import org.eclipse.milo.opcua.sdk.server.api.Namespace;
		import org.eclipse.milo.opcua.sdk.server.model.UaFolderNode;
		import org.eclipse.milo.opcua.sdk.server.model.UaMethodNode;
		import org.eclipse.milo.opcua.sdk.server.model.UaNode;
		import org.eclipse.milo.opcua.sdk.server.model.UaObjectNode;
		import org.eclipse.milo.opcua.sdk.server.model.UaObjectTypeNode;
		import org.eclipse.milo.opcua.sdk.server.model.UaVariableNode;
		import org.eclipse.milo.opcua.sdk.server.util.SubscriptionModel;
		import org.eclipse.milo.opcua.stack.core.Identifiers;
		import org.eclipse.milo.opcua.stack.core.StatusCodes;
		import org.eclipse.milo.opcua.stack.core.UaException;
		import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
		import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
		import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
		import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
		import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
		import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
		import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
		import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;
		import org.eclipse.milo.opcua.stack.core.types.enumerated.NodeClass;
		import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
		import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;
		import org.eclipse.milo.opcua.stack.core.types.structured.WriteValue;
		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;
		
		import com.google.common.collect.Lists;
		
		public class «OpcUaUtil.getServerNamespaceName(this.element)» implements Namespace {
		
			public static final String NAMESPACE_URI = "«OpcUaUtil.getDefaultNamespaceUrn(this.element)»";
		
			private final List<«dataSetInterfaceClassName»> «dataSetInterfaceObjectName»;
		
			private final Logger logger = LoggerFactory.getLogger(getClass());
		
			private final SubscriptionModel subscriptionModel;
		
			private final OpcUaServer server;
			private final UShort namespaceIndex;
		
			public «OpcUaUtil.getServerNamespaceName(this.element)»(OpcUaServer server, UShort namespaceIndex) {
				this.server = server;
				this.namespaceIndex = namespaceIndex;
		
				this.subscriptionModel = new SubscriptionModel(server, this);
		
				this.«dataSetInterfaceObjectName» = new ArrayList<«dataSetInterfaceClassName»>() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
		
					{
						«dataSetInterfaceImplementer.print()»
					}
				};
		
				initialize();
		
			}
		
			private void initialize() {
		
				extendUaNamespace();
				add«this.element.name.toFirstUpper»Nodes();
		
			}
		
			private void extendUaNamespace() {
		
				this.«dataSetInterfaceObjectName».forEach(dataSet -> addObjectType(dataSet));
		
			}
		
			private void addObjectType(«dataSetInterfaceClassName» dataSet) {
		
				UaObjectTypeNode node = new UaObjectTypeNode(this.server.getNodeManager(), dataSet.getObjectTypeNodeId(),
						new QualifiedName(this.server.getUaNamespace().getNamespaceIndex(), dataSet.getObjectTypeName()),
						new LocalizedText("en", dataSet.getObjectTypeName()),
						Optional.of(new LocalizedText("en", dataSet.getDescription())), Optional.of(UInteger.valueOf(0L)),
						Optional.of(UInteger.valueOf(0L)), false);
		
				this.server.getNodeManager().addNode(node);
		
				try {
					
					this.server.getUaNamespace().addReference(Identifiers.BaseObjectType, Identifiers.HasSubtype, true,
							dataSet.getObjectTypeNodeId().expanded(), NodeClass.ObjectType);
		
					this.server.getUaNamespace().addReference(dataSet.getObjectTypeNodeId(), Identifiers.HasSubtype,
							false, Identifiers.BaseObjectType.expanded(), NodeClass.ObjectType);
					
				} catch (UaException e) {
					logger.error("An error occurred during namespace initialization. ", e.getMessage());
				}
		
			}
		
			private void add«this.element.name.toFirstUpper»Nodes() {
		
				NodeId folderNodeId = new NodeId(namespaceIndex, "«this.element.name.toFirstUpper»");
		
				UaFolderNode folderNode = new UaFolderNode(server.getNodeManager(), folderNodeId,
					new QualifiedName(namespaceIndex, "«this.element.name.toFirstUpper»"), LocalizedText.english("«this.element.name.toFirstUpper»"));
		
				server.getNodeManager().addNode(folderNode);
		
				try {
					server.getUaNamespace().addReference(Identifiers.ObjectsFolder, Identifiers.Organizes, true,
							folderNodeId.expanded(), NodeClass.Object);
				} catch (UaException e) {
					logger.error("An error occurred during namespace initialization. ", e.getMessage());
				}
		
				add«this.element.name.toFirstUpper»NodesTo(folderNode);
		
			}
		
			private void add«this.element.name.toFirstUpper»NodesTo(UaFolderNode folderNode) {
		
				this.«dataSetInterfaceObjectName».stream().filter(dataSet -> dataSet.getSubtypes() == null)
						.forEach(dataSetWithoutSubtype -> addObject(dataSetWithoutSubtype, folderNode));
		
				this.«dataSetInterfaceObjectName».stream().filter(dataSet -> dataSet.getSubtypes() != null)
						.forEach(dataSetWithSubtype -> addObjectWithSubtype(dataSetWithSubtype, folderNode));
		
			}
		
			private void addObject(«dataSetInterfaceClassName» dataSet, UaFolderNode folderNode) {
		
				UaObjectNode node = new UaObjectNode(this.server.getNodeManager(), dataSet.getObjectNodeId(),
						new QualifiedName(this.namespaceIndex, dataSet.getObjectName()),
						LocalizedText.english(dataSet.getObjectName()));
		
				this.server.getNodeManager().addNode(node);
		
				try {
					this.server.getUaNamespace().addReference(dataSet.getObjectNodeId(), Identifiers.HasTypeDefinition,
							true, dataSet.getObjectTypeNodeId().expanded(), NodeClass.ObjectType);
		
					addVariablesTo(node, dataSet);
				} catch (UaException e) {
					logger.error("An error occurred during namespace initialization. ", e.getMessage());
				}
		
				folderNode.addOrganizes(node);
		
			}
		
			private void addObjectWithSubtype(«dataSetInterfaceClassName» dataSet, UaFolderNode folderNode) {
		
				addObject(dataSet, folderNode);
		
				dataSet.getSubtypes().forEach(subtype -> addHasSubtypeReferences(dataSet, subtype));
		
			}
		
			private void addHasSubtypeReferences(«dataSetInterfaceClassName» supertype, «dataSetInterfaceClassName» subtype) {
		
				try {
		
					this.server.getUaNamespace().addReference(supertype.getObjectNodeId(), Identifiers.HasSubtype, true,
							subtype.getObjectNodeId().expanded(), NodeClass.Object);
		
					this.server.getUaNamespace().addReference(subtype.getObjectNodeId(), Identifiers.HasSubtype, false,
							supertype.getObjectNodeId().expanded(), NodeClass.Object);
		
				} catch (UaException e) {
					logger.error("An error occurred during namespace initialization. ", e.getMessage());
				}
		
			}
		
			private void addVariablesTo(UaObjectNode node, «OpcUaUtil.getDefaultInterfaceName(this.element)» dataSet) throws UaException {
		
					if (dataSet.getVariables() == null) {
					return;
				}
		
				for (Object[] variable : dataSet.getVariables()) {
					String name = (String) variable[0];
					NodeId typeId = (NodeId) variable[1];
					Variant variant = (Variant) variable[2];
					String description = (String) variable[3];
		
					UaVariableNode variableNode = new UaVariableNode.UaVariableNodeBuilder(server.getNodeManager())
							.setNodeId(
									new NodeId(this.namespaceIndex, node.getNodeId().getIdentifier().toString() + "/" + name))
							.setAccessLevel(ubyte(AccessLevel.getMask(AccessLevel.READ_WRITE)))
							.setBrowseName(new QualifiedName(this.namespaceIndex, name))
							.setDisplayName(LocalizedText.english(name)).setDataType(typeId)
							.setDescription(LocalizedText.english(description))
							.setTypeDefinition(Identifiers.BaseDataVariableType).build();
		
					variableNode.setValue(new DataValue(variant));
		
					server.getNodeManager().addNode(variableNode);
		
					this.server.getUaNamespace().addReference(node.getNodeId(), Identifiers.HasComponent, true,
							variableNode.getNodeId().expanded(), NodeClass.Variable);
				}
		
			}
		
			@Override
			public CompletableFuture<List<Reference>> getReferences(NodeId nodeId) {
				UaNode node = server.getNodeManager().get(nodeId);
		
				if (node != null) {
					return CompletableFuture.completedFuture(node.getReferences());
				} else {
					return failedFuture(new UaException(StatusCodes.Bad_NodeIdUnknown));
				}
			}
		
			private <T> CompletableFuture<T> failedFuture(Throwable ex) {
				CompletableFuture<T> f = new CompletableFuture<>();
				f.completeExceptionally(ex);
				return f;
			}
		
			@Override
			public void read(ReadContext context, Double maxAge, TimestampsToReturn timestamps,
					List<ReadValueId> readValueIds) {
		
				List<DataValue> results = Lists.newArrayListWithCapacity(readValueIds.size());
		
				for (ReadValueId readValueId : readValueIds) {
					UaNode node = server.getNodeManager().get(readValueId.getNodeId());
		
					if (node != null) {
						DataValue value = node.readAttribute(readValueId.getAttributeId().intValue(), timestamps,
								readValueId.getIndexRange());
		
						results.add(value);
					} else {
						results.add(new DataValue(StatusCodes.Bad_NodeIdUnknown));
					}
				}
		
				context.complete(results);
			}
		
			@Override
			public void write(WriteContext context, List<WriteValue> writeValues) {
				List<StatusCode> results = Lists.newArrayListWithCapacity(writeValues.size());
		
				for (WriteValue writeValue : writeValues) {
					UaNode node = server.getNodeManager().get(writeValue.getNodeId());
		
					if (node != null) {
						try {
							node.writeAttribute(server.getNamespaceManager(), writeValue.getAttributeId(),
									writeValue.getValue(), writeValue.getIndexRange());
		
							results.add(StatusCode.GOOD);
						} catch (UaException e) {
							logger.error("Unable to write value={}", writeValue.getValue(), e);
							results.add(e.getStatusCode());
						}
					} else {
						results.add(new StatusCode(StatusCodes.Bad_NodeIdUnknown));
					}
				}
		
				context.complete(results);
			}
		
			@Override
			public void onDataItemsCreated(List<DataItem> dataItems) {
				subscriptionModel.onDataItemsCreated(dataItems);
			}
		
			@Override
			public void onDataItemsModified(List<DataItem> dataItems) {
				subscriptionModel.onDataItemsModified(dataItems);
			}
		
			@Override
			public void onDataItemsDeleted(List<DataItem> dataItems) {
				subscriptionModel.onDataItemsDeleted(dataItems);
			}
		
			@Override
			public void onMonitoringModeChanged(List<MonitoredItem> monitoredItems) {
				subscriptionModel.onMonitoringModeChanged(monitoredItems);
			}
		
			@Override
			public Optional<MethodInvocationHandler> getInvocationHandler(NodeId methodId) {
				Optional<UaNode> node = server.getNodeManager().getNode(methodId);
		
				return node.flatMap(n -> {
					if (n instanceof UaMethodNode) {
						return ((UaMethodNode) n).getInvocationHandler();
					} else {
						return Optional.empty();
					}
				});
			}
		
			@Override
			public UShort getNamespaceIndex() {
				return namespaceIndex;
			}
			
			@Override
			public String getNamespaceUri() {
				return NAMESPACE_URI;
			}
		
		}
		
		'''
	}
	
}