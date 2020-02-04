package de.fzi.sensidl.language.generator.templates.java.opcua

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet

class OpcUaUtil {
	
	static val NAMESPACE_SUFFIX = "Namespace";
	static val INTERFACE_NAME_SUFFIX = "DataSet"
	static val DATA_SET_PREFIX = "OpcUa"
	
	static def getDefaultPackageName(SensorInterface sensorInterface) {
		sensorInterface.name;	
	}

	static def getServerNamespaceName(SensorInterface sensorInterface) {
		sensorInterface.name.toFirstUpper + NAMESPACE_SUFFIX
	}
		
	static def getDefaultServerUrn(SensorInterface sensorInterface) {
		'''urn:«sensorInterface.name.toLowerCase»:opcua:server'''
	}
	
	static def getDefaultNamespaceUrn(SensorInterface sensorInterface) {
		'''urn:opcua:server:namespace:«sensorInterface.name.toLowerCase»'''
	}
	
	static def getDefaultClassName(DataSet dataset) {
		'''«DATA_SET_PREFIX + dataset.name.toFirstUpper»'''		
	}
	
	static def getDefaultClassName(SensorInterface sensorInterface) {
		'''«sensorInterface.name.toFirstUpper»'''		
	}
	
	static def getDefaultInterfaceName(SensorInterface sensorInterface) {
		'''«sensorInterface.name.toFirstUpper + INTERFACE_NAME_SUFFIX»'''		
	}
	
}