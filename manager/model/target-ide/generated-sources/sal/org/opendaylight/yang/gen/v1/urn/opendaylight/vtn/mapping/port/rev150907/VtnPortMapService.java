package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-port-map</b>
 * <pre>
 * rpc remove-port-map {
 *     "Remove port mapping configuration from the specified virtual
 *                interface.
 *     
 *                The target virtual interface is determined by the RPC input.
 *                If `bridge-name' field in the RPC input is configured, port
 *                mapping configured in the virtual interface attached to the
 *                vBridge specified by `tenant-name' and `bridge-name' will be
 *                removed.
 *                If `bridge-name' field is omitted and `terminal-name' field in
 *                the RPC input is configured, port mapping configured in the
 *                virtual interface attached to the vTerminal specified by
 *                `tenant-name' and `terminal-name' will be removed.
 *     
 *                Upon successful completion, the result of this operation will
 *                be set to the `status' field in the RPC output.
 *     
 *                `REMOVED' indicates that port mapping configuration has been
 *                removed successfully from the virtual interface specified by the
 *                RPC input.
 *     
 *                Null indicates that port mapping configuration is not present in
 *                the virtual interface specified by the RPC input.
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
 *                `NOTFOUND' is set if the vBridge specified by `tenant-name' and
 *                `bridge-name' is not present.
 *     
 *                `NOTFOUND' is set if the virtual interface specified by
 *                `tenant-name' and `bridge-name' (or `terminal-name') and
 *                `interface-name' is not present.
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
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 * }
 * rpc set-port-map {
 *     "Configure port mapping in the specified virtual interface.
 *     
 *                The target virtual interface is determined by the RPC input.
 *                If `bridge-name' field in the RPC input is configured, port
 *                mapping is configured in the virtual interface attached to the
 *                vBridge specified by `tenant-name' and `bridge-name'.
 *                If `bridge-name' field is omitted and `terminal-name' field in
 *                the RPC input is configured, port mapping is configured in the
 *                virtual interface attached to the vTerminal specified by
 *                `tenant-name' and `terminal-name'.
 *     
 *                If port mapping is already configured in the specified virtual
 *                interface, the specified settins are applied after old
 *                configuration is deleted.
 *     
 *                Upon successful completion, the result of this operation will
 *                be set to the `status' field in the RPC output.
 *     
 *                `CREATED' indicates that new port mapping configuration has been
 *                created successfully.
 *     
 *                `CHANGED' indicates that old port mapping configuration has been
 *                replaced with the configuration specified by the RPC input.
 *     
 *                Null indicates that the port mapping configuration specified by
 *                the RPC input is already applied to the specified virtual
 *                interface.
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
 *                `NOTFOUND' is set if the vBridge specified by `tenant-name' and
 *                `bridge-name' is not present.
 *     
 *                `NOTFOUND' is set if the virtual interface specified by
 *                `tenant-name' and `bridge-name' (or `terminal-name') and
 *                `interface-name' is not present.
 *     
 *                `CONFLICT' is set if the specified combination of physical
 *                switch port and VLAN ID is mapped to another virtual interface.
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
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
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
 * </pre>
 *
 */
public interface VtnPortMapService
    extends
    RpcService
{




    /**
     * Remove port mapping configuration from the specified virtual interface. The 
     * target virtual interface is determined by the RPC input. If `bridge-name' field 
     * in the RPC input is configured, port mapping configured in the virtual interface
     * attached to the vBridge specified by `tenant-name' and `bridge-name' will be 
     * removed. If `bridge-name' field is omitted and `terminal-name' field in the RPC 
     * input is configured, port mapping configured in the virtual interface attached 
     * to the vTerminal specified by `tenant-name' and `terminal-name' will be removed.
     * Upon successful completion, the result of this operation will be set to the 
     * `status' field in the RPC output. `REMOVED' indicates that port mapping 
     * configuration has been removed successfully from the virtual interface specified
     * by the RPC input. Null indicates that port mapping configuration is not present 
     * in the virtual interface specified by the RPC input. On failure, one of 
     * vtn-error-tag value which indicates the cause of error is set into application 
     * tag in RPC error. `BADREQUEST' is set if the RPC input contains invalid data. 
     * `NOTFOUND' is set if the VTN specified by `tenant-name' is not present. 
     * `NOTFOUND' is set if the vBridge specified by `tenant-name' and `bridge-name' is
     * not present. `NOTFOUND' is set if the vTerminal specified by `tenant-name' and 
     * `terminal-name' is not present. `NOTFOUND' is set if the vBridge specified by 
     * `tenant-name' and `bridge-name' is not present. `NOTFOUND' is set if the virtual
     * interface specified by `tenant-name' and `bridge-name' (or `terminal-name') and 
     * `interface-name' is not present. `INTERNALERROR' is set if the operation failed 
     * due to internal error.
     *
     */
    Future<RpcResult<RemovePortMapOutput>> removePortMap(RemovePortMapInput input);
    
    /**
     * Configure port mapping in the specified virtual interface. The target virtual 
     * interface is determined by the RPC input. If `bridge-name' field in the RPC 
     * input is configured, port mapping is configured in the virtual interface 
     * attached to the vBridge specified by `tenant-name' and `bridge-name'. If 
     * `bridge-name' field is omitted and `terminal-name' field in the RPC input is 
     * configured, port mapping is configured in the virtual interface attached to the 
     * vTerminal specified by `tenant-name' and `terminal-name'. If port mapping is 
     * already configured in the specified virtual interface, the specified settins are
     * applied after old configuration is deleted. Upon successful completion, the 
     * result of this operation will be set to the `status' field in the RPC output. 
     * `CREATED' indicates that new port mapping configuration has been created 
     * successfully. `CHANGED' indicates that old port mapping configuration has been 
     * replaced with the configuration specified by the RPC input. Null indicates that 
     * the port mapping configuration specified by the RPC input is already applied to 
     * the specified virtual interface. On failure, one of vtn-error-tag value which 
     * indicates the cause of error is set into application tag in RPC error. 
     * `BADREQUEST' is set if the RPC input contains invalid data. `NOTFOUND' is set if
     * the VTN specified by `tenant-name' is not present. `NOTFOUND' is set if the 
     * vBridge specified by `tenant-name' and `bridge-name' is not present. `NOTFOUND' 
     * is set if the vTerminal specified by `tenant-name' and `terminal-name' is not 
     * present. `NOTFOUND' is set if the vBridge specified by `tenant-name' and 
     * `bridge-name' is not present. `NOTFOUND' is set if the virtual interface 
     * specified by `tenant-name' and `bridge-name' (or `terminal-name') and 
     * `interface-name' is not present. `CONFLICT' is set if the specified combination 
     * of physical switch port and VLAN ID is mapped to another virtual interface. 
     * `INTERNALERROR' is set if the operation failed due to internal error.
     *
     */
    Future<RpcResult<SetPortMapOutput>> setPortMap(SetPortMapInput input);

}

