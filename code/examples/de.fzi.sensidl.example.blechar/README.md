#SensIDL example - Bluetooth Low Energy (BLE) Characteristics


This example-project shows how the Bluetooth Low Energy Characteristics can be declared with SensIDL. Therefore the example defines the data structure of the Bluetooth GATT characteristics.
This example shows that the SensIDL toolchain is powerful enough to handle transfer protocols like Bluetooth Low Energy. 

However, to use the generated code in mobile applications, some changes,  which refer to specific APIs, need to be done manually by the user. This is a result of the fact, that the Bluetooth GATT Profile is build hierarchically and the characteristics is only the base data element of the Bluetooth LE Service. If the implementation of the characteristics differs from the implementation, which is expected by the service, the user has to adjust it manually. This is not a task of SensIDL and therefore has to be done by the user.
