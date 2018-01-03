package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policies.VtnPathPolicy;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of all the path policy configurations. Note that the path 
 * policy configuration must be modified by RPC. Do not edit this container 
 * directly.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * container vtn-path-policies {
 *     list vtn-path-policy {
 *         key "id"
 *         leaf id {
 *             type int32;
 *         }
 *         leaf default-cost {
 *             type default-cost;
 *         }
 *         list vtn-path-cost {
 *             key "port-desc"
 *             leaf port-desc {
 *                 type vtn-port-desc;
 *             }
 *             leaf cost {
 *                 type cost;
 *             }
 *             uses vtn-path-cost-config;
 *         }
 *         uses vtn-path-policy-config;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/vtn-path-policies</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathPoliciesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathPoliciesBuilder
 *
 */
public interface VtnPathPolicies
    extends
    ChildOf<VtnPathPolicyData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathPolicies>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "vtn-path-policies").intern();

    /**
     * A list of path policies shared with all VTNs.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnPathPolicy</code>, or <code>null</code> if not present
     */
    List<VtnPathPolicy> getVtnPathPolicy();

}

