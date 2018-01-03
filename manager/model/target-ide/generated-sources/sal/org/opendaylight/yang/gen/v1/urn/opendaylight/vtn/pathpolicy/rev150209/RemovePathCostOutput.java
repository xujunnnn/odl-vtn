package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.remove.path.cost.output.RemovePathCostResult;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * container output {
 *     list remove-path-cost-result {
 *         key     leaf port-desc {
 *             type vtn-port-desc;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *         uses vtn-port-desc-result;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/remove-path-cost/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathCostOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathCostOutputBuilder
 *
 */
public interface RemovePathCostOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.RemovePathCostOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "output").intern();

    /**
     * Describes pairs of switch port descriptors passed to the RPC input and results.
     *
     *
     *
     * @return <code>java.util.List</code> <code>removePathCostResult</code>, or <code>null</code> if not present
     */
    List<RemovePathCostResult> getRemovePathCostResult();

}

