package de.fzi.sensidl.language.generator.elementfilter;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Implements the ElementFilter-class.
 */
@SuppressWarnings("all")
public class DataSetFilter extends ElementFilter {
  /**
   * Implements the abstract method of the base-class and filters all DataSet-elements.
   * @see ElementFilter#filterData()
   */
  @Override
  public List<DataSet> filterData() {
    EList<EObject> _contents = ElementFilter.input.getContents();
    Iterable<SensorInterface> _filter = Iterables.<SensorInterface>filter(_contents, SensorInterface.class);
    SensorInterface _head = IterableExtensions.<SensorInterface>head(_filter);
    TreeIterator<EObject> _eAllContents = _head.eAllContents();
    Iterator<SensorDataDescription> _filter_1 = Iterators.<SensorDataDescription>filter(_eAllContents, SensorDataDescription.class);
    SensorDataDescription _head_1 = IteratorExtensions.<SensorDataDescription>head(_filter_1);
    TreeIterator<EObject> _eAllContents_1 = _head_1.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
    Iterable<DataSet> _filter_2 = Iterables.<DataSet>filter(_iterable, DataSet.class);
    return IterableExtensions.<DataSet>toList(_filter_2);
  }
}
