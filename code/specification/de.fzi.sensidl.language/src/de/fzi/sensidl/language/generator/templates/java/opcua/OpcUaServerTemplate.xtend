package de.fzi.sensidl.language.generator.templates.java.opcua

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.language.generator.templates.ITemplate
import de.fzi.sensidl.language.generator.templates.EclipsePuplicLicenseTemplate

class OpcUaServerTemplate extends ITemplate<SensorInterface> {
	
	private static val CLASS_NAME_SUFFIX = "OpcUaServer"
	private static val DEFAULT_PORT = 12686
	
	private val String packagePrefix
	
	/**
	 * The constructor.
	 * @param newElement - SensorInterface-element which is needed for the code-generation.
	 */
	new(SensorInterface newElement, String newPackagePrefix) {
		
		super(newElement)
		
		packagePrefix = newPackagePrefix
		
	}
	
	/**
	 * Generates the OPC UA server code.
	 * @see ITemplate<T>#getCode()
	 */
	override getCode() { 
		'''
		«EclipsePuplicLicenseTemplate.text»
		
		package «packagePrefix»«OpcUaUtil.getDefaultPackageName(this.element)»;
		
		import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
		import org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig;
		import org.eclipse.milo.opcua.stack.core.application.DefaultCertificateManager;
		import org.eclipse.milo.opcua.stack.core.application.DefaultCertificateValidator;
			
		import static com.google.common.collect.Lists.newArrayList;
		import static com.google.common.io.Files.createTempDir;
		import static java.util.Collections.singletonList;
		import static org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig.USER_TOKEN_POLICY_ANONYMOUS;
			
		import java.util.Scanner;
			
		public class «getClassName(this.element)» {
		
			private final static String BINDING_ADDRESS = "localhost";	
			private final static int PORT = «defaultPort»;
			private final static String SERVER_NAME = "«getDefaultName(this.element)»";
			private final static String URN = "«OpcUaUtil.getDefaultServerUrn(this.element)»";
			private final static String STOP_TOKEN = "exit";
			
			private final OpcUaServer server;
		
			public static void main(String[] args) {
					
				«getClassName(this.element)» «getObjectName(this.element)» = new «getClassName(this.element)»();
				«getObjectName(this.element)».start();
				
				System.out.println("\n");
				System.out.println("Hit " + "\'" + STOP_TOKEN + "\'" + " to shutdown the server.");
				System.out.println("\n");
				
				Scanner userInput = new Scanner(System.in);
				while (!userInput.next().equals(STOP_TOKEN)) {
					
				}
				
				userInput.close();
				
				«getObjectName(this.element)».shutdown();
			}
		
			public «getClassName(this.element)»() {
				OpcUaServerConfig serverConfig = OpcUaServerConfig.builder()
						.setApplicationUri(URN).setBindAddresses(newArrayList(BINDING_ADDRESS))
						.setBindPort(PORT).setCertificateManager(new DefaultCertificateManager())
						.setCertificateValidator(new DefaultCertificateValidator(createTempDir())).setServerName(SERVER_NAME)
						.setUserTokenPolicies(singletonList(USER_TOKEN_POLICY_ANONYMOUS))
						.build();
		
				server = new OpcUaServer(serverConfig);
		
				server.getNamespaceManager().registerAndAdd(«OpcUaUtil.getServerNamespaceName(this.element)».NAMESPACE_URI,
						idx -> new «OpcUaUtil.getServerNamespaceName(this.element)»(server, idx));
			}
		
			public void shutdown() {
				
				server.shutdown();
				
				System.out.println("Server has been successfully stopped.");
			}
			
			public void start() {
				server.startup();
			}
		}
		'''
	}
	
	private def getDefaultName(SensorInterface sensorInterface) {
		sensorInterface.name
	}
	
	private def getClassName(SensorInterface sensorInterface) {
		sensorInterface.name.toFirstUpper + CLASS_NAME_SUFFIX
	}
	
	private def getObjectName(SensorInterface sensorInterface) {
		sensorInterface.name.toFirstLower + CLASS_NAME_SUFFIX
	}
	
	private def getDefaultPort() {
		DEFAULT_PORT
	}
	
	/**
	 * @see ITemplate<T>#getFileName()
	 */
	override getFileName() {
		
		this.element.name.toFirstUpper + CLASS_NAME_SUFFIX
		
	}
	
}