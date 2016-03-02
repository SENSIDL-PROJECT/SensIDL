package de.fzi.sensidl.language.generator.factory.c;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
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
import javax.measure.unit.Unit;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for the
 * generation of the header-files.
 */
@SuppressWarnings("all")
public class HeaderDTOGenerator extends CDTOGenerator {
  private static Logger logger = Logger.getLogger(HeaderDTOGenerator.class);
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of DataSet-elements.
   * @param newDataSet - represents the list of DataSet-elements.
   */
  public HeaderDTOGenerator(final List<DataSet> newDataSet) {
    super(newDataSet);
  }
  
  /**
   * Triggers the code-generation for the
   * c struct type definition.
   * @param dataset - represents the model element for the struct.
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
   * Generates the .c files with structs.
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
   * @param structName
   * 			represents the name of the struct.
   * @param dataset
   * 			represents the model element for the struct.
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
        CharSequence _generateDescription = this.generateDescription(data);
        _builder.append(_generateDescription, "");
        _builder.newLineIfNotEmpty();
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
    _builder.newLine();
    {
      EList<EObject> _eContents_1 = dataset.eContents();
      Iterable<NonMeasurementData> _filter_1 = Iterables.<NonMeasurementData>filter(_eContents_1, NonMeasurementData.class);
      for(final NonMeasurementData data_1 : _filter_1) {
        {
          boolean _and = false;
          boolean _isConstant = data_1.isConstant();
          if (!_isConstant) {
            _and = false;
          } else {
            String _name = data_1.getName();
            boolean _equals = Objects.equal(_name, "bDeviceType");
            _and = _equals;
          }
          if (_and) {
            _builder.append("#ifndef RADIO_DEVICE_TYPE_VALUE");
            _builder.newLine();
            _builder.append("#define RADIO_DEVICE_TYPE_VALUE ");
            String _value = data_1.getValue();
            _builder.append(_value, "");
            _builder.newLineIfNotEmpty();
            _builder.append("#endif");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("typedef struct");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    String _generateVariablesIncludeParentDataSet = this.generateVariablesIncludeParentDataSet(dataset);
    _builder.append(_generateVariablesIncludeParentDataSet, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("} ");
    String _nameUpper = GenerationUtil.toNameUpper(dataset);
    _builder.append(_nameUpper, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("extern ");
    String _nameUpper_1 = GenerationUtil.toNameUpper(dataset);
    _builder.append(_nameUpper_1, "");
    _builder.append(" ");
    String _nameLower = GenerationUtil.toNameLower(dataset);
    _builder.append(_nameLower, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateInitDatasetPrototype = this.generateInitDatasetPrototype(dataset);
    _builder.append(_generateInitDatasetPrototype, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateDataMethodsPrototypesIncludeParentDataSet = this.generateDataMethodsPrototypesIncludeParentDataSet(dataset);
    _builder.append(_generateDataMethodsPrototypesIncludeParentDataSet, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the data fields for this data set including used data sets.
   */
  public String generateVariablesIncludeParentDataSet(final DataSet d) {
    DataSet dataSet = d;
    StringConcatenation _builder = new StringConcatenation();
    String dataFieldsString = _builder.toString();
    while ((dataSet != null)) {
      {
        EList<EObject> _eContents = dataSet.eContents();
        Iterable<NonMeasurementData> _filter = Iterables.<NonMeasurementData>filter(_eContents, NonMeasurementData.class);
        for (final NonMeasurementData data : _filter) {
          {
            String _dataFieldsString = dataFieldsString;
            CharSequence _generateVariable = this.generateVariable(data);
            dataFieldsString = (_dataFieldsString + _generateVariable);
            String _dataFieldsString_1 = dataFieldsString;
            String _property = System.getProperty("line.separator");
            dataFieldsString = (_dataFieldsString_1 + _property);
          }
        }
        EList<EObject> _eContents_1 = dataSet.eContents();
        Iterable<MeasurementData> _filter_1 = Iterables.<MeasurementData>filter(_eContents_1, MeasurementData.class);
        for (final MeasurementData data_1 : _filter_1) {
          {
            String _dataFieldsString = dataFieldsString;
            CharSequence _generateVariable = this.generateVariable(data_1);
            dataFieldsString = (_dataFieldsString + _generateVariable);
            String _dataFieldsString_1 = dataFieldsString;
            String _property = System.getProperty("line.separator");
            dataFieldsString = (_dataFieldsString_1 + _property);
          }
        }
        DataSet _parentDataSet = dataSet.getParentDataSet();
        dataSet = _parentDataSet;
      }
    }
    return dataFieldsString;
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
    _builder.append(" dataset");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("void init");
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
   * Generates the getter and setter methods prototypes for the data of this data set including used data sets.
   */
  public String generateDataMethodsPrototypesIncludeParentDataSet(final DataSet d) {
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
            CharSequence _generateGetterPrototype = this.generateGetterPrototype(data, parentDataSet);
            methodsString = (_methodsString + _generateGetterPrototype);
            String _methodsString_1 = methodsString;
            String _property = System.getProperty("line.separator");
            methodsString = (_methodsString_1 + _property);
            String _methodsString_2 = methodsString;
            CharSequence _generateSetterPrototype = this.generateSetterPrototype(data, parentDataSet);
            methodsString = (_methodsString_2 + _generateSetterPrototype);
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
            CharSequence _generateGetterPrototype = this.generateGetterPrototype(data_1, parentDataSet);
            methodsString = (_methodsString + _generateGetterPrototype);
            String _methodsString_1 = methodsString;
            String _property = System.getProperty("line.separator");
            methodsString = (_methodsString_1 + _property);
            String _methodsString_2 = methodsString;
            CharSequence _generateSetterPrototype = this.generateSetterPrototype(data_1, parentDataSet);
            methodsString = (_methodsString_2 + _generateSetterPrototype);
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
  
  /**
   * Generates the Getter Method for the measurement data
   */
  protected CharSequence _generateGetterPrototype(final MeasurementData d, final DataSet dataset) {
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
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Setter Method for the measurement data
   */
  protected CharSequence _generateSetterPrototype(final MeasurementData d, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
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
    _builder.append(";");
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
    _builder.append(";");
    return _builder;
  }
  
  /**
   * Adds the file extension.
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
    if (data instanceof MeasurementData) {
      return _generateVariable((MeasurementData)data);
    } else if (data instanceof NonMeasurementData) {
      return _generateVariable((NonMeasurementData)data);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data).toString());
    }
  }
}
