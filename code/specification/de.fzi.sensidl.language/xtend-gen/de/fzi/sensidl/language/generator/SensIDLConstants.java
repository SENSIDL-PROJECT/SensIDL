package de.fzi.sensidl.language.generator;

@SuppressWarnings("all")
public class SensIDLConstants {
  public enum GenerationLanguage {
    NONE,
    
    ALL,
    
    JAVA,
    
    JAVA_PLUGIN_PROJECT,
    
    JAVASCRIPT,
    
    CSHARP,
    
    C,
    
    PLAINTEXT;
  }
  
  public final static String C_EXTENSION = ".c";
  
  public final static String MARSHAL_FILE = "DataMarshalling";
  
  public final static String HEADER_EXTENSION = ".h";
  
  public final static String CSharp_EXTENSION = ".cs";
  
  public final static String JAVA_EXTENSION = ".java";
  
  public final static String JAVASCRIPT_EXTENSION = ".js";
  
  public final static String UTILITY_CLASS_NAME = "Utility";
  
  public final static String LINEAR_CONVERSION_METHOD_NAME = "linearConversion";
  
  public final static String LINEAR_CONVERSION_WITH_INTERVAL_METHOD_NAME = "linearConversionWithInterval";
}
