package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Identifier for the switch port to which the packet is sent.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container physical-egress-port {
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
 * <i>vtn-flow/physical-route-info/physical-egress-port</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalEgressPortBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalEgressPortBuilder
 *
 */
public interface PhysicalEgressPort
    extends
    ChildOf<PhysicalRouteInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalEgressPort>,
    VtnSwitchPort
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "physical-egress-port").intern();


}

