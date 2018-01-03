package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.result;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterResult;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes a pair of flow filter index and `vtn-update-type' value.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * list flow-filter-result {
 *     key     leaf index {
 *         type int32;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-rpc-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-result/flow-filter-result</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.result.FlowFilterResultBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.result.FlowFilterResultBuilder
 *
 *
 */
public interface FlowFilterResult
    extends
    ChildOf<VtnFlowFilterResult>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.result.FlowFilterResult>,
    VtnRpcResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "flow-filter-result").intern();

    /**
     * One of flow filter indicies specified by the RPC input.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>index</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIndex();

}

