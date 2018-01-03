package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     list path-map-list {
 *         key     leaf condition {
 *             type vnode-name;
 *         }
 *         leaf policy {
 *             type policy;
 *         }
 *         leaf index {
 *             type int32;
 *         }
 *         leaf idle-timeout {
 *             type uint16;
 *         }
 *         leaf hard-timeout {
 *             type uint16;
 *         }
 *         uses vtn-path-map-config;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/set-path-map/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapInputBuilder
 *
 */
public interface SetPathMapInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "input").intern();

    /**
     * The name of the VTN. If this field is specified, the specified path map will 
     * affect flows only in the specified VTN. If this field is omitted, the specified 
     * path map will affect flows in all the VTNs.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();
    
    /**
     * A list of `vtn-path-map-config' to be applied to the path map configuration. 
     * Note that a duplicate match index in this list will cause a `BADREQUEST' error.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pathMapList</code>, or <code>null</code> if not present
     */
    List<PathMapList> getPathMapList();

}

