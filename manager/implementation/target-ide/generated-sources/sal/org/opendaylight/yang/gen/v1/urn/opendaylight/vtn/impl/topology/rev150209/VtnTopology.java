package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology.VtnLink;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of all inter-switch links recognized by the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * container vtn-topology {
 *     list vtn-link {
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
 *         leaf static-link {
 *             type boolean;
 *         }
 *         uses vtn-link-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-topology/vtn-topology</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnTopologyBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnTopologyBuilder
 *
 */
public interface VtnTopology
    extends
    ChildOf<VtnTopologyData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnTopology>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:topology",
        "2015-02-09", "vtn-topology").intern();

    /**
     * A list of inter-switch links recognized by the VTN Manager.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnLink</code>, or <code>null</code> if not present
     */
    List<VtnLink> getVtnLink();

}

