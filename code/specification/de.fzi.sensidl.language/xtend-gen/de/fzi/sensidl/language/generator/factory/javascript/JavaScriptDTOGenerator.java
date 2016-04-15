package de.fzi.sensidl.language.generator.factory.javascript;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Interval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.measure.unit.Unit;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * JavaScript code generator for the SensIDL Model.
 * 
 * @author Sven Eckhardt
 * @author Pawel Bielski
 * @author Max Peters
 */
@SuppressWarnings("all")
public class JavaScriptDTOGenerator implements IDTOGenerator {
  private static Logger logger = Logger.getLogger(JavaScriptDTOGenerator.class);
  
  private List<DataSet> dataSet;
  
  /**
   * The constructor calls the constructor of the superclass to set a list of DataSet-elements.
   * @param newDataSet Represents the list of DataSet-elements.
   */
  public JavaScriptDTOGenerator(final List<DataSet> newDataSet) {
    this.dataSet = newDataSet;
  }
  
  /**
   * @see IDTOGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      JavaScriptDTOGenerator.logger.info("Start with code-generation of a JavaScript data transfer object.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      for (final DataSet d : this.dataSet) {
        {
          String _nameUpper = GenerationUtil.toNameUpper(d);
          String _addFileExtensionTo = this.addFileExtensionTo(_nameUpper);
          String _nameUpper_1 = GenerationUtil.toNameUpper(d);
          CharSequence _generateClass = this.generateClass(_nameUpper_1, d);
          filesToGenerate.put(_addFileExtensionTo, _generateClass);
          String _nameUpper_2 = GenerationUtil.toNameUpper(d);
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
    _builder.append("\t");
    String _generateBodyIncludeParentDataSet = this.generateBodyIncludeParentDataSet(dataset);
    _builder.append(_generateBodyIncludeParentDataSet, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the body with the data of this data set including used data sets.
   */
  public String generateBodyIncludeParentDataSet(final DataSet d) {
    DataSet dataSet = d;
    StringConcatenation _builder = new StringConcatenation();
    String bodyString = _builder.toString();
    ArrayList<MeasurementData> measurementDataList = new ArrayList<MeasurementData>();
    ArrayList<NonMeasurementData> nonMeasurementDataList = new ArrayList<NonMeasurementData>();
    EList<EObject> _eContents = dataSet.eContents();
    Iterable<MeasurementData> _filter = Iterables.<MeasurementData>filter(_eContents, MeasurementData.class);
    Iterables.<MeasurementData>addAll(measurementDataList, _filter);
    EList<EObject> _eContents_1 = dataSet.eContents();
    Iterable<NonMeasurementData> _filter_1 = Iterables.<NonMeasurementData>filter(_eContents_1, NonMeasurementData.class);
    Iterables.<NonMeasurementData>addAll(nonMeasurementDataList, _filter_1);
    EList<DataSet> _parentDataSet = dataSet.getParentDataSet();
    for (final DataSet pdataSet : _parentDataSet) {
      {
        EList<EObject> _eContents_2 = pdataSet.eContents();
        Iterable<MeasurementData> _filter_2 = Iterables.<MeasurementData>filter(_eContents_2, MeasurementData.class);
        Iterables.<MeasurementData>addAll(measurementDataList, _filter_2);
        EList<EObject> _eContents_3 = pdataSet.eContents();
        Iterable<NonMeasurementData> _filter_3 = Iterables.<NonMeasurementData>filter(_eContents_3, NonMeasurementData.class);
        Iterables.<NonMeasurementData>addAll(nonMeasurementDataList, _filter_3);
      }
    }
    final MeasurementData mdatalast = IterableExtensions.<MeasurementData>last(measurementDataList);
    final NonMeasurementData nmdatalast = IterableExtensions.<NonMeasurementData>last(nonMeasurementDataList);
    for (final NonMeasurementData nmdata : nonMeasurementDataList) {
      String _bodyString = bodyString;
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        boolean _isConstant = nmdata.isConstant();
        if (_isConstant) {
          _builder_1.append("_");
          String _name = nmdata.getName();
          String _upperCase = _name.toUpperCase();
          _builder_1.append(_upperCase, "");
          {
            String _value = nmdata.getValue();
            boolean _notEquals = (!Objects.equal(_value, null));
            if (_notEquals) {
              _builder_1.append(" : ");
              {
                DataType _dataType = nmdata.getDataType();
                boolean _equals = Objects.equal(_dataType, DataType.STRING);
                if (_equals) {
                  _builder_1.append("\"");
                  String _value_1 = nmdata.getValue();
                  _builder_1.append(_value_1, "");
                  _builder_1.append("\"");
                } else {
                  String _value_2 = nmdata.getValue();
                  _builder_1.append(_value_2, "");
                }
              }
            }
          }
          _builder_1.append(",");
          {
            String _description = nmdata.getDescription();
            boolean _notEquals_1 = (!Objects.equal(_description, null));
            if (_notEquals_1) {
              _builder_1.append("/*");
              String _description_1 = nmdata.getDescription();
              _builder_1.append(_description_1, "");
              _builder_1.append(" */");
            }
          }
          _builder_1.newLineIfNotEmpty();
        } else {
          _builder_1.append("_");
          String _nameLower = GenerationUtil.toNameLower(nmdata);
          _builder_1.append(_nameLower, "");
          _builder_1.append(" : ");
          {
            String _value_3 = nmdata.getValue();
            boolean _notEquals_2 = (!Objects.equal(_value_3, null));
            if (_notEquals_2) {
              {
                DataType _dataType_1 = nmdata.getDataType();
                boolean _equals_1 = Objects.equal(_dataType_1, DataType.STRING);
                if (_equals_1) {
                  _builder_1.append("\"");
                  String _value_4 = nmdata.getValue();
                  _builder_1.append(_value_4, "");
                  _builder_1.append("\"");
                } else {
                  String _value_5 = nmdata.getValue();
                  _builder_1.append(_value_5, "");
                }
              }
            } else {
              {
                DataType _dataType_2 = nmdata.getDataType();
                boolean _equals_2 = Objects.equal(_dataType_2, DataType.STRING);
                if (_equals_2) {
                  _builder_1.append("\"\"");
                } else {
                  _builder_1.append("0");
                }
              }
            }
          }
          _builder_1.append(",");
          {
            String _description_2 = nmdata.getDescription();
            boolean _notEquals_3 = (!Objects.equal(_description_2, null));
            if (_notEquals_3) {
              _builder_1.append("/*");
              String _description_3 = nmdata.getDescription();
              _builder_1.append(_description_3, "");
              _builder_1.append(" */");
            }
          }
          _builder_1.newLineIfNotEmpty();
        }
      }
      bodyString = (_bodyString + _builder_1);
    }
    String _bodyString_1 = bodyString;
    String _property = System.getProperty("line.separator");
    bodyString = (_bodyString_1 + _property);
    for (final MeasurementData mdata : measurementDataList) {
      String _bodyString_2 = bodyString;
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("_");
      String _nameLower_1 = GenerationUtil.toNameLower(mdata);
      _builder_2.append(_nameLower_1, "");
      _builder_2.append(" : ");
      {
        DataType _dataType_3 = mdata.getDataType();
        boolean _equals_3 = Objects.equal(_dataType_3, DataType.STRING);
        if (_equals_3) {
          _builder_2.append("\"\"");
        } else {
          _builder_2.append("0");
        }
      }
      _builder_2.append(", /*");
      String _description_4 = mdata.getDescription();
      _builder_2.append(_description_4, "");
      _builder_2.append(" Measured in Unit: ");
      Unit<?> _unit = mdata.getUnit();
      _builder_2.append(_unit, "");
      _builder_2.append(" */ ");
      _builder_2.newLineIfNotEmpty();
      bodyString = (_bodyString_2 + _builder_2);
    }
    String _bodyString_3 = bodyString;
    String _property_1 = System.getProperty("line.separator");
    bodyString = (_bodyString_3 + _property_1);
    for (final NonMeasurementData nmdata_1 : nonMeasurementDataList) {
      String _bodyString_4 = bodyString;
      StringConcatenation _builder_3 = new StringConcatenation();
      CharSequence _generateGetter = this.generateGetter(nmdata_1);
      _builder_3.append(_generateGetter, "");
      _builder_3.append(",");
      _builder_3.newLineIfNotEmpty();
      CharSequence _generateSetter = this.generateSetter(nmdata_1, nmdatalast);
      _builder_3.append(_generateSetter, "");
      _builder_3.newLineIfNotEmpty();
      bodyString = (_bodyString_4 + _builder_3);
    }
    for (final MeasurementData mdata_1 : measurementDataList) {
      String _bodyString_5 = bodyString;
      StringConcatenation _builder_4 = new StringConcatenation();
      CharSequence _generateGetter_1 = this.generateGetter(mdata_1);
      _builder_4.append(_generateGetter_1, "");
      _builder_4.append(",");
      _builder_4.newLineIfNotEmpty();
      CharSequence _generateSetter_1 = this.generateSetter(mdata_1, mdatalast);
      _builder_4.append(_generateSetter_1, "");
      _builder_4.newLineIfNotEmpty();
      bodyString = (_bodyString_5 + _builder_4);
    }
    return bodyString;
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
    String _nameLower = GenerationUtil.toNameLower(d);
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
    String _nameLower_1 = GenerationUtil.toNameLower(d);
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
    String _nameLower = GenerationUtil.toNameLower(d);
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
        String _nameLower_1 = GenerationUtil.toNameLower(d);
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
  public CharSequence generateSetter(final NonMeasurementData d, final NonMeasurementData last) {
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
        String _nameLower = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*\t\t\tthe ");
        String _nameLower_1 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_1, " ");
        _builder.append(" to set");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        CharSequence _setterName = this.toSetterName(d);
        _builder.append(_setterName, "");
        _builder.append(" : function(");
        String _nameLower_2 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_2, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this._");
        String _nameLower_3 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_3, "\t");
        _builder.append(" = ");
        String _nameLower_4 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_4, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        {
          boolean _isConstant_1 = d.isConstant();
          boolean _not = (!_isConstant_1);
          if (_not) {
            {
              boolean _or = false;
              boolean _equals = d.equals(last);
              boolean _not_1 = (!_equals);
              if (_not_1) {
                _or = true;
              } else {
                boolean _notEquals = (!Objects.equal(last, null));
                _or = _notEquals;
              }
              if (_or) {
                _builder.append(",");
              }
            }
          }
        }
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    _builder.append("\t");
    return _builder;
  }
  
  /**
   * Generates the Setter Method for the measurement data
   */
  public CharSequence generateSetter(final MeasurementData d, final MeasurementData last) {
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
                String _nameLower = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower, " ");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("*\t\t\tthe ");
                String _nameLower_1 = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower_1, " ");
                _builder.append(" to set");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                CharSequence _setterName = this.toSetterName(d);
                _builder.append(_setterName, "");
                _builder.append(" : function(");
                String _nameLower_2 = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower_2, "");
                _builder.append("){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if (");
                String _nameLower_3 = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower_3, "\t");
                _builder.append(" >= ");
                Interval _range = ((DataRange)dataAdj).getRange();
                double _lowerBound = _range.getLowerBound();
                _builder.append(_lowerBound, "\t");
                _builder.append(" && ");
                String _nameLower_4 = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower_4, "\t");
                _builder.append(" <= ");
                Interval _range_1 = ((DataRange)dataAdj).getRange();
                double _upperBound = _range_1.getUpperBound();
                _builder.append(_upperBound, "\t");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("this._");
                String _nameLower_5 = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower_5, "\t\t");
                _builder.append(" = ");
                String _nameLower_6 = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower_6, "\t\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("else");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("alert(\"value ");
                String _nameLower_7 = GenerationUtil.toNameLower(d);
                _builder.append(_nameLower_7, "\t\t");
                _builder.append(" is out of defined range\");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                {
                  boolean _equals_1 = d.equals(last);
                  boolean _not = (!_equals_1);
                  if (_not) {
                    _builder.append(",");
                  }
                }
                _builder.append("  ");
                _builder.newLineIfNotEmpty();
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
                    String _nameLower_8 = GenerationUtil.toNameLower(d);
                    _builder.append(_nameLower_8, " ");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*\t\t\tthe ");
                    String _nameLower_9 = GenerationUtil.toNameLower(d);
                    _builder.append(_nameLower_9, " ");
                    _builder.append(" to set");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*/");
                    _builder.newLine();
                    CharSequence _setterName_1 = this.toSetterName(d);
                    _builder.append(_setterName_1, "");
                    _builder.append(" : function(");
                    String _nameLower_10 = GenerationUtil.toNameLower(d);
                    _builder.append(_nameLower_10, "");
                    _builder.append("){");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("this._");
                    String _nameLower_11 = GenerationUtil.toNameLower(d);
                    _builder.append(_nameLower_11, "\t");
                    _builder.append(" = ");
                    String _nameLower_12 = GenerationUtil.toNameLower(d);
                    _builder.append(_nameLower_12, "\t");
                    _builder.append(" *  ");
                    double _scalingFactor = ((LinearDataConversion)dataAdj).getScalingFactor();
                    _builder.append(_scalingFactor, "\t");
                    _builder.append(" +  ");
                    double _offset = ((LinearDataConversion)dataAdj).getOffset();
                    _builder.append(_offset, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    {
                      boolean _equals_2 = d.equals(last);
                      boolean _not_1 = (!_equals_2);
                      if (_not_1) {
                        _builder.append(",");
                      }
                    }
                    _builder.append("   ");
                    _builder.newLineIfNotEmpty();
                  } else {
                    {
                      if ((dataAdj instanceof LinearDataConversionWithInterval)) {
                        _builder.append("/**");
                        _builder.newLine();
                        _builder.append(" ");
                        _builder.append("* @param ");
                        String _nameLower_13 = GenerationUtil.toNameLower(d);
                        _builder.append(_nameLower_13, " ");
                        _builder.append("  ");
                        _builder.newLineIfNotEmpty();
                        _builder.append(" ");
                        _builder.append("*\t\t\tthe ");
                        String _nameLower_14 = GenerationUtil.toNameLower(d);
                        _builder.append(_nameLower_14, " ");
                        _builder.append(" to set");
                        _builder.newLineIfNotEmpty();
                        _builder.append(" ");
                        _builder.append("*/");
                        _builder.newLine();
                        CharSequence _setterName_2 = this.toSetterName(d);
                        _builder.append(_setterName_2, "");
                        _builder.append(" : function(");
                        String _nameLower_15 = GenerationUtil.toNameLower(d);
                        _builder.append(_nameLower_15, "");
                        _builder.append("){");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("if (");
                        String _nameLower_16 = GenerationUtil.toNameLower(d);
                        _builder.append(_nameLower_16, "\t");
                        _builder.append(" >= ");
                        Interval _fromInterval = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _lowerBound_1 = _fromInterval.getLowerBound();
                        _builder.append(_lowerBound_1, "\t");
                        _builder.append(" && ");
                        String _nameLower_17 = GenerationUtil.toNameLower(d);
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
                        String _nameLower_18 = GenerationUtil.toNameLower(d);
                        _builder.append(_nameLower_18, "\t\t");
                        _builder.append(" =  ((((");
                        String _nameLower_19 = GenerationUtil.toNameLower(d);
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
                        String _nameLower_20 = GenerationUtil.toNameLower(d);
                        _builder.append(_nameLower_20, "\t\t");
                        _builder.append(" is out of defined source Interval\");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        {
                          boolean _equals_3 = d.equals(last);
                          boolean _not_2 = (!_equals_3);
                          if (_not_2) {
                            _builder.append(",");
                          }
                        }
                        _builder.append("  \t\t");
                        _builder.newLineIfNotEmpty();
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
        String _nameLower_21 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_21, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*\t\t\tthe ");
        String _nameLower_22 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_22, " ");
        _builder.append(" to set");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        CharSequence _setterName_3 = this.toSetterName(d);
        _builder.append(_setterName_3, "");
        _builder.append(" : function(");
        String _nameLower_23 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_23, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this._");
        String _nameLower_24 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_24, "\t");
        _builder.append(" = ");
        String _nameLower_25 = GenerationUtil.toNameLower(d);
        _builder.append(_nameLower_25, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        {
          boolean _equals_4 = d.equals(last);
          boolean _not_3 = (!_equals_4);
          if (_not_3) {
            _builder.append(",");
          }
        }
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
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
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.JAVASCRIPT_EXTENSION);
  }
  
  @Override
  public String toTypeName(final Data data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
