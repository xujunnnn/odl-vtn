package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortDesc;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * container input {
 *     leaf id {
 *         type int32;
 *     }
 *     leaf-list port-desc {
 *         type vtn-port-desc;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/remove-path-cost/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathCostInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathCostInputBuilder
 *
 */
public interface RemovePathCostInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathCostInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "input").intern();

    /**
     * The identifier of the path policy.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.Integer getId();
    
    /**
     * A list of switch port descriptors to be removed from the path policy 
     * configuration specified by the `id' field. Duplicates in this list will be 
     * eliminated automatically.
     *
     *
     *
     * @return <code>java.util.List</code> <code>portDesc</code>, or <code>null</code> if not present
     */
    List<VtnPortDesc> getPortDesc();

}

