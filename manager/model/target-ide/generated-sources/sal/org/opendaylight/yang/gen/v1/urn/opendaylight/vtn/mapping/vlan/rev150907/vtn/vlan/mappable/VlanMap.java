package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapInfo;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMappable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of VLAN mappings configured in this data model.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * list vlan-map {
 *     key "map-id"
 *     leaf map-id {
 *         type string;
 *     }
 *     container vlan-map-config {
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         uses vtn-vlan-map-config;
 *     }
 *     container vlan-map-status {
 *         leaf active {
 *             type boolean;
 *         }
 *         uses vtn-vlan-map-status;
 *     }
 *     uses vtn-vlan-map-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/vtn-vlan-mappable/vlan-map</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMapBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMapKey
 *
 */
public interface VlanMap
    extends
    ChildOf<VtnVlanMappable>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMap>,
    VtnVlanMapInfo,
    Identifiable<VlanMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "vlan-map").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMapKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VlanMapKey getKey();

}

