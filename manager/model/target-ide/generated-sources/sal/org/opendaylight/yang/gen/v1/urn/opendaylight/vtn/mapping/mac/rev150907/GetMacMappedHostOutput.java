package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.get.mac.mapped.host.output.MacMappedHost;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * container output {
 *     leaf configured {
 *         type boolean;
 *     }
 *     list mac-mapped-host {
 *         key     leaf mac-address {
 *             type mac-address;
 *         }
 *         leaf vlan-id {
 *             type uint16;
 *         }
 *         leaf-list ip-addresses {
 *             type ip-address;
 *         }
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-mac-entry;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/get-mac-mapped-host/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.GetMacMappedHostOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.GetMacMappedHostOutputBuilder
 *
 */
public interface GetMacMappedHostOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.GetMacMappedHostOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "output").intern();

    /**
     * True is set only if the MAC mapping is configured in the vBridge specified by 
     * the RPC input.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>configured</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isConfigured();
    
    /**
     * A list of host information mapped to the specified vBridge by MAC mapping.
     *
     *
     *
     * @return <code>java.util.List</code> <code>macMappedHost</code>, or <code>null</code> if not present
     */
    List<MacMappedHost> getMacMappedHost();

}

