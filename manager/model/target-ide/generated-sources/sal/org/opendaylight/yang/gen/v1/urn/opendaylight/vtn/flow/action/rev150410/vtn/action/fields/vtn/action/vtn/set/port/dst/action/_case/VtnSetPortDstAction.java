package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.port.dst.action._case;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnActionFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnPortActionFields;


/**
 * Describes the flow action that sets the specified destination port number into 
 * the TCP or UDP header. Currently, this action only affects TCP or UDP packet on 
 * IPv4.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * container vtn-set-port-dst-action {
 *     leaf port {
 *         type port;
 *     }
 *     uses vtn-port-action-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-port-dst-action-case/vtn-set-port-dst-action</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.port.dst.action._case.VtnSetPortDstActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.port.dst.action._case.VtnSetPortDstActionBuilder
 *
 */
public interface VtnSetPortDstAction
    extends
    ChildOf<VtnActionFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.port.dst.action._case.VtnSetPortDstAction>,
    VtnPortActionFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-port-dst-action").intern();


}

