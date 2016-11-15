package de.fzi.sensidl.language.generator.generationstep;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.language.generator.IExecuter;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage;
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter;
import de.fzi.sensidl.language.generator.factory.projects.JavaPluginProjectGenerator;
import de.fzi.sensidl.language.generator.factory.projects.MavenProjectGenerator;
import de.fzi.sensidl.language.generator.generationstep.FileGenerationStep;
import de.fzi.sensidl.language.generator.generationstep.GenerationStep;
import java.util.HashMap;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ProjectGenerationStep extends GenerationStep {
  private final static String PATH_SEPERATOR = "/";
  
  private final String projectName;
  
  private final IFileSystemAccess fsa;
  
  /**
   * The constructor calls the needed data filtered by a
   * concrete element-filter.
   * @param filter - represents a base filter which can be substituted by a specific
   * 				   subclass that filters a particular set of elements.
   */
  public ProjectGenerationStep(final ElementFilter filter, final IFileSystemAccess newFsa) {
    Object _filterData = filter.<Object>filterData();
    String _name = ((SensorInterface) _filterData).getName();
    this.projectName = _name;
    this.fsa = newFsa;
  }
  
  @Override
  public void startGenerationTask() {
    HashMap<SensIDLConstants.GenerationLanguage, IExecuter> _resourcesToGenerateMapping = this.getResourcesToGenerateMapping();
    IExecuter _get = _resourcesToGenerateMapping.get(GenerationStep.generationLanguage);
    _get.execute();
  }
  
  private void resetGenerationSettings(final String projectPath, final String path) {
    GenerationStep.javaPackagePrefix = SensIDLConstants.JAVA_PROJECT_PACKAGE_PREFIX;
    String _filePathOf = this.getFilePathOf(path);
    FileGenerationStep.setFilePath(_filePathOf);
    ((JavaIoFileSystemAccess) this.fsa).setOutputPath(projectPath);
  }
  
  private String getFilePathOf(final String path) {
    String _xblockexpression = null;
    {
      final StringBuilder builder = new StringBuilder(path);
      builder.append(ProjectGenerationStep.PATH_SEPERATOR);
      builder.append(this.projectName);
      builder.append(ProjectGenerationStep.PATH_SEPERATOR);
      _xblockexpression = builder.toString();
    }
    return _xblockexpression;
  }
  
  /**
   * Initializes a HashMap that maps each {@link GenerationLanguage} to a
   * {@link IExecuter} object.
   * @return the HashMap {@link GenerationLanguage} to {@link IExecuter}
   */
  private HashMap<SensIDLConstants.GenerationLanguage, IExecuter> getResourcesToGenerateMapping() {
    final JavaPluginProjectGenerator pluginGenerator = new JavaPluginProjectGenerator(this.projectName);
    final MavenProjectGenerator mavenGenerator = new MavenProjectGenerator(this.projectName);
    HashMap<SensIDLConstants.GenerationLanguage, IExecuter> _hashMap = new HashMap<SensIDLConstants.GenerationLanguage, IExecuter>();
    final Procedure1<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>> _function = new Procedure1<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>>() {
      @Override
      public void apply(final HashMap<SensIDLConstants.GenerationLanguage, IExecuter> it) {
        final IExecuter _function = new IExecuter() {
          @Override
          public void execute() {
            try {
              pluginGenerator.createProject();
              String _projectPath = pluginGenerator.getProjectPath();
              ProjectGenerationStep.this.resetGenerationSettings(_projectPath, SensIDLConstants.JAVA_PROJECT_PACKAGE_PATH);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.JAVA_PLUGIN_PROJECT, _function);
        final IExecuter _function_1 = new IExecuter() {
          @Override
          public void execute() {
            try {
              mavenGenerator.createProject();
              String _projectPath = mavenGenerator.getProjectPath();
              ProjectGenerationStep.this.resetGenerationSettings(_projectPath, SensIDLConstants.JAVA_PROJECT_PACKAGE_PATH);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        it.put(SensIDLConstants.GenerationLanguage.OPCUA, _function_1);
      }
    };
    return ObjectExtensions.<HashMap<SensIDLConstants.GenerationLanguage, IExecuter>>operator_doubleArrow(_hashMap, _function);
  }
}
