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
   */
  public abstract HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet);
  
  /**
   * Defines the method which calls the implementation
   * for a language specific encoder object.
   */
  public abstract HashMap<String, CharSequence> generateEncoder();
  
  /**
   * Defines the method which calls the implementation
   * for a language specific decoder object.
   */
  public abstract HashMap<String, CharSequence> generateDecoder();
  
  /**
   * Defines the method which calls the implementation
   * for a language specific utility class.
   */
  public abstract HashMap<String, CharSequence> generateUtilityClass(final List<MeasurementData> data);
}
