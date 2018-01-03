package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;


/**
 * Describes the location of the physical switch port.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vtn-port-location {
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vtn-port-location</i>
 *
 */
public interface VtnPortLocation
    extends
    DataObject,
    VtnSwitchPort
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vtn-port-location").intern();

    /**
     * Identifier for a physical switch.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId</code> <code>node</code>, or <code>null</code> if not present
     */
    NodeId getNode();

}

