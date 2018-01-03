package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.flow.conditions.VtnFlowCondition;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of all the flow condition configuratins. Note that the flow 
 * condition configuration must be modified by RPC. Do not edit this container 
 * directly.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * container vtn-flow-conditions {
 *     list vtn-flow-condition {
 *         key "name"
 *         leaf name {
 *             type vnode-name;
 *         }
 *         list vtn-flow-match {
 *             key "index"
 *             leaf index {
 *                 type int32;
 *             }
 *             container vtn-ether-match {
 *                 leaf source-address {
 *                     type mac-address;
 *                 }
 *                 leaf destination-address {
 *                     type mac-address;
 *                 }
 *                 leaf ether-type {
 *                     type ether-type;
 *                 }
 *                 leaf vlan-id {
 *                     type vlan-id;
 *                 }
 *                 leaf vlan-pcp {
 *                     type vlan-pcp;
 *                 }
 *                 uses vtn-ether-match-fields;
 *             }
 *             container vtn-inet-match {
 *                 leaf source-network {
 *                     type ip-prefix;
 *                 }
 *                 leaf destination-network {
 *                     type ip-prefix;
 *                 }
 *                 leaf protocol {
 *                     type uint8;
 *                 }
 *                 leaf dscp {
 *                     type dscp;
 *                 }
 *                 uses vtn-inet-match-fields;
 *             }
 *             choice vtn-layer4-match {
 *                 case vtn-icmp-match {
 *                     leaf icmp-type {
 *                         type uint8;
 *                     }
 *                     leaf icmp-code {
 *                         type uint8;
 *                     }
 *                 }
 *                 case vtn-tcp-match {
 *                     container tcp-source-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                     container tcp-destination-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                 }
 *                 case vtn-udp-match {
 *                     container udp-source-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                     container udp-destination-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                 }
 *             }
 *             uses vtn-flow-match-config;
 *         }
 *         uses vtn-flow-cond-config;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-flow-conditions</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowConditionsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowConditionsBuilder
 *
 */
public interface VtnFlowConditions
    extends
    ChildOf<VtnFlowConditionData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowConditions>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-flow-conditions").intern();

    /**
     * A list of flow conditions shared with all VTNs.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnFlowCondition</code>, or <code>null</code> if not present
     */
    List<VtnFlowCondition> getVtnFlowCondition();

}

