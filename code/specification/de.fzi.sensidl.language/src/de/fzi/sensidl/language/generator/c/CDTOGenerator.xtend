package de.fzi.sensidl.language.generator.c

import com.google.common.base.Strings
import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
import de.fzi.sensidl.language.generator.IDTOGenerator
import java.util.HashMap
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider

/**
* The CDTOGenerator represents a concrete  implementation
* of @see IDTOGenerator
*/
class CDTOGenerator implements IDTOGenerator {
	private static Logger logger = Logger.getLogger(typeof(CDTOGenerator))
	
	private final static String MARSHAL_FILE = "DataMarshalling";
	private final static String HEADER_EXTENSION = ".h";
	private Resource input
	private IFileSystemAccess fsa;
	
	/**
 	* Defines the constructor of CGenerator.
 	* @param input
 	* 			contains all model elements.
 	* @param fsa
 	* 			is needed to generate a file.
 	*/
	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}
	
	/**
	 * Generates the .c files with structs
	 * @see IDTOGenerator#generate()
	 */
	override generate() {
		val filesToInclude = new HashMap<String, String>();
		
		logger.info("Start with code-generation of a c data transfer object.")
		
		for (dataset : input.contents.filter(SensorInterface).head.eAllContents
					.filter(SensorDataDescription).head.eAllContents.toIterable
					.filter(DataSet)) {

			val fileName = addFileExtensionTo(dataset.name.toFirstUpper)
			
			fsa.generateFile(fileName, dataset.compile)
			logger.info("File: " + fileName + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
			
			filesToInclude.put(fileName, dataset.description);
		}
		fsa.generateFile(addFileExtensionTo(MARSHAL_FILE), filesToInclude.compile)
		logger.info("File: " + addFileExtensionTo(MARSHAL_FILE) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
	}
	
	/**
 	* Triggers the code-generation for the
 	* c struct.
 	* @param dataset
 	* 			represents the model element for the struct.
 	*/
	def compile(DataSet dataset) {
		'''«generateStruct(dataset.name.toFirstUpper, dataset)»'''
	}
	
	def compile(HashMap<String, String> filesToInclude) {
		'''«filesToInclude.generateMarshallingFunctionPrototype»'''
	}
	
	/**
	 * Generates a c-header with a prototype of the marshalling-function
	 */
	def generateMarshallingFunctionPrototype(HashMap<String, String> filesToInclude) {
		'''
		/**\brief
		*
		«FOR file : filesToInclude.keySet»
			* «file» «filesToInclude.get(file)»
		«ENDFOR»
		*/		
		
		«FOR file : filesToInclude.keySet»
			#include "«file»"
		«ENDFOR»
		
		
		/**\brief
		*  The function marshalDataSet arrange the data bytes in an array with a defined order.
		*/
		byte[] marshalDataSet(void *dataSet);
		'''
	}

	/**
	 * Generates a struct.
	 * @param structName
	 * 			represents the name of the struct.
	 * @param dataset
	 * 			represents the model element for the struct.
	 */
//	 typedef struct
//	 {
//		«FOR data : dataset.eContents.filter(Data)»
//			«generateVariable(data)»
//		«ENDFOR»
//	 } «dataset.name.toFirstUpper»;
	def generateStruct(String structName, DataSet dataset) {
		'''
			/**\brief		«IF !Strings.isNullOrEmpty(dataset.description)»«dataset.description»«ENDIF»  
			«FOR data : dataset.eContents.filter(Data)»
				«generateDescription(data)»
			«ENDFOR»
			*/
			
			#ifndef «structName.toUpperCase»_H
			#define «structName.toUpperCase»_H
			
			«FOR data : dataset.eContents.filter(Data)»
				«generateVariable(data)»
			«ENDFOR»
			
			#endif
		'''
	}
	
	/**
	 * Generates a description for measured data.
	 * @param data
	 * 			represents data which was measured by a sensor.
	 */
	dispatch def generateDescription(MeasurementData data) {
		'''
			* \param		«data.name»: «IF !Strings.isNullOrEmpty(data.description)»«data.description»«ENDIF»
			*				Measured in unit: «data.unit» 
		'''
	}
	
	/**
	 * Generates a description for non-measured data.
	 * @param data
	 * 			represents variable or constant non-measured data.
	 */
	dispatch def generateDescription(NonMeasurementData data) {
		'''
			* \param		«data.name»: «IF !Strings.isNullOrEmpty(data.description)»«data.description»«ENDIF»
			'''
	}
	
	/**
	 * Generates a c variable for measured data in the struct.
	 * @param data
	 * 			represents data which was measured by a sensor.
	 */
	dispatch def generateVariable(MeasurementData data) {
		'''«data.toTypeName» «data.name.toFirstLower»;'''
	}
	
	/**
	 * Generates a c variable for non-measured data in the struct.
	 * @param data
	 * 			represents variable or constant non-measured data.
	 */
	dispatch def generateVariable(NonMeasurementData data) {
		'''«IF data.constant»const «ENDIF»«data.toTypeName» «data.name.toFirstLower»«IF !Strings.isNullOrEmpty(data.value)» = «data.value»«ENDIF»;'''
	}
	
	/**
	 * Adds the file extension.
	 * @see IDTOGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String ClassName) {
		return ClassName + CDTOGenerator.HEADER_EXTENSION
	}
	
	/**
	 * Maps to the corresponding language type.
	 * @see IDTOGenerator#toTypeName(Data)
	 */
	override toTypeName(Data data) {
		return switch (data.dataType) {
			case INT8: DataTypes.SIGNED_CHAR
			case UINT8: DataTypes.UNSIGNED_CHAR
			case INT16: DataTypes.SIGNED_SHORT
			case UINT16: DataTypes.UNSIGNED_SHORT
			case INT32: DataTypes.SIGNED_LONG
			case UINT32: DataTypes.UNSIGEND_LONG
			case INT64: DataTypes.SIGNED_LONG_LONG
			case UINT64: DataTypes.UNSIGNED_LONG_LONG
			case FLOAT: DataTypes.FLOAT
			case DOUBLE: DataTypes.DOUBLE
		}
	}
	
}