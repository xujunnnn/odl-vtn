package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.pcp.action._case;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanPcp;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnActionFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes the flow action that sets the specified VLAN priority into the IEEE 
 * 802.1Q VLAN tag.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * container vtn-set-vlan-pcp-action {
 *     leaf vlan-pcp {
 *         type vlan-pcp;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-vlan-pcp-action-case/vtn-set-vlan-pcp-action</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.pcp.action._case.VtnSetVlanPcpActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.pcp.action._case.VtnSetVlanPcpActionBuilder
 *
 */
public interface VtnSetVlanPcpAction
    extends
    ChildOf<VtnActionFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.vlan.pcp.action._case.VtnSetVlanPcpAction>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-vlan-pcp-action").intern();

    /**
     * The VLAN priority to be set. If this field is omitted, it will be treated as 
     * zero is specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanPcp</code> <code>vlanPcp</code>, or <code>null</code> if not present
     */
    VlanPcp getVlanPcp();

}

