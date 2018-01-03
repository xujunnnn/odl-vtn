package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.AddedLink;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * A notification which indicates that the packet routing table has been updated.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * notification routing-updated {
 *     description
 *         "A notification which indicates that the packet routing table
 *                    has been updated.";
 *     list added-link {
 *         key     leaf link-id {
 *             type link-id;
 *         }
 *         leaf source {
 *             type node-connector-id;
 *         }
 *         leaf destination {
 *             type node-connector-id;
 *         }
 *         uses vtn-link-info;
 *     }
 *     list removed-link {
 *         key     leaf link-id {
 *             type link-id;
 *         }
 *         leaf source {
 *             type node-connector-id;
 *         }
 *         leaf destination {
 *             type node-connector-id;
 *         }
 *         uses vtn-link-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-topology/routing-updated</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdatedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdatedBuilder
 *
 */
public interface RoutingUpdated
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:topology",
        "2015-02-09", "routing-updated").intern();

    /**
     * A list of inter-switch links added to the packet routing table.
     *
     *
     *
     * @return <code>java.util.List</code> <code>addedLink</code>, or <code>null</code> if not present
     */
    List<AddedLink> getAddedLink();
    
    /**
     * A list of inter-switch links removed from the packet routing table.
     *
     *
     *
     * @return <code>java.util.List</code> <code>removedLink</code>, or <code>null</code> if not present
     */
    List<RemovedLink> getRemovedLink();

}

