package de.fzi.sensidl.language.ui.wizard;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * The Custom Sensidl Wizard Dialog, extend the standard WizardDialog
 * 
 * @author Sven Eckhardt
 *
 */
public class SensidlWizardDialog extends WizardDialog {
	/**
	 * Constructor
	 * 
	 * @param parentShell
	 *            the parent Shell
	 * @param newWizard
	 *            the new Wizard to set, must be a SensidlWizard
	 */
	public SensidlWizardDialog(Shell parentShell, SensidlWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finish = getButton(IDialogConstants.FINISH_ID);
		finish.setText("Generate Code");
		setButtonLayoutData(finish);
	}

}
