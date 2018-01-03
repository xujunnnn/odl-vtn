package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.mappable.MacMap;


/**
 * Describes the data model which can contain MAC mapping configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * grouping vtn-mac-mappable {
 *     container mac-map {
 *         container mac-map-config {
 *             container allowed-hosts {
 *                 list vlan-host-desc-list {
 *                     key "host"
 *                     leaf host {
 *                         type vlan-host-desc;
 *                     }
 *                 }
 *                 uses vlan-host-desc-set;
 *             }
 *             container denied-hosts {
 *                 list vlan-host-desc-list {
 *                     key "host"
 *                     leaf host {
 *                         type vlan-host-desc;
 *                     }
 *                 }
 *                 uses vlan-host-desc-set;
 *             }
 *             uses vtn-mac-map-config;
 *         }
 *         container mac-map-status {
 *             list mapped-host {
 *                 key "mac-address"
 *                 leaf mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf port-id {
 *                     type node-connector-id;
 *                 }
 *                 leaf vlan-id {
 *                     type vlan-id;
 *                 }
 *                 uses vtn-vlan-id-field;
 *             }
 *             uses vtn-mac-map-status;
 *         }
 *         uses vtn-mac-map-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-mappable</i>
 *
 */
public interface VtnMacMappable
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "vtn-mac-mappable").intern();

    /**
     * Describes information about MAC mapping, which maps hosts specified by MAC 
     * address and VLAN ID to a vBridge.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.mappable.MacMap</code> <code>macMap</code>, or <code>null</code> if not present
     */
    MacMap getMacMap();

}

