package de.fzi.sensidl.language.generator.generationstep.filegenerationstep

import com.google.common.io.Files
import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import java.util.HashMap
import org.apache.log4j.Logger
import org.eclipse.xtext.generator.IFileSystemAccess
import de.fzi.sensidl.language.generator.SensIDLConstants

/**
 * The FileGenerationStep is a concrete subclass of the GenerationStep class. 
 * The main task of the class encapsulate the responsibility of the actual code generation.
 */
class FileGenerationStep extends GenerationStep {
	private val static logger = Logger.getLogger(FileGenerationStep)
	private val static LINE_LENGTH = 80; 
	private val static SEPARATION_STRING = ", "
	private val static UNIFIED_TAB_DISTANCE = "\t\t\t\t\t\t\t\t"
	private val static START_SYMBOL = "*"
	
	private val IFileSystemAccess fsa;
	private var HashMap<String, ArrayList<String>> fileCache;
	
	/**
	 * The constructor is used to initialize a new IFileSystemAccess-object.
	 * @param newFsa Corresponds to the IFileSystemAccess-object which is needed to generate the different files.
	 */
	new(IFileSystemAccess newFsa) {
		fsa = newFsa
		fileCache = new HashMap
	}
	
	/**
	 * @see GenerationStep#startGenerationTask()
	 */
	override startGenerationTask() {
		for (file : filesToGenerate.keySet) {
			logger.info("Start with code-generation of file " + file)
			
			insertVersioningCommentTo(file)
			
			fsa.generateFile(file, filesToGenerate.get(file))
			
			logger.info("File " + file + " was successfully generated")
		}
	}
	
	def insertVersioningCommentTo(String file) {
		val fileExtensions = createExtensions(Files.getFileExtension(file))
		
		if (extensionsAlreadyInCache(fileExtensions) == false) {		
			getAllFilesWithSameExtension(fileExtensions)
		}
		
		val fileToEdit = new StringBuilder(filesToGenerate.get(file))
		fileToEdit.insert(0, System.getProperty("line.separator"))
		fileToEdit.insert(0, getVersioningComment(fileExtensions, file))
		
		filesToGenerate.put(file, fileToEdit)
	}
	
	def extensionsAlreadyInCache(ArrayList<String> fileExtensions) {
		return this.fileCache.keySet.exists[
			cachedExtension | fileExtensions.exists[
				fileExtension | fileExtension.equals(cachedExtension)
			]
		]
	}
	
	def createExtensions(String fileExtension) {
		val editedCExtension = Files.getFileExtension(SensIDLConstants.C_EXTENSION)
		val editedHeaderExtension = Files.getFileExtension(SensIDLConstants.HEADER_EXTENSION)
		
		if (fileExtension.equals(editedCExtension) || fileExtension.equals(editedHeaderExtension)) {
			return new ArrayList<String>() => [
				add(editedCExtension)
				add(editedHeaderExtension)
			]
		}
		
		return new ArrayList<String>() => [
				add(fileExtension)
			]
	}
	
	def getUnifiedIdentifier(ArrayList<String> fileExtensions) {
		var unifiedIdentifier = ''''''
		
		for (ext : fileExtensions) {
			unifiedIdentifier += ("_" + ext)
		}
		
		unifiedIdentifier
	}
	
	def void getAllFilesWithSameExtension(ArrayList<String> fileExtensions) {	
		val files = new ArrayList<String>
		
		for (String filename : filesToGenerate.keySet) {
			if (fileExtensions.exists[fileExtension | Files.getFileExtension(filename).equals(fileExtension)]) {
				files += filename				
			}
		}
		
		this.fileCache.put(getUnifiedIdentifier(fileExtensions), files)
	}
	
	def getVersioningComment(ArrayList<String> fileExtensions, String currentFileName) {
		'''
		/*
		*File:							«currentFileName»
		*Version:						
		*Generate at:					«new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())»
		«printFiles(currentFileName, fileExtensions)»
		*/
		'''
	}
	
	def printFiles(String currentEditedFile, ArrayList<String> fileExtensions) {
		var filesToPrint = ''''''
		var counter = 1
		val files = this.fileCache.get(getUnifiedIdentifier(fileExtensions)) 
		
		filesToPrint += "*Further generated artifacts:"	+ "\t"
		
		for (currentFile : files) {
			if (!currentFile.equals(currentEditedFile)) {
				filesToPrint += currentFile
				filesToPrint += SEPARATION_STRING				
			}

			if (filesToPrint.length >= (LINE_LENGTH * counter)) {
				filesToPrint += System.getProperty("line.separator")
				filesToPrint += START_SYMBOL + UNIFIED_TAB_DISTANCE
				counter++
			}
		} 
		
		postProcessing(new StringBuilder(filesToPrint))
	}
	
	def postProcessing(StringBuilder filesToPrint) {
		val comma = ","
		
		if (!filesToPrint.toString.contains(comma)) {
			return filesToPrint
		}
		
		while (!filesToPrint.toString.endsWith(comma)) {
			filesToPrint.deleteCharAt((filesToPrint.length - 1))
		}
		filesToPrint.deleteCharAt((filesToPrint.length - 1))
		
		filesToPrint.toString
	}
}