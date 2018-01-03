package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;


/**
 * Describes information about a MAC address learned inside vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * grouping vtn-mac-entry {
 *     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf vlan-id {
 *         type uint16;
 *     }
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 *     leaf-list ip-addresses {
 *         type ip-address;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/vtn-mac-entry</i>
 *
 */
public interface VtnMacEntry
    extends
    DataObject,
    VtnPortLocation
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "vtn-mac-entry").intern();

    /**
     * A string representation of a learned MAC address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    MacAddress getMacAddress();
    
    /**
     * A VLAN ID detected inside Ethernet frame where the MAC address was detected. 
     * Zero implies that VLAN tag was not detected.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    java.lang.Integer getVlanId();
    
    /**
     * A set of IP addresses detected inside Ethernet frame where the MAC address was 
     * detected.
     *
     *
     *
     * @return <code>java.util.List</code> <code>ipAddresses</code>, or <code>null</code> if not present
     */
    List<IpAddress> getIpAddresses();

}

