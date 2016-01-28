package de.fzi.sensidl.language.generator

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import org.eclipse.emf.ecore.EObject

class GenerationUtil {
	
	static def SensorInterface getSensorInterface(EObject currentElement) {
		if (currentElement instanceof SensorInterface) {
			return (currentElement as SensorInterface);
		}
		return getSensorInterface(currentElement.eContainer());
	}
	
	/**
	 * get the sensorInterface Name
	 */
	static def String getSensorInterfaceName(EObject currentElement) {
		return getSensorInterface(currentElement).name
	}
	
	/**
	 * @return the name of the data with a lower first letter
	 */
	static def toNameLower(Data d) {
		d.name.toFirstLower
	}

	/**
	 * @return the name of the DataSet with a lower first letter
	 */
	static def toNameLower(DataSet d) {
		d.name.toFirstLower
	}

	/**
	 * @return the name of the data with an upper first letter 
	 */
	static def toNameUpper(Data d) {
		d.name.toFirstUpper
	}

	/**
	 * @return the name of the DataSet with an upper first letter
	 */
	static def toNameUpper(DataSet d) {
		d.name.toFirstUpper
	}
	
	static def getUtilityFileName(EObject object, String fileExtension) {
		GenerationUtil.getUtilityName(object) + fileExtension
	}
	
	static def getUtilityName(EObject object) {
		GenerationUtil.getSensorInterfaceName(object) + SensIDLConstants.UTILITY_CLASS_NAME
	}
}