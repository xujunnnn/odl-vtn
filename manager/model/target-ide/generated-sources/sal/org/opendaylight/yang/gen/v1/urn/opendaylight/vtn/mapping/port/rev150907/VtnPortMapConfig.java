package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation;


/**
 * Describes configuration for a port mapping. Actual physical port of switch that 
 * gets mapped to a virtual interface is decided as follows: - If `port-name' 
 * is configured, then out of physical ports in the switch specified by `node' 
 * field, the physical port that has the specified port name will get mapped. - If 
 * `port-id' field is configured, the out of the physical ports in the switch 
 * specified by `node' field, the physical port corresponding to the specified 
 * ID will get mapped. - If both `port-name' and `port-id' are configured, the out 
 * of the physical ports in the switch specified by `node' field, the physical 
 * that has the specified port name and port ID will get mapped.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-port-map</b>
 * <pre>
 * grouping vtn-port-map-config {
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-port-map/vtn-port-map-config</i>
 *
 */
public interface VtnPortMapConfig
    extends
    DataObject,
    VtnPortLocation,
    VtnVlanIdField
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:port",
        "2015-09-07", "vtn-port-map-config").intern();


}

