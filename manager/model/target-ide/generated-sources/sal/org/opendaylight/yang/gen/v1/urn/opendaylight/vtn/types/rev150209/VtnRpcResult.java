package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the generic information of the RPC result.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vtn-rpc-result {
 *     leaf status {
 *         type vtn-update-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vtn-rpc-result</i>
 *
 */
public interface VtnRpcResult
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vtn-rpc-result").intern();

    /**
     * Describes the status of the RPC result.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateType</code> <code>status</code>, or <code>null</code> if not present
     */
    VtnUpdateType getStatus();

}

