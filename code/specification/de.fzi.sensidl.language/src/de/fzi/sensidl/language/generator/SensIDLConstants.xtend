package de.fzi.sensidl.language.generator

class SensIDLConstants {
	public static val C_EXTENSION = ".c"
	public static val MARSHAL_FILE = "DataMarshalling"
	public static val HEADER_EXTENSION = ".h"
	public static val CSharp_EXTENSION = ".cs"
	public static val JAVA_EXTENSION = ".java"
	public static val JAVASCRIPT_EXTENSION = ".js"
	public static val UTILITY_CLASS_NAME = "Utility"
	public static val LINEAR_CONVERSION_METHOD_NAME = "linearConversion"
	public static val LINEAR_CONVERSION_WITH_INTERVAL_METHOD_NAME = "linearConversionWithInterval"
	
	public enum GenerationLanguage {
		NONE,
		ALL,
		JAVA,
		JAVASCRIPT,
		CSHARP,
		C
	}
}