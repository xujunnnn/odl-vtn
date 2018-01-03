package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterfaceList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterface;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * Describes virtual interface which can contain port mapping configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * list vinterface {
 *     key "name"
 *     container vinterface-status {
 *         leaf state {
 *             type vnode-state;
 *         }
 *         leaf entity-state {
 *             type vnode-state;
 *         }
 *         leaf mapped-port {
 *             type node-connector-id;
 *         }
 *         uses vtn-mappable-vinterface-status;
 *     }
 *     container port-map-config {
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-port-map-config;
 *     }
 *     leaf name {
 *         type vnode-name;
 *     }
 *     container vinterface-config {
 *         leaf description {
 *             type string;
 *         }
 *         leaf enabled {
 *             type boolean;
 *         }
 *         uses vtn-vinterface-config;
 *     }
 *     container vinterface-input-filter {
 *         list vtn-flow-filter {
 *             key "index"
 *             leaf condition {
 *                 type vnode-name;
 *             }
 *             leaf index {
 *                 type int32;
 *             }
 *             choice vtn-flow-filter-type {
 *                 case vtn-drop-filter-case {
 *                     container vtn-drop-filter {
 *                     }
 *                 }
 *                 case vtn-pass-filter-case {
 *                     container vtn-pass-filter {
 *                     }
 *                 }
 *                 case vtn-redirect-filter-case {
 *                     container vtn-redirect-filter {
 *                         container redirect-destination {
 *                             leaf tenant-name {
 *                                 type string;
 *                             }
 *                             leaf bridge-name {
 *                                 type string;
 *                             }
 *                             leaf router-name {
 *                                 type string;
 *                             }
 *                             leaf terminal-name {
 *                                 type string;
 *                             }
 *                             leaf interface-name {
 *                                 type string;
 *                             }
 *                             uses vnode-path-fields;
 *                         }
 *                         leaf output {
 *                             type boolean;
 *                         }
 *                         uses vtn-redirect-filter-config;
 *                     }
 *                 }
 *             }
 *             list vtn-flow-action {
 *                 key "order"
 *                 leaf order {
 *                     type int32;
 *                 }
 *                 choice vtn-action {
 *                     case vtn-drop-action-case {
 *                         container vtn-drop-action {
 *                         }
 *                     }
 *                     case vtn-pop-vlan-action-case {
 *                         container vtn-pop-vlan-action {
 *                         }
 *                     }
 *                     case vtn-push-vlan-action-case {
 *                         container vtn-push-vlan-action {
 *                             leaf vlan-type {
 *                                 type vlan-type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-dl-dst-action-case {
 *                         container vtn-set-dl-dst-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-dl-src-action-case {
 *                         container vtn-set-dl-src-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-icmp-code-action-case {
 *                         container vtn-set-icmp-code-action {
 *                             leaf code {
 *                                 type code;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-icmp-type-action-case {
 *                         container vtn-set-icmp-type-action {
 *                             leaf type {
 *                                 type type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dscp-action-case {
 *                         container vtn-set-inet-dscp-action {
 *                             leaf dscp {
 *                                 type dscp;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dst-action-case {
 *                         container vtn-set-inet-dst-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-inet-src-action-case {
 *                         container vtn-set-inet-src-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-dst-action-case {
 *                         container vtn-set-port-dst-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-src-action-case {
 *                         container vtn-set-port-src-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-vlan-id-action-case {
 *                         container vtn-set-vlan-id-action {
 *                             leaf vlan-id {
 *                                 type uint16;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-vlan-pcp-action-case {
 *                         container vtn-set-vlan-pcp-action {
 *                             leaf vlan-pcp {
 *                                 type vlan-pcp;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 uses vtn-ordered-flow-action;
 *             }
 *             uses vtn-flow-filter-config;
 *         }
 *         uses vtn-flow-filter-list;
 *     }
 *     container vinterface-output-filter {
 *         list vtn-flow-filter {
 *             key "index"
 *             leaf condition {
 *                 type vnode-name;
 *             }
 *             leaf index {
 *                 type int32;
 *             }
 *             choice vtn-flow-filter-type {
 *                 case vtn-drop-filter-case {
 *                     container vtn-drop-filter {
 *                     }
 *                 }
 *                 case vtn-pass-filter-case {
 *                     container vtn-pass-filter {
 *                     }
 *                 }
 *                 case vtn-redirect-filter-case {
 *                     container vtn-redirect-filter {
 *                         container redirect-destination {
 *                             leaf tenant-name {
 *                                 type string;
 *                             }
 *                             leaf bridge-name {
 *                                 type string;
 *                             }
 *                             leaf router-name {
 *                                 type string;
 *                             }
 *                             leaf terminal-name {
 *                                 type string;
 *                             }
 *                             leaf interface-name {
 *                                 type string;
 *                             }
 *                             uses vnode-path-fields;
 *                         }
 *                         leaf output {
 *                             type boolean;
 *                         }
 *                         uses vtn-redirect-filter-config;
 *                     }
 *                 }
 *             }
 *             list vtn-flow-action {
 *                 key "order"
 *                 leaf order {
 *                     type int32;
 *                 }
 *                 choice vtn-action {
 *                     case vtn-drop-action-case {
 *                         container vtn-drop-action {
 *                         }
 *                     }
 *                     case vtn-pop-vlan-action-case {
 *                         container vtn-pop-vlan-action {
 *                         }
 *                     }
 *                     case vtn-push-vlan-action-case {
 *                         container vtn-push-vlan-action {
 *                             leaf vlan-type {
 *                                 type vlan-type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-dl-dst-action-case {
 *                         container vtn-set-dl-dst-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-dl-src-action-case {
 *                         container vtn-set-dl-src-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-icmp-code-action-case {
 *                         container vtn-set-icmp-code-action {
 *                             leaf code {
 *                                 type code;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-icmp-type-action-case {
 *                         container vtn-set-icmp-type-action {
 *                             leaf type {
 *                                 type type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dscp-action-case {
 *                         container vtn-set-inet-dscp-action {
 *                             leaf dscp {
 *                                 type dscp;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dst-action-case {
 *                         container vtn-set-inet-dst-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-inet-src-action-case {
 *                         container vtn-set-inet-src-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-dst-action-case {
 *                         container vtn-set-port-dst-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-src-action-case {
 *                         container vtn-set-port-src-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-vlan-id-action-case {
 *                         container vtn-set-vlan-id-action {
 *                             leaf vlan-id {
 *                                 type uint16;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-vlan-pcp-action-case {
 *                         container vtn-set-vlan-pcp-action {
 *                             leaf vlan-pcp {
 *                                 type vlan-pcp;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 uses vtn-ordered-flow-action;
 *             }
 *             uses vtn-flow-filter-config;
 *         }
 *         uses vtn-flow-filter-list;
 *     }
 *     uses vtn-mappable-vinterface;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/vtn-mappable-vinterface-list/vinterface</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.VinterfaceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.VinterfaceBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.VinterfaceKey
 *
 */
public interface Vinterface
    extends
    ChildOf<VtnMappableVinterfaceList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>,
    VtnMappableVinterface,
    Identifiable<VinterfaceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "vinterface").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.VinterfaceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VinterfaceKey getKey();

}

