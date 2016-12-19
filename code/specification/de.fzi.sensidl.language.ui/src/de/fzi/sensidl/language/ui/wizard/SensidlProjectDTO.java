package de.fzi.sensidl.language.ui.wizard;

import org.eclipse.core.databinding.observable.value.WritableValue;

public class SensidlProjectDTO {

	private WritableValue sensidlFileName = new WritableValue();
	
	public void setSensidlFileName(String sensidlFileName) {
		
		this.sensidlFileName.setValue(sensidlFileName);
		
	}
	
	public String getSensidlFileName() {
		
		return (String) this.sensidlFileName.getValue();
		
	}
	
	public boolean isEmpty() {
		
		return sensidlFileName.equals("");
		
	}
	
}
