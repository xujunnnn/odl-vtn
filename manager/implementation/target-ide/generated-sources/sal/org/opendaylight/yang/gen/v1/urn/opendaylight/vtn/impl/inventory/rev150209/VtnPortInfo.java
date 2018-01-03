package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info.PortLink;


/**
 * Generic information about a switch port managed by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-inventory</b>
 * <pre>
 * grouping vtn-port-info {
 *     leaf id {
 *         type node-connector-id;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf enabled {
 *         type boolean;
 *     }
 *     leaf cost {
 *         type int64;
 *     }
 *     list port-link {
 *         key "link-id"
 *         leaf link-id {
 *             type link-id;
 *         }
 *         leaf peer {
 *             type node-connector-id;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-inventory/vtn-port-info</i>
 *
 */
public interface VtnPortInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:inventory",
        "2015-02-09", "vtn-port-info").intern();

    /**
     * The unique identifier for the switch port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>id</code>, or <code>null</code> if not present
     */
    NodeConnectorId getId();
    
    /**
     * Human readable name of the switch port.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Determine whether the switch port is enabled or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnabled();
    
    /**
     * The cost of the link for transmitting a packet from this port.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cost</code>, or <code>null</code> if not present
     */
    java.lang.Long getCost();
    
    /**
     * A list of inter-switch links.
     *
     *
     *
     * @return <code>java.util.List</code> <code>portLink</code>, or <code>null</code> if not present
     */
    List<PortLink> getPortLink();

}

