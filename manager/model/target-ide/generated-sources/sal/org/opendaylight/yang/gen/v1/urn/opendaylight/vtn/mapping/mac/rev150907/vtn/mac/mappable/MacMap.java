package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.mappable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMappable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapInfo;


/**
 * Describes information about MAC mapping, which maps hosts specified by MAC 
 * address and VLAN ID to a vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * container mac-map {
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
 *     uses vtn-mac-map-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-mappable/mac-map</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.mappable.MacMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.mappable.MacMapBuilder
 *
 */
public interface MacMap
    extends
    ChildOf<VtnMacMappable>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.mappable.MacMap>,
    VtnMacMapInfo
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "mac-map").intern();


}

