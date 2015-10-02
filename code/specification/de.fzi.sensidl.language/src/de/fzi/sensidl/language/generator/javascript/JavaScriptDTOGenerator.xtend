package de.fzi.sensidl.language.generator.javascript

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import de.fzi.sensidl.language.generator.IDTOGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.apache.log4j.Logger
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider

/**
 * JavaScript code generator for the SensIDL Model. 
 * 
 * @author Sven Eckhardt
 * 
 */
class JavaScriptDTOGenerator implements IDTOGenerator {
	private static Logger logger = Logger.getLogger(JavaScriptDTOGenerator)
	
	private final static String JAVASCRIPT_EXTENSION = ".js"
	private Resource input
	private IFileSystemAccess fsa

	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa
	}

	/**
	 * Generates the .js files
	 */
	override generate() {
		logger.info("Start with code-generation of a JavaScript data transfer object.")
		
		val sensorInterface = input.contents.filter(SensorInterface).head
		fsa.generateFile(addFileExtensionTo(sensorInterface.name.toFirstUpper.concat("v1")), sensorInterface.compile)
		logger.info("File: " + addFileExtensionTo(sensorInterface.name.toFirstUpper.concat("v1")) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
	}

	/**
	 * generates the JavaScript code
	 */
	def compile(SensorInterface sensorInterface) {
		'''
		«FOR  dataset : sensorInterface.eAllContents.toIterable.filter(DataSet)»
			«generateVariable(dataset.name.toFirstLower, dataset)»
		«ENDFOR»
		'''
	}
	/**
	 * generates the variable for a dataset object
	 */
	def generateVariable(String name, DataSet dataset){
		val nmdatalast = dataset.eAllContents.toIterable.filter(NonMeasurementData).last
		val mdatalast = dataset.eAllContents.toIterable.filter(MeasurementData).last
		'''
		«IF dataset.description != null»/* «dataset.description» */«ENDIF»
		var «name» = {
		 
			«FOR nmdata : dataset.eAllContents.toIterable.filter(NonMeasurementData)»
				«IF nmdata.constant»
					«nmdata.name.toUpperCase»«IF nmdata.value != null» : «nmdata.value»«IF !nmdata.equals(nmdatalast)»,«ENDIF»«ENDIF»«IF nmdata.description != null»/*«nmdata.description» */«ENDIF»
				«ELSE»
					«nmdata.name.toFirstLower»«IF nmdata.value != null» : «nmdata.value»«IF !nmdata.equals(nmdatalast)»,«ENDIF»«ENDIF»«IF nmdata.description != null»/*«nmdata.description» */«ENDIF»
				«ENDIF»
			«ENDFOR»
			«FOR mdata : dataset.eAllContents.toIterable.filter(MeasurementData)»
				«mdata.name.toFirstLower»«IF !mdata.equals(mdatalast)»,«ENDIF» /*«mdata.description» Measured in Unit: «mdata.unit» */ 
			«ENDFOR»
		 
		};
		 
		'''
		
	}

	override addFileExtensionTo(String ClassName) {
		return ClassName + JAVASCRIPT_EXTENSION
	}

	override toTypeName(Data data) {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}