package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status.MappedHost;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;


/**
 * Describes runtime status information about MAC mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * grouping vtn-mac-map-status {
 *     list mapped-host {
 *         key "mac-address"
 *         leaf mac-address {
 *             type mac-address;
 *         }
 *         leaf port-id {
 *             type node-connector-id;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         uses vtn-vlan-id-field;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-map-status</i>
 *
 */
public interface VtnMacMapStatus
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "vtn-mac-map-status").intern();

    /**
     * A list of MAC addresses actually mapped to the vBridge.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mappedHost</code>, or <code>null</code> if not present
     */
    List<MappedHost> getMappedHost();

}

