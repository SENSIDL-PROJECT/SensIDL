package de.fzi.sensidl.language.generator.templates.java.opcua

import java.util.HashMap
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType

class OpcUaDataType {
	
	private static val OPCUA_INT8_DATA_TYPE = "Identifiers.Byte"
	private static val OPCUA_UINT8_DATA_TYPE = "Identifiers.Byte"
	private static val OPCUA_INT16_DATA_TYPE = "Identifiers.Int16"
	private static val OPCUA_UINT16_DATA_TYPE = "Identifiers.UInt16"
	private static val OPCUA_INT32_DATA_TYPE = "Identifiers.Int32"
	private static val OPCUA_UINT32_DATA_TYPE = "Identifiers.UInt32"
	private static val OPCUA_INT64_DATA_TYPE = "Identifiers.Int64"
	private static val OPCUA_UINT64_DATA_TYPE = "Identifiers.UInt64"
	private static val OPCUA_FLOAT_DATA_TYPE = "Identifiers.Float"
	private static val OPCUA_DOUBLE_DATA_TYPE = "Identifiers.Double"
	private static val OPCUA_BOOLEAN_DATA_TYPE = "Identifiers.Boolean"
	private static val OPCUA_STRING_DATA_TYPE = "Identifiers.String"
	
	private static val dataTypeMap = new HashMap() => [
		
		put(DataType.INT8, OPCUA_INT8_DATA_TYPE);
		put(DataType.UINT8, OPCUA_UINT8_DATA_TYPE);
		put(DataType.INT16, OPCUA_INT16_DATA_TYPE);
		put(DataType.UINT16, OPCUA_UINT16_DATA_TYPE);
		put(DataType.INT32, OPCUA_INT32_DATA_TYPE);
		put(DataType.UINT32, OPCUA_UINT32_DATA_TYPE);
		put(DataType.INT64, OPCUA_INT64_DATA_TYPE);
		put(DataType.UINT64, OPCUA_UINT64_DATA_TYPE);
		put(DataType.FLOAT, OPCUA_FLOAT_DATA_TYPE);
		put(DataType.DOUBLE, OPCUA_DOUBLE_DATA_TYPE);
		put(DataType.BOOLEAN, OPCUA_BOOLEAN_DATA_TYPE);
		put(DataType.STRING, OPCUA_STRING_DATA_TYPE);
		
	]
	
	public def static getDataTypeAsNodeIdOf(DataType dataType) {
		
		dataTypeMap.get(dataType)
		
	}
	
}