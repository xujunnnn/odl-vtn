package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHost;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of VTN data flow IDs indexed by source host.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * list source-host-flows {
 *     key "mac-address" 
 * "vlan-id"
 *     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     list flow-id-list {
 *         key "flow-id"
 *         leaf flow-id {
 *             type vtn-flow-id;
 *         }
 *         uses vtn-flow-identifiable;
 *     }
 *     uses flow-id-set;
 *     uses vlan-host;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/tenant-flow-info/source-host-flows</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlowsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlowsBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlowsKey
 *
 */
public interface SourceHostFlows
    extends
    ChildOf<TenantFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>,
    FlowIdSet,
    VlanHost,
    Identifiable<SourceHostFlowsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "source-host-flows").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlowsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SourceHostFlowsKey getKey();

}

