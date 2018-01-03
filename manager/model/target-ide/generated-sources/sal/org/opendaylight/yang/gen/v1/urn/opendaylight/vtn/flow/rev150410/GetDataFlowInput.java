package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowPort;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowSource;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf flow-id {
 *         type vtn-flow-id;
 *     }
 *     leaf mode {
 *         type mode;
 *     }
 *     leaf node {
 *         type node-id;
 *     }
 *     container data-flow-port {
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-switch-port;
 *     }
 *     container data-flow-source {
 *         leaf mac-address {
 *             type mac-address;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         uses vlan-host;
 *     }
 *     leaf average-interval {
 *         type average-interval;
 *     }
 *     uses vtn-flow-identifiable;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/get-data-flow/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInputBuilder
 *
 */
public interface GetDataFlowInput
    extends
    VtnFlowIdentifiable,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "input").intern();

    /**
     * The name of the VTN.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();
    
    /**
     * Specifies behavior of this operation. If omitted, it is treated as if SUMMARY is
     * specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.DataFlowMode</code> <code>mode</code>, or <code>null</code> if not present
     */
    DataFlowMode getMode();
    
    /**
     * Identifier for a physical switch. If this field is specified and 
     * `data-flow-port' field is omitted, only data flows that forward packets via the 
     * specified switch will be selected.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId</code> <code>node</code>, or <code>null</code> if not present
     */
    NodeId getNode();
    
    /**
     * Specifies the location of the physical switch port in the physical switch 
     * specified by `node' field. If both this field and `node' field are specified, 
     * only data flows that forward packets via the specified switch port will be 
     * selected. This field will be ignored if `node' field is omitted.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowPort</code> <code>dataFlowPort</code>, or <code>null</code> if not present
     */
    DataFlowPort getDataFlowPort();
    
    /**
     * Specifies the L2 source host of the data flow. If this field is specified, only 
     * data flows that map packets sent by the specified L2 host will be selected.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowSource</code> <code>dataFlowSource</code>, or <code>null</code> if not present
     */
    DataFlowSource getDataFlowSource();
    
    /**
     * The number of seconds in the measurement period for averaged flow statistics. 
     * `averaged-flow-stats' field is omitted if no valid flow statistics are logged 
     * within the given interval. Specifying zero or a negative value is treated as if 
     * 10 is specified. Note that this value is just a hint for determining the 
     * measurement period. The actual measurement period can be derived from 
     * `averaged-flow-stats' field. This field is ignored if SUMMARY is specified in 
     * `mode'.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>averageInterval</code>, or <code>null</code> if not present
     */
    java.lang.Integer getAverageInterval();

}

