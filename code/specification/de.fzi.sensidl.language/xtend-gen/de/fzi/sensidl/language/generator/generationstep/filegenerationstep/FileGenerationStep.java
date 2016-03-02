package de.fzi.sensidl.language.generator.generationstep.filegenerationstep;

import de.fzi.sensidl.language.generator.generationstep.GenerationStep;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.xtext.generator.IFileSystemAccess;

/**
 * The FileGenerationStep is a concrete subclass of the GenerationStep class. The main
 * task of the class encapsulate the responsibility of the actual code generation.
 */
@SuppressWarnings("all")
public class FileGenerationStep extends GenerationStep {
  private final static Logger logger = Logger.getLogger(FileGenerationStep.class);
  
  private final IFileSystemAccess fsa;
  
  /**
   * The constructor is used to initialize a new IFileSystemAccess-object.
   * @param newFsa - corresponds to the IFileSystemAccess-object which is needed to generate
   * 				   the different files.
   */
  public FileGenerationStep(final IFileSystemAccess newFsa) {
    this.fsa = newFsa;
  }
  
  /**
   * Generates all files of the {@link GenerationStep#filesToGenerate}-map which was filled
   * by each generation step.
   * @see GenerationStep#startGenerationTask()
   */
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
