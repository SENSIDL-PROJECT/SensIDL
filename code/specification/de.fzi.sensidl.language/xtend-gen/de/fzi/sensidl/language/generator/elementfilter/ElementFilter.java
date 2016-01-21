package de.fzi.sensidl.language.generator.elementfilter;

import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public abstract class ElementFilter {
  protected static Resource input;
  
  public static void init(final Resource newInput) {
    ElementFilter.input = newInput;
  }
  
  public abstract <T extends Object> List<T> filterData();
}
