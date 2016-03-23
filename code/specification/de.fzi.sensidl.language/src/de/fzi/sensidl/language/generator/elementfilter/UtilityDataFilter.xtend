package de.fzi.sensidl.language.generator.elementfilter

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
import java.util.List
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList

/**
 * Implements the ElementFilter-class.
 */
class UtilityDataFilter extends ElementFilter {
	
	//private List<Predicate<MeasurementData>> conditions;
	
	/**
	 * Default constructor.
	 */
	new() {
		//conditions += [data | data.isAdjusted]
	}
	
	/**
	 * Implements the abstract method of the base-class and filters 
	 * all MeasurementData-elements.
	 * @see ElementFilter#filterData()
	 */
	override List<EObject> filterData() {	
		var data = new ArrayList<EObject> (input.contents.filter(SensorInterface).head.eAllContents
					  							.filter(SensorDataDescription).head.eAllContents.toIterable
					  							.filter(MeasurementData)
					  							.filter[mData | mData.isAdjusted].toList
					  							//.filter[data | conditions.exists[condition | condition.test(data)]].toList)
					  					  )
					  
		data.add(input.contents.filter(SensorInterface).get(0));
		
		data
	}
	
	private def isAdjusted(MeasurementData data) {
		return ((data.adjustments.size > 0) && (data.adjustments.get(0) instanceof DataConversion))
	}
}