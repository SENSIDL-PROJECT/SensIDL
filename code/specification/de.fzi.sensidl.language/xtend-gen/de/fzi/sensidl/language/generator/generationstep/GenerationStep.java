package de.fzi.sensidl.language.generator.generationstep;

import com.google.common.base.Objects;
import de.fzi.sensidl.language.generator.IExecuter;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Consumer;

@SuppressWarnings("all")
public abstract class GenerationStep {
  protected static HashMap<String, CharSequence> filesToGenerate;
  
  protected static SensIDLConstants.GenerationLanguage generationLanguage;
  
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
  
  protected void startGenerationTask(final HashMap<SensIDLConstants.GenerationLanguage, IExecuter> executer) {
    boolean _equals = GenerationStep.generationLanguage.equals(SensIDLConstants.GenerationLanguage.NONE);
    if (_equals) {
      return;
    }
    boolean _equals_1 = GenerationStep.generationLanguage.equals(SensIDLConstants.GenerationLanguage.ALL);
    if (_equals_1) {
      Collection<IExecuter> _values = executer.values();
      final Consumer<IExecuter> _function = new Consumer<IExecuter>() {
        @Override
        public void accept(final IExecuter exec) {
          exec.execute();
        }
      };
      _values.forEach(_function);
      return;
    }
    IExecuter _get = executer.get(GenerationStep.generationLanguage);
    _get.execute();
  }
  
  public abstract void startGenerationTask();
}
