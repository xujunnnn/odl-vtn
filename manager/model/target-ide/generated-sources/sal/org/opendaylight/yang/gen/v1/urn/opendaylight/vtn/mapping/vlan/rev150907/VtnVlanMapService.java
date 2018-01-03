package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-vlan-map</b>
 * <pre>
 * rpc remove-vlan-map {
 *     "Remove the specified VLAN mappings from the vBridge.
 *     
 *                IDs for VLAN mappings passed to `map-ids' list will be copied to
 *                the RPC output, and `status' field in the RPC output describes the
 *                result of the operation.
 *     
 *                `REMOVED' indicates that the VLAN mapping specified by `map-id'
 *                field in the RPC output has been removed.
 *     
 *                Null indicates that the VLAN mapping specified by `map-id' field
 *                in the RPC output is not present.
 *     
 *                If no VLAN mapping ID is specified by the RPC input, all the
 *                VLAN mappings in the specified vBridge will be removed.
 *                In this case IDs for all the removed VLAN mappings will be copied
 *                to the RPC output. `remove-vlan-map-result' in the RPC output will
 *                be null if no VLAN mapping ID is specified by the RPC input and
 *                no VLAN mapping is configured in the specified vBridge.
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
 *                `INTERNALERROR' is set if the operation failed due to internal
 *                error.";
 *     input {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *         leaf-list map-ids {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         list remove-vlan-map-result {
 *             key     leaf map-id {
 *                 type string;
 *             }
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *             uses vtn-rpc-result;
 *         }
 *     }
 * }
 * rpc get-vlan-map {
 *     "Search for a VLAN mapping with the specified VLAN mapping
 *                configuration in the specified vBridge.
 *     
 *                If a VLAN mapping with the VLAN mapping configuration that
 *                exactly matches with the configuration specified by the RPC
 *                input is present in the specified vBridge, identifier assigned
 *                to that VLAN mapping and status information about the VLAN mapping
 *                are set to the RPC output.
 *                The RPC output will be empty if not found.
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
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *     }
 *     
 *     output {
 *         leaf map-id {
 *             type string;
 *         }
 *         leaf active {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc add-vlan-map {
 *     "Configure VLAN mapping in the specified vBridge.
 *     
 *                VLAN specified by the RPC input will get mapped to the specified
 *                vBridge.
 *     
 *                Upon successful completion, the identifier assigned to the
 *                configured VLAN mapping and status status information about the
 *                VLAN mapping are set into the RPC output.
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
 *                `CONFLICT' is set if the VLAN network speccified by the RPC input
 *                is already mapped to the specified vBridge or another vBridge.
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
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *     }
 *     
 *     output {
 *         leaf map-id {
 *             type string;
 *         }
 *         leaf active {
 *             type boolean;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnVlanMapService
    extends
    RpcService
{




    /**
     * Remove the specified VLAN mappings from the vBridge. IDs for VLAN mappings 
     * passed to `map-ids' list will be copied to the RPC output, and `status' field in
     * the RPC output describes the result of the operation. `REMOVED' indicates that 
     * the VLAN mapping specified by `map-id' field in the RPC output has been removed.
     * Null indicates that the VLAN mapping specified by `map-id' field in the RPC 
     * output is not present. If no VLAN mapping ID is specified by the RPC input, all 
     * the VLAN mappings in the specified vBridge will be removed. In this case IDs for
     * all the removed VLAN mappings will be copied to the RPC output. 
     * `remove-vlan-map-result' in the RPC output will be null if no VLAN mapping ID is
     * specified by the RPC input and no VLAN mapping is configured in the specified 
     * vBridge. On failure, one of vtn-error-tag value which indicates the cause of 
     * error is set into application tag in RPC error. `BADREQUEST' is set if the RPC 
     * input contains invalid data. `NOTFOUND' is set if the VTN specified by 
     * `tenant-name' is not present. `NOTFOUND' is set if the vBridge specified by 
     * `tenant-name' and `bridge-name' is not present. `INTERNALERROR' is set if the 
     * operation failed due to internal error.
     *
     */
    Future<RpcResult<RemoveVlanMapOutput>> removeVlanMap(RemoveVlanMapInput input);
    
    /**
     * Search for a VLAN mapping with the specified VLAN mapping configuration in the 
     * specified vBridge. If a VLAN mapping with the VLAN mapping configuration that 
     * exactly matches with the configuration specified by the RPC input is present in 
     * the specified vBridge, identifier assigned to that VLAN mapping and status 
     * information about the VLAN mapping are set to the RPC output. The RPC output 
     * will be empty if not found. On failure, one of vtn-error-tag value which 
     * indicates the cause of error is set into application tag in RPC error. 
     * `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is set if
     * the VTN or the vBridge specified by the RPC input is not present. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>vlanMap</code>, or <code>null</code> if not present
     */
    Future<RpcResult<GetVlanMapOutput>> getVlanMap(GetVlanMapInput input);
    
    /**
     * Configure VLAN mapping in the specified vBridge. VLAN specified by the RPC input
     * will get mapped to the specified vBridge. Upon successful completion, the 
     * identifier assigned to the configured VLAN mapping and status status information
     * about the VLAN mapping are set into the RPC output. On failure, one of 
     * vtn-error-tag value which indicates the cause of error is set into application 
     * tag in RPC error. `BADREQUEST' is set if the RPC input contains invalid data. 
     * `NOTFOUND' is set if the VTN specified by `tenant-name' is not present. 
     * `NOTFOUND' is set if the vBridge specified by `tenant-name' and `bridge-name' is
     * not present. `CONFLICT' is set if the VLAN network speccified by the RPC input 
     * is already mapped to the specified vBridge or another vBridge. `INTERNALERROR' 
     * is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<AddVlanMapOutput>> addVlanMap(AddVlanMapInput input);

}

