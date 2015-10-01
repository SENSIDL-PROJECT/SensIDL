package de.fzi.sensidl.language.generator.c

import de.fzi.sensidl.language.generator.IDTOGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.HashMap
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data

/**
* The CDTOGenerator represents a concrete  implementation
* of @see IDTOGenerator
*/
abstract class CDTOGenerator implements IDTOGenerator {
	protected final static String C_EXTENSION = ".c";
	protected final static String MARSHAL_FILE = "DataMarshalling";
	protected final static String HEADER_EXTENSION = ".h";
	protected Resource input
	protected IFileSystemAccess fsa;
	
	/**
 	* Defines the constructor of CGenerator.
 	* @param input
 	* 			contains all model elements.
 	* @param fsa
 	* 			is needed to generate a file.
 	*/
	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}
	
	/**
	 * Maps to the corresponding language type.
	 * @see IDTOGenerator#toTypeName(Data)
	 */
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