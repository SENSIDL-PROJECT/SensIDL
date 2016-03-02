package de.fzi.sensidl.language.generator.factory;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import java.util.HashMap;
import java.util.List;

/**
 * Main interface to create a new generation family
 * for a specific programming language.
 */
@SuppressWarnings("all")
public interface ICodeGenerator {
  /**
   * Defines the method which calls the implementation
   * for a language specific data transfer object.
   * @param dataSet - contains all needed elements for the generation.
   * @return a HashMap which maps the filename to generation-code represented as CharSequence.
   */
  public abstract HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet);
  
  /**
   * Defines the method which calls the implementation
   * for a language specific encoder object.
   * @return a HashMap which maps the filename to generation-code represented as CharSequence.
   */
  public abstract HashMap<String, CharSequence> generateEncoder();
  
  /**
   * Defines the method which calls the implementation
   * for a language specific decoder object.
   * @return a HashMap which maps the filename to generation-code represented as CharSequence.
   */
  public abstract HashMap<String, CharSequence> generateDecoder();
  
  /**
   * Defines the method which calls the implementation
   * for a language specific utility class.
   * @param data - represents a list of Data-elements.
   * @return a HashMap which maps the filename to generation-code represented as CharSequence.
   */
  public abstract HashMap<String, CharSequence> generateUtilityClass(final List<MeasurementData> data);
}
