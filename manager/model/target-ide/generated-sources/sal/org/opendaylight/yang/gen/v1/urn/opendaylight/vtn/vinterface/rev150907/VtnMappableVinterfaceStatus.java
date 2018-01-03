package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeState;


/**
 * Describes runtime status information about a virtual interface which can 
 * port mapping configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * grouping vtn-mappable-vinterface-status {
 *     leaf state {
 *         type vnode-state;
 *     }
 *     leaf entity-state {
 *         type vnode-state;
 *     }
 *     leaf mapped-port {
 *         type node-connector-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/vtn-mappable-vinterface-status</i>
 *
 */
public interface VtnMappableVinterfaceStatus
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "vtn-mappable-vinterface-status").intern();

    /**
     * State of the virtual interface. `UNKNOWN' indicates that other network element 
     * is not mapped to the virtual interface. `DOWN' indicates that the network 
     * element mapped to the virtual interface is not operating. It will be in `DOWN' 
     * state even when the virtual interface is disabled. `UP' indicates that the 
     * network element mapped to the virtual interface is operating.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeState</code> <code>state</code>, or <code>null</code> if not present
     */
    VnodeState getState();
    
    /**
     * State of the network element mapped to this virtual interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeState</code> <code>entityState</code>, or <code>null</code> if not present
     */
    VnodeState getEntityState();
    
    /**
     * A physical switch port actually mapped by the port mapping. This field is 
     * omitted if no physical switch port meets the condition specified by the port 
     * mapping configuration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>mappedPort</code>, or <code>null</code> if not present
     */
    NodeConnectorId getMappedPort();

}

