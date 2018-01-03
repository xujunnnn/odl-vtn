package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapInput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapConfig;


/**
 * A list of `vtn-path-map-config' to be applied to the path map configuration. 
 * Note that a duplicate match index in this list will cause a `BADREQUEST' error.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * list path-map-list {
 *     key     leaf condition {
 *         type vnode-name;
 *     }
 *     leaf policy {
 *         type policy;
 *     }
 *     leaf index {
 *         type int32;
 *     }
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 *     uses vtn-path-map-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/set-path-map/input/path-map-list</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapListBuilder
 *
 *
 */
public interface PathMapList
    extends
    ChildOf<SetPathMapInput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>,
    VtnPathMapConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "path-map-list").intern();


}

