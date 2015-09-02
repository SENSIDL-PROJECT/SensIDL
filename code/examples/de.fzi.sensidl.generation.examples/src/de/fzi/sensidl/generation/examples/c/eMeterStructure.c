/*brief
 *
 * eMeterstructurePhase.c contains the data structure of phases L1, L2, L3
 * eMeterStructureNeutralConductor.c contains the data structure of the neutral conductor
 * eMEterStructureEnergy.c contains the energy data structure
 *
 * The function marshalDataSet arrange the data bytes in an array with a defined order.
 *
 */

#include "eMeterStructurePhase.c"
#include "eMeterStructureNeutralConductor.c"
#include "eMEterStructureEnergy.c"

byte[] marshalDataSet(void *dataSet);
