package de.fzi.sensidl.language.generator.factory.c;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import de.fzi.sensidl.language.generator.factory.c.DataTypes;
import java.util.List;

/**
 * The CDTOGenerator represents a concrete  implementation
 * of @see IDTOGenerator
 */
@SuppressWarnings("all")
public abstract class CDTOGenerator implements IDTOGenerator {
  protected List<DataSet> dataSet;
  
  public CDTOGenerator(final List<DataSet> newDataSet) {
    this.dataSet = newDataSet;
  }
  
  /**
   * Maps to the corresponding language type.
   * @see IDTOGenerator#toTypeName(Data)
   */
  @Override
  public String toTypeName(final Data data) {
    DataType _dataType = data.getDataType();
    return DataTypes.getDataTypeBy(_dataType);
  }
}
