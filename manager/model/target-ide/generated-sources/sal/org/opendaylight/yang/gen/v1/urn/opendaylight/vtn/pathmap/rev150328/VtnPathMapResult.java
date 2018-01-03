package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes a pair of path map index and `vtn-update-type'. This grouping is used 
 * as output of RPC that modifies the global or VTN path map configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * grouping vtn-path-map-result {
 *     leaf index {
 *         type int32;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/vtn-path-map-result</i>
 *
 */
public interface VtnPathMapResult
    extends
    DataObject,
    VtnRpcResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "vtn-path-map-result").intern();

    /**
     * The index value that specifies the flow match in the flow condition.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>index</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIndex();

}

