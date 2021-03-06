package de.fzi.sensidl.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.generator.GenerationUtil
import de.fzi.sensidl.generator.SensIDLConstants
import de.fzi.sensidl.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.generator.factory.IDTOGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for 
 * the main header file which includes all header files of all generated DTO structs.
 */
class MainDTOHeaderFileGenerator extends CDTOGenerator {
	
	static Logger logger = Logger.getLogger(MainDTOHeaderFileGenerator)
	
	/**
	 * The constructor calls the constructor of the superclass to set a list of DataSet-elements.
	 * @param newDataSet Represents the list of DataSet-elements.
	 */
	new(List<DataSet> newDataSet) {
		super(newDataSet)
	}
	
	/**
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