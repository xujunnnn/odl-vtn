package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/get-data-flow-count/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowCountInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowCountInputBuilder
 *
 */
public interface GetDataFlowCountInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowCountInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "input").intern();

    /**
     * The name of the VTN.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();

}

