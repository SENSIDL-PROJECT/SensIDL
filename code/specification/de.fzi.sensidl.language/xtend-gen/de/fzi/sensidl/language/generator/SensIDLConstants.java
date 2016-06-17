package de.fzi.sensidl.language.generator;

import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * This class should provide a common place for specific sensidl constants.
 */
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
  
  public final static String MAIN_HEADER_FILE_NAME = "DTOs";
  
  public final static String JAVA_CONVERT_ALL_TO_LITTLE_ENDIAN_METHOD_NAME = "convertAllToLittleEndian";
  
  private final static String PUBLIC_IDENTIFIER = "+";
  
  private final static String PROTECTED_IDENTIFIER = "#";
  
  private final static String EMPTY_IDENTIFIER = "";
  
  private final static String PRIVATE_IDENTIFIER = "-";
  
  private final static String PUBLIC_VISIBILITY = "public";
  
  private final static String PROTECTED_VISIBILITY = "protected";
  
  private final static String EMPTY_VISIBILITY = "";
  
  private final static String PRIVATE_VISIBLITY = "private";
  
  private static HashMap<String, String> identifierToVisibility;
  
  public static String getVisibilityOf(final String visibilityIdentifier) {
    String _xblockexpression = null;
    {
      SensIDLConstants.instantiateIfNecessary();
      _xblockexpression = SensIDLConstants.identifierToVisibility.get(visibilityIdentifier);
    }
    return _xblockexpression;
  }
  
  public static String getDefaultVisibility() {
    String _xblockexpression = null;
    {
      SensIDLConstants.instantiateIfNecessary();
      _xblockexpression = SensIDLConstants.identifierToVisibility.get(SensIDLConstants.PRIVATE_IDENTIFIER);
    }
    return _xblockexpression;
  }
  
  private static HashMap<String, String> instantiateIfNecessary() {
    HashMap<String, String> _xifexpression = null;
    boolean _equals = Objects.equal(SensIDLConstants.identifierToVisibility, null);
    if (_equals) {
      HashMap<String, String> _hashMap = new HashMap<String, String>();
      final Procedure1<HashMap<String, String>> _function = new Procedure1<HashMap<String, String>>() {
        @Override
        public void apply(final HashMap<String, String> it) {
          it.put(SensIDLConstants.PUBLIC_IDENTIFIER, SensIDLConstants.PUBLIC_VISIBILITY);
          it.put(SensIDLConstants.PRIVATE_IDENTIFIER, SensIDLConstants.PRIVATE_VISIBLITY);
          it.put(SensIDLConstants.PROTECTED_IDENTIFIER, SensIDLConstants.PROTECTED_VISIBILITY);
          it.put(SensIDLConstants.EMPTY_IDENTIFIER, SensIDLConstants.EMPTY_VISIBILITY);
        }
      };
      HashMap<String, String> _doubleArrow = ObjectExtensions.<HashMap<String, String>>operator_doubleArrow(_hashMap, _function);
      _xifexpression = SensIDLConstants.identifierToVisibility = _doubleArrow;
    }
    return _xifexpression;
  }
}
