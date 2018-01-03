package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes runtime status information about VLAN mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * grouping vtn-vlan-map-status {
 *     leaf active {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/vtn-vlan-map-status</i>
 *
 */
public interface VtnVlanMapStatus
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "vtn-vlan-map-status").intern();

    /**
     * Determine whether the VLAN mapping is active or not. True is set if VLAN 
     * specified by the VLAN mapping configuration is detected.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>active</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isActive();

}

