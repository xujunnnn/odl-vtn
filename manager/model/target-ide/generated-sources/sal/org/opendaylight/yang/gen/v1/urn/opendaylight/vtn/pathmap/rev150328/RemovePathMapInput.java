package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf-list map-index {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/remove-path-map/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.RemovePathMapInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.RemovePathMapInputBuilder
 *
 */
public interface RemovePathMapInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.RemovePathMapInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "input").intern();

    /**
     * The name of the VTN. If this field is specified, path maps specified in the RPC 
     * input will be removed from the VTN path map configuration. If this field is 
     * omitted, path maps specified in the RPC input will be removed from the global 
     * path map configuration.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();
    
    /**
     * A list of path map indices to be removed from the path map configuration 
     * specified by `tenant-name' field. Duplicates in this list will be eliminated 
     * automatically.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mapIndex</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getMapIndex();

}

