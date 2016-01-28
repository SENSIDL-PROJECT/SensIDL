package de.fzi.sensidl.language.generator;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerationUtil {
  public static SensorInterface getSensorInterface(final EObject currentElement) {
    if ((currentElement instanceof SensorInterface)) {
      return ((SensorInterface) currentElement);
    }
    EObject _eContainer = currentElement.eContainer();
    return GenerationUtil.getSensorInterface(_eContainer);
  }
  
  /**
   * get the sensorInterface Name
   */
  public static String getSensorInterfaceName(final EObject currentElement) {
    SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(currentElement);
    return _sensorInterface.getName();
  }
  
  /**
   * @return the name of the data with a lower first letter
   */
  public static String toNameLower(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * @return the name of the DataSet with a lower first letter
   */
  public static String toNameLower(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * @return the name of the data with an upper first letter
   */
  public static String toNameUpper(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  /**
   * @return the name of the DataSet with an upper first letter
   */
  public static String toNameUpper(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public static String getUtilityFileName(final EObject object, final String fileExtension) {
    String _utilityName = GenerationUtil.getUtilityName(object);
    return (_utilityName + fileExtension);
  }
  
  public static String getUtilityName(final EObject object) {
    String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(object);
    return (_sensorInterfaceName + SensIDLConstants.UTILITY_CLASS_NAME);
  }
}
