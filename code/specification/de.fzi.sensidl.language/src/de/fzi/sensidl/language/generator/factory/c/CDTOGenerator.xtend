package de.fzi.sensidl.language.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.List

/**
* The CDTOGenerator represents a concrete  implementation
* of @see IDTOGenerator
*/
abstract class CDTOGenerator implements IDTOGenerator {
	protected List<DataSet> dataSet
	
	new(List<DataSet> newDataSet) {
		this.dataSet = newDataSet
	}
	
	/**
	 * Maps to the corresponding language type.
	 * @see IDTOGenerator#toTypeName(Data)
	 */
	override String toTypeName(Data data) {
		DataTypes.getDataTypeBy(data.dataType)
	}
}