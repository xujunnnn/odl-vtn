package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-mac-map</b>
 * <pre>
 * rpc set-mac-map {
 *     "Configure MAC mapping in the specified vBridge.
 *     
 *                This operation changes the MAC addresses to be mapped and not to
 *                be mapped at the same time.
 *     
 *                Upon successful completion, the result of this operation will
 *                be set to the `status' field in the RPC output.
 *     
 *                `CREATED' indicates that new MAC mapping configuration has been
 *                created in the specified vBridge.
 *     
 *                `CHANGED' indicates that existing MAC mapping configuration has
 *                been changed.
 *     
 *                `REMOVED' indicates that MAC mapping configuration has been removed
 *                from the specified vBridge.
 *     
 *                Null indicates that MAC mapping configuration in the specified
 *                vBridge was not changed.
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
 *                `CONFLICT' is set if this operation tries to map a host already
 *                mapped by another MAC mapping.
 *     
 *                `CONFLICT' is set if this operation tries to add a MAC address
 *                into `allowed-hosts' in the MAC mapping configuration, and that
 *                MAC address is already configured in `allowed-hosts'.
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
 *         leaf operation {
 *             type vtn-update-operation-type;
 *         }
 *         leaf-list allowed-hosts {
 *             type vlan-host-desc;
 *         }
 *         leaf-list denied-hosts {
 *             type vlan-host-desc;
 *         }
 *     }
 *     
 *     output {
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 * }
 * rpc set-mac-map-acl {
 *     "Configure MAC mapping in the specified vBridge.
 *     
 *                This operation changes the specified access control list of the
 *                MAC mapping.
 *     
 *                Upon successful completion, the result of this operation will
 *                be set to the `status' field in the RPC output.
 *     
 *                `CREATED' indicates that new MAC mapping configuration has been
 *                created in the specified vBridge.
 *     
 *                `CHANGED' indicates that existing MAC mapping configuration has
 *                been changed.
 *     
 *                `REMOVED' indicates that MAC mapping configuration has been removed
 *                from the specified vBridge.
 *     
 *                Null indicates that MAC mapping configuration in the specified
 *                vBridge was not changed.
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
 *                `CONFLICT' is set if this operation tries to map a host already
 *                mapped by another MAC mapping.
 *     
 *                `CONFLICT' is set if this operation tries to add a MAC address
 *                into `allowed-hosts' in the MAC mapping configuration, and that
 *                MAC address is already configured in `allowed-hosts'.
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
 *         leaf acl-type {
 *             type vtn-acl-type;
 *         }
 *         leaf operation {
 *             type vtn-update-operation-type;
 *         }
 *         leaf-list hosts {
 *             type vlan-host-desc;
 *         }
 *     }
 *     
 *     output {
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 * }
 * rpc get-mac-mapped-host {
 *     "Get a list of hosts where mapping is actually active based on MAC
 *                mapping configured in the specified vBridge.
 *     
 *                Upon successful completion, a list of host information is will be
 *                set to the RPC output.
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
 *         leaf-list mac-addresses {
 *             type mac-address;
 *         }
 *     }
 *     
 *     output {
 *         leaf configured {
 *             type boolean;
 *         }
 *         list mac-mapped-host {
 *             key     leaf mac-address {
 *                 type mac-address;
 *             }
 *             leaf vlan-id {
 *                 type uint16;
 *             }
 *             leaf-list ip-addresses {
 *                 type ip-address;
 *             }
 *             leaf node {
 *                 type node-id;
 *             }
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf port-name {
 *                 type string;
 *             }
 *             uses vtn-mac-entry;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnMacMapService
    extends
    RpcService
{




    /**
     * Configure MAC mapping in the specified vBridge. This operation changes the MAC 
     * addresses to be mapped and not to be mapped at the same time. Upon successful 
     * completion, the result of this operation will be set to the `status' field in 
     * the RPC output. `CREATED' indicates that new MAC mapping configuration has been 
     * created in the specified vBridge. `CHANGED' indicates that existing MAC mapping 
     * configuration has been changed. `REMOVED' indicates that MAC mapping 
     * configuration has been removed from the specified vBridge. Null indicates that 
     * MAC mapping configuration in the specified vBridge was not changed. On failure, 
     * one of vtn-error-tag value which indicates the cause of error is set into 
     * application tag in RPC error. `BADREQUEST' is set if the RPC input contains 
     * invalid data. `NOTFOUND' is set if the VTN specified by `tenant-name' is not 
     * present. `NOTFOUND' is set if the vBridge specified by `tenant-name' and 
     * `bridge-name' is not present. `CONFLICT' is set if this operation tries to map a
     * host already mapped by another MAC mapping. `CONFLICT' is set if this operation 
     * tries to add a MAC address into `allowed-hosts' in the MAC mapping 
     * configuration, and that MAC address is already configured in `allowed-hosts'. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<SetMacMapOutput>> setMacMap(SetMacMapInput input);
    
    /**
     * Configure MAC mapping in the specified vBridge. This operation changes the 
     * specified access control list of the MAC mapping. Upon successful completion, 
     * the result of this operation will be set to the `status' field in the RPC 
     * output. `CREATED' indicates that new MAC mapping configuration has been created 
     * in the specified vBridge. `CHANGED' indicates that existing MAC mapping 
     * configuration has been changed. `REMOVED' indicates that MAC mapping 
     * configuration has been removed from the specified vBridge. Null indicates that 
     * MAC mapping configuration in the specified vBridge was not changed. On failure, 
     * one of vtn-error-tag value which indicates the cause of error is set into 
     * application tag in RPC error. `BADREQUEST' is set if the RPC input contains 
     * invalid data. `NOTFOUND' is set if the VTN specified by `tenant-name' is not 
     * present. `NOTFOUND' is set if the vBridge specified by `tenant-name' and 
     * `bridge-name' is not present. `CONFLICT' is set if this operation tries to map a
     * host already mapped by another MAC mapping. `CONFLICT' is set if this operation 
     * tries to add a MAC address into `allowed-hosts' in the MAC mapping 
     * configuration, and that MAC address is already configured in `allowed-hosts'. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<SetMacMapAclOutput>> setMacMapAcl(SetMacMapAclInput input);
    
    /**
     * Get a list of hosts where mapping is actually active based on MAC mapping 
     * configured in the specified vBridge. Upon successful completion, a list of host 
     * information is will be set to the RPC output. On failure, one of vtn-error-tag 
     * value which indicates the cause of error is set into application tag in RPC 
     * error. `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is
     * set if the VTN specified by `tenant-name' is not present. `NOTFOUND' is set if 
     * the vBridge specified by `tenant-name' and `bridge-name' is not present. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>macMappedHost</code>, or <code>null</code> if not present
     */
    Future<RpcResult<GetMacMappedHostOutput>> getMacMappedHost(GetMacMappedHostInput input);

}

