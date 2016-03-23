package de.fzi.sensidl.language.generator.factory.java

import de.fzi.sensidl.design.sensidl.Endianness
import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject

class JavaUtilityGenerator implements IUtilityGenerator {
	private static Logger logger = Logger.getLogger(JavaUtilityGenerator)
	private List<MeasurementData> data
	private SensorInterface currentSensorInterface;

	private boolean createProject = false
	private boolean bigEndian
	
	/**
	 * The constructor calls the constructor of the superclass to set a
	 * list of elements.
	 * @param newData - represents the list of EObject-elements.
	 */
	new(List<EObject> newData) {
		this.data = newData.filter(MeasurementData).toList
		currentSensorInterface = newData.filter(SensorInterface).get(0);
	}

	/**
	 * The constructor calls the constructor of the superclass to set a
	 * list of Data-elements and a member-variable.
	 * @param newData - represents the list of DataSet-elements.
	 * @param createProject - indicates if a project should be created.
	 */
	new(List<EObject> newData, boolean createProject) {
		this.data = newData.filter(MeasurementData).toList
		currentSensorInterface = newData.filter(SensorInterface).get(0);
		this.createProject = createProject
	}
	
	/**
	 * Generates the .java file for the utility-class.
	 * @see IDTOGenerator#generate()
	 */
	override generate() {
		logger.info("Start with code-generation of the java utility class.")

		val filesToGenerate = new HashMap
		val utilityName = GenerationUtil.getUtilityName(this.currentSensorInterface)
	
		bigEndian = (this.currentSensorInterface.encodingSettings.endianness == Endianness.BIG_ENDIAN)
	
		// if a Plug-in Project is generated the file has to be generated to another path
		if (createProject) {
			filesToGenerate.put(
				"src/de/fzi/sensidl/" + GenerationUtil.getSensorInterfaceName(this.currentSensorInterface) + "/" +
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
				package de.fzi.sensidl.«GenerationUtil.getSensorInterfaceName(this.currentSensorInterface)»;
				 
			«ENDIF» 
			
			«IF !bigEndian»
				import java.nio.ByteBuffer;
				import java.nio.ByteOrder;
			«ENDIF» 
			
			/**
			 * Data transfer object for «className»
			 *
			 * @generated
			 */
			class «className» {
				«IF this.data.size > 0»
					«generateConversionMethods»
				«ENDIF»
				
				«IF !bigEndian»
					«generateEndiannessConverterMethods»
				«ENDIF»
			}
		'''
	}
	
	def generateConversionMethods() {
		'''
		«IF this.data.exists[data | data.adjustments.get(0) instanceof LinearDataConversion]»
			«generateLinearDataConversionMethod»
			«generateGetMaxValueOfMethod»
		«ENDIF»
		
		«IF this.data.exists[data | data.adjustments.get(0) instanceof LinearDataConversionWithInterval]»
				«generateLinearDataConversionWithIntervalMethod»
		«ENDIF»
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
	
	def generateEndiannessConverterMethods() {
	'''
		/**
		 * Converts a big endian float into a little endian float
		 *	
		 * @param num the float to convert
		 * @return float the converted float
		 *
		 */
		public static float convertToLittleEndian(float num) {
			byte[] bytes = new byte[4];
			ByteBuffer.wrap(bytes).putFloat(num);
			return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getFloat();
		}
		
		/**
		 * Converts a big endian double into a little endian double
		 *	
		 * @param num the double to convert
		 * @return double the converted double
		 *
		 */
		public static double convertToLittleEndian(double num) {
			byte[] bytes = new byte[8];
			ByteBuffer.wrap(bytes).putDouble(num);
			return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getDouble();
		}
		
		/**
		 * Converts a big endian byte into a little endian byte
		 *	
		 * @param num the byte to convert
		 * @return byte the converted byte
		 *
		 */
		public static byte convertToLittleEndian(byte num) {
			return num;
		}
		
		/**
		 * Converts a big endian short into a little endian short
		 *	
		 * @param num the short to convert
		 * @return short the converted short
		 *
		 */
		public static short convertToLittleEndian(short num) {
			return Short.reverseBytes(num);
		}
		
		/**
		 * Converts a big endian int into a little endian int
		 *	
		 * @param num the int to convert
		 * @return int the converted int
		 *
		 */
		public static int convertToLittleEndian(int num) {
			return Integer.reverseBytes(num);
		}
		
		/**
		 * Converts a big endian long into a little endian long
		 *	
		 * @param num the long to convert
		 * @return long the converted long
		 *
		 */
		public static long convertToLittleEndian(long num) {
			return Long.reverseBytes(num);
		}
		
		/**
		 * Converts a big endian String into a little endian String
		 *	
		 * @param str the String to convert
		 * @return String the converted String
		 *
		 */
		public String convertToLittleEndian(String str) {
			//TODO: implement Method
			return str;
		}
		
		/**
		 * Converts a big endian boolean into a little endian boolean
		 *	
		 * @param bool the boolean to convert
		 * @return boolean the converted boolean
		 *
		 */
		public boolean convertToLittleEndian(boolean bool) {
			//TODO: implement Method
			return bool;
		}
	'''
	}

	override addFileExtensionTo(String ClassName) {
		ClassName + SensIDLConstants.JAVA_EXTENSION
	}

}
