package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * A sequence of `virtual-route-info' which represents the packet route in the 
 * virtual network. This list is omitted if the virtual packet route is not 
 * configured. Note that elements in this list needs to be sorted by `order' field 
 * in ascending order.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * list virtual-route {
 *     key     leaf order {
 *         type int32;
 *     }
 *     container virtual-node-path {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *         leaf router-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *         leaf interface-name {
 *             type string;
 *         }
 *         uses vnode-path-fields;
 *     }
 *     leaf reason {
 *         type virtual-route-reason;
 *     }
 *     uses virtual-route-info;
 *     uses ordered;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-common/virtual-route</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRouteBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRouteBuilder
 *
 *
 */
public interface VirtualRoute
    extends
    ChildOf<VtnDataFlowCommon>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>,
    VirtualRouteInfo,
    Ordered
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "virtual-route").intern();


}

