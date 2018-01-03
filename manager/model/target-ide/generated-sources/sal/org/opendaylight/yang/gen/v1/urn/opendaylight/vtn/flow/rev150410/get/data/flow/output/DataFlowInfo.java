package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * A list of information about data flows that meets the condition specified by 
 * RPC input.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * list data-flow-info {
 *     key     container data-ingress-node {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *         leaf router-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *         leaf interface-name {
 *             type string;
 *         }
 *         uses vnode-path-fields;
 *     }
 *     container data-ingress-port {
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-port-location;
 *     }
 *     container data-egress-node {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *         leaf router-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *         leaf interface-name {
 *             type string;
 *         }
 *         uses vnode-path-fields;
 *     }
 *     container data-egress-port {
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-port-location;
 *     }
 *     container data-flow-match {
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
 *         uses vtn-match-fields;
 *     }
 *     list physical-route {
 *         key     leaf order {
 *             type int32;
 *         }
 *         leaf node {
 *             type node-id;
 *         }
 *         container physical-ingress-port {
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf port-name {
 *                 type string;
 *             }
 *             uses vtn-switch-port;
 *         }
 *         container physical-egress-port {
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf port-name {
 *                 type string;
 *             }
 *             uses vtn-switch-port;
 *         }
 *         uses physical-route-info;
 *         uses ordered;
 *     }
 *     container data-flow-stats {
 *         leaf packet-count {
 *             type counter64;
 *         }
 *         leaf byte-count {
 *             type counter64;
 *         }
 *         container duration {
 *             leaf second {
 *                 type counter32;
 *             }
 *             leaf nanosecond {
 *                 type counter32;
 *             }
 *         }
 *         uses generic-statistics;
 *     }
 *     container averaged-data-flow-stats {
 *         leaf packet-count {
 *             type decimal64;
 *         }
 *         leaf byte-count {
 *             type decimal64;
 *         }
 *         leaf start-time {
 *             type int64;
 *         }
 *         leaf end-time {
 *             type int64;
 *         }
 *         uses averaged-flow-stats-fields;
 *     }
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 *     leaf creation-time {
 *         type int64;
 *     }
 *     list virtual-route {
 *         key     leaf order {
 *             type int32;
 *         }
 *         container virtual-node-path {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             leaf bridge-name {
 *                 type string;
 *             }
 *             leaf router-name {
 *                 type string;
 *             }
 *             leaf terminal-name {
 *                 type string;
 *             }
 *             leaf interface-name {
 *                 type string;
 *             }
 *             uses vnode-path-fields;
 *         }
 *         leaf reason {
 *             type virtual-route-reason;
 *         }
 *         uses virtual-route-info;
 *         uses ordered;
 *     }
 *     leaf flow-id {
 *         type vtn-flow-id;
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
 *     uses vtn-data-flow-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/get-data-flow/output/data-flow-info</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfoBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfoBuilder
 *
 *
 */
public interface DataFlowInfo
    extends
    ChildOf<GetDataFlowOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>,
    VtnDataFlowInfo
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "data-flow-info").intern();


}

