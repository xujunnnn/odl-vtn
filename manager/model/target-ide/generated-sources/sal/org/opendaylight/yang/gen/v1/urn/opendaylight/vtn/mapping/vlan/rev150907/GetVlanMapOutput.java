package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * container output {
 *     leaf map-id {
 *         type string;
 *     }
 *     leaf active {
 *         type boolean;
 *     }
 *     uses vtn-vlan-map-status;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/get-vlan-map/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutputBuilder
 *
 */
public interface GetVlanMapOutput
    extends
    VtnVlanMapStatus,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "output").intern();

    /**
     * The identifier assigned to the VLAN mapping whose configuration exactly matches 
     * the configuration specified by the RPC input. Null is set if not found.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mapId</code>, or <code>null</code> if not present
     */
    java.lang.String getMapId();

}

