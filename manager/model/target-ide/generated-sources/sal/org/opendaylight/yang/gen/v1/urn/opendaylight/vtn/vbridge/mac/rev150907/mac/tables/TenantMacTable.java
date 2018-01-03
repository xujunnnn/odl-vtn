package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * Keeps a list of MAC address tables for all the vBridges in the VTN.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * list tenant-mac-table {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     list mac-address-table {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         list mac-table-entry {
 *             key "mac-address"
 *             leaf used {
 *                 type boolean;
 *             }
 *             leaf ip-probe-count {
 *                 type int32;
 *             }
 *             leaf entry-data {
 *                 type string;
 *             }
 *             leaf mac-address {
 *                 type mac-address;
 *             }
 *             leaf vlan-id {
 *                 type uint16;
 *             }
 *             leaf-list ip-addresses {
 *                 type ip-address;
 *             }
 *             leaf node {
 *                 type node-id;
 *             }
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf port-name {
 *                 type string;
 *             }
 *             uses vtn-mac-entry;
 *         }
 *         uses vtn-mac-table-entry;
 *     }
 *     uses vtn-mac-table-list;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/mac-tables/tenant-mac-table</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTableBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTableBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTableKey
 *
 */
public interface TenantMacTable
    extends
    ChildOf<MacTables>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>,
    VtnMacTableList,
    Identifiable<TenantMacTableKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "tenant-mac-table").intern();

    /**
     * The name of the VTN.
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTableKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TenantMacTableKey getKey();

}

