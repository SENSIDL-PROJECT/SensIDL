package de.fzi.sensidl.language.generator.factory.csharp;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("all")
public class CSharpDTOGenerator implements IDTOGenerator {
  private List<DataSet> dataSet;
  
  public CSharpDTOGenerator(final List<DataSet> newDataSet) {
    this.dataSet = newDataSet;
  }
  
  @Override
  public HashMap<String, CharSequence> generate() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.CSharp_EXTENSION);
  }
  
  @Override
  public String toTypeName(final Data data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
