/*brief       Data Structure for Neutral Conductor
 *
 * \type       deviceType is always 40 ("...eMeter...") for this sensor.
 * \type       recordType is 4
 * \type       reserved is 4 bytes
 * \type       current, measured in unit: Arms.
 * \type       reserved1 is 4 bytes
 * \type       powerFactor (No explanation given)
 * \type       identifier, Identifier to correlate measurements for different conductors. Measure in unit: Dimensionless.
*/

typedef struct
{
	unsigned char deviceType;			// 1 byte unsigned
	unsigned char recordType;			// 1 byte unsigned
	short reserved;						// 2 bytes signed 
	float current;						// 4 bytes float signed
	float reserved1;					// 4 bytes float signed
	char powerFactor;					// 1 byte signed
	char identifier;					// 1 byte signed
} NeutralConductor;
