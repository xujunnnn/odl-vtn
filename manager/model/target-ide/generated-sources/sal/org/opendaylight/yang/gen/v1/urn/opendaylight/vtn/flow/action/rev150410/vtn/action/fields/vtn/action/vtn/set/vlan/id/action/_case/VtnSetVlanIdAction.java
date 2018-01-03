package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.id.action._case;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnActionFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes the flow action that sets the specified VLAN ID into the IEEE 802.1Q 
 * VLAN tag.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * container vtn-set-vlan-id-action {
 *     leaf vlan-id {
 *         type uint16;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-vlan-id-action-case/vtn-set-vlan-id-action</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.id.action._case.VtnSetVlanIdActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.id.action._case.VtnSetVlanIdActionBuilder
 *
 */
public interface VtnSetVlanIdAction
    extends
    ChildOf<VtnActionFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.id.action._case.VtnSetVlanIdAction>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-vlan-id-action").intern();

    /**
     * The VLAN ID to be set. Note that zero cannot be specified. If you need a flow 
     * action which removes VLAN tag from packets, use `vtn-pop-vlan-action' instead.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    java.lang.Integer getVlanId();

}

