package de.fzi.sensidl.language.generator.factory.projects;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

/**
 * Creates a Java Plug-in Project at the root of the workspace
 * 
 * @author Sven Eckhardt
 */
public class JavaPluginProjectGenerator extends ProjectGenerator {

	private String projectName;
	private String projectPath;

	/**
	 * The Constructor.
	 * @param projectName - Specifies the name of the generated project.
	 */
	public JavaPluginProjectGenerator(String projectName) {
		
		this.projectName = projectName;
		this.projectPath = "";
		
	}
	
	public String getProjectPath() {
		
		return this.projectPath;
		
	}
	
	private void setProjectPath(String projectPath) {
		
		this.projectPath = projectPath;
		
	}
	
	/**
	 * Create a Java Plug-in Project with the given name.
	 * 
	 * @param projectName
	 *            The name for the java plug-in project
	 * @return the plug-in project
	 * @throws CoreException
	 * @throws IOException
	 */
	public IProject createProject() throws Exception {
		// get project on workspace
		IProject project = null;

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		project = workspace.getRoot().getProject(projectName);

		// Remove old project if there is one with the same name. Show a Message
		// Dialog if the old project will be deleted
		if (project.exists()) {
			
			if (this.deleteExistingProjectWith(projectName)) {
				project.delete(true, true, null);
			} else {
				throw new Exception("Project already exist.");
			}
				
		}

		// create Java project
		IJavaProject javaProject = JavaCore.create(project);

		IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
		projectDescription.setLocation(null);
		project.create(projectDescription, null);

		// set Nature (Java and Plug-in Nature)
		projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature" });

		project.open(null);
		project.setDescription(projectDescription, null);

		setProjectPath(project.getLocation().toOSString());
		
		// create src folder
		IFolder srcFolder = project.getFolder("src");
		if (!srcFolder.exists()) {
			srcFolder.create(false, true, null);
		}

		// copy gson
		Bundle bundle = Platform.getBundle("com.google.gson");
		Path path = new Path("");
		URL absoluteFileURL = FileLocator.resolve(FileLocator.find(bundle, path, null));

		java.nio.file.Path gsonSource = java.nio.file.Paths
				.get(absoluteFileURL.toString().replaceFirst("jar:file:/", "").replace("!/", ""));

		java.nio.file.Path gsonDestination = java.nio.file.Paths
				.get(ResourcesPlugin.getWorkspace().getRoot().getLocation() + "/" + projectName + "/");

		java.nio.file.Files.copy(gsonSource, gsonDestination.resolve(gsonSource.getFileName()),
				java.nio.file.StandardCopyOption.REPLACE_EXISTING);

		// add classpath entries
		List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();
		IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(srcFolder.getFullPath());
		classpathEntries.add(0, srcClasspathEntry);

		classpathEntries.add(JavaCore.newContainerEntry(new Path(
				"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5")));
		classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));

		// add gson to classpathEntries
		File file = new File(gsonDestination.resolve(gsonSource.getFileName()).toString());
		classpathEntries.add(JavaCore.newLibraryEntry(Path.fromOSString(file.getAbsolutePath()), null, null));

		// set classpath entries
		javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[classpathEntries.size()]), null);

		// set bin folder
		javaProject.setOutputLocation(new Path("/" + projectName + "/bin"), null);
		// create Manifest.MF
		createManifest(projectName, project);
		// create build.properties
		createBuildProperties(project, "src");

		return project;
	}

	/**
	 * Get the project name
	 * 
	 * @return the project name
	 */
	public String getProjectName() {
		return projectName;
	}

	/*
	 * creates the MANIFEST.MF
	 */
	private void createManifest(String projectName, IProject project) throws CoreException, IOException {
		StringBuilder content = new StringBuilder("Manifest-Version: 1.0\n");
		content.append("Bundle-ManifestVersion: 2\n");
		content.append("Bundle-Name: " + projectName + "\n");
		content.append("Bundle-SymbolicName: " + projectName.replaceAll(" ", "") + "; singleton:=true\n");
		content.append("Bundle-Version: 1.0.0.qualifier\n");
		content.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");

		IFolder metaInf = project.getFolder("META-INF");
		metaInf.create(false, true, null);
		createFile("MANIFEST.MF", metaInf, content.toString());
	}

	/*
	 * create build.properties
	 */
	private void createBuildProperties(IProject project, String srcFolder) throws CoreException, IOException {
		StringBuilder content = new StringBuilder("source.. = " + srcFolder + "/");
		content.append("\n");
		content.append("bin.includes = META-INF/,\\\n.");
		createFile("build.properties", project, content.toString());
	}

	/*
	 * creates a file from the given parameters
	 */
	private IFile createFile(String name, IContainer container, String content)
			throws CoreException, IOException {
		IFile file = container.getFile(new Path(name));
		createDirectory(file.getParent());

		InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
		if (file.exists()) {
			file.setContents(stream, true, true, null);
		} else {
			file.create(stream, true, null);
		}
		stream.close();

		return file;
	}

	/*
	 * creates non-existing directories recursively
	 */
	private void createDirectory(IContainer container) throws CoreException {
		if (!container.exists()) {
			if (!container.getParent().exists()) {
				createDirectory(container.getParent());
			}
			if (container instanceof IFolder) {
				((IFolder) container).create(false, true, null);
			}
		}
	}
}
