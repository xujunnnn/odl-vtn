package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the ICMP header fields to match against packets.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * grouping vtn-icmp-match-fields {
 *     leaf icmp-type {
 *         type uint8;
 *     }
 *     leaf icmp-code {
 *         type uint8;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-icmp-match-fields</i>
 *
 */
public interface VtnIcmpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-icmp-match-fields").intern();

    /**
     * The ICMP type.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>icmpType</code>, or <code>null</code> if not present
     */
    java.lang.Short getIcmpType();
    
    /**
     * The ICMP code.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>icmpCode</code>, or <code>null</code> if not present
     */
    java.lang.Short getIcmpCode();

}

