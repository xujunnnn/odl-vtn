package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.ignored.links;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.IgnoredLinks;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of inter-switch links ignored by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * list ignored-link {
 *     key "link-id"
 *     leaf link-id {
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
 * <i>vtn-topology/ignored-links/ignored-link</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.ignored.links.IgnoredLinkBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.ignored.links.IgnoredLinkBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.ignored.links.IgnoredLinkKey
 *
 */
public interface IgnoredLink
    extends
    ChildOf<IgnoredLinks>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.ignored.links.IgnoredLink>,
    VtnLinkInfo,
    Identifiable<IgnoredLinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:topology",
        "2015-02-09", "ignored-link").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.ignored.links.IgnoredLinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    IgnoredLinkKey getKey();

}

