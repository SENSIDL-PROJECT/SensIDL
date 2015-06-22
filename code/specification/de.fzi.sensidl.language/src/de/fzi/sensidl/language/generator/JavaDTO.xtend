package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel
import sensidl.Datafield
import sensidl.ConstantData
import sensidl.Data
import sensidl.Type
import sensidl.VariableData
import sensidl.NonMeasuredData
import sensidl.MeasuredData

/**
 * Implementation of the IDTO interface for java-code-generation
 * 
 * @author Dominik Werle - Initial implementation
 * @author Max Scheerer - Improved code-generation-architecture
 */

class JavaDTO extends DTO {
	new(DataModel input, String classNameBase) {
		super(input, classNameBase);
	}
	
	/**
	 * Generates a DTO class.
	 * @param fsa file system access for file generation
	 * @see ISensidlGenerator#doGenerate(IFileSystemAccess)
	 */
	override generate(IFileSystemAccess fsa) {
		val datafields = input.transmit.map [ SensidlPseudoCodeGenerator.collectDatafields(it) ].flatten
		fsa.generateFile(SensidlPseudoCodeGenerator.toFileName(dtoClassName), generateDTOClass(dtoClassName, datafields))
	}

	/**
	 * Generates a DTO class that encapsulates all Datafields
	 * that are passed to the method.
	 * 
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
	
	/**
	 * A setter method for the field generated for an Datafield
	 * @param datafield an Datafield
	 * @return a setter method
	 */
	def static String toSetter(Datafield datafield) {
		if(false == (datafield instanceof ConstantData)) {		
			'''
			public void «datafield.standardSetterName»(«datafield.toTypeName» new«datafield.toFieldName.toFirstUpper») {
				this.«datafield.toFieldName» = new«datafield.toFieldName.toFirstUpper»;
			}
			'''
		}
	}
	
	/**
	 * Returns the name for the setter for an Datafield
	 * (that is not a constant Datafield).
	 * @param datafield the Datafield
	 * @return the name of the setter method
	 */
	def static dispatch String getStandardSetterName(Datafield datafield) {
		'''set«datafield.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
	}
	
	/**
	 * Returns the name for the setter for a Data
	 * @param data the Data
	 * @return the name of the setter method (including the unit)
	 */
	def static dispatch String getStandardSetterName(Data data) {
		if(data.unit != null)
		{
			'''set«data.toFieldName.toFirstUpper»In«data.unit.unitJavaName»'''
		}
		else
		{
			'''set«data.toFieldName.toFirstUpper»'''
		}
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
	 * Returns the getter method for a Datafield (that is not a constant
	 * Datafield)
	 * @param datafield the Datafield
	 * @return the getter method
	 */
	def String toGetter(Datafield datafield) {
		'''
		public «datafield.toTypeName» «datafield.standardGetterName»() {
			return this.«datafield.toFieldName»;
		}
		'''
	}
	
	/**
	 * Returns the name of the getter method for an Datafield.
	 * @param datafield the Datafield
	 * @return the name of the getter method
	 */
	def static String getStandardGetterName(Datafield datafield) {
		'''get«datafield.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
	}
	
	/**
	 * Transforms a Datafield (that is not a constant Datafield)
	 * to a <code>private</code> field.
	 * @param datafield the Datafield to transform
	 * @return a string containing the Java field declaration 
	 */
	def static String toField(Datafield datafield) { '''private «if(datafield instanceof ConstantData) "final static"» «datafield.toTypeName» «datafield.toFieldName»''' }
	
	/**
	 * Convenience method for getting the Java name of the 
	 * Type of an Datafield.
	 * @param datafield the Datafield to get the Java name of the type for
	 * @return the Java name of the type corresponding to
	 *          <code>datafield</code>
	 * @see SensidlPseudoCodeGenerator#toJavaName(Type)
	 */
	def static toTypeName(Datafield datafield) { 
		// TODO: This is a first solution for constantdata and not clear at this point
		if(datafield instanceof ConstantData) {
			return '''java.lang.String'''
		}
	
		SensidlPseudoCodeGenerator.toJavaName(datafield.toType)
	}
	
	/**
	 * Returns a constant type ({@link Type}) that corresponds
	 * to the given Data (i.e. Double)
	 * @param nonMeasuredData the NonMeasuredData to get the type for
	 * @return @link Type.DOUBLE
	 */
	def static dispatch toType(NonMeasuredData nonMeasuredData) { nonMeasuredData.type }
	
	/**
	 * Returns a constant type ({@link Type}) that corresponds
	 * to the given Data (i.e. Double)
	 * @param measuredData the MeasuredData to get the type for
	 * @return @link Type.DOUBLE
	 */
	def static dispatch toType(MeasuredData measuredData) { Type.DOUBLE }

	/**
	 * Returns a constant type ({@link Type}) that corresponds
	 * to the given Datafield.
	 * <p>
	 * This is the base case that occurs if no other dispatch
	 * method matches and will throw an {@link IllegalArgumentException}.
	 * @param datafield the Datafield to get the type for
	 * @return -
	 * @throws IllegalArgumentException always
	 */
	def static dispatch toType(Datafield datafield) {
		throw new IllegalArgumentException("Unsupported Datafield type");
	}
	
	/**
	 * Returns the name of the field corresponding with an Datafield.
	 * @param datafield the Datafield
	 * @return the name of the field
	 */
	def static String toFieldName(Datafield datafield) { datafield.name.toFirstLower }
}