package de.fzi.sensidl.language.generator.factory.c

import com.google.common.base.Strings
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import java.util.ArrayList
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
import de.fzi.sensidl.design.sensidl.dataRepresentation.ListData

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for 
 * the generation of the header-files.
 */
class HeaderDTOGenerator extends CDTOGenerator {

	private static Logger logger = Logger.getLogger(HeaderDTOGenerator)
	
	/**
	 * The constructor calls the constructor of the superclass to set a list of DataSet-elements.
	 * @param newDataSet Represents the list of DataSet-elements.
	 */
	new(List<DataSet> newDataSet) {
		super(newDataSet)
	}

	/**
	 * Triggers the code-generation for the C-struct type definition.
	 * @param dataset Represents the model element for the struct.
	 */
	def compile(DataSet dataset) {
		'''«generateStruct(dataset.name.toFirstUpper, dataset)»'''
	}

	/**
	 * @see IDTOGenerator#generate()
	 */
	override HashMap<String,CharSequence> generate() {
		logger.info("Start with code-generation of the data transfer object header-file.")
		val filesToGenerate = new HashMap()

		for (dataset : this.dataSets) {
			val fileName = addFileExtensionTo(GenerationUtil.toNameUpper(dataset))

			filesToGenerate.put(fileName, generateStruct(dataset.name.toFirstUpper, dataset))
			logger.info("File: " + fileName + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
		}
		
		filesToGenerate
	}

	/**
	 * Generates a typedefinition of a struct.
	 * @param structName Represents the name of the struct.
	 * @param dataset Represents the model element for the struct.
	 */
	def generateStruct(String structName, DataSet dataset) {		
		'''
			/**\brief		«IF !Strings.isNullOrEmpty(dataset.description)»«dataset.description»«ENDIF»  
			«FOR data : dataset.eContents.filter(Data)»
				«IF !(data instanceof ListData)»
					«generateDescription(data)»
				«ENDIF»
			«ENDFOR»
			*/
			
			#ifndef «structName.toUpperCase»_H
			#define «structName.toUpperCase»_H
			
			#include <stdint.h> 
			#include "«GenerationUtil.getUtilityFileName(dataset, SensIDLConstants.HEADER_EXTENSION)»"
						
						
			typedef struct
			{
					«generateDataFieldsIncludeParentDataSet(dataset)»
							
			} «GenerationUtil.toNameUpper(dataset)»;
			
			extern «GenerationUtil.toNameUpper(dataset)» «GenerationUtil.toNameLower(dataset)»;

			«generateInitDatasetPrototype(dataset)»
			
			«generateDataMethodsPrototypesIncludeParentDataSet(dataset)»
						
			«generateEndiannessMethodsPrototypes(dataset)»

			#endif
		'''
	}
	
	def generateEndiannessMethodsPrototypes(DataSet d){
		'''
			«generateAdjustAllEndiannessPrototype(d)»
			
			«generateCheckLittleEndianPrototype()»
			
			«generateSwapEndiannessOnDemandPrototype(d)»
		'''			
	}
	
	/**
	 * Generates the data fields for this data set including used data sets.
	 */
	def generateDataFieldsIncludeParentDataSet(DataSet d) {
		var dataSets = new ArrayList<DataSet>() => [
			add(d)
			addAll(d.parentDataSet)
		]
		var dataFieldsString =''''''
				
		for (dataSet : dataSets) {
			for (data : dataSet.data) {
				dataFieldsString += generateVariable(data)
				dataFieldsString += System.getProperty("line.separator");
			}
		}
		
		//Remove all empty lines
		return dataFieldsString.replaceAll("(?m)^[ \t]*\r?\n", "");
	}
	
	/** 
	 * Generates the Init Method for the dataset initialization
	 */	
	def generateInitDatasetPrototype(DataSet dataset) {
		'''
		/**
		* @Initialization of the «dataset.name.toFirstUpper» dataset (to give the initial values to const fields)
		*/
		void init«dataset.name.toFirstUpper»(«dataset.name.toFirstUpper»* p);
		'''		
	}
	
	/**
	 * Generates the getter and setter methods prototypes for the data of this data set including used data sets.
	 */
	def generateDataMethodsPrototypesIncludeParentDataSet(DataSet d) {
		var dataSets = new ArrayList<DataSet>() => [
			add(d)
			addAll(d.parentDataSet)
		]
		var methodsString =''''''
		var parentDataSet = d		
		for (dataSet : dataSets) {
	
			for (data : dataSet.eContents.filter(NonMeasurementData)) {
				if (!data.excludedMethods.contains("getter")){
					methodsString += generateGetterPrototype(data, parentDataSet)
					methodsString += System.getProperty("line.separator");
				}
				if (!data.excludedMethods.contains("setter")){
					methodsString += generateSetterPrototype(data, parentDataSet)
					methodsString += System.getProperty("line.separator");
				}
			}
			for (data : dataSet.eContents.filter(MeasurementData)) {
				if (!data.excludedMethods.contains("getter")){
					methodsString += generateGetterPrototype(data, parentDataSet)
					methodsString += System.getProperty("line.separator");
				}
				if (!data.excludedMethods.contains("setter")){				
					methodsString += generateSetterPrototype(data, parentDataSet)
					methodsString += System.getProperty("line.separator"); 
				}
			}
		}
		return methodsString;
	}	
	
	/** 
	 * Generates the Getter Method for the measurement data
	 */
	dispatch def generateGetterPrototype(MeasurementData d, DataSet dataset) {
		'''
		«var dataType = d.getReturnDataType»
		
		«IF d.isAdjustedByLinearConversionWithInterval»
		«generatedAdjustedGetterPrototypes(d, dataset)»
		«ELSE»		
		/**
		* @return the «d.name.toFirstUpper»
		*/
		«dataType» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p);
	
		«ENDIF»				
		'''
	}
	
 	/**
 	 * Generates the Getter Method for adjusted measurement data
 	 */
 	def generatedAdjustedGetterPrototypes(MeasurementData d, DataSet dataset) {
 		'''
 		/**
 		* @return the adjusted «d.name.toFirstUpper»
 		*/
 		«d.getReturnDataType» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p);
 		
		/**
 		* @return the not adjusted «d.name.toFirstUpper»
 		*/
 		«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»NotAdjusted(«dataset.name.toFirstUpper»* p); 		
 		
 		'''
 	}	
	 
	
	def getReturnDataType(MeasurementData d) {
		if (d.isAdjustedByLinearConversionWithInterval) {
			return DataTypes.getDataTypeBy(GenerationUtil.getDataTypeOfDataConversionAdjustment(d))
		}
		
		d.toTypeName
	}
	
	/**
	 * Checks, if the given MeasurementData-element was specified to be adjusted as linear conversion.
	 */
	def isAdjustedByLinearConversionWithInterval(MeasurementData data) {
		return ((data.adjustments.size > 0) && (data.adjustments.get(0) instanceof LinearDataConversionWithInterval))
	}
	
	/** 
	 * Generates the Setter Method for the measurement data
	 */	
	dispatch def generateSetterPrototype(MeasurementData d, DataSet dataset) {
		'''	
		/**
		 * @param pointer to dataset, «d.name.toFirstLower»
		 *			the «d.name.toFirstLower» to set
		 */
		void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» );
		
		'''
	}
		
	/** 
	 * Generates the Getter Method for the non measurement data
	 */
	dispatch def generateGetterPrototype(NonMeasurementData d, DataSet dataset) {
		'''
		/**
		* @return the «d.name.toFirstUpper»
		*/
		«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p);
		
		'''
	}
	
	/** 
	 * Generates the Setter Method for the non measurement data
	 */	
	dispatch def generateSetterPrototype(NonMeasurementData d, DataSet dataset) {
		'''
		«IF !d.constant»			
		/**
		 * @param pointer to dataset, «d.name.toFirstLower»
		 *			the «d.name.toFirstLower» to set
		 */
		void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» );
		«ELSE»
		// no setter for constant value
		«ENDIF»
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
 		'''
 		«data.toTypeName» «GenerationUtil.toNameLower(data)»;
 		«IF data.isAdjustedByLinearConversionWithInterval»
 		«data.getReturnDataType» «GenerationUtil.toNameLower(data)»Adjusted;
 		«ENDIF»
 		'''
 	}	

	/**
	 * Generates a c variable for non-measured data in the struct.
	 * @param data
	 * 			represents variable or constant non-measured data.
	 */
	dispatch def generateVariable(NonMeasurementData data) {
		'''«data.toTypeName» «GenerationUtil.toNameLower(data)»;'''
	}
	
 	dispatch def generateVariable(ListData data) {
 		'''
		«data.getListType» «GenerationUtil.toNameLower(data)»[10]; // static list of length 10 (does a dynamic list fit the requierements?)
 		'''
 	}
 	
 				/**
	 * return the type of the list
	 */
	def getListType(ListData data){
		if (data.dataType != DataType.UNDEFINED){
			return data.dataType.toTypeName
		} else if (data.dataTypeDataSet != null){
			return data.dataTypeDataSet.name
		}
	}
	
/**
	 * Generates a method to adjust endianness of all struct variables.
	 * @param dataset
	 */
	def generateAdjustAllEndiannessPrototype(DataSet dataset) {
		'''
		/**
		* Adjusts all data atributes of a struct to given endianness depending on the machine architecture
		*/
		void adjust_«dataset.name.toFirstUpper»_allEndianness(«dataset.name.toFirstUpper»* p);
		
		'''
	}
	
	/**
	 * Generates a method to swap endianness of all struct variables.
	 * @param dataset
	 */	
	def generateSwapEndiannessOnDemandPrototype(DataSet dataset){
		'''
		/**
		* Swaps Endianness between little endian and big endian
		*/				
		void swap_«dataset.name.toFirstUpper»_all_endianness(«dataset.name.toFirstUpper»* p);
		
		'''
	}	
	
	/**
	 * Generates a method to check if the given architecture is little endian.
	 */
	def generateCheckLittleEndianPrototype() {
		'''
		/**
		* Returns true if given architecture is little endian
		*/		
		bool check_little_endian();	
			
		'''
	}	

	/**
	 * @see IDTOGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String className) {
		return className + SensIDLConstants.HEADER_EXTENSION
	}
}