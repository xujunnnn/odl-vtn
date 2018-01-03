package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.virtual.route.info.VirtualNodePath;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * This model is used to represent the virtual packet routing within the VTN. The 
 * route of the packet from the source to the destination virtual node is 
 * represented by a sequence of `virtual-route-info' instances. Note that this 
 * model may be empty if it indicates that the data flow is terminated without 
 * packet forwarding.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * grouping virtual-route-info {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/virtual-route-info</i>
 *
 */
public interface VirtualRouteInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "virtual-route-info").intern();

    /**
     * Describes the location of the virtual node inside the VTN. Note that this 
     * container is omitted if this model indicates that the data flow is terminated 
     * without packet forwarding.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.virtual.route.info.VirtualNodePath</code> <code>virtualNodePath</code>, or <code>null</code> if not present
     */
    VirtualNodePath getVirtualNodePath();
    
    /**
     * Describes the reason why the packet is forwarded to the virtual node. Note that 
     * this field is omitted if this model indicates that the data flow is terminated 
     * without packet forwarding.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteReason</code> <code>reason</code>, or <code>null</code> if not present
     */
    VirtualRouteReason getReason();

}

