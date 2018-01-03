package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * A sequence of `physical-route-info' which represents the packet route in the 
 * physical network. This list is omitted if this data flow discards the packet, 
 * if the physical packet route is not configured. Note that elements in this list 
 * needs to be sorted by `order' field in ascending order.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * list physical-route {
 *     key     leaf order {
 *         type int32;
 *     }
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
 *     uses physical-route-info;
 *     uses ordered;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-info/physical-route</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRouteBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRouteBuilder
 *
 *
 */
public interface PhysicalRoute
    extends
    ChildOf<VtnDataFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>,
    PhysicalRouteInfo,
    Ordered
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "physical-route").intern();


}

