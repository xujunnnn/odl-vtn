package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.src.action._case;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnIpaddrActionFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnActionFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes the flow action that sets the specified source IP address into the IP 
 * header. Currently, only IPv4 address can be specified and this action affects 
 * only IPv4 packet.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * container vtn-set-inet-src-action {
 *     choice address {
 *         case ipv4 {
 *             leaf ipv4-address {
 *                 type ipv4-prefix;
 *             }
 *         }
 *         case ipv6 {
 *             leaf ipv6-address {
 *                 type ipv6-prefix;
 *             }
 *         }
 *     }
 *     uses vtn-ipaddr-action-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-inet-src-action-case/vtn-set-inet-src-action</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.src.action._case.VtnSetInetSrcActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.src.action._case.VtnSetInetSrcActionBuilder
 *
 */
public interface VtnSetInetSrcAction
    extends
    ChildOf<VtnActionFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.src.action._case.VtnSetInetSrcAction>,
    VtnIpaddrActionFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-inet-src-action").intern();


}

