package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;


/**
 * Describes an inter-switch link.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vtn-switch-link {
 *     leaf source {
 *         type node-connector-id;
 *     }
 *     leaf destination {
 *         type node-connector-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vtn-switch-link</i>
 *
 */
public interface VtnSwitchLink
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vtn-switch-link").intern();

    /**
     * The source switch port of the link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>source</code>, or <code>null</code> if not present
     */
    NodeConnectorId getSource();
    
    /**
     * The destination switch port of the link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId</code> <code>destination</code>, or <code>null</code> if not present
     */
    NodeConnectorId getDestination();

}

