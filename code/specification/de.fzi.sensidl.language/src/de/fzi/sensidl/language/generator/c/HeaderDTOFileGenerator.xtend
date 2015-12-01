package de.fzi.sensidl.language.generator.c

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

//import com.google.common.base.Strings
//import de.fzi.sensidl.design.sensidl.SensorInterface
//import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
//import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
//import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
//import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
//import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
//import de.fzi.sensidl.language.generator.IDTOGenerator
//import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
//import org.apache.log4j.Logger
//import org.eclipse.emf.ecore.resource.Resource
//import org.eclipse.xtext.generator.IFileSystemAccess

class HeaderDTOGenerator extends CDTOGenerator {
	
	new(Resource input, IFileSystemAccess fsa) {
		super(input, fsa)
	}
	
	override generate() {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override addFileExtensionTo(String ClassName) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
//	private static Logger logger = Logger.getLogger(HeaderDTOGenerator)
//	
//	new(Resource input, IFileSystemAccess fsa) {
//		super(input, fsa)
//	}
//	
//	/**
//	 * Generates the .c files with structs
//	 * @see IDTOGenerator#generate()
//	 */
//	override generate() {
//		logger.info("Start with code-generation of the data transfer object header-file.")
//		
//		for (dataset : input.contents.filter(SensorInterface).head.eAllContents
//					.filter(SensorDataDescription).head.eAllContents.toIterable
//					.filter(DataSet)) {
//
//			val fileName = addFileExtensionTo(dataset.name.toFirstUpper)
//			
//			fsa.generateFile(fileName, dataset.compile)
//			logger.info("File: " + fileName + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
//		}
//	}
//	
//	/**
// 	* Triggers the code-generation for the
// 	* c struct type definition.
// 	* @param dataset
// 	* 			represents the model element for the struct.
// 	*/
//	def compile(DataSet dataset) {
//		'''«generateStruct(dataset.name.toFirstUpper, dataset)»'''
//	}
//
//	/**
//	 * Generates a typedefinition of a struct.
//	 * @param structName
//	 * 			represents the name of the struct.
//	 * @param dataset
//	 * 			represents the model element for the struct.
//	 */
//	def generateStruct(String structName, DataSet dataset) {
//		'''
//			/**\brief		«IF !Strings.isNullOrEmpty(dataset.description)»«dataset.description»«ENDIF»  
//			«FOR data : dataset.eContents.filter(Data)»
//				«generateDescription(data)»
//			«ENDFOR»
//			*/
//			
//			#ifndef «structName.toUpperCase»_H
//			#define «structName.toUpperCase»_H
//			
//			#include <stdint.h>
//			
//			typedef struct
//			{
//				«FOR data : dataset.eContents.filter(Data)»
//					«generateVariable(data)»
//				«ENDFOR»
//			} «dataset.name.toFirstUpper»;
//			
//			extern «dataset.name.toFirstUpper» «dataset.name.toFirstLower»;
//			
//			#endif
//		'''
//	}
//	
//	/**
//	 * Generates a description for measured data.
//	 * @param data
//	 * 			represents data which was measured by a sensor.
//	 */
//	dispatch def generateDescription(MeasurementData data) {
//		'''
//			* \param		«data.name»: «IF !Strings.isNullOrEmpty(data.description)»«data.description»«ENDIF»
//			*				Measured in unit: «data.unit» 
//		'''
//	}
//	
//	/**
//	 * Generates a description for non-measured data.
//	 * @param data
//	 * 			represents variable or constant non-measured data.
//	 */
//	dispatch def generateDescription(NonMeasurementData data) {
//		'''
//			* \param		«data.name»: «IF !Strings.isNullOrEmpty(data.description)»«data.description»«ENDIF»
//			'''
//	}
//	
//	/**
//	 * Generates a c variable for measured data in the struct.
//	 * @param data
//	 * 			represents data which was measured by a sensor.
//	 */
//	dispatch def generateVariable(MeasurementData data) {
//		'''«data.toTypeName» «data.name.toFirstLower»;'''
//	}
//	
//	/**
//	 * Generates a c variable for non-measured data in the struct.
//	 * @param data
//	 * 			represents variable or constant non-measured data.
//	 */
//	dispatch def generateVariable(NonMeasurementData data) {
//		'''«IF data.constant»const «ENDIF»«data.toTypeName» «data.name.toFirstLower»«IF !Strings.isNullOrEmpty(data.value)» = «data.value»«ENDIF»;'''
//	}
//	
//	/**
//	 * Adds the file extension.
//	 * @see IDTOGenerator#addFileExtensionTo(String)
//	 */
//	override addFileExtensionTo(String className) {
//		return className + HEADER_EXTENSION
//	}
}