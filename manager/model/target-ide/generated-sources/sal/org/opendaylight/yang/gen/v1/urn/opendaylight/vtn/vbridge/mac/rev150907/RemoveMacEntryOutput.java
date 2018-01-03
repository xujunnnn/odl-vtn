package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.remove.mac.entry.output.RemoveMacEntryResult;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * container output {
 *     list remove-mac-entry-result {
 *         key     leaf mac-address {
 *             type mac-address;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *         uses vtn-rpc-result;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-table/remove-mac-entry/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutputBuilder
 *
 */
public interface RemoveMacEntryOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge:mac",
        "2015-09-07", "output").intern();

    /**
     * Describes pairs of MAC addresses and operation results.
     *
     *
     *
     * @return <code>java.util.List</code> <code>removeMacEntryResult</code>, or <code>null</code> if not present
     */
    List<RemoveMacEntryResult> getRemoveMacEntryResult();

}

