package de.fzi.sensidl.language.generator.factory.c;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.c.CDTOFileGenerator;
import de.fzi.sensidl.language.generator.factory.c.CDTOGenerator;
import de.fzi.sensidl.language.generator.factory.c.CUtilityGenerator;
import de.fzi.sensidl.language.generator.factory.c.HeaderDTOGenerator;
import de.fzi.sensidl.language.generator.factory.c.MainDTOHeaderFileGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

/**
 * The CGenerator represents a concrete  implementation
 * of @see ICodeGenerator
 */
@SuppressWarnings("all")
public class CGenerator implements ICodeGenerator {
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      final ArrayList<CDTOGenerator> generators = new ArrayList<CDTOGenerator>();
      HeaderDTOGenerator _headerDTOGenerator = new HeaderDTOGenerator(dataSet);
      generators.add(_headerDTOGenerator);
      MainDTOHeaderFileGenerator _mainDTOHeaderFileGenerator = new MainDTOHeaderFileGenerator(dataSet);
      generators.add(_mainDTOHeaderFileGenerator);
      CDTOFileGenerator _cDTOFileGenerator = new CDTOFileGenerator(dataSet);
      generators.add(_cDTOFileGenerator);
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      final Consumer<CDTOGenerator> _function = new Consumer<CDTOGenerator>() {
        @Override
        public void accept(final CDTOGenerator generator) {
          HashMap<String, CharSequence> _generate = generator.generate();
          filesToGenerate.putAll(_generate);
        }
      };
      generators.forEach(_function);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  /**
   * @see ICodeGenerator#generateEncoder()
   */
  @Override
  public HashMap<String, CharSequence> generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * @see ICodeGenerator#generateDecoder()
   */
  @Override
  public HashMap<String, CharSequence> generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<MeasurementData> data) {
    CUtilityGenerator _cUtilityGenerator = new CUtilityGenerator(data);
    return _cUtilityGenerator.generate();
  }
}
