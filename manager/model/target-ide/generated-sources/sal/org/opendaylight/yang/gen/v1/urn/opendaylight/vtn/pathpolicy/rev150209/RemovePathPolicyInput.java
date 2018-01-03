package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * container input {
 *     leaf id {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/remove-path-policy/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathPolicyInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathPolicyInputBuilder
 *
 */
public interface RemovePathPolicyInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathPolicyInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "input").intern();

    /**
     * The identifier of the path policy to be removed.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.Integer getId();

}

