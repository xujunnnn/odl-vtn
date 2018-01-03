package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Container that keeps flow identifier for the next allocation.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * container next-flow-id {
 *     leaf next-id {
 *         type vtn-flow-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/next-flow-id</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowIdBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowIdBuilder
 *
 */
public interface NextFlowId
    extends
    ChildOf<VtnFlowImplData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "next-flow-id").intern();

    /**
     * A data flow identifier for the next allocation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowId</code> <code>nextId</code>, or <code>null</code> if not present
     */
    VtnFlowId getNextId();

}

