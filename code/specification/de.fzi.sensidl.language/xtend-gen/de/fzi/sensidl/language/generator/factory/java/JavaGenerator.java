package de.fzi.sensidl.language.generator.factory.java;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaDTOGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaUtilityGenerator;
import java.util.HashMap;
import java.util.List;

/**
 * Implementation of the ICodeGenerator interface. The JavaGenerator represents a specific code-generator.
 * 
 * @author Max Scheerer
 */
@SuppressWarnings("all")
public class JavaGenerator implements ICodeGenerator {
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    JavaDTOGenerator _javaDTOGenerator = new JavaDTOGenerator(dataSet);
    return _javaDTOGenerator.generate();
  }
  
  @Override
  public HashMap<String, CharSequence> generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public HashMap<String, CharSequence> generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<MeasurementData> data) {
    JavaUtilityGenerator _javaUtilityGenerator = new JavaUtilityGenerator(data);
    return _javaUtilityGenerator.generate();
  }
}
