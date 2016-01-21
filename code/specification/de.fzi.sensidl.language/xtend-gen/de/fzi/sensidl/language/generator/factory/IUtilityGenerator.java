package de.fzi.sensidl.language.generator.factory;

import java.util.HashMap;

/**
 * Interface which can be implemented for a language specific
 * utility class.
 */
@SuppressWarnings("all")
public interface IUtilityGenerator {
  /**
   * Main generation method for the utility class.
   */
  public abstract HashMap<String, CharSequence> generate();
  
  /**
   * Adds the corresponding extension to the generated file.
   * @param ClassName - name of the file (equivalent to class name)
   * @return the filename with extension
   */
  public abstract String addFileExtensionTo(final String ClassName);
}
