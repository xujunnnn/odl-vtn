package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf-list mac-addresses {
 *         type mac-address;
 *     }
 *     uses vbridge-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/remove-mac-entry/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryInputBuilder
 *
 */
public interface RemoveMacEntryInput
    extends
    VbridgePathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "input").intern();

    /**
     * A list of MAC addresses to be removed from the MAC address table in the 
     * specified vBridge. If this field is omitted or an empty list is specified, all 
     * the learned MAC addresses by the specified vBridge will be removed. Duplicates 
     * in this list will be eliminated automatically.
     *
     *
     *
     * @return <code>java.util.List</code> <code>macAddresses</code>, or <code>null</code> if not present
     */
    List<MacAddress> getMacAddresses();

}

