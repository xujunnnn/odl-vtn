package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortDesc;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the cost of using specific switch link for packet transmission.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * grouping vtn-path-cost-config {
 *     leaf port-desc {
 *         type vtn-port-desc;
 *     }
 *     leaf cost {
 *         type cost;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/vtn-path-cost-config</i>
 *
 */
public interface VtnPathCostConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "vtn-path-cost-config").intern();

    /**
     * Describes the location of the physical switch port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortDesc</code> <code>portDesc</code>, or <code>null</code> if not present
     */
    VtnPortDesc getPortDesc();
    
    /**
     * The cost of using physical switch port. The specified cost is used when a packet
     * is transmitted from the specified switch port. If omitted, it will be treated as
     * if 1 is specified.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cost</code>, or <code>null</code> if not present
     */
    java.lang.Long getCost();

}

