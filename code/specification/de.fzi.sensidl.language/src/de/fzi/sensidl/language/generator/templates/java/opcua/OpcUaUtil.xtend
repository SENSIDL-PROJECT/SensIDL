package de.fzi.sensidl.language.generator.templates.java.opcua

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet

class OpcUaUtil {
	
	private static val NAMESPACE_SUFFIX = "Namespace";
	private static val INTERFACE_NAME_SUFFIX = "DataSet"
	private static val DATA_SET_PREFIX = "OpcUa"
	
	public static def getDefaultPackageName(SensorInterface sensorInterface) {
		sensorInterface.name;	
	}

	public static def getServerNamespaceName(SensorInterface sensorInterface) {
		sensorInterface.name.toFirstUpper + NAMESPACE_SUFFIX
	}
		
	public static def getDefaultServerUrn(SensorInterface sensorInterface) {
		'''urn:«sensorInterface.name.toLowerCase»:opcua:server'''
	}
	
	public static def getDefaultNamespaceUrn(SensorInterface sensorInterface) {
		'''urn:opcua:server:namespace:«sensorInterface.name.toLowerCase»'''
	}
	
	public static def getDefaultClassName(DataSet dataset) {
		'''«DATA_SET_PREFIX + dataset.name.toFirstUpper»'''		
	}
	
	public static def getDefaultClassName(SensorInterface sensorInterface) {
		'''«sensorInterface.name.toFirstUpper»'''		
	}
	
	public static def getDefaultInterfaceName(SensorInterface sensorInterface) {
		'''«sensorInterface.name.toFirstUpper + INTERFACE_NAME_SUFFIX»'''		
	}
	
}