package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnTopology;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of inter-switch links recognized by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * list vtn-link {
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
 *     leaf static-link {
 *         type boolean;
 *     }
 *     uses vtn-link-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-topology/vtn-topology/vtn-link</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology.VtnLinkBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology.VtnLinkBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology.VtnLinkKey
 *
 */
public interface VtnLink
    extends
    ChildOf<VtnTopology>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology.VtnLink>,
    VtnLinkInfo,
    Identifiable<VtnLinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:topology",
        "2015-02-09", "vtn-link").intern();

    /**
     * True is set if this link is configured by static network topology configuration.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>staticLink</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isStaticLink();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology.VtnLinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VtnLinkKey getKey();

}

