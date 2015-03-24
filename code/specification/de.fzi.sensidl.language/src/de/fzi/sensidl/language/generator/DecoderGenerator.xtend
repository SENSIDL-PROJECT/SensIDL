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
 * Nested class for the generation of a decoder
 * @author Dominik Werle
 */
class DecoderGenerator implements ISensidlGenerator {
	private Map<Interpretation, String> decoderMethodName
	private final String classNameBase
	private final DataModel input
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase

		representationToMethodName = new HashMap
		decoderMethodName = new HashMap
	}
	
	/**
	 * Generates a decoder class.
	 * @param fsa file system access for file generation
	 * @see ISensidlGenerator#doGenerate(IFileSystemAccess)
	 */
	override doGenerate(IFileSystemAccess fsa) {
		val decoderClassName = classNameBase + "Decoder"
		val dtoClassName = classNameBase + "DTO"
		
		fsa.generateFile(decoderClassName.toFileName, '''
		/**
		 * Java class for decoding a {@link «dtoClassName»}
		 *
		 * @generated
		 */
		class «decoderClassName» {
			// representation methods
			«generateRepresentations(input.representations)»
			
			«FOR ip : input.transmit»
			«generateDecoderMethod(dtoClassName, ip)»
			«ENDFOR»
			
			«generateAddListenerMethod»
			
			«generateRemoveListenerMethod»
		}
		''')
	}

	/**
	 * Generates a method for adding listeners to the class.
	 * @return a method for adding listeners to the class
	 */
	def generateAddListenerMethod() {
		'''
		/**
		 * Adds a listener to call for incoming packets.
		 * @param listener the listener to add.
		 */
		 public void addListener(«classNameBase + "Listener"» listener) {
		 	// add the listener
		 }'''
	}
	
	/**
	 * Generates a method for removing listeners to the class.
	 * @return a method for removing listeners to the class
	 */
	def generateRemoveListenerMethod() {
		'''
		/**
		 * Removes a listener to call for incoming packets.
		 * @param listener the listener to remove.
		 */
		 public void removeListener(«classNameBase + "Listener"» listener) {
		 	// remove the listener
		 }'''
	}
	
	
	/**
	 * Generates a decoder method for an interpretation.
	 * <p>
	 * If the method has already been created, an empty method
	 * will be returned.
	 * 
	 * @return decoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param ip the interpretation 
	 * @see #doGenerateDecoderMethod(String, Interpretation)
	 */
	def String generateDecoderMethod(String dtoClassName, Interpretation ip) {
		if (decoderMethodName.containsKey(ip)) ''''''
		else {
			decoderMethodName.put(ip, ip.decodeName.toString)
			return doGenerateDecoderMethod(dtoClassName, ip)
		}
	}
	
	/**
	 * Generates the Javadoc comment for a decoder method for an interpretation.
	 * @return  the Javadoc comment for a decoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param ip the interpretation 
	 */
	def private String generateDecoderMethodJavaDoc(Interpretation ip, String dtoClassName) {
		'''
		/**
		 * Decode function for «ip.class.simpleName» «ip.decodeName».
		 * 
		 * @param src the array of bytes from which the data is decoded
		 * @param dto the data transfer object (of type {@link «dtoClassName»}) that
		 *            is modified.
		 * @return the input byte array after removing the bytes used to decode
		 *         the «ip.class.simpleName»
		 * @generated
		 */
		'''
	}
	
	/**
	 * Generates a decoder method for an interpretation group.
	 * 
	 * @return decoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param group the interpretation group 
	 * @see #generateDecoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateDecoderMethod(String dtoClassName, InterpretationGroup group) {
		group.interpretations.map [ generateDecoderMethod(dtoClassName, it) ].join("\n") + "\n" +
		
		'''
		«group.generateDecoderMethodJavaDoc(dtoClassName)»
		public static byte[] «group.decodeName»(byte[] src, «dtoClassName» dto) {
			«FOR interpretation : group.interpretations»
			src = «interpretation.decodeName»(src, dto);
			«ENDFOR»
			
			return src;
		}
		'''
	}
	
	/**
	 * Generates a decoder method for a constant interpretation.
	 * 
	 * @return decoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param const the constant interpretation 
	 * @see #generateDecoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateDecoderMethod(String dtoClassName, Constant<?> const) {
		'''
		«const.generateDecoderMethodJavaDoc(dtoClassName)»
		public static byte[] «const.decodeName»(byte[] src, «dtoClassName» dto) {
			// also delete the bytes that are taken
			«const.representation.type.toJavaName» value = «representationToMethodName.get(const.representation)»(src);
			
			assert value.equals(«dtoClassName».«DTOGenerator.toFieldName(const)»);
			
			return src;
		}
		'''
	}
	
	/**
	 * Generates a decoder method for a primitive interpretation.
	 * 
	 * @return decoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param primitive the primitive interpretation 
	 * @see #generateDecoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateDecoderMethod(String dtoClassName, PrimitiveInterpretation primitive) {
		'''
		«primitive.generateDecoderMethodJavaDoc(dtoClassName)»
		public static byte[] «primitive.decodeName»(byte[] src, «dtoClassName» dto) {
			// also delete the bytes that are taken
			«primitive.type.toJavaName» value = new «primitive.type.toJavaName»(«representationToMethodName.get(primitive.representation)»(src));
			dto.«DTOGenerator.getStandardSetterName(primitive)»(value);
			
			return src;
		}
		'''
	}
	
	/**
	 * Generates a decoder method for a measurement interpretation.
	 * 
	 * @return decoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param measurement the measurement interpretation 
	 * @see #generateDecoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateDecoderMethod(String dtoClassName, Measurement measurement) {
		'''
		«measurement.generateDecoderMethodJavaDoc(dtoClassName)»
		public static byte[] «measurement.decodeName»(byte[] src, «dtoClassName» dto) {
			// also delete the bytes that are taken
			«measurement.representation.type.toJavaName» value = «representationToMethodName.get(measurement.representation)»(src);

			«FOR c : measurement.constraints»
			«c.generateConstraintCode»
			«ENDFOR»

			«IF measurement.scale != 1»
				dto.«DTOGenerator.getStandardSetterName(measurement)»(new Double(value * «measurement.scale»d));
			«ELSE»
				dto.«DTOGenerator.getStandardSetterName(measurement)»(new Double(value));
			«ENDIF»
			
			return src;
		}
		'''
	}
	
	/**
	 * Generates a decoder method for a calculated interpretation.
	 * 
	 * @return decoder method for an interpretation
	 * @param dtoClassName the name of the DTO class
	 * @param calculated the calculated interpretation 
	 * @see #generateDecoderMethod(String, Interpretation)
	 */
	def dispatch String doGenerateDecoderMethod(String dtoClassName, Calculated calculated) {
		calculated.parameter.map [ generateDecoderMethod(dtoClassName, interpretation) ].join("\n") + "\n" +
		
		'''
		«calculated.generateDecoderMethodJavaDoc(dtoClassName)»
		public static byte[] «calculated.decodeName»(byte[] src, «dtoClassName» dto) {
			// byte[] decoded = null; /* must be implemented by the user */
			
			«FOR interpretation : calculated.parameter.map[interpretation]»
			decoded = «interpretation.decodeName»(decoded, dto);
			«ENDFOR»
			
			return decoded;
		}
		'''
	}
	
	/**
	 * Map for storing method name of represenation methods
	 */
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
	 * Generates a representation decoding method for a representation.
	 * <p>
	 * The name of the representation is also stored in the
	 * representationToMethodName-Map for later reference.
	 * @param representation the representation to generate
	 *        a representaton decoding method for
	 * @return the method definition
	 */
	def generateRepresentation(Representation representation) {
		val methodName = "decode_" + representation.name
		representationToMethodName.put(representation, methodName)
		
		'''
		/**
		 * Takes «representation.byteCount» bytes from {@code bytes} and interprets
		 * them as a {@code «representation.type.toJavaName»}.
		 * @param bytes the array of bytes to interpret as a «representation.type.toJavaName»
		 * @return a {@code «representation.type.toJavaName»} obtained from the input bytes
		 * @generated
		 */
		private static «representation.type.toJavaName» «methodName»(byte[] bytes) {
			// take «representation.byteCount» bytes from bytes and cast them to «representation.type.toJavaName»
			return null;
		}
		'''
	}
}