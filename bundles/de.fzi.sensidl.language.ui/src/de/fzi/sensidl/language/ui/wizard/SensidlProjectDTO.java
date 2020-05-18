package de.fzi.sensidl.language.ui.wizard;

import java.util.Optional;

import org.eclipse.core.databinding.observable.value.WritableValue;

public class SensidlProjectDTO {

	private WritableValue<String> sensidlFileName = new WritableValue<>();
	
	public void setSensidlFileName(String sensidlFileName) {
		
		this.sensidlFileName.setValue(sensidlFileName);
		
	}
	
	public String getSensidlFileName() {
		
		return (String) this.sensidlFileName.getValue();
		
	}
	
	public boolean isEmpty() {
		return Optional.ofNullable(sensidlFileName.getValue()).map(v -> "".equals(v)).orElse(true);
	}
	
}
