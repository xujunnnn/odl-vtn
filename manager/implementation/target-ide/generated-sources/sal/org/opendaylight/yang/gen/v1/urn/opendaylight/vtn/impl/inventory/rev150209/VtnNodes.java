package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.nodes.VtnNode;


/**
 * The root container of all nodes managed by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-inventory</b>
 * <pre>
 * container vtn-nodes {
 *     list vtn-node {
 *         key "id"
 *         leaf id {
 *             type node-id;
 *         }
 *         leaf openflow-version {
 *             type vtn-openflow-version;
 *         }
 *         list vtn-port {
 *             key "id"
 *             leaf id {
 *                 type node-connector-id;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf enabled {
 *                 type boolean;
 *             }
 *             leaf cost {
 *                 type int64;
 *             }
 *             list port-link {
 *                 key "link-id"
 *                 leaf link-id {
 *                     type link-id;
 *                 }
 *                 leaf peer {
 *                     type node-connector-id;
 *                 }
 *             }
 *             uses vtn-port-info;
 *         }
 *         uses vtn-node-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-inventory/vtn-nodes</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnNodesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnNodesBuilder
 *
 */
public interface VtnNodes
    extends
    ChildOf<VtnInventoryData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnNodes>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:inventory",
        "2015-02-09", "vtn-nodes").intern();

    /**
     * A list of nodes managed by the VTN Manager.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnNode</code>, or <code>null</code> if not present
     */
    List<VtnNode> getVtnNode();

}

