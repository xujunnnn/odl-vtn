package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMap;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;


/**
 * Describes the data model which can contain VLAN mapping configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * grouping vtn-vlan-mappable {
 *     list vlan-map {
 *         key "map-id"
 *         leaf map-id {
 *             type string;
 *         }
 *         container vlan-map-config {
 *             leaf node {
 *                 type node-id;
 *             }
 *             leaf vlan-id {
 *                 type vlan-id;
 *             }
 *             uses vtn-vlan-map-config;
 *         }
 *         container vlan-map-status {
 *             leaf active {
 *                 type boolean;
 *             }
 *             uses vtn-vlan-map-status;
 *         }
 *         uses vtn-vlan-map-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/vtn-vlan-mappable</i>
 *
 */
public interface VtnVlanMappable
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "vtn-vlan-mappable").intern();

    /**
     * A list of VLAN mappings configured in this data model.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vlanMap</code>, or <code>null</code> if not present
     */
    List<VlanMap> getVlanMap();

}

