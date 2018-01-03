package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * container output {
 *     list remove-vlan-map-result {
 *         key     leaf map-id {
 *             type string;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *         uses vtn-rpc-result;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/remove-vlan-map/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.RemoveVlanMapOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.RemoveVlanMapOutputBuilder
 *
 */
public interface RemoveVlanMapOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.RemoveVlanMapOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "output").intern();

    /**
     * Describes pairs of VLAN mapping IDs and operation results.
     *
     *
     *
     * @return <code>java.util.List</code> <code>removeVlanMapResult</code>, or <code>null</code> if not present
     */
    List<RemoveVlanMapResult> getRemoveVlanMapResult();

}

