package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * MAC address table keeps MAC address information learned by a vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * list mac-address-table {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     list mac-table-entry {
 *         key "mac-address"
 *         leaf used {
 *             type boolean;
 *         }
 *         leaf ip-probe-count {
 *             type int32;
 *         }
 *         leaf entry-data {
 *             type string;
 *         }
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
 *         uses vtn-mac-entry;
 *     }
 *     uses vtn-mac-table-entry;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/vtn-mac-table-list/mac-address-table</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list.MacAddressTableBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list.MacAddressTableBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list.MacAddressTableKey
 *
 */
public interface MacAddressTable
    extends
    ChildOf<VtnMacTableList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list.MacAddressTable>,
    VtnMacTableEntry,
    Identifiable<MacAddressTableKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "mac-address-table").intern();

    /**
     * The name of the vBridge associated with this MAC address table.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list.MacAddressTableKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MacAddressTableKey getKey();

}

