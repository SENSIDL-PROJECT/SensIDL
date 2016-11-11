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
import java.util.ArrayList
import de.fzi.sensidl.design.sensidl.dataRepresentation.Method

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
						
			«generateInitDatasetDeclaration(dataset)»
			
			«generateMethods(dataset)»
			
			«generateDataMethodsIncludeUsedDataSets(dataset)»
			
			«generateEndiannessMethodsDeclarations(dataset)»
			
			«generateMarshalingJSONMethods(dataset)»
			
		'''	
	}
	
	
	def generateInitDatasetDeclaration(DataSet d) {
		
		var dataSets = new ArrayList<DataSet>() => [
			add(d)
			addAll(d.usedDataSets)
		]
		var methodsString =''''''
		methodsString += generateInitTemplateStart(d)
		
		for (dataSet : dataSets) {
	
			methodsString += generateInit(dataSet)
		}
		methodsString += generateInitTemplateEnd(d)
		
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

		void init_«dataset.name.toFirstUpper»(«dataset.name.toFirstUpper»* p) {

		'''				
	}
	
	def generateInitTemplateEnd(DataSet dataset){
		'''
		
		}
		'''				
	}	
	
	/** 
	 * Generates Methods
	 * 
	 */
	def generateMethods(DataSet d){
		'''
		«FOR method : d.eContents.filter(Method)»
				
				«method.methodReturnType» «method.name»(«method.getMethodParameter»){
					//TODO: Auto Generated method stub
					«IF !method.methodReturnType.equals("void")»
					return 0;
					«ENDIF»
				}
		«ENDFOR»
		'''
	}
	
	/**
	 * Returns the return type of a method
	 * 
	 */
	def getMethodReturnType(Method method){
		if (method.returnType != DataType.UNDEFINED){
			return method.returnType.toTypeName
		} else if (method.returnTypeDataSet != null){
			return method.returnTypeDataSet.name
		} else {
			return "void"
		}
	}		
	
	/**
	 * Returns the parameter of a method
	 * 
	 */
	def getMethodParameter(Method method) {
		var str = ""
		if (method.parameter.size > 0) {
			if (method.parameter.head.dataType != DataType.UNDEFINED) {
				str = method.parameter.head.dataType.toTypeName + " " + method.parameter.head.name
			} else if (method.parameter.head.dataTypeDataSet != null) {
				str = method.parameter.head.dataTypeDataSet.name + " " + method.parameter.head.name
			}
			for (p : method.parameter.tail) {
				if (p.dataType != DataType.UNDEFINED) {
					str += ", " + p.dataType.toTypeName + " " + p.name
				} else if (p.dataTypeDataSet != null) {
					str += ", " + p.dataTypeDataSet.name + " " + p.name
				}
			}
		}
		return str
	}			
	
	/**
	 * Generates the getter and setter methods prototypes for the data of this data set including used data sets.
	 */
	def generateDataMethodsIncludeUsedDataSets(DataSet d) {
		var dataSets = new ArrayList<DataSet>() => [
			add(d)
			addAll(d.usedDataSets)
		]
		var methodsString =''''''
		var usedDataSets = d	
		for (dataSet : dataSets) {
	
			for (data : dataSet.eContents.filter(NonMeasurementData)) {
				if (!data.excludedMethods.contains("getter")){
					methodsString += generateGetterDeclaration(data, usedDataSets)
					methodsString += System.getProperty("line.separator");
				}
				if (!data.excludedMethods.contains("setter")){
					methodsString += generateSetterDeclaration(data, usedDataSets)
					methodsString += System.getProperty("line.separator");
				}
			}
			for (data : dataSet.eContents.filter(MeasurementData)) {
				if (!data.excludedMethods.contains("getter")){
					methodsString += generateGetterDeclaration(data, usedDataSets)
					methodsString += System.getProperty("line.separator");
				}
				if (!data.excludedMethods.contains("setter")){				
					methodsString += generateSetterDeclaration(data, usedDataSets)
					methodsString += System.getProperty("line.separator");
				}
			}
		}		
		return methodsString;
	}		
	
