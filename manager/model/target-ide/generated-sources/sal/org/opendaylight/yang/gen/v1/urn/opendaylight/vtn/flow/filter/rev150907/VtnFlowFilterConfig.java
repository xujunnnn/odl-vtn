package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;


/**
 * Describes a rule of a packet filter applied to packets forwarded in VTN. If a 
 * flow condition configured in a flow filter matches a packet, flow actions 
 * configured in `actions' are applied to the packet in ascending order of `order' 
 * field in each action. - If `actions' is omitted or it is empty, the flow filter 
 * is applied to the packet without modifying the packet. - Actions in `actions' 
 * field will be evaluated in ascending order of `order' value. - Note that the 
 * VLAN ID of the packet cannot be modified by flow action because it is always 
 * determined by the virtual mapping configuration, such as port mapping. - 
 * `actions' is ignored if the type of the flow filter is `drop'. Only the 
 * following flow actions can be configured into `actions'. - 
 * `vtn-set-dl-src-action' - `vtn-set-dl-dst-action' - `vtn-set-vlan-pcp-action' - 
 * `vtn-set-inet-src-action' - `vtn-set-inet-dst-action' - 
 * `vtn-set-inet-dscp-action' - `vtn-set-port-src-action' - 
 * `vtn-set-port-dst-action' - `vtn-set-icmp-type-action' - 
 * `vtn-set-icmp-code-action'
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * grouping vtn-flow-filter-config {
 *     leaf index {
 *         type int32;
 *     }
 *     leaf condition {
 *         type vnode-name;
 *     }
 *     choice vtn-flow-filter-type {
 *         case vtn-drop-filter-case {
 *             container vtn-drop-filter {
 *             }
 *         }
 *         case vtn-pass-filter-case {
 *             container vtn-pass-filter {
 *             }
 *         }
 *         case vtn-redirect-filter-case {
 *             container vtn-redirect-filter {
 *                 container redirect-destination {
 *                     leaf tenant-name {
 *                         type string;
 *                     }
 *                     leaf bridge-name {
 *                         type string;
 *                     }
 *                     leaf router-name {
 *                         type string;
 *                     }
 *                     leaf terminal-name {
 *                         type string;
 *                     }
 *                     leaf interface-name {
 *                         type string;
 *                     }
 *                     uses vnode-path-fields;
 *                 }
 *                 leaf output {
 *                     type boolean;
 *                 }
 *                 uses vtn-redirect-filter-config;
 *             }
 *         }
 *     }
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
 * <i>vtn-flow-filter/vtn-flow-filter-config</i>
 *
 */
public interface VtnFlowFilterConfig
    extends
    DataObject,
    VtnIndex,
    VtnFlowFilterTypeFields,
    VtnFlowActionList
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-flow-filter-config").intern();

    /**
     * The name of the flow condition that selects packets. This flow filter is 
     * invalidated if the flow condition specified by this field is not present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName</code> <code>condition</code>, or <code>null</code> if not present
     */
    VnodeName getCondition();

}

