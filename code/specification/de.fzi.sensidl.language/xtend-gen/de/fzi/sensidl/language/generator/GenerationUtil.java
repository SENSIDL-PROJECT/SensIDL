package de.fzi.sensidl.language.generator;

import com.google.common.base.Objects;
import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.Endianness;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * The GenerationUtil-class is used to implement common methods, which are
 * used in different generation-classes.
 */
@SuppressWarnings("all")
public class GenerationUtil {
  /**
   * Given a current element of the sensidl-element-tree, the getSensorInterface-
   * method compares recursively the high-level elements of the tree until it
   * finds the SensorInterface-element.
   * @param currentElement Corresponds to the current element in the sensidl-element-tree.
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
   * @param currentElement Corresponds to the current element in the sensidl-element-tree.
   * @return the high-level SensorInterface-element.
   */
  public static String getSensorInterfaceName(final EObject currentElement) {
    SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(currentElement);
    return _sensorInterface.getName();
  }
  
  /**
   * Ensures that the first letter of the Data-object is lower case.
   * @param d Represents the Data-object.
   * @return the name of the Data-object with a lower first letter.
   */
  public static String toNameLower(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * Ensures that the first letter of the DataSet-object is lower case.
   * @return d Represents the DataSet-object.
   * @return the name of the DataSet with a lower first letter
   */
  public static String toNameLower(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * Ensures that the first letter is capitalized.
   * @param d Represents the Data-object.
   * @return the name of the Data-object with an upper first letter.
   */
  public static String toNameUpper(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  /**
   * Ensures that the first letter is capitalized.
   * @param d Represents the DataSet-object.
   * @return the name of the DataSet-object with an upper first letter.
   */
  public static String toNameUpper(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  /**
   * Gets the filename for a particular utility-file with file extension.
   * @param object Current object, which is used to get the SensorInterface-name.
   * @param fileExtension Corresponds to the desired file extension that is going to be appended.
   * @return the utility-filename with extension.
   */
  public static String getUtilityFileName(final EObject object, final String fileExtension) {
    String _utilityName = GenerationUtil.getUtilityName(object);
    return (_utilityName + fileExtension);
  }
  
  /**
   * Gets the name for a particular utility-class.
   * @param object Current object, which is used to concatenate the SensorInterface-name
   * 				 and the default utility-class-name.
   * @return the utility-filename with extension.
   */
  public static String getUtilityName(final EObject object) {
    String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(object);
    return (_sensorInterfaceName + SensIDLConstants.UTILITY_CLASS_NAME);
  }
  
  /**
   * Gets the specified data type the LinearDataConversionWithInterval-element.
   * @param data Represents the MeasurementData of interest.
   * @return the name of the DataConversion data type.
   */
  public static DataType getDataTypeOfDataConversionAdjustment(final MeasurementData data) {
    if (((data.getAdjustments().size() <= 0) && (!(data.getAdjustments().get(0) instanceof DataConversion)))) {
      return null;
    }
    EList<DataAdjustment> _adjustments = data.getAdjustments();
    DataAdjustment _get = _adjustments.get(0);
    return GenerationUtil.getDataTypeOfAdjustment(((DataConversion) _get));
  }
  
  private static DataType _getDataTypeOfAdjustment(final LinearDataConversion conversion) {
    return null;
  }
  
  private static DataType _getDataTypeOfAdjustment(final LinearDataConversionWithInterval conversion) {
    return conversion.getDataType();
  }
  
  public static boolean isBigEndian(final SensorInterface sensorInterface) {
    EncodingSettings _encodingSettings = sensorInterface.getEncodingSettings();
    Endianness _endianness = _encodingSettings.getEndianness();
    return Objects.equal(_endianness, Endianness.BIG_ENDIAN);
  }
  
  private static DataType getDataTypeOfAdjustment(final DataConversion conversion) {
    if (conversion instanceof LinearDataConversion) {
      return _getDataTypeOfAdjustment((LinearDataConversion)conversion);
    } else if (conversion instanceof LinearDataConversionWithInterval) {
      return _getDataTypeOfAdjustment((LinearDataConversionWithInterval)conversion);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(conversion).toString());
    }
  }
}
