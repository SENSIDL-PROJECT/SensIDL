/*
* generated by Xtext
*/
package de.fzi.sensidl.language;

import de.fzi.sensidl.language.SensidlStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SensidlStandaloneSetup extends SensidlStandaloneSetupGenerated{

	public static void doSetup() {
		new SensidlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
