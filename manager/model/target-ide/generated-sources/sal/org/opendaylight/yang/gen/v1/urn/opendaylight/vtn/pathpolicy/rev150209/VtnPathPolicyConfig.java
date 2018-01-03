package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config.VtnPathCost;


/**
 * Describes configuration for a path policy.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * grouping vtn-path-policy-config {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/vtn-path-policy-config</i>
 *
 */
public interface VtnPathPolicyConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "vtn-path-policy-config").intern();

    /**
     * The identifier of the path policy.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.Integer getId();
    
    /**
     * The default cost for unspecified link. If the cost of outgoing switch port is 
     * not defined in `vtn-path-cost' list, this value is used as the cost. Specifying 
     * zero means that the default link cost should be determined individually by the 
     * link speed configured to a switch port. If omitted or zero is specified, the 
     * default link cost of a switch port is calculated by the following formula: 
     * MAX(10,000,000,000,000 / (link speed (bps)), 1)
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>defaultCost</code>, or <code>null</code> if not present
     */
    java.lang.Long getDefaultCost();
    
    /**
     * A list of costs of switch links for transmitting. The cost of using the specific
     * switch port is determined by searching for an element in this list which matches
     * the switch port location. If multiple elements match the target switch port, the
     * VTN Manager gives higher priority to one which specifies more extract port 
     * location.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnPathCost</code>, or <code>null</code> if not present
     */
    List<VtnPathCost> getVtnPathCost();

}

