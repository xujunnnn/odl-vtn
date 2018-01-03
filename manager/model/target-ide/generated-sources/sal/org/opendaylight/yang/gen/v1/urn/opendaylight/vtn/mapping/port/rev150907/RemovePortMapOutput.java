package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-port-map</b>
 * <pre>
 * container output {
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-rpc-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-port-map/remove-port-map/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapOutputBuilder
 *
 */
public interface RemovePortMapOutput
    extends
    VtnRpcResult,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:port",
        "2015-09-07", "output").intern();


}

