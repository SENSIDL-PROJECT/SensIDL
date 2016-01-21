package de.fzi.sensidl.language.generator.factory.c

import com.google.common.base.Strings
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger

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
		
		for (dataset : this.dataSet) {

			val fileName = addFileExtensionTo(dataset.name.toFirstUpper)
			
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
			
			#include "«dataset.name.toFirstUpper + SensIDLConstants.HEADER_EXTENSION»"
			
			«dataset.name.toFirstUpper» «dataset.name.toFirstLower»;
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