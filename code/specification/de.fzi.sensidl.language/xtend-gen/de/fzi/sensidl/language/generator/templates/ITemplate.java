package de.fzi.sensidl.language.generator.templates;

@SuppressWarnings("all")
public abstract class ITemplate<T extends Object> {
  protected final T element;
  
  /**
   * The constructor.
   * @param newElement - SensIDL-Element which is required by an implementer to generate code.
   */
  public ITemplate(final T newElement) {
    this.element = newElement;
  }
  
  /**
   * The implemented method generates code for the SensIDL-element T.
   * @return The generated code.
   */
  public abstract CharSequence getCode();
  
  /**
   * The implemented method specifies the corresponding filename.
   * @return The corresponding filename.
   */
  public abstract String getFileName();
}
