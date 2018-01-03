package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalIngressPort;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalEgressPort;


/**
 * Describes a pair of input and output switch port within the same physical 
 * switch. An instance of `physical-route-info' represents two physical ports in 
 * the same physical switch. The route of the packet in the physlcal network from 
 * the source to the destination physical switch port is represented by a sequence 
 * of `physical-route-info' instances.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * grouping physical-route-info {
 *     leaf node {
 *         type node-id;
 *     }
 *     container physical-ingress-port {
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-switch-port;
 *     }
 *     container physical-egress-port {
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         uses vtn-switch-port;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/physical-route-info</i>
 *
 */
public interface PhysicalRouteInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "physical-route-info").intern();

    /**
     * Identifier for a physical switch.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId</code> <code>node</code>, or <code>null</code> if not present
     */
    NodeId getNode();
    
    /**
     * Identifier for the switch port where the packet is received.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalIngressPort</code> <code>physicalIngressPort</code>, or <code>null</code> if not present
     */
    PhysicalIngressPort getPhysicalIngressPort();
    
    /**
     * Identifier for the switch port to which the packet is sent.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalEgressPort</code> <code>physicalEgressPort</code>, or <code>null</code> if not present
     */
    PhysicalEgressPort getPhysicalEgressPort();

}

