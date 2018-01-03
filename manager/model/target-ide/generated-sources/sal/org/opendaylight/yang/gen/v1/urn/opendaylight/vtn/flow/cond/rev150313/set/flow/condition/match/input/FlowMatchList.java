package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.input;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchConfig;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.SetFlowConditionMatchInput;


/**
 * A list of `vtn-flow-match-config' to be applied to the flow condition specified 
 * by `name' field. Note that a duplicate match index in this list will cause a 
 * `BADREQUEST' error.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * list flow-match-list {
 *     key     leaf index {
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
 * <i>vtn-flow-condition/set-flow-condition-match/input/flow-match-list</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.input.FlowMatchListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.input.FlowMatchListBuilder
 *
 *
 */
public interface FlowMatchList
    extends
    ChildOf<SetFlowConditionMatchInput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.input.FlowMatchList>,
    VtnFlowMatchConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "flow-match-list").intern();


}

