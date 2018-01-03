package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.input;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathCostInput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPathCostConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Pairs of the switch port descriptors and link cost configuratins to be applied 
 * to the path policy specified by `id'. Note that a duplicate switch port 
 * descriptor in this list will cause a `BADREQUEST' error.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * list path-cost-list {
 *     key     leaf port-desc {
 *         type vtn-port-desc;
 *     }
 *     leaf cost {
 *         type cost;
 *     }
 *     uses vtn-path-cost-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/set-path-cost/input/path-cost-list</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.input.PathCostListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.input.PathCostListBuilder
 *
 *
 */
public interface PathCostList
    extends
    ChildOf<SetPathCostInput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.input.PathCostList>,
    VtnPathCostConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "path-cost-list").intern();


}

