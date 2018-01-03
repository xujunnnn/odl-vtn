package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.flow.cond.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchConfig;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowCondConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of conditions to match against packets. Each element in this list needs 
 * to have a unique index value in `index' field. If more than one match elements 
 * are configured, they are evaluated against packets in ascending order of 
 * value in each match element. Packets which matches the condition described by 
 * least one match element are selected by this flow condition. Every packet is 
 * selected if this element is omitted or empty.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * list vtn-flow-match {
 *     key "index"
 *     leaf index {
 *         type int32;
 *     }
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
 *     uses vtn-flow-match-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-flow-cond-config/vtn-flow-match</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.flow.cond.config.VtnFlowMatchBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.flow.cond.config.VtnFlowMatchBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.flow.cond.config.VtnFlowMatchKey
 *
 */
public interface VtnFlowMatch
    extends
    ChildOf<VtnFlowCondConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.flow.cond.config.VtnFlowMatch>,
    VtnFlowMatchConfig,
    Identifiable<VtnFlowMatchKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-flow-match").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.flow.cond.config.VtnFlowMatchKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VtnFlowMatchKey getKey();

}

