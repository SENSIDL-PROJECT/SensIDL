package de.fzi.sensidl.language.generator.generationstep.filegenerationstep;

import de.fzi.sensidl.language.generator.generationstep.GenerationStep;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class FileGenerationStep extends GenerationStep {
  private final static Logger logger = Logger.getLogger(FileGenerationStep.class);
  
  private final IFileSystemAccess fsa;
  
  public FileGenerationStep(final IFileSystemAccess newFsa) {
    this.fsa = newFsa;
  }
  
  @Override
  public void startGenerationTask() {
    Set<String> _keySet = GenerationStep.filesToGenerate.keySet();
    for (final String file : _keySet) {
      {
        FileGenerationStep.logger.info(("Start with code-generation of file " + file));
        CharSequence _get = GenerationStep.filesToGenerate.get(file);
        this.fsa.generateFile(file, _get);
        FileGenerationStep.logger.info((("File " + file) + " was successfully generated"));
      }
    }
  }
}
