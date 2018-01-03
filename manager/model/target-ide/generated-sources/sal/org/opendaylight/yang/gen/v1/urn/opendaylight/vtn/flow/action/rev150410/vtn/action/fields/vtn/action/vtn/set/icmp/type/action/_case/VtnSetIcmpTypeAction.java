package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.icmp.type.action._case;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnActionFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes the flow action that sets the specified ICMP type into the ICMP 
 * header. Currently, this action only affects ICMP packet on IPv4.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * container vtn-set-icmp-type-action {
 *     leaf type {
 *         type type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-icmp-type-action-case/vtn-set-icmp-type-action</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.icmp.type.action._case.VtnSetIcmpTypeActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.icmp.type.action._case.VtnSetIcmpTypeActionBuilder
 *
 */
public interface VtnSetIcmpTypeAction
    extends
    ChildOf<VtnActionFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.icmp.type.action._case.VtnSetIcmpTypeAction>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-icmp-type-action").intern();

    /**
     * The ICMP type to be set. If this field is omitted, it will be treated as zero is
     * specified.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>type</code>, or <code>null</code> if not present
     */
    java.lang.Short getType();

}

