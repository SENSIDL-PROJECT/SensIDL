package de.fzi.sensidl.language.generator.factory.c;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.ListData;
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
import javax.measure.unit.Unit;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for
 * the generation of the header-files.
 */
@SuppressWarnings("all")
public class HeaderDTOGenerator extends CDTOGenerator {
  private static Logger logger = Logger.getLogger(HeaderDTOGenerator.class);
  
  /**
   * The constructor calls the constructor of the superclass to set a list of DataSet-elements.
   * @param newDataSet Represents the list of DataSet-elements.
   */
  public HeaderDTOGenerator(final List<DataSet> newDataSet) {
    super(newDataSet);
  }
  
  /**
   * Triggers the code-generation for the C-struct type definition.
   * @param dataset Represents the model element for the struct.
   */
  public CharSequence compile(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    CharSequence _generateStruct = this.generateStruct(_firstUpper, dataset);
    _builder.append(_generateStruct, "");
    return _builder;
  }
  
  /**
   * @see IDTOGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      HeaderDTOGenerator.logger.info("Start with code-generation of the data transfer object header-file.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      for (final DataSet dataset : this.dataSets) {
        {
          String _nameUpper = GenerationUtil.toNameUpper(dataset);
          final String fileName = this.addFileExtensionTo(_nameUpper);
          String _name = dataset.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          CharSequence _generateStruct = this.generateStruct(_firstUpper, dataset);
          filesToGenerate.put(fileName, _generateStruct);
          HeaderDTOGenerator.logger.info(((("File: " + fileName) + " was generated in ") + SensIDLOutputConfigurationProvider.SENSIDL_GEN));
        }
      }
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  /**
   * Generates a typedefinition of a struct.
   * @param structName Represents the name of the struct.
   * @param dataset Represents the model element for the struct.
   */
  public CharSequence generateStruct(final String structName, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**\\brief\t\t");
    {
      String _description = dataset.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = dataset.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.append("  ");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _eContents = dataset.eContents();
      Iterable<Data> _filter = Iterables.<Data>filter(_eContents, Data.class);
      for(final Data data : _filter) {
        {
          if ((!(data instanceof ListData))) {
            CharSequence _generateDescription = this.generateDescription(data);
            _builder.append(_generateDescription, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _upperCase = structName.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _upperCase_1 = structName.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <stdint.h> ");
    _builder.newLine();
    _builder.append("#include \"");
    String _utilityFileName = GenerationUtil.getUtilityFileName(dataset, SensIDLConstants.HEADER_EXTENSION);
    _builder.append(_utilityFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("typedef struct");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    String _generateDataFieldsIncludeUsedDataSets = this.generateDataFieldsIncludeUsedDataSets(dataset);
    _builder.append(_generateDataFieldsIncludeUsedDataSets, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("} ");
    String _nameUpper = GenerationUtil.toNameUpper(dataset);
    _builder.append(_nameUpper, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateInitDatasetPrototype = this.generateInitDatasetPrototype(dataset);
    _builder.append(_generateInitDatasetPrototype, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateMethodsPrototypes = this.generateMethodsPrototypes(dataset);
    _builder.append(_generateMethodsPrototypes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateDataMethodsPrototypesIncludeUsedDataSets = this.generateDataMethodsPrototypesIncludeUsedDataSets(dataset);
    _builder.append(_generateDataMethodsPrototypesIncludeUsedDataSets, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    CharSequence _generateEndiannessMethodsPrototypes = this.generateEndiannessMethodsPrototypes(dataset);
    _builder.append(_generateEndiannessMethodsPrototypes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEndiannessMethodsPrototypes(final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateAdjustAllEndiannessPrototype = this.generateAdjustAllEndiannessPrototype(d);
    _builder.append(_generateAdjustAllEndiannessPrototype, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    CharSequence _generateSwapEndiannessOnDemandPrototype = this.generateSwapEndiannessOnDemandPrototype(d);
    _builder.append(_generateSwapEndiannessOnDemandPrototype, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates the data fields for this data set including used data sets.
   */
  public String generateDataFieldsIncludeUsedDataSets(final DataSet d) {
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
    String dataFieldsString = _builder.toString();
    for (final DataSet dataSet : dataSets) {
      EList<Data> _data = dataSet.getData();
      for (final Data data : _data) {
        {
          String _dataFieldsString = dataFieldsString;
          CharSequence _generateVariable = this.generateVariable(data);
          dataFieldsString = (_dataFieldsString + _generateVariable);
          String _dataFieldsString_1 = dataFieldsString;
          String _property = System.getProperty("line.separator");
          dataFieldsString = (_dataFieldsString_1 + _property);
        }
      }
    }
    return dataFieldsString.replaceAll("(?m)^[ \t]*\r?\n", "");
  }
  
  /**
   * Generates the Init Method for the dataset initialization
   */
  public CharSequence generateInitDatasetPrototype(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* @Initialization of the ");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(" dataset (to give the initial values to const fields)");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("void init_");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("(");
    String _name_2 = dataset.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "");
    _builder.append("* p);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates Methods
   */
  public CharSequence generateMethodsPrototypes(final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _eContents = d.eContents();
      Iterable<Method> _filter = Iterables.<Method>filter(_eContents, Method.class);
      for(final Method method : _filter) {
        _builder.newLine();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Method for ");
        String _name = method.getName();
        _builder.append(_name, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* ");
        {
          String _description = method.getDescription();
          boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            String _description_1 = method.getDescription();
            _builder.append(_description_1, " ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/\t");
        _builder.newLine();
        String _methodReturnType = this.getMethodReturnType(method);
        _builder.append(_methodReturnType, "");
        _builder.append(" ");
        String _name_1 = method.getName();
        _builder.append(_name_1, "");
        _builder.append("(");
        String _methodParameter = this.getMethodParameter(method);
        _builder.append(_methodParameter, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
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
  public String generateDataMethodsPrototypesIncludeUsedDataSets(final DataSet d) {
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
              CharSequence _generateGetterPrototype = this.generateGetterPrototype(data, usedDataSets);
              methodsString = (_methodsString + _generateGetterPrototype);
              String _methodsString_1 = methodsString;
              String _property = System.getProperty("line.separator");
              methodsString = (_methodsString_1 + _property);
            }
            EList<String> _excludedMethods_1 = data.getExcludedMethods();
            boolean _contains_1 = _excludedMethods_1.contains("setter");
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              String _methodsString_2 = methodsString;
              CharSequence _generateSetterPrototype = this.generateSetterPrototype(data, usedDataSets);
              methodsString = (_methodsString_2 + _generateSetterPrototype);
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
              CharSequence _generateGetterPrototype = this.generateGetterPrototype(data_1, usedDataSets);
              methodsString = (_methodsString + _generateGetterPrototype);
              String _methodsString_1 = methodsString;
              String _property = System.getProperty("line.separator");
              methodsString = (_methodsString_1 + _property);
            }
            EList<String> _excludedMethods_1 = data_1.getExcludedMethods();
            boolean _contains_1 = _excludedMethods_1.contains("setter");
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              String _methodsString_2 = methodsString;
              CharSequence _generateSetterPrototype = this.generateSetterPrototype(data_1, usedDataSets);
              methodsString = (_methodsString_2 + _generateSetterPrototype);
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
  protected CharSequence _generateGetterPrototype(final MeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    String dataType = this.getReturnDataType(d);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isAdjustedByLinearConversionWithInterval = this.isAdjustedByLinearConversionWithInterval(d);
      if (_isAdjustedByLinearConversionWithInterval) {
        CharSequence _generatedAdjustedGetterPrototypes = this.generatedAdjustedGetterPrototypes(d, dataset);
        _builder.append(_generatedAdjustedGetterPrototypes, "");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("/**");
        _builder.newLine();
        _builder.append("* @return the ");
        String _name = d.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.newLineIfNotEmpty();
        _builder.append("*/");
        _builder.newLine();
        _builder.append(dataType, "");
        _builder.append(" get_");
        String _name_1 = dataset.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper_1, "");
        _builder.append("_");
        String _name_2 = d.getName();
        String _replaceAll = _name_2.replaceAll("[^a-zA-Z0-9]", "");
        _builder.append(_replaceAll, "");
        _builder.append("(");
        String _name_3 = dataset.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper_2, "");
        _builder.append("* p);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  /**
   * Generates the Getter Method for adjusted measurement data
   */
  public CharSequence generatedAdjustedGetterPrototypes(final MeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* @return the adjusted ");
    String _name = d.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    String _returnDataType = this.getReturnDataType(d);
    _builder.append(_returnDataType, "");
    _builder.append(" get_");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("_");
    String _name_2 = d.getName();
    String _replaceAll = _name_2.replaceAll("[^a-zA-Z0-9]", "");
    _builder.append(_replaceAll, "");
    _builder.append("(");
    String _name_3 = dataset.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "");
    _builder.append("* p);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* @return the not adjusted ");
    String _name_4 = d.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_3, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" get_");
    String _name_5 = dataset.getName();
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
    _builder.append(_firstUpper_4, "");
    _builder.append("_");
    String _name_6 = d.getName();
    String _replaceAll_1 = _name_6.replaceAll("[^a-zA-Z0-9]", "");
    _builder.append(_replaceAll_1, "");
    _builder.append("NotAdjusted(");
    String _name_7 = dataset.getName();
    String _firstUpper_5 = StringExtensions.toFirstUpper(_name_7);
    _builder.append(_firstUpper_5, "");
    _builder.append("* p); \t\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
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
   * Generates the Setter Method for the measurement data
   */
  protected CharSequence _generateSetterPrototype(final MeasurementData d, final DataSet dataset) {
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
              if ((dataAdj instanceof DataConversion)) {
                {
                  if ((dataAdj instanceof LinearDataConversion)) {
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @param pointer to dataset, adjust");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("*\t\t\tthe adjust to set");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("*/");
                    _builder.newLine();
                    _builder.append("void set_");
                    String _name = dataset.getName();
                    String _firstUpper = StringExtensions.toFirstUpper(_name);
                    _builder.append(_firstUpper, "");
                    _builder.append("_");
                    String _name_1 = d.getName();
                    String _replaceAll = _name_1.replaceAll("[^a-zA-Z0-9]", "");
                    _builder.append(_replaceAll, "");
                    _builder.append("_WithDataConversion(");
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
                    _builder.append(" );\t\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param pointer to dataset, ");
    String _name_4 = d.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*\t\t\tthe ");
    String _name_5 = d.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_2, " ");
    _builder.append(" to set");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("void set_");
    String _name_6 = dataset.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_6);
    _builder.append(_firstUpper_2, "");
    _builder.append("_");
    String _name_7 = d.getName();
    String _replaceAll_1 = _name_7.replaceAll("[^a-zA-Z0-9]", "");
    _builder.append(_replaceAll_1, "");
    _builder.append("(");
    String _name_8 = dataset.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_8);
    _builder.append(_firstUpper_3, "");
    _builder.append("* p, ");
    String _typeName_1 = this.toTypeName(d);
    _builder.append(_typeName_1, "");
    _builder.append(" ");
    String _name_9 = d.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_9);
    _builder.append(_firstLower_3, "");
    _builder.append(" );");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Getter Method for the non measurement data
   */
  protected CharSequence _generateGetterPrototype(final NonMeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* @return the ");
    String _name = d.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" get_");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("_");
    String _name_2 = d.getName();
    String _replaceAll = _name_2.replaceAll("[^a-zA-Z0-9]", "");
    _builder.append(_replaceAll, "");
    _builder.append("(");
    String _name_3 = dataset.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "");
    _builder.append("* p);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Setter Method for the non measurement data
   */
  protected CharSequence _generateSetterPrototype(final NonMeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isConstant = d.isConstant();
      boolean _not = (!_isConstant);
      if (_not) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @param pointer to dataset, ");
        String _name = d.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*\t\t\tthe ");
        String _name_1 = d.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower_1, " ");
        _builder.append(" to set");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("void set_");
        String _name_2 = dataset.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper, "");
        _builder.append("_");
        String _name_3 = d.getName();
        String _replaceAll = _name_3.replaceAll("[^a-zA-Z0-9]", "");
        _builder.append(_replaceAll, "");
        _builder.append("(");
        String _name_4 = dataset.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_1, "");
        _builder.append("* p, ");
        String _typeName = this.toTypeName(d);
        _builder.append(_typeName, "");
        _builder.append(" ");
        String _name_5 = d.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
        _builder.append(_firstLower_2, "");
        _builder.append(" );");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("// no setter for constant value");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  /**
   * Generates a description for measured data.
   * @param data
   * 			represents data which was measured by a sensor.
   */
  protected CharSequence _generateDescription(final MeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* \\param\t\t");
    String _name = data.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    {
      String _description = data.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = data.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("*\t\t\t\tMeasured in unit: ");
    Unit<?> _unit = data.getUnit();
    _builder.append(_unit, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates a description for non-measured data.
   * @param data
   * 			represents variable or constant non-measured data.
   */
  protected CharSequence _generateDescription(final NonMeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* \\param\t\t");
    String _name = data.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    {
      String _description = data.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = data.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates a c variable for measured data in the struct.
   * @param data
   * 			represents data which was measured by a sensor.
   */
  protected CharSequence _generateVariable(final MeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    String _typeName = this.toTypeName(data);
    _builder.append(_typeName, "");
    _builder.append(" ");
    String _nameLower = GenerationUtil.toNameLower(data);
    _builder.append(_nameLower, "");
    _builder.append(";  // Unit: ");
    Unit<?> _unit = data.getUnit();
    _builder.append(_unit, "");
    _builder.append(", ");
    {
      String _description = data.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        String _description_1 = data.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      boolean _isAdjustedByLinearConversionWithInterval = this.isAdjustedByLinearConversionWithInterval(data);
      if (_isAdjustedByLinearConversionWithInterval) {
        String _returnDataType = this.getReturnDataType(data);
        _builder.append(_returnDataType, "");
        _builder.append(" ");
        String _nameLower_1 = GenerationUtil.toNameLower(data);
        _builder.append(_nameLower_1, "");
        _builder.append("Adjusted;  // Unit: ");
        Unit<?> _unit_1 = data.getUnit();
        _builder.append(_unit_1, "");
        _builder.append(", ");
        {
          String _description_2 = data.getDescription();
          boolean _notEquals_1 = (!Objects.equal(_description_2, null));
          if (_notEquals_1) {
            String _description_3 = data.getDescription();
            _builder.append(_description_3, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * Generates a c variable for non-measured data in the struct.
   * @param data
   * 			represents variable or constant non-measured data.
   */
  protected CharSequence _generateVariable(final NonMeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    String _typeName = this.toTypeName(data);
    _builder.append(_typeName, "");
    _builder.append(" ");
    String _nameLower = GenerationUtil.toNameLower(data);
    _builder.append(_nameLower, "");
    _builder.append(";  ");
    {
      String _description = data.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("// ");
        String _description_1 = data.getDescription();
        _builder.append(_description_1, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateVariable(final ListData data) {
    StringConcatenation _builder = new StringConcatenation();
    String _listType = this.getListType(data);
    _builder.append(_listType, "");
    _builder.append(" ");
    String _nameLower = GenerationUtil.toNameLower(data);
    _builder.append(_nameLower, "");
    _builder.append("[10]; // static list of length 10 (does a dynamic list fit the requierements?)");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * return the type of the list
   */
  public String getListType(final ListData data) {
    DataType _dataType = data.getDataType();
    boolean _notEquals = (!Objects.equal(_dataType, DataType.UNDEFINED));
    if (_notEquals) {
      DataType _dataType_1 = data.getDataType();
      return this.toTypeName(_dataType_1);
    } else {
      DataSet _dataTypeDataSet = data.getDataTypeDataSet();
      boolean _notEquals_1 = (!Objects.equal(_dataTypeDataSet, null));
      if (_notEquals_1) {
        DataSet _dataTypeDataSet_1 = data.getDataTypeDataSet();
        return _dataTypeDataSet_1.getName();
      }
    }
    return null;
  }
  
  /**
   * Generates a method to adjust endianness of all struct variables.
   * @param dataset
   */
  public CharSequence generateAdjustAllEndiannessPrototype(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* Adjusts all data atributes of a struct to given endianness depending on the machine architecture");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("void adjust_");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("_allEndianness(");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("* p);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates a method to swap endianness of all struct variables.
   * @param dataset
   */
  public CharSequence generateSwapEndiannessOnDemandPrototype(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* Swaps Endianness between little endian and big endian");
    _builder.newLine();
    _builder.append("*/\t\t\t\t");
    _builder.newLine();
    _builder.append("void swap_");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("_all_endianness(");
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("* p);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * @see IDTOGenerator#addFileExtensionTo(String)
   */
  @Override
  public String addFileExtensionTo(final String className) {
    return (className + SensIDLConstants.HEADER_EXTENSION);
  }
  
  public CharSequence generateGetterPrototype(final Data d, final DataSet dataset) {
    if (d instanceof MeasurementData) {
      return _generateGetterPrototype((MeasurementData)d, dataset);
    } else if (d instanceof NonMeasurementData) {
      return _generateGetterPrototype((NonMeasurementData)d, dataset);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(d, dataset).toString());
    }
  }
  
  public CharSequence generateSetterPrototype(final Data d, final DataSet dataset) {
    if (d instanceof MeasurementData) {
      return _generateSetterPrototype((MeasurementData)d, dataset);
    } else if (d instanceof NonMeasurementData) {
      return _generateSetterPrototype((NonMeasurementData)d, dataset);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(d, dataset).toString());
    }
  }
  
  public CharSequence generateDescription(final Data data) {
    if (data instanceof MeasurementData) {
      return _generateDescription((MeasurementData)data);
    } else if (data instanceof NonMeasurementData) {
      return _generateDescription((NonMeasurementData)data);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data).toString());
    }
  }
  
  public CharSequence generateVariable(final Data data) {
    if (data instanceof ListData) {
      return _generateVariable((ListData)data);
    } else if (data instanceof MeasurementData) {
      return _generateVariable((MeasurementData)data);
    } else if (data instanceof NonMeasurementData) {
      return _generateVariable((NonMeasurementData)data);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data).toString());
    }
  }
}
