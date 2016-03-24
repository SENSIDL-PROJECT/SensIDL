package de.fzi.sensidl.language.generator

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import org.eclipse.emf.ecore.EObject
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion

/**
 * The GenerationUtil-class is used to implement common methods, which are 
 * used in different generation-classes.
 */
class GenerationUtil {
	
	/**
	 * Given a current element of the sensidl-element-tree, the getSensorInterface-
	 * method compares recursively the high-level elements of the tree until it 
	 * finds the SensorInterface-element.
	 * @param currentElement Corresponds to the current element in the sensidl-element-tree.
	 * @return the high-level SensorInterface-element.
	 */
	static def SensorInterface getSensorInterface(EObject currentElement) {
		if (currentElement instanceof SensorInterface) {
			return (currentElement as SensorInterface);
		}
		return getSensorInterface(currentElement.eContainer());
	}
	
	/**
	 * Returns the name instead of the SensorInterface-object.
	 * @param currentElement Corresponds to the current element in the sensidl-element-tree.
	 * @return the high-level SensorInterface-element.
	 */
	static def String getSensorInterfaceName(EObject currentElement) {
		return getSensorInterface(currentElement).name
	}
	
	/**
	 * Ensures that the first letter of the Data-object is lower case.
	 * @param d Represents the Data-object.
	 * @return the name of the Data-object with a lower first letter.
	 */
	static def toNameLower(Data d) {
		d.name.toFirstLower
	}

	/**
	 * Ensures that the first letter of the DataSet-object is lower case.
	 * @return d Represents the DataSet-object.
	 * @return the name of the DataSet with a lower first letter
	 */
	static def toNameLower(DataSet d) {
		d.name.toFirstLower
	}

	/**
	 * Ensures that the first letter is capitalized.
	 * @param d Represents the Data-object.
	 * @return the name of the Data-object with an upper first letter. 
	 */
	static def toNameUpper(Data d) {
		d.name.toFirstUpper
	}

	/**
	 * Ensures that the first letter is capitalized.
	 * @param d Represents the DataSet-object.
	 * @return the name of the DataSet-object with an upper first letter. 
	 */
	static def toNameUpper(DataSet d) {
		d.name.toFirstUpper
	}
	
	/**
	 * Gets the filename for a particular utility-file with file extension.
	 * @param object Current object, which is used to get the SensorInterface-name.
	 * @param fileExtension Corresponds to the desired file extension that is going to be appended.
	 * @return the utility-filename with extension.
	 */
	static def getUtilityFileName(EObject object, String fileExtension) {
		GenerationUtil.getUtilityName(object) + fileExtension
	}
	
	/**
	 * Gets the name for a particular utility-class.
	 * @param object Current object, which is used to concatenate the SensorInterface-name 
	 * 				 and the default utility-class-name.
	 * @return the utility-filename with extension.
	 */
	static def getUtilityName(EObject object) {
		GenerationUtil.getSensorInterfaceName(object) + SensIDLConstants.UTILITY_CLASS_NAME
	}
	
	/**
	 * Gets the specified data type the LinearDataConversionWithInterval-element.
	 * @param data Represents the MeasurementData of interest.
	 * @return the name of the DataConversion data type.
	 */
	static def getDataTypeOfDataConversionAdjustment(MeasurementData data) {
		if (data.adjustments.size <= 0 && !(data.adjustments.get(0) instanceof DataConversion)) {
			return "";
		}
		
		return getDataTypeOfAdjustment(data.adjustments.get(0) as DataConversion)
	}
	
	private static dispatch def getDataTypeOfAdjustment(LinearDataConversion conversion) {
		//TODO has to be implemented
		return ""
	}
	
	private static dispatch def getDataTypeOfAdjustment(LinearDataConversionWithInterval conversion) {
		return conversion.dataType.toString.toLowerCase
	}
}