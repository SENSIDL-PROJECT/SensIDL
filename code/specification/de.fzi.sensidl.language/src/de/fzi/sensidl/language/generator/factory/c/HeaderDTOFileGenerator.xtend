package de.fzi.sensidl.language.generator.factory.c

import com.google.common.base.Strings
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import de.fzi.sensidl.language.generator.GenerationUtil

class HeaderDTOGenerator extends CDTOGenerator {

	private static Logger logger = Logger.getLogger(HeaderDTOGenerator)

	new(List<DataSet> newDataSet) {
		super(newDataSet)
	}

	/**
	 * Generates the .c files with structs
	 * @see IDTOGenerator#generate()
	 */
	override HashMap<String,CharSequence> generate() {
		logger.info("Start with code-generation of the data transfer object header-file.")
		val filesToGenerate = new HashMap()

		for (dataset : this.dataSet) {

			val fileName = addFileExtensionTo(GenerationUtil.toNameUpper(dataset))

			filesToGenerate.put(fileName, generateStruct(dataset.name.toFirstUpper, dataset))
			logger.info("File: " + fileName + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
		}
		
		filesToGenerate
	}

	/**
	 * Triggers the code-generation for the
	 * c struct type definition.
	 * @param dataset
	 * 			represents the model element for the struct.
	 */
	def compile(DataSet dataset) {
		'''«generateStruct(GenerationUtil.toNameUpper(dataset), dataset)»'''
	}

	/**
	 * Generates a typedefinition of a struct.
	 * @param structName
	 * 			represents the name of the struct.
	 * @param dataset
	 * 			represents the model element for the struct.
	 */
	def generateStruct(String structName, DataSet dataset) {
		'''
			/**\brief		«IF !Strings.isNullOrEmpty(dataset.description)»«dataset.description»«ENDIF»  
			«FOR data : dataset.eContents.filter(Data)»
				«generateDescription(data)»
			«ENDFOR»
			*/
			
			#ifndef «structName.toUpperCase»_H
			#define «structName.toUpperCase»_H
			
			#include <stdint.h>
			
			typedef struct
			{
				«FOR data : dataset.eContents.filter(Data)»
					«generateVariable(data)»
				«ENDFOR»
			} «GenerationUtil.toNameUpper(dataset)»;
			
			extern «GenerationUtil.toNameUpper(dataset)» «GenerationUtil.toNameLower(dataset)»;
			
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
		'''«data.toTypeName» «GenerationUtil.toNameLower(data)»;'''
	}

	/**
	 * Generates a c variable for non-measured data in the struct.
	 * @param data
	 * 			represents variable or constant non-measured data.
	 */
	dispatch def generateVariable(NonMeasurementData data) {
		'''«IF data.constant»const «ENDIF»«data.toTypeName» «GenerationUtil.toNameLower(data)»«IF !Strings.isNullOrEmpty(data.value)» = «data.value»«ENDIF»;'''
	}

	/**
	 * Adds the file extension.
	 * @see IDTOGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String className) {
		return className + SensIDLConstants.HEADER_EXTENSION
	}
}