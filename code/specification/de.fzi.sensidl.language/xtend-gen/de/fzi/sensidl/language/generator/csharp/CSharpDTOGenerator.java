package de.fzi.sensidl.language.generator.csharp;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.language.generator.IDTOGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class CSharpDTOGenerator implements IDTOGenerator {
  private final static String CSharp_EXTENSION = ".cs";
  
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public CSharpDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  @Override
  public void generate() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + CSharpDTOGenerator.CSharp_EXTENSION);
  }
  
  @Override
  public String toTypeName(final Data data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
