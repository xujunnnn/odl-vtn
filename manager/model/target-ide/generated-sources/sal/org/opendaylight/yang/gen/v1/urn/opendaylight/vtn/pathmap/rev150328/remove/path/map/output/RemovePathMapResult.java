package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.RemovePathMapOutput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes pairs of path map indices passed to the RPC input and results.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * list remove-path-map-result {
 *     key     leaf index {
 *         type int32;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-path-map-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-map/remove-path-map/output/remove-path-map-result</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResultBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResultBuilder
 *
 *
 */
public interface RemovePathMapResult
    extends
    ChildOf<RemovePathMapOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>,
    VtnPathMapResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "remove-path-map-result").intern();


}

