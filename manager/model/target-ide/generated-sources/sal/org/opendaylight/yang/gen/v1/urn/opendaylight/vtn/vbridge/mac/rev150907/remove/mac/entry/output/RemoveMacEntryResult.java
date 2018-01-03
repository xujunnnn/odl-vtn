package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.remove.mac.entry.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes pairs of MAC addresses and operation results.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * list remove-mac-entry-result {
 *     key     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-rpc-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/remove-mac-entry/output/remove-mac-entry-result</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.remove.mac.entry.output.RemoveMacEntryResultBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.remove.mac.entry.output.RemoveMacEntryResultBuilder
 *
 *
 */
public interface RemoveMacEntryResult
    extends
    ChildOf<RemoveMacEntryOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.remove.mac.entry.output.RemoveMacEntryResult>,
    VtnRpcResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "remove-mac-entry-result").intern();

    /**
     * One of the MAC address specified by the RPC input.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    MacAddress getMacAddress();

}

