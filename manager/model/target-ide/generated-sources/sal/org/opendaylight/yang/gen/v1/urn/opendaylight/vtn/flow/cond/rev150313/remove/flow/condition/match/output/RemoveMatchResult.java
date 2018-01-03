package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.remove.flow.condition.match.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.RemoveFlowConditionMatchOutput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchResult;


/**
 * Describes pairs of match indices passed to the RPC input and results.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * list remove-match-result {
 *     key     leaf index {
 *         type int32;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-flow-match-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/remove-flow-condition-match/output/remove-match-result</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.remove.flow.condition.match.output.RemoveMatchResultBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.remove.flow.condition.match.output.RemoveMatchResultBuilder
 *
 *
 */
public interface RemoveMatchResult
    extends
    ChildOf<RemoveFlowConditionMatchOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.remove.flow.condition.match.output.RemoveMatchResult>,
    VtnFlowMatchResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "remove-match-result").intern();


}

