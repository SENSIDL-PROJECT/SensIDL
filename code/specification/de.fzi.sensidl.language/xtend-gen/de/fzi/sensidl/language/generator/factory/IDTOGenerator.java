package de.fzi.sensidl.language.generator.factory;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import java.util.HashMap;

/**
 * Interface which can be implemented for a language specific
 * data transfer object.
 */
@SuppressWarnings("all")
public interface IDTOGenerator {
  /**
   * Main generation method for the DTO class.
   * @return a HashMap which maps the filename to generation-code
   * 		  represented as CharSequence.
   */
  public abstract HashMap<String, CharSequence> generate();
  
  /**
   * Adds the corresponding extension to the generated file.
   * @param ClassName The name of the file (equivalent to class name)
   * @return the filename with extension
   */
  public abstract String addFileExtensionTo(final String ClassName);
  
  /**
   * Returns the name of the datatype in the generated language.
   * @param data Represents the Data-element.
   * @return the corresponding data type.
   */
  public abstract String toTypeName(final Data data);
}
