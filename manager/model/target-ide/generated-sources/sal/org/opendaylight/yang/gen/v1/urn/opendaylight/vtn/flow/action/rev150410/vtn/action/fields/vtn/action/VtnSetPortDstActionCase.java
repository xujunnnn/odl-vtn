package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.VtnAction;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.port.dst.action._case.VtnSetPortDstAction;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The branch of the `vtn-action' choice for the `vtn-set-port-dst-action'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * case vtn-set-port-dst-action-case {
 *     container vtn-set-port-dst-action {
 *         leaf port {
 *             type port;
 *         }
 *         uses vtn-port-action-fields;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-port-dst-action-case</i>
 *
 */
public interface VtnSetPortDstActionCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnSetPortDstActionCase>,
    VtnAction
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-port-dst-action-case").intern();

    /**
     * Describes the flow action that sets the specified destination port number into 
     * the TCP or UDP header. Currently, this action only affects TCP or UDP packet on 
     * IPv4.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.port.dst.action._case.VtnSetPortDstAction</code> <code>vtnSetPortDstAction</code>, or <code>null</code> if not present
     */
    VtnSetPortDstAction getVtnSetPortDstAction();

}

