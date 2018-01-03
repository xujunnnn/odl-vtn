package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataIngressNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataIngressPort;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressPort;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig;


/**
 * Describes a data flow established by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * grouping vtn-data-flow-info {
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
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 *     container data-ingress-node {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-info</i>
 *
 */
public interface VtnDataFlowInfo
    extends
    DataObject,
    VtnFlowTimeoutConfig,
    VtnDataFlowCommon,
    VtnFlowActionList
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "vtn-data-flow-info").intern();

    /**
     * The location of the virtual node which maps the incoming packet.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataIngressNode</code> <code>dataIngressNode</code>, or <code>null</code> if not present
     */
    DataIngressNode getDataIngressNode();
    
    /**
     * The location of the physical switch port where the incoming packet is received.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataIngressPort</code> <code>dataIngressPort</code>, or <code>null</code> if not present
     */
    DataIngressPort getDataIngressPort();
    
    /**
     * The location of the virtual node which sends the outgoing packet to the physical
     * network. Note that this container is omitted if this data flow discards the 
     * packet.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressNode</code> <code>dataEgressNode</code>, or <code>null</code> if not present
     */
    DataEgressNode getDataEgressNode();
    
    /**
     * The location of the physical switch port to which the outgoing packet is sent. 
     * Note that this container is omitted if this data flow discards the packet.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressPort</code> <code>dataEgressPort</code>, or <code>null</code> if not present
     */
    DataEgressPort getDataEgressPort();
    
    /**
     * The flow condition configured in the ingress flow entry. This container is 
     * omitted if the flow condition is not configured.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch</code> <code>dataFlowMatch</code>, or <code>null</code> if not present
     */
    DataFlowMatch getDataFlowMatch();
    
    /**
     * A sequence of `physical-route-info' which represents the packet route in the 
     * physical network. This list is omitted if this data flow discards the packet, or
     * if the physical packet route is not configured. Note that elements in this list 
     * needs to be sorted by `order' field in ascending order.
     *
     *
     *
     * @return <code>java.util.List</code> <code>physicalRoute</code>, or <code>null</code> if not present
     */
    List<PhysicalRoute> getPhysicalRoute();
    
    /**
     * Statistics information about this data flow. This container is omitted if 
     * statistics information is unavailable, or it is not configured.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats</code> <code>dataFlowStats</code>, or <code>null</code> if not present
     */
    DataFlowStats getDataFlowStats();
    
    /**
     * Statistics information per second about this data flow. This container is 
     * omitted if statistics information is unavailable, or it is not configured.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats</code> <code>averagedDataFlowStats</code>, or <code>null</code> if not present
     */
    AveragedDataFlowStats getAveragedDataFlowStats();

}

