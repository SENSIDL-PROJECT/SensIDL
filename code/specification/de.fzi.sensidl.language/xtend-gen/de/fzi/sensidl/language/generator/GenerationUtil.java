package de.fzi.sensidl.language.generator;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * The GenerationUtil-class is used to implement common methods, which are used in different
 * generation-classes.
 */
@SuppressWarnings("all")
public class GenerationUtil {
  /**
   * Given a current element of the sensidl-element-tree, the getSensorInterface-method compares
   * recursively the high-level elements of the tree until it finds the SensorInterface-element.
   * @param currentElement - corresponds to the current element in the sensidl-element-tree.
   * @return the high-level SensorInterface-element.
   */
  public static SensorInterface getSensorInterface(final EObject currentElement) {
    if ((currentElement instanceof SensorInterface)) {
      return ((SensorInterface) currentElement);
    }
    EObject _eContainer = currentElement.eContainer();
    return GenerationUtil.getSensorInterface(_eContainer);
  }
  
  /**
   * Returns the name instead of the SensorInterface-object.
   * @param currentElement - corresponds to the current element in the sensidl-element-tree.
   * @return the name of the high-level SensorInterface-element.
   */
  public static String getSensorInterfaceName(final EObject currentElement) {
    SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(currentElement);
    return _sensorInterface.getName();
  }
  
  /**
   * Ensures that the first letter of the Data-object is lower case.
   * @param d - represents the Data-object.
   * @return the name of the data with a lower first letter.
   */
  public static String toNameLower(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * Ensures that the first letter of the DataSet-object is lower case.
   * @param d - represents the DataSet-object.
   * @return the name of the DataSet with a lower first letter.
   */
  public static String toNameLower(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * Ensures that the first letter is capitalized.
   * @param d - represents the Data-object.
   * @return the name of the Data-object with an upper first letter .
   */
  public static String toNameUpper(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  /**
   * Ensures that the first letter is capitalized.
   * @param d - represents the DataSet-object.
   * @return the name of the DataSet-object with an upper first letter .
   */
  public static String toNameUpper(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  /**
   * Gets the filename for a particular utility-file with file extension.
   * @param object - current object, which is used to get the SensorInterface-name.
   * @param fileExtension - corresponds to the desired file extension that is going to be appended.
   * @return the utility-filename with extension.
   */
  public static String getUtilityFileName(final EObject object, final String fileExtension) {
    String _utilityName = GenerationUtil.getUtilityName(object);
    return (_utilityName + fileExtension);
  }
  
  /**
   * Gets the name for a particular utility-class.
   * @param object - current object, which is used to concatenate the SensorInterface-name
   * 				   and the default utility-class-name.
   * @return the utility-filename with extension.
   */
  public static String getUtilityName(final EObject object) {
    String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(object);
    return (_sensorInterfaceName + SensIDLConstants.UTILITY_CLASS_NAME);
  }
}
