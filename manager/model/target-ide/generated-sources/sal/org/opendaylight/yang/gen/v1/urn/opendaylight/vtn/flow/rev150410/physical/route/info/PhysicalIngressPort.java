package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Identifier for the switch port where the packet is received.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container physical-ingress-port {
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 *     uses vtn-switch-port;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/physical-route-info/physical-ingress-port</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalIngressPortBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalIngressPortBuilder
 *
 */
public interface PhysicalIngressPort
    extends
    ChildOf<PhysicalRouteInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalIngressPort>,
    VtnSwitchPort
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "physical-ingress-port").intern();


}

