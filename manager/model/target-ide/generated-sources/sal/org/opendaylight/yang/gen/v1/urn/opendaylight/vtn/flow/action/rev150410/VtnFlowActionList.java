package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.flow.action.list.VtnFlowAction;


/**
 * Describes a list of flow actions.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * grouping vtn-flow-action-list {
 *     list vtn-flow-action {
 *         key "order"
 *         leaf order {
 *             type int32;
 *         }
 *         choice vtn-action {
 *             case vtn-drop-action-case {
 *                 container vtn-drop-action {
 *                 }
 *             }
 *             case vtn-pop-vlan-action-case {
 *                 container vtn-pop-vlan-action {
 *                 }
 *             }
 *             case vtn-push-vlan-action-case {
 *                 container vtn-push-vlan-action {
 *                     leaf vlan-type {
 *                         type vlan-type;
 *                     }
 *                 }
 *             }
 *             case vtn-set-dl-dst-action-case {
 *                 container vtn-set-dl-dst-action {
 *                     leaf address {
 *                         type mac-address;
 *                     }
 *                     uses vtn-dladdr-action-fields;
 *                 }
 *             }
 *             case vtn-set-dl-src-action-case {
 *                 container vtn-set-dl-src-action {
 *                     leaf address {
 *                         type mac-address;
 *                     }
 *                     uses vtn-dladdr-action-fields;
 *                 }
 *             }
 *             case vtn-set-icmp-code-action-case {
 *                 container vtn-set-icmp-code-action {
 *                     leaf code {
 *                         type code;
 *                     }
 *                 }
 *             }
 *             case vtn-set-icmp-type-action-case {
 *                 container vtn-set-icmp-type-action {
 *                     leaf type {
 *                         type type;
 *                     }
 *                 }
 *             }
 *             case vtn-set-inet-dscp-action-case {
 *                 container vtn-set-inet-dscp-action {
 *                     leaf dscp {
 *                         type dscp;
 *                     }
 *                 }
 *             }
 *             case vtn-set-inet-dst-action-case {
 *                 container vtn-set-inet-dst-action {
 *                     choice address {
 *                         case ipv4 {
 *                             leaf ipv4-address {
 *                                 type ipv4-prefix;
 *                             }
 *                         }
 *                         case ipv6 {
 *                             leaf ipv6-address {
 *                                 type ipv6-prefix;
 *                             }
 *                         }
 *                     }
 *                     uses vtn-ipaddr-action-fields;
 *                 }
 *             }
 *             case vtn-set-inet-src-action-case {
 *                 container vtn-set-inet-src-action {
 *                     choice address {
 *                         case ipv4 {
 *                             leaf ipv4-address {
 *                                 type ipv4-prefix;
 *                             }
 *                         }
 *                         case ipv6 {
 *                             leaf ipv6-address {
 *                                 type ipv6-prefix;
 *                             }
 *                         }
 *                     }
 *                     uses vtn-ipaddr-action-fields;
 *                 }
 *             }
 *             case vtn-set-port-dst-action-case {
 *                 container vtn-set-port-dst-action {
 *                     leaf port {
 *                         type port;
 *                     }
 *                     uses vtn-port-action-fields;
 *                 }
 *             }
 *             case vtn-set-port-src-action-case {
 *                 container vtn-set-port-src-action {
 *                     leaf port {
 *                         type port;
 *                     }
 *                     uses vtn-port-action-fields;
 *                 }
 *             }
 *             case vtn-set-vlan-id-action-case {
 *                 container vtn-set-vlan-id-action {
 *                     leaf vlan-id {
 *                         type uint16;
 *                     }
 *                 }
 *             }
 *             case vtn-set-vlan-pcp-action-case {
 *                 container vtn-set-vlan-pcp-action {
 *                     leaf vlan-pcp {
 *                         type vlan-pcp;
 *                     }
 *                 }
 *             }
 *         }
 *         uses vtn-ordered-flow-action;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-flow-action-list</i>
 *
 */
public interface VtnFlowActionList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-flow-action-list").intern();

    /**
     * Describes a list of flow actions supported by the VTN Manager. Each action in 
     * this list needs to have a unique index value in `order' field. Flow actions in a
     * flow entry are sorted by `order' field in ascending order.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnFlowAction</code>, or <code>null</code> if not present
     */
    List<VtnFlowAction> getVtnFlowAction();

}

