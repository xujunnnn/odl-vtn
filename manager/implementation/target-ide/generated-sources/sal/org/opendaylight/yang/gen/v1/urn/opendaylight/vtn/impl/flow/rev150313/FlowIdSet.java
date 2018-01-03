package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;


/**
 * Describes a set of VTN data flow IDs.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * grouping flow-id-set {
 *     list flow-id-list {
 *         key "flow-id"
 *         leaf flow-id {
 *             type vtn-flow-id;
 *         }
 *         uses vtn-flow-identifiable;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/flow-id-set</i>
 *
 */
public interface FlowIdSet
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "flow-id-set").intern();

    /**
     * A list of unique VTN data flow IDs.
     *
     *
     *
     * @return <code>java.util.List</code> <code>flowIdList</code>, or <code>null</code> if not present
     */
    List<FlowIdList> getFlowIdList();

}

