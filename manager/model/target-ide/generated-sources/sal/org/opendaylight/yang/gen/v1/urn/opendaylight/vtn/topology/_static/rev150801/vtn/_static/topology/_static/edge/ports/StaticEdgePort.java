package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticEdgePorts;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of switch ports to be treated as edge port. If a switch port is 
 * configured in this list, it is always treated as an edge port even if 
 * topology-manager detects inter-switch link on that port. Note that 
 * `static-edge-port' is always evaluated prior to `static-switch-link'. If the 
 * same port is configured in both `static-edge-port' and `static-switch-port', it 
 * is always treated as an edge port and no static link is configured on that port.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-static-topology</b>
 * <pre>
 * list static-edge-port {
 *     key "port"
 *     leaf port {
 *         type node-connector-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-static-topology/vtn-static-topology/static-edge-ports/static-edge-port</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports.StaticEdgePortBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports.StaticEdgePortBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports.StaticEdgePortKey
 *
 */
public interface StaticEdgePort
    extends
    ChildOf<StaticEdgePorts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports.StaticEdgePort>,
    Identifiable<StaticEdgePortKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:topology:static",
        "2015-08-01", "static-edge-port").intern();

    /**
     * The switch port identifier which specifies the switch port to be treated as edge
     * port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>port</code>, or <code>null</code> if not present
     */
    NodeConnectorId getPort();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports.StaticEdgePortKey</code> <code>key</code>, or <code>null</code> if not present
     */
    StaticEdgePortKey getKey();

}

