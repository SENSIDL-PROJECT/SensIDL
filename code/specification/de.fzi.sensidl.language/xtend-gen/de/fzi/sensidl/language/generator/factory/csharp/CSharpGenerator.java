package de.fzi.sensidl.language.generator.factory.csharp;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("all")
public class CSharpGenerator implements ICodeGenerator {
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
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
