package de.fzi.sensidl.language.generator.factory.c;

import com.google.common.base.Strings;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import de.fzi.sensidl.language.generator.factory.c.CDTOGenerator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CDTOFileGenerator extends CDTOGenerator {
  private static Logger logger = Logger.getLogger(CDTOFileGenerator.class);
  
  public CDTOFileGenerator(final List<DataSet> newDataSet) {
    super(newDataSet);
  }
  
  /**
   * Generates the .c files with struct-declaration and the
   * marshalling-function.
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      CDTOFileGenerator.logger.info("Start with code-generation of a c data transfer object.");
      for (final DataSet dataset : this.dataSet) {
        {
          String _name = dataset.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          final String fileName = this.addFileExtensionTo(_firstUpper);
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
   * @param dataset
   * 			represents the model element for the struct.
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
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + SensIDLConstants.HEADER_EXTENSION);
    _builder.append(_plus, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append(" ");
    String _name_2 = dataset.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
   * Adds the file extension.
   * @see IDTOGenerator#addFileExtensionTo(String)
   */
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.C_EXTENSION);
  }
}
