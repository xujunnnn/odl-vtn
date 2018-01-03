package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of VTN data flow IDs indexed by related switch.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * list node-flows {
 *     key "node"
 *     leaf node {
 *         type node-id;
 *     }
 *     list flow-id-list {
 *         key "flow-id"
 *         leaf flow-id {
 *             type vtn-flow-id;
 *         }
 *         uses vtn-flow-identifiable;
 *     }
 *     uses flow-id-set;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/tenant-flow-info/node-flows</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlowsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlowsBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlowsKey
 *
 */
public interface NodeFlows
    extends
    ChildOf<TenantFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>,
    FlowIdSet,
    Identifiable<NodeFlowsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "node-flows").intern();

    /**
     * Identifier for a switch.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId</code> <code>node</code>, or <code>null</code> if not present
     */
    NodeId getNode();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlowsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NodeFlowsKey getKey();

}

