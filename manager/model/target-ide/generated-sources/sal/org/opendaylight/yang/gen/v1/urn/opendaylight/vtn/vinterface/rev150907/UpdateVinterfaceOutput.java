package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * container output {
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-rpc-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/update-vinterface/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.UpdateVinterfaceOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.UpdateVinterfaceOutputBuilder
 *
 */
public interface UpdateVinterfaceOutput
    extends
    VtnRpcResult,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.UpdateVinterfaceOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "output").intern();


}

