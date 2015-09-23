package de.fzi.sensidl.language.generator.javascript;

import de.fzi.sensidl.language.generator.ICodeGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class JavaScriptGenerator implements ICodeGenerator {
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public JavaScriptGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  public void generateDTO() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
