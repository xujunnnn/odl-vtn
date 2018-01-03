package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;


/**
 * Describes a field which specifies the VLAN ID.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vtn-vlan-id-field {
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vtn-vlan-id-field</i>
 *
 */
public interface VtnVlanIdField
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vtn-vlan-id-field").intern();

    /**
     * Specifies the VLAN ID. Zero implies untagged Ethernet frame. If omitted, it will
     * be treated as zero is specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    VlanId getVlanId();

}

