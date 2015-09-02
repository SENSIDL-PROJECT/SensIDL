/*brief       Data Structure for Phase L1, L2, L3
 *
 * \type       deviceType is always 40 ("...eMeter...") for this sensor.
 * \type       recordType is 1 or 2 or 3
 * \type       voltage, measured in unit: Vrms.
 * \type       current, measured in unit: Arms.
 * \type       power, measured in unit: Wrms.
 * \type       powerFactor (No explanation given)
 * \type       identifier, Identifier to correlate measurements for different conductors. Measure in unit: Dimensionless.
*/

typedef struct
{
	unsigned char deviceType;			// 1 byte unsigned
	unsigned char recordType;			// 1 byte unsigned
	short voltage;						// 2 bytes signed 
	float current;						// 4 bytes float signed
	float power;						// 4 bytes float signed
	char powerFactor;					// 1 byte signed
	char identifier;					// 1 byte signed
} Phase;
