package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticSwitchLinks;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticEdgePorts;


/**
 * The root container that keeps configuration for static network topology.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-static-topology</b>
 * <pre>
 * container vtn-static-topology {
 *     container static-switch-links {
 *         list static-switch-link {
 *             key "source"
 *             leaf source {
 *                 type node-connector-id;
 *             }
 *             leaf destination {
 *                 type node-connector-id;
 *             }
 *             uses vtn-switch-link;
 *         }
 *     }
 *     container static-edge-ports {
 *         list static-edge-port {
 *             key "port"
 *             leaf port {
 *                 type node-connector-id;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-static-topology/vtn-static-topology</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.VtnStaticTopologyBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.VtnStaticTopologyBuilder
 *
 */
public interface VtnStaticTopology
    extends
    ChildOf<VtnStaticTopologyData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.VtnStaticTopology>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:topology:static",
        "2015-08-01", "vtn-static-topology").intern();

    /**
     * The root container of static inter-switch link configuration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticSwitchLinks</code> <code>staticSwitchLinks</code>, or <code>null</code> if not present
     */
    StaticSwitchLinks getStaticSwitchLinks();
    
    /**
     * The root container of static edge port configuration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticEdgePorts</code> <code>staticEdgePorts</code>, or <code>null</code> if not present
     */
    StaticEdgePorts getStaticEdgePorts();

}

