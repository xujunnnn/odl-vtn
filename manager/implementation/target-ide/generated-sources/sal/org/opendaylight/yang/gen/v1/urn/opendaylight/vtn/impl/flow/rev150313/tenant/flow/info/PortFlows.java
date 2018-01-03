package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of VTN data flow IDs indexed by related switch port.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * list port-flows {
 *     key "port"
 *     leaf port {
 *         type node-connector-id;
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
 * <i>vtn-flow-impl/tenant-flow-info/port-flows</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.PortFlowsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.PortFlowsBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.PortFlowsKey
 *
 */
public interface PortFlows
    extends
    ChildOf<TenantFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.PortFlows>,
    FlowIdSet,
    Identifiable<PortFlowsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "port-flows").intern();

    /**
     * Identifier for a switch port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>port</code>, or <code>null</code> if not present
     */
    NodeConnectorId getPort();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.PortFlowsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PortFlowsKey getKey();

}

