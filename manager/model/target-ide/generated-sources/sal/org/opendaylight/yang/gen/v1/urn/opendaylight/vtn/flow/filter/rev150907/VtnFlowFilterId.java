package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields;


/**
 * Specifies the target list of flow filters for RPC. If `tenant-name', 
 * `bridge-name', and `interface-name' is configured, the flow filter in the 
 * virtual interface attached to the vBridge is targeted. `output' field 
 * the flow direction for the flow filter. If `tenant-name' and `bridge-name' is 
 * configured and `interface-name' is omitted, the flow filter in the specified 
 * vBridge is targeted. `output' field determines the flow direction for the flow 
 * filter. If `tenant-name', `terminal-name', and `interface-name' is configured, 
 * the flow filter in the virtual interface attached to the vTerminal is targeted. 
 * `output' field determines the flow direction for the flow filter. If 
 * `tenant-name' is configured and `bridge-name', `terminal-name', and 
 * `interface-name' are omitted, the flow filter in the VTN is targeted. In this 
 * case `output' field is ignored because the VTN has a flow filter only for 
 * incoming packets. Otherwise RPC will fail.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * grouping vtn-flow-filter-id {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf router-name {
 *         type string;
 *     }
 *     leaf terminal-name {
 *         type string;
 *     }
 *     leaf interface-name {
 *         type string;
 *     }
 *     leaf output {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-id</i>
 *
 */
public interface VtnFlowFilterId
    extends
    DataObject,
    VnodePathFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-flow-filter-id").intern();

    /**
     * Describes the flow direction for the flow filter. If true, the flow filter list 
     * for outgoing packets is targeted. If false or omitted, the flow filter list for 
     * incoming packets is targeted.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>output</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isOutput();

}

