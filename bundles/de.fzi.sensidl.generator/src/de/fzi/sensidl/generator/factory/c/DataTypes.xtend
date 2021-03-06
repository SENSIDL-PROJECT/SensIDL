package de.fzi.sensidl.generator.factory.c

import java.util.HashMap
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType

/**
 * Contains the language specific c type strings.
 */
class DataTypes {
	static val String SIGNED_CHAR = "int8_t";
	static val String UNSIGNED_CHAR = "uint8_t";
	static val String SIGNED_SHORT = "int16_t";
	static val String UNSIGNED_SHORT = "uint16_t";
	static val String SIGNED_LONG = "int32_t";
	static val String UNSIGEND_LONG = "uint32_t";
	static val String SIGNED_LONG_LONG = "int64_t";
	static val String UNSIGNED_LONG_LONG = "uint64_t";
	static val String FLOAT = "float";
	static val String DOUBLE = "double";
	static val String BOOLEAN = "bool";
	static val String STRING = "char *";
	
	static val dataTypesMap = new HashMap() => [
		put(DataType.INT8, SIGNED_CHAR)
		put(DataType.UINT8, UNSIGNED_CHAR)
		put(DataType.INT16, SIGNED_SHORT)
		put(DataType.UINT16, UNSIGNED_SHORT)
		put(DataType.INT32, SIGNED_LONG)
		put(DataType.UINT32, UNSIGEND_LONG)
		put(DataType.INT64, SIGNED_LONG_LONG)
		put(DataType.UINT64, UNSIGNED_LONG_LONG)
		put(DataType.FLOAT, FLOAT)
		put(DataType.DOUBLE, DOUBLE)
		put(DataType.BOOLEAN, BOOLEAN)
		put(DataType.STRING, STRING)
	] 
	
	/**
	 * Maps a given DataType to the C equivalent data type.
	 * @param dataType Corresponds to the specified sensidl data type.
	 * @return the C equivalent data type.
	 */
	def static String getDataTypeBy(DataType dataType) {
		return dataTypesMap.get(dataType)
	}
}