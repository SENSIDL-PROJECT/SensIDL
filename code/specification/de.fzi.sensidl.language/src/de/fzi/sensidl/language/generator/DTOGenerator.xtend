package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.Constant
import sensidl.DataModel
import sensidl.Interpretation
import sensidl.Measurement
import sensidl.PrimitiveInterpretation
import sensidl.Type

class DTOGenerator implements ISensidlGenerator {
	private final String classNameBase
	private final String dtoClassName
	private final DataModel input
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
		this.dtoClassName = classNameBase + "DTO"
	}
	
	/**
	 * Generates a DTO class.
	 * @param fsa file system access for file generation
	 * @see ISensidlGenerator#doGenerate(IFileSystemAccess)
	 */
	override doGenerate(IFileSystemAccess fsa) {
		val interpretations = input.transmit.map [ SensidlPseudoCodeGenerator.collectInterpretationList(it) ].flatten
		fsa.generateFile(SensidlPseudoCodeGenerator.toFileName(dtoClassName), generateDTOClass(dtoClassName, interpretations))
	}
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given primitive interpretation
	 * (i.e. its {@link PrimitiveInterpretation#getType()}).
	 * @param ip the interpretation to get the type for
	 * @return {@link PrimitiveInterpretation#getType()}
	 */
	def static dispatch toType(PrimitiveInterpretation ip) { ip.type }
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given Measurement (i.e. Double)
	 * @param ip the interpretation to get the type for
	 * @return @link Type.DOUBLE
	 */
	def static dispatch toType(Measurement ip) { Type.DOUBLE }
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given constant interpretation (i.e. the type of its representation).
	 * @param ip the interpretation to get the type for
	 * @return the type of the representation of <code>ip</code>
	 */
	def static dispatch toType(Constant<?> ip) { ip.representation.type }
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given interpretation.
	 * <p>
	 * This is the base case that occurs if no other dispatch
	 * method matches and will throw an {@link IllegalArgumentException}.
	 * @param ip the interpretation to get the type for
	 * @return -
	 * @throws IllegalArgumentException always
	 */
	def static dispatch toType(Interpretation ip) {
		throw new IllegalArgumentException("Unsupported interpretation type");
	}
	
	/**
	 * Convenience method for getting the Java name of the 
	 * Type of an interpretation.
	 * @param ip the interpretation to get the Java name of the type for
	 * @return the Java name of the type corresponding to
	 *          <code>ip</code>
	 * @see SensidlPseudoCodeGenerator#toJavaName(Type)
	 */
	def static toTypeName(Interpretation ip) { SensidlPseudoCodeGenerator.toJavaName(ip.toType) }
	
	/**
	 * Convenience method for getting the Java name of the 
	 * <strong>primitive</strong> type corresponding to the Type of an interpretation.
	 * @param ip the interpretation to get the Java name of the type for
	 * @return the Java name of the primitive type corresponding to
	 *          <code>ip</code>
	 * @see SensidlPseudoCodeGenerator#toPrimitiveJavaName(Type)
	 */		
	def static toPrimitiveTypeName(Interpretation ip) { SensidlPseudoCodeGenerator.toPrimitiveJavaName(ip.toType) }

	/**
	 * Transforms a constant interpretation to a <code>public static</code> field with
	 * a constant value.
	 * @param ip the constant interpretation to transform
	 * @return a string containing the Java field declaration 
	 */
	def static dispatch String toField(Constant<?> ip) {
		'''
		public static «ip.toTypeName» «ip.toFieldName» = («ip.toPrimitiveTypeName») «ip.constantValue»
		'''
	}

	/**
	 * Transforms a interpretation (that is not a constant interpretation)
	 * to a <code>private</code> field.
	 * @param ip the interpretation to transform
	 * @return a string containing the Java field declaration 
	 */
	def static dispatch String toField(Interpretation ip) { '''private «ip.toTypeName» «ip.toFieldName»''' }

	/**
	 * Returns the name of the field corresponding with a constant interpretation.
	 * @param ip the constant interpretation
	 * @return the name of the field
	 */
	def static dispatch String toFieldName(Constant<?> ip) { ip.name.toUpperCase }
	
	/**
	 * Returns the name of the field corresponding with an interpretation.
	 * @param ip the interpretation
	 * @return the name of the field
	 */
	def static dispatch String toFieldName(Interpretation ip) { ip.name.toFirstLower }
	
	
	/**
	 * Returns the name of the getter method for an interpretation.
	 * @param ip the interpretation
	 * @return the name of the getter method
	 */
	def static String getStandardGetterName(Interpretation ip) {
		'''get«ip.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
	}
	
	/**
	 * Returns the getter method for a constant interpretation.
	 * @param ip the constant interpretation
	 * @return the getter method
	 */
	def dispatch String toGetter(Constant<?> ip) {
		'''
		public static «ip.toTypeName» «ip.standardGetterName»() {
			return «dtoClassName».«ip.toFieldName»;
		}
		'''
	}

	/**
	 * Returns the getter method for a interpretation (that is not a constant
	 * interpretation)
	 * @param ip the interpretation
	 * @return the getter method
	 */
	def dispatch String toGetter(Interpretation ip) {
		'''
		public «ip.toTypeName» «ip.standardGetterName»() {
			return this.«ip.toFieldName»;
		}
		'''
	}

	/**
	 * An empty string, since a constant field has no setter method.
	 * @param ip a constant interpretation
	 * @return an empty string
	 */
	def static dispatch String toSetter(Constant<?> ip) { '''''' }
	
	
	/**
	 * Returns the name for the setter for an interpretation
	 * (that is not a constant interpretation).
	 * @param ip the interpretation
	 * @return the name of the setter method
	 */
	def static dispatch String getStandardSetterName(Interpretation ip) {
		'''set«ip.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
	}
	
	/**
	 * Transforms a string representing a unit to a string that can
	 * be used in a Java identifier (here: in a method name).
	 * @param s the unit
	 * @return an escaped form of the unit that can be used in a Java
	 *         identifier
	 */
	def static String getUnitJavaName(String s) {
		s.replace("/", "Per").replaceAll("[^a-zA-Z0-9]", "");
	}
	
	/**
	 * Returns the name for the setter for a measurement
	 * interpretation.
	 * @param ip the interpretation
	 * @return the name of the setter method (including the unit)
	 */
	def static dispatch String getStandardSetterName(Measurement ip) {
		'''set«ip.toFieldName.toFirstUpper»In«ip.unit.unitJavaName»'''
	}

	/**
	 * A setter method for the field generated for an interpretation
	 * @param ip an interpretation
	 * @return a setter method
	 */
	def static dispatch String toSetter(Interpretation ip) {
		'''
		public void «ip.standardSetterName»(«ip.toTypeName» new«ip.toFieldName.toFirstUpper») {
			this.«ip.toFieldName» = new«ip.toFieldName.toFirstUpper»;
		}
		'''
	}

	/**
	 * Generates a DTO class that encapsulates all interpretations
	 * that are passed to the method.
	 * 
	 * @author Dominik Werle
	 * @param className the name of the class to create
	 * @param interpretations the interpretations to include in the DTO
	 */
	def generateDTOClass(String className, Iterable<Interpretation> interpretations) {
		'''
		/**
		 * Data transfer object for «className»
		 *
		 * @generated
		 */
		class «className» {
			// fields
			«FOR ip : interpretations»
			«ip.toField»;
			«ENDFOR»
			
			/**
			 * Empty constructor, uninitialized state.
			 * @generated
			 */
			public «className»() { }
			
			«FOR ip : interpretations»
			«ip.toGetter»
			«ENDFOR»
			
			«FOR ip : interpretations»
			«ip.toSetter»
			«ENDFOR»
		}
		'''
	}
}