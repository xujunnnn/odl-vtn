package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policies;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathPolicies;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathPolicyConfig;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of path policies shared with all VTNs.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * list vtn-path-policy {
 *     key "id"
 *     leaf id {
 *         type int32;
 *     }
 *     leaf default-cost {
 *         type default-cost;
 *     }
 *     list vtn-path-cost {
 *         key "port-desc"
 *         leaf port-desc {
 *             type vtn-port-desc;
 *         }
 *         leaf cost {
 *             type cost;
 *         }
 *         uses vtn-path-cost-config;
 *     }
 *     uses vtn-path-policy-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/vtn-path-policies/vtn-path-policy</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policies.VtnPathPolicyBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policies.VtnPathPolicyBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policies.VtnPathPolicyKey
 *
 */
public interface VtnPathPolicy
    extends
    ChildOf<VtnPathPolicies>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policies.VtnPathPolicy>,
    VtnPathPolicyConfig,
    Identifiable<VtnPathPolicyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "vtn-path-policy").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policies.VtnPathPolicyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VtnPathPolicyKey getKey();

}

