package de.fzi.sensidl.vorto.service.java.generator;

import java.io.File;
import org.jscience.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Collection;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import org.apache.commons.io.FileUtils;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.vorto.codegen.api.Generated;
import org.eclipse.vorto.codegen.api.IGenerationResult;
import org.eclipse.vorto.codegen.api.InvocationContext;
import org.eclipse.vorto.codegen.api.IVortoCodeGenerator;
import org.eclipse.vorto.codegen.api.GenerationResultZip;
import org.eclipse.vorto.core.api.model.informationmodel.InformationModel;

import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.fzi.sensidl.vorto.transformation.util.UnitCreator;
import de.fzi.sensidl.language.generator.generationstep.DTOGenerationStep;

/**
 * 
 * @author Fabian Scheytt
 *
 */

public class SensIDLGenerator implements IVortoCodeGenerator {

	@Override
	public IGenerationResult generate(InformationModel infomodel, InvocationContext context) {
		DTOGenerationStep.createSidlFile = true;
		standaloneStartup();			
		String workingDir = setupWorkingDirectory();
		
		GenerationResultZip zipResult = new GenerationResultZip(infomodel, "SensIDL-Java");

		ResourceSet resourceSet = new ResourceSetImpl();
		URI txURI = URI.createFileURI(new File(getClass().getClassLoader().getResource("transforms/Vorto2SensIDLTransformation.qvto").getFile()).getAbsolutePath());//new File("\\transforms\\Vorto2SensIDLTransformation.qvto").getAbsolutePath());
		
		TransformationExecutor executor = new TransformationExecutor(txURI);

		//Prepare input & output objects
		EList<EObject> inObjects = new BasicEList<EObject>();
		inObjects.add(infomodel.eContents().get(1).eContainer());

		ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output = new BasicModelExtent();

		ExecutionContextImpl transformationContext = new ExecutionContextImpl();
		transformationContext.setConfigProperty("keepModeling", true);

		//point logger to console
		Log log = new WriterLog(new OutputStreamWriter(System.out));
		transformationContext.setLog(log);

		// transform information model to sensidl model (input to output):
		ExecutionDiagnostic result = executor.execute(transformationContext, input, output);

		if (result.getSeverity() == result.OK) {			
			//create sidl file 
			URI modelURI = URI.createFileURI(new File(workingDir + "\\"+ infomodel.getName() +".sidl").getAbsolutePath());
			
			// get sensidl model resource form BasicModelExtend
			Resource resource = resourceSet.createResource(modelURI);
			resource.getContents().addAll(output.getContents());
			
			//invoke SensIDL Java generator with the transformed instance 
			try {
				de.fzi.sensidl.language.ui.handler.GenerationHandler.generate(workingDir + "\\sidl-gen", workingDir, "Java", resource);
			} catch (Exception e) {
				zipResult.write(new Generated("Error.txt", "/", e.getMessage()));
				return zipResult;
			}
			//append generated Files to the resulting zip file
			appendGeneratedFiles(zipResult,workingDir+"\\sidl-gen");
		} else 
			zipResult.write(new Generated("Error.txt", "/", "There has been a transformation Error! No code could be generated.\n"));		
		
		return zipResult;
	}

	/**
	 * Appends all Files that are located in the given path to the given {@link GenerationResultZip}
	 * @param zippi zip to add files
	 * @param path path to add files from
	 */
	private void appendGeneratedFiles(GenerationResultZip zippi, String path) {
		File dir= new File(path);
		if(dir == null || !dir.exists() || !dir.isDirectory())
			return;
		
		Collection<File> files = FileUtils.listFiles(dir, null, true);
		for (File file : files){
			String read = "";
			try {
				read = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())),StandardCharsets.UTF_8);
			} catch (IOException e) {
				//Skip Invalid File
			}
			zippi.write(new Generated(file.getName(), "/SensIDL-gen", read));
		}		
	}

	/**
	 * Executes procedures needed for standalone qvto transformation
	 */
	private void standaloneStartup() {
		// Init Utils
		TransformationExecutor.BlackboxRegistry.INSTANCE.registerModule(UnitCreator.class, "trans.util.UnitCreator",
						"trans.util");
		initPackages();		
	}

	/**
	 * Registers some packages for standalone execution
	 */
	private void initPackages() {
		// Setup emf Standalone and register XbasePackage
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		org.eclipse.xtext.xbase.XbasePackage.eINSTANCE.eClass();

		// register SensIDL Package
		de.fzi.sensidl.design.sensidl.sensidlPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Prepares a clean working directory.
	 * @return prepared working directory
	 */
	private String setupWorkingDirectory() {
		String dir = getFilePath()+"\\tmp";
		try {
		//Clear generationFolder
		if(new File(dir).exists())
			FileUtils.cleanDirectory(new File(dir));
		} catch (IOException e) {
			//return the directory anyway
		}
		return dir;
	}
	
	/**
	 * Gets the execution path of the application
	 * @return execution path
	 */
	private String getFilePath() {
		try {
			return new File(
					SensIDLGenerator.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath())
							.getAbsolutePath();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "empty";
	}

	@Override
	public String getServiceKey() {
		return "SensIDL";
	}

}