//	def generateGetterDeclaration(Data d, DataSet dataset) {
//		'''			
//		«IF (d instanceof MeasurementData) && (d as MeasurementData).adjustments.empty == false»
//		
//		«FOR dataAdj : (d as MeasurementData).adjustments»
//			«IF dataAdj instanceof DataRange»
//				«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p){
//					if («d.name.toFirstLower» >= «dataAdj.range.lowerBound» && «d.name.toFirstLower» <= «dataAdj.range.upperBound»)
//						 return p->«d.name.toFirstLower»;
//					else{
//							//Do something
//						}
//				}
//			«ENDIF»	
//			
//			«IF dataAdj instanceof DataConversion»						
//				«generatedAdjustedGetterDeclaration(dataAdj, (d as MeasurementData), dataset)»
//			«ENDIF»		
//		«ENDFOR»
//		
//		«ELSE»
//			«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p) { return p->«d.name»; }
//		«ENDIF»
//		'''
//	}
	
		/** 
	 * Generates the Getter Method for the measurement data
	 */
	def generateGetterDeclaration(MeasurementData d, DataSet dataset) {
		'''
			«IF !d.hasLinearDataConversionWithInterval»
			«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p) { return p->«d.name»; }
			«ELSE»
			 «generateAdjustedGetterPrototypes(d, dataset)»
			«ENDIF»
		'''
	}
	
 	/**
 	 * Generates the Getter Method for adjusted measurement data
 	 */
 	def generateAdjustedGetterPrototypes(MeasurementData d, DataSet dataset) {
 		'''
 		«d.getReturnDataType» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p) { return p->«d.name»Adjusted; }
 		
 		«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»NotAdjusted(«dataset.name.toFirstUpper»* p) { return p->«d.name»; }
 		
 		'''
 	}
 	
 		/** 
	 * Generates the Getter Method for the non measurement data
	 */
	def generateGetterDeclaration(NonMeasurementData d, DataSet dataset) {
		'''
 		«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p) { return p->«d.name»; }
		'''
	}		
	
	
	
	
