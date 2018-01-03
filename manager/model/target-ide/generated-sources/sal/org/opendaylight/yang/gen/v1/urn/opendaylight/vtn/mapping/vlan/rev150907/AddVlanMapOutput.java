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
 * <i>vtn-vlan-map/add-vlan-map/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapOutputBuilder
 *
 */
public interface AddVlanMapOutput
    extends
    VtnVlanMapStatus,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "output").intern();

    /**
     * The identifier assigned to newly configured VLAN mapping.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mapId</code>, or <code>null</code> if not present
     */
    java.lang.String getMapId();

}

