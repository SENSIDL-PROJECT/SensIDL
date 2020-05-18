package de.fzi.sensidl.generator.templates.java.opcua

import java.util.HashMap
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType

class OpcUaDataType {
	
	static val OPCUA_INT8_DATA_TYPE = "Identifiers.Byte"
	static val OPCUA_UINT8_DATA_TYPE = "Identifiers.Byte"
	static val OPCUA_INT16_DATA_TYPE = "Identifiers.Int16"
	static val OPCUA_UINT16_DATA_TYPE = "Identifiers.UInt16"
	static val OPCUA_INT32_DATA_TYPE = "Identifiers.Int32"
	static val OPCUA_UINT32_DATA_TYPE = "Identifiers.UInt32"
	static val OPCUA_INT64_DATA_TYPE = "Identifiers.Int64"
	static val OPCUA_UINT64_DATA_TYPE = "Identifiers.UInt64"
	static val OPCUA_FLOAT_DATA_TYPE = "Identifiers.Float"
	static val OPCUA_DOUBLE_DATA_TYPE = "Identifiers.Double"
	static val OPCUA_BOOLEAN_DATA_TYPE = "Identifiers.Boolean"
	static val OPCUA_STRING_DATA_TYPE = "Identifiers.String"
	
	static val dataTypeMap = new HashMap() => [
		
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
	
	def static getDataTypeAsNodeIdOf(DataType dataType) {
		
		dataTypeMap.get(dataType)
		
	}
	
}
