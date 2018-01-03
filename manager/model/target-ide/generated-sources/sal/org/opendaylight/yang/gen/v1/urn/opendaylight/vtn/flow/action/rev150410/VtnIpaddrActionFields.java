package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Address;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the flow action fields that sets the IP address into packet.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * grouping vtn-ipaddr-action-fields {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-ipaddr-action-fields</i>
 *
 */
public interface VtnIpaddrActionFields
    extends
    DataObject,
    Address
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-ipaddr-action-fields").intern();


}

