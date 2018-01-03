package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-flow-filter</b>
 * <pre>
 * rpc set-flow-filter {
 *     "Create or modify the flow filter.
 *     
 *                This operation takes a list of `vtn-flow-filter-config', and
 *                put all configurations into the flow filter list specified by
 *                `vtn-flow-filter-id' in the RPC input.
 *     
 *                Flow filter indices specified in the RPC input will be copied to
 *                the RPC output, and `status' field in `vtn-flow-filter-result'
 *                describes the result of the operation. Note that a duplicate flow
 *                filter index in the RPC input will cause a `BADREQUEST' error.
 *     
 *                `CREATED' indicates that new flow filter has been associated with
 *                the given index number in the specified flow filter list.
 *     
 *                `CHANGED' indicates that the flow filter specified by the given
 *                index number has been modified as specified by the RPC input.
 *     
 *                Null indicates that the flow filter specified by the given index
 *                was not changed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the virtual node which contains the specified
 *                flow filter list is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf output {
 *             type boolean;
 *         }
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
 *     }
 *     
 *     output {
 *         list flow-filter-result {
 *             key     leaf index {
 *                 type int32;
 *             }
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *             uses vtn-rpc-result;
 *         }
 *     }
 * }
 * rpc remove-flow-filter {
 *     "Remove the specified flow filters.
 *     
 *                Index numbers for flow filters passed to `indices' list in the RPC
 *                input will be copied to the RPC output, and `status' field in the
 *                RPC output describes the result of the operation.
 *     
 *                `REMOVED' indicates that the flow filter specified by `index' field
 *                in the RPC output has been removed.
 *     
 *                Null indicates that the flow filter specified by `index' field is
 *                not present in the flow filter list specified by the RPC input.
 *     
 *                If no flow filter index is specified by the RPC input, all the
 *                flow filters in the specified flow filter list will be removed.
 *                In this case indices of all the removed flow filters will be copied
 *                to the RPC output. `flow-filter-result' in the RPC output will be
 *                null if no flow filter index is specified by the RPC input and
 *                the specified flow filter list is empty.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the virtual node which contains the specified
 *                flow filter list is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf output {
 *             type boolean;
 *         }
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
 *         leaf-list indices {
 *             type int32;
 *         }
 *     }
 *     
 *     output {
 *         list flow-filter-result {
 *             key     leaf index {
 *                 type int32;
 *             }
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *             uses vtn-rpc-result;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnFlowFilterService
    extends
    RpcService
{




    /**
     * Create or modify the flow filter. This operation takes a list of 
     * `vtn-flow-filter-config', and put all configurations into the flow filter list 
     * specified by `vtn-flow-filter-id' in the RPC input. Flow filter indices 
     * specified in the RPC input will be copied to the RPC output, and `status' field 
     * in `vtn-flow-filter-result' describes the result of the operation. Note that a 
     * duplicate flow filter index in the RPC input will cause a `BADREQUEST' error. 
     * `CREATED' indicates that new flow filter has been associated with the given 
     * index number in the specified flow filter list. `CHANGED' indicates that the 
     * flow filter specified by the given index number has been modified as specified 
     * by the RPC input. Null indicates that the flow filter specified by the given 
     * index was not changed. On failure, one of vtn-error-tag value which indicates 
     * the cause of error is set into application tag in RPC error. `BADREQUEST' is set
     * if the RPC input contains invalid data. `NOTFOUND' is set if the virtual node 
     * which contains the specified flow filter list is not present. `INTERNALERROR' is
     * set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<SetFlowFilterOutput>> setFlowFilter(SetFlowFilterInput input);
    
    /**
     * Remove the specified flow filters. Index numbers for flow filters passed to 
     * `indices' list in the RPC input will be copied to the RPC output, and `status' 
     * field in the RPC output describes the result of the operation. `REMOVED' 
     * indicates that the flow filter specified by `index' field in the RPC output has 
     * been removed. Null indicates that the flow filter specified by `index' field is 
     * not present in the flow filter list specified by the RPC input. If no flow 
     * filter index is specified by the RPC input, all the flow filters in the 
     * specified flow filter list will be removed. In this case indices of all the 
     * removed flow filters will be copied to the RPC output. `flow-filter-result' in 
     * the RPC output will be null if no flow filter index is specified by the RPC 
     * input and the specified flow filter list is empty. On failure, one of 
     * vtn-error-tag value which indicates the cause of error is set into application 
     * tag in RPC error. `BADREQUEST' is set if the RPC input contains invalid data. 
     * `NOTFOUND' is set if the virtual node which contains the specified flow filter 
     * list is not present. `INTERNALERROR' is set if the operation failed due to 
     * internal error.
     *
     */
    Future<RpcResult<RemoveFlowFilterOutput>> removeFlowFilter(RemoveFlowFilterInput input);

}

