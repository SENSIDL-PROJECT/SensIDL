package de.fzi.sensidl.language.generator.factory.c;

import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CUtilityGenerator implements IUtilityGenerator {
  private static Logger logger = Logger.getLogger(CUtilityGenerator.class);
  
  private List<MeasurementData> data;
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of Data-elements.
   * @param newData - represents the list of DataSet-elements.
   */
  public CUtilityGenerator(final List<MeasurementData> newData) {
    this.data = newData;
  }
  
  /**
   * Generates the .h file for the utility-class.
   * @see IDTOGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      CUtilityGenerator.logger.info("Start with code-generation of the java utility class.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      MeasurementData _get = this.data.get(0);
      final String utilityName = GenerationUtil.getUtilityName(_get);
      String _addFileExtensionTo = this.addFileExtensionTo(utilityName);
      CharSequence _generateUtility = this.generateUtility(utilityName);
      filesToGenerate.put(_addFileExtensionTo, _generateUtility);
      String _addFileExtensionTo_1 = this.addFileExtensionTo(utilityName);
      String _plus = ("File: " + _addFileExtensionTo_1);
      String _plus_1 = (_plus + " was generated in ");
      String _plus_2 = (_plus_1 + 
        SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      CUtilityGenerator.logger.info(_plus_2);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  /**
   * At this stage the utility-file is just used to include the "stdbool" header-file.
   */
  public CharSequence generateUtility(final String string) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <stdbool.h>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Adds the file extension to the specified string.
   * @see IUtilityGenerator#addFileExtensionTo(String)
   */
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.HEADER_EXTENSION);
  }
}
