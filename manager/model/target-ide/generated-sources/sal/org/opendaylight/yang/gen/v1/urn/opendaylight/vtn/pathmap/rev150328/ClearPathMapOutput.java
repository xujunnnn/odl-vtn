package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * container output {
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-rpc-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/clear-path-map/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.ClearPathMapOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.ClearPathMapOutputBuilder
 *
 */
public interface ClearPathMapOutput
    extends
    VtnRpcResult,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.ClearPathMapOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "output").intern();


}

