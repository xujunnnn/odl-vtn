package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDescSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;


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
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * container denied-hosts {
 *     list vlan-host-desc-list {
 *         key "host"
 *         leaf host {
 *             type vlan-host-desc;
 *         }
 *     }
 *     uses vlan-host-desc-set;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-map-config/denied-hosts</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.DeniedHostsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.DeniedHostsBuilder
 *
 */
public interface DeniedHosts
    extends
    ChildOf<VtnMacMapConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.DeniedHosts>,
    VlanHostDescSet
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "denied-hosts").intern();


}

