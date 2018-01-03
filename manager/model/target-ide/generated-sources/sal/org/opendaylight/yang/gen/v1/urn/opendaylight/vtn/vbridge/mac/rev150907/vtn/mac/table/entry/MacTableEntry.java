package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableEntry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * MAC address information learned by a vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * list mac-table-entry {
 *     key "mac-address"
 *     leaf mac-address {
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
 *     leaf used {
 *         type boolean;
 *     }
 *     leaf ip-probe-count {
 *         type int32;
 *     }
 *     leaf entry-data {
 *         type string;
 *     }
 *     uses vtn-mac-entry;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/vtn-mac-table-entry/mac-table-entry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntryBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntryKey
 *
 */
public interface MacTableEntry
    extends
    ChildOf<VtnMacTableEntry>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>,
    VtnMacEntry,
    Identifiable<MacTableEntryKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "mac-table-entry").intern();

    /**
     * True is set if this entry is used by the VTN Manager This field is only for 
     * internal use.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>used</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUsed();
    
    /**
     * The number of IP address probe request. This field is only for internal use.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ipProbeCount</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIpProbeCount();
    
    /**
     * An opaque data associated with this entry. This field is only for internal use.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>entryData</code>, or <code>null</code> if not present
     */
    java.lang.String getEntryData();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntryKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MacTableEntryKey getKey();

}

