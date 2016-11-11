package de.fzi.sensidl.language.generator.templates.java.opcua

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.templates.ITemplate
import java.util.ArrayList
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import java.util.List
import java.util.Optional
import de.fzi.sensidl.language.generator.templates.EPLicense

class OpcUaDataSetTemplate extends ITemplate<DataSet> {
	
	private static val OBJECT_TYPE_SUFFIX = "ObjectType"
	private static val DEFAULT_NUMERICAL_VALUE = "0"
	private static val DEFAULT_STRING_VALUE = "\"\""
	private static val DEFAULT_BOOLEAN_VALUE = "false"
	private static val EMPTY_STRING = ""
	
	private val members = new ArrayList<CharSequence>
	private val constructors = new ArrayList<CharSequence>
	private val methodsToImplement = new ArrayList<CharSequence>
	
	/**
	 * The constructor.
	 */
	new(DataSet newElement) {
		
		super(newElement)
		
		addMembers();
		addConstructors();
		addMethodsToImplement();
		
	}
	
	/**
	 * Generates the implementer of the generated java-interface {@link #OpcUaDataSetInterfaceTemplate OpcUaDataSetInterfaceTemplate}.
	 * Each implementer corresponds to a SensIDL-DataSet-element. The implementation ensures that the DataSet is registered 
	 * as OPC UA node in the OPC UA namespace.
	 * @see ITemplate<T>#getCode()
	 */
	override getCode() {
		'''
		«EPLicense.text»
		
		package «OpcUaUtil.getDefaultPackageName(GenerationUtil.getSensorInterface(this.element))»;
				
		import org.eclipse.milo.opcua.stack.core.Identifiers;
		import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
		import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
		import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;
		
		public class «OpcUaUtil.getDefaultClassName(this.element)» implements «interfaceName» {
				
			«members.print»
			«System.getProperty("line.separator")»
			«constructors.print»
			«System.getProperty("line.separator")»
			«methodsToImplement.print»
				
		}
		'''
	}
	
	private def print(List<CharSequence> sequencesToPrint) {
		
		val builder = new StringBuilder
		
		sequencesToPrint.forEach[sequenceToPrint | 
			
			builder.append(sequenceToPrint)
			builder.append("\n")
		]
		
		builder.toString
		
	}
	
	private def addMethodsToImplement() {
		
		methodsToImplement.add('''
			@Override
			public String getObjectTypeName() {
				return this.objectTypeName;
			}
		''')
		
		methodsToImplement.add('''
			@Override
			public NodeId getObjectTypeNodeId() {
				return this.objectTypeNodeId;
			}
		''')
		
		methodsToImplement.add('''
			@Override
			public String getObjectName() {
				return this.objectName;
			}
		''')
		
		methodsToImplement.add('''
			@Override
			public NodeId getObjectNodeId() {
				return this.objectNodeId;
			}
		''')
		
		methodsToImplement.add('''
			@Override
			public String getDescription() {
				return this.description;
			}
		''')
		
		methodsToImplement.add('''
			@Override
			public Object[][] getVariables() {
				return this.variables;
			}
		''')
		
	}
	
	private def addConstructors() {
		
		constructors.add(constructorCode);
		
	}
	
	private def addMembers() {
		
		members.add("private final String objectTypeName = \"" + this.element.name + OBJECT_TYPE_SUFFIX + "\";")
		members.add("private final NodeId objectTypeNodeId;")
		members.add("private final String objectName = \"" + this.element.name + "\";")
		members.add("private final NodeId objectNodeId;")
		members.add("private final String description = \"" + this.element.description + "\";")
		members.add(getAllVariables());
		
	}
	
	private def getAllVariables() {
		
		if (this.element.data.size == 0) {
			
			return "";
			
		}
		
		val variables = new StringBuilder
		variables.append("private final Object[][] variables = new Object[][] {")
		variables.append("\n")
		
		this.element.data.forEach[singleData | addInitilizationStringOf(singleData).to(variables)]
		
		variables.append("};")
		
		variables.toString
		
	}
	
	private dispatch def addInitilizationStringOf(MeasurementData data) {
		
		data.getStringRepresenation(data.dataType.defaultValue)
		
	}
	
	private dispatch def addInitilizationStringOf(NonMeasurementData data) {
		
		var value = data.value
		if (value.isNullOrEmpty) {
			
			value = data.dataType.defaultValue  
			
		} 
		
		data.getStringRepresenation(value)
		
	}
	
	private def getStringRepresenation(Data data, String value) {

		String.format("\t{ \"%1s\", %2s, new Variant(%3s), \"%4s\" }, \n", data.name, OpcUaDataType.getDataTypeAsNodeIdOf(data.dataType), value.trim, data.description)
	
	}
	
	private def getDefaultValue(DataType dataType) {
		
		var defaultValue = DEFAULT_NUMERICAL_VALUE;
		
		if (dataType.equals(DataType.STRING)) {
			
			defaultValue = DEFAULT_STRING_VALUE;
			
		}
		
		if (dataType.equals(DataType.BOOLEAN)) {
			
			defaultValue = DEFAULT_BOOLEAN_VALUE
			
		} 
		
		defaultValue
		
	}
	
	private def to(String stringToAdd, StringBuilder builder) {
		
		builder.append(stringToAdd);
		
	}
	
	private def getConstructorCode() {
		
		'''
			public «OpcUaUtil.getDefaultClassName(this.element)»(UShort namespaceIndex«this.element.addSubtypesArguments») {
					objectTypeNodeId = new NodeId(namespaceIndex, this.objectTypeName);
					objectNodeId = new NodeId(namespaceIndex, this.objectName);
			}
		'''
		
	}
	
	private def addSubtypesArguments(DataSet dataset) {
		
		var optionalArgument = EMPTY_STRING
		
		var subtypes = dataset.getAllSubtypes
		
		if (!subtypes.empty) {
			
			optionalArgument = dataset.asArgument
			
		} 
		
		optionalArgument
		
	}
	
	def getAllSubtypes(DataSet usedDataSet) {
		
		var allDataSets = new ArrayList
		allDataSets.addAll(GenerationUtil.getSensorInterface(usedDataSet).dataDescription.dataSets)
		
		allDataSets.filter[dataset | dataset.usedDataSets.contains(usedDataSet)]
		
	}
	
	private def asArgument(DataSet set) {
		
		val interfaceName = OpcUaUtil.getDefaultInterfaceName(GenerationUtil.getSensorInterface(set)).toString 
		String.format(", %1s... subtypes", interfaceName)
		
	}
	
	private def getInterfaceName() {
		
		OpcUaUtil.getDefaultInterfaceName(GenerationUtil.getSensorInterface(this.element));
		
	}
	
	override getFileName() {
		
		OpcUaUtil.getDefaultClassName(this.element).toString
		
	}
	
}