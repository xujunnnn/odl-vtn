package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.ignored.links.IgnoredLink;


/**
 * The root container of inter-switch links ignored by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * container ignored-links {
 *     list ignored-link {
 *         key "link-id"
 *         leaf link-id {
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
 * <i>vtn-topology/ignored-links</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.IgnoredLinksBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.IgnoredLinksBuilder
 *
 */
public interface IgnoredLinks
    extends
    ChildOf<VtnTopologyData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.IgnoredLinks>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:topology",
        "2015-02-09", "ignored-links").intern();

    /**
     * A list of inter-switch links ignored by the VTN Manager.
     *
     *
     *
     * @return <code>java.util.List</code> <code>ignoredLink</code>, or <code>null</code> if not present
     */
    List<IgnoredLink> getIgnoredLink();

}

