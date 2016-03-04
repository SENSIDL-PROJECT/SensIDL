package de.fzi.sensidl.language.generator.factory.c;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
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
import de.fzi.sensidl.language.generator.factory.c.CDTOGenerator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for
 * the generation of the c-files.
 */
@SuppressWarnings("all")
public class CDTOFileGenerator extends CDTOGenerator {
  private static Logger logger = Logger.getLogger(CDTOFileGenerator.class);
  
  /**
   * The constructor calls the constructor of the superclass to set a list of DataSet-elements.
   * @param newDataSet Represents the list of DataSet-elements.
   */
  public CDTOFileGenerator(final List<DataSet> newDataSet) {
    super(newDataSet);
  }
  
  /**
   * Generates the .c and .h files for each data transfer object.
   * @see IDTOGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      CDTOFileGenerator.logger.info("Start with code-generation of a c data transfer object.");
      for (final DataSet dataset : this.dataSets) {
        {
          String _nameUpper = GenerationUtil.toNameUpper(dataset);
          final String fileName = this.addFileExtensionTo(_nameUpper);
          CharSequence _generateStructDeclaration = this.generateStructDeclaration(dataset);
          filesToGenerate.put(fileName, _generateStructDeclaration);
        }
      }
      String _addFileExtensionTo = this.addFileExtensionTo(SensIDLConstants.MARSHAL_FILE);
      String _string = _addFileExtensionTo.toString();
      String _plus = ("File: " + _string);
      String _plus_1 = (_plus + " was generated in ");
      String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      CDTOFileGenerator.logger.info(_plus_2);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  /**
   * Generates a struct-declaration.
   * @param dataset Represents the model element for the struct.
   */
  public CharSequence generateStructDeclaration(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**\\brief\t\t");
    _builder.newLine();
    CharSequence _generateDescription = this.generateDescription(dataset);
    _builder.append(_generateDescription, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include \"");
    String _nameUpper = GenerationUtil.toNameUpper(dataset);
    String _plus = (_nameUpper + SensIDLConstants.HEADER_EXTENSION);
    _builder.append(_plus, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _nameUpper_1 = GenerationUtil.toNameUpper(dataset);
    _builder.append(_nameUpper_1, "");
    _builder.append(" ");
    String _nameLower = GenerationUtil.toNameLower(dataset);
    _builder.append(_nameLower, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateInitDatasetDeclaration = this.generateInitDatasetDeclaration(dataset);
    _builder.append(_generateInitDatasetDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateSetterDeclarationIncludeParentDataSet = this.generateSetterDeclarationIncludeParentDataSet(dataset);
    _builder.append(_generateSetterDeclarationIncludeParentDataSet, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public String generateInitDatasetDeclaration(final DataSet d) {
    DataSet dataSet = d;
    StringConcatenation _builder = new StringConcatenation();
    String methodsString = _builder.toString();
    String _methodsString = methodsString;
    CharSequence _generateInitTemplateStart = this.generateInitTemplateStart(dataSet);
    methodsString = (_methodsString + _generateInitTemplateStart);
    while ((dataSet != null)) {
      {
        String _methodsString_1 = methodsString;
        CharSequence _generateInit = this.generateInit(dataSet);
        methodsString = (_methodsString_1 + _generateInit);
        DataSet _parentDataSet = dataSet.getParentDataSet();
        dataSet = _parentDataSet;
      }
    }
    String _methodsString_1 = methodsString;
    CharSequence _generateInitTemplateEnd = this.generateInitTemplateEnd(dataSet);
    methodsString = (_methodsString_1 + _generateInitTemplateEnd);
    return methodsString;
  }
  
  public CharSequence generateInit(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _eContents = dataset.eContents();
      Iterable<NonMeasurementData> _filter = Iterables.<NonMeasurementData>filter(_eContents, NonMeasurementData.class);
      for(final NonMeasurementData data : _filter) {
        {
          String _value = data.getValue();
          boolean _notEquals = (!Objects.equal(_value, null));
          if (_notEquals) {
            _builder.append("p->");
            String _name = data.getName();
            String _replaceAll = _name.replaceAll("[^a-zA-Z0-9]", "");
            _builder.append(_replaceAll, "");
            _builder.append(" = ");
            {
              DataType _dataType = data.getDataType();
              boolean _equals = Objects.equal(_dataType, DataType.STRING);
              if (_equals) {
                _builder.append("\"");
                String _value_1 = data.getValue();
                _builder.append(_value_1, "");
                _builder.append("\"");
              } else {
                String _value_2 = data.getValue();
                _builder.append(_value_2, "");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateInitTemplateStart(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("void init");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("(");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("* p) {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateInitTemplateEnd(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the getter and setter methods prototypes for the data of this data set including used data sets.
   */
  public String generateSetterDeclarationIncludeParentDataSet(final DataSet d) {
    DataSet dataSet = d;
    StringConcatenation _builder = new StringConcatenation();
    String methodsString = _builder.toString();
    DataSet parentDataSet = dataSet;
    while ((dataSet != null)) {
      {
        EList<EObject> _eContents = dataSet.eContents();
        Iterable<NonMeasurementData> _filter = Iterables.<NonMeasurementData>filter(_eContents, NonMeasurementData.class);
        for (final NonMeasurementData data : _filter) {
          {
            String _methodsString = methodsString;
            CharSequence _generateGetterDeclaration = this.generateGetterDeclaration(data, parentDataSet);
            methodsString = (_methodsString + _generateGetterDeclaration);
            String _methodsString_1 = methodsString;
            String _property = System.getProperty("line.separator");
            methodsString = (_methodsString_1 + _property);
            String _methodsString_2 = methodsString;
            CharSequence _generateSetterDeclaration = this.generateSetterDeclaration(data, parentDataSet);
            methodsString = (_methodsString_2 + _generateSetterDeclaration);
            String _methodsString_3 = methodsString;
            String _property_1 = System.getProperty("line.separator");
            methodsString = (_methodsString_3 + _property_1);
          }
        }
        EList<EObject> _eContents_1 = dataSet.eContents();
        Iterable<MeasurementData> _filter_1 = Iterables.<MeasurementData>filter(_eContents_1, MeasurementData.class);
        for (final MeasurementData data_1 : _filter_1) {
          {
            String _methodsString = methodsString;
            CharSequence _generateGetterDeclaration = this.generateGetterDeclaration(data_1, parentDataSet);
            methodsString = (_methodsString + _generateGetterDeclaration);
            String _methodsString_1 = methodsString;
            String _property = System.getProperty("line.separator");
            methodsString = (_methodsString_1 + _property);
            String _methodsString_2 = methodsString;
            CharSequence _generateSetterDeclaration = this.generateSetterDeclaration(data_1, parentDataSet);
            methodsString = (_methodsString_2 + _generateSetterDeclaration);
            String _methodsString_3 = methodsString;
            String _property_1 = System.getProperty("line.separator");
            methodsString = (_methodsString_3 + _property_1);
          }
        }
        DataSet _parentDataSet = dataSet.getParentDataSet();
        dataSet = _parentDataSet;
      }
    }
    return methodsString;
  }
  
  public CharSequence generateGetterDeclaration(final Data d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" get_");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("_");
    String _name_1 = d.getName();
    String _replaceAll = _name_1.replaceAll("[^a-zA-Z0-9]", "");
    _builder.append(_replaceAll, "");
    _builder.append("(");
    String _name_2 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_1, "");
    _builder.append("* p) { return p->");
    String _name_3 = d.getName();
    _builder.append(_name_3, "");
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSetterDeclaration(final MeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DataAdjustment> _adjustments = d.getAdjustments();
      boolean _isEmpty = _adjustments.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        _builder.newLine();
        {
          EList<DataAdjustment> _adjustments_1 = d.getAdjustments();
          for(final DataAdjustment dataAdj : _adjustments_1) {
            {
              if ((dataAdj instanceof DataRange)) {
                _builder.append("void set_");
                String _name = dataset.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name);
                _builder.append(_firstUpper, "");
                _builder.append("_");
                String _name_1 = d.getName();
                String _replaceAll = _name_1.replaceAll("[^a-zA-Z0-9]", "");
                _builder.append(_replaceAll, "");
                _builder.append("(");
                String _name_2 = dataset.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
                _builder.append(_firstUpper_1, "");
                _builder.append("* p, ");
                String _typeName = this.toTypeName(d);
                _builder.append(_typeName, "");
                _builder.append(" ");
                String _name_3 = d.getName();
                String _firstLower = StringExtensions.toFirstLower(_name_3);
                _builder.append(_firstLower, "");
                _builder.append(" ){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if (");
                String _name_4 = d.getName();
                String _firstLower_1 = StringExtensions.toFirstLower(_name_4);
                _builder.append(_firstLower_1, "\t");
                _builder.append(" >= ");
                Interval _range = ((DataRange)dataAdj).getRange();
                double _lowerBound = _range.getLowerBound();
                _builder.append(_lowerBound, "\t");
                _builder.append(" && ");
                String _name_5 = d.getName();
                String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
                _builder.append(_firstLower_2, "\t");
                _builder.append(" <= ");
                Interval _range_1 = ((DataRange)dataAdj).getRange();
                double _upperBound = _range_1.getUpperBound();
                _builder.append(_upperBound, "\t");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t ");
                _builder.append("p->");
                String _name_6 = d.getName();
                String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
                _builder.append(_firstLower_3, "\t\t ");
                _builder.append(" = ");
                String _name_7 = d.getName();
                String _firstLower_4 = StringExtensions.toFirstLower(_name_7);
                _builder.append(_firstLower_4, "\t\t ");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("else{");
                _builder.newLine();
                _builder.append("\t\t\t");
                _builder.append("//Do something");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.newLine();
            {
              if ((dataAdj instanceof DataConversion)) {
                {
                  if ((dataAdj instanceof LinearDataConversion)) {
                    _builder.newLine();
                    _builder.append("void set_");
                    String _name_8 = dataset.getName();
                    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
                    _builder.append(_firstUpper_2, "");
                    _builder.append("_");
                    String _name_9 = d.getName();
                    String _replaceAll_1 = _name_9.replaceAll("[^a-zA-Z0-9]", "");
                    _builder.append(_replaceAll_1, "");
                    _builder.append("(");
                    String _name_10 = dataset.getName();
                    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_10);
                    _builder.append(_firstUpper_3, "");
                    _builder.append("* p, ");
                    String _typeName_1 = this.toTypeName(d);
                    _builder.append(_typeName_1, "");
                    _builder.append(" ");
                    String _name_11 = d.getName();
                    String _firstLower_5 = StringExtensions.toFirstLower(_name_11);
                    _builder.append(_firstLower_5, "");
                    _builder.append(" ){\t\t\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("p->");
                    String _name_12 = d.getName();
                    String _firstLower_6 = StringExtensions.toFirstLower(_name_12);
                    _builder.append(_firstLower_6, "\t");
                    _builder.append(" =  ");
                    String _name_13 = d.getName();
                    String _firstLower_7 = StringExtensions.toFirstLower(_name_13);
                    _builder.append(_firstLower_7, "\t");
                    _builder.append(" *  ");
                    double _scalingFactor = ((LinearDataConversion)dataAdj).getScalingFactor();
                    _builder.append(_scalingFactor, "\t");
                    _builder.append(" +  ");
                    double _offset = ((LinearDataConversion)dataAdj).getOffset();
                    _builder.append(_offset, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("} ");
                    _builder.newLine();
                  } else {
                    {
                      if ((dataAdj instanceof LinearDataConversionWithInterval)) {
                        _builder.append("void set_");
                        String _name_14 = dataset.getName();
                        String _firstUpper_4 = StringExtensions.toFirstUpper(_name_14);
                        _builder.append(_firstUpper_4, "");
                        _builder.append("_");
                        String _name_15 = d.getName();
                        String _replaceAll_2 = _name_15.replaceAll("[^a-zA-Z0-9]", "");
                        _builder.append(_replaceAll_2, "");
                        _builder.append("(");
                        String _name_16 = dataset.getName();
                        String _firstUpper_5 = StringExtensions.toFirstUpper(_name_16);
                        _builder.append(_firstUpper_5, "");
                        _builder.append("* p, ");
                        String _typeName_2 = this.toTypeName(d);
                        _builder.append(_typeName_2, "");
                        _builder.append(" ");
                        String _name_17 = d.getName();
                        String _firstLower_8 = StringExtensions.toFirstLower(_name_17);
                        _builder.append(_firstLower_8, "");
                        _builder.append(" ){\t\t\t\t\t\t");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("if (");
                        String _name_18 = d.getName();
                        String _firstLower_9 = StringExtensions.toFirstLower(_name_18);
                        _builder.append(_firstLower_9, "\t");
                        _builder.append(" >= ");
                        Interval _fromInterval = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _lowerBound_1 = _fromInterval.getLowerBound();
                        _builder.append(_lowerBound_1, "\t");
                        _builder.append(" && ");
                        String _name_19 = d.getName();
                        String _firstLower_10 = StringExtensions.toFirstLower(_name_19);
                        _builder.append(_firstLower_10, "\t");
                        _builder.append(" <= ");
                        Interval _fromInterval_1 = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _upperBound_1 = _fromInterval_1.getUpperBound();
                        _builder.append(_upperBound_1, "\t");
                        _builder.append("){\t\t\t\t\t\t\t\t\t\t\t\t");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.newLine();
                        _builder.append("\t\t");
                        String _typeName_3 = this.toTypeName(d);
                        _builder.append(_typeName_3, "\t\t");
                        _builder.append(" oldMin =  ");
                        Interval _fromInterval_2 = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _lowerBound_2 = _fromInterval_2.getLowerBound();
                        int _intValue = Double.valueOf(_lowerBound_2).intValue();
                        _builder.append(_intValue, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _typeName_4 = this.toTypeName(d);
                        _builder.append(_typeName_4, "\t\t");
                        _builder.append(" oldMax =  ");
                        Interval _fromInterval_3 = ((LinearDataConversionWithInterval)dataAdj).getFromInterval();
                        double _upperBound_2 = _fromInterval_3.getUpperBound();
                        int _intValue_1 = Double.valueOf(_upperBound_2).intValue();
                        _builder.append(_intValue_1, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _typeName_5 = this.toTypeName(d);
                        _builder.append(_typeName_5, "\t\t");
                        _builder.append(" newMin =  ");
                        Interval _toInterval = ((LinearDataConversionWithInterval)dataAdj).getToInterval();
                        double _lowerBound_3 = _toInterval.getLowerBound();
                        int _intValue_2 = Double.valueOf(_lowerBound_3).intValue();
                        _builder.append(_intValue_2, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        String _typeName_6 = this.toTypeName(d);
                        _builder.append(_typeName_6, "\t\t");
                        _builder.append(" newMax =  ");
                        Interval _toInterval_1 = ((LinearDataConversionWithInterval)dataAdj).getToInterval();
                        double _upperBound_3 = _toInterval_1.getUpperBound();
                        int _intValue_3 = Double.valueOf(_upperBound_3).intValue();
                        _builder.append(_intValue_3, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("p->");
                        String _name_20 = d.getName();
                        String _firstLower_11 = StringExtensions.toFirstLower(_name_20);
                        _builder.append(_firstLower_11, "\t\t");
                        _builder.append(" =  ((((");
                        String _name_21 = d.getName();
                        String _firstLower_12 = StringExtensions.toFirstLower(_name_21);
                        _builder.append(_firstLower_12, "\t\t");
                        _builder.append(" - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("else{");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("//Do something");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
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
        _builder.append("void set_");
        String _name_22 = dataset.getName();
        String _firstUpper_6 = StringExtensions.toFirstUpper(_name_22);
        _builder.append(_firstUpper_6, "");
        _builder.append("_");
        String _name_23 = d.getName();
        String _replaceAll_3 = _name_23.replaceAll("[^a-zA-Z0-9]", "");
        _builder.append(_replaceAll_3, "");
        _builder.append("(");
        String _name_24 = dataset.getName();
        String _firstUpper_7 = StringExtensions.toFirstUpper(_name_24);
        _builder.append(_firstUpper_7, "");
        _builder.append("* p, ");
        String _typeName_7 = this.toTypeName(d);
        _builder.append(_typeName_7, "");
        _builder.append(" ");
        String _name_25 = d.getName();
        String _firstLower_13 = StringExtensions.toFirstLower(_name_25);
        _builder.append(_firstLower_13, "");
        _builder.append(" ) { p->");
        String _name_26 = d.getName();
        String _firstLower_14 = StringExtensions.toFirstLower(_name_26);
        _builder.append(_firstLower_14, "");
        _builder.append(" = ");
        String _name_27 = d.getName();
        String _firstLower_15 = StringExtensions.toFirstLower(_name_27);
        _builder.append(_firstLower_15, "");
        _builder.append("; }");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateSetterDeclaration(final NonMeasurementData d, final DataSet dataset) {
    CharSequence _xifexpression = null;
    boolean _isConstant = d.isConstant();
    if (_isConstant) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// no setter for constant value");
      _builder.newLine();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("void set_");
      String _name = dataset.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _builder_1.append(_firstUpper, "");
      _builder_1.append("_");
      String _name_1 = d.getName();
      String _replaceAll = _name_1.replaceAll("[^a-zA-Z0-9]", "");
      _builder_1.append(_replaceAll, "");
      _builder_1.append("(");
      String _name_2 = dataset.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      _builder_1.append(_firstUpper_1, "");
      _builder_1.append("* p, ");
      String _typeName = this.toTypeName(d);
      _builder_1.append(_typeName, "");
      _builder_1.append(" ");
      String _name_3 = d.getName();
      String _firstLower = StringExtensions.toFirstLower(_name_3);
      _builder_1.append(_firstLower, "");
      _builder_1.append(" ) { p->");
      String _name_4 = d.getName();
      String _firstLower_1 = StringExtensions.toFirstLower(_name_4);
      _builder_1.append(_firstLower_1, "");
      _builder_1.append(" = ");
      String _name_5 = d.getName();
      String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
      _builder_1.append(_firstLower_2, "");
      _builder_1.append("; }");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * Generates a description for a dataset.
   * @param dataset
   * 			represents the dataset.
   */
  public CharSequence generateDescription(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* \\param\t\t");
    String _name = dataset.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    {
      String _description = dataset.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = dataset.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Adds the file extension.
   * @see IDTOGenerator#addFileExtensionTo(String)
   */
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.C_EXTENSION);
  }
  
  public CharSequence generateSetterDeclaration(final Data d, final DataSet dataset) {
    if (d instanceof MeasurementData) {
      return _generateSetterDeclaration((MeasurementData)d, dataset);
    } else if (d instanceof NonMeasurementData) {
      return _generateSetterDeclaration((NonMeasurementData)d, dataset);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(d, dataset).toString());
    }
  }
}