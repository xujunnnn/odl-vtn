package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-path-policy</b>
 * <pre>
 * rpc set-path-cost {
 *     "Associate the cost of transmitting a packet with the specified
 *                switch port in the specified path policy.
 *     
 *                This operation takes a list of `vtn-path-cost-config', and
 *                put all configurations in that list into the specified path policy.
 *     
 *                Switch port descriptors specified in the RPC input will be copied
 *                to the RPC output, and `status' field in `vtn-port-desc-result'
 *                describes the result of the opration.
 *     
 *                `CREATED' indicates that the link cost configuration for the
 *                switch port specified by `port-desc' has been newly created.
 *     
 *                'CHANGED' indicates that the link cost configuration for the
 *                switch port specified by `port-desc' has been successfully changed.
 *     
 *                Null indicates that the link cost configuration for the switch
 *                port specified by `port-desc' was not changed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the specified path policy is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf id {
 *             type int32;
 *         }
 *         list path-cost-list {
 *             key     leaf port-desc {
 *                 type vtn-port-desc;
 *             }
 *             leaf cost {
 *                 type cost;
 *             }
 *             uses vtn-path-cost-config;
 *         }
 *     }
 *     
 *     output {
 *         list set-path-cost-result {
 *             key     leaf port-desc {
 *                 type vtn-port-desc;
 *             }
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *             uses vtn-port-desc-result;
 *         }
 *     }
 * }
 * rpc remove-path-cost {
 *     "Remove link cost configurations for all the given switch ports in
 *                the given path policy configuration.
 *     
 *                Values passed to `port-desc' list will be copied to the RPC output,
 *                and `status' field in `vtn-port-desc-result' describes the result
 *                of the opration.
 *     
 *                `REMOVED' indicates that the link cost configuration for the switch
 *                port associated with the `vtn-port-desc' value has been
 *                successfully removed.
 *     
 *                Null indicates that the link cost configuration for the switch
 *                port specified by `port-desc' was not configured in the specified
 *                path policy.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the specified path policy is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf id {
 *             type int32;
 *         }
 *         leaf-list port-desc {
 *             type vtn-port-desc;
 *         }
 *     }
 *     
 *     output {
 *         list remove-path-cost-result {
 *             key     leaf port-desc {
 *                 type vtn-port-desc;
 *             }
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *             uses vtn-port-desc-result;
 *         }
 *     }
 * }
 * rpc clear-path-policy {
 *     "Remove all the path policies.
 *     
 *                `status' in RPC output descripts the result of the operation.
 *     
 *                `REMOVED' indicates that at least one path policy has been removed.
 *     
 *                Null indicates that no path policy is present.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *     }
 *     
 *     output {
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 * }
 * rpc set-path-policy {
 *     "Create or modify the path policy.
 *     
 *                If the path policy specified by the path policy ID does not exist,
 *                a new path policy will be associated with the specified ID.
 *                If the path policy specified by the path policy ID already exists,
 *                it will be modified as specified by the RPC input.
 *     
 *                `status' in RPC output describes the result of the operation.
 *     
 *                `CREATED' indicates that the specified path policy has been newly
 *                created.
 *     
 *                `CHANGED' indicates that existing path policy configuration has
 *                been successfully changed.
 *     
 *                Null indicates that existing path policy configuration was not
 *                changed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if true is set to `present' field in the RPC
 *                input and the target path policy is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf id {
 *             type int32;
 *         }
 *         leaf default-cost {
 *             type default-cost;
 *         }
 *         list vtn-path-cost {
 *             key "port-desc"
 *             leaf port-desc {
 *                 type vtn-port-desc;
 *             }
 *             leaf cost {
 *                 type cost;
 *             }
 *             uses vtn-path-cost-config;
 *         }
 *         leaf operation {
 *             type vtn-update-operation-type;
 *         }
 *         leaf present {
 *             type boolean;
 *         }
 *     }
 *     
 *     output {
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 * }
 * rpc remove-path-policy {
 *     "Remove the path policy specified by the path policy identifier.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the specified path policy is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf id {
 *             type int32;
 *         }
 *     }
 *     
 *     output {
 *     }
 * }
 * </pre>
 *
 */
public interface VtnPathPolicyService
    extends
    RpcService
{




    /**
     * Associate the cost of transmitting a packet with the specified switch port in 
     * the specified path policy. This operation takes a list of 
     * `vtn-path-cost-config', and put all configurations in that list into the 
     * specified path policy. Switch port descriptors specified in the RPC input will 
     * be copied to the RPC output, and `status' field in `vtn-port-desc-result' 
     * describes the result of the opration. `CREATED' indicates that the link cost 
     * configuration for the switch port specified by `port-desc' has been newly 
     * created. 'CHANGED' indicates that the link cost configuration for the switch 
     * port specified by `port-desc' has been successfully changed. Null indicates that
     * the link cost configuration for the switch port specified by `port-desc' was not
     * changed. On failure, one of vtn-error-tag value which indicates the cause of 
     * error is set into application tag in RPC error. `BADREQUEST' is set if the RPC 
     * input contains invalid data. `NOTFOUND' is set if the specified path policy is 
     * not present. `INTERNALERROR' is set if the operation failed due to internal 
     * error.
     *
     */
    Future<RpcResult<SetPathCostOutput>> setPathCost(SetPathCostInput input);
    
    /**
     * Remove link cost configurations for all the given switch ports in the given path
     * policy configuration. Values passed to `port-desc' list will be copied to the 
     * RPC output, and `status' field in `vtn-port-desc-result' describes the result of
     * the opration. `REMOVED' indicates that the link cost configuration for the 
     * switch port associated with the `vtn-port-desc' value has been successfully 
     * removed. Null indicates that the link cost configuration for the switch port 
     * specified by `port-desc' was not configured in the specified path policy. On 
     * failure, one of vtn-error-tag value which indicates the cause of error is set 
     * into application tag in RPC error. `BADREQUEST' is set if the RPC input contains
     * invalid data. `NOTFOUND' is set if the specified path policy is not present. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<RemovePathCostOutput>> removePathCost(RemovePathCostInput input);
    
    /**
     * Remove all the path policies. `status' in RPC output descripts the result of the
     * operation. `REMOVED' indicates that at least one path policy has been removed. 
     * Null indicates that no path policy is present. On failure, one of vtn-error-tag 
     * value which indicates the cause of error is set into application tag in RPC 
     * error. `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<ClearPathPolicyOutput>> clearPathPolicy();
    
    /**
     * Create or modify the path policy. If the path policy specified by the path 
     * policy ID does not exist, a new path policy will be associated with the 
     * specified ID. If the path policy specified by the path policy ID already exists,
     * it will be modified as specified by the RPC input. `status' in RPC output 
     * describes the result of the operation. `CREATED' indicates that the specified 
     * path policy has been newly created. `CHANGED' indicates that existing path 
     * policy configuration has been successfully changed. Null indicates that existing
     * path policy configuration was not changed. On failure, one of vtn-error-tag 
     * value which indicates the cause of error is set into application tag in RPC 
     * error. `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is
     * set if true is set to `present' field in the RPC input and the target path 
     * policy is not present. `INTERNALERROR' is set if the operation failed due to 
     * internal error.
     *
     */
    Future<RpcResult<SetPathPolicyOutput>> setPathPolicy(SetPathPolicyInput input);
    
    /**
     * Remove the path policy specified by the path policy identifier. On failure, one 
     * of vtn-error-tag value which indicates the cause of error is set into 
     * application tag in RPC error. `BADREQUEST' is set if the RPC input contains 
     * invalid data. `NOTFOUND' is set if the specified path policy is not present. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<java.lang.Void>> removePathPolicy(RemovePathPolicyInput input);

}

