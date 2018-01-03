package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn</b>
 * <pre>
 * rpc remove-vtn {
 *     "Remove the VTN specified by the name.
 *     
 *                All the virtual networking node in the specified VTN, such as
 *                vBridge, will also be removed.
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
 *     }
 * }
 * rpc update-vtn {
 *     "Create or modify the VTN specified by the name.
 *     
 *                Upon successful completion, the result of this operation will be
 *                set to the `status' field in the RPC output.
 *     
 *                `CREATED' indicates that the specified VTN has been newly created.
 *     
 *                `CHANGED' indicates that the configuration for the specified VTN
 *                has been changed.
 *     
 *                Null indicates that the configuration for the specified VTN was not
 *                changed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `CONFLICT' is set if `update-mode' field in the RPC input is
 *                `CREATE' and the specified VTN is present.
 *     
 *                `NOTFOUND' is set if `update-mode' field in the RPC input is
 *                `MODIFY' and the specified VTN is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
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
 *         leaf idle-timeout {
 *             type uint16;
 *         }
 *         leaf hard-timeout {
 *             type uint16;
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
public interface VtnService
    extends
    RpcService
{




    /**
     * Remove the VTN specified by the name. All the virtual networking node in the 
     * specified VTN, such as vBridge, will also be removed. On failure, one of 
     * vtn-error-tag value which indicates the cause of error is set into application 
     * tag in RPC error. `BADREQUEST' is set if the RPC input contains invalid data. 
     * `NOTFOUND' is set if the specified VTN is not present. `INTERNALERROR' is set if
     * the operation failed due to internal error.
     *
     */
    Future<RpcResult<java.lang.Void>> removeVtn(RemoveVtnInput input);
    
    /**
     * Create or modify the VTN specified by the name. Upon successful completion, the 
     * result of this operation will be set to the `status' field in the RPC output. 
     * `CREATED' indicates that the specified VTN has been newly created. `CHANGED' 
     * indicates that the configuration for the specified VTN has been changed. Null 
     * indicates that the configuration for the specified VTN was not changed. On 
     * failure, one of vtn-error-tag value which indicates the cause of error is set 
     * into application tag in RPC error. `BADREQUEST' is set if the RPC input contains
     * invalid data. `CONFLICT' is set if `update-mode' field in the RPC input is 
     * `CREATE' and the specified VTN is present. `NOTFOUND' is set if `update-mode' 
     * field in the RPC input is `MODIFY' and the specified VTN is not present. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<UpdateVtnOutput>> updateVtn(UpdateVtnInput input);

}

