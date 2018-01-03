package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-vterminal</b>
 * <pre>
 * rpc update-vterminal {
 *     "Create or modify the specified vTerminal.
 *     
 *                Upon successful completion, the result of this operation will be
 *                set to the `status' field in the RPC output.
 *     
 *                `CREATED' indicates that the specified vTerminal has been newly
 *                created.
 *     
 *                `CHANGED' indicates that the configuration for the specified
 *                vTerminal has been changed.
 *     
 *                Null indicates that the configuration for the specified vTerminal
 *                was not changed.
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
 *                `MODIFY' and the specified vTerminal is not present.
 *     
 *                `CONFLICT' is set if `update-mode' field in the RPC input is
 *                `CREATE' and the specified vTerminal is present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf terminal-name {
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
 *     }
 *     
 *     output {
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 * }
 * rpc remove-vterminal {
 *     "Remove the specified vTerminal.
 *     
 *                All the virtual interfaces inside the specified vTerminal will
 *                also be removed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the VTN specified by `tenant-name' is not
 *                present.
 *     
 *                `NOTFOUND' is set if the specified vTerminal is not present.
 *     
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *     }
 * }
 * </pre>
 *
 */
public interface VtnVterminalService
    extends
    RpcService
{




    /**
     * Create or modify the specified vTerminal. Upon successful completion, the result
     * of this operation will be set to the `status' field in the RPC output. `CREATED'
     * indicates that the specified vTerminal has been newly created. `CHANGED' 
     * indicates that the configuration for the specified vTerminal has been changed. 
     * Null indicates that the configuration for the specified vTerminal was not 
     * changed. On failure, one of vtn-error-tag value which indicates the cause of 
     * error is set into application tag in RPC error. `BADREQUEST' is set if the RPC 
     * input contains invalid data. `NOTFOUND' is set if the VTN specified by 
     * `tenant-name' is not present. `NOTFOUND' is set if `update-mode' field in the 
     * RPC input is `MODIFY' and the specified vTerminal is not present. `CONFLICT' is 
     * set if `update-mode' field in the RPC input is `CREATE' and the specified 
     * vTerminal is present. `INTERNALERROR' is set if the operation failed due to 
     * internal error.
     *
     */
    Future<RpcResult<UpdateVterminalOutput>> updateVterminal(UpdateVterminalInput input);
    
    /**
     * Remove the specified vTerminal. All the virtual interfaces inside the specified 
     * vTerminal will also be removed. On failure, one of vtn-error-tag value which 
     * indicates the cause of error is set into application tag in RPC error. 
     * `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is set if
     * the VTN specified by `tenant-name' is not present. `NOTFOUND' is set if the 
     * specified vTerminal is not present. `INTERNALERROR' is set if the operation 
     * failed due to internal error.
     *
     */
    Future<RpcResult<java.lang.Void>> removeVterminal(RemoveVterminalInput input);

}

