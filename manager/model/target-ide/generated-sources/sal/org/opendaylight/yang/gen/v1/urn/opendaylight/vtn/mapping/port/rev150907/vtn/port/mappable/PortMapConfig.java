package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.VtnPortMapConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.VtnPortMappable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The container which contains port mapping configuration, which maps a physical 
 * switch port to a virtual interface in a virtual node.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-port-map</b>
 * <pre>
 * container port-map-config {
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 *     uses vtn-port-map-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-port-map/vtn-port-mappable/port-map-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfigBuilder
 *
 */
public interface PortMapConfig
    extends
    ChildOf<VtnPortMappable>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>,
    VtnPortMapConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:port",
        "2015-09-07", "port-map-config").intern();


}

