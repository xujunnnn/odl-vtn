package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.VtnAction;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.dscp.action._case.VtnSetInetDscpAction;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The branch of the `vtn-action' choice for the `vtn-set-inet-dscp-action'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * case vtn-set-inet-dscp-action-case {
 *     container vtn-set-inet-dscp-action {
 *         leaf dscp {
 *             type dscp;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-inet-dscp-action-case</i>
 *
 */
public interface VtnSetInetDscpActionCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnSetInetDscpActionCase>,
    VtnAction
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-inet-dscp-action-case").intern();

    /**
     * Describes the flow action that sets the specified IP DSCP value into the IP 
     * header. Currently, only IPv4 packet can be modified by this action.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.dscp.action._case.VtnSetInetDscpAction</code> <code>vtnSetInetDscpAction</code>, or <code>null</code> if not present
     */
    VtnSetInetDscpAction getVtnSetInetDscpAction();

}

