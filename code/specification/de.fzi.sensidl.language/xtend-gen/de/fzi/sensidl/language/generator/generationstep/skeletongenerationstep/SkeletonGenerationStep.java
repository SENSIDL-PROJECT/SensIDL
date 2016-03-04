package de.fzi.sensidl.language.generator.generationstep.skeletongenerationstep;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.IExecuter;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage;
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter;
import de.fzi.sensidl.language.generator.factory.c.CGenerator;
import de.fzi.sensidl.language.generator.factory.csharp.CSharpGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaGenerator;
import de.fzi.sensidl.language.generator.factory.javascript.JavaScriptGenerator;
import de.fzi.sensidl.language.generator.factory.plaintext.PlaintextGenerator;
import de.fzi.sensidl.language.generator.generationstep.GenerationStep;
import java.util.HashMap;
import java.util.List;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * The SkeletonGenerationStep is a concrete subclass of the GenerationStep class. The main
 * task of the class is to generate the base structure (code-skeletons) of all files.
 */
@SuppressWarnings("all")
public class SkeletonGenerationStep extends GenerationStep {
  private List<DataSet> dataSet;
  
  /**
   * The constructor calls the needed data filtered by a
   * concrete element-filter.
   * @param filter - represents a base filter which can be substituted by a specific
   * 				   subclass that filters a particular set of elements.
   */
  public SkeletonGenerationStep(final ElementFilter filter) {
    List<DataSet> _filterData = filter.<DataSet>filterData();
    this.dataSet = _filterData;
  }
  
  /**
   * @see GenerationStep#startGenerationTask()
   */
  @Override
  public void startGenerationTask() {
    HashMap<SensIDLConstants.GenerationLanguage, IExecuter> _initExecuter = this.initExecuter();
    this.startGenerationTask(_initExecuter);
  }
  
  /**
   * The initExecuter-method initializes a HashMap that maps each {@link GenerationLanguage} to a
   * {@link IExecuter} object.
   * @return the HashMap {@link GenerationLanguage} to {@link IExecuter}
   */
  private HashMap<SensIDLConstants.GenerationLanguage, IExecuter> initExecuter() {
    HashMap<SensIDLConstants.GenerationLanguage, IExecuter> _hashMap = new HashMap<SensIDLConstants.GenerationLanguage, IExecuter>();
    final Procedure1<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>> _function = new Procedure1<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>>() {
      @Override
      public void apply(final HashMap<SensIDLConstants.GenerationLanguage, IExecuter> it) {
        final IExecuter _function = new IExecuter() {
          @Override
          public void execute() {
            final JavaGenerator jgenerator = new JavaGenerator();
            final CGenerator cgenerator = new CGenerator();
            final CSharpGenerator csharpgenerator = new CSharpGenerator();
            final JavaScriptGenerator jsgenerator = new JavaScriptGenerator();
            final PlaintextGenerator generator = new PlaintextGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = jgenerator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
                HashMap<String, CharSequence> _generateDTO_1 = cgenerator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_1);
                HashMap<String, CharSequence> _generateDTO_2 = csharpgenerator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_2);
                HashMap<String, CharSequence> _generateDTO_3 = jsgenerator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_3);
                HashMap<String, CharSequence> _generateDTO_4 = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_4);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.ALL, _function);
        final IExecuter _function_1 = new IExecuter() {
          @Override
          public void execute() {
            final JavaGenerator generator = new JavaGenerator();
            final PlaintextGenerator generator2 = new PlaintextGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
                HashMap<String, CharSequence> _generateDTO_1 = generator2.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_1);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.JAVA, _function_1);
        final IExecuter _function_2 = new IExecuter() {
          @Override
          public void execute() {
            final JavaGenerator generator = new JavaGenerator();
            final PlaintextGenerator generator2 = new PlaintextGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generatePluginProject = generator.generatePluginProject(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generatePluginProject);
                HashMap<String, CharSequence> _generateDTO = generator2.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.JAVA_PLUGIN_PROJECT, _function_2);
        final IExecuter _function_3 = new IExecuter() {
          @Override
          public void execute() {
            final CGenerator generator = new CGenerator();
            final PlaintextGenerator generator2 = new PlaintextGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
                HashMap<String, CharSequence> _generateDTO_1 = generator2.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_1);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.C, _function_3);
        final IExecuter _function_4 = new IExecuter() {
          @Override
          public void execute() {
            final CSharpGenerator generator = new CSharpGenerator();
            final PlaintextGenerator generator2 = new PlaintextGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
                HashMap<String, CharSequence> _generateDTO_1 = generator2.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_1);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.CSHARP, _function_4);
        final IExecuter _function_5 = new IExecuter() {
          @Override
          public void execute() {
            final JavaScriptGenerator generator = new JavaScriptGenerator();
            final PlaintextGenerator generator2 = new PlaintextGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
                HashMap<String, CharSequence> _generateDTO_1 = generator2.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_1);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.JAVASCRIPT, _function_5);
        final IExecuter _function_6 = new IExecuter() {
          @Override
          public void execute() {
            final PlaintextGenerator generator = new PlaintextGenerator();
            final PlaintextGenerator generator2 = new PlaintextGenerator();
            final Procedure1<HashMap<String, CharSequence>> _function = new Procedure1<HashMap<String, CharSequence>>() {
              @Override
              public void apply(final HashMap<String, CharSequence> it) {
                HashMap<String, CharSequence> _generateDTO = generator.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO);
                HashMap<String, CharSequence> _generateDTO_1 = generator2.generateDTO(SkeletonGenerationStep.this.dataSet);
                it.putAll(_generateDTO_1);
              }
            };
            ObjectExtensions.<HashMap<String, CharSequence>>operator_doubleArrow(
              GenerationStep.filesToGenerate, _function);
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.PLAINTEXT, _function_6);
      }
    };
    return ObjectExtensions.<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>>operator_doubleArrow(_hashMap, _function);
  }
}
