package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.input.PathCostList;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * container input {
 *     leaf id {
 *         type int32;
 *     }
 *     list path-cost-list {
 *         key     leaf port-desc {
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
 * <i>vtn-path-policy/set-path-cost/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathCostInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathCostInputBuilder
 *
 */
public interface SetPathCostInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathCostInput>
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
     * Pairs of the switch port descriptors and link cost configuratins to be applied 
     * to the path policy specified by `id'. Note that a duplicate switch port 
     * descriptor in this list will cause a `BADREQUEST' error.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pathCostList</code>, or <code>null</code> if not present
     */
    List<PathCostList> getPathCostList();

}

