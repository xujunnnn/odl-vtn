package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * container input {
 *     leaf name {
 *         type vnode-name;
 *     }
 *     list vtn-flow-match {
 *         key "index"
 *         leaf index {
 *             type int32;
 *         }
 *         container vtn-ether-match {
 *             leaf source-address {
 *                 type mac-address;
 *             }
 *             leaf destination-address {
 *                 type mac-address;
 *             }
 *             leaf ether-type {
 *                 type ether-type;
 *             }
 *             leaf vlan-id {
 *                 type vlan-id;
 *             }
 *             leaf vlan-pcp {
 *                 type vlan-pcp;
 *             }
 *             uses vtn-ether-match-fields;
 *         }
 *         container vtn-inet-match {
 *             leaf source-network {
 *                 type ip-prefix;
 *             }
 *             leaf destination-network {
 *                 type ip-prefix;
 *             }
 *             leaf protocol {
 *                 type uint8;
 *             }
 *             leaf dscp {
 *                 type dscp;
 *             }
 *             uses vtn-inet-match-fields;
 *         }
 *         choice vtn-layer4-match {
 *             case vtn-icmp-match {
 *                 leaf icmp-type {
 *                     type uint8;
 *                 }
 *                 leaf icmp-code {
 *                     type uint8;
 *                 }
 *             }
 *             case vtn-tcp-match {
 *                 container tcp-source-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *                 container tcp-destination-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *             }
 *             case vtn-udp-match {
 *                 container udp-source-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *                 container udp-destination-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *             }
 *         }
 *         uses vtn-flow-match-config;
 *     }
 *     leaf operation {
 *         type vtn-update-operation-type;
 *     }
 *     leaf present {
 *         type boolean;
 *     }
 *     uses vtn-flow-cond-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/set-flow-condition/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.SetFlowConditionInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.SetFlowConditionInputBuilder
 *
 */
public interface SetFlowConditionInput
    extends
    VtnFlowCondConfig,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.SetFlowConditionInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "input").intern();

    /**
     * Describes how to update the specified flow condition if it already exists. If 
     * `SET' is specified, the given flow condition configuration will be applied as 
     * specified. In other words, existing flow condition configuration will be 
     * removed, and the given flow condition will be created. If `ADD' is specified, 
     * the given flow condition configuration will be merged with existing 
     * configuration. The target flow condition will be created if it is not present. 
     * Null will be treated as if `ADD' is specified. Note that the operation will fail
     * if true is set to `present' field and the target flow condition is not present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();
    
    /**
     * If true is set, the opration will fail unless the target flow condition is 
     * present. Null will be treated as if false is specified.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>present</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPresent();

}

