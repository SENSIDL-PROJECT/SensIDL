package de.fzi.sensidl.language.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger

/**
 * C code generator for the utility header-file.
 */
class CUtilityGenerator implements IUtilityGenerator{
	
	private static Logger logger = Logger.getLogger(CUtilityGenerator)
	private List<MeasurementData> data

	/**
	 * The constructor calls the constructor of the superclass to set a list of Data-elements.
	 * @param newData Represents the list of DataSet-elements.
	 */
	new(List<MeasurementData> newData) {
		this.data = newData
	}
	
	/**
	 * @see IUtilityGenerator#generate()
	 */
	override generate() {
		logger.info("Start with code-generation of the java utility class.")

		val filesToGenerate = new HashMap
		val utilityName = GenerationUtil.getUtilityName(this.data.get(0))

		filesToGenerate.put(addFileExtensionTo(utilityName), generateUtility(utilityName))

		logger.info("File: " + addFileExtensionTo(utilityName) + " was generated in " +
			SensIDLOutputConfigurationProvider.SENSIDL_GEN)

		filesToGenerate	
	}
	
	//TODO implement the utility class.
	def generateUtility(String string) {
		'''
			#include <stdbool.h>
		'''
	}
	
	/**
	 * @see IUtilityGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String ClassName) {
		ClassName + SensIDLConstants.HEADER_EXTENSION
	}
	
}