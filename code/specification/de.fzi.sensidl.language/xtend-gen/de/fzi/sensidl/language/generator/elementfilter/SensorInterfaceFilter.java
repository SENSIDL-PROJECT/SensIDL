package de.fzi.sensidl.language.generator.elementfilter;

import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class SensorInterfaceFilter extends ElementFilter {
  /**
   * Implements the abstract method of the base-class and filters the SensorInterface-elements.
   * @see ElementFilter#filterData()
   */
  @Override
  public SensorInterface filterData() {
    EList<EObject> _contents = ElementFilter.input.getContents();
    Iterable<SensorInterface> _filter = Iterables.<SensorInterface>filter(_contents, SensorInterface.class);
    return ((SensorInterface[])Conversions.unwrapArray(_filter, SensorInterface.class))[0];
  }
}
