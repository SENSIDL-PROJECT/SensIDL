package de.fzi.sensidl.language.generator.factory.projects;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

abstract class ProjectGenerator {
	
	protected boolean deleteExistingProjectWith(final String name) {
		
		final boolean[] result = new boolean[1];
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			public void run() {
				result[0] = MessageDialog.openQuestion(new Shell(), "'" + name + "'" + "already exists",
						"Warning: " + "'" + name + "' already exists. Should this project be deleted?");
			}
		});
			
		return result[0];
		
	}
	
	/**
	 * This method creates a particular Project. 
	 */
	public abstract IProject createProject() throws Exception;
	
}