package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnPortInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of inter-switch links.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-inventory</b>
 * <pre>
 * list port-link {
 *     key "link-id"
 *     leaf link-id {
 *         type link-id;
 *     }
 *     leaf peer {
 *         type node-connector-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-inventory/vtn-port-info/port-link</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info.PortLinkBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info.PortLinkBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info.PortLinkKey
 *
 */
public interface PortLink
    extends
    ChildOf<VtnPortInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info.PortLink>,
    Identifiable<PortLinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:inventory",
        "2015-02-09", "port-link").intern();

    /**
     * The identifier of the inter-switch link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId</code> <code>linkId</code>, or <code>null</code> if not present
     */
    LinkId getLinkId();
    
    /**
     * The identifier of the peer switch port of the link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>peer</code>, or <code>null</code> if not present
     */
    NodeConnectorId getPeer();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info.PortLinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PortLinkKey getKey();

}

