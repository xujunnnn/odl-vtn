package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapStatus;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of MAC addresses actually mapped to the vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * list mapped-host {
 *     key "mac-address"
 *     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf port-id {
 *         type node-connector-id;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     uses vtn-vlan-id-field;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-map-status/mapped-host</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status.MappedHostBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status.MappedHostBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status.MappedHostKey
 *
 */
public interface MappedHost
    extends
    ChildOf<VtnMacMapStatus>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status.MappedHost>,
    VtnVlanIdField,
    Identifiable<MappedHostKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "mapped-host").intern();

    /**
     * MAC address actually mapped to the vBridge.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    MacAddress getMacAddress();
    
    /**
     * An identifier for a physical switch port where the MAC address is detected.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>portId</code>, or <code>null</code> if not present
     */
    NodeConnectorId getPortId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status.MappedHostKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MappedHostKey getKey();

}

