package de.fzi.sensidl.language.generator.java

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import de.fzi.sensidl.language.generator.IDTOGenerator
import org.apache.log4j.Logger
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider

/**
 * Java code generator for the SensIDL Model. 
 * Code will be generated by running the {@code generate()}-Method
 * 
 * @author Sven Eckhardt
 * 
 */
 
class JavaDTOGenerator implements IDTOGenerator {
	private static Logger logger = Logger.getLogger(JavaDTOGenerator)
	
	private final static String JAVA_EXTENSION = ".java";
	private Resource input;
	private IFileSystemAccess fsa;

	new(Resource input, IFileSystemAccess fsa) {
		this.input = input;
		this.fsa = fsa;
	}

	/**
	 * Generates the .java Files
	 */
	override generate() {
		logger.info("Start with code-generation of a java data transfer object.")
		
		for (d : input.contents.filter(SensorInterface).head.eAllContents
					.filter(SensorDataDescription).head.eAllContents.toIterable
					.filter(DataSet)) {

			fsa.generateFile(addFileExtensionTo(d.toNameUpper), d.compile)
			logger.info("File: " + addFileExtensionTo(d.toNameUpper) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
		}

	}

	def compile(DataSet d) {
		'''«generateClassBody(d.toNameUpper, d)»'''
	}

	/**
	 * Generates the Classes
	 */
	def generateClassBody(String className, DataSet d) {
		'''
			 
			import java.io.BufferedReader;
			import java.io.ByteArrayInputStream;
			import java.io.IOException;
			import java.io.ObjectInputStream;
			import java.io.Serializable;
			import com.google.gson.Gson;
			 
			/**
			 * Data transfer object for «className»
			 *
			 * @generated
			 */
			class «className» {
				
				private static final long serialVersionUID = 1L;
				
				«FOR data : d.eContents.filter(NonMeasurementData)»
					«generateDataFields(data)»
				«ENDFOR»
				«FOR data : d.eContents.filter(MeasurementData)»
					«generateDataFields(data)»
				«ENDFOR»
				
				/**
				 * Constructor for the Data transfer object
				 */
				public «className» («d.generateConstructorArguments»){  
					«FOR data : d.eContents.filter(MeasurementData)»
						this.«data.toNameLower» = «data.toNameLower»;
					«ENDFOR»
					«FOR data : d.eContents.filter(NonMeasurementData)»
						«IF !data.constant»
							this.«data.toNameLower» = «data.toNameLower»;
						«ENDIF»
					«ENDFOR»
					
					
				}
				
				/**
				 * empty constructor for the Data transfer object
				 */
				public «className»(){
				
				}
				
				
				«FOR data : d.eContents.filter(MeasurementData)»
					«generateGetter(data)»
					
					«generateSetter(data)»
					
				«ENDFOR»
				
				«FOR data : d.eContents.filter(NonMeasurementData)»
					«generateGetter(data)»
					
					«generateSetter(data)»
					
				«ENDFOR»
					
				«d.generateJsonUnmarshal»	
				
				«d.generateByteArrayUnmarshal»	
			}
		 '''
	}

	/**
	 * Generates the fields for the measurement data
	 */
	def generateDataFields(MeasurementData d) {
		'''
			 
			/*
			«IF d.description != null» * «d.description»
			 * 
			«ENDIF» 
			 * Unit: «d.unit»
			 */
			private «d.toTypeName» «d.toNameLower»;
		'''
	}

	/**
	 * Generates the fields for the non measurement data
	 */
	def generateDataFields(NonMeasurementData d) {
		if (d.constant) {
			'''
				 
				«IF d.description != null»
				 /*
				  *«d.description»
				  */
				«ENDIF» 
				private static final «d.toTypeName» «d.name.toUpperCase» = «d.value»;
			'''
		} else {
			'''
				 
				«IF d.description != null»
				 /*
				  *«d.description»
				  */
				«ENDIF» 
				private «d.toTypeName» «d.toNameLower»;
			'''
		}

	}


	/**
	 * returns the appropriate type name 
	 */
	override toTypeName(Data d) {
		return switch (d.dataType) {
			case INT8: Byte.name
			case UINT8: Byte.name
			case INT16: Short.name
			case UINT16: Short.name
			case INT32: Integer.name
			case UINT32: Integer.name
			case INT64: Long.name
			case UINT64: Long.name
			case FLOAT: Float.name
			case DOUBLE: Double.name
		}
	}

	/**
	 * Generates the Constructor arguments
	 */
	def generateConstructorArguments(DataSet d) {
		if (d.eContents.filter(Data).head != null) {
			'''«d.eContents.filter(MeasurementData).head.toTypeName» «d.eContents.filter(MeasurementData).head.toNameLower»«FOR data : d.eContents.filter(MeasurementData).tail», «data.toTypeName» «data.toNameLower»«ENDFOR» «FOR data : d.eContents.filter(NonMeasurementData).tail» «IF !data.constant», «data.toTypeName» «data.toNameLower» «ENDIF»«ENDFOR»'''
					
		} 

	}

	/** 
	 * Generates the Getter Method for the measurement data
	 */
	def generateGetter(MeasurementData d) {
		'''
			/**
			 * @return the «d.toNameLower»
			 */
			public «d.toTypeName» «d.toGetterName»(){
				return this.«d.toNameLower»;
			}
		'''
	}

	/** 
	 * Generates the Getter Method for the non measurement data
	 */
	def generateGetter(NonMeasurementData d) {
		'''
			/**
			 * @return the «d.toNameLower»
			 */
			public «d.toTypeName» «d.toGetterName»(){
				return this.«IF d.constant»«d.name.toUpperCase»«ELSE»«d.toNameLower»«ENDIF»;
			}
		'''
	}

	def toGetterName(Data d) {
		'''get«d.name.replaceAll("[^a-zA-Z0-9]", "").toFirstUpper»'''
	}

	/** 
	 * Generates the Setter Method for the measurement data
	 */
	def generateSetter(MeasurementData d) {
		'''
			/**
			 * @param «d.toNameLower»
			 *			the «d.toNameLower» to set
			 */
			public void «d.toSetterName»(«d.toTypeName» «d.toNameLower»){
				this.«d.toNameLower» = «d.toNameLower»;
			} 
		'''
	}

	/** 
	 * Generates the Setter Method for the non measurement data
	 */
	def generateSetter(NonMeasurementData d) {
		if (d.constant) {
			'''
				// no setter for constant value
			'''
		} else {
			'''
				/**
				 * @param «d.toNameLower»
				 *			the «d.toNameLower» to set
				 */
				public void «d.toSetterName»(«d.toTypeName» «d.toNameLower»){
					this.«d.toNameLower» = «d.toNameLower»;
				} 
			'''
		}
	}

	def toSetterName(Data d) {
		'''set«d.name.replaceAll("[^a-zA-Z0-9]", "").toFirstUpper»'''
	}


	/**
	 * @return the name of the data with a lower first letter
	 */
	def toNameLower(Data d) {
		d.name.toFirstLower
	}

	/**
	 * @return the name of the DataSet with a lower first letter
	 */
	def toNameLower(DataSet d) {
		d.name.toFirstLower
	}

	/**
	 * @return the name of the data with an upper first letter 
	 */
	def toNameUpper(Data d) {
		d.name.toFirstUpper
	}

	/**
	 * @return the name of the DataSet with an upper first letter
	 */
	def toNameUpper(DataSet d) {
		d.name.toFirstUpper
	}
	
	def generateJsonUnmarshal(DataSet d){
		'''
		/**
		 * Alternative method responsible for deserializing the received
		 * JSON-formatted L stage from sensor.
		 * 
		 * @param dataset
		 *            the dataset to unmarshall incoming from sensor side in a JSON
		 *            format
		 * @return L unmarshalled L structure
		 */
		public «d.toNameUpper» unmarshal«d.toNameUpper» (BufferedReader dataset) { 
			
			Gson gson = new Gson();
			BufferedReader br = dataset;
			«d.toNameUpper» obj = gson.fromJson(br, «d.toNameUpper».class);
			return obj;
		}
		'''
	}
	
	def generateByteArrayUnmarshal(DataSet d){
		'''
		/**
		 * Method responsible for deserializing the received byte array
		 * representation of L from sensor.
		 * 
		 * @param dataset
		 *            the dataset to unmarshall incoming from sensor side as a byte
		 *            array
		 * @return L unmarshalled L structure
		 * @throws IOException
		 * @throws ClassNotFoundException
		 */
		public «d.toNameUpper» unmarshal«d.toNameUpper»(byte[] dataset) throws IOException, ClassNotFoundException {
			
			ByteArrayInputStream in = new ByteArrayInputStream(dataset);
			ObjectInputStream ois = null;
			ois = new ObjectInputStream(in);
			Object o = ois.readObject();
			«d.toNameUpper» «d.toNameLower» = («d.toNameUpper») o; // TODO: Ensure the type conversion is valid
			in.close();
			if (in != null) {
				ois.close();
			}
			return «d.toNameLower»;
		}
		'''
	}
	
	override addFileExtensionTo(String ClassName) {
		return ClassName + JAVA_EXTENSION
	}

}