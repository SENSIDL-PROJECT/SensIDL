package de.fzi.sensidl.generator.templates.java.opcua

import de.fzi.sensidl.generator.templates.ITemplate
import de.fzi.sensidl.design.sensidl.SensorInterface
import java.util.ArrayList
import java.util.List
import de.fzi.sensidl.generator.templates.EclipsePuplicLicenseTemplate

class OpcUaDataSetInterfaceTemplate extends ITemplate<SensorInterface> {
	
	public static val DEFAULT_KEYWORD = "default";
	
	val List<String> signatures;
	val String packagePrefix
	
	/**
	 * The constructor.
	 */
	new(SensorInterface newElement, String newPackagePrefix) {
		
		super(newElement)
		
		packagePrefix = newPackagePrefix
		
		signatures = new ArrayList => [
		
			add("public String getObjectTypeName();");
			add("public NodeId getObjectTypeNodeId();");
			add("public String getObjectName();");
			add("public NodeId getObjectNodeId();");
			add("public String getDescription();");
			add(DEFAULT_KEYWORD + " List<" + OpcUaUtil.getDefaultInterfaceName(this.element) + "> getSubtypes() {\n\treturn null;\n};");
			add(DEFAULT_KEYWORD + " Object[][] getVariables() {\n\treturn null;\n};");
			
		]
		
	}
	
	/**
	 * Generates an java-interface. The interface is used to register all implementers as OPC UA 
	 * nodes in the OPC UA namespace.
	 * @see ITemplate<T>#getCode()
	 */
	override getCode() {
		
		'''
			«EclipsePuplicLicenseTemplate.text»
			
			package «packagePrefix»«OpcUaUtil.getDefaultPackageName(this.element)»;
			
			import java.util.List;
			
			import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
			
			public interface «OpcUaUtil.getDefaultInterfaceName(this.element)» {
				
				«printAllSignatures»
				
			}
		'''
		
	}
	
	private def printAllSignatures() {
		
		val signatureBlock = new StringBuilder	
		
		signatures.forEach[signature | 
			
			signatureBlock.append(signature + System.getProperty("line.separator"))
			signatureBlock.append(System.getProperty("line.separator"))
			
		]
		
		signatureBlock.toString
		
	}
	
	override getFileName() {
		
		OpcUaUtil.getDefaultInterfaceName(this.element).toString

	}

}
