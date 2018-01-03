package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.DeniedHosts;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.AllowedHosts;


/**
 * Describes configuration for a MAC mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * grouping vtn-mac-map-config {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-map-config</i>
 *
 */
public interface VtnMacMapConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "vtn-mac-map-config").intern();

    /**
     * A set of hosts to be mapped by MAC mapping. If a host in this container does not
     * specify a MAC address, all the hosts detected over the specified VLAN will be 
     * mapped. For example, if "@10" is configured in this container, all hosts 
     * detected on VLAN 10 will be mapped. Note that zero, broadcast address, and 
     * multicast address cannot be specified as MAC address. In addition, multiple host
     * information with the same MAC address cannot be configured in this set.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.AllowedHosts</code> <code>allowedHosts</code>, or <code>null</code> if not present
     */
    AllowedHosts getAllowedHosts();
    
    /**
     * A set of hosts not to be mapped by MAC mapping. This container is used to 
     * exclude specific hosts from mapping when host information in `allowed-hosts' 
     * does not specify any MAC address. Unlike `allowed-hosts', every hosts in this 
     * container must specify a MAC address. The hosts in this container is evaluated 
     * before `allowed-hosts'. If the same host information is specified in both 
     * `allowed-hosts' and this container, that host will not be mapped by this MAC 
     * mapping. Note that zero, broadcast address, and multicast address cannot be 
     * specified as MAC address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.DeniedHosts</code> <code>deniedHosts</code>, or <code>null</code> if not present
     */
    DeniedHosts getDeniedHosts();

}

