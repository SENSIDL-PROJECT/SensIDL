package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel
import sensidl.Datafield
import sensidl.Data
import sensidl.ConstantData
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
		val datafields = input.transmit.map [ SensidlPseudoCodeGenerator.collectDatafields(it) ].flatten
		fsa.generateFile(SensidlPseudoCodeGenerator.toFileName(dtoClassName), generateDTOClass(dtoClassName, datafields))
	}
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given primitive Datafield
	 * (i.e. its {@link ConstantData#getType()}).
	 * @param ip the Datafield to get the type for
	 * @return {@link ConstantData#getType()}
	 */
	def static dispatch toType(ConstantData cp) { cp.type }
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given Data (i.e. Double)
	 * @param ip the Datafield to get the type for
	 * @return @link Type.DOUBLE
	 */
	def static dispatch toType(Data data) { Type.DOUBLE }
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given constant Datafield (i.e. the type of its representation).
	 * @param ip the Datafield to get the type for
	 * @return the type of the representation of <code>ip</code>
	 */
	 //not supported anymore
	//def static dispatch toType(Constant<?> ip) { ip.representation.type }
	
	/**
	 * Returns a primitive type ({@link Type}) that corresponds
	 * to the given Datafield.
	 * <p>
	 * This is the base case that occurs if no other dispatch
	 * method matches and will throw an {@link IllegalArgumentException}.
	 * @param ip the Datafield to get the type for
	 * @return -
	 * @throws IllegalArgumentException always
	 */
	def static dispatch toType(Datafield datafield) {
		throw new IllegalArgumentException("Unsupported Datafield type");
	}
	
	/**
	 * Convenience method for getting the Java name of the 
	 * Type of an Datafield.
	 * @param ip the Datafield to get the Java name of the type for
	 * @return the Java name of the type corresponding to
	 *          <code>ip</code>
	 * @see SensidlPseudoCodeGenerator#toJavaName(Type)
	 */
	def static toTypeName(Datafield datafield) { SensidlPseudoCodeGenerator.toJavaName(datafield.toType) }
	
	/**
	 * Convenience method for getting the Java name of the 
	 * <strong>primitive</strong> type corresponding to the Type of an Datafield.
	 * @param ip the Datafield to get the Java name of the type for
	 * @return the Java name of the primitive type corresponding to
	 *          <code>ip</code>
	 * @see SensidlPseudoCodeGenerator#toPrimitiveJavaName(Type)
	 */		
	def static toPrimitiveTypeName(Datafield datafield) { SensidlPseudoCodeGenerator.toPrimitiveJavaName(datafield.toType) }

	/**
	 * Transforms a constant Datafield to a <code>public static</code> field with
	 * a constant value.
	 * @param ip the constant Datafield to transform
	 * @return a string containing the Java field declaration 
	 */
	 //not supported anymore
	/*def static dispatch String toField(Constant<?> ip) {
		'''
		public static «ip.toTypeName» «ip.toFieldName» = («ip.toPrimitiveTypeName») «ip.constantValue»
		'''
	}*/

	/**
	 * Transforms a Datafield (that is not a constant Datafield)
	 * to a <code>private</code> field.
	 * @param ip the Datafield to transform
	 * @return a string containing the Java field declaration 
	 */
	def static dispatch String toField(Datafield datafield) { '''private «datafield.toTypeName» «datafield.toFieldName»''' }

	/**
	 * Returns the name of the field corresponding with a constant Datafield.
	 * @param ip the constant Datafield
	 * @return the name of the field
	 */
	 //not supported anymore
	//def static dispatch String toFieldName(Constant<?> ip) { ip.name.toUpperCase }
	
	/**
	 * Returns the name of the field corresponding with an Datafield.
	 * @param ip the Datafield
	 * @return the name of the field
	 */
	def static dispatch String toFieldName(Datafield datafield) { datafield.name.toFirstLower }
	
	
	/**
	 * Returns the name of the getter method for an Datafield.
	 * @param ip the Datafield
	 * @return the name of the getter method
	 */
	def static String getStandardGetterName(Datafield datafield) {
		'''get«datafield.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
	}
	
	/**
	 * Returns the getter method for a constant Datafield.
	 * @param ip the constant Datafield
	 * @return the getter method
	 */
	 //not supported anymore
	/*def dispatch String toGetter(Constant<?> ip) {
		'''
		public static «ip.toTypeName» «ip.standardGetterName»() {
			return «dtoClassName».«ip.toFieldName»;
		}
		'''
	}*/

	/**
	 * Returns the getter method for a Datafield (that is not a constant
	 * Datafield)
	 * @param ip the Datafield
	 * @return the getter method
	 */
	def dispatch String toGetter(Datafield datafield) {
		'''
		public «datafield.toTypeName» «datafield.standardGetterName»() {
			return this.«datafield.toFieldName»;
		}
		'''
	}

	/**
	 * An empty string, since a constant field has no setter method.
	 * @param ip a constant Datafield
	 * @return an empty string
	 */
	 //not supported anymore
	//def static dispatch String toSetter(Constant<?> ip) { '''''' }
	
	
	/**
	 * Returns the name for the setter for an Datafield
	 * (that is not a constant Datafield).
	 * @param ip the Datafield
	 * @return the name of the setter method
	 */
	def static dispatch String getStandardSetterName(Datafield datafield) {
		'''set«datafield.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
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
	 * Returns the name for the setter for a Data
	 * Datafield.
	 * @param ip the Datafield
	 * @return the name of the setter method (including the unit)
	 */
	def static dispatch String getStandardSetterName(Data ip) {
		if(ip.unit != null)
		{
			'''set«ip.toFieldName.toFirstUpper»In«ip.unit.unitJavaName»'''
		}
		else
		{
			'''set«ip.toFieldName.toFirstUpper»'''
		}
	}

	/**
	 * A setter method for the field generated for an Datafield
	 * @param ip an Datafield
	 * @return a setter method
	 */
	def static dispatch String toSetter(Datafield datafield) {
		'''
		public void «datafield.standardSetterName»(«datafield.toTypeName» new«datafield.toFieldName.toFirstUpper») {
			this.«datafield.toFieldName» = new«datafield.toFieldName.toFirstUpper»;
		}
		'''
	}

	/**
	 * Generates a DTO class that encapsulates all Datafields
	 * that are passed to the method.
	 * 
	 * @author Dominik Werle
	 * @param className the name of the class to create
	 * @param Datafields the Datafields to include in the DTO
	 */
	def generateDTOClass(String className, Iterable<Datafield> Datafields) {
		'''
		/**
		 * Data transfer object for «className»
		 *
		 * @generated
		 */
		class «className» {
			// fields
			«FOR ip : Datafields»
			«ip.toField»;
			«ENDFOR»
			
			/**
			 * Empty constructor, uninitialized state.
			 * @generated
			 */
			public «className»() { }
			
			«FOR ip : Datafields»
			«ip.toGetter»
			«ENDFOR»
			
			«FOR ip : Datafields»
			«ip.toSetter»
			«ENDFOR»
		}
		'''
	}
}