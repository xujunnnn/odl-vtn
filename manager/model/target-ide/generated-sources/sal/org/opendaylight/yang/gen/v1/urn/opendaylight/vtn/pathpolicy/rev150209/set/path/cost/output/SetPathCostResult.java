package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.SetPathCostOutput;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.VtnPortDescResult;


/**
 * Describes pairs of switch port descriptors passed to the RPC input and results.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * list set-path-cost-result {
 *     key     leaf port-desc {
 *         type vtn-port-desc;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-port-desc-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/set-path-cost/output/set-path-cost-result</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.output.SetPathCostResultBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.output.SetPathCostResultBuilder
 *
 *
 */
public interface SetPathCostResult
    extends
    ChildOf<SetPathCostOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.set.path.cost.output.SetPathCostResult>,
    VtnPortDescResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "set-path-cost-result").intern();


}

