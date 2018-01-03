package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.VtnAction;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.icmp.type.action._case.VtnSetIcmpTypeAction;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The branch of the `vtn-action' choice for the `vtn-set-icmp-type-action'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * case vtn-set-icmp-type-action-case {
 *     container vtn-set-icmp-type-action {
 *         leaf type {
 *             type type;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-icmp-type-action-case</i>
 *
 */
public interface VtnSetIcmpTypeActionCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnSetIcmpTypeActionCase>,
    VtnAction
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-icmp-type-action-case").intern();

    /**
     * Describes the flow action that sets the specified ICMP type into the ICMP 
     * header. Currently, this action only affects ICMP packet on IPv4.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.icmp.type.action._case.VtnSetIcmpTypeAction</code> <code>vtnSetIcmpTypeAction</code>, or <code>null</code> if not present
     */
    VtnSetIcmpTypeAction getVtnSetIcmpTypeAction();

}

