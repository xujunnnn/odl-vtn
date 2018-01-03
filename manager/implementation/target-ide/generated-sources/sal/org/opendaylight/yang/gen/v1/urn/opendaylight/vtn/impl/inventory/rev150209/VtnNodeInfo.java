package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.node.info.VtnPort;


/**
 * Generic information about a node managed by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-inventory</b>
 * <pre>
 * grouping vtn-node-info {
 *     leaf id {
 *         type node-id;
 *     }
 *     leaf openflow-version {
 *         type vtn-openflow-version;
 *     }
 *     list vtn-port {
 *         key "id"
 *         leaf id {
 *             type node-connector-id;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf enabled {
 *             type boolean;
 *         }
 *         leaf cost {
 *             type int64;
 *         }
 *         list port-link {
 *             key "link-id"
 *             leaf link-id {
 *                 type link-id;
 *             }
 *             leaf peer {
 *                 type node-connector-id;
 *             }
 *         }
 *         uses vtn-port-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-inventory/vtn-node-info</i>
 *
 */
public interface VtnNodeInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:inventory",
        "2015-02-09", "vtn-node-info").intern();

    /**
     * The unique identifier for the switch.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId</code> <code>id</code>, or <code>null</code> if not present
     */
    NodeId getId();
    
    /**
     * Estimated OpenFlow protocol version currently used on the secure channel.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnOpenflowVersion</code> <code>openflowVersion</code>, or <code>null</code> if not present
     */
    VtnOpenflowVersion getOpenflowVersion();
    
    /**
     * A list of physical switch ports that belong this node.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnPort</code>, or <code>null</code> if not present
     */
    List<VtnPort> getVtnPort();

}

