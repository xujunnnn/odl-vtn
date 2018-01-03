package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * container input {
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
 *     leaf operation {
 *         type vtn-update-operation-type;
 *     }
 *     leaf present {
 *         type boolean;
 *     }
 *     uses vtn-path-policy-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/set-path-policy/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathPolicyInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathPolicyInputBuilder
 *
 */
public interface SetPathPolicyInput
    extends
    VtnPathPolicyConfig,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathPolicyInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "input").intern();

    /**
     * Describes how to update the specified path policy if it already exists. If `SET'
     * is specified, the given path policy configuration will be applied as specified. 
     * In other words, existing path policy configuration will be removed, and the 
     * given path policy will be created. If `ADD' is specified, the given path policy 
     * configuration will be merged with existing configuration. The target path policy
     * will be created if it is not present. Null will be treated as if `ADD' is 
     * specified. Note that the operation will fail if true is set to `present' field 
     * and the target path policy is not presnt.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();
    
    /**
     * If true is set, the opration will fail unless the target path policy is present.
     * Null will be treated as if false is specified.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>present</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPresent();

}

