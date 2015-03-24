package de.fzi.sensidl.language.generator;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Interface für die Generatoren im SensIDL-Prototyp.
 * <p>
 * Unterscheidet sich von {@link IGenerator} insofern, dass in der
 * {@link #doGenerate(IFileSystemAccess)}-Methode keine Resource mehr
 * übergeben wird.
 * @author Dominik Werle
 */
public interface ISensidlGenerator {
	/**
	 * Starten des GEnerators
	 * @param fsa Dateizugriff für die generierten Dateien.
	 */
	void doGenerate(IFileSystemAccess fsa);
}
