package de.fzi.sensidl.language.generator.c

import de.fzi.sensidl.language.generator.IDTOGenerator
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import com.google.common.base.Strings
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData

class CDTOGenerator implements IDTOGenerator {
	private final static String C_EXTENSION = ".c";
	private Resource input
	private IFileSystemAccess fsa;
	
	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}
	
	/**
	 * Generates the .c Files with structs
	 */
	override generate() {
		for (dataset : input.contents.filter(SensorInterface).head.eAllContents
					.filter(SensorDataDescription).head.eAllContents.toIterable
					.filter(DataSet)) {

			fsa.generateFile(addFileExtensionTo(dataset.name.toFirstUpper), dataset.compile)
		}
	}
	
	def compile(DataSet dataset) {
		'''«generateStruct(dataset.name.toFirstUpper, dataset)»'''
	}

	/**
	 * Generates a struct
	 */
	def generateStruct(String className, DataSet dataset) {
		'''
			/**\brief		«IF !Strings.isNullOrEmpty(dataset.description)»«dataset.description»«ENDIF»  
			«FOR data : dataset.eContents.filter(Data)»
				«generateDescription(data)»
			«ENDFOR»
			*/
			
			typedef struct
			{
				«FOR data : dataset.eContents.filter(Data)»
					«generateVariable(data)»
				«ENDFOR»
			} «dataset.name.toFirstUpper»;
		'''
	}
	
	dispatch def generateDescription(MeasurementData data) {
		'''
			* \param		«data.name»: «IF !Strings.isNullOrEmpty(data.description)»«data.description»«ENDIF»
			*				Measured in unit: «data.unit» 
		'''
	}
	
	dispatch def generateDescription(NonMeasurementData data) {
		'''
			* \param		«data.name»: «IF !Strings.isNullOrEmpty(data.description)»«data.description»«ENDIF»
			'''
	}
	
	dispatch def generateVariable(MeasurementData data) {
		'''«data.toTypeName» «data.name.toFirstLower»;'''
	}
	
	dispatch def generateVariable(NonMeasurementData data) {
		'''«IF data.constant»const «ENDIF»«data.toTypeName» «data.name.toFirstLower»«IF !Strings.isNullOrEmpty(data.value)» = «data.value»«ENDIF»;'''
	}
	
	override addFileExtensionTo(String ClassName) {
		return ClassName + C_EXTENSION
	}
	
	override toTypeName(Data data) {
		return switch (data.dataType) {
			case INT8: DataTypes.SIGNED_CHAR
			case UINT8: DataTypes.UNSIGNED_CHAR
			case INT16: DataTypes.SIGNED_SHORT
			case UINT16: DataTypes.UNSIGNED_SHORT
			case INT32: DataTypes.SIGNED_LONG
			case UINT32: DataTypes.UNSIGEND_LONG
			case INT64: DataTypes.SIGNED_LONG_LONG
			case UINT64: DataTypes.UNSIGNED_LONG_LONG
			case FLOAT: DataTypes.FLOAT
			case DOUBLE: DataTypes.DOUBLE
		}
	}
	
}