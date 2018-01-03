package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology.StaticSwitchLinks;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of inter-switch links to be configured statically. A static link 
 * configured in the list will supersede a link with the same source port detected 
 * by topology-manager. Note that `static-edge-port' is always evaluated prior to 
 * `static-switch-link'. If source or destination port of the static link is 
 * configured in `static-edge-port', that static link is ignored.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-static-topology</b>
 * <pre>
 * list static-switch-link {
 *     key "source"
 *     leaf source {
 *         type node-connector-id;
 *     }
 *     leaf destination {
 *         type node-connector-id;
 *     }
 *     uses vtn-switch-link;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-static-topology/vtn-static-topology/static-switch-links/static-switch-link</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links.StaticSwitchLinkBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links.StaticSwitchLinkBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links.StaticSwitchLinkKey
 *
 */
public interface StaticSwitchLink
    extends
    ChildOf<StaticSwitchLinks>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links.StaticSwitchLink>,
    VtnSwitchLink,
    Identifiable<StaticSwitchLinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:topology:static",
        "2015-08-01", "static-switch-link").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links.StaticSwitchLinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    StaticSwitchLinkKey getKey();

}

