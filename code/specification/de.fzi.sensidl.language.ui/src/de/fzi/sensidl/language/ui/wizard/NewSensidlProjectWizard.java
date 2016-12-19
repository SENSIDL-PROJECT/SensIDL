package de.fzi.sensidl.language.ui.wizard;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.ui.XtextProjectHelper;

public class NewSensidlProjectWizard extends BasicNewProjectResourceWizard implements INewWizard {
	
	private final static String SENSIDL_SOURCE_FOLDER = "src";
	private final static String SENSIDL_FILE_EXTENSION = ".sidl";
	
	private SensidlConfigurationWizardPage sensIDLPage;
	private boolean isFinished = false;

	public NewSensidlProjectWizard() {
		super();
		setWindowTitle("New SensIDL Project");
	}

	@Override
	public void addPages() {
		super.addPages();
		setSensIDLPage();
		addPage(this.sensIDLPage);
	};

	private void setSensIDLPage() {
		this.sensIDLPage = new SensidlConfigurationWizardPage();
	}
	
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);
		if (nextPage == null) {
			this.isFinished = true;
		}
		return nextPage;
	}

	@Override
	public boolean canFinish() {
		boolean baseCanFinish = super.canFinish();
		return this.isFinished && baseCanFinish;
	}

	@Override
	public boolean performFinish() {
		boolean superResult = super.performFinish();
		final IProject project = getNewProject();

		IWorkspaceRunnable setUpSensIDLProject = new IWorkspaceRunnable() {
			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				
				addSensidlFileTo(project);
				addXtextNatureTo(project);
				
			}

		};
		
		try {
			ResourcesPlugin.getWorkspace().run(setUpSensIDLProject, null);
		} catch (CoreException e) {
			new ErrorDialogHandler().execute(new Shell(), e);
			return false;
		}
		
		return superResult;
	}
	
	private void addSensidlFileTo(IProject project) throws CoreException {
		
		createSourceFolder(project);
		addSensidlFileTo(project.getFolder(SENSIDL_SOURCE_FOLDER));
		
	}
	
	private void addSensidlFileTo(IFolder folder) throws CoreException {
		
		IFile sensIDLFile = folder.getFile(getFileName());
		sensIDLFile.create(new ByteArrayInputStream("".getBytes()), false, null);
		
	}
	
	private String getFileName() {
		
		return this.sensIDLPage.getSensidlFileName() + SENSIDL_FILE_EXTENSION;
		
	}

	private void createSourceFolder(IProject project) throws CoreException {
		
		IFolder sourceFolder = project.getFolder(SENSIDL_SOURCE_FOLDER);
		sourceFolder.create(false, true, null);
		
	}
	
	private void addXtextNatureTo(IProject project) throws CoreException {
		
		String[] natureIds = (String[]) Arrays.asList(XtextProjectHelper.NATURE_ID).toArray();
		
		IProjectDescription description = project.getDescription();
		description.setNatureIds(natureIds);
		
		project.setDescription(description, null);
		
	}
	
}
