package de.fzi.sensidl.language.generator.factory.c

import com.google.common.base.Strings
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
import de.fzi.sensidl.design.sensidl.Endianness

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for 
 * the generation of the c-files.
 */
class CDTOFileGenerator extends CDTOGenerator {
	
	private static Logger logger = Logger.getLogger(CDTOFileGenerator)
	
	private boolean bigEndian
	
	/**
	 * The constructor calls the constructor of the superclass to set a list of DataSet-elements.
	 * @param newDataSet Represents the list of DataSet-elements.
	 */
	new(List<DataSet> newDataSet) {
		super(newDataSet)
	}
	
	/**
	 * Generates the .c and .h files for each data transfer object.
	 * @see IDTOGenerator#generate()
	 */
	override generate() {
		val filesToGenerate = new HashMap();
		
		if (GenerationUtil.getSensorInterface(this.dataSets.get(0).eContents.filter(Data).get(0).eContainer).encodingSettings.endianness == Endianness.BIG_ENDIAN){
			bigEndian = true;
		} else {
			bigEndian = false;
		}		
		
		logger.info("Start with code-generation of a c data transfer object.")
		
		for (dataset : this.dataSets) {

			val fileName = addFileExtensionTo(GenerationUtil.toNameUpper(dataset))
			
			filesToGenerate.put(fileName, dataset.generateStructDeclaration)
			//logger.info("File: " + fileName + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
			
			//filesToInclude.put(fileName, dataset.description);
		}
		
		logger.info("File: " + addFileExtensionTo(SensIDLConstants.MARSHAL_FILE).toString + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
		
		filesToGenerate	
	}
	
	//TODO integrate marshaling functions in the process
//	/**
// 	* Triggers the code-generation for the
// 	* c marshalling-function.
// 	* @param filesToInclude
// 	* 			maps the filename to include to the corresponding description.
// 	*/
//	def compile(HashMap<String, String> filesToInclude) {
//		'''«filesToInclude.generateMarshallingFunctionPrototype»'''
//	}
//	
//	/**
//	* Generates the marshalling-function.
//	* @param filesToInclude
//	* 			contains all files to include.
//	*/
//	def generateMarshallingFunctionPrototype(HashMap<String, String> filesToInclude) {
//		'''
//		/**\brief
//		*
//		«FOR file : filesToInclude.keySet»
//			* «file» «filesToInclude.get(file)»
//		«ENDFOR»
//		*/		
//		
//		«FOR file : filesToInclude.keySet»
//			#include "«file»"
//		«ENDFOR»
//		
//		
//		/**\brief
//		*  The function marshalDataSet arrange the data bytes in an array with a defined order.
//		*/
//		byte[] marshalDataSet(void *dataSet);
//		'''
//	}

	/**
	 * Generates a struct-declaration.
	 * @param dataset Represents the model element for the struct.
	 */
	def generateStructDeclaration(DataSet dataset) {
		'''
			/**\brief		
			«generateDescription(dataset)»
			*/
			
			#include "«GenerationUtil.toNameUpper(dataset) + SensIDLConstants.HEADER_EXTENSION»"
			
			«GenerationUtil.toNameUpper(dataset)» «GenerationUtil.toNameLower(dataset)»;
			
			«generateInitDatasetDeclaration(dataset)»
			
			«generateDataMethodsIncludeParentDataSet(dataset)»
			
			«generateEndiannessMethodsDeclarations(dataset)»
			
		'''	
	}
	

	def generateInitDatasetDeclaration(DataSet d) {
		
		var dataSet = d
		var methodsString =''''''
		methodsString += generateInitTemplateStart(dataSet)
		
		while (dataSet!==null) {
	
			methodsString += generateInit(dataSet)
			dataSet = dataSet.parentDataSet.head //TODO: also use other parent data sets if there is more than one
		}
		methodsString += generateInitTemplateEnd(dataSet)
		
		return methodsString		
	}	
	
	
	def generateInit(DataSet dataset) {
		'''
			«FOR data : dataset.eContents.filter(NonMeasurementData)»
			«IF data.value != null»  
			 p->«data.name.replaceAll("[^a-zA-Z0-9]", "")» = «IF data.dataType == DataType.STRING»"«data.value»"«ELSE»«data.value»«ENDIF»;
			«ENDIF»
			«ENDFOR»
		'''			
	}
	
	def generateInitTemplateStart(DataSet dataset){
		'''

		void init«dataset.name.toFirstUpper»(«dataset.name.toFirstUpper»* p) {

		'''				
	}
	
	def generateInitTemplateEnd(DataSet dataset){
		'''
		
		}
		'''				
	}			
	
	/**
	 * Generates the getter and setter methods prototypes for the data of this data set including used data sets.
	 */
	def generateDataMethodsIncludeParentDataSet(DataSet d) {
		var dataSet = d
		var methodsString =''''''
		var parentDataSet = dataSet
		while (dataSet!==null) {
	
			for (data : dataSet.eContents.filter(NonMeasurementData)) {
				methodsString += generateGetterDeclaration(data, parentDataSet)
				methodsString += System.getProperty("line.separator");
				methodsString += generateSetterDeclaration(data, parentDataSet)
				methodsString += System.getProperty("line.separator");
			}
			for (data : dataSet.eContents.filter(MeasurementData)) {
				methodsString += generateGetterDeclaration(data, parentDataSet)
				methodsString += System.getProperty("line.separator");
				methodsString += generateSetterDeclaration(data, parentDataSet)
				methodsString += System.getProperty("line.separator");
			}
			dataSet = dataSet.parentDataSet.head //TODO: also use other parent data sets if there is more than one
		}
		return methodsString
	}		
	
	def generateGetterDeclaration(Data d, DataSet dataset) {
		'''
		«IF (d instanceof MeasurementData) && (d as MeasurementData).adjustments.empty == false»
		
		«FOR dataAdj : (d as MeasurementData).adjustments»
			«IF dataAdj instanceof DataRange»
				«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p){
					if («d.name.toFirstLower» >= «dataAdj.range.lowerBound» && «d.name.toFirstLower» <= «dataAdj.range.upperBound»)
						 return p->«d.name.toFirstLower»;
					else{
							//Do something
						}
				}
			«ENDIF»	
			
			«IF dataAdj instanceof DataConversion»						
				«generatedAdjustedGetterDeclaration(dataAdj, (d as MeasurementData), dataset)»
			«ENDIF»				
		«ENDFOR»
		
		«ELSE»
			«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p) { return p->«d.name»; }
		«ENDIF»
		'''
	}
	
	def dispatch generatedAdjustedGetterDeclaration(LinearDataConversionWithInterval dataAdj, MeasurementData d, DataSet dataset) {
		'''
			«DataTypes.getDataTypeBy(GenerationUtil.getDataTypeOfDataConversionAdjustment(d))» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p){						
					if («d.name.toFirstLower» >= «dataAdj.fromInterval.lowerBound» && «d.name.toFirstLower» <= «dataAdj.fromInterval.upperBound»){												
						
						«d.toTypeName» oldMin =  «dataAdj.fromInterval.lowerBound.intValue»;
						«d.toTypeName» oldMax =  «dataAdj.fromInterval.upperBound.intValue»;
						«d.toTypeName» newMin =  «dataAdj.toInterval.lowerBound.intValue»;
						«d.toTypeName» newMax =  «dataAdj.toInterval.upperBound.intValue»;
						
						return ((((p->«d.name.toFirstLower» - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin);
					}
					else{
						//Do something
					}
				}
		'''
	}
	
	def dispatch generatedAdjustedGetterDeclaration(LinearDataConversion dataAdj, MeasurementData d, DataSet dataset) {
		'''
			«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p){						
					return (p->«d.name.toFirstLower» * «dataAdj.scalingFactor») + «dataAdj.offset»;
				} 
		'''
	}
	
	dispatch def generateSetterDeclaration(MeasurementData d, DataSet dataset) {
			'''
				void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ) { p->«d.name.toFirstLower» = «d.name.toFirstLower»; }	
			''' 
	}	
	
	dispatch def generateSetterDeclaration(NonMeasurementData d, DataSet dataset) {
		if (d.constant) {
			'''
				// no setter for constant value
			'''
		} else {
			'''
				void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ) { p->«d.name.toFirstLower» = «d.name.toFirstLower»; }
			'''
		}
	}
	
	def generateEndiannessMethodsDeclarations(DataSet d){
		'''
			«generateAdjustAllEndianness(d)»
			
			«generateCheckLittleEndian()»
			
			«generateSwapEndiannessOnDemand(d)»
		'''						
	}
	
/**
	 * Generates a method to check if endianness of the variables of the struct need to be swappe
	 */
	def generateAdjustAllEndianness(DataSet dataset){
		'''		
		void adjust_«dataset.name.toFirstUpper»_allEndianness(«dataset.name.toFirstUpper»* p){
			int n = 1;

			«IF bigEndian == true»
				// if little endian device architecture then convert (big endian defined)
				if(*(char *)&n == 1) {
			«ELSE»
				// if big endian device architecture then convert (little endian defined)
				if(*(char *)&n != 1) {
			«ENDIF»
				«swapEndiannessIncludeParentDataSet(dataset)»
			}
		}
		
		'''
	}
	
	/**
	 * Generates a method to check if the given architecture is little endian.
	 */
	def generateCheckLittleEndian(){
		'''
		bool check_little_endian(){
			
		// true if little endian device architecture detected
		return (*(char *)&n == 1);
		} 
			
		'''
	}
	
	/**
	 * Generates a method to swap endianness of all variables of the struct
	 */
	def generateSwapEndiannessOnDemand(DataSet dataset){
		'''		
		void swap_«dataset.name.toFirstUpper»_all_endianness(«dataset.name.toFirstUpper»* p){
				«swapEndiannessIncludeParentDataSet(dataset)»
		}
		
		'''
	}
	
	/**
	 *  Helper function to swap endianness of all variables of the struct 
	 */
	def swapEndiannessIncludeParentDataSet(DataSet d){
			var dataSet = d
			var methodsString =''''''
			while (dataSet!==null) {
		
				methodsString += swapEndianness(dataSet)
				dataSet = dataSet.parentDataSet.head //TODO: also use other parent data sets if there is more than one
			}
			return methodsString
	}	

	/**
	 *  Helper function to swap endianness of all variables of the struct 
	 */
	def swapEndianness(DataSet dataset){
	'''
			«FOR data : dataset.eContents.filter(MeasurementData)»
				«IF data.dataType ==  DataType.INT16 »
				p->«GenerationUtil.toNameLower(data)» = swap_int16( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.UINT16»
				p->«GenerationUtil.toNameLower(data)» = swap_uint16( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.INT32»
				p->«GenerationUtil.toNameLower(data)» = swap_int32( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.UINT32»
				p->«GenerationUtil.toNameLower(data)» = swap_uint32( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.INT64»
				p->«GenerationUtil.toNameLower(data)» = swap_int64( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.UINT64»
				p->«GenerationUtil.toNameLower(data)» = swap_uint64( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.FLOAT »
				p->«GenerationUtil.toNameLower(data)» = swap_float( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.DOUBLE»
				p->«GenerationUtil.toNameLower(data)» = swap_double( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
			«ENDFOR»
			«FOR data : dataset.eContents.filter(NonMeasurementData)»
				«IF data.dataType ==  DataType.INT16 »
				p->«GenerationUtil.toNameLower(data)» = swap_int16( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.UINT16»
				p->«GenerationUtil.toNameLower(data)» = swap_uint16( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.INT32»
				p->«GenerationUtil.toNameLower(data)» = swap_int32( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.UINT32»
				p->«GenerationUtil.toNameLower(data)» = swap_uint32( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.INT64»
				p->«GenerationUtil.toNameLower(data)» = swap_int64( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.UINT64»
				p->«GenerationUtil.toNameLower(data)» = swap_uint64( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.FLOAT »
				p->«GenerationUtil.toNameLower(data)» = swap_float( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
				«IF data.dataType ==  DataType.DOUBLE»
				p->«GenerationUtil.toNameLower(data)» = swap_double( p->«GenerationUtil.toNameLower(data)» );
				«ENDIF»
			«ENDFOR»
		'''
		
	}	
	
		
	/**
	 * Generates a description for a dataset.
	 * @param dataset
	 * 			represents the dataset.
	 */
	def generateDescription(DataSet dataset) {
		'''
			* \param		«dataset.name»: «IF !Strings.isNullOrEmpty(dataset.description)»«dataset.description»«ENDIF»
		'''
	}
	
	/**
	 * Adds the file extension.
	 * @see IDTOGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String ClassName) {
		return ClassName + SensIDLConstants.C_EXTENSION
	}
}