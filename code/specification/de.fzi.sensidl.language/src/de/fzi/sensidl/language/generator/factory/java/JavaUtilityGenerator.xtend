package de.fzi.sensidl.language.generator.factory.java

import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger

/**
 * Java code generator for the utility class.
 */
class JavaUtilityGenerator implements IUtilityGenerator {
	private static Logger logger = Logger.getLogger(JavaUtilityGenerator)
	private List<MeasurementData> data

	private boolean createProject = false

	/**
	 * The constructor calls the constructor of the superclass to set a list of Data-elements.
	 * @param newData Represents the list of DataSet-elements.
	 */
	new(List<MeasurementData> newData) {
		this.data = newData
	}

	/**
	 * The constructor calls the constructor of the superclass to set a list of Data-elements
	 * and a member-variable.
	 * @param newData 		Represents the list of DataSet-elements.
	 * @param createProject Indicates if a project should be created.
	 */
	new(List<MeasurementData> newData, boolean createProject) {
		this.data = newData
		this.createProject = createProject
	}
	
	/**
	 * @see IUtilityGenerator#generate()
	 */
	override generate() {
		logger.info("Start with code-generation of the java utility class.")

		val filesToGenerate = new HashMap
		val utilityName = GenerationUtil.getUtilityName(this.data.get(0))

		// if a Plug-in Project is generated the file has to be generated to another path
		if (createProject) {
			filesToGenerate.put(
				"src/de/fzi/sensidl/" + GenerationUtil.getSensorInterfaceName(this.data.get(0).eContainer) + "/" +
					addFileExtensionTo(utilityName), generateClassBody(utilityName))
		} else {
			filesToGenerate.put(addFileExtensionTo(utilityName), generateClassBody(utilityName))
		}

		logger.info("File: " + addFileExtensionTo(utilityName) + " was generated in " +
			SensIDLOutputConfigurationProvider.SENSIDL_GEN)

		filesToGenerate
	}

	def generateClassBody(String className) {
		'''
			«IF createProject»
				package de.fzi.sensidl.«GenerationUtil.getSensorInterfaceName(this.data.get(0).eContainer)»;
				 
			«ENDIF» 
			/**
			 * Data transfer object for «className»
			 *
			 * @generated
			 */
			class «className» {
				«IF this.data.exists[data | data.adjustments.get(0) instanceof LinearDataConversion]»
					«generateLinearDataConversionMethod»
					«generateGetMaxValueOfMethod»
				«ENDIF»
				
				«IF this.data.exists[data | data.adjustments.get(0) instanceof LinearDataConversionWithInterval]»
					«generateLinearDataConversionWithIntervalMethod»
				«ENDIF»
			}
		'''
	}

	def generateLinearDataConversionMethod() {
		val dataType = "double"
		'''
			public static «dataType» «SensIDLConstants.LINEAR_CONVERSION_METHOD_NAME»(Number independentVariable, «dataType» scalingFactor, «dataType» offset) throws IllegalArgumentException {
				// Conversion is calculated by the linear-function f(x) = m*x + b
				double calculatedValue = (scalingFactor * independentVariable.doubleValue()) + offset;
				
				if (getMaxValueOf(independentVariable) >= calculatedValue) {
					return calculatedValue;
				} else {
					throw new IllegalArgumentException("The value is larger than the range of the data type.");
				}
			}
		'''
	}

	def generateLinearDataConversionWithIntervalMethod() {
		val dataType = "double"
		'''
			public static «dataType» «SensIDLConstants.LINEAR_CONVERSION_WITH_INTERVAL_METHOD_NAME»(Number independentVariable, «dataType» oldMin, «dataType» oldMax, «dataType» newMin, «dataType» newMax) throws IllegalArgumentException {
				// Conversion is calculated by the mapping rule f(x) = (((x - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin
				if (independentVariable.doubleValue() < oldMin || independentVariable.doubleValue() > oldMax) {
					throw new IllegalArgumentException("The value is larger than specified minimal and maximal range.");
				}
			
				return (((independentVariable.doubleValue() - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin;
			}
		'''
	}

	private def generateGetMaxValueOfMethod() {
		'''
			private static double getMaxValueOf(Number number) {
				if (number instanceof Byte) {
					return Byte.MAX_VALUE;	
				} else if (number instanceof Short) {
					return Short.MAX_VALUE;	
				} else if (number instanceof Integer) {
					return Integer.MAX_VALUE;
				} else if (number instanceof Long) {
					return Long.MAX_VALUE;
				} else if (number instanceof Float) {
					return Float.MAX_VALUE;
				} else {
					return Double.MAX_VALUE;
				}
			}
		'''
	}

	/**
	 * @see IUtilityGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String ClassName) {
		ClassName + SensIDLConstants.JAVA_EXTENSION
	}

}