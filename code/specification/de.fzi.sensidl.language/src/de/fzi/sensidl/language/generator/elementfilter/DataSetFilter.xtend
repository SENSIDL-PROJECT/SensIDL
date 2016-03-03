package de.fzi.sensidl.language.generator.elementfilter

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
import java.util.List

/**
 * Implements the ElementFilter-class.
 */
class DataSetFilter extends ElementFilter {

	/**
 	* Implements the abstract method of the base-class and filters all DataSet-elements.
	* @see ElementFilter#filterData()
 	*/
	override List<DataSet> filterData() {
		input.contents.filter(SensorInterface).head.eAllContents
					  .filter(SensorDataDescription).head.eAllContents.toIterable
					  .filter(DataSet).toList
	}
}