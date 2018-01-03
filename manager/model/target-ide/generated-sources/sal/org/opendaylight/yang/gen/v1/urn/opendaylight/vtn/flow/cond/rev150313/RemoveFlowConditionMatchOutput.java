package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.remove.flow.condition.match.output.RemoveMatchResult;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * container output {
 *     list remove-match-result {
 *         key     leaf index {
 *             type int32;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *         uses vtn-flow-match-result;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/remove-flow-condition-match/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.RemoveFlowConditionMatchOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.RemoveFlowConditionMatchOutputBuilder
 *
 */
public interface RemoveFlowConditionMatchOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.RemoveFlowConditionMatchOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "output").intern();

    /**
     * Describes pairs of match indices passed to the RPC input and results.
     *
     *
     *
     * @return <code>java.util.List</code> <code>removeMatchResult</code>, or <code>null</code> if not present
     */
    List<RemoveMatchResult> getRemoveMatchResult();

}

