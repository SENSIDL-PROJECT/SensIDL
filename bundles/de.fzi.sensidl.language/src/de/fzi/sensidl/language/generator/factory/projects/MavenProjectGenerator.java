package de.fzi.sensidl.language.generator.factory.projects;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.maven.model.Model;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.MavenModelManager;
import org.eclipse.m2e.core.internal.IMavenConstants;

import de.fzi.sensidl.language.generator.SensIDLConstants;

public class MavenProjectGenerator extends ProjectGenerator {

	private final static String POM_ARTIFACT_ID_IDENTIFIER_TOKEN = "$_1";
	private final static String POM_GROUP_ID_IDENTIFIER_TOKEN = "$_2";
	private final static String MAVEN_POM_FILE_URL = "platform:/plugin/de.fzi.sensidl.language/resource/pom.xml";
	private static final String MAVEN_SOURCE_FOLDER = "src";
			
	private final String projectName;
			
	private String projectPath;
	private IProject project;
	private IJavaProject javaProject;
			
	public MavenProjectGenerator(String projectName) {
				
		this.projectName = projectName;
		this.projectPath = "";
		
	}
			
	private void setProjectPath(String projectPath) {
				
		this.projectPath = projectPath;
				
	}
			
	public String getProjectPath() {
				
		return this.projectPath;
				
	}
	
	@Override
	public IProject createProject() throws Exception {
		
		try {
			
			initializeProject();
			initializeJavaProject();
			convertToMavenProject();
			
			return this.project;
			
		} catch (CoreException | IOException ex) {
			
			throw new Exception(ex);
			
		}
				
	}

	private void initializeProject() throws Exception {
		
		this.project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.projectName);
		
		if (this.project.exists()) {
			
			if (this.deleteExistingProjectWith(projectName)) {
				
				project.delete(true, true, null);
				createProjectWith(this.projectName);
				
			} else {
				throw new Exception("Project already exist.");
			}
				
		} else {
			
			project.create(null);
			project.open(null);
			
		}
		
		setProjectPath(project.getLocation().toOSString());
		addNature();
		
	}
	
	private IProject createProjectWith(String name) throws CoreException {
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
			
		project.create(null);
		project.open(null);
	
		
		return project;
		
	}
	
	private void initializeJavaProject() throws CoreException {
		
		this.javaProject = JavaCore.create(this.project);
		addClassPathEntries();
		addSourceLocation();
		
	}
	
	private void convertToMavenProject() throws Exception {
		
		Model model = MavenPlugin.getMavenModelManager().readMavenModel(loadPomFileWithSettings());
		
	    final IFile file = getContainer().getFile(new Path(IMavenConstants.POM_FILE_NAME));
	    if(file.exists()) {
	    
	    	throw new Exception("Error occurred during maven-project generation.");
	    	
	    }

	    MavenPlugin.getProjectConversionManager().convert(this.project, model, null);

	    MavenModelManager modelManager = MavenPlugin.getMavenModelManager();
	    modelManager.createMavenModel(file, model);
		
	}

	private IContainer getContainer() {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(projectName));
		return (IContainer) resource;
		
	}
	
	private InputStream loadPomFileWithSettings() throws IOException {
		
		String pomFileContent = getPomFile();
		
		pomFileContent = pomFileContent.replace(POM_ARTIFACT_ID_IDENTIFIER_TOKEN, this.projectName);
		pomFileContent = pomFileContent.replace(POM_GROUP_ID_IDENTIFIER_TOKEN, getPackage());
		
		
		return new ByteArrayInputStream(pomFileContent.getBytes(StandardCharsets.UTF_8));
	}

	private CharSequence getPackage() {
		
		return SensIDLConstants.JAVA_PROJECT_PACKAGE_PREFIX + this.projectName;
	
	}

	private String getPomFile() throws IOException {

		URL url = null;
		InputStream content = null;
		
		url = new URL(MAVEN_POM_FILE_URL);
		content = url.openConnection().getInputStream();
		
		return IOUtils.toString(content);
		
	}

	private void addClassPathEntries() {
		
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		for(LibraryLocation eachLocation : JavaRuntime.getLibraryLocations(vmInstall)) {
			
			entries.add(JavaCore.newLibraryEntry(eachLocation.getSystemLibraryPath(), null, null));
			
		}

		try {
			
			this.javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
			
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void addSourceLocation() throws CoreException {
		
		IFolder sourceFolder = createSourceFolder();
		addSourceFolderToClassEntries(sourceFolder);
		
	}
	
	private void addSourceFolderToClassEntries(IFolder sourceFolder) throws JavaModelException {

		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
		javaProject.setRawClasspath(newEntries, null);
	
		
	}
	
	private IFolder createSourceFolder() throws CoreException {
		
		IFolder sourceFolder = this.project.getFolder(MAVEN_SOURCE_FOLDER);
		sourceFolder.create(false, true, null);

		
		return sourceFolder;
		
	}
	
	private void addNature() throws CoreException {
		
		this.project.setDescription(addNatureTo(this.project.getDescription()), null);
		
	}
	
	private IProjectDescription addNatureTo(IProjectDescription description) {
		
		String[] natureIds = (String[]) Arrays.asList(JavaCore.NATURE_ID, IMavenConstants.NATURE_ID).toArray();
		description.setNatureIds(natureIds);
		
		return description;
		
	}

}
