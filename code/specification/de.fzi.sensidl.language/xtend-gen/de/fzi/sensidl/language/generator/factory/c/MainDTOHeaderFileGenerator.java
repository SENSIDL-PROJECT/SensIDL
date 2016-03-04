package de.fzi.sensidl.language.generator.factory.c;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import de.fzi.sensidl.language.generator.factory.c.CDTOGenerator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * This class implements a part of the CDTOGenerator. This class is responsible for
 * the main header file which includes all header files of all generated DTO structs.
 */
@SuppressWarnings("all")
public class MainDTOHeaderFileGenerator extends CDTOGenerator {
  private static Logger logger = Logger.getLogger(MainDTOHeaderFileGenerator.class);
  
  /**
   * The constructor calls the constructor of the superclass to set a list of DataSet-elements.
   * @param newDataSet Represents the list of DataSet-elements.
   */
  public MainDTOHeaderFileGenerator(final List<DataSet> newDataSet) {
    super(newDataSet);
  }
  
  /**
   * @see IDTOGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      MainDTOHeaderFileGenerator.logger.info("Start with code-generation of the header-file which includes all headers of the generated DTO structs.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      final String fileName = this.addFileExtensionTo(SensIDLConstants.MAIN_HEADER_FILE_NAME);
      CharSequence _generateStruct = this.generateStruct();
      filesToGenerate.put(fileName, _generateStruct);
      MainDTOHeaderFileGenerator.logger.info(((("File: " + fileName) + " was generated in ") + SensIDLOutputConfigurationProvider.SENSIDL_GEN));
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateStruct() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final DataSet dataset : this.dataSets) {
        _builder.append("#include \"");
        String _nameUpper = GenerationUtil.toNameUpper(dataset);
        String _addFileExtensionTo = this.addFileExtensionTo(_nameUpper);
        _builder.append(_addFileExtensionTo, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.HEADER_EXTENSION);
  }
}