//	def dispatch generatedAdjustedGetterDeclaration(LinearDataConversion dataAdj, MeasurementData d, DataSet dataset) {
//		'''
//			«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p){						
//					return (p->«d.name.toFirstLower» * «dataAdj.scalingFactor») + «dataAdj.offset»;
//				} 
//		'''
//	}
	
 	dispatch def generateSetterDeclaration(MeasurementData d, DataSet dataset) {
 			'''
 				«IF d.adjustments.empty == false»
	 				«FOR dataAdj : d.adjustments»
	 				«IF dataAdj instanceof DataRange» 
	 					void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ){
	 						if («d.name.toFirstLower» >= «dataAdj.range.lowerBound» && «d.name.toFirstLower» <= «dataAdj.range.upperBound»)
	 							 p->«d.name.toFirstLower» = «d.name.toFirstLower»;
	 						else{
	 								//Do something
	 							}
	 					}
	 				«ENDIF»	
	 				
	 				«IF dataAdj instanceof DataConversion»						
	 					«IF dataAdj instanceof LinearDataConversion»
	 					void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»_WithDataConversion(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ){						
	 						p->«d.name.toFirstLower» =  «d.name.toFirstLower» *  «dataAdj.scalingFactor» +  «dataAdj.offset»;
	 					} 
	 					«ELSE»
	 						«IF dataAdj instanceof LinearDataConversionWithInterval»
	 						void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ){						
	 							if («d.name.toFirstLower» >= «dataAdj.fromInterval.lowerBound» && «d.name.toFirstLower» <= «dataAdj.fromInterval.upperBound»){												
	 								
	 								«d.getReturnDataType» oldMin =  «dataAdj.fromInterval.lowerBound.intValue»;
	 								«d.getReturnDataType» oldMax =  «dataAdj.fromInterval.upperBound.intValue»;
	 								«d.getReturnDataType» newMin =  «dataAdj.toInterval.lowerBound.intValue»;
	 								«d.getReturnDataType» newMax =  «dataAdj.toInterval.upperBound.intValue»;
	 								
	 								p->«d.name.toFirstLower» = «d.name.toFirstLower»;
	 								p->«d.name.toFirstLower»Adjusted =  ((((«d.name.toFirstLower» - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin);
	 							}
	 							else{
	 								//Do something
	 							}
	 						} 		
	 						«ENDIF»
	 					«ENDIF»
	 				«ENDIF»				
	 				«ENDFOR»	
 				«ELSE»
 					void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ) { p->«d.name.toFirstLower» = «d.name.toFirstLower»; }
 				«ENDIF»

 				''' 
 	}
 	
 	
	
	dispatch def generateSetterDeclaration(NonMeasurementData d, DataSet dataset) {
			'''
			«IF !d.constant»					
				void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ) { p->«d.name.toFirstLower» = «d.name.toFirstLower»; }
			«ELSE»
			// no setter for constant value
			«ENDIF»										
			'''
		
	}
	

	
	def generateEndiannessMethodsDeclarations(DataSet d){
		'''
			«generateAdjustAllEndianness(d)»
						
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
				«swapEndiannessIncludeusedDataSets(dataset)»
			}
		}
		
		'''
	}
	
	
	/**
	 * Generates a method to swap endianness of all variables of the struct
	 */
	def generateSwapEndiannessOnDemand(DataSet dataset){
		'''		
		void swap_«dataset.name.toFirstUpper»_all_endianness(«dataset.name.toFirstUpper»* p){
				«swapEndiannessIncludeusedDataSets(dataset)»
		}
		
		'''
	}
	
	/**
	 *  Helper function to swap endianness of all variables of the struct 
	 */
	def swapEndiannessIncludeusedDataSets(DataSet d){
			var dataSet = d
			var methodsString =''''''
			while (dataSet!==null) {
		
				methodsString += swapEndianness(dataSet)
				dataSet = dataSet.usedDataSets.head //TODO: also use other parent data sets if there is more than one
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
	 * Generates methods to marshal JSON and unmarshal JSON.
	 * @param dataset
	 */	
	def generateMarshalingJSONMethods(DataSet dataset){
		'''
		«generateMarshalJSON(dataset)»
		
		«generateUnmarshalJSON(dataset)»
		'''
	}
	
	def generateMarshalJSON(DataSet d){
		
		var dataSets = new ArrayList<DataSet>() => [
		add(d)
		addAll(d.usedDataSets)
		]
		'''
		char * marshalJSON_«d.name.toFirstUpper»(«d.name.toFirstUpper»* p){
			 
			JsonNode *jsonObject = json_mkobject();
	
			«FOR dataSet : dataSets»
				«FOR data : dataSet.data»
					«IF !data.excludedMethods.contains("getter")»
					json_append_member(jsonObject, "«GenerationUtil.toNameLower(data)»", json_mknumber(get_«dataSet.name.toFirstUpper»_«data.name.replaceAll("[^a-zA-Z0-9]", "")»(p)));
					«ELSE»
					json_append_member(jsonObject, "«GenerationUtil.toNameLower(data)»", json_mknumber(0));
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			
			return json_stringify(jsonObject, "\t");
		}
		'''
			
	}		
	
	def generateUnmarshalJSON(DataSet d){
		
		var dataSets = new ArrayList<DataSet>() => [
		add(d)
		addAll(d.usedDataSets)
		]
		'''
		void unmarshalJSON_«d.name.toFirstUpper»(«d.name.toFirstUpper»* p, const char *jsonString){
			
			JsonNode *jsonObject = json_decode(jsonString);
			
			«FOR dataSet : dataSets»
				«FOR data : dataSet.data»
					if (json_find_member(jsonObject, "«GenerationUtil.toNameLower(data)»") != NULL)
						p->«data.name» = («data.toTypeName») json_find_member(jsonObject, "«GenerationUtil.toNameLower(data)»")->number_;
				«ENDFOR»
			«ENDFOR»			
			
			json_delete(jsonObject);
		}

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
	 * @return true if the MeasurementData is adjusted 
	 * with linear data conversion with interval
	 */
	def hasLinearDataConversionWithInterval(MeasurementData data){
		return !data.adjustments.filter(LinearDataConversionWithInterval).empty
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
	 * Adds the file extension.
	 * @see IDTOGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String ClassName) {
		return ClassName + SensIDLConstants.C_EXTENSION
	}
}