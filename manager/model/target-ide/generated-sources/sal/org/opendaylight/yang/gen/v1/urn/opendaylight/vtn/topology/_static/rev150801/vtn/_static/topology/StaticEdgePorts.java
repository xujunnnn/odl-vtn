package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports.StaticEdgePort;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.VtnStaticTopology;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of static edge port configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-static-topology</b>
 * <pre>
 * container static-edge-ports {
 *     list static-edge-port {
 *         key "port"
 *         leaf port {
 *             type node-connector-id;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-static-topology/vtn-static-topology/static-edge-ports</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticEdgePortsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticEdgePortsBuilder
 *
 */
public interface StaticEdgePorts
    extends
    ChildOf<VtnStaticTopology>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticEdgePorts>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:topology:static",
        "2015-08-01", "static-edge-ports").intern();

    /**
     * A list of switch ports to be treated as edge port. If a switch port is 
     * configured in this list, it is always treated as an edge port even if 
     * topology-manager detects inter-switch link on that port. Note that 
     * `static-edge-port' is always evaluated prior to `static-switch-link'. If the 
     * same port is configured in both `static-edge-port' and `static-switch-port', it 
     * is always treated as an edge port and no static link is configured on that port.
     *
     *
     *
     * @return <code>java.util.List</code> <code>staticEdgePort</code>, or <code>null</code> if not present
     */
    List<StaticEdgePort> getStaticEdgePort();

}

