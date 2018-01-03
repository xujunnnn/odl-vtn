package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapInfo;


/**
 * The container which contains configuration for MAC mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * container mac-map-config {
 *     container allowed-hosts {
 *         list vlan-host-desc-list {
 *             key "host"
 *             leaf host {
 *                 type vlan-host-desc;
 *             }
 *         }
 *         uses vlan-host-desc-set;
 *     }
 *     container denied-hosts {
 *         list vlan-host-desc-list {
 *             key "host"
 *             leaf host {
 *                 type vlan-host-desc;
 *             }
 *         }
 *         uses vlan-host-desc-set;
 *     }
 *     uses vtn-mac-map-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-map-info/mac-map-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapConfigBuilder
 *
 */
public interface MacMapConfig
    extends
    ChildOf<VtnMacMapInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapConfig>,
    VtnMacMapConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "mac-map-config").intern();


}

