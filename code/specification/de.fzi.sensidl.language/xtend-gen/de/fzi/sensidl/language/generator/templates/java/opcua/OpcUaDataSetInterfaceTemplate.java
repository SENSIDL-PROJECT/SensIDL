package de.fzi.sensidl.language.generator.templates.java.opcua;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.language.generator.templates.EclipsePuplicLicenseTemplate;
import de.fzi.sensidl.language.generator.templates.ITemplate;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OpcUaDataSetInterfaceTemplate extends ITemplate<SensorInterface> {
  public final static String DEFAULT_KEYWORD = "default";
  
  private final List<String> signatures;
  
  private final String packagePrefix;
  
  /**
   * The constructor.
   */
  public OpcUaDataSetInterfaceTemplate(final SensorInterface newElement, final String newPackagePrefix) {
    super(newElement);
    this.packagePrefix = newPackagePrefix;
    ArrayList<String> _arrayList = new ArrayList<String>();
    final Procedure1<ArrayList<String>> _function = new Procedure1<ArrayList<String>>() {
      @Override
      public void apply(final ArrayList<String> it) {
        it.add("public String getObjectTypeName();");
        it.add("public NodeId getObjectTypeNodeId();");
        it.add("public String getObjectName();");
        it.add("public NodeId getObjectNodeId();");
        it.add("public String getDescription();");
        CharSequence _defaultInterfaceName = OpcUaUtil.getDefaultInterfaceName(OpcUaDataSetInterfaceTemplate.this.element);
        String _plus = ((OpcUaDataSetInterfaceTemplate.DEFAULT_KEYWORD + " List<") + _defaultInterfaceName);
        String _plus_1 = (_plus + "> getSubtypes() {\n\treturn null;\n};");
        it.add(_plus_1);
        it.add((OpcUaDataSetInterfaceTemplate.DEFAULT_KEYWORD + " Object[][] getVariables() {\n\treturn null;\n};"));
      }
    };
    ArrayList<String> _doubleArrow = ObjectExtensions.<ArrayList<String>>operator_doubleArrow(_arrayList, _function);
    this.signatures = _doubleArrow;
  }
  
  /**
   * Generates an java-interface. The interface is used to register all implementers as OPC UA
   * nodes in the OPC UA namespace.
   * @see ITemplate<T>#getCode()
   */
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _text = EclipsePuplicLicenseTemplate.getText();
    _builder.append(_text, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(this.packagePrefix, "");
    String _defaultPackageName = OpcUaUtil.getDefaultPackageName(this.element);
    _builder.append(_defaultPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface ");
    CharSequence _defaultInterfaceName = OpcUaUtil.getDefaultInterfaceName(this.element);
    _builder.append(_defaultInterfaceName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _printAllSignatures = this.printAllSignatures();
    _builder.append(_printAllSignatures, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private String printAllSignatures() {
    String _xblockexpression = null;
    {
      final StringBuilder signatureBlock = new StringBuilder();
      final Consumer<String> _function = new Consumer<String>() {
        @Override
        public void accept(final String signature) {
          String _property = System.getProperty("line.separator");
          String _plus = (signature + _property);
          signatureBlock.append(_plus);
          String _property_1 = System.getProperty("line.separator");
          signatureBlock.append(_property_1);
        }
      };
      this.signatures.forEach(_function);
      _xblockexpression = signatureBlock.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String getFileName() {
    CharSequence _defaultInterfaceName = OpcUaUtil.getDefaultInterfaceName(this.element);
    return _defaultInterfaceName.toString();
  }
}
