package de.fzi.sensidl.language.tests.generation;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.FileDeleteStrategy;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl;
import de.fzi.sensidl.language.ui.exception.NoSidlFileException;
import de.fzi.sensidl.language.ui.handler.GenerationHandler;

public class FileGenerationTest {
	private static File			testGenDir;
	static Map<String, Boolean>	map;
	private static String[]		dataSets			= { "Conductor", "NeutralConductor", "Energy" };
	private static String		sensorInterfaceName	= "EMeter";

	@BeforeClass static public void setUp() throws IOException {
		DataRepresentationPackageImpl.init();
		testGenDir = new File("test-gen/semantics");
		if (!testGenDir.exists()) {
			testGenDir.mkdir();
		}
		else {
			deleteGen();
		}
		map = new HashMap<String, Boolean>();
	}

	@Test public void javaFilesGenerationTest() throws IOException, NoSidlFileException {
		for (int i = 0; i < dataSets.length; i++) {
			map.put(dataSets[i] + ".java", false);
		}
		GenerationHandler.generate(testGenDir.getPath(), "resource/semantic/sidlTestCode.sidl", "Java");
		for (String file : testGenDir.list()) {
			if (map.containsKey(file)) {
				map.put(file, true);
			}
			else if (checkFile(file, "sidlTestCode")) {}
			else {
				throw new AssertionError(file + " should not get generated");
			}
		}
		for (Entry<String, Boolean> entry : map.entrySet()) {
			Assert.assertTrue(entry.getValue());
		}
		Assert.assertTrue(containsTextAndSensidl("sidlTestCode"));
	}

	@Test public void javascriptFilesGenerationTest() throws IOException, NoSidlFileException {
		boolean containsJSFile = false;
		GenerationHandler.generate(testGenDir.getPath(), "resource/semantic/sidlTestCode.sidl", "JavaScript");
		for (String file : testGenDir.list()) {
			if (file.equals(sensorInterfaceName + "v1.js")) {
				containsJSFile = true;
			}
			else if (checkFile(file, "sidlTestCode")) {}
			else {
				throw new AssertionError(file + " should not get generated");
			}
		}
		Assert.assertTrue(containsJSFile);
		Assert.assertTrue(containsTextAndSensidl("sidlTestCode"));
	}

	@Test public void CFilesGenerationTest() throws IOException, NoSidlFileException {
		for (int i = 0; i < dataSets.length; i++) {
			map.put(dataSets[i] + ".c", false);
			map.put(dataSets[i] + ".h", false);
		}
		GenerationHandler.generate(testGenDir.getPath(), "resource/semantic/sidlTestCode.sidl", "C");
		for (String file : testGenDir.list()) {
			if (map.containsKey(file)) {
				map.put(file, true);
			}
			else if (checkFile(file, "sidlTestCode")) {}
			else {
				throw new AssertionError(file + " should not get generated");
			}
		}
		for (Entry<String, Boolean> entry : map.entrySet()) {
			Assert.assertTrue(entry.getValue());
		}
		Assert.assertTrue(containsTextAndSensidl("sidlTestCode"));
	}

	@Test @Ignore public void CSharpFilesGenerationTest() throws IOException {
		// not yet implemented
	}

	@After public void tearDown() throws IOException {
		deleteGen();
		map.clear();
	}

	private boolean checkFile(String file, String sidlFileName) {
		if (file.equals(sensorInterfaceName + ".txt")) {
			return true;
		}
		else if (file.equals(sidlFileName + ".sensidl")) {
			return true;
		}
		else
			return false;
	}

	private boolean containsTextAndSensidl(String sidlFileName) {
		boolean containsText = false;
		boolean containsSensidl = false;
		for (String file : testGenDir.list()) {
			if (file.equals(sensorInterfaceName + ".txt")) {
				containsText = true;
			}
			else if (file.equals(sidlFileName + ".sensidl")) {
				containsSensidl = true;
			}
		}
		return containsText & containsSensidl;
	}

	private static void deleteGen() throws IOException {
		for (File file : testGenDir.listFiles()) {
			FileDeleteStrategy.FORCE.delete(file);
		}
	}
}