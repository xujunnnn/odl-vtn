package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathPolicyConfig;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathCostConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of costs of switch links for transmitting. The cost of using the 
 * switch port is determined by searching for an element in this list which 
 * the switch port location. If multiple elements match the target switch port, 
 * VTN Manager gives higher priority to one which specifies more extract port 
 * location.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * list vtn-path-cost {
 *     key "port-desc"
 *     leaf port-desc {
 *         type vtn-port-desc;
 *     }
 *     leaf cost {
 *         type cost;
 *     }
 *     uses vtn-path-cost-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/vtn-path-policy-config/vtn-path-cost</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config.VtnPathCostBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config.VtnPathCostBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config.VtnPathCostKey
 *
 */
public interface VtnPathCost
    extends
    ChildOf<VtnPathPolicyConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config.VtnPathCost>,
    VtnPathCostConfig,
    Identifiable<VtnPathCostKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "vtn-path-cost").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config.VtnPathCostKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VtnPathCostKey getKey();

}

