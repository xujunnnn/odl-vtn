package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapList;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * A list of VTN path maps affect flows in this VTN. If an incoming packet for 
 * VTN matches the flow condition configured in VTN path map, the route of that 
 * packet is determined by the path policy configured in that path map. If no VTN 
 * path map matches an incoming packet, global path maps are evaluated. Note that 
 * this container may not be present if no VTN path map is configured.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn</b>
 * <pre>
 * container vtn-path-maps {
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
 * <i>vtn/vtn-info/vtn-path-maps</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMapsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMapsBuilder
 *
 */
public interface VtnPathMaps
    extends
    ChildOf<VtnInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>,
    VtnPathMapList
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn",
        "2015-03-28", "vtn-path-maps").intern();


}

