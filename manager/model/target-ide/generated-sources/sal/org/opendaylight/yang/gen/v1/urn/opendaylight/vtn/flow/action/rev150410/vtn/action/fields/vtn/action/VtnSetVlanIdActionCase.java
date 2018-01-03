package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.VtnAction;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.id.action._case.VtnSetVlanIdAction;


/**
 * The branch of the `vtn-action' choice for the `vtn-set-vlan-id-action'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * case vtn-set-vlan-id-action-case {
 *     container vtn-set-vlan-id-action {
 *         leaf vlan-id {
 *             type uint16;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-vlan-id-action-case</i>
 *
 */
public interface VtnSetVlanIdActionCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnSetVlanIdActionCase>,
    VtnAction
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-vlan-id-action-case").intern();

    /**
     * Describes the flow action that sets the specified VLAN ID into the IEEE 802.1Q 
     * VLAN tag.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.id.action._case.VtnSetVlanIdAction</code> <code>vtnSetVlanIdAction</code>, or <code>null</code> if not present
     */
    VtnSetVlanIdAction getVtnSetVlanIdAction();

}

