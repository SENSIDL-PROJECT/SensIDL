package de.fzi.sensidl.language.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.Calculated
import sensidl.Constant
import sensidl.DataModel
import sensidl.Interpretation
import sensidl.InterpretationGroup
import sensidl.Measurement
import sensidl.PrimitiveInterpretation
import sensidl.Representation

import static extension de.fzi.sensidl.language.generator.SensidlPseudoCodeGenerator.*

/**
 * Nested class for the generation of an encoder
 * @author Dominik Werle
 */
class EncoderGenerator implements ISensidlGenerator {
	private final String classNameBase
	private final DataModel input
	private Map<Interpretation, String> encoderMethodName
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
		
		representationToMethodName = new HashMap
		encoderMethodName = new HashMap
	}
	
	private Map<Representation, String> representationToMethodName
	
	/**
	 * Creates methods for transformations for the representations
	 * given in the SensIDL specification.
	 * <p>
	 * The name of the method for a representation is stored in the
	 * field {@link #representationToMethodName}.
	 * 
	 * @author Dominik Werle 
	 */
	def generateRepresentations(EList<Representation> representations) {
		'''
		«FOR repr : representations»
		«generateRepresentation(repr)»
		«ENDFOR»
		'''
	}
	
	/**
	 * Generates a representation encoding method for a representation.
	 * <p>
	 * The name of the representation is also stored in the
	 * representationToMethodName-Map for later reference.
	 * @param representation the representation to generate
	 *        a representaton encoding method for
	 * @return the method definition
	 */
	def generateRepresentation(Representation representation) {
		val methodName = "encode_" + representation.name
		representationToMethodName.put(representation, methodName)
		
		'''
		/**
		 * Takes a {@code «representation.type.toJavaName»} and returns an array of bytes
		 * of length «representation.byteCount» that represent it.
		 * @param input the {@code «representation.type.toJavaName»} to encode as a byte array
		 * @return a byte array representing the input {@code «representation.type.toJavaName»}
		 * @generated
		 */
		private static byte[] «methodName»(«representation.type.toJavaName» input) {
			// return a byte array representing the input {@code «representation.type.toJavaName»}
			return null;
		}
		'''
	}
	
	/**
	 * Generates a encoder class.
	 * @param fsa file system access for file generation
	 * @see ISensidlGenerator#doGenerate(IFileSystemAccess)
	 */
	override doGenerate(IFileSystemAccess fsa) {
		val encoderClassName = classNameBase + "Encoder"
		val dtoClassName = classNameBase + "DTO"
		
		fsa.generateFile(encoderClassName.toFileName, '''
		/**
		 * Java class for encoding a {@link «dtoClassName»}
		 *
		 * @generated
		 */
		class «encoderClassName» {
			// representation methods
			«generateRepresentations(input.representations)»
			
			«FOR ip : input.transmit»
			«generateEncoderMethod(dtoClassName, ip)»
			«ENDFOR»
		}
		''')
	}
	
	/**
	 * Generates a encoder method for an interpretation.
	 * <p>
	 * If the method has already been created, an empty method
	 * will be returned.
	 * 
	 * @return encoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param ip the interpretation 
	 * @see #doGenerateEncoderMethod(String, Interpretation)
	 */
	def String generateEncoderMethod(String dtoClassName, Interpretation ip) {
		if (encoderMethodName.containsKey(ip)) ''''''
		else {
			encoderMethodName.put(ip, ip.encodeName.toString)
			return doGenerateEncoderMethod(dtoClassName, ip)
		}
	}
	
	
	/**
	 * Generates the Javadoc comment for a encoder method for an interpretation.
	 * @return  the Javadoc comment for a encoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param ip the interpretation 
	 */
	def private String generateEncoderMethodJavaDoc(Interpretation ip, String dtoClassName) {
		'''
		/**
		 * Encode function for «ip.class.simpleName» «ip.encodeName».
		 * 
		 * @param input the {@link «dtoClassName»} from which the data is pulled
		 * @return the input byte array representing the bytes corresponding to the
		 *         the «ip.class.simpleName» of the {@link «dtoClassName»}
		 * @generated
		 */
		'''
	}
	
	/**
	 * Generates a encoder method for an interpretation group.
	 * 
	 * @return encoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param group the interpretation group 
	 * @see #generateEncoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateEncoderMethod(String dtoClassName, InterpretationGroup group) {
		group.interpretations.map [ generateEncoderMethod(dtoClassName, it) ].join("\n") + "\n" +
		
		'''
		«group.generateEncoderMethodJavaDoc(dtoClassName)»
		public static byte[] «group.encodeName»(«dtoClassName» dto) {
			byte[] bytes = {};
			«FOR interpretation : group.interpretations»
			bytes = «interpretation.encodeName»(dto); // actually: merge arrays
			«ENDFOR»
			
			return bytes;
		}
		'''
	}
	
	/**
	 * Generates a encoder method for an constant interpretation.
	 * 
	 * @return encoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param const the constant interpretation 
	 * @see #generateEncoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateEncoderMethod(String dtoClassName, Constant<?> const) {
		'''
		«const.generateEncoderMethodJavaDoc(dtoClassName)»
		public static byte[] «const.encodeName»(«dtoClassName» dto) {
			byte[] bytes = «representationToMethodName.get(const.representation)»(«dtoClassName».«DTOGenerator.getStandardGetterName(const)»());
							
			return bytes;
		}
		'''
	}
	
	/**
	 * Generates a encoder method for an primitive interpretation.
	 * 
	 * @return encoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param primitive the constant interpretation 
	 * @see #generateEncoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateEncoderMethod(String dtoClassName, PrimitiveInterpretation primitive) {
		'''
		«primitive.generateEncoderMethodJavaDoc(dtoClassName)»
		public static byte[] «primitive.encodeName»(«dtoClassName» dto) {
			byte[] bytes = «representationToMethodName.get(primitive.representation)»(
				dto.«DTOGenerator.getStandardGetterName(primitive)»());
			
			return bytes;
		}
		'''
	}
	
	/**
	 * Generates a encoder method for an measurement interpretation.
	 * 
	 * @return encoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param measurement the constant interpretation 
	 * @see #generateEncoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateEncoderMethod(String dtoClassName, Measurement measurement) {
		'''
		«measurement.generateEncoderMethodJavaDoc(dtoClassName)»
		public static byte[] «measurement.encodeName»(«dtoClassName» dto) {
			byte[] bytes = «representationToMethodName.get(measurement.representation)»(

			«FOR c : measurement.constraints»
			«c.generateConstraintCode»
			«ENDFOR»

				«IF measurement.scale != 1»
					dto.«DTOGenerator.getStandardGetterName(measurement)»() / «measurement.scale»d
				«ELSE»
					dto.«DTOGenerator.getStandardGetterName(measurement)»()
				«ENDIF»
			);
			
			
			return bytes;
		}
		'''
	}
	
	/**
	 * Generates a encoder method for an calculated interpretation.
	 * 
	 * @return encoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param calculated the constant interpretation 
	 * @see #generateEncoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateEncoderMethod(String dtoClassName, Calculated calculated) {
		calculated.parameter.map [ generateEncoderMethod(dtoClassName, interpretation) ].join("\n") + "\n" +
		
		'''
		«calculated.generateEncoderMethodJavaDoc(dtoClassName)»
		public static byte[] «calculated.encodeName»(«dtoClassName» dto) {
			// byte[] encoded = null; /* must be implemented by the user */
			
			return encoded;
		}
		'''
	}
}