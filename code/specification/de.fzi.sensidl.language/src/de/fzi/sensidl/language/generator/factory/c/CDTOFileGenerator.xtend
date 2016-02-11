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

class CDTOFileGenerator extends CDTOGenerator {
	
	private static Logger logger = Logger.getLogger(CDTOFileGenerator)
	
	new(List<DataSet> newDataSet) {
		super(newDataSet)
	}
	
	/**
	 * Generates the .c files with struct-declaration and the
	 * marshalling-function.
	 */
	override generate() {
		val filesToGenerate = new HashMap();
		
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
	 * @param dataset
	 * 			represents the model element for the struct.
	 */
	def generateStructDeclaration(DataSet dataset) {
		'''
			/**\brief		
			«generateDescription(dataset)»
			*/
			
			#include "«GenerationUtil.toNameUpper(dataset) + SensIDLConstants.HEADER_EXTENSION»"
			
			«GenerationUtil.toNameUpper(dataset)» «GenerationUtil.toNameLower(dataset)»;
			
			«generateInitDatasetDeclaration(dataset)»
			
			«generateSetterDeclarationIncludeParentDataSet(dataset)»
			
«««			«FOR data : dataset.eContents.filter(Data)»				
«««				«generateGetterDeclaration(data, dataset)»
«««				«generateSetterDeclaration(data, dataset)»				
«««			«ENDFOR»			
		'''	
	}
	
	
	def generateInitDatasetDeclaration(DataSet d) {
		
		var dataSet = d
		var methodsString =''''''
		methodsString += generateInitTemplateStart(dataSet)
		
		while (dataSet!==null) {
	
			methodsString += generateInit(dataSet)
			dataSet = dataSet.parentDataSet
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
	def generateSetterDeclarationIncludeParentDataSet(DataSet d) {
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
			dataSet = dataSet.parentDataSet
		}
		return methodsString
	}		
	
	def generateGetterDeclaration(Data d, DataSet dataset) {
		'''

		«d.toTypeName» get_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p) { return p->«d.name»; }
		'''
	}	
	
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
					
					void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ){						
						p->«d.name.toFirstLower» =  «d.name.toFirstLower» *  «dataAdj.scalingFactor» +  «dataAdj.offset»;
					} 
					«ELSE»
						«IF dataAdj instanceof LinearDataConversionWithInterval»
						void set_«dataset.name.toFirstUpper»_«d.name.replaceAll("[^a-zA-Z0-9]", "")»(«dataset.name.toFirstUpper»* p, «d.toTypeName» «d.name.toFirstLower» ){						
							if («d.name.toFirstLower» >= «dataAdj.fromInterval.lowerBound» && «d.name.toFirstLower» <= «dataAdj.fromInterval.upperBound»){												
								
								«d.toTypeName» oldMin =  «dataAdj.fromInterval.lowerBound.intValue»;
								«d.toTypeName» oldMax =  «dataAdj.fromInterval.upperBound.intValue»;
								«d.toTypeName» newMin =  «dataAdj.toInterval.lowerBound.intValue»;
								«d.toTypeName» newMax =  «dataAdj.toInterval.upperBound.intValue»;
								
								p->«d.name.toFirstLower» =  ((((«d.name.toFirstLower» - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin);
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