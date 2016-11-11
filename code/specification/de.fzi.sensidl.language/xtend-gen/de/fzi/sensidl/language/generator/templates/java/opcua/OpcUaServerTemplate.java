package de.fzi.sensidl.language.generator.templates.java.opcua;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.language.generator.templates.EPLicense;
import de.fzi.sensidl.language.generator.templates.ITemplate;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class OpcUaServerTemplate extends ITemplate<SensorInterface> {
  private final static String CLASS_NAME_SUFFIX = "OpcUaServer";
  
  private final static int DEFAULT_PORT = 12686;
  
  /**
   * The constructor.
   * @param newElement - SensorInterface-element which is needed for the code-generation.
   */
  public OpcUaServerTemplate(final SensorInterface newElement) {
    super(newElement);
  }
  
  /**
   * Generates the OPC UA server code.
   * @see ITemplate<T>#getCode()
   */
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _text = EPLicense.getText();
    _builder.append(_text, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package ");
    String _defaultPackageName = OpcUaUtil.getDefaultPackageName(this.element);
    _builder.append(_defaultPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.sdk.server.OpcUaServer;");
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig;");
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.stack.core.application.DefaultCertificateManager;");
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.stack.core.application.DefaultCertificateValidator;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("import static com.google.common.collect.Lists.newArrayList;");
    _builder.newLine();
    _builder.append("import static com.google.common.io.Files.createTempDir;");
    _builder.newLine();
    _builder.append("import static java.util.Collections.singletonList;");
    _builder.newLine();
    _builder.append("import static org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig.USER_TOKEN_POLICY_ANONYMOUS;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("import java.util.Scanner;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.getClassName(this.element);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final static String BINDING_ADDRESS = \"localhost\";\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final static int PORT = ");
    int _defaultPort = this.getDefaultPort();
    _builder.append(_defaultPort, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private final static String SERVER_NAME = \"");
    String _defaultName = this.getDefaultName(this.element);
    _builder.append(_defaultName, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private final static String URN = \"");
    CharSequence _defaultServerUrn = OpcUaUtil.getDefaultServerUrn(this.element);
    _builder.append(_defaultServerUrn, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private final static String STOP_TOKEN = \"exit\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final OpcUaServer server;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    String _className_1 = this.getClassName(this.element);
    _builder.append(_className_1, "\t\t");
    _builder.append(" ");
    String _objectName = this.getObjectName(this.element);
    _builder.append(_objectName, "\t\t");
    _builder.append(" = new ");
    String _className_2 = this.getClassName(this.element);
    _builder.append(_className_2, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _objectName_1 = this.getObjectName(this.element);
    _builder.append(_objectName_1, "\t\t");
    _builder.append(".start();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"\\n\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Hit \" + \"\\\'\" + STOP_TOKEN + \"\\\'\" + \" to shutdown the server.\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"\\n\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Scanner userInput = new Scanner(System.in);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (!userInput.next().equals(STOP_TOKEN)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("userInput.close();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    String _objectName_2 = this.getObjectName(this.element);
    _builder.append(_objectName_2, "\t\t");
    _builder.append(".shutdown();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _className_3 = this.getClassName(this.element);
    _builder.append(_className_3, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("OpcUaServerConfig serverConfig = OpcUaServerConfig.builder()");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".setApplicationUri(URN).setBindAddresses(newArrayList(BINDING_ADDRESS))");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".setBindPort(PORT).setCertificateManager(new DefaultCertificateManager())");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".setCertificateValidator(new DefaultCertificateValidator(createTempDir())).setServerName(SERVER_NAME)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".setUserTokenPolicies(singletonList(USER_TOKEN_POLICY_ANONYMOUS))");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".build();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("server = new OpcUaServer(serverConfig);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("server.getNamespaceManager().registerAndAdd(");
    String _serverNamespaceName = OpcUaUtil.getServerNamespaceName(this.element);
    _builder.append(_serverNamespaceName, "\t\t");
    _builder.append(".NAMESPACE_URI,");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("idx -> new ");
    String _serverNamespaceName_1 = OpcUaUtil.getServerNamespaceName(this.element);
    _builder.append(_serverNamespaceName_1, "\t\t\t\t");
    _builder.append("(server, idx));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void shutdown() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("server.shutdown();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Server has been successfully stopped.\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("server.startup();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private String getDefaultName(final SensorInterface sensorInterface) {
    return sensorInterface.getName();
  }
  
  private String getClassName(final SensorInterface sensorInterface) {
    String _name = sensorInterface.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + OpcUaServerTemplate.CLASS_NAME_SUFFIX);
  }
  
  private String getObjectName(final SensorInterface sensorInterface) {
    String _name = sensorInterface.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return (_firstLower + OpcUaServerTemplate.CLASS_NAME_SUFFIX);
  }
  
  private int getDefaultPort() {
    return OpcUaServerTemplate.DEFAULT_PORT;
  }
  
  /**
   * @see ITemplate<T>#getFileName()
   */
  @Override
  public String getFileName() {
    String _name = this.element.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + OpcUaServerTemplate.CLASS_NAME_SUFFIX);
  }
}
