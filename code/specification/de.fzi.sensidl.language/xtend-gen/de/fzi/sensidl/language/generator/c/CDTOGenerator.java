package de.fzi.sensidl.language.generator.c;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.language.generator.IDTOGenerator;
import de.fzi.sensidl.language.generator.c.DataTypes;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

/**
 * The CDTOGenerator represents a concrete  implementation
 * of @see IDTOGenerator
 */
@SuppressWarnings("all")
public abstract class CDTOGenerator implements IDTOGenerator {
  protected final static String C_EXTENSION = ".c";
  
  protected final static String MARSHAL_FILE = "DataMarshalling";
  
  protected final static String HEADER_EXTENSION = ".h";
  
  protected Resource input;
  
  protected IFileSystemAccess fsa;
  
  /**
   * Defines the constructor of CGenerator.
   * @param input
   * 			contains all model elements.
   * @param fsa
   * 			is needed to generate a file.
   */
  public CDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  /**
   * Maps to the corresponding language type.
   * @see IDTOGenerator#toTypeName(Data)
   */
  @Override
  public String toTypeName(final Data data) {
    String _switchResult = null;
    DataType _dataType = data.getDataType();
    if (_dataType != null) {
      switch (_dataType) {
        case INT8:
          _switchResult = DataTypes.SIGNED_CHAR;
          break;
        case UINT8:
          _switchResult = DataTypes.UNSIGNED_CHAR;
          break;
        case INT16:
          _switchResult = DataTypes.SIGNED_SHORT;
          break;
        case UINT16:
          _switchResult = DataTypes.UNSIGNED_SHORT;
          break;
        case INT32:
          _switchResult = DataTypes.SIGNED_LONG;
          break;
        case UINT32:
          _switchResult = DataTypes.UNSIGEND_LONG;
          break;
        case INT64:
          _switchResult = DataTypes.SIGNED_LONG_LONG;
          break;
        case UINT64:
          _switchResult = DataTypes.UNSIGNED_LONG_LONG;
          break;
        case FLOAT:
          _switchResult = DataTypes.FLOAT;
          break;
        case DOUBLE:
          _switchResult = DataTypes.DOUBLE;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
