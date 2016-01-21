package de.fzi.sensidl.language.generator.factory.javascript;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.javascript.JavaScriptDTOGenerator;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("all")
public class JavaScriptGenerator implements ICodeGenerator {
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    JavaScriptDTOGenerator _javaScriptDTOGenerator = new JavaScriptDTOGenerator(dataSet);
    return _javaScriptDTOGenerator.generate();
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
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
