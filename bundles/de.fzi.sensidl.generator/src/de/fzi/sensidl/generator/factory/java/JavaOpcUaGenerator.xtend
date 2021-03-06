package de.fzi.sensidl.generator.factory.java

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.generator.GenerationUtil
import de.fzi.sensidl.generator.SensIDLConstants
import de.fzi.sensidl.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.generator.factory.IOpcUaGenerator
import de.fzi.sensidl.generator.templates.ITemplate
import de.fzi.sensidl.generator.templates.java.opcua.OpcUaDataSetInterfaceTemplate
import de.fzi.sensidl.generator.templates.java.opcua.OpcUaDataSetTemplate
import de.fzi.sensidl.generator.templates.java.opcua.OpcUaDataType
import de.fzi.sensidl.generator.templates.java.opcua.OpcUaServerNamespaceTemplate
import de.fzi.sensidl.generator.templates.java.opcua.OpcUaServerTemplate
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger

class JavaOpcUaGenerator implements IOpcUaGenerator {
	
	static Logger logger = Logger.getLogger(JavaOpcUaGenerator)
 
	val List<ITemplate<?>> templates; 
	
	/**
	 * The constructor calls the constructor of the superclass to set a
	 * list of DataSet-elements.
	 * @param newDataSet - represents the list of DataSet-elements.
	 */
	new(List<DataSet> datasets, String packagePrefix) {
		
		val sensorInterface = GenerationUtil.getSensorInterface(datasets.get(0))
		
		templates = new ArrayList => [
			
			add(new OpcUaServerTemplate(sensorInterface, packagePrefix))
			add(new OpcUaServerNamespaceTemplate(sensorInterface, packagePrefix))
			add(new OpcUaDataSetInterfaceTemplate(sensorInterface, packagePrefix))
			
		]
			
		datasets.forEach[dataset | templates.add(new OpcUaDataSetTemplate(dataset, packagePrefix))]

	}
	
	/**
	 * @see IOpcUaGenerator#generateOpcUaServer()
	 * Triggers the opc ua server code generation.
	 */
	override generateOpcUaServer() {
		
		logger.info("Start with code-generation of a Opc Ua Server.")
		
		val filesToGenerate = new HashMap		
	
		templates.forEach[template | 
			
			filesToGenerate.put(addFileExtensionTo(template.fileName), template.code)
			
			logger.info("File: " + addFileExtensionTo(template.fileName) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
			
		]
		
		
		filesToGenerate
		
	}
	
	override addFileExtensionTo(String ClassName) {
		
		ClassName + SensIDLConstants.JAVA_EXTENSION

	}
	
	override toTypeName(Data data) {
		
		OpcUaDataType.getDataTypeAsNodeIdOf(data.dataType)
		
	}
	
}