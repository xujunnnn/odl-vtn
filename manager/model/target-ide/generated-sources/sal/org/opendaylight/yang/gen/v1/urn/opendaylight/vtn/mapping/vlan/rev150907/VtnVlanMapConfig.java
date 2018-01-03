package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;


/**
 * Describes configuration for a VLAN mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * grouping vtn-vlan-map-config {
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/vtn-vlan-map-config</i>
 *
 */
public interface VtnVlanMapConfig
    extends
    DataObject,
    VtnVlanIdField
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "vtn-vlan-map-config").intern();

    /**
     * Identifier for a physical switch to be mapped. If this field is specified, only 
     * the VLAN specified by `vlan-id' on the specified physical switch is mapped to 
     * vBridge. If this field is omitted, the VLAN specified by `vlan-id' on all the 
     * switches managed by the OpenDaylight controller are mapped to vBridge.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId</code> <code>node</code>, or <code>null</code> if not present
     */
    NodeId getNode();

}

