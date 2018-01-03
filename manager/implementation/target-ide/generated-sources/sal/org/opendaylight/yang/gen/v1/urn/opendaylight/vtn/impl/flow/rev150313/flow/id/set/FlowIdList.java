package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of unique VTN data flow IDs.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * list flow-id-list {
 *     key "flow-id"
 *     leaf flow-id {
 *         type vtn-flow-id;
 *     }
 *     uses vtn-flow-identifiable;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/flow-id-set/flow-id-list</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdListKey
 *
 */
public interface FlowIdList
    extends
    ChildOf<FlowIdSet>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>,
    VtnFlowIdentifiable,
    Identifiable<FlowIdListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "flow-id-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FlowIdListKey getKey();

}

