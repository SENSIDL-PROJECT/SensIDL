package de.fzi.sensidl.language.ui.wizard;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class SensidlProjectWizardComposite extends Composite {

	private Text txtSensidlFileName;
	private IChangeListener sensidlProjectStatusListener;
	private AggregateValidationStatus aggregatedStatus;
	
	public SensidlProjectWizardComposite(Composite parent, int style, SensidlProjectDTO sensidlProjectDTO, IChangeListener sensidlProjectStatusListener) {
		super(parent, style);
		
		this.sensidlProjectStatusListener = sensidlProjectStatusListener;
		
		setLayout(new GridLayout(1, false));
		
		Group grp = new Group(this, SWT.NONE);
		grp.setLayout(new GridLayout(2, false));
		GridData gd_grp = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_grp.minimumHeight = 150;
		gd_grp.heightHint = 156;
		grp.setLayoutData(gd_grp);
		grp.setText("SensIDL Project Settings");
		
		Label lblSensidlFileName = new Label(grp, SWT.NONE);
		lblSensidlFileName.setText("SensIDL file name:");
		
		txtSensidlFileName = new Text(grp, SWT.BORDER);
		txtSensidlFileName.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		
		createDataBindings(sensidlProjectDTO);
	}
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	protected void createDataBindings(SensidlProjectDTO sensidlProjectDTO) {
		DataBindingContext bindingContext = new DataBindingContext();
		
		UpdateValueStrategy strategyAtomicStringToModel = new UpdateValueStrategy();
		strategyAtomicStringToModel.setAfterGetValidator(new NonEmptyStringValidator());
		UpdateValueStrategy strategyAtomicStringToTarget = new UpdateValueStrategy(); 
		
		IObservableValue observeTextTxtSensidlFileNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtSensidlFileName);
		IObservableValue atomicValidatedProjectName = new WritableValue(null, String.class);
		bindingContext.bindValue(observeTextTxtSensidlFileNameObserveWidget, atomicValidatedProjectName, strategyAtomicStringToModel, strategyAtomicStringToTarget);
		
		IObservableValue model = BeanProperties.value("sensidlFileName").observe(sensidlProjectDTO);
		bindingContext.bindValue(observeTextTxtSensidlFileNameObserveWidget, model);
		
		aggregatedStatus = new AggregateValidationStatus(bindingContext, AggregateValidationStatus.MAX_SEVERITY);
		aggregatedStatus.addChangeListener(sensidlProjectStatusListener);
	}
	
	@Override
	public void dispose() {
		if (aggregatedStatus != null) {
			aggregatedStatus.removeChangeListener(sensidlProjectStatusListener);
		}
		super.dispose();
	}
	
	private class NonEmptyStringValidator implements IValidator {

		@Override
		public IStatus validate(Object value) {
			if (!(value instanceof String)) {
				return new Status(IStatus.ERROR, "de.fzi.sensidl.language.ui", "The value must be a string.");
			}
			
			String valueAsString = (String) value;
			
			if (isNullOrEmpty(valueAsString)) {
				return new Status(IStatus.ERROR, "de.fzi.sensidl.language.ui", "The value must not be empty.");
			}

			return Status.OK_STATUS;
		}
		
		private boolean isNullOrEmpty(String value) {
			
			return value == null || value.isEmpty();
			
		}
		
	}
	
}
