package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the data model which can contain port mapping configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-port-map</b>
 * <pre>
 * grouping vtn-port-mappable {
 *     container port-map-config {
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-port-map-config;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-port-map/vtn-port-mappable</i>
 *
 */
public interface VtnPortMappable
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:port",
        "2015-09-07", "vtn-port-mappable").intern();

    /**
     * The container which contains port mapping configuration, which maps a physical 
     * switch port to a virtual interface in a virtual node.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig</code> <code>portMapConfig</code>, or <code>null</code> if not present
     */
    PortMapConfig getPortMapConfig();

}

