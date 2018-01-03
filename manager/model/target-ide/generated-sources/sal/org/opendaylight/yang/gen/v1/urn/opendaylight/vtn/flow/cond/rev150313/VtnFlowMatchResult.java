package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes a pair of VTN flow match index and `vtn-update-type'. This grouping 
 * used as output of RPC that modifies the VTN flow match configuration in a flow 
 * condition.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * grouping vtn-flow-match-result {
 *     leaf index {
 *         type int32;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-flow-match-result</i>
 *
 */
public interface VtnFlowMatchResult
    extends
    DataObject,
    VtnRpcResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-flow-match-result").intern();

    /**
     * The index value that specifies the flow match in the flow condition.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>index</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIndex();

}

