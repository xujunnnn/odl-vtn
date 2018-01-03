package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;


/**
 * Describes a common information about a data flow established by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * grouping vtn-data-flow-common {
 *     leaf flow-id {
 *         type vtn-flow-id;
 *     }
 *     leaf creation-time {
 *         type int64;
 *     }
 *     list virtual-route {
 *         key     leaf order {
 *             type int32;
 *         }
 *         container virtual-node-path {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             leaf bridge-name {
 *                 type string;
 *             }
 *             leaf router-name {
 *                 type string;
 *             }
 *             leaf terminal-name {
 *                 type string;
 *             }
 *             leaf interface-name {
 *                 type string;
 *             }
 *             uses vnode-path-fields;
 *         }
 *         leaf reason {
 *             type virtual-route-reason;
 *         }
 *         uses virtual-route-info;
 *         uses ordered;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-common</i>
 *
 */
public interface VtnDataFlowCommon
    extends
    DataObject,
    VtnFlowIdentifiable
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "vtn-data-flow-common").intern();

    /**
     * The creation time of the VTN data flow. This field keeps the number of 
     * milliseconds between the creation time and 1970-01-01T00:00:00+0000.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>creationTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCreationTime();
    
    /**
     * A sequence of `virtual-route-info' which represents the packet route in the 
     * virtual network. This list is omitted if the virtual packet route is not 
     * configured. Note that elements in this list needs to be sorted by `order' field 
     * in ascending order.
     *
     *
     *
     * @return <code>java.util.List</code> <code>virtualRoute</code>, or <code>null</code> if not present
     */
    List<VirtualRoute> getVirtualRoute();

}

