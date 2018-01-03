package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.get.mac.mapped.host.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.GetMacMappedHostOutput;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * A list of host information mapped to the specified vBridge by MAC mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * list mac-mapped-host {
 *     key     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf vlan-id {
 *         type uint16;
 *     }
 *     leaf-list ip-addresses {
 *         type ip-address;
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
 *     uses vtn-mac-entry;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/get-mac-mapped-host/output/mac-mapped-host</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.get.mac.mapped.host.output.MacMappedHostBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.get.mac.mapped.host.output.MacMappedHostBuilder
 *
 *
 */
public interface MacMappedHost
    extends
    ChildOf<GetMacMappedHostOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.get.mac.mapped.host.output.MacMappedHost>,
    VtnMacEntry
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "mac-mapped-host").intern();


}

