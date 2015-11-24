package de.fzi.sensidl.language.generator.javascript;

import de.fzi.sensidl.language.generator.ICodeGenerator;
import de.fzi.sensidl.language.generator.javascript.JavaScriptDTOGenerator;
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
  
  @Override
  public void generateDTO() {
    JavaScriptDTOGenerator _javaScriptDTOGenerator = new JavaScriptDTOGenerator(this.input, this.fsa);
    _javaScriptDTOGenerator.generate();
  }
  
  @Override
  public void generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public void generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
