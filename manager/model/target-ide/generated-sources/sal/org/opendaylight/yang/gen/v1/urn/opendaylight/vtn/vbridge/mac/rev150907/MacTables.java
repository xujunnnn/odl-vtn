package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of all the MAC address tables for vBridges. Do not edit this 
 * container directly.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * container mac-tables {
 *     list tenant-mac-table {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         list mac-address-table {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             list mac-table-entry {
 *                 key "mac-address"
 *                 leaf used {
 *                     type boolean;
 *                 }
 *                 leaf ip-probe-count {
 *                     type int32;
 *                 }
 *                 leaf entry-data {
 *                     type string;
 *                 }
 *                 leaf mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf vlan-id {
 *                     type uint16;
 *                 }
 *                 leaf-list ip-addresses {
 *                     type ip-address;
 *                 }
 *                 leaf node {
 *                     type node-id;
 *                 }
 *                 leaf port-id {
 *                     type string;
 *                 }
 *                 leaf port-name {
 *                     type string;
 *                 }
 *                 uses vtn-mac-entry;
 *             }
 *             uses vtn-mac-table-entry;
 *         }
 *         uses vtn-mac-table-list;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/mac-tables</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTablesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTablesBuilder
 *
 */
public interface MacTables
    extends
    ChildOf<VtnMacTableData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "mac-tables").intern();

    /**
     * Keeps a list of MAC address tables for all the vBridges in the VTN.
     *
     *
     *
     * @return <code>java.util.List</code> <code>tenantMacTable</code>, or <code>null</code> if not present
     */
    List<TenantMacTable> getTenantMacTable();

}

