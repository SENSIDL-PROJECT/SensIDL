package de.fzi.sensidl.language.generator.c

import com.google.common.base.Strings
import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
import de.fzi.sensidl.language.generator.IDTOGenerator
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import java.util.HashMap
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class CDTOFileGenerator extends CDTOGenerator {
	private final static String C_EXTENSION = ".c";
	private final static String MARSHAL_FILE = "DataMarshalling";
	
	private static Logger logger = Logger.getLogger(CDTOFileGenerator)
	
	new(Resource input, IFileSystemAccess fsa) {
		super(input, fsa)
	}
	
	/**
	 * Generates the .c files with struct-declaration and the
	 * marshalling-function.
	 */
	override generate() {
		val filesToInclude = new HashMap();
		
		logger.info("Start with code-generation of a c data transfer object.")
		
		for (dataset : input.contents.filter(SensorInterface).head.eAllContents
					.filter(SensorDataDescription).head.eAllContents.toIterable
					.filter(DataSet)) {

			val fileName = addFileExtensionTo(dataset.name.toFirstUpper)
			
			fsa.generateFile(fileName, dataset.compile)
			logger.info("File: " + fileName + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
			
			filesToInclude.put(fileName, dataset.description);
		}
		
//		fsa.generateFile(addFileExtensionTo(MARSHAL_FILE), filesToInclude.compile)
		logger.info("File: " + addFileExtensionTo(MARSHAL_FILE) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)	
	}
	
	/**
 	* Triggers the code-generation for the
 	* c struct-declaration.
 	* @param dataset
 	* 			represents the model element for the struct.
 	*/
	def compile(DataSet dataset) {
		'''«generateStructDeclaration(dataset)»'''
	}
	
	/**
 	* Triggers the code-generation for the
 	* c marshalling-function.
 	* @param filesToInclude
 	* 			maps the filename to include to the corresponding description.
 	*/
	def compile(HashMap<String, String> filesToInclude) {
		'''«filesToInclude.generateMarshallingFunctionPrototype»'''
	}
	
	/**
	* Generates the marshalling-function.
	* @param filesToInclude
	* 			contains all files to include.
	*/
	def generateMarshallingFunctionPrototype(HashMap<String, String> filesToInclude) {
		'''
		/**\brief
		*
		«FOR file : filesToInclude.keySet»
			* «file» «filesToInclude.get(file)»
		«ENDFOR»
		*/		
		
		«FOR file : filesToInclude.keySet»
			#include "«file»"
		«ENDFOR»
		
		
		/**\brief
		*  The function marshalDataSet arrange the data bytes in an array with a defined order.
		*/
		byte[] marshalDataSet(void *dataSet);
		'''
	}

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
			
			#include "«dataset.name.toFirstUpper + HEADER_EXTENSION»"
			
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
		return ClassName + C_EXTENSION
	}
}