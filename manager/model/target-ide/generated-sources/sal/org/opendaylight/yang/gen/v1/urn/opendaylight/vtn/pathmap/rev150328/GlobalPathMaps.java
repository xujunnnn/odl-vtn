package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of all the global path map configurations. Global path maps 
 * affect flows in all VTNs, but the VTN path maps are always evaluated prior to 
 * the global path maps. Global path maps will be evaluated only if a packet does 
 * not match any VTN path map. Note that the path map configuration must be 
 * modified by RPC. Do not edit this container directly.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * container global-path-maps {
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
 *     uses vtn-path-map-list;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/global-path-maps</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.GlobalPathMapsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.GlobalPathMapsBuilder
 *
 */
public interface GlobalPathMaps
    extends
    ChildOf<VtnPathMapData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.GlobalPathMaps>,
    VtnPathMapList
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "global-path-maps").intern();


}

