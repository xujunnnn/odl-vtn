package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes an interface that specifies a VTN data flow.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * grouping vtn-flow-identifiable {
 *     leaf flow-id {
 *         type vtn-flow-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-flow-identifiable</i>
 *
 */
public interface VtnFlowIdentifiable
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "vtn-flow-identifiable").intern();

    /**
     * Identifier for a VTN data flow.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowId</code> <code>flowId</code>, or <code>null</code> if not present
     */
    VtnFlowId getFlowId();

}

