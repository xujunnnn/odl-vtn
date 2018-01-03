package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.RemoveVlanMapOutput;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes pairs of VLAN mapping IDs and operation results.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * list remove-vlan-map-result {
 *     key     leaf map-id {
 *         type string;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 *     uses vtn-rpc-result;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/remove-vlan-map/output/remove-vlan-map-result</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResultBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResultBuilder
 *
 *
 */
public interface RemoveVlanMapResult
    extends
    ChildOf<RemoveVlanMapOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>,
    VtnRpcResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "remove-vlan-map-result").intern();

    /**
     * One of VLAN mapping ID specified by the RPC input.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mapId</code>, or <code>null</code> if not present
     */
    java.lang.String getMapId();

}

