package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanPcp;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.EtherType;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;


/**
 * Describes the ethernet header and IEEE 802.1Q VLAN tag fields to match against 
 * packets.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * grouping vtn-ether-match-fields {
 *     leaf source-address {
 *         type mac-address;
 *     }
 *     leaf destination-address {
 *         type mac-address;
 *     }
 *     leaf ether-type {
 *         type ether-type;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     leaf vlan-pcp {
 *         type vlan-pcp;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-ether-match-fields</i>
 *
 */
public interface VtnEtherMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-ether-match-fields").intern();

    /**
     * The source MAC address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>sourceAddress</code>, or <code>null</code> if not present
     */
    MacAddress getSourceAddress();
    
    /**
     * The destination MAC address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>destinationAddress</code>, or <code>null</code> if not present
     */
    MacAddress getDestinationAddress();
    
    /**
     * The ethernet type.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.EtherType</code> <code>etherType</code>, or <code>null</code> if not present
     */
    EtherType getEtherType();
    
    /**
     * The VLAN ID in VLAN tag. Zero means untagged ethernet frame.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    VlanId getVlanId();
    
    /**
     * The VLAN priority in VLAN tag.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanPcp</code> <code>vlanPcp</code>, or <code>null</code> if not present
     */
    VlanPcp getVlanPcp();

}

