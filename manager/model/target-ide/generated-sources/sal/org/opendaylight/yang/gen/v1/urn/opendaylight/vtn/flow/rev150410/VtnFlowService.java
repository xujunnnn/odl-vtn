package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-flow</b>
 * <pre>
 * rpc get-data-flow {
 *     "Return information about data flows specified by the RPC input.
 *     
 *                The RPC input specifies the condition to select data flows to be
 *                returned. If more than one conditions are specified, data flows
 *                that meets all the specified conditions will be returned.
 *     
 *                If `flow-id' is specified, only a data flow specified by the
 *                flow ID will be selected.
 *     
 *                If `node' is specified, only data flows that forward packets via
 *                the specified switch will be selected.
 *     
 *                If `data-flow-port' is specified, only data flows that forward
 *                packets via the specified switch port will be selected.
 *                Note that `data-flow-port' field is ignored unless `node' field
 *                is specified.
 *     
 *                If `data-flow-source' is specified, only data flows that map
 *                packets sent by the specified L2 host will be selected.
 *     
 *                On successful completion, information about data flows specified
 *                by the RPC input is set to the RPC output.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the specified VTN is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf flow-id {
 *             type vtn-flow-id;
 *         }
 *         leaf mode {
 *             type mode;
 *         }
 *         leaf node {
 *             type node-id;
 *         }
 *         container data-flow-port {
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf port-name {
 *                 type string;
 *             }
 *             uses vtn-switch-port;
 *         }
 *         container data-flow-source {
 *             leaf mac-address {
 *                 type mac-address;
 *             }
 *             leaf vlan-id {
 *                 type vlan-id;
 *             }
 *             uses vlan-host;
 *         }
 *         leaf average-interval {
 *             type average-interval;
 *         }
 *     }
 *     
 *     output {
 *         list data-flow-info {
 *             key     container data-ingress-node {
 *                 leaf tenant-name {
 *                     type string;
 *                 }
 *                 leaf bridge-name {
 *                     type string;
 *                 }
 *                 leaf router-name {
 *                     type string;
 *                 }
 *                 leaf terminal-name {
 *                     type string;
 *                 }
 *                 leaf interface-name {
 *                     type string;
 *                 }
 *                 uses vnode-path-fields;
 *             }
 *             container data-ingress-port {
 *                 leaf node {
 *                     type node-id;
 *                 }
 *                 leaf port-id {
 *                     type string;
 *                 }
 *                 leaf port-name {
 *                     type string;
 *                 }
 *                 uses vtn-port-location;
 *             }
 *             container data-egress-node {
 *                 leaf tenant-name {
 *                     type string;
 *                 }
 *                 leaf bridge-name {
 *                     type string;
 *                 }
 *                 leaf router-name {
 *                     type string;
 *                 }
 *                 leaf terminal-name {
 *                     type string;
 *                 }
 *                 leaf interface-name {
 *                     type string;
 *                 }
 *                 uses vnode-path-fields;
 *             }
 *             container data-egress-port {
 *                 leaf node {
 *                     type node-id;
 *                 }
 *                 leaf port-id {
 *                     type string;
 *                 }
 *                 leaf port-name {
 *                     type string;
 *                 }
 *                 uses vtn-port-location;
 *             }
 *             container data-flow-match {
 *                 container vtn-ether-match {
 *                     leaf source-address {
 *                         type mac-address;
 *                     }
 *                     leaf destination-address {
 *                         type mac-address;
 *                     }
 *                     leaf ether-type {
 *                         type ether-type;
 *                     }
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                     leaf vlan-pcp {
 *                         type vlan-pcp;
 *                     }
 *                     uses vtn-ether-match-fields;
 *                 }
 *                 container vtn-inet-match {
 *                     leaf source-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf destination-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf protocol {
 *                         type uint8;
 *                     }
 *                     leaf dscp {
 *                         type dscp;
 *                     }
 *                     uses vtn-inet-match-fields;
 *                 }
 *                 choice vtn-layer4-match {
 *                     case vtn-icmp-match {
 *                         leaf icmp-type {
 *                             type uint8;
 *                         }
 *                         leaf icmp-code {
 *                             type uint8;
 *                         }
 *                     }
 *                     case vtn-tcp-match {
 *                         container tcp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container tcp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                     case vtn-udp-match {
 *                         container udp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container udp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                 }
 *                 uses vtn-match-fields;
 *             }
 *             list physical-route {
 *                 key     leaf order {
 *                     type int32;
 *                 }
 *                 leaf node {
 *                     type node-id;
 *                 }
 *                 container physical-ingress-port {
 *                     leaf port-id {
 *                         type string;
 *                     }
 *                     leaf port-name {
 *                         type string;
 *                     }
 *                     uses vtn-switch-port;
 *                 }
 *                 container physical-egress-port {
 *                     leaf port-id {
 *                         type string;
 *                     }
 *                     leaf port-name {
 *                         type string;
 *                     }
 *                     uses vtn-switch-port;
 *                 }
 *                 uses physical-route-info;
 *                 uses ordered;
 *             }
 *             container data-flow-stats {
 *                 leaf packet-count {
 *                     type counter64;
 *                 }
 *                 leaf byte-count {
 *                     type counter64;
 *                 }
 *                 container duration {
 *                     leaf second {
 *                         type counter32;
 *                     }
 *                     leaf nanosecond {
 *                         type counter32;
 *                     }
 *                 }
 *                 uses generic-statistics;
 *             }
 *             container averaged-data-flow-stats {
 *                 leaf packet-count {
 *                     type decimal64;
 *                 }
 *                 leaf byte-count {
 *                     type decimal64;
 *                 }
 *                 leaf start-time {
 *                     type int64;
 *                 }
 *                 leaf end-time {
 *                     type int64;
 *                 }
 *                 uses averaged-flow-stats-fields;
 *             }
 *             leaf idle-timeout {
 *                 type uint16;
 *             }
 *             leaf hard-timeout {
 *                 type uint16;
 *             }
 *             leaf creation-time {
 *                 type int64;
 *             }
 *             list virtual-route {
 *                 key     leaf order {
 *                     type int32;
 *                 }
 *                 container virtual-node-path {
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
 *                 leaf reason {
 *                     type virtual-route-reason;
 *                 }
 *                 uses virtual-route-info;
 *                 uses ordered;
 *             }
 *             leaf flow-id {
 *                 type vtn-flow-id;
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
 *             uses vtn-data-flow-info;
 *         }
 *     }
 * }
 * rpc get-data-flow-count {
 *     "Return the number of data flows present in the specified VTN.
 *     
 *                On successful completion, the number of data flows is set to the
 *                RPC output.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the specified VTN is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf count {
 *             type int32;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnFlowService
    extends
    RpcService
{




    /**
     * Return information about data flows specified by the RPC input. The RPC input 
     * specifies the condition to select data flows to be returned. If more than one 
     * conditions are specified, data flows that meets all the specified conditions 
     * will be returned. If `flow-id' is specified, only a data flow specified by the 
     * flow ID will be selected. If `node' is specified, only data flows that forward 
     * packets via the specified switch will be selected. If `data-flow-port' is 
     * specified, only data flows that forward packets via the specified switch port 
     * will be selected. Note that `data-flow-port' field is ignored unless `node' 
     * field is specified. If `data-flow-source' is specified, only data flows that map
     * packets sent by the specified L2 host will be selected. On successful 
     * completion, information about data flows specified by the RPC input is set to 
     * the RPC output. On failure, one of vtn-error-tag value which indicates the cause
     * of error is set into application tag in RPC error. `BADREQUEST' is set if the 
     * RPC input contains invalid data. `NOTFOUND' is set if the specified VTN is not 
     * present. `INTERNALERROR' is set if the operation failed due to internal error.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>dataFlow</code>, or <code>null</code> if not present
     */
    Future<RpcResult<GetDataFlowOutput>> getDataFlow(GetDataFlowInput input);
    
    /**
     * Return the number of data flows present in the specified VTN. On successful 
     * completion, the number of data flows is set to the RPC output. On failure, one 
     * of vtn-error-tag value which indicates the cause of error is set into 
     * application tag in RPC error. `BADREQUEST' is set if the RPC input contains 
     * invalid data. `NOTFOUND' is set if the specified VTN is not present. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>dataFlowCount</code>, or <code>null</code> if not present
     */
    Future<RpcResult<GetDataFlowCountOutput>> getDataFlowCount(GetDataFlowCountInput input);

}

