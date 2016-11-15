package de.fzi.sensidl.language.generator.factory.c;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
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
import org.eclipse.emf.ecore.EObject;

/**
 * The CGenerator represents a concrete implementation of The ICodeGenerator and
 * implements the code-generator for the language C.
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
   * @see ICodeGenerator#generateUtilityClass(List<MeasurementData>)
   */
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<EObject> data) {
    CUtilityGenerator _cUtilityGenerator = new CUtilityGenerator(data);
    return _cUtilityGenerator.generate();
  }
  
  /**
   * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
   */
  @Override
  public HashMap<String, CharSequence> generateOpcUa(final List<DataSet> dataSet) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
