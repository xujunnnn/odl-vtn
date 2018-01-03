package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo;


/**
 * A list of inter-switch links added to the packet routing table.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * list added-link {
 *     key     leaf link-id {
 *         type link-id;
 *     }
 *     leaf source {
 *         type node-connector-id;
 *     }
 *     leaf destination {
 *         type node-connector-id;
 *     }
 *     uses vtn-link-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-topology/routing-updated/added-link</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.AddedLinkBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.AddedLinkBuilder
 *
 *
 */
public interface AddedLink
    extends
    ChildOf<RoutingUpdated>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.AddedLink>,
    VtnLinkInfo
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:topology",
        "2015-02-09", "added-link").intern();


}

