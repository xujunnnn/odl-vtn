package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapStatus;


/**
 * Describes information about MAC mapping, which maps hosts specified by MAC 
 * address and VLAN ID to a vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * grouping vtn-mac-map-info {
 *     container mac-map-config {
 *         container allowed-hosts {
 *             list vlan-host-desc-list {
 *                 key "host"
 *                 leaf host {
 *                     type vlan-host-desc;
 *                 }
 *             }
 *             uses vlan-host-desc-set;
 *         }
 *         container denied-hosts {
 *             list vlan-host-desc-list {
 *                 key "host"
 *                 leaf host {
 *                     type vlan-host-desc;
 *                 }
 *             }
 *             uses vlan-host-desc-set;
 *         }
 *         uses vtn-mac-map-config;
 *     }
 *     container mac-map-status {
 *         list mapped-host {
 *             key "mac-address"
 *             leaf mac-address {
 *                 type mac-address;
 *             }
 *             leaf port-id {
 *                 type node-connector-id;
 *             }
 *             leaf vlan-id {
 *                 type vlan-id;
 *             }
 *             uses vtn-vlan-id-field;
 *         }
 *         uses vtn-mac-map-status;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-map-info</i>
 *
 */
public interface VtnMacMapInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "vtn-mac-map-info").intern();

    /**
     * The container which contains configuration for MAC mapping.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapConfig</code> <code>macMapConfig</code>, or <code>null</code> if not present
     */
    MacMapConfig getMacMapConfig();
    
    /**
     * The container which contains runtime status information about MAC mapping.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapStatus</code> <code>macMapStatus</code>, or <code>null</code> if not present
     */
    MacMapStatus getMacMapStatus();

}

