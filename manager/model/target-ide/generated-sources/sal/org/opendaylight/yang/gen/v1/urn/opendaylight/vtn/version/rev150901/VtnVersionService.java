package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>vtn-version</b>
 * <pre>
 * rpc get-manager-version {
 *     "Return the version information of the VTN Manager.";
 *     input {
 *     }
 *     
 *     output {
 *         leaf api-version {
 *             type uint32;
 *         }
 *         container bundle-version {
 *             leaf major {
 *                 type uint32;
 *             }
 *             leaf minor {
 *                 type uint32;
 *             }
 *             leaf micro {
 *                 type uint32;
 *             }
 *             leaf qualifier {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnVersionService
    extends
    RpcService
{




    /**
     * Return the version information of the VTN Manager.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>managerVersion</code>, or <code>null</code> if not present
     */
    Future<RpcResult<GetManagerVersionOutput>> getManagerVersion();

}

