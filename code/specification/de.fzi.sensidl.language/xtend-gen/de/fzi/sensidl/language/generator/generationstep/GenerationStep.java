package de.fzi.sensidl.language.generator.generationstep;

import com.google.common.base.Objects;
import de.fzi.sensidl.language.generator.IExecuter;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import java.util.HashMap;

/**
 * The GenerationStep-class is the superclass of different generation steps. There exist
 * a couple of subclasses which forms together the general generation-process.
 */
@SuppressWarnings("all")
public abstract class GenerationStep {
  protected static HashMap<String, CharSequence> filesToGenerate;
  
  protected static SensIDLConstants.GenerationLanguage generationLanguage;
  
  /**
   * This static method is used to reset the generation configurations
   * for a new generation task.
   * @param newGenerationLanguage - corresponds to the desired language that you want
   * 								  to generate.
   */
  public static void init(final SensIDLConstants.GenerationLanguage newGenerationLanguage) {
    boolean _equals = Objects.equal(GenerationStep.filesToGenerate, null);
    if (_equals) {
      HashMap<String, CharSequence> _hashMap = new HashMap<String, CharSequence>();
      GenerationStep.filesToGenerate = _hashMap;
    } else {
      GenerationStep.filesToGenerate.clear();
    }
    GenerationStep.generationLanguage = newGenerationLanguage;
  }
  
  /**
   * The startGenerationTask-method implements the common generation task.
   * @param executer - represents a map that consists of several @see IExecuter objects.
   * 					 Each of them is a functional interface that implement the calls of
   * 					 the necessary generation classes for a specific language.
   */
  protected void startGenerationTask(final HashMap<SensIDLConstants.GenerationLanguage, IExecuter> executer) {
    boolean _equals = GenerationStep.generationLanguage.equals(SensIDLConstants.GenerationLanguage.NONE);
    if (_equals) {
      return;
    }
    IExecuter _get = executer.get(GenerationStep.generationLanguage);
    _get.execute();
  }
  
  /**
   * This abstract method has to be implemented from a specific GenerationStep-subclass.
   * The generation process consists of a sequence of generation steps. In each step the
   * subclass implementing this method can perform there individual generation task.
   */
  public abstract void startGenerationTask();
}
