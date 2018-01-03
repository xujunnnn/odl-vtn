package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of flow IDs indexed by flow condition keys. A flow condition key for a 
 * VTN data flow consists of flow match and priority in the ingress flow entry.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * list match-flows {
 *     key "condition-key"
 *     leaf condition-key {
 *         type string;
 *     }
 *     leaf flow-id {
 *         type vtn-flow-id;
 *     }
 *     uses vtn-flow-identifiable;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/tenant-flow-info/match-flows</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.MatchFlowsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.MatchFlowsBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.MatchFlowsKey
 *
 */
public interface MatchFlows
    extends
    ChildOf<TenantFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.MatchFlows>,
    VtnFlowIdentifiable,
    Identifiable<MatchFlowsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "match-flows").intern();

    /**
     * A string representation of a flow match and priority configured in the ingress 
     * flow entry.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>conditionKey</code>, or <code>null</code> if not present
     */
    java.lang.String getConditionKey();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.MatchFlowsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MatchFlowsKey getKey();

}

