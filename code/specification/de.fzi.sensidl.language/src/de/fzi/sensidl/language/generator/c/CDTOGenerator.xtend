package de.fzi.sensidl.language.generator.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.language.generator.IDTOGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
* The CDTOGenerator represents a concrete  implementation
* of @see IDTOGenerator
*/
abstract class CDTOGenerator implements IDTOGenerator {
	protected Resource input
	protected IFileSystemAccess fsa;
	
	protected final static String HEADER_EXTENSION = ".h";
	
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
		DataTypes.getDataTypeBy(data.dataType)
	}
}