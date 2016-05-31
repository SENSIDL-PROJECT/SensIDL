package de.fzi.sensidl.language.generator.factory.c;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.Endianness;
import de.fzi.sensidl.design.sensidl.SensorInterface;
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
import de.fzi.sensidl.design.sensidl.dataRepresentation.Method;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MethodParameter;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import de.fzi.sensidl.language.generator.factory.c.CDTOGenerator;
import de.fzi.sensidl.language.generator.factory.c.DataTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for
 * the generation of the c-files.
 */
@SuppressWarnings("all")
public class CDTOFileGenerator extends CDTOGenerator {
  private static Logger logger = Logger.getLogger(CDTOFileGenerator.class);
  
  private boolean bigEndian;
  
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
      DataSet _get = this.dataSets.get(0);
      EList<EObject> _eContents = _get.eContents();
      Iterable<Data> _filter = Iterables.<Data>filter(_eContents, Data.class);
      Data _get_1 = ((Data[])Conversions.unwrapArray(_filter, Data.class))[0];
      EObject _eContainer = _get_1.eContainer();
      SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(_eContainer);
      EncodingSettings _encodingSettings = _sensorInterface.getEncodingSettings();
      Endianness _endianness = _encodingSettings.getEndianness();
      boolean _equals = Objects.equal(_endianness, Endianness.BIG_ENDIAN);
      if (_equals) {
        this.bigEndian = true;
      } else {
        this.bigEndian = false;
      }
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
    CharSequence _generateMethods = this.generateMethods(dataset);
    _builder.append(_generateMethods, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateDataMethodsIncludeUsedDataSets = this.generateDataMethodsIncludeUsedDataSets(dataset);
    _builder.append(_generateDataMethodsIncludeUsedDataSets, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateEndiannessMethodsDeclarations = this.generateEndiannessMethodsDeclarations(dataset);
    _builder.append(_generateEndiannessMethodsDeclarations, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public String generateInitDatasetDeclaration(final DataSet d) {
    ArrayList<DataSet> _arrayList = new ArrayList<DataSet>();
    final Procedure1<ArrayList<DataSet>> _function = new Procedure1<ArrayList<DataSet>>() {
      @Override
      public void apply(final ArrayList<DataSet> it) {
        it.add(d);
        EList<DataSet> _usedDataSets = d.getUsedDataSets();
        it.addAll(_usedDataSets);
      }
    };
    ArrayList<DataSet> dataSets = ObjectExtensions.<ArrayList<DataSet>>operator_doubleArrow(_arrayList, _function);
    StringConcatenation _builder = new StringConcatenation();
    String methodsString = _builder.toString();
    String _methodsString = methodsString;
    CharSequence _generateInitTemplateStart = this.generateInitTemplateStart(d);
    methodsString = (_methodsString + _generateInitTemplateStart);
    for (final DataSet dataSet : dataSets) {
      String _methodsString_1 = methodsString;
      CharSequence _generateInit = this.generateInit(dataSet);
      methodsString = (_methodsString_1 + _generateInit);
    }
    String _methodsString_2 = methodsString;
    CharSequence _generateInitTemplateEnd = this.generateInitTemplateEnd(d);
    methodsString = (_methodsString_2 + _generateInitTemplateEnd);
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
   * Generates Methods
   */
  public CharSequence generateMethods(final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _eContents = d.eContents();
      Iterable<Method> _filter = Iterables.<Method>filter(_eContents, Method.class);
      for(final Method method : _filter) {
        _builder.newLine();
        String _methodReturnType = this.getMethodReturnType(method);
        _builder.append(_methodReturnType, "");
        _builder.append(" ");
        String _name = method.getName();
        _builder.append(_name, "");
        _builder.append("(");
        String _methodParameter = this.getMethodParameter(method);
        _builder.append(_methodParameter, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("//TODO: Auto Generated method stub");
        _builder.newLine();
        {
          String _methodReturnType_1 = this.getMethodReturnType(method);
          boolean _equals = _methodReturnType_1.equals("void");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("\t");
            _builder.append("return 0;");
            _builder.newLine();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  /**
   * Returns the return type of a method
   */
  public String getMethodReturnType(final Method method) {
    DataType _returnType = method.getReturnType();
    boolean _notEquals = (!Objects.equal(_returnType, DataType.UNDEFINED));
    if (_notEquals) {
      DataType _returnType_1 = method.getReturnType();
      return this.toTypeName(_returnType_1);
    } else {
      DataSet _returnTypeDataSet = method.getReturnTypeDataSet();
      boolean _notEquals_1 = (!Objects.equal(_returnTypeDataSet, null));
      if (_notEquals_1) {
        DataSet _returnTypeDataSet_1 = method.getReturnTypeDataSet();
        return _returnTypeDataSet_1.getName();
      } else {
        return "void";
      }
    }
  }
  
  /**
   * Returns the parameter of a method
   */
  public String getMethodParameter(final Method method) {
    String str = "";
    EList<MethodParameter> _parameter = method.getParameter();
    int _size = _parameter.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      EList<MethodParameter> _parameter_1 = method.getParameter();
      MethodParameter _head = IterableExtensions.<MethodParameter>head(_parameter_1);
      DataType _dataType = _head.getDataType();
      boolean _notEquals = (!Objects.equal(_dataType, DataType.UNDEFINED));
      if (_notEquals) {
        EList<MethodParameter> _parameter_2 = method.getParameter();
        MethodParameter _head_1 = IterableExtensions.<MethodParameter>head(_parameter_2);
        DataType _dataType_1 = _head_1.getDataType();
        String _typeName = this.toTypeName(_dataType_1);
        String _plus = (_typeName + " ");
        EList<MethodParameter> _parameter_3 = method.getParameter();
        MethodParameter _head_2 = IterableExtensions.<MethodParameter>head(_parameter_3);
        String _name = _head_2.getName();
        String _plus_1 = (_plus + _name);
        str = _plus_1;
      } else {
        EList<MethodParameter> _parameter_4 = method.getParameter();
        MethodParameter _head_3 = IterableExtensions.<MethodParameter>head(_parameter_4);
        DataSet _dataTypeDataSet = _head_3.getDataTypeDataSet();
        boolean _notEquals_1 = (!Objects.equal(_dataTypeDataSet, null));
        if (_notEquals_1) {
          EList<MethodParameter> _parameter_5 = method.getParameter();
          MethodParameter _head_4 = IterableExtensions.<MethodParameter>head(_parameter_5);
          DataSet _dataTypeDataSet_1 = _head_4.getDataTypeDataSet();
          String _name_1 = _dataTypeDataSet_1.getName();
          String _plus_2 = (_name_1 + " ");
          EList<MethodParameter> _parameter_6 = method.getParameter();
          MethodParameter _head_5 = IterableExtensions.<MethodParameter>head(_parameter_6);
          String _name_2 = _head_5.getName();
          String _plus_3 = (_plus_2 + _name_2);
          str = _plus_3;
        }
      }
      EList<MethodParameter> _parameter_7 = method.getParameter();
      Iterable<MethodParameter> _tail = IterableExtensions.<MethodParameter>tail(_parameter_7);
      for (final MethodParameter p : _tail) {
        DataType _dataType_2 = p.getDataType();
        boolean _notEquals_2 = (!Objects.equal(_dataType_2, DataType.UNDEFINED));
        if (_notEquals_2) {
          String _str = str;
          DataType _dataType_3 = p.getDataType();
          String _typeName_1 = this.toTypeName(_dataType_3);
          String _plus_4 = (", " + _typeName_1);
          String _plus_5 = (_plus_4 + " ");
          String _name_3 = p.getName();
          String _plus_6 = (_plus_5 + _name_3);
          str = (_str + _plus_6);
        } else {
          DataSet _dataTypeDataSet_2 = p.getDataTypeDataSet();
          boolean _notEquals_3 = (!Objects.equal(_dataTypeDataSet_2, null));
          if (_notEquals_3) {
            String _str_1 = str;
            DataSet _dataTypeDataSet_3 = p.getDataTypeDataSet();
            String _name_4 = _dataTypeDataSet_3.getName();
            String _plus_7 = (", " + _name_4);
            String _plus_8 = (_plus_7 + " ");
            String _name_5 = p.getName();
            String _plus_9 = (_plus_8 + _name_5);
            str = (_str_1 + _plus_9);
          }
        }
      }
    }
    return str;
  }
  
  /**
   * Generates the getter and setter methods prototypes for the data of this data set including used data sets.
   */
  public String generateDataMethodsIncludeUsedDataSets(final DataSet d) {
    ArrayList<DataSet> _arrayList = new ArrayList<DataSet>();
    final Procedure1<ArrayList<DataSet>> _function = new Procedure1<ArrayList<DataSet>>() {
      @Override
      public void apply(final ArrayList<DataSet> it) {
        it.add(d);
        EList<DataSet> _usedDataSets = d.getUsedDataSets();
        it.addAll(_usedDataSets);
      }
    };
    ArrayList<DataSet> dataSets = ObjectExtensions.<ArrayList<DataSet>>operator_doubleArrow(_arrayList, _function);
    StringConcatenation _builder = new StringConcatenation();
    String methodsString = _builder.toString();
    DataSet usedDataSets = d;
    for (final DataSet dataSet : dataSets) {
      {
        EList<EObject> _eContents = dataSet.eContents();
        Iterable<NonMeasurementData> _filter = Iterables.<NonMeasurementData>filter(_eContents, NonMeasurementData.class);
        for (final NonMeasurementData data : _filter) {
          {
            EList<String> _excludedMethods = data.getExcludedMethods();
            boolean _contains = _excludedMethods.contains("getter");
            boolean _not = (!_contains);
            if (_not) {
              String _methodsString = methodsString;
              CharSequence _generateGetterDeclaration = this.generateGetterDeclaration(data, usedDataSets);
              methodsString = (_methodsString + _generateGetterDeclaration);
              String _methodsString_1 = methodsString;
              String _property = System.getProperty("line.separator");
              methodsString = (_methodsString_1 + _property);
            }
            EList<String> _excludedMethods_1 = data.getExcludedMethods();
            boolean _contains_1 = _excludedMethods_1.contains("setter");
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              String _methodsString_2 = methodsString;
              CharSequence _generateSetterDeclaration = this.generateSetterDeclaration(data, usedDataSets);
              methodsString = (_methodsString_2 + _generateSetterDeclaration);
              String _methodsString_3 = methodsString;
              String _property_1 = System.getProperty("line.separator");
              methodsString = (_methodsString_3 + _property_1);
            }
          }
        }
        EList<EObject> _eContents_1 = dataSet.eContents();
        Iterable<MeasurementData> _filter_1 = Iterables.<MeasurementData>filter(_eContents_1, MeasurementData.class);
        for (final MeasurementData data_1 : _filter_1) {
          {
            EList<String> _excludedMethods = data_1.getExcludedMethods();
            boolean _contains = _excludedMethods.contains("getter");
            boolean _not = (!_contains);
            if (_not) {
              String _methodsString = methodsString;
              CharSequence _generateGetterDeclaration = this.generateGetterDeclaration(data_1, usedDataSets);
              methodsString = (_methodsString + _generateGetterDeclaration);
              String _methodsString_1 = methodsString;
              String _property = System.getProperty("line.separator");
              methodsString = (_methodsString_1 + _property);
            }
            EList<String> _excludedMethods_1 = data_1.getExcludedMethods();
            boolean _contains_1 = _excludedMethods_1.contains("setter");
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              String _methodsString_2 = methodsString;
              CharSequence _generateSetterDeclaration = this.generateSetterDeclaration(data_1, usedDataSets);
              methodsString = (_methodsString_2 + _generateSetterDeclaration);
              String _methodsString_3 = methodsString;
              String _property_1 = System.getProperty("line.separator");
              methodsString = (_methodsString_3 + _property_1);
            }
          }
        }
      }
    }
    return methodsString;
  }
  
  /**
   * Generates the Getter Method for the measurement data
   */
  public CharSequence generateGetterDeclaration(final MeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasLinearDataConversionWithInterval = this.hasLinearDataConversionWithInterval(d);
      boolean _not = (!_hasLinearDataConversionWithInterval);
      if (_not) {
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
      } else {
        CharSequence _generateAdjustedGetterPrototypes = this.generateAdjustedGetterPrototypes(d, dataset);
        _builder.append(_generateAdjustedGetterPrototypes, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * Generates the Getter Method for adjusted measurement data
   */
  public CharSequence generateAdjustedGetterPrototypes(final MeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    String _returnDataType = this.getReturnDataType(d);
    _builder.append(_returnDataType, "");
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
    _builder.append("Adjusted; }");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" get_");
    String _name_4 = dataset.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_2, "");
    _builder.append("_");
    String _name_5 = d.getName();
    String _replaceAll_1 = _name_5.replaceAll("[^a-zA-Z0-9]", "");
    _builder.append(_replaceAll_1, "");
    _builder.append("NotAdjusted(");
    String _name_6 = dataset.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_6);
    _builder.append(_firstUpper_3, "");
    _builder.append("* p) { return p->");
    String _name_7 = d.getName();
    _builder.append(_name_7, "");
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Getter Method for the non measurement data
   */
  public CharSequence generateGetterDeclaration(final NonMeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
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
                    _builder.append("void set_");
                    String _name_8 = dataset.getName();
                    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
                    _builder.append(_firstUpper_2, "");
                    _builder.append("_");
                    String _name_9 = d.getName();
                    String _replaceAll_1 = _name_9.replaceAll("[^a-zA-Z0-9]", "");
                    _builder.append(_replaceAll_1, "");
                    _builder.append("_WithDataConversion(");
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
                        _builder.append(" = ");
                        String _name_21 = d.getName();
                        String _firstLower_12 = StringExtensions.toFirstLower(_name_21);
                        _builder.append(_firstLower_12, "\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("p->");
                        String _name_22 = d.getName();
                        String _firstLower_13 = StringExtensions.toFirstLower(_name_22);
                        _builder.append(_firstLower_13, "\t\t");
                        _builder.append("Adjusted =  ((((");
                        String _name_23 = d.getName();
                        String _firstLower_14 = StringExtensions.toFirstLower(_name_23);
                        _builder.append(_firstLower_14, "\t\t");
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
      }
    }
    _builder.append("void set_");
    String _name_24 = dataset.getName();
    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_24);
    _builder.append(_firstUpper_6, "");
    _builder.append("_");
    String _name_25 = d.getName();
    String _replaceAll_3 = _name_25.replaceAll("[^a-zA-Z0-9]", "");
    _builder.append(_replaceAll_3, "");
    _builder.append("(");
    String _name_26 = dataset.getName();
    String _firstUpper_7 = StringExtensions.toFirstUpper(_name_26);
    _builder.append(_firstUpper_7, "");
    _builder.append("* p, ");
    String _typeName_7 = this.toTypeName(d);
    _builder.append(_typeName_7, "");
    _builder.append(" ");
    String _name_27 = d.getName();
    String _firstLower_15 = StringExtensions.toFirstLower(_name_27);
    _builder.append(_firstLower_15, "");
    _builder.append(" ) { p->");
    String _name_28 = d.getName();
    String _firstLower_16 = StringExtensions.toFirstLower(_name_28);
    _builder.append(_firstLower_16, "");
    _builder.append(" = ");
    String _name_29 = d.getName();
    String _firstLower_17 = StringExtensions.toFirstLower(_name_29);
    _builder.append(_firstLower_17, "");
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSetterDeclaration(final NonMeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isConstant = d.isConstant();
      boolean _not = (!_isConstant);
      if (_not) {
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
        _builder.append(" ) { p->");
        String _name_4 = d.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_4);
        _builder.append(_firstLower_1, "");
        _builder.append(" = ");
        String _name_5 = d.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
        _builder.append(_firstLower_2, "");
        _builder.append("; }");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("// no setter for constant value");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateEndiannessMethodsDeclarations(final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateAdjustAllEndianness = this.generateAdjustAllEndianness(d);
    _builder.append(_generateAdjustAllEndianness, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateCheckLittleEndian = this.generateCheckLittleEndian();
    _builder.append(_generateCheckLittleEndian, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateSwapEndiannessOnDemand = this.generateSwapEndiannessOnDemand(d);
    _builder.append(_generateSwapEndiannessOnDemand, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates a method to check if endianness of the variables of the struct need to be swappe
   */
  public CharSequence generateAdjustAllEndianness(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void adjust_");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("_allEndianness(");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("* p){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("int n = 1;");
    _builder.newLine();
    _builder.newLine();
    {
      if ((this.bigEndian == true)) {
        _builder.append("\t");
        _builder.append("// if little endian device architecture then convert (big endian defined)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if(*(char *)&n == 1) {");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("// if big endian device architecture then convert (little endian defined)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if(*(char *)&n != 1) {");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    String _swapEndiannessIncludeusedDataSets = this.swapEndiannessIncludeusedDataSets(dataset);
    _builder.append(_swapEndiannessIncludeusedDataSets, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates a method to check if the given architecture is little endian.
   */
  public CharSequence generateCheckLittleEndian() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bool check_little_endian(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int n = 1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// true if little endian device architecture detected");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return (*(char *)&n == 1);");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates a method to swap endianness of all variables of the struct
   */
  public CharSequence generateSwapEndiannessOnDemand(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void swap_");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("_all_endianness(");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("* p){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _swapEndiannessIncludeusedDataSets = this.swapEndiannessIncludeusedDataSets(dataset);
    _builder.append(_swapEndiannessIncludeusedDataSets, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Helper function to swap endianness of all variables of the struct
   */
  public String swapEndiannessIncludeusedDataSets(final DataSet d) {
    DataSet dataSet = d;
    StringConcatenation _builder = new StringConcatenation();
    String methodsString = _builder.toString();
    while ((dataSet != null)) {
      {
        String _methodsString = methodsString;
        CharSequence _swapEndianness = this.swapEndianness(dataSet);
        methodsString = (_methodsString + _swapEndianness);
        EList<DataSet> _usedDataSets = dataSet.getUsedDataSets();
        DataSet _head = IterableExtensions.<DataSet>head(_usedDataSets);
        dataSet = _head;
      }
    }
    return methodsString;
  }
  
  /**
   * Helper function to swap endianness of all variables of the struct
   */
  public CharSequence swapEndianness(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _eContents = dataset.eContents();
      Iterable<MeasurementData> _filter = Iterables.<MeasurementData>filter(_eContents, MeasurementData.class);
      for(final MeasurementData data : _filter) {
        {
          DataType _dataType = data.getDataType();
          boolean _equals = Objects.equal(_dataType, DataType.INT16);
          if (_equals) {
            _builder.append("p->");
            String _nameLower = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower, "");
            _builder.append(" = swap_int16( p->");
            String _nameLower_1 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_1, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_1 = data.getDataType();
          boolean _equals_1 = Objects.equal(_dataType_1, DataType.UINT16);
          if (_equals_1) {
            _builder.append("p->");
            String _nameLower_2 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_2, "");
            _builder.append(" = swap_uint16( p->");
            String _nameLower_3 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_3, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_2 = data.getDataType();
          boolean _equals_2 = Objects.equal(_dataType_2, DataType.INT32);
          if (_equals_2) {
            _builder.append("p->");
            String _nameLower_4 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_4, "");
            _builder.append(" = swap_int32( p->");
            String _nameLower_5 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_5, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_3 = data.getDataType();
          boolean _equals_3 = Objects.equal(_dataType_3, DataType.UINT32);
          if (_equals_3) {
            _builder.append("p->");
            String _nameLower_6 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_6, "");
            _builder.append(" = swap_uint32( p->");
            String _nameLower_7 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_7, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_4 = data.getDataType();
          boolean _equals_4 = Objects.equal(_dataType_4, DataType.INT64);
          if (_equals_4) {
            _builder.append("p->");
            String _nameLower_8 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_8, "");
            _builder.append(" = swap_int64( p->");
            String _nameLower_9 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_9, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_5 = data.getDataType();
          boolean _equals_5 = Objects.equal(_dataType_5, DataType.UINT64);
          if (_equals_5) {
            _builder.append("p->");
            String _nameLower_10 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_10, "");
            _builder.append(" = swap_uint64( p->");
            String _nameLower_11 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_11, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_6 = data.getDataType();
          boolean _equals_6 = Objects.equal(_dataType_6, DataType.FLOAT);
          if (_equals_6) {
            _builder.append("p->");
            String _nameLower_12 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_12, "");
            _builder.append(" = swap_float( p->");
            String _nameLower_13 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_13, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_7 = data.getDataType();
          boolean _equals_7 = Objects.equal(_dataType_7, DataType.DOUBLE);
          if (_equals_7) {
            _builder.append("p->");
            String _nameLower_14 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_14, "");
            _builder.append(" = swap_double( p->");
            String _nameLower_15 = GenerationUtil.toNameLower(data);
            _builder.append(_nameLower_15, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<EObject> _eContents_1 = dataset.eContents();
      Iterable<NonMeasurementData> _filter_1 = Iterables.<NonMeasurementData>filter(_eContents_1, NonMeasurementData.class);
      for(final NonMeasurementData data_1 : _filter_1) {
        {
          DataType _dataType_8 = data_1.getDataType();
          boolean _equals_8 = Objects.equal(_dataType_8, DataType.INT16);
          if (_equals_8) {
            _builder.append("p->");
            String _nameLower_16 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_16, "");
            _builder.append(" = swap_int16( p->");
            String _nameLower_17 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_17, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_9 = data_1.getDataType();
          boolean _equals_9 = Objects.equal(_dataType_9, DataType.UINT16);
          if (_equals_9) {
            _builder.append("p->");
            String _nameLower_18 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_18, "");
            _builder.append(" = swap_uint16( p->");
            String _nameLower_19 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_19, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_10 = data_1.getDataType();
          boolean _equals_10 = Objects.equal(_dataType_10, DataType.INT32);
          if (_equals_10) {
            _builder.append("p->");
            String _nameLower_20 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_20, "");
            _builder.append(" = swap_int32( p->");
            String _nameLower_21 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_21, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_11 = data_1.getDataType();
          boolean _equals_11 = Objects.equal(_dataType_11, DataType.UINT32);
          if (_equals_11) {
            _builder.append("p->");
            String _nameLower_22 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_22, "");
            _builder.append(" = swap_uint32( p->");
            String _nameLower_23 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_23, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_12 = data_1.getDataType();
          boolean _equals_12 = Objects.equal(_dataType_12, DataType.INT64);
          if (_equals_12) {
            _builder.append("p->");
            String _nameLower_24 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_24, "");
            _builder.append(" = swap_int64( p->");
            String _nameLower_25 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_25, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_13 = data_1.getDataType();
          boolean _equals_13 = Objects.equal(_dataType_13, DataType.UINT64);
          if (_equals_13) {
            _builder.append("p->");
            String _nameLower_26 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_26, "");
            _builder.append(" = swap_uint64( p->");
            String _nameLower_27 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_27, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_14 = data_1.getDataType();
          boolean _equals_14 = Objects.equal(_dataType_14, DataType.FLOAT);
          if (_equals_14) {
            _builder.append("p->");
            String _nameLower_28 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_28, "");
            _builder.append(" = swap_float( p->");
            String _nameLower_29 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_29, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DataType _dataType_15 = data_1.getDataType();
          boolean _equals_15 = Objects.equal(_dataType_15, DataType.DOUBLE);
          if (_equals_15) {
            _builder.append("p->");
            String _nameLower_30 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_30, "");
            _builder.append(" = swap_double( p->");
            String _nameLower_31 = GenerationUtil.toNameLower(data_1);
            _builder.append(_nameLower_31, "");
            _builder.append(" );");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
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
   * @return true if the MeasurementData is adjusted
   * with linear data conversion with interval
   */
  public boolean hasLinearDataConversionWithInterval(final MeasurementData data) {
    EList<DataAdjustment> _adjustments = data.getAdjustments();
    Iterable<LinearDataConversionWithInterval> _filter = Iterables.<LinearDataConversionWithInterval>filter(_adjustments, LinearDataConversionWithInterval.class);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    return (!_isEmpty);
  }
  
  public String getReturnDataType(final MeasurementData d) {
    String _xblockexpression = null;
    {
      boolean _isAdjustedByLinearConversionWithInterval = this.isAdjustedByLinearConversionWithInterval(d);
      if (_isAdjustedByLinearConversionWithInterval) {
        DataType _dataTypeOfDataConversionAdjustment = GenerationUtil.getDataTypeOfDataConversionAdjustment(d);
        return DataTypes.getDataTypeBy(_dataTypeOfDataConversionAdjustment);
      }
      _xblockexpression = this.toTypeName(d);
    }
    return _xblockexpression;
  }
  
  /**
   * Checks, if the given MeasurementData-element was specified to be adjusted as linear conversion.
   */
  public boolean isAdjustedByLinearConversionWithInterval(final MeasurementData data) {
    boolean _and = false;
    EList<DataAdjustment> _adjustments = data.getAdjustments();
    int _size = _adjustments.size();
    boolean _greaterThan = (_size > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      EList<DataAdjustment> _adjustments_1 = data.getAdjustments();
      DataAdjustment _get = _adjustments_1.get(0);
      _and = (_get instanceof LinearDataConversionWithInterval);
    }
    return _and;
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
