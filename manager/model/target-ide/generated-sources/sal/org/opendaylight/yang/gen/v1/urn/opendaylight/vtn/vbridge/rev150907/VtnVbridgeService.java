package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-vbridge</b>
 * <pre>
 * rpc remove-vbridge {
 *     "Remove the specified vBridge.
 *     
 *                All the virtual interfaces inside the specified vBridge will also
 *                be removed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the VTN specified by `tenant-name' is not
 *                present.
 *     
 *                `NOTFOUND' is set if the specified vBridge is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *     }
 * }
 * rpc update-vbridge {
 *     "Create or modify the specified vBridge.
 *     
 *                Upon successful completion, the result of this operation will be
 *                set to the `status' field in the RPC output.
 *     
 *                `CREATED' indicates that the specified vBridge has been newly
 *                created.
 *     
 *                `CHANGED' indicates that the configuration for the specified
 *                vBridge has been changed.
 *     
 *                Null indicates that the configuration for the specified vBridge was
 *                not changed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the VTN specified by `tenant-name' is not
 *                present.
 *     
 *                `NOTFOUND' is set if `update-mode' field in the RPC input is
 *                `MODIFY' and the specified vBridge is not present.
 *     
 *                `CONFLICT' is set if `update-mode' field in the RPC input is
 *                `CREATE' and the specified vBridge is present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *         leaf update-mode {
 *             type update-mode;
 *         }
 *         leaf operation {
 *             type operation;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf age-interval {
 *             type int32;
 *         }
 *     }
 *     
 *     output {
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnVbridgeService
    extends
    RpcService
{




    /**
     * Remove the specified vBridge. All the virtual interfaces inside the specified 
     * vBridge will also be removed. On failure, one of vtn-error-tag value which 
     * indicates the cause of error is set into application tag in RPC error. 
     * `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is set if
     * the VTN specified by `tenant-name' is not present. `NOTFOUND' is set if the 
     * specified vBridge is not present. `INTERNALERROR' is set if the operation failed
     * due to internal error.
     *
     */
    Future<RpcResult<java.lang.Void>> removeVbridge(RemoveVbridgeInput input);
    
    /**
     * Create or modify the specified vBridge. Upon successful completion, the result 
     * of this operation will be set to the `status' field in the RPC output. `CREATED'
     * indicates that the specified vBridge has been newly created. `CHANGED' indicates
     * that the configuration for the specified vBridge has been changed. Null 
     * indicates that the configuration for the specified vBridge was not changed. On 
     * failure, one of vtn-error-tag value which indicates the cause of error is set 
     * into application tag in RPC error. `BADREQUEST' is set if the RPC input contains
     * invalid data. `NOTFOUND' is set if the VTN specified by `tenant-name' is not 
     * present. `NOTFOUND' is set if `update-mode' field in the RPC input is `MODIFY' 
     * and the specified vBridge is not present. `CONFLICT' is set if `update-mode' 
     * field in the RPC input is `CREATE' and the specified vBridge is present. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<UpdateVbridgeOutput>> updateVbridge(UpdateVbridgeInput input);

}

