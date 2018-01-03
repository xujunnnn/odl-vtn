package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * container output {
 *     list remove-path-map-result {
 *         key     leaf index {
 *             type int32;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *         uses vtn-path-map-result;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/remove-path-map/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.RemovePathMapOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.RemovePathMapOutputBuilder
 *
 */
public interface RemovePathMapOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.RemovePathMapOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "output").intern();

    /**
     * Describes pairs of path map indices passed to the RPC input and results.
     *
     *
     *
     * @return <code>java.util.List</code> <code>removePathMapResult</code>, or <code>null</code> if not present
     */
    List<RemovePathMapResult> getRemovePathMapResult();

}

