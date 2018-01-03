package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry;


/**
 * Describes a set of MAC address entry in a MAC address table.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * grouping vtn-mac-table-entry {
 *     list mac-table-entry {
 *         key "mac-address"
 *         leaf mac-address {
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
 *         leaf used {
 *             type boolean;
 *         }
 *         leaf ip-probe-count {
 *             type int32;
 *         }
 *         leaf entry-data {
 *             type string;
 *         }
 *         uses vtn-mac-entry;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/vtn-mac-table-entry</i>
 *
 */
public interface VtnMacTableEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "vtn-mac-table-entry").intern();

    /**
     * MAC address information learned by a vBridge.
     *
     *
     *
     * @return <code>java.util.List</code> <code>macTableEntry</code>, or <code>null</code> if not present
     */
    List<MacTableEntry> getMacTableEntry();

}

