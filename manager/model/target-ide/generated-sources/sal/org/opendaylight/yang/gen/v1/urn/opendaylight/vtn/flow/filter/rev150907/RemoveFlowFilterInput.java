package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * container input {
 *     leaf output {
 *         type boolean;
 *     }
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf router-name {
 *         type string;
 *     }
 *     leaf terminal-name {
 *         type string;
 *     }
 *     leaf interface-name {
 *         type string;
 *     }
 *     leaf-list indices {
 *         type int32;
 *     }
 *     uses vtn-flow-filter-id;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/remove-flow-filter/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInputBuilder
 *
 */
public interface RemoveFlowFilterInput
    extends
    VtnFlowFilterId,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "input").intern();

    /**
     * A list of flow filter index numbers to be removed from the flow filter list 
     * specified by the RPC input. If this field is omitted or an empty list is 
     * specified, all the flow filters present in the specified flow filter list will 
     * be removed. Duplicates in this list will be eliminated automatically.
     *
     *
     *
     * @return <code>java.util.List</code> <code>indices</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getIndices();

}

