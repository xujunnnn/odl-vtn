package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.vtn.path.map.list.VtnPathMap;


/**
 * A container that holds a list of path map configurations.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * grouping vtn-path-map-list {
 *     list vtn-path-map {
 *         key "index"
 *         leaf condition {
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
 * <i>vtn-path-map/vtn-path-map-list</i>
 *
 */
public interface VtnPathMapList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "vtn-path-map-list").intern();

    /**
     * A list of path maps.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnPathMap</code>, or <code>null</code> if not present
     */
    List<VtnPathMap> getVtnPathMap();

}

