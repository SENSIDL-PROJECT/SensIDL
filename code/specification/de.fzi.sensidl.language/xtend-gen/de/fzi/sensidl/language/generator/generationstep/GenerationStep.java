package de.fzi.sensidl.language.generator.generationstep;

import com.google.common.base.Objects;
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
  
  protected static String javaPackagePrefix;
  
  /**
   * This static method is used to reset the generation configurations for a new generation task.
   * @param newGenerationLanguage Corresponds to the desired language that you want to generate.
   */
  public static void setGlobalSettings(final SensIDLConstants.GenerationLanguage newGenerationLanguage) {
    GenerationStep.resetFilesToGenerate();
    GenerationStep.generationLanguage = newGenerationLanguage;
    GenerationStep.javaPackagePrefix = SensIDLConstants.JAVA_DEFAULT_PACKAGE_PREFIX;
  }
  
  protected static void setJavaPackagePrefix(final String newJavaPackagePrefix) {
    GenerationStep.javaPackagePrefix = newJavaPackagePrefix;
  }
  
  private static HashMap<String, CharSequence> resetFilesToGenerate() {
    HashMap<String, CharSequence> _xifexpression = null;
    boolean _equals = Objects.equal(GenerationStep.filesToGenerate, null);
    if (_equals) {
      HashMap<String, CharSequence> _hashMap = new HashMap<String, CharSequence>();
      _xifexpression = GenerationStep.filesToGenerate = _hashMap;
    } else {
      GenerationStep.filesToGenerate.clear();
    }
    return _xifexpression;
  }
  
  /**
   * Starts the generation task.
   */
  public abstract void startGenerationTask();
}
