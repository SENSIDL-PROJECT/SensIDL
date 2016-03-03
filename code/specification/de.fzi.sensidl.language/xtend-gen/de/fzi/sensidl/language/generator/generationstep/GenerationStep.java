package de.fzi.sensidl.language.generator.generationstep;

import com.google.common.base.Objects;
import de.fzi.sensidl.language.generator.IExecuter;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import java.util.HashMap;

/**
 * The GenerationStep-class is the superclass of different generation steps.
 * There exist a couple of subclasses which forms together the general generation-process.
 */
@SuppressWarnings("all")
public abstract class GenerationStep {
  protected static HashMap<String, CharSequence> filesToGenerate;
  
  protected static SensIDLConstants.GenerationLanguage generationLanguage;
  
  /**
   * This static method is used to reset the generation configurations for a new generation task.
   * @param newGenerationLanguage Corresponds to the desired language that you want to generate.
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
   * This static method is used to reset the generation configurations for a new generation task.
   * @param executer Represents a HashMap which maps the specific generation language to a IExecuter-
   * 				   object.
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
