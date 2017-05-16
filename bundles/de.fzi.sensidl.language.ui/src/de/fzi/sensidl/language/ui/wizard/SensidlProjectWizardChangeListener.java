package de.fzi.sensidl.language.ui.wizard;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.wizard.WizardPage;

public class SensidlProjectWizardChangeListener implements IChangeListener {

	private WizardPage page;
	private SensidlProjectDTO dtoToObserve;
	private boolean run = true;
	
	public void stop() {
		this.run = false;
	}
	
	public SensidlProjectWizardChangeListener(WizardPage page, SensidlProjectDTO dtoToObserver) {
		this.page = page;
		this.dtoToObserve = dtoToObserver;
	}
	
	@Override
	public void handleChange(ChangeEvent event) {
		if (!this.run) {
			return;			
		}
		
		AggregateValidationStatus status = (AggregateValidationStatus)event.getObservable();
		IStatus validationStatus = (IStatus) status.getValue();
		if (validationStatus.getSeverity() == IStatus.OK) {
			setOK();
		} else {
			setError(validationStatus);
		}
	}

	private void setOK() {
		page.setErrorMessage(null);
		if (!this.dtoToObserve.isEmpty()) {
			page.setPageComplete(true);
		}
	}
	
	private void setError(IStatus validationStatus) {
		page.setErrorMessage(validationStatus.getMessage());
		page.setPageComplete(false);
	}

}
