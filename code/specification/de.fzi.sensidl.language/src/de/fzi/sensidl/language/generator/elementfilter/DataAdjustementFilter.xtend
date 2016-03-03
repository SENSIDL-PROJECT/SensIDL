package de.fzi.sensidl.language.generator.elementfilter

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
import java.util.List

/**
 * Implements the ElementFilter-class.
 */
class DataAdjustementFilter extends ElementFilter {
	
	/**
	 * Implements the abstract method of the base-class and filters 
	 * all MeasurementData-elements.
	 * @see ElementFilter#filterData()
	 */
	override List<MeasurementData> filterData() {	
		input.contents.filter(SensorInterface).head.eAllContents
					  .filter(SensorDataDescription).head.eAllContents.toIterable
					  .filter(MeasurementData)
					  .filter[data | data.isAdjusted].toList
	}
	
	private def isAdjusted(MeasurementData data) {
		return ((data.adjustments.size > 0) && (data.adjustments.get(0) instanceof DataConversion))
	}
}