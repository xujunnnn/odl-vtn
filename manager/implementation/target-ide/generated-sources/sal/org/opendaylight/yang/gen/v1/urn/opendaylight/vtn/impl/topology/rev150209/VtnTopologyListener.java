package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
 * Interface for receiving the following YANG notifications defined in module <b>vtn-topology</b>
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
 *
 */
public interface VtnTopologyListener
    extends
    NotificationListener
{




    /**
     * A notification which indicates that the packet routing table has been updated.
     *
     */
    void onRoutingUpdated(RoutingUpdated notification);

}

