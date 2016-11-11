package de.fzi.sensidl.language.generator

import java.util.HashMap

/**
 * This class should provide a common place for specific sensidl constants.
 */
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
	public static val MAIN_HEADER_FILE_NAME = "DTOs"
	public static val JAVA_CONVERT_ALL_TO_LITTLE_ENDIAN_METHOD_NAME = "convertAllToLittleEndian"
	
	private static val PUBLIC_IDENTIFIER = "+";
	private static val PROTECTED_IDENTIFIER = "#";
	private static val EMPTY_IDENTIFIER = "";
	private static val PRIVATE_IDENTIFIER = "-";
	private static val PUBLIC_VISIBILITY = "public";
	private static val PROTECTED_VISIBILITY = "protected";
	private static val EMPTY_VISIBILITY = "";
	private static val PRIVATE_VISIBLITY = "private";
	private static HashMap<String, String> identifierToVisibility;
	

	public enum GenerationLanguage {
		NONE,
		ALL,
		JAVA,
		JAVA_PLUGIN_PROJECT,
		JAVASCRIPT,
		CSHARP,
		C,
		OPCUA,
		PLAINTEXT
	}
	
	def static String getVisibilityOf(String visibilityIdentifier) {
		instantiateIfNecessary
		
		identifierToVisibility.get(visibilityIdentifier)
	}
	
	def static String getDefaultVisibility() {
		instantiateIfNecessary
		
		identifierToVisibility.get(PRIVATE_IDENTIFIER)
	}
	
	private static def instantiateIfNecessary() {
		if (identifierToVisibility == null) {
			identifierToVisibility = new HashMap<String, String> => [
				put(PUBLIC_IDENTIFIER, PUBLIC_VISIBILITY)
				put(PRIVATE_IDENTIFIER, PRIVATE_VISIBLITY)
				put(PROTECTED_IDENTIFIER, PROTECTED_VISIBILITY)
				put(EMPTY_IDENTIFIER, EMPTY_VISIBILITY)
			]
		}
	}
}