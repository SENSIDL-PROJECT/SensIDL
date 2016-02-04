package de.fzi.sensidl.language.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger

/**
 * This Generator generates the main header file which includes all header files of 
 * all generated DTO structs.
 */
class MainDTOHeaderFileGenerator extends CDTOGenerator {
	
	private static Logger logger = Logger.getLogger(MainDTOHeaderFileGenerator)
	
	new(List<DataSet> newDataSet) {
		super(newDataSet)
	}
	
	/**
	 * Generates the main header file which includes all header files of all generated
	 * DTO structs.
	 * @see IDTOGenerator#generate()
	 */
	override generate() {
		logger.info("Start with code-generation of the header-file which includes all headers of the generated DTO structs.")
		val filesToGenerate = new HashMap()
		val fileName = addFileExtensionTo(SensIDLConstants.MAIN_HEADER_FILE_NAME)
		
		filesToGenerate.put(fileName, generateStruct())
		logger.info("File: " + fileName + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
				
		filesToGenerate
	}
	
	def generateStruct() {
		'''
		«FOR dataset : this.dataSets»
			#include "«addFileExtensionTo(GenerationUtil.toNameUpper(dataset))»"
		«ENDFOR»
		'''
	}
	
	override addFileExtensionTo(String ClassName) {
		ClassName + SensIDLConstants.HEADER_EXTENSION
	}
	
}