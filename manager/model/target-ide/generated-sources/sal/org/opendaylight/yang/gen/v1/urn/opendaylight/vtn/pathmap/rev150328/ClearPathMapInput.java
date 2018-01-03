package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/clear-path-map/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.ClearPathMapInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.ClearPathMapInputBuilder
 *
 */
public interface ClearPathMapInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.ClearPathMapInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "input").intern();

    /**
     * The name of the VTN. If this field is specified, all path map configurations 
     * present in the specified VTN will be removed. If this field is omitted, all 
     * global path map configurations will be removed.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();

}

