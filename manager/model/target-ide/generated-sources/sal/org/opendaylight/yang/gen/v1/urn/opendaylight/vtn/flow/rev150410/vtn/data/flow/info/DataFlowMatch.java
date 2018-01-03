package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The flow condition configured in the ingress flow entry. This container is 
 * omitted if the flow condition is not configured.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container data-flow-match {
 *     container vtn-ether-match {
 *         leaf source-address {
 *             type mac-address;
 *         }
 *         leaf destination-address {
 *             type mac-address;
 *         }
 *         leaf ether-type {
 *             type ether-type;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         leaf vlan-pcp {
 *             type vlan-pcp;
 *         }
 *         uses vtn-ether-match-fields;
 *     }
 *     container vtn-inet-match {
 *         leaf source-network {
 *             type ip-prefix;
 *         }
 *         leaf destination-network {
 *             type ip-prefix;
 *         }
 *         leaf protocol {
 *             type uint8;
 *         }
 *         leaf dscp {
 *             type dscp;
 *         }
 *         uses vtn-inet-match-fields;
 *     }
 *     choice vtn-layer4-match {
 *         case vtn-icmp-match {
 *             leaf icmp-type {
 *                 type uint8;
 *             }
 *             leaf icmp-code {
 *                 type uint8;
 *             }
 *         }
 *         case vtn-tcp-match {
 *             container tcp-source-range {
 *                 leaf port-from {
 *                     type port-number;
 *                 }
 *                 leaf port-to {
 *                     type port-number;
 *                 }
 *                 uses vtn-port-range;
 *             }
 *             container tcp-destination-range {
 *                 leaf port-from {
 *                     type port-number;
 *                 }
 *                 leaf port-to {
 *                     type port-number;
 *                 }
 *                 uses vtn-port-range;
 *             }
 *         }
 *         case vtn-udp-match {
 *             container udp-source-range {
 *                 leaf port-from {
 *                     type port-number;
 *                 }
 *                 leaf port-to {
 *                     type port-number;
 *                 }
 *                 uses vtn-port-range;
 *             }
 *             container udp-destination-range {
 *                 leaf port-from {
 *                     type port-number;
 *                 }
 *                 leaf port-to {
 *                     type port-number;
 *                 }
 *                 uses vtn-port-range;
 *             }
 *         }
 *     }
 *     uses vtn-match-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-info/data-flow-match</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatchBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatchBuilder
 *
 */
public interface DataFlowMatch
    extends
    ChildOf<VtnDataFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>,
    VtnMatchFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "data-flow-match").intern();


}

