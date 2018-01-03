package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-mac-table</b>
 * <pre>
 * rpc remove-mac-entry {
 *     "Remove the specified MAC address information from the MAC address
 *                table in the specified vBridge.
 *     
 *                MAC addresses passed to `mac-addresses' list will be copied to the
 *                RPC output, and `status' field in the RPC output descripes the
 *                result of the operation.
 *     
 *                `REMOVED' indicates that the MAC address specified by `mac-address'
 *                field in the RPC output has been successfully removed.
 *     
 *                Null indicates that the MAC address specified by `mac-address'
 *                field in the RPC output is not learned by the vBridge specified by
 *                the RPC input.
 *     
 *                If no MAC address is specified by the RPC input, all the MAC
 *                addresses in the MAC address table will be removed. In this case
 *                all the removed MAC addresses will be copied to the RPC output.
 *                `remove-mac-entry-result' will be null if no MAC address is
 *                specified by the RPC input and the specified MAC address table is
 *                empty.
 *     
 *                On failure, one of vtn-error-tag value which indicates the cause
 *                of error is set into application tag in RPC error.
 *     
 *                `BADREQUEST' is set if the RPC input contains invalid data.
 *     
 *                `NOTFOUND' is set if the VTN or the vBridge specified by the RPC
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
 *         leaf-list mac-addresses {
 *             type mac-address;
 *         }
 *     }
 *     
 *     output {
 *         list remove-mac-entry-result {
 *             key     leaf mac-address {
 *                 type mac-address;
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
public interface VtnMacTableService
    extends
    RpcService
{




    /**
     * Remove the specified MAC address information from the MAC address table in the 
     * specified vBridge. MAC addresses passed to `mac-addresses' list will be copied 
     * to the RPC output, and `status' field in the RPC output descripes the result of 
     * the operation. `REMOVED' indicates that the MAC address specified by 
     * `mac-address' field in the RPC output has been successfully removed. Null 
     * indicates that the MAC address specified by `mac-address' field in the RPC 
     * output is not learned by the vBridge specified by the RPC input. If no MAC 
     * address is specified by the RPC input, all the MAC addresses in the MAC address 
     * table will be removed. In this case all the removed MAC addresses will be copied
     * to the RPC output. `remove-mac-entry-result' will be null if no MAC address is 
     * specified by the RPC input and the specified MAC address table is empty. On 
     * failure, one of vtn-error-tag value which indicates the cause of error is set 
     * into application tag in RPC error. `BADREQUEST' is set if the RPC input contains
     * invalid data. `NOTFOUND' is set if the VTN or the vBridge specified by the RPC 
     * input is not present. `INTERNALERROR' is set if the operation failed due to 
     * internal error.
     *
     */
    Future<RpcResult<RemoveMacEntryOutput>> removeMacEntry(RemoveMacEntryInput input);

}

