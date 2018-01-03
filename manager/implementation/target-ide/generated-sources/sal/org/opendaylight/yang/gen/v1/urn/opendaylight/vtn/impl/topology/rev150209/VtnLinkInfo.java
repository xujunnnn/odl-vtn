package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId;


/**
 * Information about inter-switch link.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * grouping vtn-link-info {
 *     leaf link-id {
 *         type link-id;
 *     }
 *     leaf source {
 *         type node-connector-id;
 *     }
 *     leaf destination {
 *         type node-connector-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-topology/vtn-link-info</i>
 *
 */
public interface VtnLinkInfo
    extends
    DataObject,
    VtnSwitchLink
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:topology",
        "2015-02-09", "vtn-link-info").intern();

    /**
     * The identifier of the inter-switch link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId</code> <code>linkId</code>, or <code>null</code> if not present
     */
    LinkId getLinkId();

}

