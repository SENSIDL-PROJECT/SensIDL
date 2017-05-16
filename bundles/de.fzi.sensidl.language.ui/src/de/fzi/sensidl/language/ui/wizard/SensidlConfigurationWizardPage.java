package de.fzi.sensidl.language.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class SensidlConfigurationWizardPage extends WizardPage{
	
	private final static String PAGE_NAME = "SensIDL Project Configuration";
	
	private SensidlProjectDTO sensIDLProjectDTO;
	private SensidlProjectWizardChangeListener sensidlChangeListener;
	
	protected SensidlConfigurationWizardPage() {
		super(PAGE_NAME);
		setTitle("SensIDL Project");
        setDescription("Configure your SensIDL Project");
        setSensIDLProjectDTO();
        setSensIDLChangeListener();
	}

	private void setSensIDLProjectDTO() {
		this.sensIDLProjectDTO = new SensidlProjectDTO();
	}
	
	private void setSensIDLChangeListener() {
		this.sensidlChangeListener = new SensidlProjectWizardChangeListener(this, this.sensIDLProjectDTO);
	}
	
	@Override
	public void createControl(Composite parent) {
        setControl(new SensidlProjectWizardComposite(parent, SWT.FILL, this.sensIDLProjectDTO, this.sensidlChangeListener));
	}
	
	@Override
    public void dispose() {
		this.sensidlChangeListener.stop();
        super.dispose();
    }
	
	public String getSensidlFileName() {
		return this.sensIDLProjectDTO.getSensidlFileName();
	}
	
}
