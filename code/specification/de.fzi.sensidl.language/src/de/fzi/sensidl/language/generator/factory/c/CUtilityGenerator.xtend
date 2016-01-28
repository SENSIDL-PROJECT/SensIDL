package de.fzi.sensidl.language.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger

class CUtilityGenerator implements IUtilityGenerator{
	
	private static Logger logger = Logger.getLogger(CUtilityGenerator)
	private List<MeasurementData> data

	new(List<MeasurementData> newData) {
		this.data = newData
	}
	
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
	
	override addFileExtensionTo(String ClassName) {
		ClassName + SensIDLConstants.HEADER_EXTENSION
	}
	
}