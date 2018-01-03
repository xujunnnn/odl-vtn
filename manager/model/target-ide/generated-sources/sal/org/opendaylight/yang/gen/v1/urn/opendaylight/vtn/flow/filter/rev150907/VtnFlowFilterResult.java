package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.result.FlowFilterResult;
import java.util.List;


/**
 * Describes pairs of flow filter indices and `vtn-update-type' values. This 
 * grouping is used as output of RPC that modifies the flow filter configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * grouping vtn-flow-filter-result {
 *     list flow-filter-result {
 *         key     leaf index {
 *             type int32;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *         uses vtn-rpc-result;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-result</i>
 *
 */
public interface VtnFlowFilterResult
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-flow-filter-result").intern();

    /**
     * Describes a pair of flow filter index and `vtn-update-type' value.
     *
     *
     *
     * @return <code>java.util.List</code> <code>flowFilterResult</code>, or <code>null</code> if not present
     */
    List<FlowFilterResult> getFlowFilterResult();

}

