package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDescSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * A set of hosts to be mapped by MAC mapping. If a host in this container does 
 * specify a MAC address, all the hosts detected over the specified VLAN will be 
 * mapped. For example, if "@10" is configured in this container, all hosts 
 * detected on VLAN 10 will be mapped. Note that zero, broadcast address, and 
 * multicast address cannot be specified as MAC address. In addition, multiple 
 * information with the same MAC address cannot be configured in this set.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * container allowed-hosts {
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
 * <i>vtn-mac-map/vtn-mac-map-config/allowed-hosts</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.AllowedHostsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.AllowedHostsBuilder
 *
 */
public interface AllowedHosts
    extends
    ChildOf<VtnMacMapConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.config.AllowedHosts>,
    VlanHostDescSet
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "allowed-hosts").intern();


}

