package de.fzi.sensidl.language.generator.c

import java.util.HashMap
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType

/**
 * Contains the language specific c type strings.
 */
class DataTypes {
	private static val String SIGNED_CHAR = "char";
	private static val String UNSIGNED_CHAR = "unsigned char";
	private static val String SIGNED_SHORT = "short";
	private static val String UNSIGNED_SHORT = "unsigned short";
	private static val String SIGNED_LONG = "long";
	private static val String UNSIGEND_LONG = "unsigned long";
	private static val String SIGNED_LONG_LONG = "long long";
	private static val String UNSIGNED_LONG_LONG = "unsigned long long";
	private static val String FLOAT = "float";
	private static val String DOUBLE = "double";
	
	private static val dataTypesMap = new HashMap() => [
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
	] 
	
	def static String getDataTypeBy(DataType dataType) {
		return dataTypesMap.get(dataType)
	}
}