/*brief       Data Structure for Energy
 *
 * \type       deviceType is always 40 ("...eMeter...") for this sensor.
 * \type       recodrdType is 5 in decimal
 * \type       Power L1, measured in unit: kWh.
 * \type       Power L2, measured in unit: kWh.
 * \type       Power L3, measured in unit: kWh.
*/


typedef struct
{
	unsigned char deviceType;			// 1 byte unsigned
	unsigned char recordType;			// 1 byte unsigned
	float powerL1;						// 4 bytes float signed 
	float powerL2;						// 4 bytes float signed
	float powerL3;						// 4 bytes float signed
} Energy;
