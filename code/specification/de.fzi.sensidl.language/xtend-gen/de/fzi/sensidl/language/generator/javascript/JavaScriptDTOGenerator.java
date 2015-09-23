package de.fzi.sensidl.language.generator.javascript;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.language.generator.IDTOGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class JavaScriptDTOGenerator implements IDTOGenerator {
  private final static String JAVASCRIPT_EXTENSION = ".js";
  
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public JavaScriptDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  public void generate() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + JavaScriptDTOGenerator.JAVASCRIPT_EXTENSION);
  }
  
  public String toTypeName(final Data data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
