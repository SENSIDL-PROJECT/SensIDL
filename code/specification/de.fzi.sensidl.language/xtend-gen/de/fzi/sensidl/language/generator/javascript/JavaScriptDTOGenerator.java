package de.fzi.sensidl.language.generator.javascript;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.language.generator.IDTOGenerator;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import javax.measure.unit.Unit;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * JavaScript code generator for the SensIDL Model.
 * 
 * @author Sven Eckhardt
 */
@SuppressWarnings("all")
public class JavaScriptDTOGenerator implements IDTOGenerator {
  private static Logger logger = Logger.getLogger(JavaScriptDTOGenerator.class);
  
  private final static String JAVASCRIPT_EXTENSION = ".js";
  
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public JavaScriptDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  /**
   * Generates the .js files
   */
  @Override
  public void generate() {
    JavaScriptDTOGenerator.logger.info("Start with code-generation of a JavaScript data transfer object.");
    EList<EObject> _contents = this.input.getContents();
    Iterable<SensorInterface> _filter = Iterables.<SensorInterface>filter(_contents, SensorInterface.class);
    final SensorInterface sensorInterface = IterableExtensions.<SensorInterface>head(_filter);
    String _name = sensorInterface.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _concat = _firstUpper.concat("v1");
    String _addFileExtensionTo = this.addFileExtensionTo(_concat);
    CharSequence _compile = this.compile(sensorInterface);
    this.fsa.generateFile(_addFileExtensionTo, _compile);
    String _name_1 = sensorInterface.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    String _concat_1 = _firstUpper_1.concat("v1");
    String _addFileExtensionTo_1 = this.addFileExtensionTo(_concat_1);
    String _plus = ("File: " + _addFileExtensionTo_1);
    String _plus_1 = (_plus + " was generated in ");
    String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
    JavaScriptDTOGenerator.logger.info(_plus_2);
  }
  
  /**
   * generates the JavaScript code
   */
  public CharSequence compile(final SensorInterface sensorInterface) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TreeIterator<EObject> _eAllContents = sensorInterface.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
      Iterable<DataSet> _filter = Iterables.<DataSet>filter(_iterable, DataSet.class);
      for(final DataSet dataset : _filter) {
        String _name = dataset.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        CharSequence _generateVariable = this.generateVariable(_firstLower, dataset);
        _builder.append(_generateVariable, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * generates the variable for a dataset object
   */
  public CharSequence generateVariable(final String name, final DataSet dataset) {
    CharSequence _xblockexpression = null;
    {
      TreeIterator<EObject> _eAllContents = dataset.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
      Iterable<NonMeasurementData> _filter = Iterables.<NonMeasurementData>filter(_iterable, NonMeasurementData.class);
      final NonMeasurementData nmdatalast = IterableExtensions.<NonMeasurementData>last(_filter);
      TreeIterator<EObject> _eAllContents_1 = dataset.eAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
      Iterable<MeasurementData> _filter_1 = Iterables.<MeasurementData>filter(_iterable_1, MeasurementData.class);
      final MeasurementData mdatalast = IterableExtensions.<MeasurementData>last(_filter_1);
      StringConcatenation _builder = new StringConcatenation();
      {
        String _description = dataset.getDescription();
        boolean _notEquals = (!Objects.equal(_description, null));
        if (_notEquals) {
          _builder.append("/* ");
          String _description_1 = dataset.getDescription();
          _builder.append(_description_1, "");
          _builder.append(" */");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("var ");
      _builder.append(name, "");
      _builder.append(" = {");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.newLine();
      {
        TreeIterator<EObject> _eAllContents_2 = dataset.eAllContents();
        Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_eAllContents_2);
        Iterable<NonMeasurementData> _filter_2 = Iterables.<NonMeasurementData>filter(_iterable_2, NonMeasurementData.class);
        for(final NonMeasurementData nmdata : _filter_2) {
          {
            boolean _isConstant = nmdata.isConstant();
            if (_isConstant) {
              _builder.append("\t");
              String _name = nmdata.getName();
              String _upperCase = _name.toUpperCase();
              _builder.append(_upperCase, "\t");
              {
                String _value = nmdata.getValue();
                boolean _notEquals_1 = (!Objects.equal(_value, null));
                if (_notEquals_1) {
                  _builder.append(" : ");
                  String _value_1 = nmdata.getValue();
                  _builder.append(_value_1, "\t");
                  {
                    boolean _equals = nmdata.equals(nmdatalast);
                    boolean _not = (!_equals);
                    if (_not) {
                      _builder.append(",");
                    }
                  }
                }
              }
              {
                String _description_2 = nmdata.getDescription();
                boolean _notEquals_2 = (!Objects.equal(_description_2, null));
                if (_notEquals_2) {
                  _builder.append("/*");
                  String _description_3 = nmdata.getDescription();
                  _builder.append(_description_3, "\t");
                  _builder.append(" */");
                }
              }
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _name_1 = nmdata.getName();
              String _firstLower = StringExtensions.toFirstLower(_name_1);
              _builder.append(_firstLower, "\t");
              {
                String _value_2 = nmdata.getValue();
                boolean _notEquals_3 = (!Objects.equal(_value_2, null));
                if (_notEquals_3) {
                  _builder.append(" : ");
                  String _value_3 = nmdata.getValue();
                  _builder.append(_value_3, "\t");
                  {
                    boolean _equals_1 = nmdata.equals(nmdatalast);
                    boolean _not_1 = (!_equals_1);
                    if (_not_1) {
                      _builder.append(",");
                    }
                  }
                }
              }
              {
                String _description_4 = nmdata.getDescription();
                boolean _notEquals_4 = (!Objects.equal(_description_4, null));
                if (_notEquals_4) {
                  _builder.append("/*");
                  String _description_5 = nmdata.getDescription();
                  _builder.append(_description_5, "\t");
                  _builder.append(" */");
                }
              }
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        TreeIterator<EObject> _eAllContents_3 = dataset.eAllContents();
        Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_eAllContents_3);
        Iterable<MeasurementData> _filter_3 = Iterables.<MeasurementData>filter(_iterable_3, MeasurementData.class);
        for(final MeasurementData mdata : _filter_3) {
          _builder.append("\t");
          String _name_2 = mdata.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
          _builder.append(_firstLower_1, "\t");
          {
            boolean _equals_2 = mdata.equals(mdatalast);
            boolean _not_2 = (!_equals_2);
            if (_not_2) {
              _builder.append(",");
            }
          }
          _builder.append(" /*");
          String _description_6 = mdata.getDescription();
          _builder.append(_description_6, "\t");
          _builder.append(" Measured in Unit: ");
          Unit<?> _unit = mdata.getUnit();
          _builder.append(_unit, "\t");
          _builder.append(" */ ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append(" ");
      _builder.newLine();
      _builder.append("};");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + JavaScriptDTOGenerator.JAVASCRIPT_EXTENSION);
  }
  
  @Override
  public String toTypeName(final Data data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
