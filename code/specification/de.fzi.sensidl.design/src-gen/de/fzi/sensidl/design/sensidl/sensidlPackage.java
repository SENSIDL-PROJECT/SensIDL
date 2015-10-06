/**
 */
package de.fzi.sensidl.design.sensidl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p>
 * Main package for SensIDL.
 * </p>
 * <!-- end-model-doc -->
 * @see de.fzi.sensidl.design.sensidl.sensidlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface sensidlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensidl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fzi.de/sensidl/design/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.fzi.sensidl.design";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	sensidlPackage eINSTANCE = de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.impl.IdentifiableElementImpl
	 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.impl.NamedElementImpl
	 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl <em>Sensor Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl
	 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getSensorInterface()
	 * @generated
	 */
	int SENSOR_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INTERFACE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INTERFACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INTERFACE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Encoding Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INTERFACE__ENCODING_SETTINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INTERFACE__DATA_DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INTERFACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INTERFACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl <em>Encoding Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl
	 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getEncodingSettings()
	 * @generated
	 */
	int ENCODING_SETTINGS = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_SETTINGS__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sensor Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_SETTINGS__SENSOR_INTERFACE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_SETTINGS__CODING = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Endianness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_SETTINGS__ENDIANNESS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_SETTINGS__ALIGNMENT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Encoding Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_SETTINGS_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Encoding Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_SETTINGS_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.Coding <em>Coding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.Coding
	 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getCoding()
	 * @generated
	 */
	int CODING = 4;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.Endianness <em>Endianness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.Endianness
	 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getEndianness()
	 * @generated
	 */
	int ENDIANNESS = 5;

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see de.fzi.sensidl.design.sensidl.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.IdentifiableElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see de.fzi.sensidl.design.sensidl.IdentifiableElement#getID()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_ID();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.fzi.sensidl.design.sensidl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fzi.sensidl.design.sensidl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.fzi.sensidl.design.sensidl.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.SensorInterface <em>Sensor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Interface</em>'.
	 * @see de.fzi.sensidl.design.sensidl.SensorInterface
	 * @generated
	 */
	EClass getSensorInterface();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getEncodingSettings <em>Encoding Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encoding Settings</em>'.
	 * @see de.fzi.sensidl.design.sensidl.SensorInterface#getEncodingSettings()
	 * @see #getSensorInterface()
	 * @generated
	 */
	EReference getSensorInterface_EncodingSettings();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Description</em>'.
	 * @see de.fzi.sensidl.design.sensidl.SensorInterface#getDataDescription()
	 * @see #getSensorInterface()
	 * @generated
	 */
	EReference getSensorInterface_DataDescription();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.EncodingSettings <em>Encoding Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding Settings</em>'.
	 * @see de.fzi.sensidl.design.sensidl.EncodingSettings
	 * @generated
	 */
	EClass getEncodingSettings();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getSensorInterface <em>Sensor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor Interface</em>'.
	 * @see de.fzi.sensidl.design.sensidl.EncodingSettings#getSensorInterface()
	 * @see #getEncodingSettings()
	 * @generated
	 */
	EReference getEncodingSettings_SensorInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getCoding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coding</em>'.
	 * @see de.fzi.sensidl.design.sensidl.EncodingSettings#getCoding()
	 * @see #getEncodingSettings()
	 * @generated
	 */
	EAttribute getEncodingSettings_Coding();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getEndianness <em>Endianness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endianness</em>'.
	 * @see de.fzi.sensidl.design.sensidl.EncodingSettings#getEndianness()
	 * @see #getEncodingSettings()
	 * @generated
	 */
	EAttribute getEncodingSettings_Endianness();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see de.fzi.sensidl.design.sensidl.EncodingSettings#getAlignment()
	 * @see #getEncodingSettings()
	 * @generated
	 */
	EAttribute getEncodingSettings_Alignment();

	/**
	 * Returns the meta object for enum '{@link de.fzi.sensidl.design.sensidl.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coding</em>'.
	 * @see de.fzi.sensidl.design.sensidl.Coding
	 * @generated
	 */
	EEnum getCoding();

	/**
	 * Returns the meta object for enum '{@link de.fzi.sensidl.design.sensidl.Endianness <em>Endianness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endianness</em>'.
	 * @see de.fzi.sensidl.design.sensidl.Endianness
	 * @generated
	 */
	EEnum getEndianness();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	sensidlFactory getsensidlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.impl.IdentifiableElementImpl
		 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_ID();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.impl.NamedElementImpl
		 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl <em>Sensor Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl
		 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getSensorInterface()
		 * @generated
		 */
		EClass SENSOR_INTERFACE = eINSTANCE.getSensorInterface();

		/**
		 * The meta object literal for the '<em><b>Encoding Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_INTERFACE__ENCODING_SETTINGS = eINSTANCE.getSensorInterface_EncodingSettings();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_INTERFACE__DATA_DESCRIPTION = eINSTANCE.getSensorInterface_DataDescription();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl <em>Encoding Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl
		 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getEncodingSettings()
		 * @generated
		 */
		EClass ENCODING_SETTINGS = eINSTANCE.getEncodingSettings();

		/**
		 * The meta object literal for the '<em><b>Sensor Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCODING_SETTINGS__SENSOR_INTERFACE = eINSTANCE.getEncodingSettings_SensorInterface();

		/**
		 * The meta object literal for the '<em><b>Coding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_SETTINGS__CODING = eINSTANCE.getEncodingSettings_Coding();

		/**
		 * The meta object literal for the '<em><b>Endianness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_SETTINGS__ENDIANNESS = eINSTANCE.getEncodingSettings_Endianness();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_SETTINGS__ALIGNMENT = eINSTANCE.getEncodingSettings_Alignment();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.Coding <em>Coding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.Coding
		 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getCoding()
		 * @generated
		 */
		EEnum CODING = eINSTANCE.getCoding();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.Endianness <em>Endianness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.Endianness
		 * @see de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl#getEndianness()
		 * @generated
		 */
		EEnum ENDIANNESS = eINSTANCE.getEndianness();

	}

} //sensidlPackage
