package de.fzi.sensidl.language.tests.generator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.FileDeleteStrategy;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl;
import de.fzi.sensidl.language.ui.exception.NoSidlFileException;
import de.fzi.sensidl.language.ui.handler.GenerationHandler;

/**
 * This class checks, if the generators generate just the desired files.
 * 
 * @author Max Peters
 * 
 */
public class FileGenerationTest {
	private static File					generationDirectory;
	private static Map<String, Boolean>	map;
	private static String[]				dataSets	= { "Conductor", "NeutralConductor", "Energy" };

	/**
	 * Creates or empties the test generation directory.
	 * 
	 * @throws IOException
	 */
	@BeforeClass static public void setUp() throws IOException {
		DataRepresentationPackageImpl.init();
		generationDirectory = new File("test-gen/generator");
		if (!generationDirectory.exists()) {
			generationDirectory.mkdir();
		}
		else {
			deleteGen();
		}
		map = new HashMap<String, Boolean>();
	}

	@Before public void addFiles() {
		map.put("sidlTestCode.sensidl", false);
		map.put("EMeter.txt", false);
	}

	/**
	 * test class for java generator
	 * 
	 * @throws IOException
	 * @throws NoSidlFileException
	 */
	@Test public void javaFilesGenerationTest() throws IOException, NoSidlFileException {
		for (int i = 0; i < dataSets.length; i++) {
			map.put(dataSets[i] + ".java", false);
		}
		map.put("eMeterUtility.java", false);
		GenerationHandler.generate(generationDirectory.getPath(), "resource/generator/sidlTestCode.sidl", "Java");
		checkGeneratedFiles();
	}

	/**
	 * test class for javasript generator
	 * 
	 * @throws IOException
	 * @throws NoSidlFileException
	 */
	@Test public void javascriptFilesGenerationTest() throws IOException, NoSidlFileException {
		for (int i = 0; i < dataSets.length; i++) {
			map.put(dataSets[i] + ".js", false);
		}
		GenerationHandler.generate(generationDirectory.getPath(), "resource/generator/sidlTestCode.sidl", "JavaScript");
		checkGeneratedFiles();
	}

	/**
	 * test class for c generator
	 * 
	 * @throws IOException
	 * @throws NoSidlFileException
	 */
	@Test public void CFilesGenerationTest() throws IOException, NoSidlFileException {
		for (int i = 0; i < dataSets.length; i++) {
			map.put(dataSets[i] + ".c", false);
			map.put(dataSets[i] + ".h", false);
		}
		map.put("DTOs.h", false);
		map.put("eMeterUtility.h", false);
		GenerationHandler.generate(generationDirectory.getPath(), "resource/generator/sidlTestCode.sidl", "C");
		checkGeneratedFiles();
	}

	/**
	 * test class for c# generator
	 * 
	 * @throws IOException
	 * @throws NoSidlFileException
	 */
	@Test @Ignore public void CSharpFilesGenerationTest() throws IOException {
		// not yet implemented
	}

	@After public void tearDown() throws IOException {
		deleteGen();
		map.clear();
	}

	/**
	 * Checks if the generators generated just the desired files.
	 */
	private void checkGeneratedFiles() {
		for (String file : generationDirectory.list()) {
			if (map.containsKey(file)) {
				map.put(file, true);
			}
			else {
				throw new AssertionError(file + " should not get generated");
			}
		}
		for (Entry<String, Boolean> entry : map.entrySet()) {
			if (!entry.getValue()) {
				throw new AssertionError(entry.getKey() + " is missing");
			}
		}
	}

	/**
	 * Removes all files in the test generation directory.
	 * 
	 * @throws IOException
	 */
	private static void deleteGen() throws IOException {
		for (File file : generationDirectory.listFiles()) {
			FileDeleteStrategy.FORCE.delete(file);
		}
	}
}