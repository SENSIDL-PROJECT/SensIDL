package de.fzi.sensidl.language.generator.elementfilter;

import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * This class represents the superclass for particular element-filters.
 */
@SuppressWarnings("all")
public abstract class ElementFilter {
  protected static Resource input;
  
  /**
   * This static method is used to initialize the member-variable.
   * @param newInput Corresponds to the new Resource-object.
   */
  public static void init(final Resource newInput) {
    ElementFilter.input = newInput;
  }
  
  /**
   * This abstract method has to be implemented by a subclass which is
   * up to filter a particular collection of sensidl-elements.
   * @return the list of the filtered data.
   */
  public abstract <T extends Object> List<T> filterData();
}
