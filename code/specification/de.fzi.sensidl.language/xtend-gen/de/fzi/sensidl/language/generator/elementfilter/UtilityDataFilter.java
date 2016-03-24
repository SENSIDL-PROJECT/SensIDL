package de.fzi.sensidl.language.generator.elementfilter;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.language.generator.elementfilter.DataSetFilter;
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Implements the ElementFilter-class.
 */
@SuppressWarnings("all")
public class UtilityDataFilter extends ElementFilter {
  /**
   * Implements the abstract method of the base-class and filters
   * all MeasurementData-elements.
   * @see ElementFilter#filterData()
   */
  @Override
  public List<EObject> filterData() {
    ArrayList<EObject> _xblockexpression = null;
    {
      EList<EObject> _contents = ElementFilter.input.getContents();
      Iterable<SensorInterface> _filter = Iterables.<SensorInterface>filter(_contents, SensorInterface.class);
      SensorInterface _head = IterableExtensions.<SensorInterface>head(_filter);
      TreeIterator<EObject> _eAllContents = _head.eAllContents();
      Iterator<SensorDataDescription> _filter_1 = Iterators.<SensorDataDescription>filter(_eAllContents, SensorDataDescription.class);
      SensorDataDescription _head_1 = IteratorExtensions.<SensorDataDescription>head(_filter_1);
      TreeIterator<EObject> _eAllContents_1 = _head_1.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
      Iterable<MeasurementData> _filter_2 = Iterables.<MeasurementData>filter(_iterable, MeasurementData.class);
      final Function1<MeasurementData, Boolean> _function = new Function1<MeasurementData, Boolean>() {
        @Override
        public Boolean apply(final MeasurementData mData) {
          return Boolean.valueOf(UtilityDataFilter.this.isAdjusted(mData));
        }
      };
      Iterable<MeasurementData> _filter_3 = IterableExtensions.<MeasurementData>filter(_filter_2, _function);
      List<MeasurementData> _list = IterableExtensions.<MeasurementData>toList(_filter_3);
      ArrayList<EObject> data = new ArrayList<EObject>(_list);
      DataSetFilter _dataSetFilter = new DataSetFilter();
      List<DataSet> _filterData = _dataSetFilter.filterData();
      ArrayList<EObject> _arrayList = new ArrayList<EObject>(_filterData);
      data.addAll(_arrayList);
      EList<EObject> _contents_1 = ElementFilter.input.getContents();
      Iterable<SensorInterface> _filter_4 = Iterables.<SensorInterface>filter(_contents_1, SensorInterface.class);
      EObject _get = ((EObject[])Conversions.unwrapArray(_filter_4, EObject.class))[0];
      data.add(_get);
      _xblockexpression = data;
    }
    return _xblockexpression;
  }
  
  private boolean isAdjusted(final MeasurementData data) {
    boolean _and = false;
    EList<DataAdjustment> _adjustments = data.getAdjustments();
    int _size = _adjustments.size();
    boolean _greaterThan = (_size > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      EList<DataAdjustment> _adjustments_1 = data.getAdjustments();
      DataAdjustment _get = _adjustments_1.get(0);
      _and = (_get instanceof DataConversion);
    }
    return _and;
  }
}
