package de.fzi.sensidl.language.generator

import java.io.ByteArrayOutputStream
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Helper class to allow easy persisting of ecore models.
 * 
 * @author Dominik Werle
 */
class EcorePersistenceHelper {
	/**
	 * Persistieren des Modells mit XMI
	 */
	public static def void persistEcoreModel(EObject eObject, URI fileName, IFileSystemAccess fsa) {
		val registry = Resource.Factory.Registry.INSTANCE
		val extensionToFactoryMap = registry.extensionToFactoryMap
		extensionToFactoryMap.put(fileName.fileExtension, new XMIResourceFactoryImpl)
		
		
		val outResourceSet = new ResourceSetImpl
		val outResource = outResourceSet.createResource(
			fileName)
			
		outResource.contents.add(eObject)
		
		val outBuffer = new ByteArrayOutputStream
		outResource.save(outBuffer, Collections.EMPTY_MAP)
		fsa.generateFile(fileName.toFileString, outBuffer.toString)		
	}
}