package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapInfo;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapConfig;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The container which contains configuration for VLAN mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * container vlan-map-config {
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     uses vtn-vlan-map-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/vtn-vlan-map-info/vlan-map-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info.VlanMapConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info.VlanMapConfigBuilder
 *
 */
public interface VlanMapConfig
    extends
    ChildOf<VtnVlanMapInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info.VlanMapConfig>,
    VtnVlanMapConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "vlan-map-config").intern();


}

