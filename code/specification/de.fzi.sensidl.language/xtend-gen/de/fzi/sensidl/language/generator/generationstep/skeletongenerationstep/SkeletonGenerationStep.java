package de.fzi.sensidl.language.generator.generationstep.skeletongenerationstep;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.IExecuter;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter;
import de.fzi.sensidl.language.generator.factory.c.CGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaGenerator;
import de.fzi.sensidl.language.generator.factory.javascript.JavaScriptGenerator;
import de.fzi.sensidl.language.generator.generationstep.GenerationStep;
import java.util.HashMap;
import java.util.List;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SkeletonGenerationStep extends GenerationStep {
  private List<DataSet> dataSet;
  
  public SkeletonGenerationStep(final ElementFilter filter) {
    List<DataSet> _filterData = filter.<DataSet>filterData();
    this.dataSet = _filterData;
  }
  
  @Override
  public void startGenerationTask() {
    HashMap<SensIDLConstants.GenerationLanguage, IExecuter> _initExecuter = this.initExecuter();
    this.startGenerationTask(_initExecuter);
  }
  
  private HashMap<SensIDLConstants.GenerationLanguage, IExecuter> initExecuter() {
    HashMap<SensIDLConstants.GenerationLanguage, IExecuter> _hashMap = new HashMap<SensIDLConstants.GenerationLanguage, IExecuter>();
    final Procedure1<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>> _function = new Procedure1<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>>() {
      @Override
      public void apply(final HashMap<SensIDLConstants.GenerationLanguage, IExecuter> it) {
        final IExecuter _function = new IExecuter() {
          @Override
          public void execute() {
            final JavaGenerator generator = new JavaGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.JAVA, _function);
        final IExecuter _function_1 = new IExecuter() {
          @Override
          public void execute() {
            final CGenerator generator = new CGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.C, _function_1);
        final IExecuter _function_2 = new IExecuter() {
          @Override
          public void execute() {
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.CSHARP, _function_2);
        final IExecuter _function_3 = new IExecuter() {
          @Override
          public void execute() {
            final JavaScriptGenerator generator = new JavaScriptGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.JAVASCRIPT, _function_3);
      }
    };
    return ObjectExtensions.<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>>operator_doubleArrow(_hashMap, _function);
  }
}
