package de.fzi.sensidl.language.generator.factory.java

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject

class JavaUtilityGenerator implements IUtilityGenerator {
	private static Logger logger = Logger.getLogger(JavaUtilityGenerator)
	private List<MeasurementData> data
	
	new(List<MeasurementData> newData) {
		this.data = newData
	}
	
	
	override generate() {
		logger.info("Start with code-generation of the java utility class.")
		
		val filesToGenerate = new HashMap
		val fileName = this.data.get(0).eContainer.getSensorInterfaceName + SensIDLConstants.UTILITY_CLASS_NAME
			
		filesToGenerate.put(addFileExtensionTo(fileName), generateClassBody(fileName))
		
		logger.info("File: " + addFileExtensionTo(fileName) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
		
		filesToGenerate
	}
	
	def String getSensorInterfaceName(EObject currentElement) {
		if(currentElement instanceof SensorInterface) {
			return (currentElement as SensorInterface).name
		}
		return currentElement.eContainer.sensorInterfaceName
	}
	
	def generateClassBody(String className) {
		'''
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
	
	def generateLinearDataConversionWithIntervalMethod() {
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
	
	def generateLinearDataConversionMethod() {
		val dataType = "double"
		'''
			public static «dataType» «SensIDLConstants.LINEAR_CONVERSION_WITH_INTERVAL_METHOD_NAME»(Number independentVariable, «dataType» x_min, «dataType» x_max, «dataType» y_min, «dataType» y_max) throws IllegalArgumentException {
				// Conversion is calculated by the mapping rule f(x) = (x_max - x_min)*((x - y_min)/(y_max - y_min))
				if (independentVariable.doubleValue() < x_min || independentVariable.doubleValue() > x_max) {
					throw new IllegalArgumentException("The value is larger than specified minimal and maximal range.");
				}
			
				return (y_max - y_min)*((independentVariable.doubleValue() - x_min)/(x_max - x_min));
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
	
	override addFileExtensionTo(String ClassName) {
		ClassName + SensIDLConstants.JAVA_EXTENSION
	}
	
}