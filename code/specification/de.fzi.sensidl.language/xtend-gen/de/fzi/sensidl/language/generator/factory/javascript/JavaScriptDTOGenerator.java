package de.fzi.sensidl.language.generator.factory.javascript;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Interval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import java.util.HashMap;
import java.util.List;
import javax.measure.unit.Unit;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * JavaScript code generator for the SensIDL Model.
 * 
 * @author Sven Eckhardt
 * @author Pawel Bielski
 */
@SuppressWarnings("all")
public class JavaScriptDTOGenerator implements IDTOGenerator {
  private static Logger logger = Logger.getLogger(JavaScriptDTOGenerator.class);
  
  private List<DataSet> dataSet;
  
  public JavaScriptDTOGenerator(final List<DataSet> newDataSet) {
    this.dataSet = newDataSet;
  }
  
  /**
   * Generates the .js files
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      JavaScriptDTOGenerator.logger.info("Start with code-generation of a JavaScript data transfer object.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      for (final DataSet d : this.dataSet) {
        {
          String _nameUpper = this.toNameUpper(d);
          String _addFileExtensionTo = this.addFileExtensionTo(_nameUpper);
          String _nameUpper_1 = this.toNameUpper(d);
          CharSequence _generateClass = this.generateClass(_nameUpper_1, d);
          filesToGenerate.put(_addFileExtensionTo, _generateClass);
          String _nameUpper_2 = this.toNameUpper(d);
          String _addFileExtensionTo_1 = this.addFileExtensionTo(_nameUpper_2);
          String _plus = ("File: " + _addFileExtensionTo_1);
          String _plus_1 = (_plus + " was generated in ");
          String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
          JavaScriptDTOGenerator.logger.info(_plus_2);
        }
      }
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  /**
   * generates the Classes
   */
  public CharSequence generateClass(final String name, final DataSet dataset) {
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
              _builder.append("_");
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
                  _builder.append(",");
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
              _builder.append("_");
              String _nameLower = this.toNameLower(nmdata);
              _builder.append(_nameLower, "\t");
              {
                String _value_2 = nmdata.getValue();
                boolean _notEquals_3 = (!Objects.equal(_value_2, null));
                if (_notEquals_3) {
                  _builder.append(" : ");
                  String _value_3 = nmdata.getValue();
                  _builder.append(_value_3, "\t");
                } else {
                  _builder.append(" : 0");
                }
              }
              _builder.append(",");
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
      _builder.append("\t");
      _builder.newLine();
      {
        TreeIterator<EObject> _eAllContents_3 = dataset.eAllContents();
        Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_eAllContents_3);
        Iterable<MeasurementData> _filter_3 = Iterables.<MeasurementData>filter(_iterable_3, MeasurementData.class);
        for(final MeasurementData mdata : _filter_3) {
          _builder.append("\t");
          _builder.append("_");
          String _nameLower_1 = this.toNameLower(mdata);
          _builder.append(_nameLower_1, "\t");
          _builder.append(" : 0, /*");
          String _description_6 = mdata.getDescription();
          _builder.append(_description_6, "\t");
          _builder.append(" Measured in Unit: ");
          Unit<?> _unit = mdata.getUnit();
          _builder.append(_unit, "\t");
          _builder.append(" */ ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        TreeIterator<EObject> _eAllContents_4 = dataset.eAllContents();
        Iterable<EObject> _iterable_4 = IteratorExtensions.<EObject>toIterable(_eAllContents_4);
        Iterable<NonMeasurementData> _filter_4 = Iterables.<NonMeasurementData>filter(_iterable_4, NonMeasurementData.class);
        for(final NonMeasurementData data : _filter_4) {
          _builder.append("\t");
          CharSequence _generateGetter = this.generateGetter(data);
          _builder.append(_generateGetter, "\t");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          CharSequence _generateSetter = this.generateSetter(data);
          _builder.append(_generateSetter, "\t");
          {
            boolean _isConstant_1 = data.isConstant();
            boolean _not = (!_isConstant_1);
            if (_not) {
              {
                boolean _or = false;
                boolean _equals = data.equals(nmdatalast);
                boolean _not_1 = (!_equals);
                if (_not_1) {
                  _or = true;
                } else {
                  boolean _notEquals_5 = (!Objects.equal(mdatalast, null));
                  _or = _notEquals_5;
                }
                if (_or) {
                  _builder.append(",");
                }
              }
            }
          }
          _builder.newLineIfNotEmpty();
        }
      }
      {
        TreeIterator<EObject> _eAllContents_5 = dataset.eAllContents();
        Iterable<EObject> _iterable_5 = IteratorExtensions.<EObject>toIterable(_eAllContents_5);
        Iterable<MeasurementData> _filter_5 = Iterables.<MeasurementData>filter(_iterable_5, MeasurementData.class);
        for(final MeasurementData data_1 : _filter_5) {
          _builder.append("\t");
          CharSequence _generateGetter_1 = this.generateGetter(data_1);
          _builder.append(_generateGetter_1, "\t");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          CharSequence _generateSetter_1 = this.generateSetter(data_1);
          _builder.append(_generateSetter_1, "\t");
          {
            boolean _equals_1 = data_1.equals(mdatalast);
            boolean _not_2 = (!_equals_1);
            if (_not_2) {
              _builder.append(",");
            }
          }
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
  
  /**
   * Generates the Getter Method for the measurement data
   */
  public CharSequence generateGetter(final MeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return the ");
    String _nameLower = this.toNameLower(d);
    _builder.append(_nameLower, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    CharSequence _getterName = this.toGetterName(d);
    _builder.append(_getterName, "");
    _builder.append(" : function(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this._");
    String _nameLower_1 = this.toNameLower(d);
    _builder.append(_nameLower_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  /**
   * Generates the Getter Method for the non measurement data
   */
  public CharSequence generateGetter(final NonMeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return the ");
    String _nameLower = this.toNameLower(d);
    _builder.append(_nameLower, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    CharSequence _getterName = this.toGetterName(d);
    _builder.append(_getterName, "");
    _builder.append(" : function(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this._");
    {
      boolean _isConstant = d.isConstant();
      if (_isConstant) {
        String _name = d.getName();
        String _upperCase = _name.toUpperCase();
        _builder.append(_upperCase, "\t");
      } else {
        String _nameLower_1 = this.toNameLower(d);
        _builder.append(_nameLower_1, "\t");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence toGetterName(final Data d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get");
    String _name = d.getName();
    String _replaceAll = _name.replaceAll("[^a-zA-Z0-9]", "");
    String _firstUpper = StringExtensions.toFirstUpper(_replaceAll);
    _builder.append(_firstUpper, "");
    return _builder;
  }
  
  /**
   * Generates the Setter Method for the non measurement data
   */
  public CharSequence generateSetter(final NonMeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      boolean _isConstant = d.isConstant();
      if (_isConstant) {
        _builder.append("// no setter for constant value");
        _builder.newLine();
      } else {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @param ");
        String _nameLower = this.toNameLower(d);
        _builder.append(_nameLower, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*\t\t\tthe ");
        String _nameLower_1 = this.toNameLower(d);
        _builder.append(_nameLower_1, " ");
        _builder.append(" to set");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        CharSequence _setterName = this.toSetterName(d);
        _builder.append(_setterName, "");
        _builder.append(" : function(");
        String _nameLower_2 = this.toNameLower(d);
        _builder.append(_nameLower_2, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this._");
        String _nameLower_3 = this.toNameLower(d);
        _builder.append(_nameLower_3, "\t");
        _builder.append(" = ");
        String _nameLower_4 = this.toNameLower(d);
        _builder.append(_nameLower_4, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("} ");
        _builder.newLine();
        _builder.append("\t");
      }
    }
    _builder.append("\t");
    return _builder;
  }
  
  /**
   * Generates the Setter Method for the measurement data
   */
  public CharSequence generateSetter(final MeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      EList<DataAdjustment> _adjustments = d.getAdjustments();
      boolean _isEmpty = _adjustments.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        {
          EList<DataAdjustment> _adjustments_1 = d.getAdjustments();
          for(final DataAdjustment dataAdj : _adjustments_1) {
            {
              if ((dataAdj instanceof DataRange)) {
                _builder.append("/**");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* @param ");
                String _nameLower = this.toNameLower(d);
                _builder.append(_nameLower, " ");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("*\t\t\tthe ");
                String _nameLower_1 = this.toNameLower(d);
                _builder.append(_nameLower_1, " ");
                _builder.append(" to set");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                CharSequence _setterName = this.toSetterName(d);
                _builder.append(_setterName, "");
                _builder.append(" : function(");
                String _nameLower_2 = this.toNameLower(d);
                _builder.append(_nameLower_2, "");
                _builder.append("){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if (");
                String _nameLower_3 = this.toNameLower(d);
                _builder.append(_nameLower_3, "\t");
                _builder.append(" >= ");
                Interval _range = ((DataRange)dataAdj).getRange();
                double _lowerBound = _range.getLowerBound();
                _builder.append(_lowerBound, "\t");
                _builder.append(" && ");
                String _nameLower_4 = this.toNameLower(d);
                _builder.append(_nameLower_4, "\t");
                _builder.append(" <= ");
                Interval _range_1 = ((DataRange)dataAdj).getRange();
                double _upperBound = _range_1.getUpperBound();
                _builder.append(_upperBound, "\t");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("this._");
                String _nameLower_5 = this.toNameLower(d);
                _builder.append(_nameLower_5, "\t\t");
                _builder.append(" = ");
                String _nameLower_6 = this.toNameLower(d);
                _builder.append(_nameLower_6, "\t\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("else");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("alert(\"value ");
                String _nameLower_7 = this.toNameLower(d);
                _builder.append(_nameLower_7, "\t\t");
                _builder.append(" is out of defined range\");");
                _builder.newLineIfNotEmpty();
                _builder.append("} ");
                _builder.newLine();
              }
            }
            {
              if ((dataAdj instanceof DataConversion)) {
                {
                  if ((dataAdj instanceof LinearDataConversion)) {
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @param ");
                    String _nameLower_8 = this.toNameLower(d);
                    _builder.append(_nameLower_8, " ");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*\t\t\tthe ");
                    String _nameLower_9 = this.toNameLower(d);
                    _builder.append(_nameLower_9, " ");
                    _builder.append(" to set");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*/");
                    _builder.newLine();
                    CharSequence _setterName_1 = this.toSetterName(d);
                    _builder.append(_setterName_1, "");
                    _builder.append(" : function(");
                    String _nameLower_10 = this.toNameLower(d);
                    _builder.append(_nameLower_10, "");
                    _builder.append("){");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("this._");
                    String _nameLower_11 = this.toNameLower(d);
                    _builder.append(_nameLower_11, "\t");
                    _builder.append(" = ");
                    String _nameLower_12 = this.toNameLower(d);
                    _builder.append(_nameLower_12, "\t");
                    _builder.append(" *  ");
                    double _scalingFactor = ((LinearDataConversion)dataAdj).getScalingFactor();
                    _builder.append(_scalingFactor, "\t");
                    _builder.append(" +  ");
                    double _offset = ((LinearDataConversion)dataAdj).getOffset();
                    _builder.append(_offset, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}  ");
                    _builder.newLine();
                  } else {
                    {
                      if ((dataAdj instanceof LinearDataConversionWithInterval)) {
                        _builder.append("/**");
                        _builder.newLine();
                        _builder.append(" ");
                        _builder.append("* @param ");
                        String _nameLower_13 = this.toNameLower(d);
                        _builder.append(_nameLower_13, " ");
                        _builder.append("  ");
                        _builder.newLineIfNotEmpty();
                        _builder.append(" ");
                        _builder.append("*\t\t\tthe ");
                        String _nameLower_14 = this.toNameLower(d);
                        _builder.append(_nameLower_14, " ");
                        _builder.append(" to set");
                        _builder.newLineIfNotEmpty();
                        _builder.append(" ");
                        _builder.append("*/");
                        _builder.newLine();
                        CharSequence _setterName_2 = this.toSetterName(d);
                        _builder.append(_setterName_2, "");
                        _builder.append(" : function(");
                        String _nameLower_15 = this.toNameLower(d);
                        _builder.append(_nameLower_15, "");
                        _builder.append("){");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("if (");
                        String _nameLower_16 = this.toNameLower(d);
                        _builder.append(_nameLower_16, "\t");
                        _builder.append(" >= ");
                        Interval _fromInterval = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _lowerBound_1 = _fromInterval.getLowerBound();
                        _builder.append(_lowerBound_1, "\t");
                        _builder.append(" && ");
                        String _nameLower_17 = this.toNameLower(d);
                        _builder.append(_nameLower_17, "\t");
                        _builder.append(" <= ");
                        Interval _fromInterval_1 = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _upperBound_1 = _fromInterval_1.getUpperBound();
                        _builder.append(_upperBound_1, "\t");
                        _builder.append("){\t\t\t\t\t\t\t\t\t\t\t\t");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("var oldMin =  ");
                        Interval _fromInterval_2 = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _lowerBound_2 = _fromInterval_2.getLowerBound();
                        _builder.append(_lowerBound_2, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("var oldMax =  ");
                        Interval _fromInterval_3 = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _upperBound_2 = _fromInterval_3.getUpperBound();
                        _builder.append(_upperBound_2, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("var newMin =  ");
                        Interval _toInterval = ((LinearDataConversionWithInterval)dataAdj).getToInterval();
                        double _lowerBound_3 = _toInterval.getLowerBound();
                        _builder.append(_lowerBound_3, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("var newMax =  ");
                        Interval _toInterval_1 = ((LinearDataConversionWithInterval)dataAdj).getToInterval();
                        double _upperBound_3 = _toInterval_1.getUpperBound();
                        _builder.append(_upperBound_3, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("this._");
                        String _nameLower_18 = this.toNameLower(d);
                        _builder.append(_nameLower_18, "\t\t");
                        _builder.append(" =  ((((");
                        String _nameLower_19 = this.toNameLower(d);
                        _builder.append(_nameLower_19, "\t\t");
                        _builder.append(" - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("else");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("alert(\"value ");
                        String _nameLower_20 = this.toNameLower(d);
                        _builder.append(_nameLower_20, "\t\t");
                        _builder.append(" is out of defined source Interval\");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("} \t\t");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @param ");
        String _nameLower_21 = this.toNameLower(d);
        _builder.append(_nameLower_21, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*\t\t\tthe ");
        String _nameLower_22 = this.toNameLower(d);
        _builder.append(_nameLower_22, " ");
        _builder.append(" to set");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        CharSequence _setterName_3 = this.toSetterName(d);
        _builder.append(_setterName_3, "");
        _builder.append(" : function(");
        String _nameLower_23 = this.toNameLower(d);
        _builder.append(_nameLower_23, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this._");
        String _nameLower_24 = this.toNameLower(d);
        _builder.append(_nameLower_24, "\t");
        _builder.append(" = ");
        String _nameLower_25 = this.toNameLower(d);
        _builder.append(_nameLower_25, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("} ");
        _builder.newLine();
        _builder.append("\t\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toSetterName(final Data d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("set");
    String _name = d.getName();
    String _replaceAll = _name.replaceAll("[^a-zA-Z0-9]", "");
    String _firstUpper = StringExtensions.toFirstUpper(_replaceAll);
    _builder.append(_firstUpper, "");
    return _builder;
  }
  
  /**
   * @return the name of the data with a lower first letter
   */
  public String toNameLower(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * @return the name of the DataSet with a lower first letter
   */
  public String toNameLower(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * @return the name of the data with an upper first letter
   */
  public String toNameUpper(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  /**
   * @return the name of the DataSet with an upper first letter
   */
  public String toNameUpper(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.JAVASCRIPT_EXTENSION);
  }
  
  @Override
  public String toTypeName(final Data data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
