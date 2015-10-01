package de.fzi.sensidl.language.generator;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;

/**
 * Interface which can be implemented for a language specific
 * data transfer object.
 */
@SuppressWarnings("all")
public interface IDTOGenerator {
  /**
   * Main generation method for the DTO class.
   * @param fsa file system access for file generation
   */
  public abstract void generate();
  
  /**
   * Adds the corresponding extension to the generated file.
   * @param ClassName - name of the file (equivalent to class name)
   * @return the filename with extension
   */
  public abstract String addFileExtensionTo(final String ClassName);
  
  /**
   * Returns the name of the datatype in the generated language.
   * @param sensidlType - datatype
   * @return the datatype
   */
  public abstract String toTypeName(final Data data);
}
