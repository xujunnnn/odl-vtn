package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.nodes;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnNodeInfo;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnNodes;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of nodes managed by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-inventory</b>
 * <pre>
 * list vtn-node {
 *     key "id"
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
 *     uses vtn-node-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-inventory/vtn-nodes/vtn-node</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.nodes.VtnNodeBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.nodes.VtnNodeBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.nodes.VtnNodeKey
 *
 */
public interface VtnNode
    extends
    ChildOf<VtnNodes>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.nodes.VtnNode>,
    VtnNodeInfo,
    Identifiable<VtnNodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:inventory",
        "2015-02-09", "vtn-node").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.nodes.VtnNodeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VtnNodeKey getKey();

}

