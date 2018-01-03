package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-vinterface</b>
 * <pre>
 * rpc update-vinterface {
 *     "Create or modify the specified virtual interface.
 *     
 *                If `bridge-name' field in the RPC input is configured, the virtual
 *                interface inside the specified vBridge will be creted or modified.
 *                If `bridge-name field is omitted and `terminal-name' field in the
 *                RPC input is configured, the virtual interface inside the
 *                specified vTerminal will be created or modified.
 *     
 *                Upon successful completion, the result of this operation will be
 *                set to the `status' field in the RPC output.
 *     
 *                `CREATED' indicates that the specified virtual interface has
 *                been newly created.
 *     
 *                `CHANGED' indicates that the configuration for the specified
 *                virtual interface has been changed.
 *     
 *                Null indicates that the configuration for the specified virtual
 *                interface was not changed.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the VTN specified by `tenant-name' is not
 *                present.
 *     
 *                `NOTFOUND' is set if the vBridge specified by `tenant-name' and
 *                `bridge-name' is not present.
 *     
 *                `NOTFOUND' is set if the vTerminal specified by `tenant-name' and
 *                `terminal-name' is not present.
 *     
 *                `NOTFOUND' is set if `update-mode' field in the RPC input is
 *                `MODIFY' and the specified virtual interface is not present.
 *     
 *                `CONFLICT' is set if `update-mode' field in the RPC input is
 *                `CREATE' and the specified virtual interface is present.
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
 *         leaf router-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *         leaf interface-name {
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
 *         leaf enabled {
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
 * rpc remove-vinterface {
 *     "Remove the specified virtual interface.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the VTN specified by `tenant-name' is not
 *                present.
 *     
 *                `NOTFOUND' is set if the vBridge specified by `tenant-name' and
 *                `bridge-name' is not present.
 *     
 *                `NOTFOUND' is set if the vTerminal specified by `tenant-name' and
 *                `terminal-name' is not present.
 *     
 *                `NOTFOUND' is set if the virtual interface specified by the RPC
 *                input is not present.
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
 *         leaf router-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *         leaf interface-name {
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
public interface VtnVinterfaceService
    extends
    RpcService
{




    /**
     * Create or modify the specified virtual interface. If `bridge-name' field in the 
     * RPC input is configured, the virtual interface inside the specified vBridge will
     * be creted or modified. If `bridge-name field is omitted and `terminal-name' 
     * field in the RPC input is configured, the virtual interface inside the specified
     * vTerminal will be created or modified. Upon successful completion, the result of
     * this operation will be set to the `status' field in the RPC output. `CREATED' 
     * indicates that the specified virtual interface has been newly created. `CHANGED'
     * indicates that the configuration for the specified virtual interface has been 
     * changed. Null indicates that the configuration for the specified virtual 
     * interface was not changed. On failure, one of vtn-error-tag value which 
     * indicates the cause of error is set into application tag in RPC error. 
     * `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is set if
     * the VTN specified by `tenant-name' is not present. `NOTFOUND' is set if the 
     * vBridge specified by `tenant-name' and `bridge-name' is not present. `NOTFOUND' 
     * is set if the vTerminal specified by `tenant-name' and `terminal-name' is not 
     * present. `NOTFOUND' is set if `update-mode' field in the RPC input is `MODIFY' 
     * and the specified virtual interface is not present. `CONFLICT' is set if 
     * `update-mode' field in the RPC input is `CREATE' and the specified virtual 
     * interface is present. `INTERNALERROR' is set if the operation failed due to 
     * internal error.
     *
     */
    Future<RpcResult<UpdateVinterfaceOutput>> updateVinterface(UpdateVinterfaceInput input);
    
    /**
     * Remove the specified virtual interface. On failure, one of vtn-error-tag value 
     * which indicates the cause of error is set into application tag in RPC error. 
     * `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is set if
     * the VTN specified by `tenant-name' is not present. `NOTFOUND' is set if the 
     * vBridge specified by `tenant-name' and `bridge-name' is not present. `NOTFOUND' 
     * is set if the vTerminal specified by `tenant-name' and `terminal-name' is not 
     * present. `NOTFOUND' is set if the virtual interface specified by the RPC input 
     * is not present. `INTERNALERROR' is set if the operation failed due to internal 
     * error.
     *
     */
    Future<RpcResult<java.lang.Void>> removeVinterface(RemoveVinterfaceInput input);

}

