package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterConfig;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * Describes a list of flow filters configured in a virtual node in VTN. Each flow 
 * filter in this list needs to have a unique index in `index' field. `index' 
 * is used to determine order of flow filter evaluation. Flow filters in this list 
 * are evaluated against packet in ascending order of `index' value, and only the 
 * first matched flow filter is applied to the packet.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * list vtn-flow-filter {
 *     key "index"
 *     leaf condition {
 *         type vnode-name;
 *     }
 *     leaf index {
 *         type int32;
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
 *     uses vtn-flow-filter-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-list/vtn-flow-filter</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilterBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilterBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilterKey
 *
 */
public interface VtnFlowFilter
    extends
    ChildOf<VtnFlowFilterList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>,
    VtnFlowFilterConfig,
    Identifiable<VtnFlowFilterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-flow-filter").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VtnFlowFilterKey getKey();

}

