package de.fzi.sensidl.language.generator.factory.projects;

import de.fzi.sensidl.language.generator.factory.projects.ProjectGenerator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MavenProjectGenerator2 extends ProjectGenerator {
  private final static String MAVEN_TARGET_FOLDER = "target/classes";
  
  private final static String MAVEN_SOURCE_FOLDER = "src";
  
  private final String projectName;
  
  private String projectPath;
  
  private IProject project;
  
  private IJavaProject javaProject;
  
  public MavenProjectGenerator2(final String projectName) {
    this.projectName = projectName;
    this.projectPath = "";
  }
  
  private String setProjectPath(final String projectPath) {
    return this.projectPath = projectPath;
  }
  
  public String getProjectPath() {
    return this.projectPath;
  }
  
  @Override
  public IProject createProject() throws CoreException, IOException {
    IProject _xblockexpression = null;
    {
      IProject _createProjectWith = this.createProjectWith(this.projectName);
      this.project = _createProjectWith;
      this.addNature();
      IJavaProject _create = JavaCore.create(this.project);
      this.javaProject = _create;
      this.addClassPathEntries();
      this.addDirectoryStructure();
      _xblockexpression = this.project;
    }
    return _xblockexpression;
  }
  
  public void addClassPathEntries() {
    try {
      final ArrayList<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
      final IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
      LibraryLocation[] _libraryLocations = JavaRuntime.getLibraryLocations(vmInstall);
      final Consumer<LibraryLocation> _function = new Consumer<LibraryLocation>() {
        @Override
        public void accept(final LibraryLocation eachLocation) {
          IPath _systemLibraryPath = eachLocation.getSystemLibraryPath();
          IClasspathEntry _newLibraryEntry = JavaCore.newLibraryEntry(_systemLibraryPath, null, null);
          entries.add(_newLibraryEntry);
        }
      };
      ((List<LibraryLocation>)Conversions.doWrapArray(_libraryLocations)).forEach(_function);
      int _size = entries.size();
      IClasspathEntry[] _newArrayOfSize = new IClasspathEntry[_size];
      IClasspathEntry[] _array = entries.<IClasspathEntry>toArray(_newArrayOfSize);
      this.javaProject.setRawClasspath(_array, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void addDirectoryStructure() {
    this.addSourceLocation();
  }
  
  private void addOutputLocation() {
    try {
      final IFolder targetFolder = this.project.getFolder(MavenProjectGenerator2.MAVEN_TARGET_FOLDER);
      targetFolder.create(false, true, null);
      IPath _fullPath = targetFolder.getFullPath();
      this.javaProject.setOutputLocation(_fullPath, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addSourceLocation() {
    final IFolder sourceFolder = this.createSourceFolder();
    IPath _fullPath = sourceFolder.getFullPath();
    String _oSString = _fullPath.toOSString();
    this.setProjectPath(_oSString);
    this.addSourceFolderToClassEntries(sourceFolder);
  }
  
  public Object addPackageTo(final IFolder sourceFolder) {
    return null;
  }
  
  public void addSourceFolderToClassEntries(final IFolder sourceFolder) {
    try {
      final IPackageFragmentRoot root = this.javaProject.getPackageFragmentRoot(sourceFolder);
      final IClasspathEntry[] oldEntries = this.javaProject.getRawClasspath();
      int _length = oldEntries.length;
      int _plus = (_length + 1);
      final IClasspathEntry[] newEntries = new IClasspathEntry[_plus];
      int _length_1 = oldEntries.length;
      System.arraycopy(oldEntries, 0, newEntries, 0, _length_1);
      int _length_2 = oldEntries.length;
      IPath _path = root.getPath();
      IClasspathEntry _newSourceEntry = JavaCore.newSourceEntry(_path);
      newEntries[_length_2] = _newSourceEntry;
      this.javaProject.setRawClasspath(newEntries, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public IFolder createSourceFolder() {
    try {
      IFolder _xblockexpression = null;
      {
        final IFolder sourceFolder = this.project.getFolder(MavenProjectGenerator2.MAVEN_SOURCE_FOLDER);
        sourceFolder.create(false, true, null);
        _xblockexpression = sourceFolder;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void addNature() {
    try {
      IProjectDescription _description = this.project.getDescription();
      IProjectDescription _addNatureTo = this.addNatureTo(_description);
      this.project.setDescription(_addNatureTo, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private IProjectDescription addNatureTo(final IProjectDescription description) {
    IProjectDescription _xblockexpression = null;
    {
      List<String> _asList = Arrays.<String>asList(JavaCore.NATURE_ID);
      final Object[] natureIds = _asList.toArray();
      description.setNatureIds(((String[]) natureIds));
      _xblockexpression = description;
    }
    return _xblockexpression;
  }
  
  private IProject createProjectWith(final String name) {
    try {
      IProject _xblockexpression = null;
      {
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        final IProject project = _root.getProject(name);
        project.create(null);
        project.open(null);
        _xblockexpression = project;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
